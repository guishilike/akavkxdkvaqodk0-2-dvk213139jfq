package edu.neu.hospital.example.takeMedicineExample;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TakeMedicineFormViewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public TakeMedicineFormViewExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause(String appearDate_asc) {
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

        public Criteria andMedicalRecordNoIsNull() {
            addCriterion("medicalRecordNo is null");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordNoIsNotNull() {
            addCriterion("medicalRecordNo is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordNoEqualTo(String value) {
            addCriterion("medicalRecordNo =", value, "medicalRecordNo");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordNoNotEqualTo(String value) {
            addCriterion("medicalRecordNo <>", value, "medicalRecordNo");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordNoGreaterThan(String value) {
            addCriterion("medicalRecordNo >", value, "medicalRecordNo");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordNoGreaterThanOrEqualTo(String value) {
            addCriterion("medicalRecordNo >=", value, "medicalRecordNo");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordNoLessThan(String value) {
            addCriterion("medicalRecordNo <", value, "medicalRecordNo");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordNoLessThanOrEqualTo(String value) {
            addCriterion("medicalRecordNo <=", value, "medicalRecordNo");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordNoLike(String value) {
            addCriterion("medicalRecordNo like", value, "medicalRecordNo");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordNoNotLike(String value) {
            addCriterion("medicalRecordNo not like", value, "medicalRecordNo");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordNoIn(List<String> values) {
            addCriterion("medicalRecordNo in", values, "medicalRecordNo");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordNoNotIn(List<String> values) {
            addCriterion("medicalRecordNo not in", values, "medicalRecordNo");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordNoBetween(String value1, String value2) {
            addCriterion("medicalRecordNo between", value1, value2, "medicalRecordNo");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordNoNotBetween(String value1, String value2) {
            addCriterion("medicalRecordNo not between", value1, value2, "medicalRecordNo");
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

        public Criteria andIdentityCardNoIsNull() {
            addCriterion("IdentityCardNo is null");
            return (Criteria) this;
        }

        public Criteria andIdentityCardNoIsNotNull() {
            addCriterion("IdentityCardNo is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityCardNoEqualTo(String value) {
            addCriterion("IdentityCardNo =", value, "identityCardNo");
            return (Criteria) this;
        }

        public Criteria andIdentityCardNoNotEqualTo(String value) {
            addCriterion("IdentityCardNo <>", value, "identityCardNo");
            return (Criteria) this;
        }

        public Criteria andIdentityCardNoGreaterThan(String value) {
            addCriterion("IdentityCardNo >", value, "identityCardNo");
            return (Criteria) this;
        }

        public Criteria andIdentityCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("IdentityCardNo >=", value, "identityCardNo");
            return (Criteria) this;
        }

        public Criteria andIdentityCardNoLessThan(String value) {
            addCriterion("IdentityCardNo <", value, "identityCardNo");
            return (Criteria) this;
        }

        public Criteria andIdentityCardNoLessThanOrEqualTo(String value) {
            addCriterion("IdentityCardNo <=", value, "identityCardNo");
            return (Criteria) this;
        }

        public Criteria andIdentityCardNoLike(String value) {
            addCriterion("IdentityCardNo like", value, "identityCardNo");
            return (Criteria) this;
        }

        public Criteria andIdentityCardNoNotLike(String value) {
            addCriterion("IdentityCardNo not like", value, "identityCardNo");
            return (Criteria) this;
        }

        public Criteria andIdentityCardNoIn(List<String> values) {
            addCriterion("IdentityCardNo in", values, "identityCardNo");
            return (Criteria) this;
        }

        public Criteria andIdentityCardNoNotIn(List<String> values) {
            addCriterion("IdentityCardNo not in", values, "identityCardNo");
            return (Criteria) this;
        }

        public Criteria andIdentityCardNoBetween(String value1, String value2) {
            addCriterion("IdentityCardNo between", value1, value2, "identityCardNo");
            return (Criteria) this;
        }

        public Criteria andIdentityCardNoNotBetween(String value1, String value2) {
            addCriterion("IdentityCardNo not between", value1, value2, "identityCardNo");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("gender like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("gender not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterion("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterion("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterion("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterion("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterion("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterion("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterion("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andFamilyAddressIsNull() {
            addCriterion("familyAddress is null");
            return (Criteria) this;
        }

        public Criteria andFamilyAddressIsNotNull() {
            addCriterion("familyAddress is not null");
            return (Criteria) this;
        }

        public Criteria andFamilyAddressEqualTo(String value) {
            addCriterion("familyAddress =", value, "familyAddress");
            return (Criteria) this;
        }

        public Criteria andFamilyAddressNotEqualTo(String value) {
            addCriterion("familyAddress <>", value, "familyAddress");
            return (Criteria) this;
        }

        public Criteria andFamilyAddressGreaterThan(String value) {
            addCriterion("familyAddress >", value, "familyAddress");
            return (Criteria) this;
        }

        public Criteria andFamilyAddressGreaterThanOrEqualTo(String value) {
            addCriterion("familyAddress >=", value, "familyAddress");
            return (Criteria) this;
        }

        public Criteria andFamilyAddressLessThan(String value) {
            addCriterion("familyAddress <", value, "familyAddress");
            return (Criteria) this;
        }

        public Criteria andFamilyAddressLessThanOrEqualTo(String value) {
            addCriterion("familyAddress <=", value, "familyAddress");
            return (Criteria) this;
        }

        public Criteria andFamilyAddressLike(String value) {
            addCriterion("familyAddress like", value, "familyAddress");
            return (Criteria) this;
        }

        public Criteria andFamilyAddressNotLike(String value) {
            addCriterion("familyAddress not like", value, "familyAddress");
            return (Criteria) this;
        }

        public Criteria andFamilyAddressIn(List<String> values) {
            addCriterion("familyAddress in", values, "familyAddress");
            return (Criteria) this;
        }

        public Criteria andFamilyAddressNotIn(List<String> values) {
            addCriterion("familyAddress not in", values, "familyAddress");
            return (Criteria) this;
        }

        public Criteria andFamilyAddressBetween(String value1, String value2) {
            addCriterion("familyAddress between", value1, value2, "familyAddress");
            return (Criteria) this;
        }

        public Criteria andFamilyAddressNotBetween(String value1, String value2) {
            addCriterion("familyAddress not between", value1, value2, "familyAddress");
            return (Criteria) this;
        }

        public Criteria andDiagnosisStatusIsNull() {
            addCriterion("diagnosisStatus is null");
            return (Criteria) this;
        }

        public Criteria andDiagnosisStatusIsNotNull() {
            addCriterion("diagnosisStatus is not null");
            return (Criteria) this;
        }

        public Criteria andDiagnosisStatusEqualTo(String value) {
            addCriterion("diagnosisStatus =", value, "diagnosisStatus");
            return (Criteria) this;
        }

        public Criteria andDiagnosisStatusNotEqualTo(String value) {
            addCriterion("diagnosisStatus <>", value, "diagnosisStatus");
            return (Criteria) this;
        }

        public Criteria andDiagnosisStatusGreaterThan(String value) {
            addCriterion("diagnosisStatus >", value, "diagnosisStatus");
            return (Criteria) this;
        }

        public Criteria andDiagnosisStatusGreaterThanOrEqualTo(String value) {
            addCriterion("diagnosisStatus >=", value, "diagnosisStatus");
            return (Criteria) this;
        }

        public Criteria andDiagnosisStatusLessThan(String value) {
            addCriterion("diagnosisStatus <", value, "diagnosisStatus");
            return (Criteria) this;
        }

        public Criteria andDiagnosisStatusLessThanOrEqualTo(String value) {
            addCriterion("diagnosisStatus <=", value, "diagnosisStatus");
            return (Criteria) this;
        }

        public Criteria andDiagnosisStatusLike(String value) {
            addCriterion("diagnosisStatus like", value, "diagnosisStatus");
            return (Criteria) this;
        }

        public Criteria andDiagnosisStatusNotLike(String value) {
            addCriterion("diagnosisStatus not like", value, "diagnosisStatus");
            return (Criteria) this;
        }

        public Criteria andDiagnosisStatusIn(List<String> values) {
            addCriterion("diagnosisStatus in", values, "diagnosisStatus");
            return (Criteria) this;
        }

        public Criteria andDiagnosisStatusNotIn(List<String> values) {
            addCriterion("diagnosisStatus not in", values, "diagnosisStatus");
            return (Criteria) this;
        }

        public Criteria andDiagnosisStatusBetween(String value1, String value2) {
            addCriterion("diagnosisStatus between", value1, value2, "diagnosisStatus");
            return (Criteria) this;
        }

        public Criteria andDiagnosisStatusNotBetween(String value1, String value2) {
            addCriterion("diagnosisStatus not between", value1, value2, "diagnosisStatus");
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

        public Criteria andDeptTypeNameIsNull() {
            addCriterion("deptTypeName is null");
            return (Criteria) this;
        }

        public Criteria andDeptTypeNameIsNotNull() {
            addCriterion("deptTypeName is not null");
            return (Criteria) this;
        }

        public Criteria andDeptTypeNameEqualTo(String value) {
            addCriterion("deptTypeName =", value, "deptTypeName");
            return (Criteria) this;
        }

        public Criteria andDeptTypeNameNotEqualTo(String value) {
            addCriterion("deptTypeName <>", value, "deptTypeName");
            return (Criteria) this;
        }

        public Criteria andDeptTypeNameGreaterThan(String value) {
            addCriterion("deptTypeName >", value, "deptTypeName");
            return (Criteria) this;
        }

        public Criteria andDeptTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("deptTypeName >=", value, "deptTypeName");
            return (Criteria) this;
        }

        public Criteria andDeptTypeNameLessThan(String value) {
            addCriterion("deptTypeName <", value, "deptTypeName");
            return (Criteria) this;
        }

        public Criteria andDeptTypeNameLessThanOrEqualTo(String value) {
            addCriterion("deptTypeName <=", value, "deptTypeName");
            return (Criteria) this;
        }

        public Criteria andDeptTypeNameLike(String value) {
            addCriterion("deptTypeName like", value, "deptTypeName");
            return (Criteria) this;
        }

        public Criteria andDeptTypeNameNotLike(String value) {
            addCriterion("deptTypeName not like", value, "deptTypeName");
            return (Criteria) this;
        }

        public Criteria andDeptTypeNameIn(List<String> values) {
            addCriterion("deptTypeName in", values, "deptTypeName");
            return (Criteria) this;
        }

        public Criteria andDeptTypeNameNotIn(List<String> values) {
            addCriterion("deptTypeName not in", values, "deptTypeName");
            return (Criteria) this;
        }

        public Criteria andDeptTypeNameBetween(String value1, String value2) {
            addCriterion("deptTypeName between", value1, value2, "deptTypeName");
            return (Criteria) this;
        }

        public Criteria andDeptTypeNameNotBetween(String value1, String value2) {
            addCriterion("deptTypeName not between", value1, value2, "deptTypeName");
            return (Criteria) this;
        }

        public Criteria andDeptCategoryNameIsNull() {
            addCriterion("deptCategoryName is null");
            return (Criteria) this;
        }

        public Criteria andDeptCategoryNameIsNotNull() {
            addCriterion("deptCategoryName is not null");
            return (Criteria) this;
        }

        public Criteria andDeptCategoryNameEqualTo(String value) {
            addCriterion("deptCategoryName =", value, "deptCategoryName");
            return (Criteria) this;
        }

        public Criteria andDeptCategoryNameNotEqualTo(String value) {
            addCriterion("deptCategoryName <>", value, "deptCategoryName");
            return (Criteria) this;
        }

        public Criteria andDeptCategoryNameGreaterThan(String value) {
            addCriterion("deptCategoryName >", value, "deptCategoryName");
            return (Criteria) this;
        }

        public Criteria andDeptCategoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("deptCategoryName >=", value, "deptCategoryName");
            return (Criteria) this;
        }

        public Criteria andDeptCategoryNameLessThan(String value) {
            addCriterion("deptCategoryName <", value, "deptCategoryName");
            return (Criteria) this;
        }

        public Criteria andDeptCategoryNameLessThanOrEqualTo(String value) {
            addCriterion("deptCategoryName <=", value, "deptCategoryName");
            return (Criteria) this;
        }

        public Criteria andDeptCategoryNameLike(String value) {
            addCriterion("deptCategoryName like", value, "deptCategoryName");
            return (Criteria) this;
        }

        public Criteria andDeptCategoryNameNotLike(String value) {
            addCriterion("deptCategoryName not like", value, "deptCategoryName");
            return (Criteria) this;
        }

        public Criteria andDeptCategoryNameIn(List<String> values) {
            addCriterion("deptCategoryName in", values, "deptCategoryName");
            return (Criteria) this;
        }

        public Criteria andDeptCategoryNameNotIn(List<String> values) {
            addCriterion("deptCategoryName not in", values, "deptCategoryName");
            return (Criteria) this;
        }

        public Criteria andDeptCategoryNameBetween(String value1, String value2) {
            addCriterion("deptCategoryName between", value1, value2, "deptCategoryName");
            return (Criteria) this;
        }

        public Criteria andDeptCategoryNameNotBetween(String value1, String value2) {
            addCriterion("deptCategoryName not between", value1, value2, "deptCategoryName");
            return (Criteria) this;
        }

        public Criteria andMarkIsNull() {
            addCriterion("mark is null");
            return (Criteria) this;
        }

        public Criteria andMarkIsNotNull() {
            addCriterion("mark is not null");
            return (Criteria) this;
        }

        public Criteria andMarkEqualTo(Integer value) {
            addCriterion("mark =", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotEqualTo(Integer value) {
            addCriterion("mark <>", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkGreaterThan(Integer value) {
            addCriterion("mark >", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkGreaterThanOrEqualTo(Integer value) {
            addCriterion("mark >=", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLessThan(Integer value) {
            addCriterion("mark <", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLessThanOrEqualTo(Integer value) {
            addCriterion("mark <=", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkIn(List<Integer> values) {
            addCriterion("mark in", values, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotIn(List<Integer> values) {
            addCriterion("mark not in", values, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkBetween(Integer value1, Integer value2) {
            addCriterion("mark between", value1, value2, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotBetween(Integer value1, Integer value2) {
            addCriterion("mark not between", value1, value2, "mark");
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