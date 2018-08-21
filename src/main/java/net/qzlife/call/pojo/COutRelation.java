package net.qzlife.call.pojo;

import javax.persistence.*;

@Table(name = "c_out_relation")
public class COutRelation {
    /**
     * 主键id
     */
    @Id
    private String id;

    /**
     * 外呼任务唯一
     */
    @Column(name = "c_out_pk")
    private String cOutPk;

    /**
     * 客服唯一键
     */
    @Column(name = "c_service_pk")
    private String cServicePk;

    /**
     * 客户唯一
     */
    @Column(name = "c_customer_pk")
    private String cCustomerPk;

    /**
     * 获取主键id
     *
     * @return id - 主键id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置主键id
     *
     * @param id 主键id
     */
    public void setId(String id) {
        this.id = id;
    }

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

    /**
     * 获取客户唯一
     *
     * @return c_customer_pk - 客户唯一
     */
    public String getcCustomerPk() {
        return cCustomerPk;
    }

    /**
     * 设置客户唯一
     *
     * @param cCustomerPk 客户唯一
     */
    public void setcCustomerPk(String cCustomerPk) {
        this.cCustomerPk = cCustomerPk;
    }
}