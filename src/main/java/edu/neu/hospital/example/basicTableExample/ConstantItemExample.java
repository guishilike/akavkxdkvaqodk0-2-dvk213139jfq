package edu.neu.hospital.example.basicTableExample;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ConstantItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public ConstantItemExample() {
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

        public Criteria andConstantTypeIDIsNull() {
            addCriterion("constantTypeID is null");
            return (Criteria) this;
        }

        public Criteria andConstantTypeIDIsNotNull() {
            addCriterion("constantTypeID is not null");
            return (Criteria) this;
        }

        public Criteria andConstantTypeIDEqualTo(Integer value) {
            addCriterion("constantTypeID =", value, "constantTypeID");
            return (Criteria) this;
        }

        public Criteria andConstantTypeIDNotEqualTo(Integer value) {
            addCriterion("constantTypeID <>", value, "constantTypeID");
            return (Criteria) this;
        }

        public Criteria andConstantTypeIDGreaterThan(Integer value) {
            addCriterion("constantTypeID >", value, "constantTypeID");
            return (Criteria) this;
        }

        public Criteria andConstantTypeIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("constantTypeID >=", value, "constantTypeID");
            return (Criteria) this;
        }

        public Criteria andConstantTypeIDLessThan(Integer value) {
            addCriterion("constantTypeID <", value, "constantTypeID");
            return (Criteria) this;
        }

        public Criteria andConstantTypeIDLessThanOrEqualTo(Integer value) {
            addCriterion("constantTypeID <=", value, "constantTypeID");
            return (Criteria) this;
        }

        public Criteria andConstantTypeIDIn(List<Integer> values) {
            addCriterion("constantTypeID in", values, "constantTypeID");
            return (Criteria) this;
        }

        public Criteria andConstantTypeIDNotIn(List<Integer> values) {
            addCriterion("constantTypeID not in", values, "constantTypeID");
            return (Criteria) this;
        }

        public Criteria andConstantTypeIDBetween(Integer value1, Integer value2) {
            addCriterion("constantTypeID between", value1, value2, "constantTypeID");
            return (Criteria) this;
        }

        public Criteria andConstantTypeIDNotBetween(Integer value1, Integer value2) {
            addCriterion("constantTypeID not between", value1, value2, "constantTypeID");
            return (Criteria) this;
        }

        public Criteria andConstantCodeIsNull() {
            addCriterion("constantCode is null");
            return (Criteria) this;
        }

        public Criteria andConstantCodeIsNotNull() {
            addCriterion("constantCode is not null");
            return (Criteria) this;
        }

        public Criteria andConstantCodeEqualTo(String value) {
            addCriterion("constantCode =", value, "constantCode");
            return (Criteria) this;
        }

        public Criteria andConstantCodeNotEqualTo(String value) {
            addCriterion("constantCode <>", value, "constantCode");
            return (Criteria) this;
        }

        public Criteria andConstantCodeGreaterThan(String value) {
            addCriterion("constantCode >", value, "constantCode");
            return (Criteria) this;
        }

        public Criteria andConstantCodeGreaterThanOrEqualTo(String value) {
            addCriterion("constantCode >=", value, "constantCode");
            return (Criteria) this;
        }

        public Criteria andConstantCodeLessThan(String value) {
            addCriterion("constantCode <", value, "constantCode");
            return (Criteria) this;
        }

        public Criteria andConstantCodeLessThanOrEqualTo(String value) {
            addCriterion("constantCode <=", value, "constantCode");
            return (Criteria) this;
        }

        public Criteria andConstantCodeLike(String value) {
            addCriterion("constantCode like", value, "constantCode");
            return (Criteria) this;
        }

        public Criteria andConstantCodeNotLike(String value) {
            addCriterion("constantCode not like", value, "constantCode");
            return (Criteria) this;
        }

        public Criteria andConstantCodeIn(List<String> values) {
            addCriterion("constantCode in", values, "constantCode");
            return (Criteria) this;
        }

        public Criteria andConstantCodeNotIn(List<String> values) {
            addCriterion("constantCode not in", values, "constantCode");
            return (Criteria) this;
        }

        public Criteria andConstantCodeBetween(String value1, String value2) {
            addCriterion("constantCode between", value1, value2, "constantCode");
            return (Criteria) this;
        }

        public Criteria andConstantCodeNotBetween(String value1, String value2) {
            addCriterion("constantCode not between", value1, value2, "constantCode");
            return (Criteria) this;
        }

        public Criteria andConstantNameIsNull() {
            addCriterion("constantName is null");
            return (Criteria) this;
        }

        public Criteria andConstantNameIsNotNull() {
            addCriterion("constantName is not null");
            return (Criteria) this;
        }

        public Criteria andConstantNameEqualTo(String value) {
            addCriterion("constantName =", value, "constantName");
            return (Criteria) this;
        }

        public Criteria andConstantNameNotEqualTo(String value) {
            addCriterion("constantName <>", value, "constantName");
            return (Criteria) this;
        }

        public Criteria andConstantNameGreaterThan(String value) {
            addCriterion("constantName >", value, "constantName");
            return (Criteria) this;
        }

        public Criteria andConstantNameGreaterThanOrEqualTo(String value) {
            addCriterion("constantName >=", value, "constantName");
            return (Criteria) this;
        }

        public Criteria andConstantNameLessThan(String value) {
            addCriterion("constantName <", value, "constantName");
            return (Criteria) this;
        }

        public Criteria andConstantNameLessThanOrEqualTo(String value) {
            addCriterion("constantName <=", value, "constantName");
            return (Criteria) this;
        }

        public Criteria andConstantNameLike(String value) {
            addCriterion("constantName like", value, "constantName");
            return (Criteria) this;
        }

        public Criteria andConstantNameNotLike(String value) {
            addCriterion("constantName not like", value, "constantName");
            return (Criteria) this;
        }

        public Criteria andConstantNameIn(List<String> values) {
            addCriterion("constantName in", values, "constantName");
            return (Criteria) this;
        }

        public Criteria andConstantNameNotIn(List<String> values) {
            addCriterion("constantName not in", values, "constantName");
            return (Criteria) this;
        }

        public Criteria andConstantNameBetween(String value1, String value2) {
            addCriterion("constantName between", value1, value2, "constantName");
            return (Criteria) this;
        }

        public Criteria andConstantNameNotBetween(String value1, String value2) {
            addCriterion("constantName not between", value1, value2, "constantName");
            return (Criteria) this;
        }

        public Criteria andAppearDateIsNull() {
            addCriterion("appearDate is null");
            return (Criteria) this;
        }

        public Criteria andAppearDateIsNotNull() {
            addCriterion("appearDate is not null");
            return (Criteria) this;
        }

        public Criteria andAppearDateEqualTo(Date value) {
            addCriterion("appearDate =", value, "appearDate");
            return (Criteria) this;
        }

        public Criteria andAppearDateNotEqualTo(Date value) {
            addCriterion("appearDate <>", value, "appearDate");
            return (Criteria) this;
        }

        public Criteria andAppearDateGreaterThan(Date value) {
            addCriterion("appearDate >", value, "appearDate");
            return (Criteria) this;
        }

        public Criteria andAppearDateGreaterThanOrEqualTo(Date value) {
            addCriterion("appearDate >=", value, "appearDate");
            return (Criteria) this;
        }

        public Criteria andAppearDateLessThan(Date value) {
            addCriterion("appearDate <", value, "appearDate");
            return (Criteria) this;
        }

        public Criteria andAppearDateLessThanOrEqualTo(Date value) {
            addCriterion("appearDate <=", value, "appearDate");
            return (Criteria) this;
        }

        public Criteria andAppearDateIn(List<Date> values) {
            addCriterion("appearDate in", values, "appearDate");
            return (Criteria) this;
        }

        public Criteria andAppearDateNotIn(List<Date> values) {
            addCriterion("appearDate not in", values, "appearDate");
            return (Criteria) this;
        }

        public Criteria andAppearDateBetween(Date value1, Date value2) {
            addCriterion("appearDate between", value1, value2, "appearDate");
            return (Criteria) this;
        }

        public Criteria andAppearDateNotBetween(Date value1, Date value2) {
            addCriterion("appearDate not between", value1, value2, "appearDate");
            return (Criteria) this;
        }

        public Criteria andApearUserIDIsNull() {
            addCriterion("apearUserID is null");
            return (Criteria) this;
        }

        public Criteria andApearUserIDIsNotNull() {
            addCriterion("apearUserID is not null");
            return (Criteria) this;
        }

        public Criteria andApearUserIDEqualTo(Integer value) {
            addCriterion("apearUserID =", value, "apearUserID");
            return (Criteria) this;
        }

        public Criteria andApearUserIDNotEqualTo(Integer value) {
            addCriterion("apearUserID <>", value, "apearUserID");
            return (Criteria) this;
        }

        public Criteria andApearUserIDGreaterThan(Integer value) {
            addCriterion("apearUserID >", value, "apearUserID");
            return (Criteria) this;
        }

        public Criteria andApearUserIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("apearUserID >=", value, "apearUserID");
            return (Criteria) this;
        }

        public Criteria andApearUserIDLessThan(Integer value) {
            addCriterion("apearUserID <", value, "apearUserID");
            return (Criteria) this;
        }

        public Criteria andApearUserIDLessThanOrEqualTo(Integer value) {
            addCriterion("apearUserID <=", value, "apearUserID");
            return (Criteria) this;
        }

        public Criteria andApearUserIDIn(List<Integer> values) {
            addCriterion("apearUserID in", values, "apearUserID");
            return (Criteria) this;
        }

        public Criteria andApearUserIDNotIn(List<Integer> values) {
            addCriterion("apearUserID not in", values, "apearUserID");
            return (Criteria) this;
        }

        public Criteria andApearUserIDBetween(Integer value1, Integer value2) {
            addCriterion("apearUserID between", value1, value2, "apearUserID");
            return (Criteria) this;
        }

        public Criteria andApearUserIDNotBetween(Integer value1, Integer value2) {
            addCriterion("apearUserID not between", value1, value2, "apearUserID");
            return (Criteria) this;
        }

        public Criteria andChangeDateIsNull() {
            addCriterion("changeDate is null");
            return (Criteria) this;
        }

        public Criteria andChangeDateIsNotNull() {
            addCriterion("changeDate is not null");
            return (Criteria) this;
        }

        public Criteria andChangeDateEqualTo(Date value) {
            addCriterion("changeDate =", value, "changeDate");
            return (Criteria) this;
        }

        public Criteria andChangeDateNotEqualTo(Date value) {
            addCriterion("changeDate <>", value, "changeDate");
            return (Criteria) this;
        }

        public Criteria andChangeDateGreaterThan(Date value) {
            addCriterion("changeDate >", value, "changeDate");
            return (Criteria) this;
        }

        public Criteria andChangeDateGreaterThanOrEqualTo(Date value) {
            addCriterion("changeDate >=", value, "changeDate");
            return (Criteria) this;
        }

        public Criteria andChangeDateLessThan(Date value) {
            addCriterion("changeDate <", value, "changeDate");
            return (Criteria) this;
        }

        public Criteria andChangeDateLessThanOrEqualTo(Date value) {
            addCriterion("changeDate <=", value, "changeDate");
            return (Criteria) this;
        }

        public Criteria andChangeDateIn(List<Date> values) {
            addCriterion("changeDate in", values, "changeDate");
            return (Criteria) this;
        }

        public Criteria andChangeDateNotIn(List<Date> values) {
            addCriterion("changeDate not in", values, "changeDate");
            return (Criteria) this;
        }

        public Criteria andChangeDateBetween(Date value1, Date value2) {
            addCriterion("changeDate between", value1, value2, "changeDate");
            return (Criteria) this;
        }

        public Criteria andChangeDateNotBetween(Date value1, Date value2) {
            addCriterion("changeDate not between", value1, value2, "changeDate");
            return (Criteria) this;
        }

        public Criteria andChangeUserIDIsNull() {
            addCriterion("changeUserID is null");
            return (Criteria) this;
        }

        public Criteria andChangeUserIDIsNotNull() {
            addCriterion("changeUserID is not null");
            return (Criteria) this;
        }

        public Criteria andChangeUserIDEqualTo(Integer value) {
            addCriterion("changeUserID =", value, "changeUserID");
            return (Criteria) this;
        }

        public Criteria andChangeUserIDNotEqualTo(Integer value) {
            addCriterion("changeUserID <>", value, "changeUserID");
            return (Criteria) this;
        }

        public Criteria andChangeUserIDGreaterThan(Integer value) {
            addCriterion("changeUserID >", value, "changeUserID");
            return (Criteria) this;
        }

        public Criteria andChangeUserIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("changeUserID >=", value, "changeUserID");
            return (Criteria) this;
        }

        public Criteria andChangeUserIDLessThan(Integer value) {
            addCriterion("changeUserID <", value, "changeUserID");
            return (Criteria) this;
        }

        public Criteria andChangeUserIDLessThanOrEqualTo(Integer value) {
            addCriterion("changeUserID <=", value, "changeUserID");
            return (Criteria) this;
        }

        public Criteria andChangeUserIDIn(List<Integer> values) {
            addCriterion("changeUserID in", values, "changeUserID");
            return (Criteria) this;
        }

        public Criteria andChangeUserIDNotIn(List<Integer> values) {
            addCriterion("changeUserID not in", values, "changeUserID");
            return (Criteria) this;
        }

        public Criteria andChangeUserIDBetween(Integer value1, Integer value2) {
            addCriterion("changeUserID between", value1, value2, "changeUserID");
            return (Criteria) this;
        }

        public Criteria andChangeUserIDNotBetween(Integer value1, Integer value2) {
            addCriterion("changeUserID not between", value1, value2, "changeUserID");
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