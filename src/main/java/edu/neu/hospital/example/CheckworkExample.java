package edu.neu.hospital.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CheckworkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public CheckworkExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("userId =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("userId <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("userId >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("userId >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("userId <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("userId <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("userId in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("userId not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("userId between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("userId not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNull() {
            addCriterion("realName is null");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNotNull() {
            addCriterion("realName is not null");
            return (Criteria) this;
        }

        public Criteria andRealNameEqualTo(String value) {
            addCriterion("realName =", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotEqualTo(String value) {
            addCriterion("realName <>", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThan(String value) {
            addCriterion("realName >", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("realName >=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThan(String value) {
            addCriterion("realName <", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThanOrEqualTo(String value) {
            addCriterion("realName <=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLike(String value) {
            addCriterion("realName like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotLike(String value) {
            addCriterion("realName not like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameIn(List<String> values) {
            addCriterion("realName in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotIn(List<String> values) {
            addCriterion("realName not in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameBetween(String value1, String value2) {
            addCriterion("realName between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotBetween(String value1, String value2) {
            addCriterion("realName not between", value1, value2, "realName");
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

        public Criteria andMedicalRecordIDIsNull() {
            addCriterion("medicalRecordID is null");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordIDIsNotNull() {
            addCriterion("medicalRecordID is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordIDEqualTo(Integer value) {
            addCriterion("medicalRecordID =", value, "medicalRecordID");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordIDNotEqualTo(Integer value) {
            addCriterion("medicalRecordID <>", value, "medicalRecordID");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordIDGreaterThan(Integer value) {
            addCriterion("medicalRecordID >", value, "medicalRecordID");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("medicalRecordID >=", value, "medicalRecordID");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordIDLessThan(Integer value) {
            addCriterion("medicalRecordID <", value, "medicalRecordID");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordIDLessThanOrEqualTo(Integer value) {
            addCriterion("medicalRecordID <=", value, "medicalRecordID");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordIDIn(List<Integer> values) {
            addCriterion("medicalRecordID in", values, "medicalRecordID");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordIDNotIn(List<Integer> values) {
            addCriterion("medicalRecordID not in", values, "medicalRecordID");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordIDBetween(Integer value1, Integer value2) {
            addCriterion("medicalRecordID between", value1, value2, "medicalRecordID");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordIDNotBetween(Integer value1, Integer value2) {
            addCriterion("medicalRecordID not between", value1, value2, "medicalRecordID");
            return (Criteria) this;
        }

        public Criteria andPatientNameIsNull() {
            addCriterion("patientName is null");
            return (Criteria) this;
        }

        public Criteria andPatientNameIsNotNull() {
            addCriterion("patientName is not null");
            return (Criteria) this;
        }

        public Criteria andPatientNameEqualTo(String value) {
            addCriterion("patientName =", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameNotEqualTo(String value) {
            addCriterion("patientName <>", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameGreaterThan(String value) {
            addCriterion("patientName >", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameGreaterThanOrEqualTo(String value) {
            addCriterion("patientName >=", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameLessThan(String value) {
            addCriterion("patientName <", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameLessThanOrEqualTo(String value) {
            addCriterion("patientName <=", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameLike(String value) {
            addCriterion("patientName like", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameNotLike(String value) {
            addCriterion("patientName not like", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameIn(List<String> values) {
            addCriterion("patientName in", values, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameNotIn(List<String> values) {
            addCriterion("patientName not in", values, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameBetween(String value1, String value2) {
            addCriterion("patientName between", value1, value2, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameNotBetween(String value1, String value2) {
            addCriterion("patientName not between", value1, value2, "patientName");
            return (Criteria) this;
        }

        public Criteria andFeeCategoryIsNull() {
            addCriterion("feeCategory is null");
            return (Criteria) this;
        }

        public Criteria andFeeCategoryIsNotNull() {
            addCriterion("feeCategory is not null");
            return (Criteria) this;
        }

        public Criteria andFeeCategoryEqualTo(String value) {
            addCriterion("feeCategory =", value, "feeCategory");
            return (Criteria) this;
        }

        public Criteria andFeeCategoryNotEqualTo(String value) {
            addCriterion("feeCategory <>", value, "feeCategory");
            return (Criteria) this;
        }

        public Criteria andFeeCategoryGreaterThan(String value) {
            addCriterion("feeCategory >", value, "feeCategory");
            return (Criteria) this;
        }

        public Criteria andFeeCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("feeCategory >=", value, "feeCategory");
            return (Criteria) this;
        }

        public Criteria andFeeCategoryLessThan(String value) {
            addCriterion("feeCategory <", value, "feeCategory");
            return (Criteria) this;
        }

        public Criteria andFeeCategoryLessThanOrEqualTo(String value) {
            addCriterion("feeCategory <=", value, "feeCategory");
            return (Criteria) this;
        }

        public Criteria andFeeCategoryLike(String value) {
            addCriterion("feeCategory like", value, "feeCategory");
            return (Criteria) this;
        }

        public Criteria andFeeCategoryNotLike(String value) {
            addCriterion("feeCategory not like", value, "feeCategory");
            return (Criteria) this;
        }

        public Criteria andFeeCategoryIn(List<String> values) {
            addCriterion("feeCategory in", values, "feeCategory");
            return (Criteria) this;
        }

        public Criteria andFeeCategoryNotIn(List<String> values) {
            addCriterion("feeCategory not in", values, "feeCategory");
            return (Criteria) this;
        }

        public Criteria andFeeCategoryBetween(String value1, String value2) {
            addCriterion("feeCategory between", value1, value2, "feeCategory");
            return (Criteria) this;
        }

        public Criteria andFeeCategoryNotBetween(String value1, String value2) {
            addCriterion("feeCategory not between", value1, value2, "feeCategory");
            return (Criteria) this;
        }

        public Criteria andFee1IsNull() {
            addCriterion("fee1 is null");
            return (Criteria) this;
        }

        public Criteria andFee1IsNotNull() {
            addCriterion("fee1 is not null");
            return (Criteria) this;
        }

        public Criteria andFee1EqualTo(BigDecimal value) {
            addCriterion("fee1 =", value, "fee1");
            return (Criteria) this;
        }

        public Criteria andFee1NotEqualTo(BigDecimal value) {
            addCriterion("fee1 <>", value, "fee1");
            return (Criteria) this;
        }

        public Criteria andFee1GreaterThan(BigDecimal value) {
            addCriterion("fee1 >", value, "fee1");
            return (Criteria) this;
        }

        public Criteria andFee1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fee1 >=", value, "fee1");
            return (Criteria) this;
        }

        public Criteria andFee1LessThan(BigDecimal value) {
            addCriterion("fee1 <", value, "fee1");
            return (Criteria) this;
        }

        public Criteria andFee1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("fee1 <=", value, "fee1");
            return (Criteria) this;
        }

        public Criteria andFee1In(List<BigDecimal> values) {
            addCriterion("fee1 in", values, "fee1");
            return (Criteria) this;
        }

        public Criteria andFee1NotIn(List<BigDecimal> values) {
            addCriterion("fee1 not in", values, "fee1");
            return (Criteria) this;
        }

        public Criteria andFee1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("fee1 between", value1, value2, "fee1");
            return (Criteria) this;
        }

        public Criteria andFee1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fee1 not between", value1, value2, "fee1");
            return (Criteria) this;
        }

        public Criteria andFee2IsNull() {
            addCriterion("fee2 is null");
            return (Criteria) this;
        }

        public Criteria andFee2IsNotNull() {
            addCriterion("fee2 is not null");
            return (Criteria) this;
        }

        public Criteria andFee2EqualTo(BigDecimal value) {
            addCriterion("fee2 =", value, "fee2");
            return (Criteria) this;
        }

        public Criteria andFee2NotEqualTo(BigDecimal value) {
            addCriterion("fee2 <>", value, "fee2");
            return (Criteria) this;
        }

        public Criteria andFee2GreaterThan(BigDecimal value) {
            addCriterion("fee2 >", value, "fee2");
            return (Criteria) this;
        }

        public Criteria andFee2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fee2 >=", value, "fee2");
            return (Criteria) this;
        }

        public Criteria andFee2LessThan(BigDecimal value) {
            addCriterion("fee2 <", value, "fee2");
            return (Criteria) this;
        }

        public Criteria andFee2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("fee2 <=", value, "fee2");
            return (Criteria) this;
        }

        public Criteria andFee2In(List<BigDecimal> values) {
            addCriterion("fee2 in", values, "fee2");
            return (Criteria) this;
        }

        public Criteria andFee2NotIn(List<BigDecimal> values) {
            addCriterion("fee2 not in", values, "fee2");
            return (Criteria) this;
        }

        public Criteria andFee2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("fee2 between", value1, value2, "fee2");
            return (Criteria) this;
        }

        public Criteria andFee2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fee2 not between", value1, value2, "fee2");
            return (Criteria) this;
        }

        public Criteria andFeeAppearDateIsNull() {
            addCriterion("feeAppearDate is null");
            return (Criteria) this;
        }

        public Criteria andFeeAppearDateIsNotNull() {
            addCriterion("feeAppearDate is not null");
            return (Criteria) this;
        }

        public Criteria andFeeAppearDateEqualTo(Date value) {
            addCriterion("feeAppearDate =", value, "feeAppearDate");
            return (Criteria) this;
        }

        public Criteria andFeeAppearDateNotEqualTo(Date value) {
            addCriterion("feeAppearDate <>", value, "feeAppearDate");
            return (Criteria) this;
        }

        public Criteria andFeeAppearDateGreaterThan(Date value) {
            addCriterion("feeAppearDate >", value, "feeAppearDate");
            return (Criteria) this;
        }

        public Criteria andFeeAppearDateGreaterThanOrEqualTo(Date value) {
            addCriterion("feeAppearDate >=", value, "feeAppearDate");
            return (Criteria) this;
        }

        public Criteria andFeeAppearDateLessThan(Date value) {
            addCriterion("feeAppearDate <", value, "feeAppearDate");
            return (Criteria) this;
        }

        public Criteria andFeeAppearDateLessThanOrEqualTo(Date value) {
            addCriterion("feeAppearDate <=", value, "feeAppearDate");
            return (Criteria) this;
        }

        public Criteria andFeeAppearDateIn(List<Date> values) {
            addCriterion("feeAppearDate in", values, "feeAppearDate");
            return (Criteria) this;
        }

        public Criteria andFeeAppearDateNotIn(List<Date> values) {
            addCriterion("feeAppearDate not in", values, "feeAppearDate");
            return (Criteria) this;
        }

        public Criteria andFeeAppearDateBetween(Date value1, Date value2) {
            addCriterion("feeAppearDate between", value1, value2, "feeAppearDate");
            return (Criteria) this;
        }

        public Criteria andFeeAppearDateNotBetween(Date value1, Date value2) {
            addCriterion("feeAppearDate not between", value1, value2, "feeAppearDate");
            return (Criteria) this;
        }

        public Criteria andFeeIDIsNull() {
            addCriterion("feeID is null");
            return (Criteria) this;
        }

        public Criteria andFeeIDIsNotNull() {
            addCriterion("feeID is not null");
            return (Criteria) this;
        }

        public Criteria andFeeIDEqualTo(Integer value) {
            addCriterion("feeID =", value, "feeID");
            return (Criteria) this;
        }

        public Criteria andFeeIDNotEqualTo(Integer value) {
            addCriterion("feeID <>", value, "feeID");
            return (Criteria) this;
        }

        public Criteria andFeeIDGreaterThan(Integer value) {
            addCriterion("feeID >", value, "feeID");
            return (Criteria) this;
        }

        public Criteria andFeeIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("feeID >=", value, "feeID");
            return (Criteria) this;
        }

        public Criteria andFeeIDLessThan(Integer value) {
            addCriterion("feeID <", value, "feeID");
            return (Criteria) this;
        }

        public Criteria andFeeIDLessThanOrEqualTo(Integer value) {
            addCriterion("feeID <=", value, "feeID");
            return (Criteria) this;
        }

        public Criteria andFeeIDIn(List<Integer> values) {
            addCriterion("feeID in", values, "feeID");
            return (Criteria) this;
        }

        public Criteria andFeeIDNotIn(List<Integer> values) {
            addCriterion("feeID not in", values, "feeID");
            return (Criteria) this;
        }

        public Criteria andFeeIDBetween(Integer value1, Integer value2) {
            addCriterion("feeID between", value1, value2, "feeID");
            return (Criteria) this;
        }

        public Criteria andFeeIDNotBetween(Integer value1, Integer value2) {
            addCriterion("feeID not between", value1, value2, "feeID");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNull() {
            addCriterion("payStatus is null");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNotNull() {
            addCriterion("payStatus is not null");
            return (Criteria) this;
        }

        public Criteria andPayStatusEqualTo(String value) {
            addCriterion("payStatus =", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotEqualTo(String value) {
            addCriterion("payStatus <>", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThan(String value) {
            addCriterion("payStatus >", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThanOrEqualTo(String value) {
            addCriterion("payStatus >=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThan(String value) {
            addCriterion("payStatus <", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThanOrEqualTo(String value) {
            addCriterion("payStatus <=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLike(String value) {
            addCriterion("payStatus like", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotLike(String value) {
            addCriterion("payStatus not like", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusIn(List<String> values) {
            addCriterion("payStatus in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotIn(List<String> values) {
            addCriterion("payStatus not in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusBetween(String value1, String value2) {
            addCriterion("payStatus between", value1, value2, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotBetween(String value1, String value2) {
            addCriterion("payStatus not between", value1, value2, "payStatus");
            return (Criteria) this;
        }

        public Criteria andDateStatusIsNull() {
            addCriterion("dateStatus is null");
            return (Criteria) this;
        }

        public Criteria andDateStatusIsNotNull() {
            addCriterion("dateStatus is not null");
            return (Criteria) this;
        }

        public Criteria andDateStatusEqualTo(String value) {
            addCriterion("dateStatus =", value, "dateStatus");
            return (Criteria) this;
        }

        public Criteria andDateStatusNotEqualTo(String value) {
            addCriterion("dateStatus <>", value, "dateStatus");
            return (Criteria) this;
        }

        public Criteria andDateStatusGreaterThan(String value) {
            addCriterion("dateStatus >", value, "dateStatus");
            return (Criteria) this;
        }

        public Criteria andDateStatusGreaterThanOrEqualTo(String value) {
            addCriterion("dateStatus >=", value, "dateStatus");
            return (Criteria) this;
        }

        public Criteria andDateStatusLessThan(String value) {
            addCriterion("dateStatus <", value, "dateStatus");
            return (Criteria) this;
        }

        public Criteria andDateStatusLessThanOrEqualTo(String value) {
            addCriterion("dateStatus <=", value, "dateStatus");
            return (Criteria) this;
        }

        public Criteria andDateStatusLike(String value) {
            addCriterion("dateStatus like", value, "dateStatus");
            return (Criteria) this;
        }

        public Criteria andDateStatusNotLike(String value) {
            addCriterion("dateStatus not like", value, "dateStatus");
            return (Criteria) this;
        }

        public Criteria andDateStatusIn(List<String> values) {
            addCriterion("dateStatus in", values, "dateStatus");
            return (Criteria) this;
        }

        public Criteria andDateStatusNotIn(List<String> values) {
            addCriterion("dateStatus not in", values, "dateStatus");
            return (Criteria) this;
        }

        public Criteria andDateStatusBetween(String value1, String value2) {
            addCriterion("dateStatus between", value1, value2, "dateStatus");
            return (Criteria) this;
        }

        public Criteria andDateStatusNotBetween(String value1, String value2) {
            addCriterion("dateStatus not between", value1, value2, "dateStatus");
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