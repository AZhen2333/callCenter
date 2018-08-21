package net.qzlife.call.pojo;

import javax.persistence.*;

@Table(name = "c_record")
public class CRecord {
    /**
     * 字符串主键
     */
    @Id
    @Column(name = "c_pk")
    private String cPk;

    /**
     * 呼叫开始时间格式为:2017-08-01
     */
    @Column(name = "c_starttime")
    private String cStarttime;

    /**
     * 主叫号码，主动发起呼叫方
     */
    @Column(name = "c_source")
    private String cSource;

    /**
     * 被叫号码，被呼叫方
     */
    @Column(name = "c_destination")
    private String cDestination;

    /**
     * 整个呼叫通话的时间，使用秒来计费（数据类型：整数）
     */
    @Column(name = "c_duration")
    private Integer cDuration;

    /**
     * 整个呼叫通话的时间，使用秒来计费（数据类型：整数）
     */
    @Column(name = "c_billableseconds")
    private Integer cBillableseconds;

    /**
     * 呼叫状态（接通-‘ANSWERED’，没有接通-‘NO ANSWER’）
     */
    @Column(name = "c_disposition")
    private String cDisposition;

    /**
     * 通话记录的唯一标识
     */
    @Column(name = "c_uniqueid")
    private String cUniqueid;

    /**
     * 呼叫类型（呼出：out, 呼入-in）
     */
    @Column(name = "c_calltype")
    private String cCalltype;

    /**
     * 录音文件名
     */
    @Column(name = "c_userfield")
    private String cUserfield;

    /**
     * 电话接听时间
     */
    @Column(name = "c_answertime")
    private String cAnswertime;

    /**
     * 电话挂断时间
     */
    @Column(name = "c_endtime")
    private String cEndtime;

    @Column(name = "c_servie_id")
    private String cServieId;

    @Column(name = "c_crm_id")
    private String cCrmId;

    /**
     * 应用id
     */
    @Column(name = "c_app_pid")
    private String cAppPid;

    /**
     * 获取字符串主键
     *
     * @return c_pk - 字符串主键
     */
    public String getcPk() {
        return cPk;
    }

    /**
     * 设置字符串主键
     *
     * @param cPk 字符串主键
     */
    public void setcPk(String cPk) {
        this.cPk = cPk;
    }

    /**
     * 获取呼叫开始时间格式为:2017-08-01
     *
     * @return c_starttime - 呼叫开始时间格式为:2017-08-01
     */
    public String getcStarttime() {
        return cStarttime;
    }

    /**
     * 设置呼叫开始时间格式为:2017-08-01
     *
     * @param cStarttime 呼叫开始时间格式为:2017-08-01
     */
    public void setcStarttime(String cStarttime) {
        this.cStarttime = cStarttime;
    }

    /**
     * 获取主叫号码，主动发起呼叫方
     *
     * @return c_source - 主叫号码，主动发起呼叫方
     */
    public String getcSource() {
        return cSource;
    }

    /**
     * 设置主叫号码，主动发起呼叫方
     *
     * @param cSource 主叫号码，主动发起呼叫方
     */
    public void setcSource(String cSource) {
        this.cSource = cSource;
    }

    /**
     * 获取被叫号码，被呼叫方
     *
     * @return c_destination - 被叫号码，被呼叫方
     */
    public String getcDestination() {
        return cDestination;
    }

    /**
     * 设置被叫号码，被呼叫方
     *
     * @param cDestination 被叫号码，被呼叫方
     */
    public void setcDestination(String cDestination) {
        this.cDestination = cDestination;
    }

    /**
     * 获取整个呼叫通话的时间，使用秒来计费（数据类型：整数）
     *
     * @return c_duration - 整个呼叫通话的时间，使用秒来计费（数据类型：整数）
     */
    public Integer getcDuration() {
        return cDuration;
    }

    /**
     * 设置整个呼叫通话的时间，使用秒来计费（数据类型：整数）
     *
     * @param cDuration 整个呼叫通话的时间，使用秒来计费（数据类型：整数）
     */
    public void setcDuration(Integer cDuration) {
        this.cDuration = cDuration;
    }

