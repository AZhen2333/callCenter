package net.qzlife.call.pojo;

import javax.persistence.*;

@Table(name = "c_call_service")
public class CCallService {
    /**
     * 主键id（唯一）
     */
    private String attach;

    /**
     * 客服唯一键
     */
    @Column(name = "c_scrm_id")
    private String cScrmId;

    /**
     * 客服唯一键
     */
    @Column(name = "c_service_pk")
    private String cServicePk;

    /**
     * 应用唯一标识
     */
    @Column(name = "c_app_id")
    private String cAppId;

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
     * @return c_scrm_id - 客服唯一键
     */
    public String getcScrmId() {
        return cScrmId;
    }

    /**
     * 设置客服唯一键
     *
     * @param cScrmId 客服唯一键
     */
    public void setcScrmId(String cScrmId) {
        this.cScrmId = cScrmId;
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
     * 获取应用唯一标识
     *
     * @return c_app_id - 应用唯一标识
     */
    public String getcAppId() {
        return cAppId;
    }

    /**
     * 设置应用唯一标识
     *
     * @param cAppId 应用唯一标识
     */
    public void setcAppId(String cAppId) {
        this.cAppId = cAppId;
    }
}