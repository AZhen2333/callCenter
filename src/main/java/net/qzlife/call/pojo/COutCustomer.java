package net.qzlife.call.pojo;

import javax.persistence.*;

@Table(name = "c_out_customer")
public class COutCustomer {
    /**
     * 外呼任务唯一外键
     */
    @Column(name = "c_out_pk")
    private String cOutPk;

    /**
     * 外呼任务客户名称
     */
    @Column(name = "c_customer_name")
    private String cCustomerName;

    /**
     * 外呼任务客户唯一标识
     */
    @Column(name = "c_customer_pk")
    private String cCustomerPk;

    /**
     * 客户电话
     */
    @Column(name = "c_customer_phone")
    private String cCustomerPhone;

    /**
     * 服务该客户的客服
     */
    @Column(name = "c_service_name")
    private String cServiceName;

    /**
     * 被呼叫次数
     */
    @Column(name = "c_customer_count")
    private Integer cCustomerCount;

    /**
     * 呼叫结果:0未接通,1已接通
     */
    @Column(name = "c_customer_result")
    private Integer cCustomerResult;

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
     * 客服唯一键
     */
    @Column(name = "c_service_pk")
    private String cServicePk;

    /**
     * 获取外呼任务唯一外键
     *
     * @return c_out_pk - 外呼任务唯一外键
     */
    public String getcOutPk() {
        return cOutPk;
    }

    /**
     * 设置外呼任务唯一外键
     *
     * @param cOutPk 外呼任务唯一外键
     */
    public void setcOutPk(String cOutPk) {
        this.cOutPk = cOutPk;
    }

    /**
     * 获取外呼任务客户名称
     *
     * @return c_customer_name - 外呼任务客户名称
     */
    public String getcCustomerName() {
        return cCustomerName;
    }

    /**
     * 设置外呼任务客户名称
     *
     * @param cCustomerName 外呼任务客户名称
     */
    public void setcCustomerName(String cCustomerName) {
        this.cCustomerName = cCustomerName;
    }

    /**
     * 获取外呼任务客户唯一标识
     *
     * @return c_customer_pk - 外呼任务客户唯一标识
     */
    public String getcCustomerPk() {
        return cCustomerPk;
    }

    /**
     * 设置外呼任务客户唯一标识
     *
     * @param cCustomerPk 外呼任务客户唯一标识
     */
    public void setcCustomerPk(String cCustomerPk) {
        this.cCustomerPk = cCustomerPk;
    }

    /**
     * 获取客户电话
     *
     * @return c_customer_phone - 客户电话
     */
    public String getcCustomerPhone() {
        return cCustomerPhone;
    }

    /**
     * 设置客户电话
     *
     * @param cCustomerPhone 客户电话
     */
    public void setcCustomerPhone(String cCustomerPhone) {
        this.cCustomerPhone = cCustomerPhone;
    }

    /**
     * 获取服务该客户的客服
     *
     * @return c_service_name - 服务该客户的客服
     */
    public String getcServiceName() {
        return cServiceName;
    }

    /**
     * 设置服务该客户的客服
     *
     * @param cServiceName 服务该客户的客服
     */
    public void setcServiceName(String cServiceName) {
        this.cServiceName = cServiceName;
    }

    /**
     * 获取被呼叫次数
     *
     * @return c_customer_count - 被呼叫次数
     */
    public Integer getcCustomerCount() {
        return cCustomerCount;
    }

    /**
     * 设置被呼叫次数
     *
     * @param cCustomerCount 被呼叫次数
     */
    public void setcCustomerCount(Integer cCustomerCount) {
        this.cCustomerCount = cCustomerCount;
    }

    /**
     * 获取呼叫结果:0未接通,1已接通
     *
     * @return c_customer_result - 呼叫结果:0未接通,1已接通
     */
    public Integer getcCustomerResult() {
        return cCustomerResult;
    }

    /**
     * 设置呼叫结果:0未接通,1已接通
     *
     * @param cCustomerResult 呼叫结果:0未接通,1已接通
     */
    public void setcCustomerResult(Integer cCustomerResult) {
        this.cCustomerResult = cCustomerResult;
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

    /**
     * 获取客服唯一键
     *
     * @return c_service_pk - 客服唯一键
     */
    public String getcServicePk() {
        return cServicePk;
    }

    /**
     * 设置客服唯一键
     *
     * @param cServicePk 客服唯一键
     */
    public void setcServicePk(String cServicePk) {
        this.cServicePk = cServicePk;
    }
}