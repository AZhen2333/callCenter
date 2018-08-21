package net.qzlife.call.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "i_out_task")
public class IOutTask {
    @Id
    private String pk;

    /**
     * 外呼任务名称
     */
    private String name;

    /**
     * 开始时间:如2017-08-07的时间戳
     */
    private Date starttime;

    /**
     * 结束时间:如2017-08-07的时间戳
     */
    @Column(name = "endTime")
    private Date endtime;

    /**
     * 任务描述
     */
    private String desc;

    /**
     * 状态:0:开启 1:暂停 -1:关闭 2删除
     */
    private Integer status;

    /**
     * 客户数量
     */
    @Column(name = "client_num")
    private Integer clientNum;

    /**
     * 应用标识
     */
    @Column(name = "app_id")
    private String appId;

    /**
     * scrm应用标识
     */
    @Column(name = "scrm_id")
    private String scrmId;

    /**
     * 自增字段（用于呼叫接口附属参数，因为附属参数长度为14字符，所以先采用自增唯一值来实现功能）
     */
    @Column(name = "c_auto_increment")
    private Integer cAutoIncrement;

    /**
     * @return pk
     */
    public String getPk() {
        return pk;
    }

    /**
     * @param pk
     */
    public void setPk(String pk) {
        this.pk = pk;
    }

    /**
     * 获取外呼任务名称
     *
     * @return name - 外呼任务名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置外呼任务名称
     *
     * @param name 外呼任务名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取开始时间:如2017-08-07的时间戳
     *
     * @return starttime - 开始时间:如2017-08-07的时间戳
     */
    public Date getStarttime() {
        return starttime;
    }

    /**
     * 设置开始时间:如2017-08-07的时间戳
     *
     * @param starttime 开始时间:如2017-08-07的时间戳
     */
    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    /**
     * 获取结束时间:如2017-08-07的时间戳
     *
     * @return endTime - 结束时间:如2017-08-07的时间戳
     */
    public Date getEndtime() {
        return endtime;
    }

    /**
     * 设置结束时间:如2017-08-07的时间戳
     *
     * @param endtime 结束时间:如2017-08-07的时间戳
     */
    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    /**
     * 获取任务描述
     *
     * @return desc - 任务描述
     */
    public String getDesc() {
        return desc;
    }

    /**
     * 设置任务描述
     *
     * @param desc 任务描述
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * 获取状态:0:开启 1:暂停 -1:关闭 2删除
     *
     * @return status - 状态:0:开启 1:暂停 -1:关闭 2删除
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态:0:开启 1:暂停 -1:关闭 2删除
     *
     * @param status 状态:0:开启 1:暂停 -1:关闭 2删除
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取客户数量
     *
     * @return client_num - 客户数量
     */
    public Integer getClientNum() {
        return clientNum;
    }

    /**
     * 设置客户数量
     *
     * @param clientNum 客户数量
     */
    public void setClientNum(Integer clientNum) {
        this.clientNum = clientNum;
    }

    /**
     * 获取应用标识
     *
     * @return app_id - 应用标识
     */
    public String getAppId() {
        return appId;
    }

    /**
     * 设置应用标识
     *
     * @param appId 应用标识
     */
    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * 获取scrm应用标识
     *
     * @return scrm_id - scrm应用标识
     */
    public String getScrmId() {
        return scrmId;
    }

    /**
     * 设置scrm应用标识
     *
     * @param scrmId scrm应用标识
     */
    public void setScrmId(String scrmId) {
        this.scrmId = scrmId;
    }

    /**
     * 获取自增字段（用于呼叫接口附属参数，因为附属参数长度为14字符，所以先采用自增唯一值来实现功能）
     *
     * @return c_auto_increment - 自增字段（用于呼叫接口附属参数，因为附属参数长度为14字符，所以先采用自增唯一值来实现功能）
     */
    public Integer getcAutoIncrement() {
        return cAutoIncrement;
    }

    /**
     * 设置自增字段（用于呼叫接口附属参数，因为附属参数长度为14字符，所以先采用自增唯一值来实现功能）
     *
     * @param cAutoIncrement 自增字段（用于呼叫接口附属参数，因为附属参数长度为14字符，所以先采用自增唯一值来实现功能）
     */
    public void setcAutoIncrement(Integer cAutoIncrement) {
        this.cAutoIncrement = cAutoIncrement;
    }
}