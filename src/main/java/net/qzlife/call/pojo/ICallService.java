package net.qzlife.call.pojo;

import javax.persistence.*;

@Table(name = "i_call_service")
public class ICallService {
    /**
     * 主键id（唯一）
     */
    private String attach;

    /**
     * 客服唯一键
     */
    @Column(name = "service_pk")
    private String servicePk;

    /**
     * 客服唯一键
     */
    @Column(name = "scrm_id")
    private String scrmId;

    /**
     * 应用唯一标识
     */
    @Column(name = "app_id")
    private String appId;

    /**
     * 获取主键id（唯一）
     *
     * @return attach - 主键id（唯一）
     */
    public String getAttach() {
        return attach;
    }

    /**
     * 设置主键id（唯一）
     *
     * @param attach 主键id（唯一）
     */
    public void setAttach(String attach) {
        this.attach = attach;
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
     * 获取客服唯一键
     *
     * @return scrm_id - 客服唯一键
     */
    public String getScrmId() {
        return scrmId;
    }

    /**
     * 设置客服唯一键
     *
     * @param scrmId 客服唯一键
     */
    public void setScrmId(String scrmId) {
        this.scrmId = scrmId;
    }

    /**
     * 获取应用唯一标识
     *
     * @return app_id - 应用唯一标识
     */
    public String getAppId() {
        return appId;
    }

    /**
     * 设置应用唯一标识
     *
     * @param appId 应用唯一标识
     */
    public void setAppId(String appId) {
        this.appId = appId;
    }
}