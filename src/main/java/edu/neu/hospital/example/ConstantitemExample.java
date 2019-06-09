package edu.neu.hospital.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ConstantitemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public ConstantitemExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
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

        public Criteria andConstanttypeidIsNull() {
            addCriterion("constantTypeID is null");
            return (Criteria) this;
        }

        public Criteria andConstanttypeidIsNotNull() {
            addCriterion("constantTypeID is not null");
            return (Criteria) this;
        }

        public Criteria andConstanttypeidEqualTo(Integer value) {
            addCriterion("constantTypeID =", value, "constanttypeid");
            return (Criteria) this;
        }

        public Criteria andConstanttypeidNotEqualTo(Integer value) {
            addCriterion("constantTypeID <>", value, "constanttypeid");
            return (Criteria) this;
        }

        public Criteria andConstanttypeidGreaterThan(Integer value) {
            addCriterion("constantTypeID >", value, "constanttypeid");
            return (Criteria) this;
        }

        public Criteria andConstanttypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("constantTypeID >=", value, "constanttypeid");
            return (Criteria) this;
        }

        public Criteria andConstanttypeidLessThan(Integer value) {
            addCriterion("constantTypeID <", value, "constanttypeid");
            return (Criteria) this;
        }

        public Criteria andConstanttypeidLessThanOrEqualTo(Integer value) {
            addCriterion("constantTypeID <=", value, "constanttypeid");
            return (Criteria) this;
        }

        public Criteria andConstanttypeidIn(List<Integer> values) {
            addCriterion("constantTypeID in", values, "constanttypeid");
            return (Criteria) this;
        }

        public Criteria andConstanttypeidNotIn(List<Integer> values) {
            addCriterion("constantTypeID not in", values, "constanttypeid");
            return (Criteria) this;
        }

        public Criteria andConstanttypeidBetween(Integer value1, Integer value2) {
            addCriterion("constantTypeID between", value1, value2, "constanttypeid");
            return (Criteria) this;
        }

        public Criteria andConstanttypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("constantTypeID not between", value1, value2, "constanttypeid");
            return (Criteria) this;
        }

        public Criteria andConstantcodeIsNull() {
            addCriterion("constantCode is null");
            return (Criteria) this;
        }

        public Criteria andConstantcodeIsNotNull() {
            addCriterion("constantCode is not null");
            return (Criteria) this;
        }

        public Criteria andConstantcodeEqualTo(String value) {
            addCriterion("constantCode =", value, "constantcode");
            return (Criteria) this;
        }

        public Criteria andConstantcodeNotEqualTo(String value) {
            addCriterion("constantCode <>", value, "constantcode");
            return (Criteria) this;
        }

        public Criteria andConstantcodeGreaterThan(String value) {
            addCriterion("constantCode >", value, "constantcode");
            return (Criteria) this;
        }

        public Criteria andConstantcodeGreaterThanOrEqualTo(String value) {
            addCriterion("constantCode >=", value, "constantcode");
            return (Criteria) this;
        }

        public Criteria andConstantcodeLessThan(String value) {
            addCriterion("constantCode <", value, "constantcode");
            return (Criteria) this;
        }

        public Criteria andConstantcodeLessThanOrEqualTo(String value) {
            addCriterion("constantCode <=", value, "constantcode");
            return (Criteria) this;
        }

        public Criteria andConstantcodeLike(String value) {
            addCriterion("constantCode like", value, "constantcode");
            return (Criteria) this;
        }

        public Criteria andConstantcodeNotLike(String value) {
            addCriterion("constantCode not like", value, "constantcode");
            return (Criteria) this;
        }

        public Criteria andConstantcodeIn(List<String> values) {
            addCriterion("constantCode in", values, "constantcode");
            return (Criteria) this;
        }

        public Criteria andConstantcodeNotIn(List<String> values) {
            addCriterion("constantCode not in", values, "constantcode");
            return (Criteria) this;
        }

        public Criteria andConstantcodeBetween(String value1, String value2) {
            addCriterion("constantCode between", value1, value2, "constantcode");
            return (Criteria) this;
        }

        public Criteria andConstantcodeNotBetween(String value1, String value2) {
            addCriterion("constantCode not between", value1, value2, "constantcode");
            return (Criteria) this;
        }

        public Criteria andConstantnameIsNull() {
            addCriterion("constantName is null");
            return (Criteria) this;
        }

        public Criteria andConstantnameIsNotNull() {
            addCriterion("constantName is not null");
            return (Criteria) this;
        }

        public Criteria andConstantnameEqualTo(String value) {
            addCriterion("constantName =", value, "constantname");
            return (Criteria) this;
        }

        public Criteria andConstantnameNotEqualTo(String value) {
            addCriterion("constantName <>", value, "constantname");
            return (Criteria) this;
        }

        public Criteria andConstantnameGreaterThan(String value) {
            addCriterion("constantName >", value, "constantname");
            return (Criteria) this;
        }

        public Criteria andConstantnameGreaterThanOrEqualTo(String value) {
            addCriterion("constantName >=", value, "constantname");
            return (Criteria) this;
        }

        public Criteria andConstantnameLessThan(String value) {
            addCriterion("constantName <", value, "constantname");
            return (Criteria) this;
        }

        public Criteria andConstantnameLessThanOrEqualTo(String value) {
            addCriterion("constantName <=", value, "constantname");
            return (Criteria) this;
        }

        public Criteria andConstantnameLike(String value) {
            addCriterion("constantName like", value, "constantname");
            return (Criteria) this;
        }

        public Criteria andConstantnameNotLike(String value) {
            addCriterion("constantName not like", value, "constantname");
            return (Criteria) this;
        }

        public Criteria andConstantnameIn(List<String> values) {
            addCriterion("constantName in", values, "constantname");
            return (Criteria) this;
        }

        public Criteria andConstantnameNotIn(List<String> values) {
            addCriterion("constantName not in", values, "constantname");
            return (Criteria) this;
        }

        public Criteria andConstantnameBetween(String value1, String value2) {
            addCriterion("constantName between", value1, value2, "constantname");
            return (Criteria) this;
        }

        public Criteria andConstantnameNotBetween(String value1, String value2) {
            addCriterion("constantName not between", value1, value2, "constantname");
            return (Criteria) this;
        }

        public Criteria andAppeardateIsNull() {
            addCriterion("appearDate is null");
            return (Criteria) this;
        }

        public Criteria andAppeardateIsNotNull() {
            addCriterion("appearDate is not null");
            return (Criteria) this;
        }

        public Criteria andAppeardateEqualTo(Date value) {
            addCriterion("appearDate =", value, "appeardate");
            return (Criteria) this;
        }

        public Criteria andAppeardateNotEqualTo(Date value) {
            addCriterion("appearDate <>", value, "appeardate");
            return (Criteria) this;
        }

        public Criteria andAppeardateGreaterThan(Date value) {
            addCriterion("appearDate >", value, "appeardate");
            return (Criteria) this;
        }

        public Criteria andAppeardateGreaterThanOrEqualTo(Date value) {
            addCriterion("appearDate >=", value, "appeardate");
            return (Criteria) this;
        }

        public Criteria andAppeardateLessThan(Date value) {
            addCriterion("appearDate <", value, "appeardate");
            return (Criteria) this;
        }

        public Criteria andAppeardateLessThanOrEqualTo(Date value) {
            addCriterion("appearDate <=", value, "appeardate");
            return (Criteria) this;
        }

        public Criteria andAppeardateIn(List<Date> values) {
            addCriterion("appearDate in", values, "appeardate");
            return (Criteria) this;
        }

        public Criteria andAppeardateNotIn(List<Date> values) {
            addCriterion("appearDate not in", values, "appeardate");
            return (Criteria) this;
        }

        public Criteria andAppeardateBetween(Date value1, Date value2) {
            addCriterion("appearDate between", value1, value2, "appeardate");
            return (Criteria) this;
        }

        public Criteria andAppeardateNotBetween(Date value1, Date value2) {
            addCriterion("appearDate not between", value1, value2, "appeardate");
            return (Criteria) this;
        }

        public Criteria andApearuseridIsNull() {
            addCriterion("apearUserID is null");
            return (Criteria) this;
        }

        public Criteria andApearuseridIsNotNull() {
            addCriterion("apearUserID is not null");
            return (Criteria) this;
        }

        public Criteria andApearuseridEqualTo(Integer value) {
            addCriterion("apearUserID =", value, "apearuserid");
            return (Criteria) this;
        }

        public Criteria andApearuseridNotEqualTo(Integer value) {
            addCriterion("apearUserID <>", value, "apearuserid");
            return (Criteria) this;
        }

        public Criteria andApearuseridGreaterThan(Integer value) {
            addCriterion("apearUserID >", value, "apearuserid");
            return (Criteria) this;
        }

        public Criteria andApearuseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("apearUserID >=", value, "apearuserid");
            return (Criteria) this;
        }

        public Criteria andApearuseridLessThan(Integer value) {
            addCriterion("apearUserID <", value, "apearuserid");
            return (Criteria) this;
        }

        public Criteria andApearuseridLessThanOrEqualTo(Integer value) {
            addCriterion("apearUserID <=", value, "apearuserid");
            return (Criteria) this;
        }

        public Criteria andApearuseridIn(List<Integer> values) {
            addCriterion("apearUserID in", values, "apearuserid");
            return (Criteria) this;
        }

        public Criteria andApearuseridNotIn(List<Integer> values) {
            addCriterion("apearUserID not in", values, "apearuserid");
            return (Criteria) this;
        }

        public Criteria andApearuseridBetween(Integer value1, Integer value2) {
            addCriterion("apearUserID between", value1, value2, "apearuserid");
            return (Criteria) this;
        }

        public Criteria andApearuseridNotBetween(Integer value1, Integer value2) {
            addCriterion("apearUserID not between", value1, value2, "apearuserid");
            return (Criteria) this;
        }

        public Criteria andChangedateIsNull() {
            addCriterion("changeDate is null");
            return (Criteria) this;
        }

        public Criteria andChangedateIsNotNull() {
            addCriterion("changeDate is not null");
            return (Criteria) this;
        }

        public Criteria andChangedateEqualTo(Date value) {
            addCriterion("changeDate =", value, "changedate");
            return (Criteria) this;
        }

        public Criteria andChangedateNotEqualTo(Date value) {
            addCriterion("changeDate <>", value, "changedate");
            return (Criteria) this;
        }

        public Criteria andChangedateGreaterThan(Date value) {
            addCriterion("changeDate >", value, "changedate");
            return (Criteria) this;
        }

        public Criteria andChangedateGreaterThanOrEqualTo(Date value) {
            addCriterion("changeDate >=", value, "changedate");
            return (Criteria) this;
        }

        public Criteria andChangedateLessThan(Date value) {
            addCriterion("changeDate <", value, "changedate");
            return (Criteria) this;
        }

        public Criteria andChangedateLessThanOrEqualTo(Date value) {
            addCriterion("changeDate <=", value, "changedate");
            return (Criteria) this;
        }

        public Criteria andChangedateIn(List<Date> values) {
            addCriterion("changeDate in", values, "changedate");
            return (Criteria) this;
        }

        public Criteria andChangedateNotIn(List<Date> values) {
            addCriterion("changeDate not in", values, "changedate");
            return (Criteria) this;
        }

        public Criteria andChangedateBetween(Date value1, Date value2) {
            addCriterion("changeDate between", value1, value2, "changedate");
            return (Criteria) this;
        }

        public Criteria andChangedateNotBetween(Date value1, Date value2) {
            addCriterion("changeDate not between", value1, value2, "changedate");
            return (Criteria) this;
        }

        public Criteria andChangeuseridIsNull() {
            addCriterion("changeUserID is null");
            return (Criteria) this;
        }

        public Criteria andChangeuseridIsNotNull() {
            addCriterion("changeUserID is not null");
            return (Criteria) this;
        }

        public Criteria andChangeuseridEqualTo(Integer value) {
            addCriterion("changeUserID =", value, "changeuserid");
            return (Criteria) this;
        }

        public Criteria andChangeuseridNotEqualTo(Integer value) {
            addCriterion("changeUserID <>", value, "changeuserid");
            return (Criteria) this;
        }

        public Criteria andChangeuseridGreaterThan(Integer value) {
            addCriterion("changeUserID >", value, "changeuserid");
            return (Criteria) this;
        }

        public Criteria andChangeuseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("changeUserID >=", value, "changeuserid");
            return (Criteria) this;
        }

        public Criteria andChangeuseridLessThan(Integer value) {
            addCriterion("changeUserID <", value, "changeuserid");
            return (Criteria) this;
        }

        public Criteria andChangeuseridLessThanOrEqualTo(Integer value) {
            addCriterion("changeUserID <=", value, "changeuserid");
            return (Criteria) this;
        }

        public Criteria andChangeuseridIn(List<Integer> values) {
            addCriterion("changeUserID in", values, "changeuserid");
            return (Criteria) this;
        }

        public Criteria andChangeuseridNotIn(List<Integer> values) {
            addCriterion("changeUserID not in", values, "changeuserid");
            return (Criteria) this;
        }

        public Criteria andChangeuseridBetween(Integer value1, Integer value2) {
            addCriterion("changeUserID between", value1, value2, "changeuserid");
            return (Criteria) this;
        }

        public Criteria andChangeuseridNotBetween(Integer value1, Integer value2) {
            addCriterion("changeUserID not between", value1, value2, "changeuserid");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("`status` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("`status` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("`status` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("`status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("`status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("`status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("`status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("`status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("`status` like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("`status` not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("`status` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("`status` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("`status` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("`status` not between", value1, value2, "status");
            return (Criteria) this;
        }
    }

    /**
     */
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