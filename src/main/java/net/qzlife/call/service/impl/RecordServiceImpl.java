package net.qzlife.call.service.impl;

import java.util.List;

import org.n3r.idworker.Sid;
import org.springframework.beans.factory.annotation.Autowired;
import org.thymeleaf.util.StringUtils;

import com.github.pagehelper.PageHelper;

import net.qzlife.call.mapper.IRecordMapper;
import net.qzlife.call.pojo.IRecord;
import net.qzlife.call.pojo.dto.JSONResult;
import net.qzlife.call.pojo.dto.PageResult;
import net.qzlife.call.service.RecordService;
import net.qzlife.call.utils.RedisOperator;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;

public class RecordServiceImpl implements RecordService {

	@Autowired
	private IRecordMapper iRecordMapper;

	@Autowired
	private RedisOperator redisOperator;

	@Autowired
	private Sid sid;

	/**
	 * 新增通话记录
	 * 
	 * @param record
	 * @param scrmId
	 * @param serviceId
	 * @return
	 */
	public JSONResult addPhoneRecord(IRecord record, String scrmId, String serviceId) {
		// 生成pk
		String pk = sid.nextShort();
		record.setPk(pk);
		int insert = iRecordMapper.insert(record);
		if (insert > 0) {
			return JSONResult.ok();
		} else {
			return JSONResult.errorMsg("添加通话记录失败");
		}
	}

	/**
	 * 通话记录列表
	 * 
	 * @param startTime
	 * @param endTime
	 * @param callType
	 * @param disposition
	 * @param destination
	 * @param currentPage
	 * @param totalSize
	 * @param scrmId
	 * @param servicePk
	 * @param phone
	 * @return
	 */
	public JSONResult findPhoneRecordByCondition(Long startTime, Long endTime, String callType, Integer disposition,
			String destination, Integer currentPage, Integer totalSize, String scrmId, String servicePk, String phone) {
		String disposition_temp = null;
		disposition = disposition == null ? -1 : disposition;
		switch (disposition) {
		case 1:
			disposition_temp = "ANSWERED";
			break;
		case 0:
			disposition_temp = "NO ANSWER";
			break;
		default:
			break;
		}

		Example example = new Example(IRecord.class);
		Example.Criteria criteria = example.createCriteria();
		if (startTime != null && startTime != 0) {
			criteria.andGreaterThanOrEqualTo("starttime", startTime);
		}

		if (endTime != null && endTime != 0) {
			criteria.andLessThanOrEqualTo("endtime", endTime);
		}

		if (!StringUtils.isEmptyOrWhitespace(disposition_temp)) {
			criteria.andEqualTo("disposition", disposition_temp);
		}

		if (!StringUtils.isEmptyOrWhitespace(phone)) {
			criteria.andLike("destination", "%" + phone + "%");
		}

		int rows = iRecordMapper.selectCountByExample(example);
		PageHelper.startPage(currentPage, totalSize);
		List<IRecord> list = iRecordMapper.selectByExample(example);
		PageResult<IRecord> pageResult = new PageResult.PageBuilder<IRecord>().currentPage(currentPage).totalRows(rows)
				.list(list).build();
		return JSONResult.ok(pageResult);
	}

	public static void main(String[] args) {
		System.out.println(Sid.next());
	}

}
