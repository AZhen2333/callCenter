package net.qzlife.call.pojo;

import javax.persistence.*;

@Table(name = "i_out_relation")
public class IOutRelation {
    /**
     * 主键id
     */
    @Id
    private String id;

    /**
     * 外呼任务唯一
     */
    @Column(name = "out_pk")
    private String outPk;

    /**
     * 客服唯一键
     */
    @Column(name = "service_pk")
    private String servicePk;

    /**
     * 客户唯一
     */
    @Column(name = "customer_pk")
    private String customerPk;

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
     * 获取客户唯一
     *
     * @return customer_pk - 客户唯一
     */
    public String getCustomerPk() {
        return customerPk;
    }

    /**
     * 设置客户唯一
     *
     * @param customerPk 客户唯一
     */
    public void setCustomerPk(String customerPk) {
        this.customerPk = customerPk;
    }
}