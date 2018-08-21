package net.qzlife.call.pojo;

import javax.persistence.*;

@Table(name = "c_out_service")
public class COutService {
    /**
     * 外呼任务唯一
     */
    @Column(name = "c_out_pk")
    private String cOutPk;

    /**
     * 外呼任务客服名称
     */
    @Column(name = "c_service_name")
    private String cServiceName;

    /**
     * 外呼任务对应客服的唯一标识
     */
    @Column(name = "c_service_pk")
    private String cServicePk;

    /**
     * 呼叫次数
     */
    @Column(name = "c_service_count")
    private Integer cServiceCount;

    /**
     * 客户总数
     */
    @Column(name = "c_service_total")
    private Integer cServiceTotal;

    /**
     * 接通次数
     */
    @Column(name = "c_call_count")
    private Integer cCallCount;

    /**
     * 执行次数
     */
    @Column(name = "c_execu_count")
    private Integer cExecuCount;

    /**
     * 客服座机号码
     */
    @Column(name = "c_service_landline")
    private String cServiceLandline;

    /**
     * app应用标识
     */
    @Column(name = "c_app_id")
    private String cAppId;

    /**
     * scrm应用标识
     */
    @Column(name = "c_scrm_id")
    private String cScrmId;

    /**
     * 自增字段（用于呼叫接口附属参数，因为附属参数长度为14字符，所以先采用自增唯一值来实现功能）
     */
    @Column(name = "c_auto_increment")
    private Integer cAutoIncrement;

    /**
     * 获取外呼任务唯一
     *
     * @return c_out_pk - 外呼任务唯一
     */
    public String getcOutPk() {
        return cOutPk;
    }

    /**
     * 设置外呼任务唯一
     *
     * @param cOutPk 外呼任务唯一
     */
    public void setcOutPk(String cOutPk) {
        this.cOutPk = cOutPk;
    }

    /**
     * 获取外呼任务客服名称
     *
     * @return c_service_name - 外呼任务客服名称
     */
    public String getcServiceName() {
        return cServiceName;
    }

    /**
     * 设置外呼任务客服名称
     *
     * @param cServiceName 外呼任务客服名称
     */
    public void setcServiceName(String cServiceName) {
        this.cServiceName = cServiceName;
    }

    /**
     * 获取外呼任务对应客服的唯一标识
     *
     * @return c_service_pk - 外呼任务对应客服的唯一标识
     */
    public String getcServicePk() {
        return cServicePk;
    }

    /**
     * 设置外呼任务对应客服的唯一标识
     *
     * @param cServicePk 外呼任务对应客服的唯一标识
     */
    public void setcServicePk(String cServicePk) {
        this.cServicePk = cServicePk;
    }

    /**
     * 获取呼叫次数
     *
     * @return c_service_count - 呼叫次数
     */
    public Integer getcServiceCount() {
        return cServiceCount;
    }

    /**
     * 设置呼叫次数
     *
     * @param cServiceCount 呼叫次数
     */
    public void setcServiceCount(Integer cServiceCount) {
        this.cServiceCount = cServiceCount;
    }

    /**
     * 获取客户总数
     *
     * @return c_service_total - 客户总数
     */
    public Integer getcServiceTotal() {
        return cServiceTotal;
    }

    /**
     * 设置客户总数
     *
     * @param cServiceTotal 客户总数
     */
    public void setcServiceTotal(Integer cServiceTotal) {
        this.cServiceTotal = cServiceTotal;
    }

    /**
     * 获取接通次数
     *
     * @return c_call_count - 接通次数
     */
    public Integer getcCallCount() {
        return cCallCount;
    }

    /**
     * 设置接通次数
     *
     * @param cCallCount 接通次数
     */
    public void setcCallCount(Integer cCallCount) {
        this.cCallCount = cCallCount;
    }

    /**
     * 获取执行次数
     *
     * @return c_execu_count - 执行次数
     */
    public Integer getcExecuCount() {
        return cExecuCount;
    }

    /**
     * 设置执行次数
     *
     * @param cExecuCount 执行次数
     */
    public void setcExecuCount(Integer cExecuCount) {
        this.cExecuCount = cExecuCount;
    }

    /**
     * 获取客服座机号码
     *
     * @return c_service_landline - 客服座机号码
     */
    public String getcServiceLandline() {
        return cServiceLandline;
    }

    /**
     * 设置客服座机号码
     *
     * @param cServiceLandline 客服座机号码
     */
    public void setcServiceLandline(String cServiceLandline) {
        this.cServiceLandline = cServiceLandline;
    }

    /**
     * 获取app应用标识
     *
     * @return c_app_id - app应用标识
     */
    public String getcAppId() {
        return cAppId;
    }

    /**
     * 设置app应用标识
     *
     * @param cAppId app应用标识
     */
    public void setcAppId(String cAppId) {
        this.cAppId = cAppId;
    }

    /**
     * 获取scrm应用标识
     *
     * @return c_scrm_id - scrm应用标识
     */
    public String getcScrmId() {
        return cScrmId;
    }

    /**
     * 设置scrm应用标识
     *
     * @param cScrmId scrm应用标识
     */
    public void setcScrmId(String cScrmId) {
        this.cScrmId = cScrmId;
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