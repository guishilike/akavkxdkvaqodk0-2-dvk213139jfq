package edu.neu.hospital.example.basicTableExample;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DisposalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public DisposalExample() {
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

        public Criteria andNumIsNull() {
            addCriterion("num is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("num is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(Integer value) {
            addCriterion("num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(Integer value) {
            addCriterion("num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(Integer value) {
            addCriterion("num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(Integer value) {
            addCriterion("num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(Integer value) {
            addCriterion("num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<Integer> values) {
            addCriterion("num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<Integer> values) {
            addCriterion("num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(Integer value1, Integer value2) {
            addCriterion("num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(Integer value1, Integer value2) {
            addCriterion("num not between", value1, value2, "num");
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

        public Criteria andIsDrawnIsNull() {
            addCriterion("isDrawn is null");
            return (Criteria) this;
        }

        public Criteria andIsDrawnIsNotNull() {
            addCriterion("isDrawn is not null");
            return (Criteria) this;
        }

        public Criteria andIsDrawnEqualTo(String value) {
            addCriterion("isDrawn =", value, "isDrawn");
            return (Criteria) this;
        }

        public Criteria andIsDrawnNotEqualTo(String value) {
            addCriterion("isDrawn <>", value, "isDrawn");
            return (Criteria) this;
        }

        public Criteria andIsDrawnGreaterThan(String value) {
            addCriterion("isDrawn >", value, "isDrawn");
            return (Criteria) this;
        }

        public Criteria andIsDrawnGreaterThanOrEqualTo(String value) {
            addCriterion("isDrawn >=", value, "isDrawn");
            return (Criteria) this;
        }

        public Criteria andIsDrawnLessThan(String value) {
            addCriterion("isDrawn <", value, "isDrawn");
            return (Criteria) this;
        }

        public Criteria andIsDrawnLessThanOrEqualTo(String value) {
            addCriterion("isDrawn <=", value, "isDrawn");
            return (Criteria) this;
        }

        public Criteria andIsDrawnLike(String value) {
            addCriterion("isDrawn like", value, "isDrawn");
            return (Criteria) this;
        }

        public Criteria andIsDrawnNotLike(String value) {
            addCriterion("isDrawn not like", value, "isDrawn");
            return (Criteria) this;
        }

        public Criteria andIsDrawnIn(List<String> values) {
            addCriterion("isDrawn in", values, "isDrawn");
            return (Criteria) this;
        }

        public Criteria andIsDrawnNotIn(List<String> values) {
            addCriterion("isDrawn not in", values, "isDrawn");
            return (Criteria) this;
        }

        public Criteria andIsDrawnBetween(String value1, String value2) {
            addCriterion("isDrawn between", value1, value2, "isDrawn");
            return (Criteria) this;
        }

        public Criteria andIsDrawnNotBetween(String value1, String value2) {
            addCriterion("isDrawn not between", value1, value2, "isDrawn");
            return (Criteria) this;
        }

        public Criteria andIsRegisteredIsNull() {
            addCriterion("isRegistered is null");
            return (Criteria) this;
        }

        public Criteria andIsRegisteredIsNotNull() {
            addCriterion("isRegistered is not null");
            return (Criteria) this;
        }

        public Criteria andIsRegisteredEqualTo(String value) {
            addCriterion("isRegistered =", value, "isRegistered");
            return (Criteria) this;
        }

        public Criteria andIsRegisteredNotEqualTo(String value) {
            addCriterion("isRegistered <>", value, "isRegistered");
            return (Criteria) this;
        }

        public Criteria andIsRegisteredGreaterThan(String value) {
            addCriterion("isRegistered >", value, "isRegistered");
            return (Criteria) this;
        }

        public Criteria andIsRegisteredGreaterThanOrEqualTo(String value) {
            addCriterion("isRegistered >=", value, "isRegistered");
            return (Criteria) this;
        }

        public Criteria andIsRegisteredLessThan(String value) {
            addCriterion("isRegistered <", value, "isRegistered");
            return (Criteria) this;
        }

        public Criteria andIsRegisteredLessThanOrEqualTo(String value) {
            addCriterion("isRegistered <=", value, "isRegistered");
            return (Criteria) this;
        }

        public Criteria andIsRegisteredLike(String value) {
            addCriterion("isRegistered like", value, "isRegistered");
            return (Criteria) this;
        }

        public Criteria andIsRegisteredNotLike(String value) {
            addCriterion("isRegistered not like", value, "isRegistered");
            return (Criteria) this;
        }

        public Criteria andIsRegisteredIn(List<String> values) {
            addCriterion("isRegistered in", values, "isRegistered");
            return (Criteria) this;
        }

        public Criteria andIsRegisteredNotIn(List<String> values) {
            addCriterion("isRegistered not in", values, "isRegistered");
            return (Criteria) this;
        }

        public Criteria andIsRegisteredBetween(String value1, String value2) {
            addCriterion("isRegistered between", value1, value2, "isRegistered");
            return (Criteria) this;
        }

        public Criteria andIsRegisteredNotBetween(String value1, String value2) {
            addCriterion("isRegistered not between", value1, value2, "isRegistered");
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