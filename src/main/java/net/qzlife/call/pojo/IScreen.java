package net.qzlife.call.pojo;

import javax.persistence.*;

@Table(name = "i_screen")
public class IScreen {
    @Id
    @Column(name = "c_pk")
    private String cPk;

    /**
     * 客户名称 默认显示为手机号
     */
    @Column(name = "c_name")
    private String cName;

    /**
     * 客户联系电话
     */
    @Column(name = "c_phone")
    private String cPhone;

    /**
     * 客户email
     */
    @Column(name = "c_email")
    private String cEmail;

    /**
     * 客户公司
     */
    @Column(name = "c_company")
    private String cCompany;

    /**
     * 描述
     */
    @Column(name = "c_desc")
    private String cDesc;

    /**
     * 标签
     */
    @Column(name = "c_tag")
    private String cTag;

    /**
     * 被叫号码
     */
    @Column(name = "c_callee")
    private String cCallee;

    /**
     * 通话录音文件
     */
    @Column(name = "c_recordfile")
    private String cRecordfile;

    /**
     * 通话记录唯一标识
     */
    @Column(name = "c_uniqueid")
    private String cUniqueid;

    /**
     * 弹屏时间
     */
    @Column(name = "c_datetime")
    private Integer cDatetime;

    /**
     * 主叫号码
     */
    @Column(name = "c_caller")
    private String cCaller;

    /**
     * 呼出显示号码
     */
    @Column(name = "c_cid")
    private String cCid;

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
     * 获取客户名称 默认显示为手机号
     *
     * @return c_name - 客户名称 默认显示为手机号
     */
    public String getcName() {
        return cName;
    }

    /**
     * 设置客户名称 默认显示为手机号
     *
     * @param cName 客户名称 默认显示为手机号
     */
    public void setcName(String cName) {
        this.cName = cName;
    }

    /**
     * 获取客户联系电话
     *
     * @return c_phone - 客户联系电话
     */
    public String getcPhone() {
        return cPhone;
    }

    /**
     * 设置客户联系电话
     *
     * @param cPhone 客户联系电话
     */
    public void setcPhone(String cPhone) {
        this.cPhone = cPhone;
    }

    /**
     * 获取客户email
     *
     * @return c_email - 客户email
     */
    public String getcEmail() {
        return cEmail;
    }

    /**
     * 设置客户email
     *
     * @param cEmail 客户email
     */
    public void setcEmail(String cEmail) {
        this.cEmail = cEmail;
    }

    /**
     * 获取客户公司
     *
     * @return c_company - 客户公司
     */
    public String getcCompany() {
        return cCompany;
    }

    /**
     * 设置客户公司
     *
     * @param cCompany 客户公司
     */
    public void setcCompany(String cCompany) {
        this.cCompany = cCompany;
    }

    /**
     * 获取描述
     *
     * @return c_desc - 描述
     */
    public String getcDesc() {
        return cDesc;
    }

    /**
     * 设置描述
     *
     * @param cDesc 描述
     */
    public void setcDesc(String cDesc) {
        this.cDesc = cDesc;
    }

    /**
     * 获取标签
     *
     * @return c_tag - 标签
     */
    public String getcTag() {
        return cTag;
    }

    /**
     * 设置标签
     *
     * @param cTag 标签
     */
    public void setcTag(String cTag) {
        this.cTag = cTag;
    }

    /**
     * 获取被叫号码
     *
     * @return c_callee - 被叫号码
     */
    public String getcCallee() {
        return cCallee;
    }

    /**
     * 设置被叫号码
     *
     * @param cCallee 被叫号码
     */
    public void setcCallee(String cCallee) {
        this.cCallee = cCallee;
    }

    /**
     * 获取通话录音文件
     *
     * @return c_recordfile - 通话录音文件
     */
    public String getcRecordfile() {
        return cRecordfile;
    }

    /**
     * 设置通话录音文件
     *
     * @param cRecordfile 通话录音文件
     */
    public void setcRecordfile(String cRecordfile) {
        this.cRecordfile = cRecordfile;
    }

    /**
     * 获取通话记录唯一标识
     *
     * @return c_uniqueid - 通话记录唯一标识
     */
    public String getcUniqueid() {
        return cUniqueid;
    }

    /**
     * 设置通话记录唯一标识
     *
     * @param cUniqueid 通话记录唯一标识
     */
    public void setcUniqueid(String cUniqueid) {
        this.cUniqueid = cUniqueid;
    }

    /**
     * 获取弹屏时间
     *
     * @return c_datetime - 弹屏时间
     */
    public Integer getcDatetime() {
        return cDatetime;
    }

    /**
     * 设置弹屏时间
     *
     * @param cDatetime 弹屏时间
     */
    public void setcDatetime(Integer cDatetime) {
        this.cDatetime = cDatetime;
    }

    /**
     * 获取主叫号码
     *
     * @return c_caller - 主叫号码
     */
    public String getcCaller() {
        return cCaller;
    }

    /**
     * 设置主叫号码
     *
     * @param cCaller 主叫号码
     */
    public void setcCaller(String cCaller) {
        this.cCaller = cCaller;
    }

    /**
     * 获取呼出显示号码
     *
     * @return c_cid - 呼出显示号码
     */
    public String getcCid() {
        return cCid;
    }

    /**
     * 设置呼出显示号码
     *
     * @param cCid 呼出显示号码
     */
    public void setcCid(String cCid) {
        this.cCid = cCid;
    }
}