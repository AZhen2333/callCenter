package net.qzlife.call.pojo;

import javax.persistence.*;

@Table(name = "i_out_service")
public class IOutService {
    /**
     * 外呼任务唯一
     */
    @Column(name = "out_pk")
    private String outPk;

    /**
     * 外呼任务客服名称
     */
    @Column(name = "service_name")
    private String serviceName;

    /**
     * 外呼任务对应客服的唯一标识
     */
    @Column(name = "service_pk")
    private String servicePk;

    /**
     * 呼叫次数
     */
    @Column(name = "service_count")
    private Integer serviceCount;

    /**
     * 客户总数
     */
    @Column(name = "service_total")
    private Integer serviceTotal;

    /**
     * 接通次数
     */
    @Column(name = "call_count")
    private Integer callCount;

    /**
     * 执行次数
     */
    @Column(name = "execu_count")
    private Integer execuCount;

    /**
     * 客服座机号码
     */
    @Column(name = "service_landline")
    private String serviceLandline;

    /**
     * app应用标识
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
    @Column(name = "auto_increment")
    private Integer autoIncrement;

    /**
     * 获取外呼任务唯一
     *
     * @return out_pk - 外呼任务唯一
     */
    public String getOutPk() {
        return outPk;
    }

    /**
     * 设置外呼任务唯一
     *
     * @param outPk 外呼任务唯一
     */
    public void setOutPk(String outPk) {
        this.outPk = outPk;
    }

    /**
     * 获取外呼任务客服名称
     *
     * @return service_name - 外呼任务客服名称
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * 设置外呼任务客服名称
     *
     * @param serviceName 外呼任务客服名称
     */
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * 获取外呼任务对应客服的唯一标识
     *
     * @return service_pk - 外呼任务对应客服的唯一标识
     */
    public String getServicePk() {
        return servicePk;
    }

    /**
     * 设置外呼任务对应客服的唯一标识
     *
     * @param servicePk 外呼任务对应客服的唯一标识
     */
    public void setServicePk(String servicePk) {
        this.servicePk = servicePk;
    }

    /**
     * 获取呼叫次数
     *
     * @return service_count - 呼叫次数
     */
    public Integer getServiceCount() {
        return serviceCount;
    }

    /**
     * 设置呼叫次数
     *
     * @param serviceCount 呼叫次数
     */
    public void setServiceCount(Integer serviceCount) {
        this.serviceCount = serviceCount;
    }

    /**
     * 获取客户总数
     *
     * @return service_total - 客户总数
     */
    public Integer getServiceTotal() {
        return serviceTotal;
    }

    /**
     * 设置客户总数
     *
     * @param serviceTotal 客户总数
     */
    public void setServiceTotal(Integer serviceTotal) {
        this.serviceTotal = serviceTotal;
    }

    /**
     * 获取接通次数
     *
     * @return call_count - 接通次数
     */
    public Integer getCallCount() {
        return callCount;
    }

    /**
     * 设置接通次数
     *
     * @param callCount 接通次数
     */
    public void setCallCount(Integer callCount) {
        this.callCount = callCount;
    }

    /**
     * 获取执行次数
     *
     * @return execu_count - 执行次数
     */
    public Integer getExecuCount() {
        return execuCount;
    }

    /**
     * 设置执行次数
     *
     * @param execuCount 执行次数
     */
    public void setExecuCount(Integer execuCount) {
        this.execuCount = execuCount;
    }

    /**
     * 获取客服座机号码
     *
     * @return service_landline - 客服座机号码
     */
    public String getServiceLandline() {
        return serviceLandline;
    }

    /**
     * 设置客服座机号码
     *
     * @param serviceLandline 客服座机号码
     */
    public void setServiceLandline(String serviceLandline) {
        this.serviceLandline = serviceLandline;
    }

    /**
     * 获取app应用标识
     *
     * @return app_id - app应用标识
     */
    public String getAppId() {
        return appId;
    }

    /**
     * 设置app应用标识
     *
     * @param appId app应用标识
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
     * @return auto_increment - 自增字段（用于呼叫接口附属参数，因为附属参数长度为14字符，所以先采用自增唯一值来实现功能）
     */
    public Integer getAutoIncrement() {
        return autoIncrement;
    }

    /**
     * 设置自增字段（用于呼叫接口附属参数，因为附属参数长度为14字符，所以先采用自增唯一值来实现功能）
     *
     * @param autoIncrement 自增字段（用于呼叫接口附属参数，因为附属参数长度为14字符，所以先采用自增唯一值来实现功能）
     */
    public void setAutoIncrement(Integer autoIncrement) {
        this.autoIncrement = autoIncrement;
    }
}