package net.qzlife.call.pojo;

import javax.persistence.*;

@Table(name = "c_company")
public class CCompany {
    @Id
    @Column(name = "c_pk")
    private String cPk;

    /**
     * 公司名称
     */
    @Column(name = "c_name")
    private String cName;

    /**
     * 公司描述
     */
    @Column(name = "c_desc")
    private String cDesc;

    /**
     * 公司网址
     */
    @Column(name = "c_website")
    private String cWebsite;

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
     * 获取公司名称
     *
     * @return c_name - 公司名称
     */
    public String getcName() {
        return cName;
    }

    /**
     * 设置公司名称
     *
     * @param cName 公司名称
     */
    public void setcName(String cName) {
        this.cName = cName;
    }

    /**
     * 获取公司描述
     *
     * @return c_desc - 公司描述
     */
    public String getcDesc() {
        return cDesc;
    }

    /**
     * 设置公司描述
     *
     * @param cDesc 公司描述
     */
    public void setcDesc(String cDesc) {
        this.cDesc = cDesc;
    }

    /**
     * 获取公司网址
     *
     * @return c_website - 公司网址
     */
    public String getcWebsite() {
        return cWebsite;
    }

    /**
     * 设置公司网址
     *
     * @param cWebsite 公司网址
     */
    public void setcWebsite(String cWebsite) {
        this.cWebsite = cWebsite;
    }
}