    /**
     * 获取整个呼叫通话的时间，使用秒来计费（数据类型：整数）
     *
     * @return c_billableseconds - 整个呼叫通话的时间，使用秒来计费（数据类型：整数）
     */
    public Integer getcBillableseconds() {
        return cBillableseconds;
    }

    /**
     * 设置整个呼叫通话的时间，使用秒来计费（数据类型：整数）
     *
     * @param cBillableseconds 整个呼叫通话的时间，使用秒来计费（数据类型：整数）
     */
    public void setcBillableseconds(Integer cBillableseconds) {
        this.cBillableseconds = cBillableseconds;
    }

    /**
     * 获取呼叫状态（接通-‘ANSWERED’，没有接通-‘NO ANSWER’）
     *
     * @return c_disposition - 呼叫状态（接通-‘ANSWERED’，没有接通-‘NO ANSWER’）
     */
    public String getcDisposition() {
        return cDisposition;
    }

    /**
     * 设置呼叫状态（接通-‘ANSWERED’，没有接通-‘NO ANSWER’）
     *
     * @param cDisposition 呼叫状态（接通-‘ANSWERED’，没有接通-‘NO ANSWER’）
     */
    public void setcDisposition(String cDisposition) {
        this.cDisposition = cDisposition;
    }

    /**
     * 获取通话记录的唯一标识
     *
     * @return c_uniqueid - 通话记录的唯一标识
     */
    public String getcUniqueid() {
        return cUniqueid;
    }

    /**
     * 设置通话记录的唯一标识
     *
     * @param cUniqueid 通话记录的唯一标识
     */
    public void setcUniqueid(String cUniqueid) {
        this.cUniqueid = cUniqueid;
    }

    /**
     * 获取呼叫类型（呼出：out, 呼入-in）
     *
     * @return c_calltype - 呼叫类型（呼出：out, 呼入-in）
     */
    public String getcCalltype() {
        return cCalltype;
    }

    /**
     * 设置呼叫类型（呼出：out, 呼入-in）
     *
     * @param cCalltype 呼叫类型（呼出：out, 呼入-in）
     */
    public void setcCalltype(String cCalltype) {
        this.cCalltype = cCalltype;
    }

    /**
     * 获取录音文件名
     *
     * @return c_userfield - 录音文件名
     */
    public String getcUserfield() {
        return cUserfield;
    }

    /**
     * 设置录音文件名
     *
     * @param cUserfield 录音文件名
     */
    public void setcUserfield(String cUserfield) {
        this.cUserfield = cUserfield;
    }

    /**
     * 获取电话接听时间
     *
     * @return c_answertime - 电话接听时间
     */
    public String getcAnswertime() {
        return cAnswertime;
    }

    /**
     * 设置电话接听时间
     *
     * @param cAnswertime 电话接听时间
     */
    public void setcAnswertime(String cAnswertime) {
        this.cAnswertime = cAnswertime;
    }

    /**
     * 获取电话挂断时间
     *
     * @return c_endtime - 电话挂断时间
     */
    public String getcEndtime() {
        return cEndtime;
    }

    /**
     * 设置电话挂断时间
     *
     * @param cEndtime 电话挂断时间
     */
    public void setcEndtime(String cEndtime) {
        this.cEndtime = cEndtime;
    }

    /**
     * @return c_servie_id
     */
    public String getcServieId() {
        return cServieId;
    }

    /**
     * @param cServieId
     */
    public void setcServieId(String cServieId) {
        this.cServieId = cServieId;
    }

    /**
     * @return c_crm_id
     */
    public String getcCrmId() {
        return cCrmId;
    }

    /**
     * @param cCrmId
     */
    public void setcCrmId(String cCrmId) {
        this.cCrmId = cCrmId;
    }

    /**
     * 获取应用id
     *
     * @return c_app_pid - 应用id
     */
    public String getcAppPid() {
        return cAppPid;
    }

    /**
     * 设置应用id
     *
     * @param cAppPid 应用id
     */
    public void setcAppPid(String cAppPid) {
        this.cAppPid = cAppPid;
    }
}