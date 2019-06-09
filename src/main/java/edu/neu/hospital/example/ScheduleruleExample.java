package edu.neu.hospital.example;

import java.util.ArrayList;
import java.util.List;

public class ScheduleruleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public ScheduleruleExample() {
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

        public Criteria andWeekIsNull() {
            addCriterion("week is null");
            return (Criteria) this;
        }

        public Criteria andWeekIsNotNull() {
            addCriterion("week is not null");
            return (Criteria) this;
        }

        public Criteria andWeekEqualTo(Integer value) {
            addCriterion("week =", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekNotEqualTo(Integer value) {
            addCriterion("week <>", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekGreaterThan(Integer value) {
            addCriterion("week >", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekGreaterThanOrEqualTo(Integer value) {
            addCriterion("week >=", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekLessThan(Integer value) {
            addCriterion("week <", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekLessThanOrEqualTo(Integer value) {
            addCriterion("week <=", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekIn(List<Integer> values) {
            addCriterion("week in", values, "week");
            return (Criteria) this;
        }

        public Criteria andWeekNotIn(List<Integer> values) {
            addCriterion("week not in", values, "week");
            return (Criteria) this;
        }

        public Criteria andWeekBetween(Integer value1, Integer value2) {
            addCriterion("week between", value1, value2, "week");
            return (Criteria) this;
        }

        public Criteria andWeekNotBetween(Integer value1, Integer value2) {
            addCriterion("week not between", value1, value2, "week");
            return (Criteria) this;
        }

        public Criteria andDeptnameIsNull() {
            addCriterion("deptName is null");
            return (Criteria) this;
        }

        public Criteria andDeptnameIsNotNull() {
            addCriterion("deptName is not null");
            return (Criteria) this;
        }

        public Criteria andDeptnameEqualTo(String value) {
            addCriterion("deptName =", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameNotEqualTo(String value) {
            addCriterion("deptName <>", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameGreaterThan(String value) {
            addCriterion("deptName >", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameGreaterThanOrEqualTo(String value) {
            addCriterion("deptName >=", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameLessThan(String value) {
            addCriterion("deptName <", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameLessThanOrEqualTo(String value) {
            addCriterion("deptName <=", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameLike(String value) {
            addCriterion("deptName like", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameNotLike(String value) {
            addCriterion("deptName not like", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameIn(List<String> values) {
            addCriterion("deptName in", values, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameNotIn(List<String> values) {
            addCriterion("deptName not in", values, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameBetween(String value1, String value2) {
            addCriterion("deptName between", value1, value2, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameNotBetween(String value1, String value2) {
            addCriterion("deptName not between", value1, value2, "deptname");
            return (Criteria) this;
        }

        public Criteria andOndutydoctoridIsNull() {
            addCriterion("onDutyDoctorID is null");
            return (Criteria) this;
        }

        public Criteria andOndutydoctoridIsNotNull() {
            addCriterion("onDutyDoctorID is not null");
            return (Criteria) this;
        }

        public Criteria andOndutydoctoridEqualTo(Integer value) {
            addCriterion("onDutyDoctorID =", value, "ondutydoctorid");
            return (Criteria) this;
        }

        public Criteria andOndutydoctoridNotEqualTo(Integer value) {
            addCriterion("onDutyDoctorID <>", value, "ondutydoctorid");
            return (Criteria) this;
        }

        public Criteria andOndutydoctoridGreaterThan(Integer value) {
            addCriterion("onDutyDoctorID >", value, "ondutydoctorid");
            return (Criteria) this;
        }

        public Criteria andOndutydoctoridGreaterThanOrEqualTo(Integer value) {
            addCriterion("onDutyDoctorID >=", value, "ondutydoctorid");
            return (Criteria) this;
        }

        public Criteria andOndutydoctoridLessThan(Integer value) {
            addCriterion("onDutyDoctorID <", value, "ondutydoctorid");
            return (Criteria) this;
        }

        public Criteria andOndutydoctoridLessThanOrEqualTo(Integer value) {
            addCriterion("onDutyDoctorID <=", value, "ondutydoctorid");
            return (Criteria) this;
        }

        public Criteria andOndutydoctoridIn(List<Integer> values) {
            addCriterion("onDutyDoctorID in", values, "ondutydoctorid");
            return (Criteria) this;
        }

        public Criteria andOndutydoctoridNotIn(List<Integer> values) {
            addCriterion("onDutyDoctorID not in", values, "ondutydoctorid");
            return (Criteria) this;
        }

        public Criteria andOndutydoctoridBetween(Integer value1, Integer value2) {
            addCriterion("onDutyDoctorID between", value1, value2, "ondutydoctorid");
            return (Criteria) this;
        }

        public Criteria andOndutydoctoridNotBetween(Integer value1, Integer value2) {
            addCriterion("onDutyDoctorID not between", value1, value2, "ondutydoctorid");
            return (Criteria) this;
        }

        public Criteria andLevelnameIsNull() {
            addCriterion("levelName is null");
            return (Criteria) this;
        }

        public Criteria andLevelnameIsNotNull() {
            addCriterion("levelName is not null");
            return (Criteria) this;
        }

        public Criteria andLevelnameEqualTo(Integer value) {
            addCriterion("levelName =", value, "levelname");
            return (Criteria) this;
        }

        public Criteria andLevelnameNotEqualTo(Integer value) {
            addCriterion("levelName <>", value, "levelname");
            return (Criteria) this;
        }

        public Criteria andLevelnameGreaterThan(Integer value) {
            addCriterion("levelName >", value, "levelname");
            return (Criteria) this;
        }

        public Criteria andLevelnameGreaterThanOrEqualTo(Integer value) {
            addCriterion("levelName >=", value, "levelname");
            return (Criteria) this;
        }

        public Criteria andLevelnameLessThan(Integer value) {
            addCriterion("levelName <", value, "levelname");
            return (Criteria) this;
        }

        public Criteria andLevelnameLessThanOrEqualTo(Integer value) {
            addCriterion("levelName <=", value, "levelname");
            return (Criteria) this;
        }

        public Criteria andLevelnameIn(List<Integer> values) {
            addCriterion("levelName in", values, "levelname");
            return (Criteria) this;
        }

        public Criteria andLevelnameNotIn(List<Integer> values) {
            addCriterion("levelName not in", values, "levelname");
            return (Criteria) this;
        }

        public Criteria andLevelnameBetween(Integer value1, Integer value2) {
            addCriterion("levelName between", value1, value2, "levelname");
            return (Criteria) this;
        }

        public Criteria andLevelnameNotBetween(Integer value1, Integer value2) {
            addCriterion("levelName not between", value1, value2, "levelname");
            return (Criteria) this;
        }

        public Criteria andOndutytimeIsNull() {
            addCriterion("onDutyTime is null");
            return (Criteria) this;
        }

        public Criteria andOndutytimeIsNotNull() {
            addCriterion("onDutyTime is not null");
            return (Criteria) this;
        }

        public Criteria andOndutytimeEqualTo(Integer value) {
            addCriterion("onDutyTime =", value, "ondutytime");
            return (Criteria) this;
        }

        public Criteria andOndutytimeNotEqualTo(Integer value) {
            addCriterion("onDutyTime <>", value, "ondutytime");
            return (Criteria) this;
        }

        public Criteria andOndutytimeGreaterThan(Integer value) {
            addCriterion("onDutyTime >", value, "ondutytime");
            return (Criteria) this;
        }

        public Criteria andOndutytimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("onDutyTime >=", value, "ondutytime");
            return (Criteria) this;
        }

        public Criteria andOndutytimeLessThan(Integer value) {
            addCriterion("onDutyTime <", value, "ondutytime");
            return (Criteria) this;
        }

        public Criteria andOndutytimeLessThanOrEqualTo(Integer value) {
            addCriterion("onDutyTime <=", value, "ondutytime");
            return (Criteria) this;
        }

        public Criteria andOndutytimeIn(List<Integer> values) {
            addCriterion("onDutyTime in", values, "ondutytime");
            return (Criteria) this;
        }

        public Criteria andOndutytimeNotIn(List<Integer> values) {
            addCriterion("onDutyTime not in", values, "ondutytime");
            return (Criteria) this;
        }

        public Criteria andOndutytimeBetween(Integer value1, Integer value2) {
            addCriterion("onDutyTime between", value1, value2, "ondutytime");
            return (Criteria) this;
        }

        public Criteria andOndutytimeNotBetween(Integer value1, Integer value2) {
            addCriterion("onDutyTime not between", value1, value2, "ondutytime");
            return (Criteria) this;
        }

        public Criteria andLimitnumberIsNull() {
            addCriterion("limitNumber is null");
            return (Criteria) this;
        }

        public Criteria andLimitnumberIsNotNull() {
            addCriterion("limitNumber is not null");
            return (Criteria) this;
        }

        public Criteria andLimitnumberEqualTo(Integer value) {
            addCriterion("limitNumber =", value, "limitnumber");
            return (Criteria) this;
        }

        public Criteria andLimitnumberNotEqualTo(Integer value) {
            addCriterion("limitNumber <>", value, "limitnumber");
            return (Criteria) this;
        }

        public Criteria andLimitnumberGreaterThan(Integer value) {
            addCriterion("limitNumber >", value, "limitnumber");
            return (Criteria) this;
        }

        public Criteria andLimitnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("limitNumber >=", value, "limitnumber");
            return (Criteria) this;
        }

        public Criteria andLimitnumberLessThan(Integer value) {
            addCriterion("limitNumber <", value, "limitnumber");
            return (Criteria) this;
        }

        public Criteria andLimitnumberLessThanOrEqualTo(Integer value) {
            addCriterion("limitNumber <=", value, "limitnumber");
            return (Criteria) this;
        }

        public Criteria andLimitnumberIn(List<Integer> values) {
            addCriterion("limitNumber in", values, "limitnumber");
            return (Criteria) this;
        }

        public Criteria andLimitnumberNotIn(List<Integer> values) {
            addCriterion("limitNumber not in", values, "limitnumber");
            return (Criteria) this;
        }

        public Criteria andLimitnumberBetween(Integer value1, Integer value2) {
            addCriterion("limitNumber between", value1, value2, "limitnumber");
            return (Criteria) this;
        }

        public Criteria andLimitnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("limitNumber not between", value1, value2, "limitnumber");
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

        public Criteria andReserve1IsNull() {
            addCriterion("reserve1 is null");
            return (Criteria) this;
        }

        public Criteria andReserve1IsNotNull() {
            addCriterion("reserve1 is not null");
            return (Criteria) this;
        }

        public Criteria andReserve1EqualTo(String value) {
            addCriterion("reserve1 =", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1NotEqualTo(String value) {
            addCriterion("reserve1 <>", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1GreaterThan(String value) {
            addCriterion("reserve1 >", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1GreaterThanOrEqualTo(String value) {
            addCriterion("reserve1 >=", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1LessThan(String value) {
            addCriterion("reserve1 <", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1LessThanOrEqualTo(String value) {
            addCriterion("reserve1 <=", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1Like(String value) {
            addCriterion("reserve1 like", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1NotLike(String value) {
            addCriterion("reserve1 not like", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1In(List<String> values) {
            addCriterion("reserve1 in", values, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1NotIn(List<String> values) {
            addCriterion("reserve1 not in", values, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1Between(String value1, String value2) {
            addCriterion("reserve1 between", value1, value2, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1NotBetween(String value1, String value2) {
            addCriterion("reserve1 not between", value1, value2, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve2IsNull() {
            addCriterion("reserve2 is null");
            return (Criteria) this;
        }

        public Criteria andReserve2IsNotNull() {
            addCriterion("reserve2 is not null");
            return (Criteria) this;
        }

        public Criteria andReserve2EqualTo(String value) {
            addCriterion("reserve2 =", value, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2NotEqualTo(String value) {
            addCriterion("reserve2 <>", value, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2GreaterThan(String value) {
            addCriterion("reserve2 >", value, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2GreaterThanOrEqualTo(String value) {
            addCriterion("reserve2 >=", value, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2LessThan(String value) {
            addCriterion("reserve2 <", value, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2LessThanOrEqualTo(String value) {
            addCriterion("reserve2 <=", value, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2Like(String value) {
            addCriterion("reserve2 like", value, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2NotLike(String value) {
            addCriterion("reserve2 not like", value, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2In(List<String> values) {
            addCriterion("reserve2 in", values, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2NotIn(List<String> values) {
            addCriterion("reserve2 not in", values, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2Between(String value1, String value2) {
            addCriterion("reserve2 between", value1, value2, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2NotBetween(String value1, String value2) {
            addCriterion("reserve2 not between", value1, value2, "reserve2");
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