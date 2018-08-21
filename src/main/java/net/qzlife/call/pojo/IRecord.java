package net.qzlife.call.pojo;

import javax.persistence.*;

@Table(name = "i_record")
public class IRecord {
    /**
     * 字符串主键
     */
    @Id
    private String pk;

    /**
     * 呼叫开始时间格式为:2017-08-01
     */
    private String starttime;

    /**
     * 主叫号码，主动发起呼叫方
     */
    private String source;

    /**
     * 被叫号码，被呼叫方
     */
    private String destination;

    /**
     * 整个呼叫通话的时间，使用秒来计费（数据类型：整数）
     */
    private Integer duration;

    /**
     * 整个呼叫通话的时间，使用秒来计费（数据类型：整数）
     */
    private Integer billableseconds;

    /**
     * 呼叫状态（接通-‘ANSWERED’，没有接通-‘NO ANSWER’）
     */
    private String disposition;

    /**
     * 通话记录的唯一标识
     */
    private String uniqueid;

    /**
     * 呼叫类型（呼出：out, 呼入-in）
     */
    private String calltype;

    /**
     * 录音文件名
     */
    private String userfield;

    /**
     * 电话接听时间
     */
    private String answertime;

    /**
     * 电话挂断时间
     */
    private String endtime;

    @Column(name = "servie_id")
    private String servieId;

    @Column(name = "crm_id")
    private String crmId;

    /**
     * 应用id
     */
    @Column(name = "app_pid")
    private String appPid;

    /**
     * 获取字符串主键
     *
     * @return pk - 字符串主键
     */
    public String getPk() {
        return pk;
    }

    /**
     * 设置字符串主键
     *
     * @param pk 字符串主键
     */
    public void setPk(String pk) {
        this.pk = pk;
    }

    /**
     * 获取呼叫开始时间格式为:2017-08-01
     *
     * @return starttime - 呼叫开始时间格式为:2017-08-01
     */
    public String getStarttime() {
        return starttime;
    }

    /**
     * 设置呼叫开始时间格式为:2017-08-01
     *
     * @param starttime 呼叫开始时间格式为:2017-08-01
     */
    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    /**
     * 获取主叫号码，主动发起呼叫方
     *
     * @return source - 主叫号码，主动发起呼叫方
     */
    public String getSource() {
        return source;
    }

    /**
     * 设置主叫号码，主动发起呼叫方
     *
     * @param source 主叫号码，主动发起呼叫方
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * 获取被叫号码，被呼叫方
     *
     * @return destination - 被叫号码，被呼叫方
     */
    public String getDestination() {
        return destination;
    }

    /**
     * 设置被叫号码，被呼叫方
     *
     * @param destination 被叫号码，被呼叫方
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * 获取整个呼叫通话的时间，使用秒来计费（数据类型：整数）
     *
     * @return duration - 整个呼叫通话的时间，使用秒来计费（数据类型：整数）
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * 设置整个呼叫通话的时间，使用秒来计费（数据类型：整数）
     *
     * @param duration 整个呼叫通话的时间，使用秒来计费（数据类型：整数）
     */
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * 获取整个呼叫通话的时间，使用秒来计费（数据类型：整数）
     *
     * @return billableseconds - 整个呼叫通话的时间，使用秒来计费（数据类型：整数）
     */
    public Integer getBillableseconds() {
        return billableseconds;
    }

    /**
     * 设置整个呼叫通话的时间，使用秒来计费（数据类型：整数）
     *
     * @param billableseconds 整个呼叫通话的时间，使用秒来计费（数据类型：整数）
     */
    public void setBillableseconds(Integer billableseconds) {
        this.billableseconds = billableseconds;
    }

    /**
     * 获取呼叫状态（接通-‘ANSWERED’，没有接通-‘NO ANSWER’）
     *
     * @return disposition - 呼叫状态（接通-‘ANSWERED’，没有接通-‘NO ANSWER’）
     */
    public String getDisposition() {
        return disposition;
    }

    /**
     * 设置呼叫状态（接通-‘ANSWERED’，没有接通-‘NO ANSWER’）
     *
     * @param disposition 呼叫状态（接通-‘ANSWERED’，没有接通-‘NO ANSWER’）
     */
    public void setDisposition(String disposition) {
        this.disposition = disposition;
    }

    /**
     * 获取通话记录的唯一标识
     *
     * @return uniqueid - 通话记录的唯一标识
     */
    public String getUniqueid() {
        return uniqueid;
    }

    /**
     * 设置通话记录的唯一标识
     *
     * @param uniqueid 通话记录的唯一标识
     */
    public void setUniqueid(String uniqueid) {
        this.uniqueid = uniqueid;
    }

    /**
     * 获取呼叫类型（呼出：out, 呼入-in）
     *
     * @return calltype - 呼叫类型（呼出：out, 呼入-in）
     */
    public String getCalltype() {
        return calltype;
    }

    /**
     * 设置呼叫类型（呼出：out, 呼入-in）
     *
     * @param calltype 呼叫类型（呼出：out, 呼入-in）
     */
    public void setCalltype(String calltype) {
        this.calltype = calltype;
    }

    /**
     * 获取录音文件名
     *
     * @return userfield - 录音文件名
     */
    public String getUserfield() {
        return userfield;
    }

    /**
     * 设置录音文件名
     *
     * @param userfield 录音文件名
     */
    public void setUserfield(String userfield) {
        this.userfield = userfield;
    }

    /**
     * 获取电话接听时间
     *
     * @return answertime - 电话接听时间
     */
    public String getAnswertime() {
        return answertime;
    }

    /**
     * 设置电话接听时间
     *
     * @param answertime 电话接听时间
     */
    public void setAnswertime(String answertime) {
        this.answertime = answertime;
    }

    /**
     * 获取电话挂断时间
     *
     * @return endtime - 电话挂断时间
     */
    public String getEndtime() {
        return endtime;
    }

    /**
     * 设置电话挂断时间
     *
     * @param endtime 电话挂断时间
     */
    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    /**
     * @return servie_id
     */
    public String getServieId() {
        return servieId;
    }

    /**
     * @param servieId
     */
    public void setServieId(String servieId) {
        this.servieId = servieId;
    }

    /**
     * @return crm_id
     */
    public String getCrmId() {
        return crmId;
    }

    /**
     * @param crmId
     */
    public void setCrmId(String crmId) {
        this.crmId = crmId;
    }

    /**
     * 获取应用id
     *
     * @return app_pid - 应用id
     */
    public String getAppPid() {
        return appPid;
    }

    /**
     * 设置应用id
     *
     * @param appPid 应用id
     */
    public void setAppPid(String appPid) {
        this.appPid = appPid;
    }
}