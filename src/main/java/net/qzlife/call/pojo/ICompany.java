package net.qzlife.call.pojo;

import javax.persistence.*;

@Table(name = "i_company")
public class ICompany {
    @Id
    private String pk;

    /**
     * 公司名称
     */
    private String name;

    /**
     * 公司描述
     */
    private String desc;

    /**
     * 公司网址
     */
    private String website;

    /**
     * @return pk
     */
    public String getPk() {
        return pk;
    }

    /**
     * @param pk
     */
    public void setPk(String pk) {
        this.pk = pk;
    }

    /**
     * 获取公司名称
     *
     * @return name - 公司名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置公司名称
     *
     * @param name 公司名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取公司描述
     *
     * @return desc - 公司描述
     */
    public String getDesc() {
        return desc;
    }

    /**
     * 设置公司描述
     *
     * @param desc 公司描述
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * 获取公司网址
     *
     * @return website - 公司网址
     */
    public String getWebsite() {
        return website;
    }

    /**
     * 设置公司网址
     *
     * @param website 公司网址
     */
    public void setWebsite(String website) {
        this.website = website;
    }
}