package com.mk.ad.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SspShieldingRulesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SspShieldingRulesExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUser_idIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUser_idIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUser_idEqualTo(String value) {
            addCriterion("user_id =", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotEqualTo(String value) {
            addCriterion("user_id <>", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idGreaterThan(String value) {
            addCriterion("user_id >", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idLessThan(String value) {
            addCriterion("user_id <", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idLike(String value) {
            addCriterion("user_id like", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotLike(String value) {
            addCriterion("user_id not like", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idIn(List<String> values) {
            addCriterion("user_id in", values, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotIn(List<String> values) {
            addCriterion("user_id not in", values, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "user_id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("`name` is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("`name` is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("`name` =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("`name` <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("`name` >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("`name` >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("`name` <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("`name` <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("`name` like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("`name` not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("`name` in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("`name` not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("`name` between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("`name` not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andClassificationIsNull() {
            addCriterion("classification is null");
            return (Criteria) this;
        }

        public Criteria andClassificationIsNotNull() {
            addCriterion("classification is not null");
            return (Criteria) this;
        }

        public Criteria andClassificationEqualTo(String value) {
            addCriterion("classification =", value, "classification");
            return (Criteria) this;
        }

        public Criteria andClassificationNotEqualTo(String value) {
            addCriterion("classification <>", value, "classification");
            return (Criteria) this;
        }

        public Criteria andClassificationGreaterThan(String value) {
            addCriterion("classification >", value, "classification");
            return (Criteria) this;
        }

        public Criteria andClassificationGreaterThanOrEqualTo(String value) {
            addCriterion("classification >=", value, "classification");
            return (Criteria) this;
        }

        public Criteria andClassificationLessThan(String value) {
            addCriterion("classification <", value, "classification");
            return (Criteria) this;
        }

        public Criteria andClassificationLessThanOrEqualTo(String value) {
            addCriterion("classification <=", value, "classification");
            return (Criteria) this;
        }

        public Criteria andClassificationLike(String value) {
            addCriterion("classification like", value, "classification");
            return (Criteria) this;
        }

        public Criteria andClassificationNotLike(String value) {
            addCriterion("classification not like", value, "classification");
            return (Criteria) this;
        }

        public Criteria andClassificationIn(List<String> values) {
            addCriterion("classification in", values, "classification");
            return (Criteria) this;
        }

        public Criteria andClassificationNotIn(List<String> values) {
            addCriterion("classification not in", values, "classification");
            return (Criteria) this;
        }

        public Criteria andClassificationBetween(String value1, String value2) {
            addCriterion("classification between", value1, value2, "classification");
            return (Criteria) this;
        }

        public Criteria andClassificationNotBetween(String value1, String value2) {
            addCriterion("classification not between", value1, value2, "classification");
            return (Criteria) this;
        }

        public Criteria andKey_wordIsNull() {
            addCriterion("key_word is null");
            return (Criteria) this;
        }

        public Criteria andKey_wordIsNotNull() {
            addCriterion("key_word is not null");
            return (Criteria) this;
        }

        public Criteria andKey_wordEqualTo(String value) {
            addCriterion("key_word =", value, "key_word");
            return (Criteria) this;
        }

        public Criteria andKey_wordNotEqualTo(String value) {
            addCriterion("key_word <>", value, "key_word");
            return (Criteria) this;
        }

        public Criteria andKey_wordGreaterThan(String value) {
            addCriterion("key_word >", value, "key_word");
            return (Criteria) this;
        }

        public Criteria andKey_wordGreaterThanOrEqualTo(String value) {
            addCriterion("key_word >=", value, "key_word");
            return (Criteria) this;
        }

        public Criteria andKey_wordLessThan(String value) {
            addCriterion("key_word <", value, "key_word");
            return (Criteria) this;
        }

        public Criteria andKey_wordLessThanOrEqualTo(String value) {
            addCriterion("key_word <=", value, "key_word");
            return (Criteria) this;
        }

        public Criteria andKey_wordLike(String value) {
            addCriterion("key_word like", value, "key_word");
            return (Criteria) this;
        }

        public Criteria andKey_wordNotLike(String value) {
            addCriterion("key_word not like", value, "key_word");
            return (Criteria) this;
        }

        public Criteria andKey_wordIn(List<String> values) {
            addCriterion("key_word in", values, "key_word");
            return (Criteria) this;
        }

        public Criteria andKey_wordNotIn(List<String> values) {
            addCriterion("key_word not in", values, "key_word");
            return (Criteria) this;
        }

        public Criteria andKey_wordBetween(String value1, String value2) {
            addCriterion("key_word between", value1, value2, "key_word");
            return (Criteria) this;
        }

        public Criteria andKey_wordNotBetween(String value1, String value2) {
            addCriterion("key_word not between", value1, value2, "key_word");
            return (Criteria) this;
        }

        public Criteria andIos_packageIsNull() {
            addCriterion("ios_package is null");
            return (Criteria) this;
        }

        public Criteria andIos_packageIsNotNull() {
            addCriterion("ios_package is not null");
            return (Criteria) this;
        }

        public Criteria andIos_packageEqualTo(String value) {
            addCriterion("ios_package =", value, "ios_package");
            return (Criteria) this;
        }

        public Criteria andIos_packageNotEqualTo(String value) {
            addCriterion("ios_package <>", value, "ios_package");
            return (Criteria) this;
        }

        public Criteria andIos_packageGreaterThan(String value) {
            addCriterion("ios_package >", value, "ios_package");
            return (Criteria) this;
        }

        public Criteria andIos_packageGreaterThanOrEqualTo(String value) {
            addCriterion("ios_package >=", value, "ios_package");
            return (Criteria) this;
        }

        public Criteria andIos_packageLessThan(String value) {
            addCriterion("ios_package <", value, "ios_package");
            return (Criteria) this;
        }

        public Criteria andIos_packageLessThanOrEqualTo(String value) {
            addCriterion("ios_package <=", value, "ios_package");
            return (Criteria) this;
        }

        public Criteria andIos_packageLike(String value) {
            addCriterion("ios_package like", value, "ios_package");
            return (Criteria) this;
        }

        public Criteria andIos_packageNotLike(String value) {
            addCriterion("ios_package not like", value, "ios_package");
            return (Criteria) this;
        }

        public Criteria andIos_packageIn(List<String> values) {
            addCriterion("ios_package in", values, "ios_package");
            return (Criteria) this;
        }

        public Criteria andIos_packageNotIn(List<String> values) {
            addCriterion("ios_package not in", values, "ios_package");
            return (Criteria) this;
        }

        public Criteria andIos_packageBetween(String value1, String value2) {
            addCriterion("ios_package between", value1, value2, "ios_package");
            return (Criteria) this;
        }

        public Criteria andIos_packageNotBetween(String value1, String value2) {
            addCriterion("ios_package not between", value1, value2, "ios_package");
            return (Criteria) this;
        }

        public Criteria andAndroid_packageIsNull() {
            addCriterion("android_package is null");
            return (Criteria) this;
        }

        public Criteria andAndroid_packageIsNotNull() {
            addCriterion("android_package is not null");
            return (Criteria) this;
        }

        public Criteria andAndroid_packageEqualTo(String value) {
            addCriterion("android_package =", value, "android_package");
            return (Criteria) this;
        }

        public Criteria andAndroid_packageNotEqualTo(String value) {
            addCriterion("android_package <>", value, "android_package");
            return (Criteria) this;
        }

        public Criteria andAndroid_packageGreaterThan(String value) {
            addCriterion("android_package >", value, "android_package");
            return (Criteria) this;
        }

        public Criteria andAndroid_packageGreaterThanOrEqualTo(String value) {
            addCriterion("android_package >=", value, "android_package");
            return (Criteria) this;
        }

        public Criteria andAndroid_packageLessThan(String value) {
            addCriterion("android_package <", value, "android_package");
            return (Criteria) this;
        }

        public Criteria andAndroid_packageLessThanOrEqualTo(String value) {
            addCriterion("android_package <=", value, "android_package");
            return (Criteria) this;
        }

        public Criteria andAndroid_packageLike(String value) {
            addCriterion("android_package like", value, "android_package");
            return (Criteria) this;
        }

        public Criteria andAndroid_packageNotLike(String value) {
            addCriterion("android_package not like", value, "android_package");
            return (Criteria) this;
        }

        public Criteria andAndroid_packageIn(List<String> values) {
            addCriterion("android_package in", values, "android_package");
            return (Criteria) this;
        }

        public Criteria andAndroid_packageNotIn(List<String> values) {
            addCriterion("android_package not in", values, "android_package");
            return (Criteria) this;
        }

        public Criteria andAndroid_packageBetween(String value1, String value2) {
            addCriterion("android_package between", value1, value2, "android_package");
            return (Criteria) this;
        }

        public Criteria andAndroid_packageNotBetween(String value1, String value2) {
            addCriterion("android_package not between", value1, value2, "android_package");
            return (Criteria) this;
        }

        public Criteria andRelated_mediaIsNull() {
            addCriterion("related_media is null");
            return (Criteria) this;
        }

        public Criteria andRelated_mediaIsNotNull() {
            addCriterion("related_media is not null");
            return (Criteria) this;
        }

        public Criteria andRelated_mediaEqualTo(String value) {
            addCriterion("related_media =", value, "related_media");
            return (Criteria) this;
        }

        public Criteria andRelated_mediaNotEqualTo(String value) {
            addCriterion("related_media <>", value, "related_media");
            return (Criteria) this;
        }

        public Criteria andRelated_mediaGreaterThan(String value) {
            addCriterion("related_media >", value, "related_media");
            return (Criteria) this;
        }

        public Criteria andRelated_mediaGreaterThanOrEqualTo(String value) {
            addCriterion("related_media >=", value, "related_media");
            return (Criteria) this;
        }

        public Criteria andRelated_mediaLessThan(String value) {
            addCriterion("related_media <", value, "related_media");
            return (Criteria) this;
        }

        public Criteria andRelated_mediaLessThanOrEqualTo(String value) {
            addCriterion("related_media <=", value, "related_media");
            return (Criteria) this;
        }

        public Criteria andRelated_mediaLike(String value) {
            addCriterion("related_media like", value, "related_media");
            return (Criteria) this;
        }

        public Criteria andRelated_mediaNotLike(String value) {
            addCriterion("related_media not like", value, "related_media");
            return (Criteria) this;
        }

        public Criteria andRelated_mediaIn(List<String> values) {
            addCriterion("related_media in", values, "related_media");
            return (Criteria) this;
        }

        public Criteria andRelated_mediaNotIn(List<String> values) {
            addCriterion("related_media not in", values, "related_media");
            return (Criteria) this;
        }

        public Criteria andRelated_mediaBetween(String value1, String value2) {
            addCriterion("related_media between", value1, value2, "related_media");
            return (Criteria) this;
        }

        public Criteria andRelated_mediaNotBetween(String value1, String value2) {
            addCriterion("related_media not between", value1, value2, "related_media");
            return (Criteria) this;
        }

        public Criteria andRelated_advertisingIsNull() {
            addCriterion("related_advertising is null");
            return (Criteria) this;
        }

        public Criteria andRelated_advertisingIsNotNull() {
            addCriterion("related_advertising is not null");
            return (Criteria) this;
        }

        public Criteria andRelated_advertisingEqualTo(String value) {
            addCriterion("related_advertising =", value, "related_advertising");
            return (Criteria) this;
        }

        public Criteria andRelated_advertisingNotEqualTo(String value) {
            addCriterion("related_advertising <>", value, "related_advertising");
            return (Criteria) this;
        }

        public Criteria andRelated_advertisingGreaterThan(String value) {
            addCriterion("related_advertising >", value, "related_advertising");
            return (Criteria) this;
        }

        public Criteria andRelated_advertisingGreaterThanOrEqualTo(String value) {
            addCriterion("related_advertising >=", value, "related_advertising");
            return (Criteria) this;
        }

        public Criteria andRelated_advertisingLessThan(String value) {
            addCriterion("related_advertising <", value, "related_advertising");
            return (Criteria) this;
        }

        public Criteria andRelated_advertisingLessThanOrEqualTo(String value) {
            addCriterion("related_advertising <=", value, "related_advertising");
            return (Criteria) this;
        }

        public Criteria andRelated_advertisingLike(String value) {
            addCriterion("related_advertising like", value, "related_advertising");
            return (Criteria) this;
        }

        public Criteria andRelated_advertisingNotLike(String value) {
            addCriterion("related_advertising not like", value, "related_advertising");
            return (Criteria) this;
        }

        public Criteria andRelated_advertisingIn(List<String> values) {
            addCriterion("related_advertising in", values, "related_advertising");
            return (Criteria) this;
        }

        public Criteria andRelated_advertisingNotIn(List<String> values) {
            addCriterion("related_advertising not in", values, "related_advertising");
            return (Criteria) this;
        }

        public Criteria andRelated_advertisingBetween(String value1, String value2) {
            addCriterion("related_advertising between", value1, value2, "related_advertising");
            return (Criteria) this;
        }

        public Criteria andRelated_advertisingNotBetween(String value1, String value2) {
            addCriterion("related_advertising not between", value1, value2, "related_advertising");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreate_timeEqualTo(Date value) {
            addCriterion("create_time =", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThan(Date value) {
            addCriterion("create_time >", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThan(Date value) {
            addCriterion("create_time <", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIn(List<Date> values) {
            addCriterion("create_time in", values, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "create_time");
            return (Criteria) this;
        }

        public Criteria andIs_deleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIs_deleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIs_deleteEqualTo(Integer value) {
            addCriterion("is_delete =", value, "is_delete");
            return (Criteria) this;
        }

        public Criteria andIs_deleteNotEqualTo(Integer value) {
            addCriterion("is_delete <>", value, "is_delete");
            return (Criteria) this;
        }

        public Criteria andIs_deleteGreaterThan(Integer value) {
            addCriterion("is_delete >", value, "is_delete");
            return (Criteria) this;
        }

        public Criteria andIs_deleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_delete >=", value, "is_delete");
            return (Criteria) this;
        }

        public Criteria andIs_deleteLessThan(Integer value) {
            addCriterion("is_delete <", value, "is_delete");
            return (Criteria) this;
        }

        public Criteria andIs_deleteLessThanOrEqualTo(Integer value) {
            addCriterion("is_delete <=", value, "is_delete");
            return (Criteria) this;
        }

        public Criteria andIs_deleteIn(List<Integer> values) {
            addCriterion("is_delete in", values, "is_delete");
            return (Criteria) this;
        }

        public Criteria andIs_deleteNotIn(List<Integer> values) {
            addCriterion("is_delete not in", values, "is_delete");
            return (Criteria) this;
        }

        public Criteria andIs_deleteBetween(Integer value1, Integer value2) {
            addCriterion("is_delete between", value1, value2, "is_delete");
            return (Criteria) this;
        }

        public Criteria andIs_deleteNotBetween(Integer value1, Integer value2) {
            addCriterion("is_delete not between", value1, value2, "is_delete");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}