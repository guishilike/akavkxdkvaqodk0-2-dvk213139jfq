package edu.neu.hospital.example.basicTableExample;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ScheduleRuleViewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public ScheduleRuleViewExample() {
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

        public Criteria andDeptCodeIsNull() {
            addCriterion("deptCode is null");
            return (Criteria) this;
        }

        public Criteria andDeptCodeIsNotNull() {
            addCriterion("deptCode is not null");
            return (Criteria) this;
        }

        public Criteria andDeptCodeEqualTo(String value) {
            addCriterion("deptCode =", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotEqualTo(String value) {
            addCriterion("deptCode <>", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeGreaterThan(String value) {
            addCriterion("deptCode >", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeGreaterThanOrEqualTo(String value) {
            addCriterion("deptCode >=", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeLessThan(String value) {
            addCriterion("deptCode <", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeLessThanOrEqualTo(String value) {
            addCriterion("deptCode <=", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeLike(String value) {
            addCriterion("deptCode like", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotLike(String value) {
            addCriterion("deptCode not like", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeIn(List<String> values) {
            addCriterion("deptCode in", values, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotIn(List<String> values) {
            addCriterion("deptCode not in", values, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeBetween(String value1, String value2) {
            addCriterion("deptCode between", value1, value2, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotBetween(String value1, String value2) {
            addCriterion("deptCode not between", value1, value2, "deptCode");
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

        public Criteria andUserNameIsNull() {
            addCriterion("userName is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("userName is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("userName =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("userName <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("userName >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("userName >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("userName <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("userName <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("userName like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("userName not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("userName in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("userName not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("userName between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("userName not between", value1, value2, "userName");
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

        public Criteria andLevelCodeIsNull() {
            addCriterion("levelCode is null");
            return (Criteria) this;
        }

        public Criteria andLevelCodeIsNotNull() {
            addCriterion("levelCode is not null");
            return (Criteria) this;
        }

        public Criteria andLevelCodeEqualTo(String value) {
            addCriterion("levelCode =", value, "levelCode");
            return (Criteria) this;
        }

        public Criteria andLevelCodeNotEqualTo(String value) {
            addCriterion("levelCode <>", value, "levelCode");
            return (Criteria) this;
        }

        public Criteria andLevelCodeGreaterThan(String value) {
            addCriterion("levelCode >", value, "levelCode");
            return (Criteria) this;
        }

        public Criteria andLevelCodeGreaterThanOrEqualTo(String value) {
            addCriterion("levelCode >=", value, "levelCode");
            return (Criteria) this;
        }

        public Criteria andLevelCodeLessThan(String value) {
            addCriterion("levelCode <", value, "levelCode");
            return (Criteria) this;
        }

        public Criteria andLevelCodeLessThanOrEqualTo(String value) {
            addCriterion("levelCode <=", value, "levelCode");
            return (Criteria) this;
        }

        public Criteria andLevelCodeLike(String value) {
            addCriterion("levelCode like", value, "levelCode");
            return (Criteria) this;
        }

        public Criteria andLevelCodeNotLike(String value) {
            addCriterion("levelCode not like", value, "levelCode");
            return (Criteria) this;
        }

        public Criteria andLevelCodeIn(List<String> values) {
            addCriterion("levelCode in", values, "levelCode");
            return (Criteria) this;
        }

        public Criteria andLevelCodeNotIn(List<String> values) {
            addCriterion("levelCode not in", values, "levelCode");
            return (Criteria) this;
        }

        public Criteria andLevelCodeBetween(String value1, String value2) {
            addCriterion("levelCode between", value1, value2, "levelCode");
            return (Criteria) this;
        }

        public Criteria andLevelCodeNotBetween(String value1, String value2) {
            addCriterion("levelCode not between", value1, value2, "levelCode");
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

        public Criteria andLevelNameEqualTo(String value) {
            addCriterion("levelName =", value, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameNotEqualTo(String value) {
            addCriterion("levelName <>", value, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameGreaterThan(String value) {
            addCriterion("levelName >", value, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameGreaterThanOrEqualTo(String value) {
            addCriterion("levelName >=", value, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameLessThan(String value) {
            addCriterion("levelName <", value, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameLessThanOrEqualTo(String value) {
            addCriterion("levelName <=", value, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameLike(String value) {
            addCriterion("levelName like", value, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameNotLike(String value) {
            addCriterion("levelName not like", value, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameIn(List<String> values) {
            addCriterion("levelName in", values, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameNotIn(List<String> values) {
            addCriterion("levelName not in", values, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameBetween(String value1, String value2) {
            addCriterion("levelName between", value1, value2, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameNotBetween(String value1, String value2) {
            addCriterion("levelName not between", value1, value2, "levelName");
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

        public Criteria andOnDutyTimeCodeIsNull() {
            addCriterion("onDutyTimeCode is null");
            return (Criteria) this;
        }

        public Criteria andOnDutyTimeCodeIsNotNull() {
            addCriterion("onDutyTimeCode is not null");
            return (Criteria) this;
        }

        public Criteria andOnDutyTimeCodeEqualTo(String value) {
            addCriterion("onDutyTimeCode =", value, "onDutyTimeCode");
            return (Criteria) this;
        }

        public Criteria andOnDutyTimeCodeNotEqualTo(String value) {
            addCriterion("onDutyTimeCode <>", value, "onDutyTimeCode");
            return (Criteria) this;
        }

        public Criteria andOnDutyTimeCodeGreaterThan(String value) {
            addCriterion("onDutyTimeCode >", value, "onDutyTimeCode");
            return (Criteria) this;
        }

        public Criteria andOnDutyTimeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("onDutyTimeCode >=", value, "onDutyTimeCode");
            return (Criteria) this;
        }

        public Criteria andOnDutyTimeCodeLessThan(String value) {
            addCriterion("onDutyTimeCode <", value, "onDutyTimeCode");
            return (Criteria) this;
        }

        public Criteria andOnDutyTimeCodeLessThanOrEqualTo(String value) {
            addCriterion("onDutyTimeCode <=", value, "onDutyTimeCode");
            return (Criteria) this;
        }

        public Criteria andOnDutyTimeCodeLike(String value) {
            addCriterion("onDutyTimeCode like", value, "onDutyTimeCode");
            return (Criteria) this;
        }

        public Criteria andOnDutyTimeCodeNotLike(String value) {
            addCriterion("onDutyTimeCode not like", value, "onDutyTimeCode");
            return (Criteria) this;
        }

        public Criteria andOnDutyTimeCodeIn(List<String> values) {
            addCriterion("onDutyTimeCode in", values, "onDutyTimeCode");
            return (Criteria) this;
        }

        public Criteria andOnDutyTimeCodeNotIn(List<String> values) {
            addCriterion("onDutyTimeCode not in", values, "onDutyTimeCode");
            return (Criteria) this;
        }

        public Criteria andOnDutyTimeCodeBetween(String value1, String value2) {
            addCriterion("onDutyTimeCode between", value1, value2, "onDutyTimeCode");
            return (Criteria) this;
        }

        public Criteria andOnDutyTimeCodeNotBetween(String value1, String value2) {
            addCriterion("onDutyTimeCode not between", value1, value2, "onDutyTimeCode");
            return (Criteria) this;
        }

        public Criteria andOnDutyTimeNameIsNull() {
            addCriterion("onDutyTimeName is null");
            return (Criteria) this;
        }

        public Criteria andOnDutyTimeNameIsNotNull() {
            addCriterion("onDutyTimeName is not null");
            return (Criteria) this;
        }

        public Criteria andOnDutyTimeNameEqualTo(String value) {
            addCriterion("onDutyTimeName =", value, "onDutyTimeName");
            return (Criteria) this;
        }

        public Criteria andOnDutyTimeNameNotEqualTo(String value) {
            addCriterion("onDutyTimeName <>", value, "onDutyTimeName");
            return (Criteria) this;
        }

        public Criteria andOnDutyTimeNameGreaterThan(String value) {
            addCriterion("onDutyTimeName >", value, "onDutyTimeName");
            return (Criteria) this;
        }

        public Criteria andOnDutyTimeNameGreaterThanOrEqualTo(String value) {
            addCriterion("onDutyTimeName >=", value, "onDutyTimeName");
            return (Criteria) this;
        }

        public Criteria andOnDutyTimeNameLessThan(String value) {
            addCriterion("onDutyTimeName <", value, "onDutyTimeName");
            return (Criteria) this;
        }

        public Criteria andOnDutyTimeNameLessThanOrEqualTo(String value) {
            addCriterion("onDutyTimeName <=", value, "onDutyTimeName");
            return (Criteria) this;
        }

        public Criteria andOnDutyTimeNameLike(String value) {
            addCriterion("onDutyTimeName like", value, "onDutyTimeName");
            return (Criteria) this;
        }

        public Criteria andOnDutyTimeNameNotLike(String value) {
            addCriterion("onDutyTimeName not like", value, "onDutyTimeName");
            return (Criteria) this;
        }

        public Criteria andOnDutyTimeNameIn(List<String> values) {
            addCriterion("onDutyTimeName in", values, "onDutyTimeName");
            return (Criteria) this;
        }

        public Criteria andOnDutyTimeNameNotIn(List<String> values) {
            addCriterion("onDutyTimeName not in", values, "onDutyTimeName");
            return (Criteria) this;
        }

        public Criteria andOnDutyTimeNameBetween(String value1, String value2) {
            addCriterion("onDutyTimeName between", value1, value2, "onDutyTimeName");
            return (Criteria) this;
        }

        public Criteria andOnDutyTimeNameNotBetween(String value1, String value2) {
            addCriterion("onDutyTimeName not between", value1, value2, "onDutyTimeName");
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

        public Criteria andDeptCategoryIDIsNull() {
            addCriterion("deptCategoryID is null");
            return (Criteria) this;
        }

        public Criteria andDeptCategoryIDIsNotNull() {
            addCriterion("deptCategoryID is not null");
            return (Criteria) this;
        }

        public Criteria andDeptCategoryIDEqualTo(Integer value) {
            addCriterion("deptCategoryID =", value, "deptCategoryID");
            return (Criteria) this;
        }

        public Criteria andDeptCategoryIDNotEqualTo(Integer value) {
            addCriterion("deptCategoryID <>", value, "deptCategoryID");
            return (Criteria) this;
        }

        public Criteria andDeptCategoryIDGreaterThan(Integer value) {
            addCriterion("deptCategoryID >", value, "deptCategoryID");
            return (Criteria) this;
        }

        public Criteria andDeptCategoryIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("deptCategoryID >=", value, "deptCategoryID");
            return (Criteria) this;
        }

        public Criteria andDeptCategoryIDLessThan(Integer value) {
            addCriterion("deptCategoryID <", value, "deptCategoryID");
            return (Criteria) this;
        }

        public Criteria andDeptCategoryIDLessThanOrEqualTo(Integer value) {
            addCriterion("deptCategoryID <=", value, "deptCategoryID");
            return (Criteria) this;
        }

        public Criteria andDeptCategoryIDIn(List<Integer> values) {
            addCriterion("deptCategoryID in", values, "deptCategoryID");
            return (Criteria) this;
        }

        public Criteria andDeptCategoryIDNotIn(List<Integer> values) {
            addCriterion("deptCategoryID not in", values, "deptCategoryID");
            return (Criteria) this;
        }

        public Criteria andDeptCategoryIDBetween(Integer value1, Integer value2) {
            addCriterion("deptCategoryID between", value1, value2, "deptCategoryID");
            return (Criteria) this;
        }

        public Criteria andDeptCategoryIDNotBetween(Integer value1, Integer value2) {
            addCriterion("deptCategoryID not between", value1, value2, "deptCategoryID");
            return (Criteria) this;
        }

        public Criteria andDeptTypeIDIsNull() {
            addCriterion("deptTypeID is null");
            return (Criteria) this;
        }

        public Criteria andDeptTypeIDIsNotNull() {
            addCriterion("deptTypeID is not null");
            return (Criteria) this;
        }

        public Criteria andDeptTypeIDEqualTo(Integer value) {
            addCriterion("deptTypeID =", value, "deptTypeID");
            return (Criteria) this;
        }

        public Criteria andDeptTypeIDNotEqualTo(Integer value) {
            addCriterion("deptTypeID <>", value, "deptTypeID");
            return (Criteria) this;
        }

        public Criteria andDeptTypeIDGreaterThan(Integer value) {
            addCriterion("deptTypeID >", value, "deptTypeID");
            return (Criteria) this;
        }

        public Criteria andDeptTypeIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("deptTypeID >=", value, "deptTypeID");
            return (Criteria) this;
        }

        public Criteria andDeptTypeIDLessThan(Integer value) {
            addCriterion("deptTypeID <", value, "deptTypeID");
            return (Criteria) this;
        }

        public Criteria andDeptTypeIDLessThanOrEqualTo(Integer value) {
            addCriterion("deptTypeID <=", value, "deptTypeID");
            return (Criteria) this;
        }

        public Criteria andDeptTypeIDIn(List<Integer> values) {
            addCriterion("deptTypeID in", values, "deptTypeID");
            return (Criteria) this;
        }

        public Criteria andDeptTypeIDNotIn(List<Integer> values) {
            addCriterion("deptTypeID not in", values, "deptTypeID");
            return (Criteria) this;
        }

        public Criteria andDeptTypeIDBetween(Integer value1, Integer value2) {
            addCriterion("deptTypeID between", value1, value2, "deptTypeID");
            return (Criteria) this;
        }

        public Criteria andDeptTypeIDNotBetween(Integer value1, Integer value2) {
            addCriterion("deptTypeID not between", value1, value2, "deptTypeID");
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