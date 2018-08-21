package net.qzlife.call.pojo;

import javax.persistence.*;

@Table(name = "i_sys_bind")
public class ISysBind {
    @Id
    @Column(name = "c_pk")
    private String cPk;

    /**
     * crm应用系统唯一标识
     */
    @Column(name = "c_crm_id")
    private String cCrmId;

    /**
     * 米糠云接口appkey
     */
    @Column(name = "c_app_key")
    private String cAppKey;

    /**
     * 米糠云接口appsecret
     */
    @Column(name = "c_app_secret")
    private String cAppSecret;

    /**
     * @return c_pk
     */
    public String getcPk() {
        return cPk;
    }

    /**
     * @param cPk
     */
    public void setcPk(String cPk) {
        this.cPk = cPk;
    }

    /**
     * 获取crm应用系统唯一标识
     *
     * @return c_crm_id - crm应用系统唯一标识
     */
    public String getcCrmId() {
        return cCrmId;
    }

    /**
     * 设置crm应用系统唯一标识
     *
     * @param cCrmId crm应用系统唯一标识
     */
    public void setcCrmId(String cCrmId) {
        this.cCrmId = cCrmId;
    }

    /**
     * 获取米糠云接口appkey
     *
     * @return c_app_key - 米糠云接口appkey
     */
    public String getcAppKey() {
        return cAppKey;
    }

    /**
     * 设置米糠云接口appkey
     *
     * @param cAppKey 米糠云接口appkey
     */
    public void setcAppKey(String cAppKey) {
        this.cAppKey = cAppKey;
    }

    /**
     * 获取米糠云接口appsecret
     *
     * @return c_app_secret - 米糠云接口appsecret
     */
    public String getcAppSecret() {
        return cAppSecret;
    }

    /**
     * 设置米糠云接口appsecret
     *
     * @param cAppSecret 米糠云接口appsecret
     */
    public void setcAppSecret(String cAppSecret) {
        this.cAppSecret = cAppSecret;
    }
}