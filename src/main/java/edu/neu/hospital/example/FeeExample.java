package edu.neu.hospital.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FeeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public FeeExample() {
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

        public Criteria andMedicalrecordidIsNull() {
            addCriterion("medicalRecordID is null");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordidIsNotNull() {
            addCriterion("medicalRecordID is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordidEqualTo(Integer value) {
            addCriterion("medicalRecordID =", value, "medicalrecordid");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordidNotEqualTo(Integer value) {
            addCriterion("medicalRecordID <>", value, "medicalrecordid");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordidGreaterThan(Integer value) {
            addCriterion("medicalRecordID >", value, "medicalrecordid");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordidGreaterThanOrEqualTo(Integer value) {
            addCriterion("medicalRecordID >=", value, "medicalrecordid");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordidLessThan(Integer value) {
            addCriterion("medicalRecordID <", value, "medicalrecordid");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordidLessThanOrEqualTo(Integer value) {
            addCriterion("medicalRecordID <=", value, "medicalrecordid");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordidIn(List<Integer> values) {
            addCriterion("medicalRecordID in", values, "medicalrecordid");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordidNotIn(List<Integer> values) {
            addCriterion("medicalRecordID not in", values, "medicalrecordid");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordidBetween(Integer value1, Integer value2) {
            addCriterion("medicalRecordID between", value1, value2, "medicalrecordid");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordidNotBetween(Integer value1, Integer value2) {
            addCriterion("medicalRecordID not between", value1, value2, "medicalrecordid");
            return (Criteria) this;
        }

        public Criteria andFeecategoryidIsNull() {
            addCriterion("feeCategoryID is null");
            return (Criteria) this;
        }

        public Criteria andFeecategoryidIsNotNull() {
            addCriterion("feeCategoryID is not null");
            return (Criteria) this;
        }

        public Criteria andFeecategoryidEqualTo(Integer value) {
            addCriterion("feeCategoryID =", value, "feecategoryid");
            return (Criteria) this;
        }

        public Criteria andFeecategoryidNotEqualTo(Integer value) {
            addCriterion("feeCategoryID <>", value, "feecategoryid");
            return (Criteria) this;
        }

        public Criteria andFeecategoryidGreaterThan(Integer value) {
            addCriterion("feeCategoryID >", value, "feecategoryid");
            return (Criteria) this;
        }

        public Criteria andFeecategoryidGreaterThanOrEqualTo(Integer value) {
            addCriterion("feeCategoryID >=", value, "feecategoryid");
            return (Criteria) this;
        }

        public Criteria andFeecategoryidLessThan(Integer value) {
            addCriterion("feeCategoryID <", value, "feecategoryid");
            return (Criteria) this;
        }

        public Criteria andFeecategoryidLessThanOrEqualTo(Integer value) {
            addCriterion("feeCategoryID <=", value, "feecategoryid");
            return (Criteria) this;
        }

        public Criteria andFeecategoryidIn(List<Integer> values) {
            addCriterion("feeCategoryID in", values, "feecategoryid");
            return (Criteria) this;
        }

        public Criteria andFeecategoryidNotIn(List<Integer> values) {
            addCriterion("feeCategoryID not in", values, "feecategoryid");
            return (Criteria) this;
        }

        public Criteria andFeecategoryidBetween(Integer value1, Integer value2) {
            addCriterion("feeCategoryID between", value1, value2, "feecategoryid");
            return (Criteria) this;
        }

        public Criteria andFeecategoryidNotBetween(Integer value1, Integer value2) {
            addCriterion("feeCategoryID not between", value1, value2, "feecategoryid");
            return (Criteria) this;
        }

        public Criteria andChargeitemidIsNull() {
            addCriterion("chargeItemID is null");
            return (Criteria) this;
        }

        public Criteria andChargeitemidIsNotNull() {
            addCriterion("chargeItemID is not null");
            return (Criteria) this;
        }

        public Criteria andChargeitemidEqualTo(Integer value) {
            addCriterion("chargeItemID =", value, "chargeitemid");
            return (Criteria) this;
        }

        public Criteria andChargeitemidNotEqualTo(Integer value) {
            addCriterion("chargeItemID <>", value, "chargeitemid");
            return (Criteria) this;
        }

        public Criteria andChargeitemidGreaterThan(Integer value) {
            addCriterion("chargeItemID >", value, "chargeitemid");
            return (Criteria) this;
        }

        public Criteria andChargeitemidGreaterThanOrEqualTo(Integer value) {
            addCriterion("chargeItemID >=", value, "chargeitemid");
            return (Criteria) this;
        }

        public Criteria andChargeitemidLessThan(Integer value) {
            addCriterion("chargeItemID <", value, "chargeitemid");
            return (Criteria) this;
        }

        public Criteria andChargeitemidLessThanOrEqualTo(Integer value) {
            addCriterion("chargeItemID <=", value, "chargeitemid");
            return (Criteria) this;
        }

        public Criteria andChargeitemidIn(List<Integer> values) {
            addCriterion("chargeItemID in", values, "chargeitemid");
            return (Criteria) this;
        }

        public Criteria andChargeitemidNotIn(List<Integer> values) {
            addCriterion("chargeItemID not in", values, "chargeitemid");
            return (Criteria) this;
        }

        public Criteria andChargeitemidBetween(Integer value1, Integer value2) {
            addCriterion("chargeItemID between", value1, value2, "chargeitemid");
            return (Criteria) this;
        }

        public Criteria andChargeitemidNotBetween(Integer value1, Integer value2) {
            addCriterion("chargeItemID not between", value1, value2, "chargeitemid");
            return (Criteria) this;
        }

        public Criteria andFeeIsNull() {
            addCriterion("fee is null");
            return (Criteria) this;
        }

        public Criteria andFeeIsNotNull() {
            addCriterion("fee is not null");
            return (Criteria) this;
        }

        public Criteria andFeeEqualTo(BigDecimal value) {
            addCriterion("fee =", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotEqualTo(BigDecimal value) {
            addCriterion("fee <>", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeGreaterThan(BigDecimal value) {
            addCriterion("fee >", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fee >=", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeLessThan(BigDecimal value) {
            addCriterion("fee <", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fee <=", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeIn(List<BigDecimal> values) {
            addCriterion("fee in", values, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotIn(List<BigDecimal> values) {
            addCriterion("fee not in", values, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fee between", value1, value2, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fee not between", value1, value2, "fee");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodidIsNull() {
            addCriterion("paymentMethodID is null");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodidIsNotNull() {
            addCriterion("paymentMethodID is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodidEqualTo(Integer value) {
            addCriterion("paymentMethodID =", value, "paymentmethodid");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodidNotEqualTo(Integer value) {
            addCriterion("paymentMethodID <>", value, "paymentmethodid");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodidGreaterThan(Integer value) {
            addCriterion("paymentMethodID >", value, "paymentmethodid");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodidGreaterThanOrEqualTo(Integer value) {
            addCriterion("paymentMethodID >=", value, "paymentmethodid");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodidLessThan(Integer value) {
            addCriterion("paymentMethodID <", value, "paymentmethodid");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodidLessThanOrEqualTo(Integer value) {
            addCriterion("paymentMethodID <=", value, "paymentmethodid");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodidIn(List<Integer> values) {
            addCriterion("paymentMethodID in", values, "paymentmethodid");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodidNotIn(List<Integer> values) {
            addCriterion("paymentMethodID not in", values, "paymentmethodid");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodidBetween(Integer value1, Integer value2) {
            addCriterion("paymentMethodID between", value1, value2, "paymentmethodid");
            return (Criteria) this;
        }

        public Criteria andPaymentmethodidNotBetween(Integer value1, Integer value2) {
            addCriterion("paymentMethodID not between", value1, value2, "paymentmethodid");
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

        public Criteria andFeeappeardateIsNull() {
            addCriterion("feeAppearDate is null");
            return (Criteria) this;
        }

        public Criteria andFeeappeardateIsNotNull() {
            addCriterion("feeAppearDate is not null");
            return (Criteria) this;
        }

        public Criteria andFeeappeardateEqualTo(Date value) {
            addCriterion("feeAppearDate =", value, "feeappeardate");
            return (Criteria) this;
        }

        public Criteria andFeeappeardateNotEqualTo(Date value) {
            addCriterion("feeAppearDate <>", value, "feeappeardate");
            return (Criteria) this;
        }

        public Criteria andFeeappeardateGreaterThan(Date value) {
            addCriterion("feeAppearDate >", value, "feeappeardate");
            return (Criteria) this;
        }

        public Criteria andFeeappeardateGreaterThanOrEqualTo(Date value) {
            addCriterion("feeAppearDate >=", value, "feeappeardate");
            return (Criteria) this;
        }

        public Criteria andFeeappeardateLessThan(Date value) {
            addCriterion("feeAppearDate <", value, "feeappeardate");
            return (Criteria) this;
        }

        public Criteria andFeeappeardateLessThanOrEqualTo(Date value) {
            addCriterion("feeAppearDate <=", value, "feeappeardate");
            return (Criteria) this;
        }

        public Criteria andFeeappeardateIn(List<Date> values) {
            addCriterion("feeAppearDate in", values, "feeappeardate");
            return (Criteria) this;
        }

        public Criteria andFeeappeardateNotIn(List<Date> values) {
            addCriterion("feeAppearDate not in", values, "feeappeardate");
            return (Criteria) this;
        }

        public Criteria andFeeappeardateBetween(Date value1, Date value2) {
            addCriterion("feeAppearDate between", value1, value2, "feeappeardate");
            return (Criteria) this;
        }

        public Criteria andFeeappeardateNotBetween(Date value1, Date value2) {
            addCriterion("feeAppearDate not between", value1, value2, "feeappeardate");
            return (Criteria) this;
        }

        public Criteria andFeechangedateIsNull() {
            addCriterion("feeChangeDate is null");
            return (Criteria) this;
        }

        public Criteria andFeechangedateIsNotNull() {
            addCriterion("feeChangeDate is not null");
            return (Criteria) this;
        }

        public Criteria andFeechangedateEqualTo(Date value) {
            addCriterion("feeChangeDate =", value, "feechangedate");
            return (Criteria) this;
        }

        public Criteria andFeechangedateNotEqualTo(Date value) {
            addCriterion("feeChangeDate <>", value, "feechangedate");
            return (Criteria) this;
        }

        public Criteria andFeechangedateGreaterThan(Date value) {
            addCriterion("feeChangeDate >", value, "feechangedate");
            return (Criteria) this;
        }

        public Criteria andFeechangedateGreaterThanOrEqualTo(Date value) {
            addCriterion("feeChangeDate >=", value, "feechangedate");
            return (Criteria) this;
        }

        public Criteria andFeechangedateLessThan(Date value) {
            addCriterion("feeChangeDate <", value, "feechangedate");
            return (Criteria) this;
        }

        public Criteria andFeechangedateLessThanOrEqualTo(Date value) {
            addCriterion("feeChangeDate <=", value, "feechangedate");
            return (Criteria) this;
        }

        public Criteria andFeechangedateIn(List<Date> values) {
            addCriterion("feeChangeDate in", values, "feechangedate");
            return (Criteria) this;
        }

        public Criteria andFeechangedateNotIn(List<Date> values) {
            addCriterion("feeChangeDate not in", values, "feechangedate");
            return (Criteria) this;
        }

        public Criteria andFeechangedateBetween(Date value1, Date value2) {
            addCriterion("feeChangeDate between", value1, value2, "feechangedate");
            return (Criteria) this;
        }

        public Criteria andFeechangedateNotBetween(Date value1, Date value2) {
            addCriterion("feeChangeDate not between", value1, value2, "feechangedate");
            return (Criteria) this;
        }

        public Criteria andPaystatusIsNull() {
            addCriterion("payStatus is null");
            return (Criteria) this;
        }

        public Criteria andPaystatusIsNotNull() {
            addCriterion("payStatus is not null");
            return (Criteria) this;
        }

        public Criteria andPaystatusEqualTo(String value) {
            addCriterion("payStatus =", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusNotEqualTo(String value) {
            addCriterion("payStatus <>", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusGreaterThan(String value) {
            addCriterion("payStatus >", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusGreaterThanOrEqualTo(String value) {
            addCriterion("payStatus >=", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusLessThan(String value) {
            addCriterion("payStatus <", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusLessThanOrEqualTo(String value) {
            addCriterion("payStatus <=", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusLike(String value) {
            addCriterion("payStatus like", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusNotLike(String value) {
            addCriterion("payStatus not like", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusIn(List<String> values) {
            addCriterion("payStatus in", values, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusNotIn(List<String> values) {
            addCriterion("payStatus not in", values, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusBetween(String value1, String value2) {
            addCriterion("payStatus between", value1, value2, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusNotBetween(String value1, String value2) {
            addCriterion("payStatus not between", value1, value2, "paystatus");
            return (Criteria) this;
        }

        public Criteria andDatestatusIsNull() {
            addCriterion("dateStatus is null");
            return (Criteria) this;
        }

        public Criteria andDatestatusIsNotNull() {
            addCriterion("dateStatus is not null");
            return (Criteria) this;
        }

        public Criteria andDatestatusEqualTo(String value) {
            addCriterion("dateStatus =", value, "datestatus");
            return (Criteria) this;
        }

        public Criteria andDatestatusNotEqualTo(String value) {
            addCriterion("dateStatus <>", value, "datestatus");
            return (Criteria) this;
        }

        public Criteria andDatestatusGreaterThan(String value) {
            addCriterion("dateStatus >", value, "datestatus");
            return (Criteria) this;
        }

        public Criteria andDatestatusGreaterThanOrEqualTo(String value) {
            addCriterion("dateStatus >=", value, "datestatus");
            return (Criteria) this;
        }

        public Criteria andDatestatusLessThan(String value) {
            addCriterion("dateStatus <", value, "datestatus");
            return (Criteria) this;
        }

        public Criteria andDatestatusLessThanOrEqualTo(String value) {
            addCriterion("dateStatus <=", value, "datestatus");
            return (Criteria) this;
        }

        public Criteria andDatestatusLike(String value) {
            addCriterion("dateStatus like", value, "datestatus");
            return (Criteria) this;
        }

        public Criteria andDatestatusNotLike(String value) {
            addCriterion("dateStatus not like", value, "datestatus");
            return (Criteria) this;
        }

        public Criteria andDatestatusIn(List<String> values) {
            addCriterion("dateStatus in", values, "datestatus");
            return (Criteria) this;
        }

        public Criteria andDatestatusNotIn(List<String> values) {
            addCriterion("dateStatus not in", values, "datestatus");
            return (Criteria) this;
        }

        public Criteria andDatestatusBetween(String value1, String value2) {
            addCriterion("dateStatus between", value1, value2, "datestatus");
            return (Criteria) this;
        }

        public Criteria andDatestatusNotBetween(String value1, String value2) {
            addCriterion("dateStatus not between", value1, value2, "datestatus");
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

        public Criteria andReserver3IsNull() {
            addCriterion("reserver3 is null");
            return (Criteria) this;
        }

        public Criteria andReserver3IsNotNull() {
            addCriterion("reserver3 is not null");
            return (Criteria) this;
        }

        public Criteria andReserver3EqualTo(String value) {
            addCriterion("reserver3 =", value, "reserver3");
            return (Criteria) this;
        }

        public Criteria andReserver3NotEqualTo(String value) {
            addCriterion("reserver3 <>", value, "reserver3");
            return (Criteria) this;
        }

        public Criteria andReserver3GreaterThan(String value) {
            addCriterion("reserver3 >", value, "reserver3");
            return (Criteria) this;
        }

        public Criteria andReserver3GreaterThanOrEqualTo(String value) {
            addCriterion("reserver3 >=", value, "reserver3");
            return (Criteria) this;
        }

        public Criteria andReserver3LessThan(String value) {
            addCriterion("reserver3 <", value, "reserver3");
            return (Criteria) this;
        }

        public Criteria andReserver3LessThanOrEqualTo(String value) {
            addCriterion("reserver3 <=", value, "reserver3");
            return (Criteria) this;
        }

        public Criteria andReserver3Like(String value) {
            addCriterion("reserver3 like", value, "reserver3");
            return (Criteria) this;
        }

        public Criteria andReserver3NotLike(String value) {
            addCriterion("reserver3 not like", value, "reserver3");
            return (Criteria) this;
        }

        public Criteria andReserver3In(List<String> values) {
            addCriterion("reserver3 in", values, "reserver3");
            return (Criteria) this;
        }

        public Criteria andReserver3NotIn(List<String> values) {
            addCriterion("reserver3 not in", values, "reserver3");
            return (Criteria) this;
        }

        public Criteria andReserver3Between(String value1, String value2) {
            addCriterion("reserver3 between", value1, value2, "reserver3");
            return (Criteria) this;
        }

        public Criteria andReserver3NotBetween(String value1, String value2) {
            addCriterion("reserver3 not between", value1, value2, "reserver3");
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