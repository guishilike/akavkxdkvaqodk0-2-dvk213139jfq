package edu.neu.hospital.example.basicTableExample;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RegistrationInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public RegistrationInfoExample() {
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

        public Criteria andPatientIDIsNull() {
            addCriterion("patientID is null");
            return (Criteria) this;
        }

        public Criteria andPatientIDIsNotNull() {
            addCriterion("patientID is not null");
            return (Criteria) this;
        }

        public Criteria andPatientIDEqualTo(Integer value) {
            addCriterion("patientID =", value, "patientID");
            return (Criteria) this;
        }

        public Criteria andPatientIDNotEqualTo(Integer value) {
            addCriterion("patientID <>", value, "patientID");
            return (Criteria) this;
        }

        public Criteria andPatientIDGreaterThan(Integer value) {
            addCriterion("patientID >", value, "patientID");
            return (Criteria) this;
        }

        public Criteria andPatientIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("patientID >=", value, "patientID");
            return (Criteria) this;
        }

        public Criteria andPatientIDLessThan(Integer value) {
            addCriterion("patientID <", value, "patientID");
            return (Criteria) this;
        }

        public Criteria andPatientIDLessThanOrEqualTo(Integer value) {
            addCriterion("patientID <=", value, "patientID");
            return (Criteria) this;
        }

        public Criteria andPatientIDIn(List<Integer> values) {
            addCriterion("patientID in", values, "patientID");
            return (Criteria) this;
        }

        public Criteria andPatientIDNotIn(List<Integer> values) {
            addCriterion("patientID not in", values, "patientID");
            return (Criteria) this;
        }

        public Criteria andPatientIDBetween(Integer value1, Integer value2) {
            addCriterion("patientID between", value1, value2, "patientID");
            return (Criteria) this;
        }

        public Criteria andPatientIDNotBetween(Integer value1, Integer value2) {
            addCriterion("patientID not between", value1, value2, "patientID");
            return (Criteria) this;
        }

        public Criteria andRegistrationLevelIDIsNull() {
            addCriterion("registrationLevelID is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationLevelIDIsNotNull() {
            addCriterion("registrationLevelID is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationLevelIDEqualTo(Integer value) {
            addCriterion("registrationLevelID =", value, "registrationLevelID");
            return (Criteria) this;
        }

        public Criteria andRegistrationLevelIDNotEqualTo(Integer value) {
            addCriterion("registrationLevelID <>", value, "registrationLevelID");
            return (Criteria) this;
        }

        public Criteria andRegistrationLevelIDGreaterThan(Integer value) {
            addCriterion("registrationLevelID >", value, "registrationLevelID");
            return (Criteria) this;
        }

        public Criteria andRegistrationLevelIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("registrationLevelID >=", value, "registrationLevelID");
            return (Criteria) this;
        }

        public Criteria andRegistrationLevelIDLessThan(Integer value) {
            addCriterion("registrationLevelID <", value, "registrationLevelID");
            return (Criteria) this;
        }

        public Criteria andRegistrationLevelIDLessThanOrEqualTo(Integer value) {
            addCriterion("registrationLevelID <=", value, "registrationLevelID");
            return (Criteria) this;
        }

        public Criteria andRegistrationLevelIDIn(List<Integer> values) {
            addCriterion("registrationLevelID in", values, "registrationLevelID");
            return (Criteria) this;
        }

        public Criteria andRegistrationLevelIDNotIn(List<Integer> values) {
            addCriterion("registrationLevelID not in", values, "registrationLevelID");
            return (Criteria) this;
        }

        public Criteria andRegistrationLevelIDBetween(Integer value1, Integer value2) {
            addCriterion("registrationLevelID between", value1, value2, "registrationLevelID");
            return (Criteria) this;
        }

        public Criteria andRegistrationLevelIDNotBetween(Integer value1, Integer value2) {
            addCriterion("registrationLevelID not between", value1, value2, "registrationLevelID");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateIsNull() {
            addCriterion("registrationDate is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateIsNotNull() {
            addCriterion("registrationDate is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateEqualTo(Date value) {
            addCriterion("registrationDate =", value, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateNotEqualTo(Date value) {
            addCriterion("registrationDate <>", value, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateGreaterThan(Date value) {
            addCriterion("registrationDate >", value, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateGreaterThanOrEqualTo(Date value) {
            addCriterion("registrationDate >=", value, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateLessThan(Date value) {
            addCriterion("registrationDate <", value, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateLessThanOrEqualTo(Date value) {
            addCriterion("registrationDate <=", value, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateIn(List<Date> values) {
            addCriterion("registrationDate in", values, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateNotIn(List<Date> values) {
            addCriterion("registrationDate not in", values, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateBetween(Date value1, Date value2) {
            addCriterion("registrationDate between", value1, value2, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateNotBetween(Date value1, Date value2) {
            addCriterion("registrationDate not between", value1, value2, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andSeeDoctorDateIsNull() {
            addCriterion("seeDoctorDate is null");
            return (Criteria) this;
        }

        public Criteria andSeeDoctorDateIsNotNull() {
            addCriterion("seeDoctorDate is not null");
            return (Criteria) this;
        }

        public Criteria andSeeDoctorDateEqualTo(Date value) {
            addCriterion("seeDoctorDate =", value, "seeDoctorDate");
            return (Criteria) this;
        }

        public Criteria andSeeDoctorDateNotEqualTo(Date value) {
            addCriterion("seeDoctorDate <>", value, "seeDoctorDate");
            return (Criteria) this;
        }

        public Criteria andSeeDoctorDateGreaterThan(Date value) {
            addCriterion("seeDoctorDate >", value, "seeDoctorDate");
            return (Criteria) this;
        }

        public Criteria andSeeDoctorDateGreaterThanOrEqualTo(Date value) {
            addCriterion("seeDoctorDate >=", value, "seeDoctorDate");
            return (Criteria) this;
        }

        public Criteria andSeeDoctorDateLessThan(Date value) {
            addCriterion("seeDoctorDate <", value, "seeDoctorDate");
            return (Criteria) this;
        }

        public Criteria andSeeDoctorDateLessThanOrEqualTo(Date value) {
            addCriterion("seeDoctorDate <=", value, "seeDoctorDate");
            return (Criteria) this;
        }

        public Criteria andSeeDoctorDateIn(List<Date> values) {
            addCriterion("seeDoctorDate in", values, "seeDoctorDate");
            return (Criteria) this;
        }

        public Criteria andSeeDoctorDateNotIn(List<Date> values) {
            addCriterion("seeDoctorDate not in", values, "seeDoctorDate");
            return (Criteria) this;
        }

        public Criteria andSeeDoctorDateBetween(Date value1, Date value2) {
            addCriterion("seeDoctorDate between", value1, value2, "seeDoctorDate");
            return (Criteria) this;
        }

        public Criteria andSeeDoctorDateNotBetween(Date value1, Date value2) {
            addCriterion("seeDoctorDate not between", value1, value2, "seeDoctorDate");
            return (Criteria) this;
        }

        public Criteria andDepartmentIDIsNull() {
            addCriterion("departmentID is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIDIsNotNull() {
            addCriterion("departmentID is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIDEqualTo(Integer value) {
            addCriterion("departmentID =", value, "departmentID");
            return (Criteria) this;
        }

        public Criteria andDepartmentIDNotEqualTo(Integer value) {
            addCriterion("departmentID <>", value, "departmentID");
            return (Criteria) this;
        }

        public Criteria andDepartmentIDGreaterThan(Integer value) {
            addCriterion("departmentID >", value, "departmentID");
            return (Criteria) this;
        }

        public Criteria andDepartmentIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("departmentID >=", value, "departmentID");
            return (Criteria) this;
        }

        public Criteria andDepartmentIDLessThan(Integer value) {
            addCriterion("departmentID <", value, "departmentID");
            return (Criteria) this;
        }

        public Criteria andDepartmentIDLessThanOrEqualTo(Integer value) {
            addCriterion("departmentID <=", value, "departmentID");
            return (Criteria) this;
        }

        public Criteria andDepartmentIDIn(List<Integer> values) {
            addCriterion("departmentID in", values, "departmentID");
            return (Criteria) this;
        }

        public Criteria andDepartmentIDNotIn(List<Integer> values) {
            addCriterion("departmentID not in", values, "departmentID");
            return (Criteria) this;
        }

        public Criteria andDepartmentIDBetween(Integer value1, Integer value2) {
            addCriterion("departmentID between", value1, value2, "departmentID");
            return (Criteria) this;
        }

        public Criteria andDepartmentIDNotBetween(Integer value1, Integer value2) {
            addCriterion("departmentID not between", value1, value2, "departmentID");
            return (Criteria) this;
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

        public Criteria andRegistrationSourceIDIsNull() {
            addCriterion("registrationSourceID is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationSourceIDIsNotNull() {
            addCriterion("registrationSourceID is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationSourceIDEqualTo(Integer value) {
            addCriterion("registrationSourceID =", value, "registrationSourceID");
            return (Criteria) this;
        }

        public Criteria andRegistrationSourceIDNotEqualTo(Integer value) {
            addCriterion("registrationSourceID <>", value, "registrationSourceID");
            return (Criteria) this;
        }

        public Criteria andRegistrationSourceIDGreaterThan(Integer value) {
            addCriterion("registrationSourceID >", value, "registrationSourceID");
            return (Criteria) this;
        }

        public Criteria andRegistrationSourceIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("registrationSourceID >=", value, "registrationSourceID");
            return (Criteria) this;
        }

        public Criteria andRegistrationSourceIDLessThan(Integer value) {
            addCriterion("registrationSourceID <", value, "registrationSourceID");
            return (Criteria) this;
        }

        public Criteria andRegistrationSourceIDLessThanOrEqualTo(Integer value) {
            addCriterion("registrationSourceID <=", value, "registrationSourceID");
            return (Criteria) this;
        }

        public Criteria andRegistrationSourceIDIn(List<Integer> values) {
            addCriterion("registrationSourceID in", values, "registrationSourceID");
            return (Criteria) this;
        }

        public Criteria andRegistrationSourceIDNotIn(List<Integer> values) {
            addCriterion("registrationSourceID not in", values, "registrationSourceID");
            return (Criteria) this;
        }

        public Criteria andRegistrationSourceIDBetween(Integer value1, Integer value2) {
            addCriterion("registrationSourceID between", value1, value2, "registrationSourceID");
            return (Criteria) this;
        }

        public Criteria andRegistrationSourceIDNotBetween(Integer value1, Integer value2) {
            addCriterion("registrationSourceID not between", value1, value2, "registrationSourceID");
            return (Criteria) this;
        }

        public Criteria andPaymentCategoryIDIsNull() {
            addCriterion("paymentCategoryID is null");
            return (Criteria) this;
        }

        public Criteria andPaymentCategoryIDIsNotNull() {
            addCriterion("paymentCategoryID is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentCategoryIDEqualTo(Integer value) {
            addCriterion("paymentCategoryID =", value, "paymentCategoryID");
            return (Criteria) this;
        }

        public Criteria andPaymentCategoryIDNotEqualTo(Integer value) {
            addCriterion("paymentCategoryID <>", value, "paymentCategoryID");
            return (Criteria) this;
        }

        public Criteria andPaymentCategoryIDGreaterThan(Integer value) {
            addCriterion("paymentCategoryID >", value, "paymentCategoryID");
            return (Criteria) this;
        }

        public Criteria andPaymentCategoryIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("paymentCategoryID >=", value, "paymentCategoryID");
            return (Criteria) this;
        }

        public Criteria andPaymentCategoryIDLessThan(Integer value) {
            addCriterion("paymentCategoryID <", value, "paymentCategoryID");
            return (Criteria) this;
        }

        public Criteria andPaymentCategoryIDLessThanOrEqualTo(Integer value) {
            addCriterion("paymentCategoryID <=", value, "paymentCategoryID");
            return (Criteria) this;
        }

        public Criteria andPaymentCategoryIDIn(List<Integer> values) {
            addCriterion("paymentCategoryID in", values, "paymentCategoryID");
            return (Criteria) this;
        }

        public Criteria andPaymentCategoryIDNotIn(List<Integer> values) {
            addCriterion("paymentCategoryID not in", values, "paymentCategoryID");
            return (Criteria) this;
        }

        public Criteria andPaymentCategoryIDBetween(Integer value1, Integer value2) {
            addCriterion("paymentCategoryID between", value1, value2, "paymentCategoryID");
            return (Criteria) this;
        }

        public Criteria andPaymentCategoryIDNotBetween(Integer value1, Integer value2) {
            addCriterion("paymentCategoryID not between", value1, value2, "paymentCategoryID");
            return (Criteria) this;
        }

        public Criteria andIsSeenDocatorIsNull() {
            addCriterion("isSeenDocator is null");
            return (Criteria) this;
        }

        public Criteria andIsSeenDocatorIsNotNull() {
            addCriterion("isSeenDocator is not null");
            return (Criteria) this;
        }

        public Criteria andIsSeenDocatorEqualTo(String value) {
            addCriterion("isSeenDocator =", value, "isSeenDocator");
            return (Criteria) this;
        }

        public Criteria andIsSeenDocatorNotEqualTo(String value) {
            addCriterion("isSeenDocator <>", value, "isSeenDocator");
            return (Criteria) this;
        }

        public Criteria andIsSeenDocatorGreaterThan(String value) {
            addCriterion("isSeenDocator >", value, "isSeenDocator");
            return (Criteria) this;
        }

        public Criteria andIsSeenDocatorGreaterThanOrEqualTo(String value) {
            addCriterion("isSeenDocator >=", value, "isSeenDocator");
            return (Criteria) this;
        }

        public Criteria andIsSeenDocatorLessThan(String value) {
            addCriterion("isSeenDocator <", value, "isSeenDocator");
            return (Criteria) this;
        }

        public Criteria andIsSeenDocatorLessThanOrEqualTo(String value) {
            addCriterion("isSeenDocator <=", value, "isSeenDocator");
            return (Criteria) this;
        }

        public Criteria andIsSeenDocatorLike(String value) {
            addCriterion("isSeenDocator like", value, "isSeenDocator");
            return (Criteria) this;
        }

        public Criteria andIsSeenDocatorNotLike(String value) {
            addCriterion("isSeenDocator not like", value, "isSeenDocator");
            return (Criteria) this;
        }

        public Criteria andIsSeenDocatorIn(List<String> values) {
            addCriterion("isSeenDocator in", values, "isSeenDocator");
            return (Criteria) this;
        }

        public Criteria andIsSeenDocatorNotIn(List<String> values) {
            addCriterion("isSeenDocator not in", values, "isSeenDocator");
            return (Criteria) this;
        }

        public Criteria andIsSeenDocatorBetween(String value1, String value2) {
            addCriterion("isSeenDocator between", value1, value2, "isSeenDocator");
            return (Criteria) this;
        }

        public Criteria andIsSeenDocatorNotBetween(String value1, String value2) {
            addCriterion("isSeenDocator not between", value1, value2, "isSeenDocator");
            return (Criteria) this;
        }

        public Criteria andExpenseIsNull() {
            addCriterion("expense is null");
            return (Criteria) this;
        }

        public Criteria andExpenseIsNotNull() {
            addCriterion("expense is not null");
            return (Criteria) this;
        }

        public Criteria andExpenseEqualTo(BigDecimal value) {
            addCriterion("expense =", value, "expense");
            return (Criteria) this;
        }

        public Criteria andExpenseNotEqualTo(BigDecimal value) {
            addCriterion("expense <>", value, "expense");
            return (Criteria) this;
        }

        public Criteria andExpenseGreaterThan(BigDecimal value) {
            addCriterion("expense >", value, "expense");
            return (Criteria) this;
        }

        public Criteria andExpenseGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("expense >=", value, "expense");
            return (Criteria) this;
        }

        public Criteria andExpenseLessThan(BigDecimal value) {
            addCriterion("expense <", value, "expense");
            return (Criteria) this;
        }

        public Criteria andExpenseLessThanOrEqualTo(BigDecimal value) {
            addCriterion("expense <=", value, "expense");
            return (Criteria) this;
        }

        public Criteria andExpenseIn(List<BigDecimal> values) {
            addCriterion("expense in", values, "expense");
            return (Criteria) this;
        }

        public Criteria andExpenseNotIn(List<BigDecimal> values) {
            addCriterion("expense not in", values, "expense");
            return (Criteria) this;
        }

        public Criteria andExpenseBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("expense between", value1, value2, "expense");
            return (Criteria) this;
        }

        public Criteria andExpenseNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("expense not between", value1, value2, "expense");
            return (Criteria) this;
        }

        public Criteria andRegistrationStatusIsNull() {
            addCriterion("registrationStatus is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationStatusIsNotNull() {
            addCriterion("registrationStatus is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationStatusEqualTo(String value) {
            addCriterion("registrationStatus =", value, "registrationStatus");
            return (Criteria) this;
        }

        public Criteria andRegistrationStatusNotEqualTo(String value) {
            addCriterion("registrationStatus <>", value, "registrationStatus");
            return (Criteria) this;
        }

        public Criteria andRegistrationStatusGreaterThan(String value) {
            addCriterion("registrationStatus >", value, "registrationStatus");
            return (Criteria) this;
        }

        public Criteria andRegistrationStatusGreaterThanOrEqualTo(String value) {
            addCriterion("registrationStatus >=", value, "registrationStatus");
            return (Criteria) this;
        }

        public Criteria andRegistrationStatusLessThan(String value) {
            addCriterion("registrationStatus <", value, "registrationStatus");
            return (Criteria) this;
        }

        public Criteria andRegistrationStatusLessThanOrEqualTo(String value) {
            addCriterion("registrationStatus <=", value, "registrationStatus");
            return (Criteria) this;
        }

        public Criteria andRegistrationStatusLike(String value) {
            addCriterion("registrationStatus like", value, "registrationStatus");
            return (Criteria) this;
        }

        public Criteria andRegistrationStatusNotLike(String value) {
            addCriterion("registrationStatus not like", value, "registrationStatus");
            return (Criteria) this;
        }

        public Criteria andRegistrationStatusIn(List<String> values) {
            addCriterion("registrationStatus in", values, "registrationStatus");
            return (Criteria) this;
        }

        public Criteria andRegistrationStatusNotIn(List<String> values) {
            addCriterion("registrationStatus not in", values, "registrationStatus");
            return (Criteria) this;
        }

        public Criteria andRegistrationStatusBetween(String value1, String value2) {
            addCriterion("registrationStatus between", value1, value2, "registrationStatus");
            return (Criteria) this;
        }

        public Criteria andRegistrationStatusNotBetween(String value1, String value2) {
            addCriterion("registrationStatus not between", value1, value2, "registrationStatus");
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

        public Criteria andReserve3IsNull() {
            addCriterion("reserve3 is null");
            return (Criteria) this;
        }

        public Criteria andReserve3IsNotNull() {
            addCriterion("reserve3 is not null");
            return (Criteria) this;
        }

        public Criteria andReserve3EqualTo(String value) {
            addCriterion("reserve3 =", value, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3NotEqualTo(String value) {
            addCriterion("reserve3 <>", value, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3GreaterThan(String value) {
            addCriterion("reserve3 >", value, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3GreaterThanOrEqualTo(String value) {
            addCriterion("reserve3 >=", value, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3LessThan(String value) {
            addCriterion("reserve3 <", value, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3LessThanOrEqualTo(String value) {
            addCriterion("reserve3 <=", value, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3Like(String value) {
            addCriterion("reserve3 like", value, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3NotLike(String value) {
            addCriterion("reserve3 not like", value, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3In(List<String> values) {
            addCriterion("reserve3 in", values, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3NotIn(List<String> values) {
            addCriterion("reserve3 not in", values, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3Between(String value1, String value2) {
            addCriterion("reserve3 between", value1, value2, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3NotBetween(String value1, String value2) {
            addCriterion("reserve3 not between", value1, value2, "reserve3");
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