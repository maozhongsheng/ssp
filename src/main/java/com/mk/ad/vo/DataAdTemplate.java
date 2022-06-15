package com.mk.ad.vo;

import java.io.Serializable;

public class DataAdTemplate implements Serializable {

    /**  主键 */
    private Long id;

    /**  广告位模板名称 */
    private String ad_template_name;

    /**  类型 */
    private Integer type;

    /**  比例 */
    private String ratio;

    /**  尺寸 */
    private String size;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAd_template_name() {
        return ad_template_name;
    }

    public void setAd_template_name(String ad_template_name) {
        this.ad_template_name = ad_template_name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getRatio() {
        return ratio;
    }

    public void setRatio(String ratio) {
        this.ratio = ratio;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", ad_template_name=").append(ad_template_name);
        sb.append(", type=").append(type);
        sb.append(", ratio=").append(ratio);
        sb.append(", size=").append(size);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        DataAdTemplate other = (DataAdTemplate) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAd_template_name() == null ? other.getAd_template_name() == null : this.getAd_template_name().equals(other.getAd_template_name()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getRatio() == null ? other.getRatio() == null : this.getRatio().equals(other.getRatio()))
            && (this.getSize() == null ? other.getSize() == null : this.getSize().equals(other.getSize()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAd_template_name() == null) ? 0 : getAd_template_name().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getRatio() == null) ? 0 : getRatio().hashCode());
        result = prime * result + ((getSize() == null) ? 0 : getSize().hashCode());
        return result;
    }
}