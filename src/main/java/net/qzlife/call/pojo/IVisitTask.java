package net.qzlife.call.pojo;

import javax.persistence.*;

@Table(name = "i_visit_task")
public class IVisitTask {
    /**
     * 回访任务主键
     */
    @Id
    @Column(name = "c_visit_pk")
    private String cVisitPk;

    /**
     * 回访任务名称，默认为客户手机号
     */
    @Column(name = "c_visit_name")
    private String cVisitName;

    /**
     * 回访电话
     */
    @Column(name = "c_visit_phone")
    private String cVisitPhone;

    /**
     * 回访任务描述
     */
    @Column(name = "c_visit_desc")
    private String cVisitDesc;

    /**
     * 回访任务结果0:未执行 1已执行
     */
    @Column(name = "c_visit_status")
    private Integer cVisitStatus;

    /**
     * 是否被删除 0起效 1失效
     */
    @Column(name = "c_visit_del")
    private String cVisitDel;

    /**
     * 回访任务时间
     */
    @Column(name = "c_visit_dateline")
    private Integer cVisitDateline;

    /**
     * 客服的唯一标识
     */
    @Column(name = "c_service_pk")
    private String cServicePk;

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
     * 获取回访任务主键
     *
     * @return c_visit_pk - 回访任务主键
     */
    public String getcVisitPk() {
        return cVisitPk;
    }

    /**
     * 设置回访任务主键
     *
     * @param cVisitPk 回访任务主键
     */
    public void setcVisitPk(String cVisitPk) {
        this.cVisitPk = cVisitPk;
    }

    /**
     * 获取回访任务名称，默认为客户手机号
     *
     * @return c_visit_name - 回访任务名称，默认为客户手机号
     */
    public String getcVisitName() {
        return cVisitName;
    }

    /**
     * 设置回访任务名称，默认为客户手机号
     *
     * @param cVisitName 回访任务名称，默认为客户手机号
     */
    public void setcVisitName(String cVisitName) {
        this.cVisitName = cVisitName;
    }

    /**
     * 获取回访电话
     *
     * @return c_visit_phone - 回访电话
     */
    public String getcVisitPhone() {
        return cVisitPhone;
    }

    /**
     * 设置回访电话
     *
     * @param cVisitPhone 回访电话
     */
    public void setcVisitPhone(String cVisitPhone) {
        this.cVisitPhone = cVisitPhone;
    }

    /**
     * 获取回访任务描述
     *
     * @return c_visit_desc - 回访任务描述
     */
    public String getcVisitDesc() {
        return cVisitDesc;
    }

    /**
     * 设置回访任务描述
     *
     * @param cVisitDesc 回访任务描述
     */
    public void setcVisitDesc(String cVisitDesc) {
        this.cVisitDesc = cVisitDesc;
    }

    /**
     * 获取回访任务结果0:未执行 1已执行
     *
     * @return c_visit_status - 回访任务结果0:未执行 1已执行
     */
    public Integer getcVisitStatus() {
        return cVisitStatus;
    }

    /**
     * 设置回访任务结果0:未执行 1已执行
     *
     * @param cVisitStatus 回访任务结果0:未执行 1已执行
     */
    public void setcVisitStatus(Integer cVisitStatus) {
        this.cVisitStatus = cVisitStatus;
    }

    /**
     * 获取是否被删除 0起效 1失效
     *
     * @return c_visit_del - 是否被删除 0起效 1失效
     */
    public String getcVisitDel() {
        return cVisitDel;
    }

    /**
     * 设置是否被删除 0起效 1失效
     *
     * @param cVisitDel 是否被删除 0起效 1失效
     */
    public void setcVisitDel(String cVisitDel) {
        this.cVisitDel = cVisitDel;
    }

    /**
     * 获取回访任务时间
     *
     * @return c_visit_dateline - 回访任务时间
     */
    public Integer getcVisitDateline() {
        return cVisitDateline;
    }

    /**
     * 设置回访任务时间
     *
     * @param cVisitDateline 回访任务时间
     */
    public void setcVisitDateline(Integer cVisitDateline) {
        this.cVisitDateline = cVisitDateline;
    }

    /**
     * 获取客服的唯一标识
     *
     * @return c_service_pk - 客服的唯一标识
     */
    public String getcServicePk() {
        return cServicePk;
    }

    /**
     * 设置客服的唯一标识
     *
     * @param cServicePk 客服的唯一标识
     */
    public void setcServicePk(String cServicePk) {
        this.cServicePk = cServicePk;
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
}