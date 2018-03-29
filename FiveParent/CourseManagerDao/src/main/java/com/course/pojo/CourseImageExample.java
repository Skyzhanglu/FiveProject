package com.course.pojo;

import java.util.ArrayList;
import java.util.List;

public class CourseImageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseImageExample() {
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

        public Criteria andCimageIdIsNull() {
            addCriterion("cimage_id is null");
            return (Criteria) this;
        }

        public Criteria andCimageIdIsNotNull() {
            addCriterion("cimage_id is not null");
            return (Criteria) this;
        }

        public Criteria andCimageIdEqualTo(Long value) {
            addCriterion("cimage_id =", value, "cimageId");
            return (Criteria) this;
        }

        public Criteria andCimageIdNotEqualTo(Long value) {
            addCriterion("cimage_id <>", value, "cimageId");
            return (Criteria) this;
        }

        public Criteria andCimageIdGreaterThan(Long value) {
            addCriterion("cimage_id >", value, "cimageId");
            return (Criteria) this;
        }

        public Criteria andCimageIdGreaterThanOrEqualTo(Long value) {
            addCriterion("cimage_id >=", value, "cimageId");
            return (Criteria) this;
        }

        public Criteria andCimageIdLessThan(Long value) {
            addCriterion("cimage_id <", value, "cimageId");
            return (Criteria) this;
        }

        public Criteria andCimageIdLessThanOrEqualTo(Long value) {
            addCriterion("cimage_id <=", value, "cimageId");
            return (Criteria) this;
        }

        public Criteria andCimageIdIn(List<Long> values) {
            addCriterion("cimage_id in", values, "cimageId");
            return (Criteria) this;
        }

        public Criteria andCimageIdNotIn(List<Long> values) {
            addCriterion("cimage_id not in", values, "cimageId");
            return (Criteria) this;
        }

        public Criteria andCimageIdBetween(Long value1, Long value2) {
            addCriterion("cimage_id between", value1, value2, "cimageId");
            return (Criteria) this;
        }

        public Criteria andCimageIdNotBetween(Long value1, Long value2) {
            addCriterion("cimage_id not between", value1, value2, "cimageId");
            return (Criteria) this;
        }

        public Criteria andCimageUrlIsNull() {
            addCriterion("cimage_url is null");
            return (Criteria) this;
        }

        public Criteria andCimageUrlIsNotNull() {
            addCriterion("cimage_url is not null");
            return (Criteria) this;
        }

        public Criteria andCimageUrlEqualTo(String value) {
            addCriterion("cimage_url =", value, "cimageUrl");
            return (Criteria) this;
        }

        public Criteria andCimageUrlNotEqualTo(String value) {
            addCriterion("cimage_url <>", value, "cimageUrl");
            return (Criteria) this;
        }

        public Criteria andCimageUrlGreaterThan(String value) {
            addCriterion("cimage_url >", value, "cimageUrl");
            return (Criteria) this;
        }

        public Criteria andCimageUrlGreaterThanOrEqualTo(String value) {
            addCriterion("cimage_url >=", value, "cimageUrl");
            return (Criteria) this;
        }

        public Criteria andCimageUrlLessThan(String value) {
            addCriterion("cimage_url <", value, "cimageUrl");
            return (Criteria) this;
        }

        public Criteria andCimageUrlLessThanOrEqualTo(String value) {
            addCriterion("cimage_url <=", value, "cimageUrl");
            return (Criteria) this;
        }

        public Criteria andCimageUrlLike(String value) {
            addCriterion("cimage_url like", value, "cimageUrl");
            return (Criteria) this;
        }

        public Criteria andCimageUrlNotLike(String value) {
            addCriterion("cimage_url not like", value, "cimageUrl");
            return (Criteria) this;
        }

        public Criteria andCimageUrlIn(List<String> values) {
            addCriterion("cimage_url in", values, "cimageUrl");
            return (Criteria) this;
        }

        public Criteria andCimageUrlNotIn(List<String> values) {
            addCriterion("cimage_url not in", values, "cimageUrl");
            return (Criteria) this;
        }

        public Criteria andCimageUrlBetween(String value1, String value2) {
            addCriterion("cimage_url between", value1, value2, "cimageUrl");
            return (Criteria) this;
        }

        public Criteria andCimageUrlNotBetween(String value1, String value2) {
            addCriterion("cimage_url not between", value1, value2, "cimageUrl");
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