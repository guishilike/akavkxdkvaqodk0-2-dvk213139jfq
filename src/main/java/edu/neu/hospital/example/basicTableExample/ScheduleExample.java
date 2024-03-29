package edu.neu.hospital.example.basicTableExample;

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

        public Criteria andDeptIDIsNull() {
            addCriterion("deptID is null");
            return (Criteria) this;
        }

        public Criteria andDeptIDIsNotNull() {
            addCriterion("deptID is not null");
            return (Criteria) this;
        }

        public Criteria andDeptIDEqualTo(Integer value) {
            addCriterion("deptID =", value, "deptID");
            return (Criteria) this;
        }

        public Criteria andDeptIDNotEqualTo(Integer value) {
            addCriterion("deptID <>", value, "deptID");
            return (Criteria) this;
        }

        public Criteria andDeptIDGreaterThan(Integer value) {
            addCriterion("deptID >", value, "deptID");
            return (Criteria) this;
        }

        public Criteria andDeptIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("deptID >=", value, "deptID");
            return (Criteria) this;
        }

        public Criteria andDeptIDLessThan(Integer value) {
            addCriterion("deptID <", value, "deptID");
            return (Criteria) this;
        }

        public Criteria andDeptIDLessThanOrEqualTo(Integer value) {
            addCriterion("deptID <=", value, "deptID");
            return (Criteria) this;
        }

        public Criteria andDeptIDIn(List<Integer> values) {
            addCriterion("deptID in", values, "deptID");
            return (Criteria) this;
        }

        public Criteria andDeptIDNotIn(List<Integer> values) {
            addCriterion("deptID not in", values, "deptID");
            return (Criteria) this;
        }

        public Criteria andDeptIDBetween(Integer value1, Integer value2) {
            addCriterion("deptID between", value1, value2, "deptID");
            return (Criteria) this;
        }

        public Criteria andDeptIDNotBetween(Integer value1, Integer value2) {
            addCriterion("deptID not between", value1, value2, "deptID");
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

        public Criteria andLevelNameIDIsNull() {
            addCriterion("levelNameID is null");
            return (Criteria) this;
        }

        public Criteria andLevelNameIDIsNotNull() {
            addCriterion("levelNameID is not null");
            return (Criteria) this;
        }

        public Criteria andLevelNameIDEqualTo(Integer value) {
            addCriterion("levelNameID =", value, "levelNameID");
            return (Criteria) this;
        }

        public Criteria andLevelNameIDNotEqualTo(Integer value) {
            addCriterion("levelNameID <>", value, "levelNameID");
            return (Criteria) this;
        }

        public Criteria andLevelNameIDGreaterThan(Integer value) {
            addCriterion("levelNameID >", value, "levelNameID");
            return (Criteria) this;
        }

        public Criteria andLevelNameIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("levelNameID >=", value, "levelNameID");
            return (Criteria) this;
        }

        public Criteria andLevelNameIDLessThan(Integer value) {
            addCriterion("levelNameID <", value, "levelNameID");
            return (Criteria) this;
        }

        public Criteria andLevelNameIDLessThanOrEqualTo(Integer value) {
            addCriterion("levelNameID <=", value, "levelNameID");
            return (Criteria) this;
        }

        public Criteria andLevelNameIDIn(List<Integer> values) {
            addCriterion("levelNameID in", values, "levelNameID");
            return (Criteria) this;
        }

        public Criteria andLevelNameIDNotIn(List<Integer> values) {
            addCriterion("levelNameID not in", values, "levelNameID");
            return (Criteria) this;
        }

        public Criteria andLevelNameIDBetween(Integer value1, Integer value2) {
            addCriterion("levelNameID between", value1, value2, "levelNameID");
            return (Criteria) this;
        }

        public Criteria andLevelNameIDNotBetween(Integer value1, Integer value2) {
            addCriterion("levelNameID not between", value1, value2, "levelNameID");
            return (Criteria) this;
        }

        public Criteria andOnDutyTimeIDIsNull() {
            addCriterion("onDutyTimeID is null");
            return (Criteria) this;
        }

        public Criteria andOnDutyTimeIDIsNotNull() {
            addCriterion("onDutyTimeID is not null");
            return (Criteria) this;
        }

        public Criteria andOnDutyTimeIDEqualTo(Integer value) {
            addCriterion("onDutyTimeID =", value, "onDutyTimeID");
            return (Criteria) this;
        }

        public Criteria andOnDutyTimeIDNotEqualTo(Integer value) {
            addCriterion("onDutyTimeID <>", value, "onDutyTimeID");
            return (Criteria) this;
        }

        public Criteria andOnDutyTimeIDGreaterThan(Integer value) {
            addCriterion("onDutyTimeID >", value, "onDutyTimeID");
            return (Criteria) this;
        }

        public Criteria andOnDutyTimeIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("onDutyTimeID >=", value, "onDutyTimeID");
            return (Criteria) this;
        }

        public Criteria andOnDutyTimeIDLessThan(Integer value) {
            addCriterion("onDutyTimeID <", value, "onDutyTimeID");
            return (Criteria) this;
        }

        public Criteria andOnDutyTimeIDLessThanOrEqualTo(Integer value) {
            addCriterion("onDutyTimeID <=", value, "onDutyTimeID");
            return (Criteria) this;
        }

        public Criteria andOnDutyTimeIDIn(List<Integer> values) {
            addCriterion("onDutyTimeID in", values, "onDutyTimeID");
            return (Criteria) this;
        }

        public Criteria andOnDutyTimeIDNotIn(List<Integer> values) {
            addCriterion("onDutyTimeID not in", values, "onDutyTimeID");
            return (Criteria) this;
        }

        public Criteria andOnDutyTimeIDBetween(Integer value1, Integer value2) {
            addCriterion("onDutyTimeID between", value1, value2, "onDutyTimeID");
            return (Criteria) this;
        }

        public Criteria andOnDutyTimeIDNotBetween(Integer value1, Integer value2) {
            addCriterion("onDutyTimeID not between", value1, value2, "onDutyTimeID");
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

        public Criteria andRuleIDIsNull() {
            addCriterion("ruleID is null");
            return (Criteria) this;
        }

        public Criteria andRuleIDIsNotNull() {
            addCriterion("ruleID is not null");
            return (Criteria) this;
        }

        public Criteria andRuleIDEqualTo(Integer value) {
            addCriterion("ruleID =", value, "ruleID");
            return (Criteria) this;
        }

        public Criteria andRuleIDNotEqualTo(Integer value) {
            addCriterion("ruleID <>", value, "ruleID");
            return (Criteria) this;
        }

        public Criteria andRuleIDGreaterThan(Integer value) {
            addCriterion("ruleID >", value, "ruleID");
            return (Criteria) this;
        }

        public Criteria andRuleIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("ruleID >=", value, "ruleID");
            return (Criteria) this;
        }

        public Criteria andRuleIDLessThan(Integer value) {
            addCriterion("ruleID <", value, "ruleID");
            return (Criteria) this;
        }

        public Criteria andRuleIDLessThanOrEqualTo(Integer value) {
            addCriterion("ruleID <=", value, "ruleID");
            return (Criteria) this;
        }

        public Criteria andRuleIDIn(List<Integer> values) {
            addCriterion("ruleID in", values, "ruleID");
            return (Criteria) this;
        }

        public Criteria andRuleIDNotIn(List<Integer> values) {
            addCriterion("ruleID not in", values, "ruleID");
            return (Criteria) this;
        }

        public Criteria andRuleIDBetween(Integer value1, Integer value2) {
            addCriterion("ruleID between", value1, value2, "ruleID");
            return (Criteria) this;
        }

        public Criteria andRuleIDNotBetween(Integer value1, Integer value2) {
            addCriterion("ruleID not between", value1, value2, "ruleID");
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

        public Criteria andAppearUserIDIsNull() {
            addCriterion("appearUserID is null");
            return (Criteria) this;
        }

        public Criteria andAppearUserIDIsNotNull() {
            addCriterion("appearUserID is not null");
            return (Criteria) this;
        }

        public Criteria andAppearUserIDEqualTo(Integer value) {
            addCriterion("appearUserID =", value, "appearUserID");
            return (Criteria) this;
        }

        public Criteria andAppearUserIDNotEqualTo(Integer value) {
            addCriterion("appearUserID <>", value, "appearUserID");
            return (Criteria) this;
        }

        public Criteria andAppearUserIDGreaterThan(Integer value) {
            addCriterion("appearUserID >", value, "appearUserID");
            return (Criteria) this;
        }

        public Criteria andAppearUserIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("appearUserID >=", value, "appearUserID");
            return (Criteria) this;
        }

        public Criteria andAppearUserIDLessThan(Integer value) {
            addCriterion("appearUserID <", value, "appearUserID");
            return (Criteria) this;
        }

        public Criteria andAppearUserIDLessThanOrEqualTo(Integer value) {
            addCriterion("appearUserID <=", value, "appearUserID");
            return (Criteria) this;
        }

        public Criteria andAppearUserIDIn(List<Integer> values) {
            addCriterion("appearUserID in", values, "appearUserID");
            return (Criteria) this;
        }

        public Criteria andAppearUserIDNotIn(List<Integer> values) {
            addCriterion("appearUserID not in", values, "appearUserID");
            return (Criteria) this;
        }

        public Criteria andAppearUserIDBetween(Integer value1, Integer value2) {
            addCriterion("appearUserID between", value1, value2, "appearUserID");
            return (Criteria) this;
        }

        public Criteria andAppearUserIDNotBetween(Integer value1, Integer value2) {
            addCriterion("appearUserID not between", value1, value2, "appearUserID");
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