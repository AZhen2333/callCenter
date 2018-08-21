package net.qzlife.call.pojo;

import javax.persistence.*;

@Table(name = "c_out_task")
public class COutTask {
    @Id
    @Column(name = "c_pk")
    private String cPk;

    /**
     * 外呼任务名称
     */
    @Column(name = "c_name")
    private String cName;

    /**
     * 开始时间:如2017-08-07的时间戳
     */
    @Column(name = "c_starttime")
    private Integer cStarttime;

    /**
     * 结束时间:如2017-08-07的时间戳
     */
    @Column(name = "c_endTime")
    private Integer cEndtime;

    /**
     * 任务描述
     */
    @Column(name = "c_desc")
    private String cDesc;

    /**
     * 状态:0:开启 1:暂停 -1:关闭 2删除
     */
    @Column(name = "c_status")
    private Integer cStatus;

    /**
     * 客户数量
     */
    @Column(name = "c_client_num")
    private Integer cClientNum;

    /**
     * 应用标识
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
     * 获取外呼任务名称
     *
     * @return c_name - 外呼任务名称
     */
    public String getcName() {
        return cName;
    }

    /**
     * 设置外呼任务名称
     *
     * @param cName 外呼任务名称
     */
    public void setcName(String cName) {
        this.cName = cName;
    }

    /**
     * 获取开始时间:如2017-08-07的时间戳
     *
     * @return c_starttime - 开始时间:如2017-08-07的时间戳
     */
    public Integer getcStarttime() {
        return cStarttime;
    }

    /**
     * 设置开始时间:如2017-08-07的时间戳
     *
     * @param cStarttime 开始时间:如2017-08-07的时间戳
     */
    public void setcStarttime(Integer cStarttime) {
        this.cStarttime = cStarttime;
    }

    /**
     * 获取结束时间:如2017-08-07的时间戳
     *
     * @return c_endTime - 结束时间:如2017-08-07的时间戳
     */
    public Integer getcEndtime() {
        return cEndtime;
    }

    /**
     * 设置结束时间:如2017-08-07的时间戳
     *
     * @param cEndtime 结束时间:如2017-08-07的时间戳
     */
    public void setcEndtime(Integer cEndtime) {
        this.cEndtime = cEndtime;
    }

    /**
     * 获取任务描述
     *
     * @return c_desc - 任务描述
     */
    public String getcDesc() {
        return cDesc;
    }

    /**
     * 设置任务描述
     *
     * @param cDesc 任务描述
     */
    public void setcDesc(String cDesc) {
        this.cDesc = cDesc;
    }

    /**
     * 获取状态:0:开启 1:暂停 -1:关闭 2删除
     *
     * @return c_status - 状态:0:开启 1:暂停 -1:关闭 2删除
     */
    public Integer getcStatus() {
        return cStatus;
    }

    /**
     * 设置状态:0:开启 1:暂停 -1:关闭 2删除
     *
     * @param cStatus 状态:0:开启 1:暂停 -1:关闭 2删除
     */
    public void setcStatus(Integer cStatus) {
        this.cStatus = cStatus;
    }

    /**
     * 获取客户数量
     *
     * @return c_client_num - 客户数量
     */
    public Integer getcClientNum() {
        return cClientNum;
    }

    /**
     * 设置客户数量
     *
     * @param cClientNum 客户数量
     */
    public void setcClientNum(Integer cClientNum) {
        this.cClientNum = cClientNum;
    }

    /**
     * 获取应用标识
     *
     * @return c_app_id - 应用标识
     */
    public String getcAppId() {
        return cAppId;
    }

    /**
     * 设置应用标识
     *
     * @param cAppId 应用标识
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
}