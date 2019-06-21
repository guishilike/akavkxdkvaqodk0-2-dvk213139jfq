package edu.neu.hospital.example.takeMedicineExample;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TakeMedDetailsViewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public TakeMedDetailsViewExample() {
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

        public Criteria andDrugIDIsNull() {
            addCriterion("drugID is null");
            return (Criteria) this;
        }

        public Criteria andDrugIDIsNotNull() {
            addCriterion("drugID is not null");
            return (Criteria) this;
        }

        public Criteria andDrugIDEqualTo(Integer value) {
            addCriterion("drugID =", value, "drugID");
            return (Criteria) this;
        }

        public Criteria andDrugIDNotEqualTo(Integer value) {
            addCriterion("drugID <>", value, "drugID");
            return (Criteria) this;
        }

        public Criteria andDrugIDGreaterThan(Integer value) {
            addCriterion("drugID >", value, "drugID");
            return (Criteria) this;
        }

        public Criteria andDrugIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("drugID >=", value, "drugID");
            return (Criteria) this;
        }

        public Criteria andDrugIDLessThan(Integer value) {
            addCriterion("drugID <", value, "drugID");
            return (Criteria) this;
        }

        public Criteria andDrugIDLessThanOrEqualTo(Integer value) {
            addCriterion("drugID <=", value, "drugID");
            return (Criteria) this;
        }

        public Criteria andDrugIDIn(List<Integer> values) {
            addCriterion("drugID in", values, "drugID");
            return (Criteria) this;
        }

        public Criteria andDrugIDNotIn(List<Integer> values) {
            addCriterion("drugID not in", values, "drugID");
            return (Criteria) this;
        }

        public Criteria andDrugIDBetween(Integer value1, Integer value2) {
            addCriterion("drugID between", value1, value2, "drugID");
            return (Criteria) this;
        }

        public Criteria andDrugIDNotBetween(Integer value1, Integer value2) {
            addCriterion("drugID not between", value1, value2, "drugID");
            return (Criteria) this;
        }

        public Criteria andUsageIsNull() {
            addCriterion("`usage` is null");
            return (Criteria) this;
        }

        public Criteria andUsageIsNotNull() {
            addCriterion("`usage` is not null");
            return (Criteria) this;
        }

        public Criteria andUsageEqualTo(String value) {
            addCriterion("`usage` =", value, "usage");
            return (Criteria) this;
        }

        public Criteria andUsageNotEqualTo(String value) {
            addCriterion("`usage` <>", value, "usage");
            return (Criteria) this;
        }

        public Criteria andUsageGreaterThan(String value) {
            addCriterion("`usage` >", value, "usage");
            return (Criteria) this;
        }

        public Criteria andUsageGreaterThanOrEqualTo(String value) {
            addCriterion("`usage` >=", value, "usage");
            return (Criteria) this;
        }

        public Criteria andUsageLessThan(String value) {
            addCriterion("`usage` <", value, "usage");
            return (Criteria) this;
        }

        public Criteria andUsageLessThanOrEqualTo(String value) {
            addCriterion("`usage` <=", value, "usage");
            return (Criteria) this;
        }

        public Criteria andUsageLike(String value) {
            addCriterion("`usage` like", value, "usage");
            return (Criteria) this;
        }

        public Criteria andUsageNotLike(String value) {
            addCriterion("`usage` not like", value, "usage");
            return (Criteria) this;
        }

        public Criteria andUsageIn(List<String> values) {
            addCriterion("`usage` in", values, "usage");
            return (Criteria) this;
        }

        public Criteria andUsageNotIn(List<String> values) {
            addCriterion("`usage` not in", values, "usage");
            return (Criteria) this;
        }

        public Criteria andUsageBetween(String value1, String value2) {
            addCriterion("`usage` between", value1, value2, "usage");
            return (Criteria) this;
        }

        public Criteria andUsageNotBetween(String value1, String value2) {
            addCriterion("`usage` not between", value1, value2, "usage");
            return (Criteria) this;
        }

        public Criteria andDosageIsNull() {
            addCriterion("dosage is null");
            return (Criteria) this;
        }

        public Criteria andDosageIsNotNull() {
            addCriterion("dosage is not null");
            return (Criteria) this;
        }

        public Criteria andDosageEqualTo(BigDecimal value) {
            addCriterion("dosage =", value, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageNotEqualTo(BigDecimal value) {
            addCriterion("dosage <>", value, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageGreaterThan(BigDecimal value) {
            addCriterion("dosage >", value, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dosage >=", value, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageLessThan(BigDecimal value) {
            addCriterion("dosage <", value, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dosage <=", value, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageIn(List<BigDecimal> values) {
            addCriterion("dosage in", values, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageNotIn(List<BigDecimal> values) {
            addCriterion("dosage not in", values, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dosage between", value1, value2, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dosage not between", value1, value2, "dosage");
            return (Criteria) this;
        }

        public Criteria andFrequencyIsNull() {
            addCriterion("frequency is null");
            return (Criteria) this;
        }

        public Criteria andFrequencyIsNotNull() {
            addCriterion("frequency is not null");
            return (Criteria) this;
        }

        public Criteria andFrequencyEqualTo(Integer value) {
            addCriterion("frequency =", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyNotEqualTo(Integer value) {
            addCriterion("frequency <>", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyGreaterThan(Integer value) {
            addCriterion("frequency >", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyGreaterThanOrEqualTo(Integer value) {
            addCriterion("frequency >=", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyLessThan(Integer value) {
            addCriterion("frequency <", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyLessThanOrEqualTo(Integer value) {
            addCriterion("frequency <=", value, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyIn(List<Integer> values) {
            addCriterion("frequency in", values, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyNotIn(List<Integer> values) {
            addCriterion("frequency not in", values, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyBetween(Integer value1, Integer value2) {
            addCriterion("frequency between", value1, value2, "frequency");
            return (Criteria) this;
        }

        public Criteria andFrequencyNotBetween(Integer value1, Integer value2) {
            addCriterion("frequency not between", value1, value2, "frequency");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNull() {
            addCriterion("quantity is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNotNull() {
            addCriterion("quantity is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualTo(Integer value) {
            addCriterion("quantity =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(Integer value) {
            addCriterion("quantity <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(Integer value) {
            addCriterion("quantity >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("quantity >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(Integer value) {
            addCriterion("quantity <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("quantity <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<Integer> values) {
            addCriterion("quantity in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<Integer> values) {
            addCriterion("quantity not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(Integer value1, Integer value2) {
            addCriterion("quantity between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("quantity not between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andMedicationIsNull() {
            addCriterion("medication is null");
            return (Criteria) this;
        }

        public Criteria andMedicationIsNotNull() {
            addCriterion("medication is not null");
            return (Criteria) this;
        }

        public Criteria andMedicationEqualTo(String value) {
            addCriterion("medication =", value, "medication");
            return (Criteria) this;
        }

        public Criteria andMedicationNotEqualTo(String value) {
            addCriterion("medication <>", value, "medication");
            return (Criteria) this;
        }

        public Criteria andMedicationGreaterThan(String value) {
            addCriterion("medication >", value, "medication");
            return (Criteria) this;
        }

        public Criteria andMedicationGreaterThanOrEqualTo(String value) {
            addCriterion("medication >=", value, "medication");
            return (Criteria) this;
        }

        public Criteria andMedicationLessThan(String value) {
            addCriterion("medication <", value, "medication");
            return (Criteria) this;
        }

        public Criteria andMedicationLessThanOrEqualTo(String value) {
            addCriterion("medication <=", value, "medication");
            return (Criteria) this;
        }

        public Criteria andMedicationLike(String value) {
            addCriterion("medication like", value, "medication");
            return (Criteria) this;
        }

        public Criteria andMedicationNotLike(String value) {
            addCriterion("medication not like", value, "medication");
            return (Criteria) this;
        }

        public Criteria andMedicationIn(List<String> values) {
            addCriterion("medication in", values, "medication");
            return (Criteria) this;
        }

        public Criteria andMedicationNotIn(List<String> values) {
            addCriterion("medication not in", values, "medication");
            return (Criteria) this;
        }

        public Criteria andMedicationBetween(String value1, String value2) {
            addCriterion("medication between", value1, value2, "medication");
            return (Criteria) this;
        }

        public Criteria andMedicationNotBetween(String value1, String value2) {
            addCriterion("medication not between", value1, value2, "medication");
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

        public Criteria andIsDrawnEqualTo(Integer value) {
            addCriterion("isDrawn =", value, "isDrawn");
            return (Criteria) this;
        }

        public Criteria andIsDrawnNotEqualTo(Integer value) {
            addCriterion("isDrawn <>", value, "isDrawn");
            return (Criteria) this;
        }

        public Criteria andIsDrawnGreaterThan(Integer value) {
            addCriterion("isDrawn >", value, "isDrawn");
            return (Criteria) this;
        }

        public Criteria andIsDrawnGreaterThanOrEqualTo(Integer value) {
            addCriterion("isDrawn >=", value, "isDrawn");
            return (Criteria) this;
        }

        public Criteria andIsDrawnLessThan(Integer value) {
            addCriterion("isDrawn <", value, "isDrawn");
            return (Criteria) this;
        }

        public Criteria andIsDrawnLessThanOrEqualTo(Integer value) {
            addCriterion("isDrawn <=", value, "isDrawn");
            return (Criteria) this;
        }

        public Criteria andIsDrawnIn(List<Integer> values) {
            addCriterion("isDrawn in", values, "isDrawn");
            return (Criteria) this;
        }

        public Criteria andIsDrawnNotIn(List<Integer> values) {
            addCriterion("isDrawn not in", values, "isDrawn");
            return (Criteria) this;
        }

        public Criteria andIsDrawnBetween(Integer value1, Integer value2) {
            addCriterion("isDrawn between", value1, value2, "isDrawn");
            return (Criteria) this;
        }

        public Criteria andIsDrawnNotBetween(Integer value1, Integer value2) {
            addCriterion("isDrawn not between", value1, value2, "isDrawn");
            return (Criteria) this;
        }

        public Criteria andIsPaidIsNull() {
            addCriterion("isPaid is null");
            return (Criteria) this;
        }

        public Criteria andIsPaidIsNotNull() {
            addCriterion("isPaid is not null");
            return (Criteria) this;
        }

        public Criteria andIsPaidEqualTo(Integer value) {
            addCriterion("isPaid =", value, "isPaid");
            return (Criteria) this;
        }

        public Criteria andIsPaidNotEqualTo(Integer value) {
            addCriterion("isPaid <>", value, "isPaid");
            return (Criteria) this;
        }

        public Criteria andIsPaidGreaterThan(Integer value) {
            addCriterion("isPaid >", value, "isPaid");
            return (Criteria) this;
        }

        public Criteria andIsPaidGreaterThanOrEqualTo(Integer value) {
            addCriterion("isPaid >=", value, "isPaid");
            return (Criteria) this;
        }

        public Criteria andIsPaidLessThan(Integer value) {
            addCriterion("isPaid <", value, "isPaid");
            return (Criteria) this;
        }

        public Criteria andIsPaidLessThanOrEqualTo(Integer value) {
            addCriterion("isPaid <=", value, "isPaid");
            return (Criteria) this;
        }

        public Criteria andIsPaidIn(List<Integer> values) {
            addCriterion("isPaid in", values, "isPaid");
            return (Criteria) this;
        }

        public Criteria andIsPaidNotIn(List<Integer> values) {
            addCriterion("isPaid not in", values, "isPaid");
            return (Criteria) this;
        }

        public Criteria andIsPaidBetween(Integer value1, Integer value2) {
            addCriterion("isPaid between", value1, value2, "isPaid");
            return (Criteria) this;
        }

        public Criteria andIsPaidNotBetween(Integer value1, Integer value2) {
            addCriterion("isPaid not between", value1, value2, "isPaid");
            return (Criteria) this;
        }

        public Criteria andIsAbolishedIsNull() {
            addCriterion("isAbolished is null");
            return (Criteria) this;
        }

        public Criteria andIsAbolishedIsNotNull() {
            addCriterion("isAbolished is not null");
            return (Criteria) this;
        }

        public Criteria andIsAbolishedEqualTo(Integer value) {
            addCriterion("isAbolished =", value, "isAbolished");
            return (Criteria) this;
        }

        public Criteria andIsAbolishedNotEqualTo(Integer value) {
            addCriterion("isAbolished <>", value, "isAbolished");
            return (Criteria) this;
        }

        public Criteria andIsAbolishedGreaterThan(Integer value) {
            addCriterion("isAbolished >", value, "isAbolished");
            return (Criteria) this;
        }

        public Criteria andIsAbolishedGreaterThanOrEqualTo(Integer value) {
            addCriterion("isAbolished >=", value, "isAbolished");
            return (Criteria) this;
        }

        public Criteria andIsAbolishedLessThan(Integer value) {
            addCriterion("isAbolished <", value, "isAbolished");
            return (Criteria) this;
        }

        public Criteria andIsAbolishedLessThanOrEqualTo(Integer value) {
            addCriterion("isAbolished <=", value, "isAbolished");
            return (Criteria) this;
        }

        public Criteria andIsAbolishedIn(List<Integer> values) {
            addCriterion("isAbolished in", values, "isAbolished");
            return (Criteria) this;
        }

        public Criteria andIsAbolishedNotIn(List<Integer> values) {
            addCriterion("isAbolished not in", values, "isAbolished");
            return (Criteria) this;
        }

        public Criteria andIsAbolishedBetween(Integer value1, Integer value2) {
            addCriterion("isAbolished between", value1, value2, "isAbolished");
            return (Criteria) this;
        }

        public Criteria andIsAbolishedNotBetween(Integer value1, Integer value2) {
            addCriterion("isAbolished not between", value1, value2, "isAbolished");
            return (Criteria) this;
        }

        public Criteria andIsGotDrugsIsNull() {
            addCriterion("isGotDrugs is null");
            return (Criteria) this;
        }

        public Criteria andIsGotDrugsIsNotNull() {
            addCriterion("isGotDrugs is not null");
            return (Criteria) this;
        }

        public Criteria andIsGotDrugsEqualTo(Integer value) {
            addCriterion("isGotDrugs =", value, "isGotDrugs");
            return (Criteria) this;
        }

        public Criteria andIsGotDrugsNotEqualTo(Integer value) {
            addCriterion("isGotDrugs <>", value, "isGotDrugs");
            return (Criteria) this;
        }

        public Criteria andIsGotDrugsGreaterThan(Integer value) {
            addCriterion("isGotDrugs >", value, "isGotDrugs");
            return (Criteria) this;
        }

        public Criteria andIsGotDrugsGreaterThanOrEqualTo(Integer value) {
            addCriterion("isGotDrugs >=", value, "isGotDrugs");
            return (Criteria) this;
        }

        public Criteria andIsGotDrugsLessThan(Integer value) {
            addCriterion("isGotDrugs <", value, "isGotDrugs");
            return (Criteria) this;
        }

        public Criteria andIsGotDrugsLessThanOrEqualTo(Integer value) {
            addCriterion("isGotDrugs <=", value, "isGotDrugs");
            return (Criteria) this;
        }

        public Criteria andIsGotDrugsIn(List<Integer> values) {
            addCriterion("isGotDrugs in", values, "isGotDrugs");
            return (Criteria) this;
        }

        public Criteria andIsGotDrugsNotIn(List<Integer> values) {
            addCriterion("isGotDrugs not in", values, "isGotDrugs");
            return (Criteria) this;
        }

        public Criteria andIsGotDrugsBetween(Integer value1, Integer value2) {
            addCriterion("isGotDrugs between", value1, value2, "isGotDrugs");
            return (Criteria) this;
        }

        public Criteria andIsGotDrugsNotBetween(Integer value1, Integer value2) {
            addCriterion("isGotDrugs not between", value1, value2, "isGotDrugs");
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

        public Criteria andPrescriptionIDIsNull() {
            addCriterion("prescriptionID is null");
            return (Criteria) this;
        }

        public Criteria andPrescriptionIDIsNotNull() {
            addCriterion("prescriptionID is not null");
            return (Criteria) this;
        }

        public Criteria andPrescriptionIDEqualTo(Integer value) {
            addCriterion("prescriptionID =", value, "prescriptionID");
            return (Criteria) this;
        }

        public Criteria andPrescriptionIDNotEqualTo(Integer value) {
            addCriterion("prescriptionID <>", value, "prescriptionID");
            return (Criteria) this;
        }

        public Criteria andPrescriptionIDGreaterThan(Integer value) {
            addCriterion("prescriptionID >", value, "prescriptionID");
            return (Criteria) this;
        }

        public Criteria andPrescriptionIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("prescriptionID >=", value, "prescriptionID");
            return (Criteria) this;
        }

        public Criteria andPrescriptionIDLessThan(Integer value) {
            addCriterion("prescriptionID <", value, "prescriptionID");
            return (Criteria) this;
        }

        public Criteria andPrescriptionIDLessThanOrEqualTo(Integer value) {
            addCriterion("prescriptionID <=", value, "prescriptionID");
            return (Criteria) this;
        }

        public Criteria andPrescriptionIDIn(List<Integer> values) {
            addCriterion("prescriptionID in", values, "prescriptionID");
            return (Criteria) this;
        }

        public Criteria andPrescriptionIDNotIn(List<Integer> values) {
            addCriterion("prescriptionID not in", values, "prescriptionID");
            return (Criteria) this;
        }

        public Criteria andPrescriptionIDBetween(Integer value1, Integer value2) {
            addCriterion("prescriptionID between", value1, value2, "prescriptionID");
            return (Criteria) this;
        }

        public Criteria andPrescriptionIDNotBetween(Integer value1, Integer value2) {
            addCriterion("prescriptionID not between", value1, value2, "prescriptionID");
            return (Criteria) this;
        }

        public Criteria andDrugsCodeIsNull() {
            addCriterion("drugsCode is null");
            return (Criteria) this;
        }

        public Criteria andDrugsCodeIsNotNull() {
            addCriterion("drugsCode is not null");
            return (Criteria) this;
        }

        public Criteria andDrugsCodeEqualTo(String value) {
            addCriterion("drugsCode =", value, "drugsCode");
            return (Criteria) this;
        }

        public Criteria andDrugsCodeNotEqualTo(String value) {
            addCriterion("drugsCode <>", value, "drugsCode");
            return (Criteria) this;
        }

        public Criteria andDrugsCodeGreaterThan(String value) {
            addCriterion("drugsCode >", value, "drugsCode");
            return (Criteria) this;
        }

        public Criteria andDrugsCodeGreaterThanOrEqualTo(String value) {
            addCriterion("drugsCode >=", value, "drugsCode");
            return (Criteria) this;
        }

        public Criteria andDrugsCodeLessThan(String value) {
            addCriterion("drugsCode <", value, "drugsCode");
            return (Criteria) this;
        }

        public Criteria andDrugsCodeLessThanOrEqualTo(String value) {
            addCriterion("drugsCode <=", value, "drugsCode");
            return (Criteria) this;
        }

        public Criteria andDrugsCodeLike(String value) {
            addCriterion("drugsCode like", value, "drugsCode");
            return (Criteria) this;
        }

        public Criteria andDrugsCodeNotLike(String value) {
            addCriterion("drugsCode not like", value, "drugsCode");
            return (Criteria) this;
        }

        public Criteria andDrugsCodeIn(List<String> values) {
            addCriterion("drugsCode in", values, "drugsCode");
            return (Criteria) this;
        }

        public Criteria andDrugsCodeNotIn(List<String> values) {
            addCriterion("drugsCode not in", values, "drugsCode");
            return (Criteria) this;
        }

        public Criteria andDrugsCodeBetween(String value1, String value2) {
            addCriterion("drugsCode between", value1, value2, "drugsCode");
            return (Criteria) this;
        }

        public Criteria andDrugsCodeNotBetween(String value1, String value2) {
            addCriterion("drugsCode not between", value1, value2, "drugsCode");
            return (Criteria) this;
        }

        public Criteria andDrugsNameIsNull() {
            addCriterion("drugsName is null");
            return (Criteria) this;
        }

        public Criteria andDrugsNameIsNotNull() {
            addCriterion("drugsName is not null");
            return (Criteria) this;
        }

        public Criteria andDrugsNameEqualTo(String value) {
            addCriterion("drugsName =", value, "drugsName");
            return (Criteria) this;
        }

        public Criteria andDrugsNameNotEqualTo(String value) {
            addCriterion("drugsName <>", value, "drugsName");
            return (Criteria) this;
        }

        public Criteria andDrugsNameGreaterThan(String value) {
            addCriterion("drugsName >", value, "drugsName");
            return (Criteria) this;
        }

        public Criteria andDrugsNameGreaterThanOrEqualTo(String value) {
            addCriterion("drugsName >=", value, "drugsName");
            return (Criteria) this;
        }

        public Criteria andDrugsNameLessThan(String value) {
            addCriterion("drugsName <", value, "drugsName");
            return (Criteria) this;
        }

        public Criteria andDrugsNameLessThanOrEqualTo(String value) {
            addCriterion("drugsName <=", value, "drugsName");
            return (Criteria) this;
        }

        public Criteria andDrugsNameLike(String value) {
            addCriterion("drugsName like", value, "drugsName");
            return (Criteria) this;
        }

        public Criteria andDrugsNameNotLike(String value) {
            addCriterion("drugsName not like", value, "drugsName");
            return (Criteria) this;
        }

        public Criteria andDrugsNameIn(List<String> values) {
            addCriterion("drugsName in", values, "drugsName");
            return (Criteria) this;
        }

        public Criteria andDrugsNameNotIn(List<String> values) {
            addCriterion("drugsName not in", values, "drugsName");
            return (Criteria) this;
        }

        public Criteria andDrugsNameBetween(String value1, String value2) {
            addCriterion("drugsName between", value1, value2, "drugsName");
            return (Criteria) this;
        }

        public Criteria andDrugsNameNotBetween(String value1, String value2) {
            addCriterion("drugsName not between", value1, value2, "drugsName");
            return (Criteria) this;
        }

        public Criteria andDrugsFormatIsNull() {
            addCriterion("drugsFormat is null");
            return (Criteria) this;
        }

        public Criteria andDrugsFormatIsNotNull() {
            addCriterion("drugsFormat is not null");
            return (Criteria) this;
        }

        public Criteria andDrugsFormatEqualTo(String value) {
            addCriterion("drugsFormat =", value, "drugsFormat");
            return (Criteria) this;
        }

        public Criteria andDrugsFormatNotEqualTo(String value) {
            addCriterion("drugsFormat <>", value, "drugsFormat");
            return (Criteria) this;
        }

        public Criteria andDrugsFormatGreaterThan(String value) {
            addCriterion("drugsFormat >", value, "drugsFormat");
            return (Criteria) this;
        }

        public Criteria andDrugsFormatGreaterThanOrEqualTo(String value) {
            addCriterion("drugsFormat >=", value, "drugsFormat");
            return (Criteria) this;
        }

        public Criteria andDrugsFormatLessThan(String value) {
            addCriterion("drugsFormat <", value, "drugsFormat");
            return (Criteria) this;
        }

        public Criteria andDrugsFormatLessThanOrEqualTo(String value) {
            addCriterion("drugsFormat <=", value, "drugsFormat");
            return (Criteria) this;
        }

        public Criteria andDrugsFormatLike(String value) {
            addCriterion("drugsFormat like", value, "drugsFormat");
            return (Criteria) this;
        }

        public Criteria andDrugsFormatNotLike(String value) {
            addCriterion("drugsFormat not like", value, "drugsFormat");
            return (Criteria) this;
        }

        public Criteria andDrugsFormatIn(List<String> values) {
            addCriterion("drugsFormat in", values, "drugsFormat");
            return (Criteria) this;
        }

        public Criteria andDrugsFormatNotIn(List<String> values) {
            addCriterion("drugsFormat not in", values, "drugsFormat");
            return (Criteria) this;
        }

        public Criteria andDrugsFormatBetween(String value1, String value2) {
            addCriterion("drugsFormat between", value1, value2, "drugsFormat");
            return (Criteria) this;
        }

        public Criteria andDrugsFormatNotBetween(String value1, String value2) {
            addCriterion("drugsFormat not between", value1, value2, "drugsFormat");
            return (Criteria) this;
        }

        public Criteria andDrugsUnitIsNull() {
            addCriterion("drugsUnit is null");
            return (Criteria) this;
        }

        public Criteria andDrugsUnitIsNotNull() {
            addCriterion("drugsUnit is not null");
            return (Criteria) this;
        }

        public Criteria andDrugsUnitEqualTo(String value) {
            addCriterion("drugsUnit =", value, "drugsUnit");
            return (Criteria) this;
        }

        public Criteria andDrugsUnitNotEqualTo(String value) {
            addCriterion("drugsUnit <>", value, "drugsUnit");
            return (Criteria) this;
        }

        public Criteria andDrugsUnitGreaterThan(String value) {
            addCriterion("drugsUnit >", value, "drugsUnit");
            return (Criteria) this;
        }

        public Criteria andDrugsUnitGreaterThanOrEqualTo(String value) {
            addCriterion("drugsUnit >=", value, "drugsUnit");
            return (Criteria) this;
        }

        public Criteria andDrugsUnitLessThan(String value) {
            addCriterion("drugsUnit <", value, "drugsUnit");
            return (Criteria) this;
        }

        public Criteria andDrugsUnitLessThanOrEqualTo(String value) {
            addCriterion("drugsUnit <=", value, "drugsUnit");
            return (Criteria) this;
        }

        public Criteria andDrugsUnitLike(String value) {
            addCriterion("drugsUnit like", value, "drugsUnit");
            return (Criteria) this;
        }

        public Criteria andDrugsUnitNotLike(String value) {
            addCriterion("drugsUnit not like", value, "drugsUnit");
            return (Criteria) this;
        }

        public Criteria andDrugsUnitIn(List<String> values) {
            addCriterion("drugsUnit in", values, "drugsUnit");
            return (Criteria) this;
        }

        public Criteria andDrugsUnitNotIn(List<String> values) {
            addCriterion("drugsUnit not in", values, "drugsUnit");
            return (Criteria) this;
        }

        public Criteria andDrugsUnitBetween(String value1, String value2) {
            addCriterion("drugsUnit between", value1, value2, "drugsUnit");
            return (Criteria) this;
        }

        public Criteria andDrugsUnitNotBetween(String value1, String value2) {
            addCriterion("drugsUnit not between", value1, value2, "drugsUnit");
            return (Criteria) this;
        }

        public Criteria andManufacturerIsNull() {
            addCriterion("manufacturer is null");
            return (Criteria) this;
        }

        public Criteria andManufacturerIsNotNull() {
            addCriterion("manufacturer is not null");
            return (Criteria) this;
        }

        public Criteria andManufacturerEqualTo(String value) {
            addCriterion("manufacturer =", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotEqualTo(String value) {
            addCriterion("manufacturer <>", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerGreaterThan(String value) {
            addCriterion("manufacturer >", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerGreaterThanOrEqualTo(String value) {
            addCriterion("manufacturer >=", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLessThan(String value) {
            addCriterion("manufacturer <", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLessThanOrEqualTo(String value) {
            addCriterion("manufacturer <=", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLike(String value) {
            addCriterion("manufacturer like", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotLike(String value) {
            addCriterion("manufacturer not like", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerIn(List<String> values) {
            addCriterion("manufacturer in", values, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotIn(List<String> values) {
            addCriterion("manufacturer not in", values, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerBetween(String value1, String value2) {
            addCriterion("manufacturer between", value1, value2, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotBetween(String value1, String value2) {
            addCriterion("manufacturer not between", value1, value2, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageIDIsNull() {
            addCriterion("drugsDosageID is null");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageIDIsNotNull() {
            addCriterion("drugsDosageID is not null");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageIDEqualTo(Integer value) {
            addCriterion("drugsDosageID =", value, "drugsDosageID");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageIDNotEqualTo(Integer value) {
            addCriterion("drugsDosageID <>", value, "drugsDosageID");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageIDGreaterThan(Integer value) {
            addCriterion("drugsDosageID >", value, "drugsDosageID");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("drugsDosageID >=", value, "drugsDosageID");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageIDLessThan(Integer value) {
            addCriterion("drugsDosageID <", value, "drugsDosageID");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageIDLessThanOrEqualTo(Integer value) {
            addCriterion("drugsDosageID <=", value, "drugsDosageID");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageIDIn(List<Integer> values) {
            addCriterion("drugsDosageID in", values, "drugsDosageID");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageIDNotIn(List<Integer> values) {
            addCriterion("drugsDosageID not in", values, "drugsDosageID");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageIDBetween(Integer value1, Integer value2) {
            addCriterion("drugsDosageID between", value1, value2, "drugsDosageID");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageIDNotBetween(Integer value1, Integer value2) {
            addCriterion("drugsDosageID not between", value1, value2, "drugsDosageID");
            return (Criteria) this;
        }

        public Criteria andDrugsTypeIDIsNull() {
            addCriterion("drugsTypeID is null");
            return (Criteria) this;
        }

        public Criteria andDrugsTypeIDIsNotNull() {
            addCriterion("drugsTypeID is not null");
            return (Criteria) this;
        }

        public Criteria andDrugsTypeIDEqualTo(Integer value) {
            addCriterion("drugsTypeID =", value, "drugsTypeID");
            return (Criteria) this;
        }

        public Criteria andDrugsTypeIDNotEqualTo(Integer value) {
            addCriterion("drugsTypeID <>", value, "drugsTypeID");
            return (Criteria) this;
        }

        public Criteria andDrugsTypeIDGreaterThan(Integer value) {
            addCriterion("drugsTypeID >", value, "drugsTypeID");
            return (Criteria) this;
        }

        public Criteria andDrugsTypeIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("drugsTypeID >=", value, "drugsTypeID");
            return (Criteria) this;
        }

        public Criteria andDrugsTypeIDLessThan(Integer value) {
            addCriterion("drugsTypeID <", value, "drugsTypeID");
            return (Criteria) this;
        }

        public Criteria andDrugsTypeIDLessThanOrEqualTo(Integer value) {
            addCriterion("drugsTypeID <=", value, "drugsTypeID");
            return (Criteria) this;
        }

        public Criteria andDrugsTypeIDIn(List<Integer> values) {
            addCriterion("drugsTypeID in", values, "drugsTypeID");
            return (Criteria) this;
        }

        public Criteria andDrugsTypeIDNotIn(List<Integer> values) {
            addCriterion("drugsTypeID not in", values, "drugsTypeID");
            return (Criteria) this;
        }

        public Criteria andDrugsTypeIDBetween(Integer value1, Integer value2) {
            addCriterion("drugsTypeID between", value1, value2, "drugsTypeID");
            return (Criteria) this;
        }

        public Criteria andDrugsTypeIDNotBetween(Integer value1, Integer value2) {
            addCriterion("drugsTypeID not between", value1, value2, "drugsTypeID");
            return (Criteria) this;
        }

        public Criteria andDrugsPriceIsNull() {
            addCriterion("drugsPrice is null");
            return (Criteria) this;
        }

        public Criteria andDrugsPriceIsNotNull() {
            addCriterion("drugsPrice is not null");
            return (Criteria) this;
        }

        public Criteria andDrugsPriceEqualTo(BigDecimal value) {
            addCriterion("drugsPrice =", value, "drugsPrice");
            return (Criteria) this;
        }

        public Criteria andDrugsPriceNotEqualTo(BigDecimal value) {
            addCriterion("drugsPrice <>", value, "drugsPrice");
            return (Criteria) this;
        }

        public Criteria andDrugsPriceGreaterThan(BigDecimal value) {
            addCriterion("drugsPrice >", value, "drugsPrice");
            return (Criteria) this;
        }

        public Criteria andDrugsPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("drugsPrice >=", value, "drugsPrice");
            return (Criteria) this;
        }

        public Criteria andDrugsPriceLessThan(BigDecimal value) {
            addCriterion("drugsPrice <", value, "drugsPrice");
            return (Criteria) this;
        }

        public Criteria andDrugsPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("drugsPrice <=", value, "drugsPrice");
            return (Criteria) this;
        }

        public Criteria andDrugsPriceIn(List<BigDecimal> values) {
            addCriterion("drugsPrice in", values, "drugsPrice");
            return (Criteria) this;
        }

        public Criteria andDrugsPriceNotIn(List<BigDecimal> values) {
            addCriterion("drugsPrice not in", values, "drugsPrice");
            return (Criteria) this;
        }

        public Criteria andDrugsPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("drugsPrice between", value1, value2, "drugsPrice");
            return (Criteria) this;
        }

        public Criteria andDrugsPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("drugsPrice not between", value1, value2, "drugsPrice");
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

        public Criteria andReimbursementIsNull() {
            addCriterion("reimbursement is null");
            return (Criteria) this;
        }

        public Criteria andReimbursementIsNotNull() {
            addCriterion("reimbursement is not null");
            return (Criteria) this;
        }

        public Criteria andReimbursementEqualTo(BigDecimal value) {
            addCriterion("reimbursement =", value, "reimbursement");
            return (Criteria) this;
        }

        public Criteria andReimbursementNotEqualTo(BigDecimal value) {
            addCriterion("reimbursement <>", value, "reimbursement");
            return (Criteria) this;
        }

        public Criteria andReimbursementGreaterThan(BigDecimal value) {
            addCriterion("reimbursement >", value, "reimbursement");
            return (Criteria) this;
        }

        public Criteria andReimbursementGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("reimbursement >=", value, "reimbursement");
            return (Criteria) this;
        }

        public Criteria andReimbursementLessThan(BigDecimal value) {
            addCriterion("reimbursement <", value, "reimbursement");
            return (Criteria) this;
        }

        public Criteria andReimbursementLessThanOrEqualTo(BigDecimal value) {
            addCriterion("reimbursement <=", value, "reimbursement");
            return (Criteria) this;
        }

        public Criteria andReimbursementIn(List<BigDecimal> values) {
            addCriterion("reimbursement in", values, "reimbursement");
            return (Criteria) this;
        }

        public Criteria andReimbursementNotIn(List<BigDecimal> values) {
            addCriterion("reimbursement not in", values, "reimbursement");
            return (Criteria) this;
        }

        public Criteria andReimbursementBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("reimbursement between", value1, value2, "reimbursement");
            return (Criteria) this;
        }

        public Criteria andReimbursementNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("reimbursement not between", value1, value2, "reimbursement");
            return (Criteria) this;
        }

        public Criteria andARealNameIsNull() {
            addCriterion("aRealName is null");
            return (Criteria) this;
        }

        public Criteria andARealNameIsNotNull() {
            addCriterion("aRealName is not null");
            return (Criteria) this;
        }

        public Criteria andARealNameEqualTo(String value) {
            addCriterion("aRealName =", value, "aRealName");
            return (Criteria) this;
        }

        public Criteria andARealNameNotEqualTo(String value) {
            addCriterion("aRealName <>", value, "aRealName");
            return (Criteria) this;
        }

        public Criteria andARealNameGreaterThan(String value) {
            addCriterion("aRealName >", value, "aRealName");
            return (Criteria) this;
        }

        public Criteria andARealNameGreaterThanOrEqualTo(String value) {
            addCriterion("aRealName >=", value, "aRealName");
            return (Criteria) this;
        }

        public Criteria andARealNameLessThan(String value) {
            addCriterion("aRealName <", value, "aRealName");
            return (Criteria) this;
        }

        public Criteria andARealNameLessThanOrEqualTo(String value) {
            addCriterion("aRealName <=", value, "aRealName");
            return (Criteria) this;
        }

        public Criteria andARealNameLike(String value) {
            addCriterion("aRealName like", value, "aRealName");
            return (Criteria) this;
        }

        public Criteria andARealNameNotLike(String value) {
            addCriterion("aRealName not like", value, "aRealName");
            return (Criteria) this;
        }

        public Criteria andARealNameIn(List<String> values) {
            addCriterion("aRealName in", values, "aRealName");
            return (Criteria) this;
        }

        public Criteria andARealNameNotIn(List<String> values) {
            addCriterion("aRealName not in", values, "aRealName");
            return (Criteria) this;
        }

        public Criteria andARealNameBetween(String value1, String value2) {
            addCriterion("aRealName between", value1, value2, "aRealName");
            return (Criteria) this;
        }

        public Criteria andARealNameNotBetween(String value1, String value2) {
            addCriterion("aRealName not between", value1, value2, "aRealName");
            return (Criteria) this;
        }

        public Criteria andDrawnNameIsNull() {
            addCriterion("drawnName is null");
            return (Criteria) this;
        }

        public Criteria andDrawnNameIsNotNull() {
            addCriterion("drawnName is not null");
            return (Criteria) this;
        }

        public Criteria andDrawnNameEqualTo(String value) {
            addCriterion("drawnName =", value, "drawnName");
            return (Criteria) this;
        }

        public Criteria andDrawnNameNotEqualTo(String value) {
            addCriterion("drawnName <>", value, "drawnName");
            return (Criteria) this;
        }

        public Criteria andDrawnNameGreaterThan(String value) {
            addCriterion("drawnName >", value, "drawnName");
            return (Criteria) this;
        }

        public Criteria andDrawnNameGreaterThanOrEqualTo(String value) {
            addCriterion("drawnName >=", value, "drawnName");
            return (Criteria) this;
        }

        public Criteria andDrawnNameLessThan(String value) {
            addCriterion("drawnName <", value, "drawnName");
            return (Criteria) this;
        }

        public Criteria andDrawnNameLessThanOrEqualTo(String value) {
            addCriterion("drawnName <=", value, "drawnName");
            return (Criteria) this;
        }

        public Criteria andDrawnNameLike(String value) {
            addCriterion("drawnName like", value, "drawnName");
            return (Criteria) this;
        }

        public Criteria andDrawnNameNotLike(String value) {
            addCriterion("drawnName not like", value, "drawnName");
            return (Criteria) this;
        }

        public Criteria andDrawnNameIn(List<String> values) {
            addCriterion("drawnName in", values, "drawnName");
            return (Criteria) this;
        }

        public Criteria andDrawnNameNotIn(List<String> values) {
            addCriterion("drawnName not in", values, "drawnName");
            return (Criteria) this;
        }

        public Criteria andDrawnNameBetween(String value1, String value2) {
            addCriterion("drawnName between", value1, value2, "drawnName");
            return (Criteria) this;
        }

        public Criteria andDrawnNameNotBetween(String value1, String value2) {
            addCriterion("drawnName not between", value1, value2, "drawnName");
            return (Criteria) this;
        }

        public Criteria andPaidNameIsNull() {
            addCriterion("PaidName is null");
            return (Criteria) this;
        }

        public Criteria andPaidNameIsNotNull() {
            addCriterion("PaidName is not null");
            return (Criteria) this;
        }

        public Criteria andPaidNameEqualTo(String value) {
            addCriterion("PaidName =", value, "paidName");
            return (Criteria) this;
        }

        public Criteria andPaidNameNotEqualTo(String value) {
            addCriterion("PaidName <>", value, "paidName");
            return (Criteria) this;
        }

        public Criteria andPaidNameGreaterThan(String value) {
            addCriterion("PaidName >", value, "paidName");
            return (Criteria) this;
        }

        public Criteria andPaidNameGreaterThanOrEqualTo(String value) {
            addCriterion("PaidName >=", value, "paidName");
            return (Criteria) this;
        }

        public Criteria andPaidNameLessThan(String value) {
            addCriterion("PaidName <", value, "paidName");
            return (Criteria) this;
        }

        public Criteria andPaidNameLessThanOrEqualTo(String value) {
            addCriterion("PaidName <=", value, "paidName");
            return (Criteria) this;
        }

        public Criteria andPaidNameLike(String value) {
            addCriterion("PaidName like", value, "paidName");
            return (Criteria) this;
        }

        public Criteria andPaidNameNotLike(String value) {
            addCriterion("PaidName not like", value, "paidName");
            return (Criteria) this;
        }

        public Criteria andPaidNameIn(List<String> values) {
            addCriterion("PaidName in", values, "paidName");
            return (Criteria) this;
        }

        public Criteria andPaidNameNotIn(List<String> values) {
            addCriterion("PaidName not in", values, "paidName");
            return (Criteria) this;
        }

        public Criteria andPaidNameBetween(String value1, String value2) {
            addCriterion("PaidName between", value1, value2, "paidName");
            return (Criteria) this;
        }

        public Criteria andPaidNameNotBetween(String value1, String value2) {
            addCriterion("PaidName not between", value1, value2, "paidName");
            return (Criteria) this;
        }

        public Criteria andAbolishedNameIsNull() {
            addCriterion("abolishedName is null");
            return (Criteria) this;
        }

        public Criteria andAbolishedNameIsNotNull() {
            addCriterion("abolishedName is not null");
            return (Criteria) this;
        }

        public Criteria andAbolishedNameEqualTo(String value) {
            addCriterion("abolishedName =", value, "abolishedName");
            return (Criteria) this;
        }

        public Criteria andAbolishedNameNotEqualTo(String value) {
            addCriterion("abolishedName <>", value, "abolishedName");
            return (Criteria) this;
        }

        public Criteria andAbolishedNameGreaterThan(String value) {
            addCriterion("abolishedName >", value, "abolishedName");
            return (Criteria) this;
        }

        public Criteria andAbolishedNameGreaterThanOrEqualTo(String value) {
            addCriterion("abolishedName >=", value, "abolishedName");
            return (Criteria) this;
        }

        public Criteria andAbolishedNameLessThan(String value) {
            addCriterion("abolishedName <", value, "abolishedName");
            return (Criteria) this;
        }

        public Criteria andAbolishedNameLessThanOrEqualTo(String value) {
            addCriterion("abolishedName <=", value, "abolishedName");
            return (Criteria) this;
        }

        public Criteria andAbolishedNameLike(String value) {
            addCriterion("abolishedName like", value, "abolishedName");
            return (Criteria) this;
        }

        public Criteria andAbolishedNameNotLike(String value) {
            addCriterion("abolishedName not like", value, "abolishedName");
            return (Criteria) this;
        }

        public Criteria andAbolishedNameIn(List<String> values) {
            addCriterion("abolishedName in", values, "abolishedName");
            return (Criteria) this;
        }

        public Criteria andAbolishedNameNotIn(List<String> values) {
            addCriterion("abolishedName not in", values, "abolishedName");
            return (Criteria) this;
        }

        public Criteria andAbolishedNameBetween(String value1, String value2) {
            addCriterion("abolishedName between", value1, value2, "abolishedName");
            return (Criteria) this;
        }

        public Criteria andAbolishedNameNotBetween(String value1, String value2) {
            addCriterion("abolishedName not between", value1, value2, "abolishedName");
            return (Criteria) this;
        }

        public Criteria andGotDrugsNameIsNull() {
            addCriterion("gotDrugsName is null");
            return (Criteria) this;
        }

        public Criteria andGotDrugsNameIsNotNull() {
            addCriterion("gotDrugsName is not null");
            return (Criteria) this;
        }

        public Criteria andGotDrugsNameEqualTo(String value) {
            addCriterion("gotDrugsName =", value, "gotDrugsName");
            return (Criteria) this;
        }

        public Criteria andGotDrugsNameNotEqualTo(String value) {
            addCriterion("gotDrugsName <>", value, "gotDrugsName");
            return (Criteria) this;
        }

        public Criteria andGotDrugsNameGreaterThan(String value) {
            addCriterion("gotDrugsName >", value, "gotDrugsName");
            return (Criteria) this;
        }

        public Criteria andGotDrugsNameGreaterThanOrEqualTo(String value) {
            addCriterion("gotDrugsName >=", value, "gotDrugsName");
            return (Criteria) this;
        }

        public Criteria andGotDrugsNameLessThan(String value) {
            addCriterion("gotDrugsName <", value, "gotDrugsName");
            return (Criteria) this;
        }

        public Criteria andGotDrugsNameLessThanOrEqualTo(String value) {
            addCriterion("gotDrugsName <=", value, "gotDrugsName");
            return (Criteria) this;
        }

        public Criteria andGotDrugsNameLike(String value) {
            addCriterion("gotDrugsName like", value, "gotDrugsName");
            return (Criteria) this;
        }

        public Criteria andGotDrugsNameNotLike(String value) {
            addCriterion("gotDrugsName not like", value, "gotDrugsName");
            return (Criteria) this;
        }

        public Criteria andGotDrugsNameIn(List<String> values) {
            addCriterion("gotDrugsName in", values, "gotDrugsName");
            return (Criteria) this;
        }

        public Criteria andGotDrugsNameNotIn(List<String> values) {
            addCriterion("gotDrugsName not in", values, "gotDrugsName");
            return (Criteria) this;
        }

        public Criteria andGotDrugsNameBetween(String value1, String value2) {
            addCriterion("gotDrugsName between", value1, value2, "gotDrugsName");
            return (Criteria) this;
        }

        public Criteria andGotDrugsNameNotBetween(String value1, String value2) {
            addCriterion("gotDrugsName not between", value1, value2, "gotDrugsName");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageNameIsNull() {
            addCriterion("DrugsDosageName is null");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageNameIsNotNull() {
            addCriterion("DrugsDosageName is not null");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageNameEqualTo(String value) {
            addCriterion("DrugsDosageName =", value, "drugsDosageName");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageNameNotEqualTo(String value) {
            addCriterion("DrugsDosageName <>", value, "drugsDosageName");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageNameGreaterThan(String value) {
            addCriterion("DrugsDosageName >", value, "drugsDosageName");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageNameGreaterThanOrEqualTo(String value) {
            addCriterion("DrugsDosageName >=", value, "drugsDosageName");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageNameLessThan(String value) {
            addCriterion("DrugsDosageName <", value, "drugsDosageName");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageNameLessThanOrEqualTo(String value) {
            addCriterion("DrugsDosageName <=", value, "drugsDosageName");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageNameLike(String value) {
            addCriterion("DrugsDosageName like", value, "drugsDosageName");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageNameNotLike(String value) {
            addCriterion("DrugsDosageName not like", value, "drugsDosageName");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageNameIn(List<String> values) {
            addCriterion("DrugsDosageName in", values, "drugsDosageName");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageNameNotIn(List<String> values) {
            addCriterion("DrugsDosageName not in", values, "drugsDosageName");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageNameBetween(String value1, String value2) {
            addCriterion("DrugsDosageName between", value1, value2, "drugsDosageName");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageNameNotBetween(String value1, String value2) {
            addCriterion("DrugsDosageName not between", value1, value2, "drugsDosageName");
            return (Criteria) this;
        }

        public Criteria andDrugsTypeNameIsNull() {
            addCriterion("DrugsTypeName is null");
            return (Criteria) this;
        }

        public Criteria andDrugsTypeNameIsNotNull() {
            addCriterion("DrugsTypeName is not null");
            return (Criteria) this;
        }

        public Criteria andDrugsTypeNameEqualTo(String value) {
            addCriterion("DrugsTypeName =", value, "drugsTypeName");
            return (Criteria) this;
        }

        public Criteria andDrugsTypeNameNotEqualTo(String value) {
            addCriterion("DrugsTypeName <>", value, "drugsTypeName");
            return (Criteria) this;
        }

        public Criteria andDrugsTypeNameGreaterThan(String value) {
            addCriterion("DrugsTypeName >", value, "drugsTypeName");
            return (Criteria) this;
        }

        public Criteria andDrugsTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("DrugsTypeName >=", value, "drugsTypeName");
            return (Criteria) this;
        }

        public Criteria andDrugsTypeNameLessThan(String value) {
            addCriterion("DrugsTypeName <", value, "drugsTypeName");
            return (Criteria) this;
        }

        public Criteria andDrugsTypeNameLessThanOrEqualTo(String value) {
            addCriterion("DrugsTypeName <=", value, "drugsTypeName");
            return (Criteria) this;
        }

        public Criteria andDrugsTypeNameLike(String value) {
            addCriterion("DrugsTypeName like", value, "drugsTypeName");
            return (Criteria) this;
        }

        public Criteria andDrugsTypeNameNotLike(String value) {
            addCriterion("DrugsTypeName not like", value, "drugsTypeName");
            return (Criteria) this;
        }

        public Criteria andDrugsTypeNameIn(List<String> values) {
            addCriterion("DrugsTypeName in", values, "drugsTypeName");
            return (Criteria) this;
        }

        public Criteria andDrugsTypeNameNotIn(List<String> values) {
            addCriterion("DrugsTypeName not in", values, "drugsTypeName");
            return (Criteria) this;
        }

        public Criteria andDrugsTypeNameBetween(String value1, String value2) {
            addCriterion("DrugsTypeName between", value1, value2, "drugsTypeName");
            return (Criteria) this;
        }

        public Criteria andDrugsTypeNameNotBetween(String value1, String value2) {
            addCriterion("DrugsTypeName not between", value1, value2, "drugsTypeName");
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

        public Criteria andCRealNameIsNull() {
            addCriterion("cRealName is null");
            return (Criteria) this;
        }

        public Criteria andCRealNameIsNotNull() {
            addCriterion("cRealName is not null");
            return (Criteria) this;
        }

        public Criteria andCRealNameEqualTo(String value) {
            addCriterion("cRealName =", value, "cRealName");
            return (Criteria) this;
        }

        public Criteria andCRealNameNotEqualTo(String value) {
            addCriterion("cRealName <>", value, "cRealName");
            return (Criteria) this;
        }

        public Criteria andCRealNameGreaterThan(String value) {
            addCriterion("cRealName >", value, "cRealName");
            return (Criteria) this;
        }

        public Criteria andCRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("cRealName >=", value, "cRealName");
            return (Criteria) this;
        }

        public Criteria andCRealNameLessThan(String value) {
            addCriterion("cRealName <", value, "cRealName");
            return (Criteria) this;
        }

        public Criteria andCRealNameLessThanOrEqualTo(String value) {
            addCriterion("cRealName <=", value, "cRealName");
            return (Criteria) this;
        }

        public Criteria andCRealNameLike(String value) {
            addCriterion("cRealName like", value, "cRealName");
            return (Criteria) this;
        }

        public Criteria andCRealNameNotLike(String value) {
            addCriterion("cRealName not like", value, "cRealName");
            return (Criteria) this;
        }

        public Criteria andCRealNameIn(List<String> values) {
            addCriterion("cRealName in", values, "cRealName");
            return (Criteria) this;
        }

        public Criteria andCRealNameNotIn(List<String> values) {
            addCriterion("cRealName not in", values, "cRealName");
            return (Criteria) this;
        }

        public Criteria andCRealNameBetween(String value1, String value2) {
            addCriterion("cRealName between", value1, value2, "cRealName");
            return (Criteria) this;
        }

        public Criteria andCRealNameNotBetween(String value1, String value2) {
            addCriterion("cRealName not between", value1, value2, "cRealName");
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