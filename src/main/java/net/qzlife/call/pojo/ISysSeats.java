package net.qzlife.call.pojo;

import javax.persistence.*;

@Table(name = "i_sys_seats")
public class ISysSeats {
    @Id
    @Column(name = "c_pk")
    private String cPk;

    /**
     * 座席分机号
     */
    @Column(name = "c_seat_extension")
    private String cSeatExtension;

    /**
     * 隶属于哪个crm系统
     */
    @Column(name = "c_crm_id")
    private String cCrmId;

    /**
     * 座席名称
     */
    @Column(name = "c_seat_name")
    private String cSeatName;

    /**
     * 是否被删除
     */
    @Column(name = "c_is_del")
    private Boolean cIsDel;

    /**
     * 创建时间
     */
    @Column(name = "c_dateline")
    private Integer cDateline;

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
     * 获取座席分机号
     *
     * @return c_seat_extension - 座席分机号
     */
    public String getcSeatExtension() {
        return cSeatExtension;
    }

    /**
     * 设置座席分机号
     *
     * @param cSeatExtension 座席分机号
     */
    public void setcSeatExtension(String cSeatExtension) {
        this.cSeatExtension = cSeatExtension;
    }

    /**
     * 获取隶属于哪个crm系统
     *
     * @return c_crm_id - 隶属于哪个crm系统
     */
    public String getcCrmId() {
        return cCrmId;
    }

    /**
     * 设置隶属于哪个crm系统
     *
     * @param cCrmId 隶属于哪个crm系统
     */
    public void setcCrmId(String cCrmId) {
        this.cCrmId = cCrmId;
    }

    /**
     * 获取座席名称
     *
     * @return c_seat_name - 座席名称
     */
    public String getcSeatName() {
        return cSeatName;
    }

    /**
     * 设置座席名称
     *
     * @param cSeatName 座席名称
     */
    public void setcSeatName(String cSeatName) {
        this.cSeatName = cSeatName;
    }

    /**
     * 获取是否被删除
     *
     * @return c_is_del - 是否被删除
     */
    public Boolean getcIsDel() {
        return cIsDel;
    }

    /**
     * 设置是否被删除
     *
     * @param cIsDel 是否被删除
     */
    public void setcIsDel(Boolean cIsDel) {
        this.cIsDel = cIsDel;
    }

    /**
     * 获取创建时间
     *
     * @return c_dateline - 创建时间
     */
    public Integer getcDateline() {
        return cDateline;
    }

    /**
     * 设置创建时间
     *
     * @param cDateline 创建时间
     */
    public void setcDateline(Integer cDateline) {
        this.cDateline = cDateline;
    }
}