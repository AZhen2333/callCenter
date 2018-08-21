package net.qzlife.call.pojo;

import javax.persistence.*;

@Table(name = "i_out_customer")
public class IOutCustomer {
    /**
     * 外呼任务唯一外键
     */
    @Column(name = "out_pk")
    private String outPk;

    /**
     * 外呼任务客户名称
     */
    @Column(name = "customer_name")
    private String customerName;

    /**
     * 外呼任务客户唯一标识
     */
    @Column(name = "customer_pk")
    private String customerPk;

    /**
     * 客户电话
     */
    @Column(name = "customer_phone")
    private String customerPhone;

    /**
     * 服务该客户的客服
     */
    @Column(name = "service_name")
    private String serviceName;

    /**
     * 被呼叫次数
     */
    @Column(name = "customer_count")
    private Integer customerCount;

    /**
     * 呼叫结果:0未接通,1已接通
     */
    @Column(name = "customer_result")
    private Integer customerResult;

    /**
     * 自增字段（用于呼叫接口附属参数，因为附属参数长度为14字符，所以先采用自增唯一值来实现功能）
     */
    @Column(name = "auto_increment")
    private Integer autoIncrement;

    /**
     * 客服唯一键
     */
    @Column(name = "service_pk")
    private String servicePk;

    /**
     * scrm应用标识
     */
    @Column(name = "scrm_id")
    private String scrmId;

    /**
     * app应用标识
     */
    @Column(name = "app_id")
    private String appId;

    /**
     * 获取外呼任务唯一外键
     *
     * @return out_pk - 外呼任务唯一外键
     */
    public String getOutPk() {
        return outPk;
    }

    /**
     * 设置外呼任务唯一外键
     *
     * @param outPk 外呼任务唯一外键
     */
    public void setOutPk(String outPk) {
        this.outPk = outPk;
    }

    /**
     * 获取外呼任务客户名称
     *
     * @return customer_name - 外呼任务客户名称
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * 设置外呼任务客户名称
     *
     * @param customerName 外呼任务客户名称
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * 获取外呼任务客户唯一标识
     *
     * @return customer_pk - 外呼任务客户唯一标识
     */
    public String getCustomerPk() {
        return customerPk;
    }

    /**
     * 设置外呼任务客户唯一标识
     *
     * @param customerPk 外呼任务客户唯一标识
     */
    public void setCustomerPk(String customerPk) {
        this.customerPk = customerPk;
    }

    /**
     * 获取客户电话
     *
     * @return customer_phone - 客户电话
     */
    public String getCustomerPhone() {
        return customerPhone;
    }

    /**
     * 设置客户电话
     *
     * @param customerPhone 客户电话
     */
    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    /**
     * 获取服务该客户的客服
     *
     * @return service_name - 服务该客户的客服
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * 设置服务该客户的客服
     *
     * @param serviceName 服务该客户的客服
     */
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * 获取被呼叫次数
     *
     * @return customer_count - 被呼叫次数
     */
    public Integer getCustomerCount() {
        return customerCount;
    }

    /**
     * 设置被呼叫次数
     *
     * @param customerCount 被呼叫次数
     */
    public void setCustomerCount(Integer customerCount) {
        this.customerCount = customerCount;
    }

    /**
     * 获取呼叫结果:0未接通,1已接通
     *
     * @return customer_result - 呼叫结果:0未接通,1已接通
     */
    public Integer getCustomerResult() {
        return customerResult;
    }

    /**
     * 设置呼叫结果:0未接通,1已接通
     *
     * @param customerResult 呼叫结果:0未接通,1已接通
     */
    public void setCustomerResult(Integer customerResult) {
        this.customerResult = customerResult;
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

    /**
     * 获取客服唯一键
     *
     * @return service_pk - 客服唯一键
     */
    public String getServicePk() {
        return servicePk;
    }

    /**
     * 设置客服唯一键
     *
     * @param servicePk 客服唯一键
     */
    public void setServicePk(String servicePk) {
        this.servicePk = servicePk;
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
}