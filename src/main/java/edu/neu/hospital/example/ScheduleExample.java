package edu.neu.hospital.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ScheduleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public ScheduleExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andOnDutyDateIsNull() {
            addCriterion("onDutyDate is null");
            return (Criteria) this;
        }

        public Criteria andOnDutyDateIsNotNull() {
            addCriterion("onDutyDate is not null");
            return (Criteria) this;
        }

        public Criteria andOnDutyDateEqualTo(Date value) {
            addCriterionForJDBCDate("onDutyDate =", value, "onDutyDate");
            return (Criteria) this;
        }

        public Criteria andOnDutyDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("onDutyDate <>", value, "onDutyDate");
            return (Criteria) this;
        }

        public Criteria andOnDutyDateGreaterThan(Date value) {
            addCriterionForJDBCDate("onDutyDate >", value, "onDutyDate");
            return (Criteria) this;
        }

        public Criteria andOnDutyDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("onDutyDate >=", value, "onDutyDate");
            return (Criteria) this;
        }

        public Criteria andOnDutyDateLessThan(Date value) {
            addCriterionForJDBCDate("onDutyDate <", value, "onDutyDate");
            return (Criteria) this;
        }

        public Criteria andOnDutyDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("onDutyDate <=", value, "onDutyDate");
            return (Criteria) this;
        }

        public Criteria andOnDutyDateIn(List<Date> values) {
            addCriterionForJDBCDate("onDutyDate in", values, "onDutyDate");
            return (Criteria) this;
        }

        public Criteria andOnDutyDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("onDutyDate not in", values, "onDutyDate");
            return (Criteria) this;
        }

        public Criteria andOnDutyDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("onDutyDate between", value1, value2, "onDutyDate");
            return (Criteria) this;
        }

        public Criteria andOnDutyDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("onDutyDate not between", value1, value2, "onDutyDate");
            return (Criteria) this;
        }

        public Criteria andDeptNameIsNull() {
            addCriterion("deptName is null");
            return (Criteria) this;
        }

        public Criteria andDeptNameIsNotNull() {
            addCriterion("deptName is not null");
            return (Criteria) this;
        }

        public Criteria andDeptNameEqualTo(String value) {
            addCriterion("deptName =", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotEqualTo(String value) {
            addCriterion("deptName <>", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameGreaterThan(String value) {
            addCriterion("deptName >", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameGreaterThanOrEqualTo(String value) {
            addCriterion("deptName >=", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLessThan(String value) {
            addCriterion("deptName <", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLessThanOrEqualTo(String value) {
            addCriterion("deptName <=", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLike(String value) {
            addCriterion("deptName like", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotLike(String value) {
            addCriterion("deptName not like", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameIn(List<String> values) {
            addCriterion("deptName in", values, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotIn(List<String> values) {
            addCriterion("deptName not in", values, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameBetween(String value1, String value2) {
            addCriterion("deptName between", value1, value2, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotBetween(String value1, String value2) {
            addCriterion("deptName not between", value1, value2, "deptName");
            return (Criteria) this;
        }

        public Criteria andOnDutyDoctorIDIsNull() {
            addCriterion("onDutyDoctorID is null");
            return (Criteria) this;
        }

        public Criteria andOnDutyDoctorIDIsNotNull() {
            addCriterion("onDutyDoctorID is not null");
            return (Criteria) this;
        }

        public Criteria andOnDutyDoctorIDEqualTo(Integer value) {
            addCriterion("onDutyDoctorID =", value, "onDutyDoctorID");
            return (Criteria) this;
        }

        public Criteria andOnDutyDoctorIDNotEqualTo(Integer value) {
            addCriterion("onDutyDoctorID <>", value, "onDutyDoctorID");
            return (Criteria) this;
        }

        public Criteria andOnDutyDoctorIDGreaterThan(Integer value) {
            addCriterion("onDutyDoctorID >", value, "onDutyDoctorID");
            return (Criteria) this;
        }

        public Criteria andOnDutyDoctorIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("onDutyDoctorID >=", value, "onDutyDoctorID");
            return (Criteria) this;
        }

        public Criteria andOnDutyDoctorIDLessThan(Integer value) {
            addCriterion("onDutyDoctorID <", value, "onDutyDoctorID");
            return (Criteria) this;
        }

        public Criteria andOnDutyDoctorIDLessThanOrEqualTo(Integer value) {
            addCriterion("onDutyDoctorID <=", value, "onDutyDoctorID");
            return (Criteria) this;
        }

        public Criteria andOnDutyDoctorIDIn(List<Integer> values) {
            addCriterion("onDutyDoctorID in", values, "onDutyDoctorID");
            return (Criteria) this;
        }

        public Criteria andOnDutyDoctorIDNotIn(List<Integer> values) {
            addCriterion("onDutyDoctorID not in", values, "onDutyDoctorID");
            return (Criteria) this;
        }

        public Criteria andOnDutyDoctorIDBetween(Integer value1, Integer value2) {
            addCriterion("onDutyDoctorID between", value1, value2, "onDutyDoctorID");
            return (Criteria) this;
        }

        public Criteria andOnDutyDoctorIDNotBetween(Integer value1, Integer value2) {
            addCriterion("onDutyDoctorID not between", value1, value2, "onDutyDoctorID");
            return (Criteria) this;
        }

        public Criteria andLevelNameIsNull() {
            addCriterion("levelName is null");
            return (Criteria) this;
        }

        public Criteria andLevelNameIsNotNull() {
            addCriterion("levelName is not null");
            return (Criteria) this;
        }

        public Criteria andLevelNameEqualTo(Integer value) {
            addCriterion("levelName =", value, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameNotEqualTo(Integer value) {
            addCriterion("levelName <>", value, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameGreaterThan(Integer value) {
            addCriterion("levelName >", value, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameGreaterThanOrEqualTo(Integer value) {
            addCriterion("levelName >=", value, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameLessThan(Integer value) {
            addCriterion("levelName <", value, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameLessThanOrEqualTo(Integer value) {
            addCriterion("levelName <=", value, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameIn(List<Integer> values) {
            addCriterion("levelName in", values, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameNotIn(List<Integer> values) {
            addCriterion("levelName not in", values, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameBetween(Integer value1, Integer value2) {
            addCriterion("levelName between", value1, value2, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameNotBetween(Integer value1, Integer value2) {
            addCriterion("levelName not between", value1, value2, "levelName");
            return (Criteria) this;
        }

        public Criteria andOnDutyTimeIsNull() {
            addCriterion("onDutyTime is null");
            return (Criteria) this;
        }

        public Criteria andOnDutyTimeIsNotNull() {
            addCriterion("onDutyTime is not null");
            return (Criteria) this;
        }

        public Criteria andOnDutyTimeEqualTo(Integer value) {
            addCriterion("onDutyTime =", value, "onDutyTime");
            return (Criteria) this;
        }

        public Criteria andOnDutyTimeNotEqualTo(Integer value) {
            addCriterion("onDutyTime <>", value, "onDutyTime");
            return (Criteria) this;
        }

        public Criteria andOnDutyTimeGreaterThan(Integer value) {
            addCriterion("onDutyTime >", value, "onDutyTime");
            return (Criteria) this;
        }

        public Criteria andOnDutyTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("onDutyTime >=", value, "onDutyTime");
            return (Criteria) this;
        }

        public Criteria andOnDutyTimeLessThan(Integer value) {
            addCriterion("onDutyTime <", value, "onDutyTime");
            return (Criteria) this;
        }

        public Criteria andOnDutyTimeLessThanOrEqualTo(Integer value) {
            addCriterion("onDutyTime <=", value, "onDutyTime");
            return (Criteria) this;
        }

        public Criteria andOnDutyTimeIn(List<Integer> values) {
            addCriterion("onDutyTime in", values, "onDutyTime");
            return (Criteria) this;
        }

        public Criteria andOnDutyTimeNotIn(List<Integer> values) {
            addCriterion("onDutyTime not in", values, "onDutyTime");
            return (Criteria) this;
        }

        public Criteria andOnDutyTimeBetween(Integer value1, Integer value2) {
            addCriterion("onDutyTime between", value1, value2, "onDutyTime");
            return (Criteria) this;
        }

        public Criteria andOnDutyTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("onDutyTime not between", value1, value2, "onDutyTime");
            return (Criteria) this;
        }

        public Criteria andLimitNumberIsNull() {
            addCriterion("limitNumber is null");
            return (Criteria) this;
        }

        public Criteria andLimitNumberIsNotNull() {
            addCriterion("limitNumber is not null");
            return (Criteria) this;
        }

        public Criteria andLimitNumberEqualTo(Integer value) {
            addCriterion("limitNumber =", value, "limitNumber");
            return (Criteria) this;
        }

        public Criteria andLimitNumberNotEqualTo(Integer value) {
            addCriterion("limitNumber <>", value, "limitNumber");
            return (Criteria) this;
        }

        public Criteria andLimitNumberGreaterThan(Integer value) {
            addCriterion("limitNumber >", value, "limitNumber");
            return (Criteria) this;
        }

        public Criteria andLimitNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("limitNumber >=", value, "limitNumber");
            return (Criteria) this;
        }

        public Criteria andLimitNumberLessThan(Integer value) {
            addCriterion("limitNumber <", value, "limitNumber");
            return (Criteria) this;
        }

        public Criteria andLimitNumberLessThanOrEqualTo(Integer value) {
            addCriterion("limitNumber <=", value, "limitNumber");
            return (Criteria) this;
        }

        public Criteria andLimitNumberIn(List<Integer> values) {
            addCriterion("limitNumber in", values, "limitNumber");
            return (Criteria) this;
        }

        public Criteria andLimitNumberNotIn(List<Integer> values) {
            addCriterion("limitNumber not in", values, "limitNumber");
            return (Criteria) this;
        }

        public Criteria andLimitNumberBetween(Integer value1, Integer value2) {
            addCriterion("limitNumber between", value1, value2, "limitNumber");
            return (Criteria) this;
        }

        public Criteria andLimitNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("limitNumber not between", value1, value2, "limitNumber");
            return (Criteria) this;
        }

        public Criteria andRemainingAmountIsNull() {
            addCriterion("remainingAmount is null");
            return (Criteria) this;
        }

        public Criteria andRemainingAmountIsNotNull() {
            addCriterion("remainingAmount is not null");
            return (Criteria) this;
        }

        public Criteria andRemainingAmountEqualTo(Integer value) {
            addCriterion("remainingAmount =", value, "remainingAmount");
            return (Criteria) this;
        }

        public Criteria andRemainingAmountNotEqualTo(Integer value) {
            addCriterion("remainingAmount <>", value, "remainingAmount");
            return (Criteria) this;
        }

        public Criteria andRemainingAmountGreaterThan(Integer value) {
            addCriterion("remainingAmount >", value, "remainingAmount");
            return (Criteria) this;
        }

        public Criteria andRemainingAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("remainingAmount >=", value, "remainingAmount");
            return (Criteria) this;
        }

        public Criteria andRemainingAmountLessThan(Integer value) {
            addCriterion("remainingAmount <", value, "remainingAmount");
            return (Criteria) this;
        }

        public Criteria andRemainingAmountLessThanOrEqualTo(Integer value) {
            addCriterion("remainingAmount <=", value, "remainingAmount");
            return (Criteria) this;
        }

        public Criteria andRemainingAmountIn(List<Integer> values) {
            addCriterion("remainingAmount in", values, "remainingAmount");
            return (Criteria) this;
        }

        public Criteria andRemainingAmountNotIn(List<Integer> values) {
            addCriterion("remainingAmount not in", values, "remainingAmount");
            return (Criteria) this;
        }

        public Criteria andRemainingAmountBetween(Integer value1, Integer value2) {
            addCriterion("remainingAmount between", value1, value2, "remainingAmount");
            return (Criteria) this;
        }

        public Criteria andRemainingAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("remainingAmount not between", value1, value2, "remainingAmount");
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