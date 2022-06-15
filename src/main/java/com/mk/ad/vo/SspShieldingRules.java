package com.mk.ad.vo;

import java.io.Serializable;
import java.util.Date;

public class SspShieldingRules implements Serializable {
    private Integer id;

    private String user_id;

    private String name;

    private String classification;

    private String key_word;

    private String ios_package;

    private String android_package;

    private String related_media;

    private String related_advertising;

    private Date create_time;

    private Integer is_delete;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getKey_word() {
        return key_word;
    }

    public void setKey_word(String key_word) {
        this.key_word = key_word;
    }

    public String getIos_package() {
        return ios_package;
    }

    public void setIos_package(String ios_package) {
        this.ios_package = ios_package;
    }

    public String getAndroid_package() {
        return android_package;
    }

    public void setAndroid_package(String android_package) {
        this.android_package = android_package;
    }

    public String getRelated_media() {
        return related_media;
    }

    public void setRelated_media(String related_media) {
        this.related_media = related_media;
    }

    public String getRelated_advertising() {
        return related_advertising;
    }

    public void setRelated_advertising(String related_advertising) {
        this.related_advertising = related_advertising;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Integer getIs_delete() {
        return is_delete;
    }

    public void setIs_delete(Integer is_delete) {
        this.is_delete = is_delete;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", user_id=").append(user_id);
        sb.append(", name=").append(name);
        sb.append(", classification=").append(classification);
        sb.append(", key_word=").append(key_word);
        sb.append(", ios_package=").append(ios_package);
        sb.append(", android_package=").append(android_package);
        sb.append(", related_media=").append(related_media);
        sb.append(", related_advertising=").append(related_advertising);
        sb.append(", create_time=").append(create_time);
        sb.append(", is_delete=").append(is_delete);
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
        SspShieldingRules other = (SspShieldingRules) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUser_id() == null ? other.getUser_id() == null : this.getUser_id().equals(other.getUser_id()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getClassification() == null ? other.getClassification() == null : this.getClassification().equals(other.getClassification()))
            && (this.getKey_word() == null ? other.getKey_word() == null : this.getKey_word().equals(other.getKey_word()))
            && (this.getIos_package() == null ? other.getIos_package() == null : this.getIos_package().equals(other.getIos_package()))
            && (this.getAndroid_package() == null ? other.getAndroid_package() == null : this.getAndroid_package().equals(other.getAndroid_package()))
            && (this.getRelated_media() == null ? other.getRelated_media() == null : this.getRelated_media().equals(other.getRelated_media()))
            && (this.getRelated_advertising() == null ? other.getRelated_advertising() == null : this.getRelated_advertising().equals(other.getRelated_advertising()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getIs_delete() == null ? other.getIs_delete() == null : this.getIs_delete().equals(other.getIs_delete()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUser_id() == null) ? 0 : getUser_id().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getClassification() == null) ? 0 : getClassification().hashCode());
        result = prime * result + ((getKey_word() == null) ? 0 : getKey_word().hashCode());
        result = prime * result + ((getIos_package() == null) ? 0 : getIos_package().hashCode());
        result = prime * result + ((getAndroid_package() == null) ? 0 : getAndroid_package().hashCode());
        result = prime * result + ((getRelated_media() == null) ? 0 : getRelated_media().hashCode());
        result = prime * result + ((getRelated_advertising() == null) ? 0 : getRelated_advertising().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getIs_delete() == null) ? 0 : getIs_delete().hashCode());
        return result;
    }
}