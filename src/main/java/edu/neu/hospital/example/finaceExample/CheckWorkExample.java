package edu.neu.hospital.example.finaceExample;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CheckWorkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public CheckWorkExample() {
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

        public Criteria andDoctorIDIsNull() {
            addCriterion("doctorID is null");
            return (Criteria) this;
        }

        public Criteria andDoctorIDIsNotNull() {
            addCriterion("doctorID is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorIDEqualTo(Integer value) {
            addCriterion("doctorID =", value, "doctorID");
            return (Criteria) this;
        }

        public Criteria andDoctorIDNotEqualTo(Integer value) {
            addCriterion("doctorID <>", value, "doctorID");
            return (Criteria) this;
        }

        public Criteria andDoctorIDGreaterThan(Integer value) {
            addCriterion("doctorID >", value, "doctorID");
            return (Criteria) this;
        }

        public Criteria andDoctorIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("doctorID >=", value, "doctorID");
            return (Criteria) this;
        }

        public Criteria andDoctorIDLessThan(Integer value) {
            addCriterion("doctorID <", value, "doctorID");
            return (Criteria) this;
        }

        public Criteria andDoctorIDLessThanOrEqualTo(Integer value) {
            addCriterion("doctorID <=", value, "doctorID");
            return (Criteria) this;
        }

        public Criteria andDoctorIDIn(List<Integer> values) {
            addCriterion("doctorID in", values, "doctorID");
            return (Criteria) this;
        }

        public Criteria andDoctorIDNotIn(List<Integer> values) {
            addCriterion("doctorID not in", values, "doctorID");
            return (Criteria) this;
        }

        public Criteria andDoctorIDBetween(Integer value1, Integer value2) {
            addCriterion("doctorID between", value1, value2, "doctorID");
            return (Criteria) this;
        }

        public Criteria andDoctorIDNotBetween(Integer value1, Integer value2) {
            addCriterion("doctorID not between", value1, value2, "doctorID");
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

        public Criteria andFeeCategoryNameIsNull() {
            addCriterion("feeCategoryName is null");
            return (Criteria) this;
        }

        public Criteria andFeeCategoryNameIsNotNull() {
            addCriterion("feeCategoryName is not null");
            return (Criteria) this;
        }

        public Criteria andFeeCategoryNameEqualTo(String value) {
            addCriterion("feeCategoryName =", value, "feeCategoryName");
            return (Criteria) this;
        }

        public Criteria andFeeCategoryNameNotEqualTo(String value) {
            addCriterion("feeCategoryName <>", value, "feeCategoryName");
            return (Criteria) this;
        }

        public Criteria andFeeCategoryNameGreaterThan(String value) {
            addCriterion("feeCategoryName >", value, "feeCategoryName");
            return (Criteria) this;
        }

        public Criteria andFeeCategoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("feeCategoryName >=", value, "feeCategoryName");
            return (Criteria) this;
        }

        public Criteria andFeeCategoryNameLessThan(String value) {
            addCriterion("feeCategoryName <", value, "feeCategoryName");
            return (Criteria) this;
        }

        public Criteria andFeeCategoryNameLessThanOrEqualTo(String value) {
            addCriterion("feeCategoryName <=", value, "feeCategoryName");
            return (Criteria) this;
        }

        public Criteria andFeeCategoryNameLike(String value) {
            addCriterion("feeCategoryName like", value, "feeCategoryName");
            return (Criteria) this;
        }

        public Criteria andFeeCategoryNameNotLike(String value) {
            addCriterion("feeCategoryName not like", value, "feeCategoryName");
            return (Criteria) this;
        }

        public Criteria andFeeCategoryNameIn(List<String> values) {
            addCriterion("feeCategoryName in", values, "feeCategoryName");
            return (Criteria) this;
        }

        public Criteria andFeeCategoryNameNotIn(List<String> values) {
            addCriterion("feeCategoryName not in", values, "feeCategoryName");
            return (Criteria) this;
        }

        public Criteria andFeeCategoryNameBetween(String value1, String value2) {
            addCriterion("feeCategoryName between", value1, value2, "feeCategoryName");
            return (Criteria) this;
        }

        public Criteria andFeeCategoryNameNotBetween(String value1, String value2) {
            addCriterion("feeCategoryName not between", value1, value2, "feeCategoryName");
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

        public Criteria andTollManIDIsNull() {
            addCriterion("tollManID is null");
            return (Criteria) this;
        }

        public Criteria andTollManIDIsNotNull() {
            addCriterion("tollManID is not null");
            return (Criteria) this;
        }

        public Criteria andTollManIDEqualTo(Integer value) {
            addCriterion("tollManID =", value, "tollManID");
            return (Criteria) this;
        }

        public Criteria andTollManIDNotEqualTo(Integer value) {
            addCriterion("tollManID <>", value, "tollManID");
            return (Criteria) this;
        }

        public Criteria andTollManIDGreaterThan(Integer value) {
            addCriterion("tollManID >", value, "tollManID");
            return (Criteria) this;
        }

        public Criteria andTollManIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("tollManID >=", value, "tollManID");
            return (Criteria) this;
        }

        public Criteria andTollManIDLessThan(Integer value) {
            addCriterion("tollManID <", value, "tollManID");
            return (Criteria) this;
        }

        public Criteria andTollManIDLessThanOrEqualTo(Integer value) {
            addCriterion("tollManID <=", value, "tollManID");
            return (Criteria) this;
        }

        public Criteria andTollManIDIn(List<Integer> values) {
            addCriterion("tollManID in", values, "tollManID");
            return (Criteria) this;
        }

        public Criteria andTollManIDNotIn(List<Integer> values) {
            addCriterion("tollManID not in", values, "tollManID");
            return (Criteria) this;
        }

        public Criteria andTollManIDBetween(Integer value1, Integer value2) {
            addCriterion("tollManID between", value1, value2, "tollManID");
            return (Criteria) this;
        }

        public Criteria andTollManIDNotBetween(Integer value1, Integer value2) {
            addCriterion("tollManID not between", value1, value2, "tollManID");
            return (Criteria) this;
        }

        public Criteria andTollmanNameIsNull() {
            addCriterion("tollmanName is null");
            return (Criteria) this;
        }

        public Criteria andTollmanNameIsNotNull() {
            addCriterion("tollmanName is not null");
            return (Criteria) this;
        }

        public Criteria andTollmanNameEqualTo(String value) {
            addCriterion("tollmanName =", value, "tollmanName");
            return (Criteria) this;
        }

        public Criteria andTollmanNameNotEqualTo(String value) {
            addCriterion("tollmanName <>", value, "tollmanName");
            return (Criteria) this;
        }

        public Criteria andTollmanNameGreaterThan(String value) {
            addCriterion("tollmanName >", value, "tollmanName");
            return (Criteria) this;
        }

        public Criteria andTollmanNameGreaterThanOrEqualTo(String value) {
            addCriterion("tollmanName >=", value, "tollmanName");
            return (Criteria) this;
        }

        public Criteria andTollmanNameLessThan(String value) {
            addCriterion("tollmanName <", value, "tollmanName");
            return (Criteria) this;
        }

        public Criteria andTollmanNameLessThanOrEqualTo(String value) {
            addCriterion("tollmanName <=", value, "tollmanName");
            return (Criteria) this;
        }

        public Criteria andTollmanNameLike(String value) {
            addCriterion("tollmanName like", value, "tollmanName");
            return (Criteria) this;
        }

        public Criteria andTollmanNameNotLike(String value) {
            addCriterion("tollmanName not like", value, "tollmanName");
            return (Criteria) this;
        }

        public Criteria andTollmanNameIn(List<String> values) {
            addCriterion("tollmanName in", values, "tollmanName");
            return (Criteria) this;
        }

        public Criteria andTollmanNameNotIn(List<String> values) {
            addCriterion("tollmanName not in", values, "tollmanName");
            return (Criteria) this;
        }

        public Criteria andTollmanNameBetween(String value1, String value2) {
            addCriterion("tollmanName between", value1, value2, "tollmanName");
            return (Criteria) this;
        }

        public Criteria andTollmanNameNotBetween(String value1, String value2) {
            addCriterion("tollmanName not between", value1, value2, "tollmanName");
            return (Criteria) this;
        }

        public Criteria andTollDateIsNull() {
            addCriterion("tollDate is null");
            return (Criteria) this;
        }

        public Criteria andTollDateIsNotNull() {
            addCriterion("tollDate is not null");
            return (Criteria) this;
        }

        public Criteria andTollDateEqualTo(Date value) {
            addCriterion("tollDate =", value, "tollDate");
            return (Criteria) this;
        }

        public Criteria andTollDateNotEqualTo(Date value) {
            addCriterion("tollDate <>", value, "tollDate");
            return (Criteria) this;
        }

        public Criteria andTollDateGreaterThan(Date value) {
            addCriterion("tollDate >", value, "tollDate");
            return (Criteria) this;
        }

        public Criteria andTollDateGreaterThanOrEqualTo(Date value) {
            addCriterion("tollDate >=", value, "tollDate");
            return (Criteria) this;
        }

        public Criteria andTollDateLessThan(Date value) {
            addCriterion("tollDate <", value, "tollDate");
            return (Criteria) this;
        }

        public Criteria andTollDateLessThanOrEqualTo(Date value) {
            addCriterion("tollDate <=", value, "tollDate");
            return (Criteria) this;
        }

        public Criteria andTollDateIn(List<Date> values) {
            addCriterion("tollDate in", values, "tollDate");
            return (Criteria) this;
        }

        public Criteria andTollDateNotIn(List<Date> values) {
            addCriterion("tollDate not in", values, "tollDate");
            return (Criteria) this;
        }

        public Criteria andTollDateBetween(Date value1, Date value2) {
            addCriterion("tollDate between", value1, value2, "tollDate");
            return (Criteria) this;
        }

        public Criteria andTollDateNotBetween(Date value1, Date value2) {
            addCriterion("tollDate not between", value1, value2, "tollDate");
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

        public Criteria andPayStatusEqualTo(Integer value) {
            addCriterion("payStatus =", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotEqualTo(Integer value) {
            addCriterion("payStatus <>", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThan(Integer value) {
            addCriterion("payStatus >", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("payStatus >=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThan(Integer value) {
            addCriterion("payStatus <", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThanOrEqualTo(Integer value) {
            addCriterion("payStatus <=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusIn(List<Integer> values) {
            addCriterion("payStatus in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotIn(List<Integer> values) {
            addCriterion("payStatus not in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusBetween(Integer value1, Integer value2) {
            addCriterion("payStatus between", value1, value2, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("payStatus not between", value1, value2, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusCodeIsNull() {
            addCriterion("paystatusCode is null");
            return (Criteria) this;
        }

        public Criteria andPaystatusCodeIsNotNull() {
            addCriterion("paystatusCode is not null");
            return (Criteria) this;
        }

        public Criteria andPaystatusCodeEqualTo(String value) {
            addCriterion("paystatusCode =", value, "paystatusCode");
            return (Criteria) this;
        }

        public Criteria andPaystatusCodeNotEqualTo(String value) {
            addCriterion("paystatusCode <>", value, "paystatusCode");
            return (Criteria) this;
        }

        public Criteria andPaystatusCodeGreaterThan(String value) {
            addCriterion("paystatusCode >", value, "paystatusCode");
            return (Criteria) this;
        }

        public Criteria andPaystatusCodeGreaterThanOrEqualTo(String value) {
            addCriterion("paystatusCode >=", value, "paystatusCode");
            return (Criteria) this;
        }

        public Criteria andPaystatusCodeLessThan(String value) {
            addCriterion("paystatusCode <", value, "paystatusCode");
            return (Criteria) this;
        }

        public Criteria andPaystatusCodeLessThanOrEqualTo(String value) {
            addCriterion("paystatusCode <=", value, "paystatusCode");
            return (Criteria) this;
        }

        public Criteria andPaystatusCodeLike(String value) {
            addCriterion("paystatusCode like", value, "paystatusCode");
            return (Criteria) this;
        }

        public Criteria andPaystatusCodeNotLike(String value) {
            addCriterion("paystatusCode not like", value, "paystatusCode");
            return (Criteria) this;
        }

        public Criteria andPaystatusCodeIn(List<String> values) {
            addCriterion("paystatusCode in", values, "paystatusCode");
            return (Criteria) this;
        }

        public Criteria andPaystatusCodeNotIn(List<String> values) {
            addCriterion("paystatusCode not in", values, "paystatusCode");
            return (Criteria) this;
        }

        public Criteria andPaystatusCodeBetween(String value1, String value2) {
            addCriterion("paystatusCode between", value1, value2, "paystatusCode");
            return (Criteria) this;
        }

        public Criteria andPaystatusCodeNotBetween(String value1, String value2) {
            addCriterion("paystatusCode not between", value1, value2, "paystatusCode");
            return (Criteria) this;
        }

        public Criteria andPaystatusNameIsNull() {
            addCriterion("paystatusName is null");
            return (Criteria) this;
        }

        public Criteria andPaystatusNameIsNotNull() {
            addCriterion("paystatusName is not null");
            return (Criteria) this;
        }

        public Criteria andPaystatusNameEqualTo(String value) {
            addCriterion("paystatusName =", value, "paystatusName");
            return (Criteria) this;
        }

        public Criteria andPaystatusNameNotEqualTo(String value) {
            addCriterion("paystatusName <>", value, "paystatusName");
            return (Criteria) this;
        }

        public Criteria andPaystatusNameGreaterThan(String value) {
            addCriterion("paystatusName >", value, "paystatusName");
            return (Criteria) this;
        }

        public Criteria andPaystatusNameGreaterThanOrEqualTo(String value) {
            addCriterion("paystatusName >=", value, "paystatusName");
            return (Criteria) this;
        }

        public Criteria andPaystatusNameLessThan(String value) {
            addCriterion("paystatusName <", value, "paystatusName");
            return (Criteria) this;
        }

        public Criteria andPaystatusNameLessThanOrEqualTo(String value) {
            addCriterion("paystatusName <=", value, "paystatusName");
            return (Criteria) this;
        }

        public Criteria andPaystatusNameLike(String value) {
            addCriterion("paystatusName like", value, "paystatusName");
            return (Criteria) this;
        }

        public Criteria andPaystatusNameNotLike(String value) {
            addCriterion("paystatusName not like", value, "paystatusName");
            return (Criteria) this;
        }

        public Criteria andPaystatusNameIn(List<String> values) {
            addCriterion("paystatusName in", values, "paystatusName");
            return (Criteria) this;
        }

        public Criteria andPaystatusNameNotIn(List<String> values) {
            addCriterion("paystatusName not in", values, "paystatusName");
            return (Criteria) this;
        }

        public Criteria andPaystatusNameBetween(String value1, String value2) {
            addCriterion("paystatusName between", value1, value2, "paystatusName");
            return (Criteria) this;
        }

        public Criteria andPaystatusNameNotBetween(String value1, String value2) {
            addCriterion("paystatusName not between", value1, value2, "paystatusName");
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

        public Criteria andDateStatusEqualTo(Integer value) {
            addCriterion("dateStatus =", value, "dateStatus");
            return (Criteria) this;
        }

        public Criteria andDateStatusNotEqualTo(Integer value) {
            addCriterion("dateStatus <>", value, "dateStatus");
            return (Criteria) this;
        }

        public Criteria andDateStatusGreaterThan(Integer value) {
            addCriterion("dateStatus >", value, "dateStatus");
            return (Criteria) this;
        }

        public Criteria andDateStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("dateStatus >=", value, "dateStatus");
            return (Criteria) this;
        }

        public Criteria andDateStatusLessThan(Integer value) {
            addCriterion("dateStatus <", value, "dateStatus");
            return (Criteria) this;
        }

        public Criteria andDateStatusLessThanOrEqualTo(Integer value) {
            addCriterion("dateStatus <=", value, "dateStatus");
            return (Criteria) this;
        }

        public Criteria andDateStatusIn(List<Integer> values) {
            addCriterion("dateStatus in", values, "dateStatus");
            return (Criteria) this;
        }

        public Criteria andDateStatusNotIn(List<Integer> values) {
            addCriterion("dateStatus not in", values, "dateStatus");
            return (Criteria) this;
        }

        public Criteria andDateStatusBetween(Integer value1, Integer value2) {
            addCriterion("dateStatus between", value1, value2, "dateStatus");
            return (Criteria) this;
        }

        public Criteria andDateStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("dateStatus not between", value1, value2, "dateStatus");
            return (Criteria) this;
        }

        public Criteria andDatestatusCodeIsNull() {
            addCriterion("datestatusCode is null");
            return (Criteria) this;
        }

        public Criteria andDatestatusCodeIsNotNull() {
            addCriterion("datestatusCode is not null");
            return (Criteria) this;
        }

        public Criteria andDatestatusCodeEqualTo(String value) {
            addCriterion("datestatusCode =", value, "datestatusCode");
            return (Criteria) this;
        }

        public Criteria andDatestatusCodeNotEqualTo(String value) {
            addCriterion("datestatusCode <>", value, "datestatusCode");
            return (Criteria) this;
        }

        public Criteria andDatestatusCodeGreaterThan(String value) {
            addCriterion("datestatusCode >", value, "datestatusCode");
            return (Criteria) this;
        }

        public Criteria andDatestatusCodeGreaterThanOrEqualTo(String value) {
            addCriterion("datestatusCode >=", value, "datestatusCode");
            return (Criteria) this;
        }

        public Criteria andDatestatusCodeLessThan(String value) {
            addCriterion("datestatusCode <", value, "datestatusCode");
            return (Criteria) this;
        }

        public Criteria andDatestatusCodeLessThanOrEqualTo(String value) {
            addCriterion("datestatusCode <=", value, "datestatusCode");
            return (Criteria) this;
        }

        public Criteria andDatestatusCodeLike(String value) {
            addCriterion("datestatusCode like", value, "datestatusCode");
            return (Criteria) this;
        }

        public Criteria andDatestatusCodeNotLike(String value) {
            addCriterion("datestatusCode not like", value, "datestatusCode");
            return (Criteria) this;
        }

        public Criteria andDatestatusCodeIn(List<String> values) {
            addCriterion("datestatusCode in", values, "datestatusCode");
            return (Criteria) this;
        }

        public Criteria andDatestatusCodeNotIn(List<String> values) {
            addCriterion("datestatusCode not in", values, "datestatusCode");
            return (Criteria) this;
        }

        public Criteria andDatestatusCodeBetween(String value1, String value2) {
            addCriterion("datestatusCode between", value1, value2, "datestatusCode");
            return (Criteria) this;
        }

        public Criteria andDatestatusCodeNotBetween(String value1, String value2) {
            addCriterion("datestatusCode not between", value1, value2, "datestatusCode");
            return (Criteria) this;
        }

        public Criteria andDatestatusNameIsNull() {
            addCriterion("datestatusName is null");
            return (Criteria) this;
        }

        public Criteria andDatestatusNameIsNotNull() {
            addCriterion("datestatusName is not null");
            return (Criteria) this;
        }

        public Criteria andDatestatusNameEqualTo(String value) {
            addCriterion("datestatusName =", value, "datestatusName");
            return (Criteria) this;
        }

        public Criteria andDatestatusNameNotEqualTo(String value) {
            addCriterion("datestatusName <>", value, "datestatusName");
            return (Criteria) this;
        }

        public Criteria andDatestatusNameGreaterThan(String value) {
            addCriterion("datestatusName >", value, "datestatusName");
            return (Criteria) this;
        }

        public Criteria andDatestatusNameGreaterThanOrEqualTo(String value) {
            addCriterion("datestatusName >=", value, "datestatusName");
            return (Criteria) this;
        }

        public Criteria andDatestatusNameLessThan(String value) {
            addCriterion("datestatusName <", value, "datestatusName");
            return (Criteria) this;
        }

        public Criteria andDatestatusNameLessThanOrEqualTo(String value) {
            addCriterion("datestatusName <=", value, "datestatusName");
            return (Criteria) this;
        }

        public Criteria andDatestatusNameLike(String value) {
            addCriterion("datestatusName like", value, "datestatusName");
            return (Criteria) this;
        }

        public Criteria andDatestatusNameNotLike(String value) {
            addCriterion("datestatusName not like", value, "datestatusName");
            return (Criteria) this;
        }

        public Criteria andDatestatusNameIn(List<String> values) {
            addCriterion("datestatusName in", values, "datestatusName");
            return (Criteria) this;
        }

        public Criteria andDatestatusNameNotIn(List<String> values) {
            addCriterion("datestatusName not in", values, "datestatusName");
            return (Criteria) this;
        }

        public Criteria andDatestatusNameBetween(String value1, String value2) {
            addCriterion("datestatusName between", value1, value2, "datestatusName");
            return (Criteria) this;
        }

        public Criteria andDatestatusNameNotBetween(String value1, String value2) {
            addCriterion("datestatusName not between", value1, value2, "datestatusName");
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