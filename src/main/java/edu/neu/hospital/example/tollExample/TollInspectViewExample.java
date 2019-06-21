package edu.neu.hospital.example.tollExample;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TollInspectViewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public TollInspectViewExample() {
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

        public Criteria andFeeCategoryIDIsNull() {
            addCriterion("feeCategoryID is null");
            return (Criteria) this;
        }

        public Criteria andFeeCategoryIDIsNotNull() {
            addCriterion("feeCategoryID is not null");
            return (Criteria) this;
        }

        public Criteria andFeeCategoryIDEqualTo(Integer value) {
            addCriterion("feeCategoryID =", value, "feeCategoryID");
            return (Criteria) this;
        }

        public Criteria andFeeCategoryIDNotEqualTo(Integer value) {
            addCriterion("feeCategoryID <>", value, "feeCategoryID");
            return (Criteria) this;
        }

        public Criteria andFeeCategoryIDGreaterThan(Integer value) {
            addCriterion("feeCategoryID >", value, "feeCategoryID");
            return (Criteria) this;
        }

        public Criteria andFeeCategoryIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("feeCategoryID >=", value, "feeCategoryID");
            return (Criteria) this;
        }

        public Criteria andFeeCategoryIDLessThan(Integer value) {
            addCriterion("feeCategoryID <", value, "feeCategoryID");
            return (Criteria) this;
        }

        public Criteria andFeeCategoryIDLessThanOrEqualTo(Integer value) {
            addCriterion("feeCategoryID <=", value, "feeCategoryID");
            return (Criteria) this;
        }

        public Criteria andFeeCategoryIDIn(List<Integer> values) {
            addCriterion("feeCategoryID in", values, "feeCategoryID");
            return (Criteria) this;
        }

        public Criteria andFeeCategoryIDNotIn(List<Integer> values) {
            addCriterion("feeCategoryID not in", values, "feeCategoryID");
            return (Criteria) this;
        }

        public Criteria andFeeCategoryIDBetween(Integer value1, Integer value2) {
            addCriterion("feeCategoryID between", value1, value2, "feeCategoryID");
            return (Criteria) this;
        }

        public Criteria andFeeCategoryIDNotBetween(Integer value1, Integer value2) {
            addCriterion("feeCategoryID not between", value1, value2, "feeCategoryID");
            return (Criteria) this;
        }

        public Criteria andChargeItemIDIsNull() {
            addCriterion("chargeItemID is null");
            return (Criteria) this;
        }

        public Criteria andChargeItemIDIsNotNull() {
            addCriterion("chargeItemID is not null");
            return (Criteria) this;
        }

        public Criteria andChargeItemIDEqualTo(Integer value) {
            addCriterion("chargeItemID =", value, "chargeItemID");
            return (Criteria) this;
        }

        public Criteria andChargeItemIDNotEqualTo(Integer value) {
            addCriterion("chargeItemID <>", value, "chargeItemID");
            return (Criteria) this;
        }

        public Criteria andChargeItemIDGreaterThan(Integer value) {
            addCriterion("chargeItemID >", value, "chargeItemID");
            return (Criteria) this;
        }

        public Criteria andChargeItemIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("chargeItemID >=", value, "chargeItemID");
            return (Criteria) this;
        }

        public Criteria andChargeItemIDLessThan(Integer value) {
            addCriterion("chargeItemID <", value, "chargeItemID");
            return (Criteria) this;
        }

        public Criteria andChargeItemIDLessThanOrEqualTo(Integer value) {
            addCriterion("chargeItemID <=", value, "chargeItemID");
            return (Criteria) this;
        }

        public Criteria andChargeItemIDIn(List<Integer> values) {
            addCriterion("chargeItemID in", values, "chargeItemID");
            return (Criteria) this;
        }

        public Criteria andChargeItemIDNotIn(List<Integer> values) {
            addCriterion("chargeItemID not in", values, "chargeItemID");
            return (Criteria) this;
        }

        public Criteria andChargeItemIDBetween(Integer value1, Integer value2) {
            addCriterion("chargeItemID between", value1, value2, "chargeItemID");
            return (Criteria) this;
        }

        public Criteria andChargeItemIDNotBetween(Integer value1, Integer value2) {
            addCriterion("chargeItemID not between", value1, value2, "chargeItemID");
            return (Criteria) this;
        }

        public Criteria andExpIDIsNull() {
            addCriterion("expID is null");
            return (Criteria) this;
        }

        public Criteria andExpIDIsNotNull() {
            addCriterion("expID is not null");
            return (Criteria) this;
        }

        public Criteria andExpIDEqualTo(Integer value) {
            addCriterion("expID =", value, "expID");
            return (Criteria) this;
        }

        public Criteria andExpIDNotEqualTo(Integer value) {
            addCriterion("expID <>", value, "expID");
            return (Criteria) this;
        }

        public Criteria andExpIDGreaterThan(Integer value) {
            addCriterion("expID >", value, "expID");
            return (Criteria) this;
        }

        public Criteria andExpIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("expID >=", value, "expID");
            return (Criteria) this;
        }

        public Criteria andExpIDLessThan(Integer value) {
            addCriterion("expID <", value, "expID");
            return (Criteria) this;
        }

        public Criteria andExpIDLessThanOrEqualTo(Integer value) {
            addCriterion("expID <=", value, "expID");
            return (Criteria) this;
        }

        public Criteria andExpIDIn(List<Integer> values) {
            addCriterion("expID in", values, "expID");
            return (Criteria) this;
        }

        public Criteria andExpIDNotIn(List<Integer> values) {
            addCriterion("expID not in", values, "expID");
            return (Criteria) this;
        }

        public Criteria andExpIDBetween(Integer value1, Integer value2) {
            addCriterion("expID between", value1, value2, "expID");
            return (Criteria) this;
        }

        public Criteria andExpIDNotBetween(Integer value1, Integer value2) {
            addCriterion("expID not between", value1, value2, "expID");
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

        public Criteria andFeeChangeDateIsNull() {
            addCriterion("feeChangeDate is null");
            return (Criteria) this;
        }

        public Criteria andFeeChangeDateIsNotNull() {
            addCriterion("feeChangeDate is not null");
            return (Criteria) this;
        }

        public Criteria andFeeChangeDateEqualTo(Date value) {
            addCriterion("feeChangeDate =", value, "feeChangeDate");
            return (Criteria) this;
        }

        public Criteria andFeeChangeDateNotEqualTo(Date value) {
            addCriterion("feeChangeDate <>", value, "feeChangeDate");
            return (Criteria) this;
        }

        public Criteria andFeeChangeDateGreaterThan(Date value) {
            addCriterion("feeChangeDate >", value, "feeChangeDate");
            return (Criteria) this;
        }

        public Criteria andFeeChangeDateGreaterThanOrEqualTo(Date value) {
            addCriterion("feeChangeDate >=", value, "feeChangeDate");
            return (Criteria) this;
        }

        public Criteria andFeeChangeDateLessThan(Date value) {
            addCriterion("feeChangeDate <", value, "feeChangeDate");
            return (Criteria) this;
        }

        public Criteria andFeeChangeDateLessThanOrEqualTo(Date value) {
            addCriterion("feeChangeDate <=", value, "feeChangeDate");
            return (Criteria) this;
        }

        public Criteria andFeeChangeDateIn(List<Date> values) {
            addCriterion("feeChangeDate in", values, "feeChangeDate");
            return (Criteria) this;
        }

        public Criteria andFeeChangeDateNotIn(List<Date> values) {
            addCriterion("feeChangeDate not in", values, "feeChangeDate");
            return (Criteria) this;
        }

        public Criteria andFeeChangeDateBetween(Date value1, Date value2) {
            addCriterion("feeChangeDate between", value1, value2, "feeChangeDate");
            return (Criteria) this;
        }

        public Criteria andFeeChangeDateNotBetween(Date value1, Date value2) {
            addCriterion("feeChangeDate not between", value1, value2, "feeChangeDate");
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

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("`name` is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("`name` is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("`name` =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("`name` <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("`name` >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("`name` >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("`name` <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("`name` <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("`name` like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("`name` not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("`name` in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("`name` not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("`name` between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("`name` not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andFormatIsNull() {
            addCriterion("format is null");
            return (Criteria) this;
        }

        public Criteria andFormatIsNotNull() {
            addCriterion("format is not null");
            return (Criteria) this;
        }

        public Criteria andFormatEqualTo(String value) {
            addCriterion("format =", value, "format");
            return (Criteria) this;
        }

        public Criteria andFormatNotEqualTo(String value) {
            addCriterion("format <>", value, "format");
            return (Criteria) this;
        }

        public Criteria andFormatGreaterThan(String value) {
            addCriterion("format >", value, "format");
            return (Criteria) this;
        }

        public Criteria andFormatGreaterThanOrEqualTo(String value) {
            addCriterion("format >=", value, "format");
            return (Criteria) this;
        }

        public Criteria andFormatLessThan(String value) {
            addCriterion("format <", value, "format");
            return (Criteria) this;
        }

        public Criteria andFormatLessThanOrEqualTo(String value) {
            addCriterion("format <=", value, "format");
            return (Criteria) this;
        }

        public Criteria andFormatLike(String value) {
            addCriterion("format like", value, "format");
            return (Criteria) this;
        }

        public Criteria andFormatNotLike(String value) {
            addCriterion("format not like", value, "format");
            return (Criteria) this;
        }

        public Criteria andFormatIn(List<String> values) {
            addCriterion("format in", values, "format");
            return (Criteria) this;
        }

        public Criteria andFormatNotIn(List<String> values) {
            addCriterion("format not in", values, "format");
            return (Criteria) this;
        }

        public Criteria andFormatBetween(String value1, String value2) {
            addCriterion("format between", value1, value2, "format");
            return (Criteria) this;
        }

        public Criteria andFormatNotBetween(String value1, String value2) {
            addCriterion("format not between", value1, value2, "format");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andMnemonicCodeIsNull() {
            addCriterion("mnemonicCode is null");
            return (Criteria) this;
        }

        public Criteria andMnemonicCodeIsNotNull() {
            addCriterion("mnemonicCode is not null");
            return (Criteria) this;
        }

        public Criteria andMnemonicCodeEqualTo(String value) {
            addCriterion("mnemonicCode =", value, "mnemonicCode");
            return (Criteria) this;
        }

        public Criteria andMnemonicCodeNotEqualTo(String value) {
            addCriterion("mnemonicCode <>", value, "mnemonicCode");
            return (Criteria) this;
        }

        public Criteria andMnemonicCodeGreaterThan(String value) {
            addCriterion("mnemonicCode >", value, "mnemonicCode");
            return (Criteria) this;
        }

        public Criteria andMnemonicCodeGreaterThanOrEqualTo(String value) {
            addCriterion("mnemonicCode >=", value, "mnemonicCode");
            return (Criteria) this;
        }

        public Criteria andMnemonicCodeLessThan(String value) {
            addCriterion("mnemonicCode <", value, "mnemonicCode");
            return (Criteria) this;
        }

        public Criteria andMnemonicCodeLessThanOrEqualTo(String value) {
            addCriterion("mnemonicCode <=", value, "mnemonicCode");
            return (Criteria) this;
        }

        public Criteria andMnemonicCodeLike(String value) {
            addCriterion("mnemonicCode like", value, "mnemonicCode");
            return (Criteria) this;
        }

        public Criteria andMnemonicCodeNotLike(String value) {
            addCriterion("mnemonicCode not like", value, "mnemonicCode");
            return (Criteria) this;
        }

        public Criteria andMnemonicCodeIn(List<String> values) {
            addCriterion("mnemonicCode in", values, "mnemonicCode");
            return (Criteria) this;
        }

        public Criteria andMnemonicCodeNotIn(List<String> values) {
            addCriterion("mnemonicCode not in", values, "mnemonicCode");
            return (Criteria) this;
        }

        public Criteria andMnemonicCodeBetween(String value1, String value2) {
            addCriterion("mnemonicCode between", value1, value2, "mnemonicCode");
            return (Criteria) this;
        }

        public Criteria andMnemonicCodeNotBetween(String value1, String value2) {
            addCriterion("mnemonicCode not between", value1, value2, "mnemonicCode");
            return (Criteria) this;
        }

        public Criteria andTollNameIsNull() {
            addCriterion("tollName is null");
            return (Criteria) this;
        }

        public Criteria andTollNameIsNotNull() {
            addCriterion("tollName is not null");
            return (Criteria) this;
        }

        public Criteria andTollNameEqualTo(String value) {
            addCriterion("tollName =", value, "tollName");
            return (Criteria) this;
        }

        public Criteria andTollNameNotEqualTo(String value) {
            addCriterion("tollName <>", value, "tollName");
            return (Criteria) this;
        }

        public Criteria andTollNameGreaterThan(String value) {
            addCriterion("tollName >", value, "tollName");
            return (Criteria) this;
        }

        public Criteria andTollNameGreaterThanOrEqualTo(String value) {
            addCriterion("tollName >=", value, "tollName");
            return (Criteria) this;
        }

        public Criteria andTollNameLessThan(String value) {
            addCriterion("tollName <", value, "tollName");
            return (Criteria) this;
        }

        public Criteria andTollNameLessThanOrEqualTo(String value) {
            addCriterion("tollName <=", value, "tollName");
            return (Criteria) this;
        }

        public Criteria andTollNameLike(String value) {
            addCriterion("tollName like", value, "tollName");
            return (Criteria) this;
        }

        public Criteria andTollNameNotLike(String value) {
            addCriterion("tollName not like", value, "tollName");
            return (Criteria) this;
        }

        public Criteria andTollNameIn(List<String> values) {
            addCriterion("tollName in", values, "tollName");
            return (Criteria) this;
        }

        public Criteria andTollNameNotIn(List<String> values) {
            addCriterion("tollName not in", values, "tollName");
            return (Criteria) this;
        }

        public Criteria andTollNameBetween(String value1, String value2) {
            addCriterion("tollName between", value1, value2, "tollName");
            return (Criteria) this;
        }

        public Criteria andTollNameNotBetween(String value1, String value2) {
            addCriterion("tollName not between", value1, value2, "tollName");
            return (Criteria) this;
        }

        public Criteria andAppearNameIsNull() {
            addCriterion("appearName is null");
            return (Criteria) this;
        }

        public Criteria andAppearNameIsNotNull() {
            addCriterion("appearName is not null");
            return (Criteria) this;
        }

        public Criteria andAppearNameEqualTo(String value) {
            addCriterion("appearName =", value, "appearName");
            return (Criteria) this;
        }

        public Criteria andAppearNameNotEqualTo(String value) {
            addCriterion("appearName <>", value, "appearName");
            return (Criteria) this;
        }

        public Criteria andAppearNameGreaterThan(String value) {
            addCriterion("appearName >", value, "appearName");
            return (Criteria) this;
        }

        public Criteria andAppearNameGreaterThanOrEqualTo(String value) {
            addCriterion("appearName >=", value, "appearName");
            return (Criteria) this;
        }

        public Criteria andAppearNameLessThan(String value) {
            addCriterion("appearName <", value, "appearName");
            return (Criteria) this;
        }

        public Criteria andAppearNameLessThanOrEqualTo(String value) {
            addCriterion("appearName <=", value, "appearName");
            return (Criteria) this;
        }

        public Criteria andAppearNameLike(String value) {
            addCriterion("appearName like", value, "appearName");
            return (Criteria) this;
        }

        public Criteria andAppearNameNotLike(String value) {
            addCriterion("appearName not like", value, "appearName");
            return (Criteria) this;
        }

        public Criteria andAppearNameIn(List<String> values) {
            addCriterion("appearName in", values, "appearName");
            return (Criteria) this;
        }

        public Criteria andAppearNameNotIn(List<String> values) {
            addCriterion("appearName not in", values, "appearName");
            return (Criteria) this;
        }

        public Criteria andAppearNameBetween(String value1, String value2) {
            addCriterion("appearName between", value1, value2, "appearName");
            return (Criteria) this;
        }

        public Criteria andAppearNameNotBetween(String value1, String value2) {
            addCriterion("appearName not between", value1, value2, "appearName");
            return (Criteria) this;
        }

        public Criteria andChangeNameIsNull() {
            addCriterion("changeName is null");
            return (Criteria) this;
        }

        public Criteria andChangeNameIsNotNull() {
            addCriterion("changeName is not null");
            return (Criteria) this;
        }

        public Criteria andChangeNameEqualTo(String value) {
            addCriterion("changeName =", value, "changeName");
            return (Criteria) this;
        }

        public Criteria andChangeNameNotEqualTo(String value) {
            addCriterion("changeName <>", value, "changeName");
            return (Criteria) this;
        }

        public Criteria andChangeNameGreaterThan(String value) {
            addCriterion("changeName >", value, "changeName");
            return (Criteria) this;
        }

        public Criteria andChangeNameGreaterThanOrEqualTo(String value) {
            addCriterion("changeName >=", value, "changeName");
            return (Criteria) this;
        }

        public Criteria andChangeNameLessThan(String value) {
            addCriterion("changeName <", value, "changeName");
            return (Criteria) this;
        }

        public Criteria andChangeNameLessThanOrEqualTo(String value) {
            addCriterion("changeName <=", value, "changeName");
            return (Criteria) this;
        }

        public Criteria andChangeNameLike(String value) {
            addCriterion("changeName like", value, "changeName");
            return (Criteria) this;
        }

        public Criteria andChangeNameNotLike(String value) {
            addCriterion("changeName not like", value, "changeName");
            return (Criteria) this;
        }

        public Criteria andChangeNameIn(List<String> values) {
            addCriterion("changeName in", values, "changeName");
            return (Criteria) this;
        }

        public Criteria andChangeNameNotIn(List<String> values) {
            addCriterion("changeName not in", values, "changeName");
            return (Criteria) this;
        }

        public Criteria andChangeNameBetween(String value1, String value2) {
            addCriterion("changeName between", value1, value2, "changeName");
            return (Criteria) this;
        }

        public Criteria andChangeNameNotBetween(String value1, String value2) {
            addCriterion("changeName not between", value1, value2, "changeName");
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

        public Criteria andExpNameIsNull() {
            addCriterion("expName is null");
            return (Criteria) this;
        }

        public Criteria andExpNameIsNotNull() {
            addCriterion("expName is not null");
            return (Criteria) this;
        }

        public Criteria andExpNameEqualTo(String value) {
            addCriterion("expName =", value, "expName");
            return (Criteria) this;
        }

        public Criteria andExpNameNotEqualTo(String value) {
            addCriterion("expName <>", value, "expName");
            return (Criteria) this;
        }

        public Criteria andExpNameGreaterThan(String value) {
            addCriterion("expName >", value, "expName");
            return (Criteria) this;
        }

        public Criteria andExpNameGreaterThanOrEqualTo(String value) {
            addCriterion("expName >=", value, "expName");
            return (Criteria) this;
        }

        public Criteria andExpNameLessThan(String value) {
            addCriterion("expName <", value, "expName");
            return (Criteria) this;
        }

        public Criteria andExpNameLessThanOrEqualTo(String value) {
            addCriterion("expName <=", value, "expName");
            return (Criteria) this;
        }

        public Criteria andExpNameLike(String value) {
            addCriterion("expName like", value, "expName");
            return (Criteria) this;
        }

        public Criteria andExpNameNotLike(String value) {
            addCriterion("expName not like", value, "expName");
            return (Criteria) this;
        }

        public Criteria andExpNameIn(List<String> values) {
            addCriterion("expName in", values, "expName");
            return (Criteria) this;
        }

        public Criteria andExpNameNotIn(List<String> values) {
            addCriterion("expName not in", values, "expName");
            return (Criteria) this;
        }

        public Criteria andExpNameBetween(String value1, String value2) {
            addCriterion("expName between", value1, value2, "expName");
            return (Criteria) this;
        }

        public Criteria andExpNameNotBetween(String value1, String value2) {
            addCriterion("expName not between", value1, value2, "expName");
            return (Criteria) this;
        }

        public Criteria andPayStatusNameIsNull() {
            addCriterion("payStatusName is null");
            return (Criteria) this;
        }

        public Criteria andPayStatusNameIsNotNull() {
            addCriterion("payStatusName is not null");
            return (Criteria) this;
        }

        public Criteria andPayStatusNameEqualTo(String value) {
            addCriterion("payStatusName =", value, "payStatusName");
            return (Criteria) this;
        }

        public Criteria andPayStatusNameNotEqualTo(String value) {
            addCriterion("payStatusName <>", value, "payStatusName");
            return (Criteria) this;
        }

        public Criteria andPayStatusNameGreaterThan(String value) {
            addCriterion("payStatusName >", value, "payStatusName");
            return (Criteria) this;
        }

        public Criteria andPayStatusNameGreaterThanOrEqualTo(String value) {
            addCriterion("payStatusName >=", value, "payStatusName");
            return (Criteria) this;
        }

        public Criteria andPayStatusNameLessThan(String value) {
            addCriterion("payStatusName <", value, "payStatusName");
            return (Criteria) this;
        }

        public Criteria andPayStatusNameLessThanOrEqualTo(String value) {
            addCriterion("payStatusName <=", value, "payStatusName");
            return (Criteria) this;
        }

        public Criteria andPayStatusNameLike(String value) {
            addCriterion("payStatusName like", value, "payStatusName");
            return (Criteria) this;
        }

        public Criteria andPayStatusNameNotLike(String value) {
            addCriterion("payStatusName not like", value, "payStatusName");
            return (Criteria) this;
        }

        public Criteria andPayStatusNameIn(List<String> values) {
            addCriterion("payStatusName in", values, "payStatusName");
            return (Criteria) this;
        }

        public Criteria andPayStatusNameNotIn(List<String> values) {
            addCriterion("payStatusName not in", values, "payStatusName");
            return (Criteria) this;
        }

        public Criteria andPayStatusNameBetween(String value1, String value2) {
            addCriterion("payStatusName between", value1, value2, "payStatusName");
            return (Criteria) this;
        }

        public Criteria andPayStatusNameNotBetween(String value1, String value2) {
            addCriterion("payStatusName not between", value1, value2, "payStatusName");
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

        public Criteria andFmedItemIDIsNull() {
            addCriterion("FmedItemID is null");
            return (Criteria) this;
        }

        public Criteria andFmedItemIDIsNotNull() {
            addCriterion("FmedItemID is not null");
            return (Criteria) this;
        }

        public Criteria andFmedItemIDEqualTo(Integer value) {
            addCriterion("FmedItemID =", value, "fmedItemID");
            return (Criteria) this;
        }

        public Criteria andFmedItemIDNotEqualTo(Integer value) {
            addCriterion("FmedItemID <>", value, "fmedItemID");
            return (Criteria) this;
        }

        public Criteria andFmedItemIDGreaterThan(Integer value) {
            addCriterion("FmedItemID >", value, "fmedItemID");
            return (Criteria) this;
        }

        public Criteria andFmedItemIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("FmedItemID >=", value, "fmedItemID");
            return (Criteria) this;
        }

        public Criteria andFmedItemIDLessThan(Integer value) {
            addCriterion("FmedItemID <", value, "fmedItemID");
            return (Criteria) this;
        }

        public Criteria andFmedItemIDLessThanOrEqualTo(Integer value) {
            addCriterion("FmedItemID <=", value, "fmedItemID");
            return (Criteria) this;
        }

        public Criteria andFmedItemIDIn(List<Integer> values) {
            addCriterion("FmedItemID in", values, "fmedItemID");
            return (Criteria) this;
        }

        public Criteria andFmedItemIDNotIn(List<Integer> values) {
            addCriterion("FmedItemID not in", values, "fmedItemID");
            return (Criteria) this;
        }

        public Criteria andFmedItemIDBetween(Integer value1, Integer value2) {
            addCriterion("FmedItemID between", value1, value2, "fmedItemID");
            return (Criteria) this;
        }

        public Criteria andFmedItemIDNotBetween(Integer value1, Integer value2) {
            addCriterion("FmedItemID not between", value1, value2, "fmedItemID");
            return (Criteria) this;
        }

        public Criteria andDateStatusNameIsNull() {
            addCriterion("dateStatusName is null");
            return (Criteria) this;
        }

        public Criteria andDateStatusNameIsNotNull() {
            addCriterion("dateStatusName is not null");
            return (Criteria) this;
        }

        public Criteria andDateStatusNameEqualTo(String value) {
            addCriterion("dateStatusName =", value, "dateStatusName");
            return (Criteria) this;
        }

        public Criteria andDateStatusNameNotEqualTo(String value) {
            addCriterion("dateStatusName <>", value, "dateStatusName");
            return (Criteria) this;
        }

        public Criteria andDateStatusNameGreaterThan(String value) {
            addCriterion("dateStatusName >", value, "dateStatusName");
            return (Criteria) this;
        }

        public Criteria andDateStatusNameGreaterThanOrEqualTo(String value) {
            addCriterion("dateStatusName >=", value, "dateStatusName");
            return (Criteria) this;
        }

        public Criteria andDateStatusNameLessThan(String value) {
            addCriterion("dateStatusName <", value, "dateStatusName");
            return (Criteria) this;
        }

        public Criteria andDateStatusNameLessThanOrEqualTo(String value) {
            addCriterion("dateStatusName <=", value, "dateStatusName");
            return (Criteria) this;
        }

        public Criteria andDateStatusNameLike(String value) {
            addCriterion("dateStatusName like", value, "dateStatusName");
            return (Criteria) this;
        }

        public Criteria andDateStatusNameNotLike(String value) {
            addCriterion("dateStatusName not like", value, "dateStatusName");
            return (Criteria) this;
        }

        public Criteria andDateStatusNameIn(List<String> values) {
            addCriterion("dateStatusName in", values, "dateStatusName");
            return (Criteria) this;
        }

        public Criteria andDateStatusNameNotIn(List<String> values) {
            addCriterion("dateStatusName not in", values, "dateStatusName");
            return (Criteria) this;
        }

        public Criteria andDateStatusNameBetween(String value1, String value2) {
            addCriterion("dateStatusName between", value1, value2, "dateStatusName");
            return (Criteria) this;
        }

        public Criteria andDateStatusNameNotBetween(String value1, String value2) {
            addCriterion("dateStatusName not between", value1, value2, "dateStatusName");
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