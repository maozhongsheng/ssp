package com.mk.ad.vo;

import java.util.ArrayList;
import java.util.List;

public class DataAppStoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DataAppStoreExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andStore_nameIsNull() {
            addCriterion("store_name is null");
            return (Criteria) this;
        }

        public Criteria andStore_nameIsNotNull() {
            addCriterion("store_name is not null");
            return (Criteria) this;
        }

        public Criteria andStore_nameEqualTo(String value) {
            addCriterion("store_name =", value, "store_name");
            return (Criteria) this;
        }

        public Criteria andStore_nameNotEqualTo(String value) {
            addCriterion("store_name <>", value, "store_name");
            return (Criteria) this;
        }

        public Criteria andStore_nameGreaterThan(String value) {
            addCriterion("store_name >", value, "store_name");
            return (Criteria) this;
        }

        public Criteria andStore_nameGreaterThanOrEqualTo(String value) {
            addCriterion("store_name >=", value, "store_name");
            return (Criteria) this;
        }

        public Criteria andStore_nameLessThan(String value) {
            addCriterion("store_name <", value, "store_name");
            return (Criteria) this;
        }

        public Criteria andStore_nameLessThanOrEqualTo(String value) {
            addCriterion("store_name <=", value, "store_name");
            return (Criteria) this;
        }

        public Criteria andStore_nameLike(String value) {
            addCriterion("store_name like", value, "store_name");
            return (Criteria) this;
        }

        public Criteria andStore_nameNotLike(String value) {
            addCriterion("store_name not like", value, "store_name");
            return (Criteria) this;
        }

        public Criteria andStore_nameIn(List<String> values) {
            addCriterion("store_name in", values, "store_name");
            return (Criteria) this;
        }

        public Criteria andStore_nameNotIn(List<String> values) {
            addCriterion("store_name not in", values, "store_name");
            return (Criteria) this;
        }

        public Criteria andStore_nameBetween(String value1, String value2) {
            addCriterion("store_name between", value1, value2, "store_name");
            return (Criteria) this;
        }

        public Criteria andStore_nameNotBetween(String value1, String value2) {
            addCriterion("store_name not between", value1, value2, "store_name");
            return (Criteria) this;
        }

        public Criteria andPlatform_typeIsNull() {
            addCriterion("platform_type is null");
            return (Criteria) this;
        }

        public Criteria andPlatform_typeIsNotNull() {
            addCriterion("platform_type is not null");
            return (Criteria) this;
        }

        public Criteria andPlatform_typeEqualTo(Integer value) {
            addCriterion("platform_type =", value, "platform_type");
            return (Criteria) this;
        }

        public Criteria andPlatform_typeNotEqualTo(Integer value) {
            addCriterion("platform_type <>", value, "platform_type");
            return (Criteria) this;
        }

        public Criteria andPlatform_typeGreaterThan(Integer value) {
            addCriterion("platform_type >", value, "platform_type");
            return (Criteria) this;
        }

        public Criteria andPlatform_typeGreaterThanOrEqualTo(Integer value) {
            addCriterion("platform_type >=", value, "platform_type");
            return (Criteria) this;
        }

        public Criteria andPlatform_typeLessThan(Integer value) {
            addCriterion("platform_type <", value, "platform_type");
            return (Criteria) this;
        }

        public Criteria andPlatform_typeLessThanOrEqualTo(Integer value) {
            addCriterion("platform_type <=", value, "platform_type");
            return (Criteria) this;
        }

        public Criteria andPlatform_typeIn(List<Integer> values) {
            addCriterion("platform_type in", values, "platform_type");
            return (Criteria) this;
        }

        public Criteria andPlatform_typeNotIn(List<Integer> values) {
            addCriterion("platform_type not in", values, "platform_type");
            return (Criteria) this;
        }

        public Criteria andPlatform_typeBetween(Integer value1, Integer value2) {
            addCriterion("platform_type between", value1, value2, "platform_type");
            return (Criteria) this;
        }

        public Criteria andPlatform_typeNotBetween(Integer value1, Integer value2) {
            addCriterion("platform_type not between", value1, value2, "platform_type");
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