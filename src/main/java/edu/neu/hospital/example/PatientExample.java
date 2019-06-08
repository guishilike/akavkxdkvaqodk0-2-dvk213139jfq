package edu.neu.hospital.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PatientExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public PatientExample() {
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

        public Criteria andPatientnameIsNull() {
            addCriterion("patientName is null");
            return (Criteria) this;
        }

        public Criteria andPatientnameIsNotNull() {
            addCriterion("patientName is not null");
            return (Criteria) this;
        }

        public Criteria andPatientnameEqualTo(String value) {
            addCriterion("patientName =", value, "patientname");
            return (Criteria) this;
        }

        public Criteria andPatientnameNotEqualTo(String value) {
            addCriterion("patientName <>", value, "patientname");
            return (Criteria) this;
        }

        public Criteria andPatientnameGreaterThan(String value) {
            addCriterion("patientName >", value, "patientname");
            return (Criteria) this;
        }

        public Criteria andPatientnameGreaterThanOrEqualTo(String value) {
            addCriterion("patientName >=", value, "patientname");
            return (Criteria) this;
        }

        public Criteria andPatientnameLessThan(String value) {
            addCriterion("patientName <", value, "patientname");
            return (Criteria) this;
        }

        public Criteria andPatientnameLessThanOrEqualTo(String value) {
            addCriterion("patientName <=", value, "patientname");
            return (Criteria) this;
        }

        public Criteria andPatientnameLike(String value) {
            addCriterion("patientName like", value, "patientname");
            return (Criteria) this;
        }

        public Criteria andPatientnameNotLike(String value) {
            addCriterion("patientName not like", value, "patientname");
            return (Criteria) this;
        }

        public Criteria andPatientnameIn(List<String> values) {
            addCriterion("patientName in", values, "patientname");
            return (Criteria) this;
        }

        public Criteria andPatientnameNotIn(List<String> values) {
            addCriterion("patientName not in", values, "patientname");
            return (Criteria) this;
        }

        public Criteria andPatientnameBetween(String value1, String value2) {
            addCriterion("patientName between", value1, value2, "patientname");
            return (Criteria) this;
        }

        public Criteria andPatientnameNotBetween(String value1, String value2) {
            addCriterion("patientName not between", value1, value2, "patientname");
            return (Criteria) this;
        }

        public Criteria andIdentitycardnoIsNull() {
            addCriterion("IdentityCardNo is null");
            return (Criteria) this;
        }

        public Criteria andIdentitycardnoIsNotNull() {
            addCriterion("IdentityCardNo is not null");
            return (Criteria) this;
        }

        public Criteria andIdentitycardnoEqualTo(String value) {
            addCriterion("IdentityCardNo =", value, "identitycardno");
            return (Criteria) this;
        }

        public Criteria andIdentitycardnoNotEqualTo(String value) {
            addCriterion("IdentityCardNo <>", value, "identitycardno");
            return (Criteria) this;
        }

        public Criteria andIdentitycardnoGreaterThan(String value) {
            addCriterion("IdentityCardNo >", value, "identitycardno");
            return (Criteria) this;
        }

        public Criteria andIdentitycardnoGreaterThanOrEqualTo(String value) {
            addCriterion("IdentityCardNo >=", value, "identitycardno");
            return (Criteria) this;
        }

        public Criteria andIdentitycardnoLessThan(String value) {
            addCriterion("IdentityCardNo <", value, "identitycardno");
            return (Criteria) this;
        }

        public Criteria andIdentitycardnoLessThanOrEqualTo(String value) {
            addCriterion("IdentityCardNo <=", value, "identitycardno");
            return (Criteria) this;
        }

        public Criteria andIdentitycardnoLike(String value) {
            addCriterion("IdentityCardNo like", value, "identitycardno");
            return (Criteria) this;
        }

        public Criteria andIdentitycardnoNotLike(String value) {
            addCriterion("IdentityCardNo not like", value, "identitycardno");
            return (Criteria) this;
        }

        public Criteria andIdentitycardnoIn(List<String> values) {
            addCriterion("IdentityCardNo in", values, "identitycardno");
            return (Criteria) this;
        }

        public Criteria andIdentitycardnoNotIn(List<String> values) {
            addCriterion("IdentityCardNo not in", values, "identitycardno");
            return (Criteria) this;
        }

        public Criteria andIdentitycardnoBetween(String value1, String value2) {
            addCriterion("IdentityCardNo between", value1, value2, "identitycardno");
            return (Criteria) this;
        }

        public Criteria andIdentitycardnoNotBetween(String value1, String value2) {
            addCriterion("IdentityCardNo not between", value1, value2, "identitycardno");
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

        public Criteria andFamilyaddressIsNull() {
            addCriterion("familyAddress is null");
            return (Criteria) this;
        }

        public Criteria andFamilyaddressIsNotNull() {
            addCriterion("familyAddress is not null");
            return (Criteria) this;
        }

        public Criteria andFamilyaddressEqualTo(String value) {
            addCriterion("familyAddress =", value, "familyaddress");
            return (Criteria) this;
        }

        public Criteria andFamilyaddressNotEqualTo(String value) {
            addCriterion("familyAddress <>", value, "familyaddress");
            return (Criteria) this;
        }

        public Criteria andFamilyaddressGreaterThan(String value) {
            addCriterion("familyAddress >", value, "familyaddress");
            return (Criteria) this;
        }

        public Criteria andFamilyaddressGreaterThanOrEqualTo(String value) {
            addCriterion("familyAddress >=", value, "familyaddress");
            return (Criteria) this;
        }

        public Criteria andFamilyaddressLessThan(String value) {
            addCriterion("familyAddress <", value, "familyaddress");
            return (Criteria) this;
        }

        public Criteria andFamilyaddressLessThanOrEqualTo(String value) {
            addCriterion("familyAddress <=", value, "familyaddress");
            return (Criteria) this;
        }

        public Criteria andFamilyaddressLike(String value) {
            addCriterion("familyAddress like", value, "familyaddress");
            return (Criteria) this;
        }

        public Criteria andFamilyaddressNotLike(String value) {
            addCriterion("familyAddress not like", value, "familyaddress");
            return (Criteria) this;
        }

        public Criteria andFamilyaddressIn(List<String> values) {
            addCriterion("familyAddress in", values, "familyaddress");
            return (Criteria) this;
        }

        public Criteria andFamilyaddressNotIn(List<String> values) {
            addCriterion("familyAddress not in", values, "familyaddress");
            return (Criteria) this;
        }

        public Criteria andFamilyaddressBetween(String value1, String value2) {
            addCriterion("familyAddress between", value1, value2, "familyaddress");
            return (Criteria) this;
        }

        public Criteria andFamilyaddressNotBetween(String value1, String value2) {
            addCriterion("familyAddress not between", value1, value2, "familyaddress");
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

        public Criteria andAppearuseridIsNull() {
            addCriterion("appearUserID is null");
            return (Criteria) this;
        }

        public Criteria andAppearuseridIsNotNull() {
            addCriterion("appearUserID is not null");
            return (Criteria) this;
        }

        public Criteria andAppearuseridEqualTo(Integer value) {
            addCriterion("appearUserID =", value, "appearuserid");
            return (Criteria) this;
        }

        public Criteria andAppearuseridNotEqualTo(Integer value) {
            addCriterion("appearUserID <>", value, "appearuserid");
            return (Criteria) this;
        }

        public Criteria andAppearuseridGreaterThan(Integer value) {
            addCriterion("appearUserID >", value, "appearuserid");
            return (Criteria) this;
        }

        public Criteria andAppearuseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("appearUserID >=", value, "appearuserid");
            return (Criteria) this;
        }

        public Criteria andAppearuseridLessThan(Integer value) {
            addCriterion("appearUserID <", value, "appearuserid");
            return (Criteria) this;
        }

        public Criteria andAppearuseridLessThanOrEqualTo(Integer value) {
            addCriterion("appearUserID <=", value, "appearuserid");
            return (Criteria) this;
        }

        public Criteria andAppearuseridIn(List<Integer> values) {
            addCriterion("appearUserID in", values, "appearuserid");
            return (Criteria) this;
        }

        public Criteria andAppearuseridNotIn(List<Integer> values) {
            addCriterion("appearUserID not in", values, "appearuserid");
            return (Criteria) this;
        }

        public Criteria andAppearuseridBetween(Integer value1, Integer value2) {
            addCriterion("appearUserID between", value1, value2, "appearuserid");
            return (Criteria) this;
        }

        public Criteria andAppearuseridNotBetween(Integer value1, Integer value2) {
            addCriterion("appearUserID not between", value1, value2, "appearuserid");
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