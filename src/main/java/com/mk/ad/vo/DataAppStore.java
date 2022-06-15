package com.mk.ad.vo;

import java.io.Serializable;

public class DataAppStore implements Serializable {

    /**  主键 */
    private Long id;

    /**  应用商店名称 */
    private String store_name;

    /**  平台类型  */
    private Integer platform_type;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStore_name() {
        return store_name;
    }

    public void setStore_name(String store_name) {
        this.store_name = store_name;
    }

    public Integer getPlatform_type() {
        return platform_type;
    }

    public void setPlatform_type(Integer platform_type) {
        this.platform_type = platform_type;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", store_name=").append(store_name);
        sb.append(", platform_type=").append(platform_type);
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
        DataAppStore other = (DataAppStore) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getStore_name() == null ? other.getStore_name() == null : this.getStore_name().equals(other.getStore_name()))
            && (this.getPlatform_type() == null ? other.getPlatform_type() == null : this.getPlatform_type().equals(other.getPlatform_type()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getStore_name() == null) ? 0 : getStore_name().hashCode());
        result = prime * result + ((getPlatform_type() == null) ? 0 : getPlatform_type().hashCode());
        return result;
    }
}