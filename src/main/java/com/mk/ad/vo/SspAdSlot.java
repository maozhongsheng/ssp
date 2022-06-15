package com.mk.ad.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class SspAdSlot implements Serializable {
    private Long id;

    private Integer media_id;

    private String bussiness_type_one;

    private Integer slot_type_id;

    private String ad_template_id;

    private String ad_template_type;

    private String slot_name;

    private Integer slot_status;

    private Integer business_status;

    private Integer cooperation_type;

    private Integer render_type;

    private String web_linked;

    private String application_download;

    private Integer ad_pull_mode;

    private BigDecimal cp_price;

    private String requet_rate;

    private Integer slot_examine_status;

    private Date create_time;

    private Date update_time;

    private Integer is_deleted;

    private String ad_type_received;

    private Long ssp_id;

    private String user_id;

    private String block_keywords;

    private String block_android_app;

    private String block_ios_app;

    private String block_industry;

    private Integer specific;

    private Integer awarding;

    private String callback_url;

    private String secret_key;

    private String ad_template_custom;

    private String upper_id;

    private String upper_slot;

    private String upper_ecpm;

    private String downstream_ecpm;

    private static final long serialVersionUID = 1L;

    public String getUpper_id() { return upper_id; }

    public void setUpper_id(String upper_id) { this.upper_id = upper_id; }

    public String getUpper_slot() { return upper_slot; }

    public void setUpper_slot(String upper_slot) { this.upper_slot = upper_slot; }

    public String getUpper_ecpm() { return upper_ecpm; }

    public void setUpper_ecpm(String upper_ecpm) { this.upper_ecpm = upper_ecpm; }

    public String getDownstream_ecpm() { return downstream_ecpm; }

    public void setDownstream_ecpm(String downstream_ecpm) { this.downstream_ecpm = downstream_ecpm; }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getMedia_id() {
        return media_id;
    }

    public void setMedia_id(Integer media_id) {
        this.media_id = media_id;
    }

    public String getBussiness_type_one() {
        return bussiness_type_one;
    }

    public void setBussiness_type_one(String bussiness_type_one) {
        this.bussiness_type_one = bussiness_type_one;
    }

    public Integer getSlot_type_id() {
        return slot_type_id;
    }

    public void setSlot_type_id(Integer slot_type_id) {
        this.slot_type_id = slot_type_id;
    }

    public String getAd_template_id() {
        return ad_template_id;
    }

    public void setAd_template_id(String ad_template_id) {
        this.ad_template_id = ad_template_id;
    }

    public String getAd_template_type() {
        return ad_template_type;
    }

    public void setAd_template_type(String ad_template_type) {
        this.ad_template_type = ad_template_type;
    }

    public String getSlot_name() {
        return slot_name;
    }

    public void setSlot_name(String slot_name) {
        this.slot_name = slot_name;
    }

    public Integer getSlot_status() {
        return slot_status;
    }

    public void setSlot_status(Integer slot_status) {
        this.slot_status = slot_status;
    }

    public Integer getBusiness_status() {
        return business_status;
    }

    public void setBusiness_status(Integer business_status) {
        this.business_status = business_status;
    }

    public Integer getCooperation_type() {
        return cooperation_type;
    }

    public void setCooperation_type(Integer cooperation_type) {
        this.cooperation_type = cooperation_type;
    }

    public Integer getRender_type() {
        return render_type;
    }

    public void setRender_type(Integer render_type) {
        this.render_type = render_type;
    }

    public String getWeb_linked() {
        return web_linked;
    }

    public void setWeb_linked(String web_linked) {
        this.web_linked = web_linked;
    }

    public String getApplication_download() {
        return application_download;
    }

    public void setApplication_download(String application_download) {
        this.application_download = application_download;
    }

    public Integer getAd_pull_mode() {
        return ad_pull_mode;
    }

    public void setAd_pull_mode(Integer ad_pull_mode) {
        this.ad_pull_mode = ad_pull_mode;
    }

    public BigDecimal getCp_price() {
        return cp_price;
    }

    public void setCp_price(BigDecimal cp_price) {
        this.cp_price = cp_price;
    }

    public String getRequet_rate() {
        return requet_rate;
    }

    public void setRequet_rate(String requet_rate) {
        this.requet_rate = requet_rate;
    }

    public Integer getSlot_examine_status() {
        return slot_examine_status;
    }

    public void setSlot_examine_status(Integer slot_examine_status) {
        this.slot_examine_status = slot_examine_status;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    public Integer getIs_deleted() {
        return is_deleted;
    }

    public void setIs_deleted(Integer is_deleted) {
        this.is_deleted = is_deleted;
    }

    public String getAd_type_received() {
        return ad_type_received;
    }

    public void setAd_type_received(String ad_type_received) {
        this.ad_type_received = ad_type_received;
    }

    public Long getSsp_id() {
        return ssp_id;
    }

    public void setSsp_id(Long ssp_id) {
        this.ssp_id = ssp_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getBlock_keywords() {
        return block_keywords;
    }

    public void setBlock_keywords(String block_keywords) {
        this.block_keywords = block_keywords;
    }

    public String getBlock_android_app() {
        return block_android_app;
    }

    public void setBlock_android_app(String block_android_app) {
        this.block_android_app = block_android_app;
    }

    public String getBlock_ios_app() {
        return block_ios_app;
    }

    public void setBlock_ios_app(String block_ios_app) {
        this.block_ios_app = block_ios_app;
    }

    public String getBlock_industry() {
        return block_industry;
    }

    public void setBlock_industry(String block_industry) {
        this.block_industry = block_industry;
    }

    public Integer getSpecific() {
        return specific;
    }

    public void setSpecific(Integer specific) {
        this.specific = specific;
    }

    public Integer getAwarding() {
        return awarding;
    }

    public void setAwarding(Integer awarding) {
        this.awarding = awarding;
    }

    public String getCallback_url() {
        return callback_url;
    }

    public void setCallback_url(String callback_url) {
        this.callback_url = callback_url;
    }

    public String getSecret_key() {
        return secret_key;
    }

    public void setSecret_key(String secret_key) {
        this.secret_key = secret_key;
    }

    public String getAd_template_custom() {
        return ad_template_custom;
    }

    public void setAd_template_custom(String ad_template_custom) {
        this.ad_template_custom = ad_template_custom;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", media_id=").append(media_id);
        sb.append(", bussiness_type_one=").append(bussiness_type_one);
        sb.append(", slot_type_id=").append(slot_type_id);
        sb.append(", ad_template_id=").append(ad_template_id);
        sb.append(", ad_template_type=").append(ad_template_type);
        sb.append(", slot_name=").append(slot_name);
        sb.append(", slot_status=").append(slot_status);
        sb.append(", business_status=").append(business_status);
        sb.append(", cooperation_type=").append(cooperation_type);
        sb.append(", render_type=").append(render_type);
        sb.append(", web_linked=").append(web_linked);
        sb.append(", application_download=").append(application_download);
        sb.append(", ad_pull_mode=").append(ad_pull_mode);
        sb.append(", cp_price=").append(cp_price);
        sb.append(", requet_rate=").append(requet_rate);
        sb.append(", slot_examine_status=").append(slot_examine_status);
        sb.append(", create_time=").append(create_time);
        sb.append(", update_time=").append(update_time);
        sb.append(", is_deleted=").append(is_deleted);
        sb.append(", ad_type_received=").append(ad_type_received);
        sb.append(", ssp_id=").append(ssp_id);
        sb.append(", user_id=").append(user_id);
        sb.append(", block_keywords=").append(block_keywords);
        sb.append(", block_android_app=").append(block_android_app);
        sb.append(", block_ios_app=").append(block_ios_app);
        sb.append(", block_industry=").append(block_industry);
        sb.append(", specific=").append(specific);
        sb.append(", awarding=").append(awarding);
        sb.append(", callback_url=").append(callback_url);
        sb.append(", secret_key=").append(secret_key);
        sb.append(", ad_template_custom=").append(ad_template_custom);
        sb.append(", upper_id=").append(upper_id);
        sb.append(", upper_slot=").append(upper_slot);
        sb.append(", upper_ecpm=").append(upper_ecpm);
        sb.append(", downstream_ecpm=").append(downstream_ecpm);
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
        SspAdSlot other = (SspAdSlot) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMedia_id() == null ? other.getMedia_id() == null : this.getMedia_id().equals(other.getMedia_id()))
            && (this.getBussiness_type_one() == null ? other.getBussiness_type_one() == null : this.getBussiness_type_one().equals(other.getBussiness_type_one()))
            && (this.getSlot_type_id() == null ? other.getSlot_type_id() == null : this.getSlot_type_id().equals(other.getSlot_type_id()))
            && (this.getAd_template_id() == null ? other.getAd_template_id() == null : this.getAd_template_id().equals(other.getAd_template_id()))
            && (this.getAd_template_type() == null ? other.getAd_template_type() == null : this.getAd_template_type().equals(other.getAd_template_type()))
            && (this.getSlot_name() == null ? other.getSlot_name() == null : this.getSlot_name().equals(other.getSlot_name()))
            && (this.getSlot_status() == null ? other.getSlot_status() == null : this.getSlot_status().equals(other.getSlot_status()))
            && (this.getBusiness_status() == null ? other.getBusiness_status() == null : this.getBusiness_status().equals(other.getBusiness_status()))
            && (this.getCooperation_type() == null ? other.getCooperation_type() == null : this.getCooperation_type().equals(other.getCooperation_type()))
            && (this.getRender_type() == null ? other.getRender_type() == null : this.getRender_type().equals(other.getRender_type()))
            && (this.getWeb_linked() == null ? other.getWeb_linked() == null : this.getWeb_linked().equals(other.getWeb_linked()))
            && (this.getApplication_download() == null ? other.getApplication_download() == null : this.getApplication_download().equals(other.getApplication_download()))
            && (this.getAd_pull_mode() == null ? other.getAd_pull_mode() == null : this.getAd_pull_mode().equals(other.getAd_pull_mode()))
            && (this.getCp_price() == null ? other.getCp_price() == null : this.getCp_price().equals(other.getCp_price()))
            && (this.getRequet_rate() == null ? other.getRequet_rate() == null : this.getRequet_rate().equals(other.getRequet_rate()))
            && (this.getSlot_examine_status() == null ? other.getSlot_examine_status() == null : this.getSlot_examine_status().equals(other.getSlot_examine_status()))
            && (this.getCreate_time() == null ? other.getCreate_time() == null : this.getCreate_time().equals(other.getCreate_time()))
            && (this.getUpdate_time() == null ? other.getUpdate_time() == null : this.getUpdate_time().equals(other.getUpdate_time()))
            && (this.getIs_deleted() == null ? other.getIs_deleted() == null : this.getIs_deleted().equals(other.getIs_deleted()))
            && (this.getAd_type_received() == null ? other.getAd_type_received() == null : this.getAd_type_received().equals(other.getAd_type_received()))
            && (this.getSsp_id() == null ? other.getSsp_id() == null : this.getSsp_id().equals(other.getSsp_id()))
            && (this.getUser_id() == null ? other.getUser_id() == null : this.getUser_id().equals(other.getUser_id()))
            && (this.getBlock_keywords() == null ? other.getBlock_keywords() == null : this.getBlock_keywords().equals(other.getBlock_keywords()))
            && (this.getBlock_android_app() == null ? other.getBlock_android_app() == null : this.getBlock_android_app().equals(other.getBlock_android_app()))
            && (this.getBlock_ios_app() == null ? other.getBlock_ios_app() == null : this.getBlock_ios_app().equals(other.getBlock_ios_app()))
            && (this.getBlock_industry() == null ? other.getBlock_industry() == null : this.getBlock_industry().equals(other.getBlock_industry()))
            && (this.getSpecific() == null ? other.getSpecific() == null : this.getSpecific().equals(other.getSpecific()))
            && (this.getAwarding() == null ? other.getAwarding() == null : this.getAwarding().equals(other.getAwarding()))
            && (this.getCallback_url() == null ? other.getCallback_url() == null : this.getCallback_url().equals(other.getCallback_url()))
            && (this.getSecret_key() == null ? other.getSecret_key() == null : this.getSecret_key().equals(other.getSecret_key()))
            && (this.getAd_template_custom() == null ? other.getAd_template_custom() == null : this.getAd_template_custom().equals(other.getAd_template_custom()))
            && (this.getUpper_id() == null ? other.getUpper_id() == null : this.getUpper_id().equals(other.getUpper_id()))
            && (this.getUpper_slot() == null ? other.getUpper_slot() == null : this.getUpper_slot().equals(other.getUpper_slot()))
            && (this.getUpper_ecpm() == null ? other.getUpper_ecpm() == null : this.getUpper_ecpm().equals(other.getUpper_ecpm()))
            && (this.getDownstream_ecpm() == null ? other.getDownstream_ecpm() == null : this.getDownstream_ecpm().equals(other.getDownstream_ecpm()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMedia_id() == null) ? 0 : getMedia_id().hashCode());
        result = prime * result + ((getBussiness_type_one() == null) ? 0 : getBussiness_type_one().hashCode());
        result = prime * result + ((getSlot_type_id() == null) ? 0 : getSlot_type_id().hashCode());
        result = prime * result + ((getAd_template_id() == null) ? 0 : getAd_template_id().hashCode());
        result = prime * result + ((getAd_template_type() == null) ? 0 : getAd_template_type().hashCode());
        result = prime * result + ((getSlot_name() == null) ? 0 : getSlot_name().hashCode());
        result = prime * result + ((getSlot_status() == null) ? 0 : getSlot_status().hashCode());
        result = prime * result + ((getBusiness_status() == null) ? 0 : getBusiness_status().hashCode());
        result = prime * result + ((getCooperation_type() == null) ? 0 : getCooperation_type().hashCode());
        result = prime * result + ((getRender_type() == null) ? 0 : getRender_type().hashCode());
        result = prime * result + ((getWeb_linked() == null) ? 0 : getWeb_linked().hashCode());
        result = prime * result + ((getApplication_download() == null) ? 0 : getApplication_download().hashCode());
        result = prime * result + ((getAd_pull_mode() == null) ? 0 : getAd_pull_mode().hashCode());
        result = prime * result + ((getCp_price() == null) ? 0 : getCp_price().hashCode());
        result = prime * result + ((getRequet_rate() == null) ? 0 : getRequet_rate().hashCode());
        result = prime * result + ((getSlot_examine_status() == null) ? 0 : getSlot_examine_status().hashCode());
        result = prime * result + ((getCreate_time() == null) ? 0 : getCreate_time().hashCode());
        result = prime * result + ((getUpdate_time() == null) ? 0 : getUpdate_time().hashCode());
        result = prime * result + ((getIs_deleted() == null) ? 0 : getIs_deleted().hashCode());
        result = prime * result + ((getAd_type_received() == null) ? 0 : getAd_type_received().hashCode());
        result = prime * result + ((getSsp_id() == null) ? 0 : getSsp_id().hashCode());
        result = prime * result + ((getUser_id() == null) ? 0 : getUser_id().hashCode());
        result = prime * result + ((getBlock_keywords() == null) ? 0 : getBlock_keywords().hashCode());
        result = prime * result + ((getBlock_android_app() == null) ? 0 : getBlock_android_app().hashCode());
        result = prime * result + ((getBlock_ios_app() == null) ? 0 : getBlock_ios_app().hashCode());
        result = prime * result + ((getBlock_industry() == null) ? 0 : getBlock_industry().hashCode());
        result = prime * result + ((getSpecific() == null) ? 0 : getSpecific().hashCode());
        result = prime * result + ((getAwarding() == null) ? 0 : getAwarding().hashCode());
        result = prime * result + ((getCallback_url() == null) ? 0 : getCallback_url().hashCode());
        result = prime * result + ((getSecret_key() == null) ? 0 : getSecret_key().hashCode());
        result = prime * result + ((getAd_template_custom() == null) ? 0 : getAd_template_custom().hashCode());
        result = prime * result + ((getUpper_id() == null) ? 0 : getUpper_id().hashCode());
        result = prime * result + ((getUpper_slot() == null) ? 0 : getUpper_slot().hashCode());
        result = prime * result + ((getUpper_ecpm() == null) ? 0 : getUpper_ecpm().hashCode());
        result = prime * result + ((getDownstream_ecpm() == null) ? 0 : getDownstream_ecpm().hashCode());
        return result;
    }
}