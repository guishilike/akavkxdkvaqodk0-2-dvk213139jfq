package edu.neu.hospital.example.basicTableExample;

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