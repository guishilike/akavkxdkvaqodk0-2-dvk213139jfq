package edu.neu.hospital.example.basicTableExample;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InspectionDetailsViewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public InspectionDetailsViewExample() {
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

        public Criteria andInspectionIDIsNull() {
            addCriterion("inspectionID is null");
            return (Criteria) this;
        }

        public Criteria andInspectionIDIsNotNull() {
            addCriterion("inspectionID is not null");
            return (Criteria) this;
        }

        public Criteria andInspectionIDEqualTo(Integer value) {
            addCriterion("inspectionID =", value, "inspectionID");
            return (Criteria) this;
        }

        public Criteria andInspectionIDNotEqualTo(Integer value) {
            addCriterion("inspectionID <>", value, "inspectionID");
            return (Criteria) this;
        }

        public Criteria andInspectionIDGreaterThan(Integer value) {
            addCriterion("inspectionID >", value, "inspectionID");
            return (Criteria) this;
        }

        public Criteria andInspectionIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("inspectionID >=", value, "inspectionID");
            return (Criteria) this;
        }

        public Criteria andInspectionIDLessThan(Integer value) {
            addCriterion("inspectionID <", value, "inspectionID");
            return (Criteria) this;
        }

        public Criteria andInspectionIDLessThanOrEqualTo(Integer value) {
            addCriterion("inspectionID <=", value, "inspectionID");
            return (Criteria) this;
        }

        public Criteria andInspectionIDIn(List<Integer> values) {
            addCriterion("inspectionID in", values, "inspectionID");
            return (Criteria) this;
        }

        public Criteria andInspectionIDNotIn(List<Integer> values) {
            addCriterion("inspectionID not in", values, "inspectionID");
            return (Criteria) this;
        }

        public Criteria andInspectionIDBetween(Integer value1, Integer value2) {
            addCriterion("inspectionID between", value1, value2, "inspectionID");
            return (Criteria) this;
        }

        public Criteria andInspectionIDNotBetween(Integer value1, Integer value2) {
            addCriterion("inspectionID not between", value1, value2, "inspectionID");
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

        public Criteria andInspectionDetailsIDIsNull() {
            addCriterion("inspectionDetailsID is null");
            return (Criteria) this;
        }

        public Criteria andInspectionDetailsIDIsNotNull() {
            addCriterion("inspectionDetailsID is not null");
            return (Criteria) this;
        }

        public Criteria andInspectionDetailsIDEqualTo(Integer value) {
            addCriterion("inspectionDetailsID =", value, "inspectionDetailsID");
            return (Criteria) this;
        }

        public Criteria andInspectionDetailsIDNotEqualTo(Integer value) {
            addCriterion("inspectionDetailsID <>", value, "inspectionDetailsID");
            return (Criteria) this;
        }

        public Criteria andInspectionDetailsIDGreaterThan(Integer value) {
            addCriterion("inspectionDetailsID >", value, "inspectionDetailsID");
            return (Criteria) this;
        }

        public Criteria andInspectionDetailsIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("inspectionDetailsID >=", value, "inspectionDetailsID");
            return (Criteria) this;
        }

        public Criteria andInspectionDetailsIDLessThan(Integer value) {
            addCriterion("inspectionDetailsID <", value, "inspectionDetailsID");
            return (Criteria) this;
        }

        public Criteria andInspectionDetailsIDLessThanOrEqualTo(Integer value) {
            addCriterion("inspectionDetailsID <=", value, "inspectionDetailsID");
            return (Criteria) this;
        }

        public Criteria andInspectionDetailsIDIn(List<Integer> values) {
            addCriterion("inspectionDetailsID in", values, "inspectionDetailsID");
            return (Criteria) this;
        }

        public Criteria andInspectionDetailsIDNotIn(List<Integer> values) {
            addCriterion("inspectionDetailsID not in", values, "inspectionDetailsID");
            return (Criteria) this;
        }

        public Criteria andInspectionDetailsIDBetween(Integer value1, Integer value2) {
            addCriterion("inspectionDetailsID between", value1, value2, "inspectionDetailsID");
            return (Criteria) this;
        }

        public Criteria andInspectionDetailsIDNotBetween(Integer value1, Integer value2) {
            addCriterion("inspectionDetailsID not between", value1, value2, "inspectionDetailsID");
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

        public Criteria andNumberIsNull() {
            addCriterion("`number` is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("`number` is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(Integer value) {
            addCriterion("`number` =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(Integer value) {
            addCriterion("`number` <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(Integer value) {
            addCriterion("`number` >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("`number` >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(Integer value) {
            addCriterion("`number` <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(Integer value) {
            addCriterion("`number` <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<Integer> values) {
            addCriterion("`number` in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<Integer> values) {
            addCriterion("`number` not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(Integer value1, Integer value2) {
            addCriterion("`number` between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("`number` not between", value1, value2, "number");
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

        public Criteria andIsExecutedIsNull() {
            addCriterion("isExecuted is null");
            return (Criteria) this;
        }

        public Criteria andIsExecutedIsNotNull() {
            addCriterion("isExecuted is not null");
            return (Criteria) this;
        }

        public Criteria andIsExecutedEqualTo(Integer value) {
            addCriterion("isExecuted =", value, "isExecuted");
            return (Criteria) this;
        }

        public Criteria andIsExecutedNotEqualTo(Integer value) {
            addCriterion("isExecuted <>", value, "isExecuted");
            return (Criteria) this;
        }

        public Criteria andIsExecutedGreaterThan(Integer value) {
            addCriterion("isExecuted >", value, "isExecuted");
            return (Criteria) this;
        }

        public Criteria andIsExecutedGreaterThanOrEqualTo(Integer value) {
            addCriterion("isExecuted >=", value, "isExecuted");
            return (Criteria) this;
        }

        public Criteria andIsExecutedLessThan(Integer value) {
            addCriterion("isExecuted <", value, "isExecuted");
            return (Criteria) this;
        }

        public Criteria andIsExecutedLessThanOrEqualTo(Integer value) {
            addCriterion("isExecuted <=", value, "isExecuted");
            return (Criteria) this;
        }

        public Criteria andIsExecutedIn(List<Integer> values) {
            addCriterion("isExecuted in", values, "isExecuted");
            return (Criteria) this;
        }

        public Criteria andIsExecutedNotIn(List<Integer> values) {
            addCriterion("isExecuted not in", values, "isExecuted");
            return (Criteria) this;
        }

        public Criteria andIsExecutedBetween(Integer value1, Integer value2) {
            addCriterion("isExecuted between", value1, value2, "isExecuted");
            return (Criteria) this;
        }

        public Criteria andIsExecutedNotBetween(Integer value1, Integer value2) {
            addCriterion("isExecuted not between", value1, value2, "isExecuted");
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

        public Criteria andAppearUserNameIsNull() {
            addCriterion("appearUserName is null");
            return (Criteria) this;
        }

        public Criteria andAppearUserNameIsNotNull() {
            addCriterion("appearUserName is not null");
            return (Criteria) this;
        }

        public Criteria andAppearUserNameEqualTo(String value) {
            addCriterion("appearUserName =", value, "appearUserName");
            return (Criteria) this;
        }

        public Criteria andAppearUserNameNotEqualTo(String value) {
            addCriterion("appearUserName <>", value, "appearUserName");
            return (Criteria) this;
        }

        public Criteria andAppearUserNameGreaterThan(String value) {
            addCriterion("appearUserName >", value, "appearUserName");
            return (Criteria) this;
        }

        public Criteria andAppearUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("appearUserName >=", value, "appearUserName");
            return (Criteria) this;
        }

        public Criteria andAppearUserNameLessThan(String value) {
            addCriterion("appearUserName <", value, "appearUserName");
            return (Criteria) this;
        }

        public Criteria andAppearUserNameLessThanOrEqualTo(String value) {
            addCriterion("appearUserName <=", value, "appearUserName");
            return (Criteria) this;
        }

        public Criteria andAppearUserNameLike(String value) {
            addCriterion("appearUserName like", value, "appearUserName");
            return (Criteria) this;
        }

        public Criteria andAppearUserNameNotLike(String value) {
            addCriterion("appearUserName not like", value, "appearUserName");
            return (Criteria) this;
        }

        public Criteria andAppearUserNameIn(List<String> values) {
            addCriterion("appearUserName in", values, "appearUserName");
            return (Criteria) this;
        }

        public Criteria andAppearUserNameNotIn(List<String> values) {
            addCriterion("appearUserName not in", values, "appearUserName");
            return (Criteria) this;
        }

        public Criteria andAppearUserNameBetween(String value1, String value2) {
            addCriterion("appearUserName between", value1, value2, "appearUserName");
            return (Criteria) this;
        }

        public Criteria andAppearUserNameNotBetween(String value1, String value2) {
            addCriterion("appearUserName not between", value1, value2, "appearUserName");
            return (Criteria) this;
        }

        public Criteria andChangeUserNameIsNull() {
            addCriterion("changeUserName is null");
            return (Criteria) this;
        }

        public Criteria andChangeUserNameIsNotNull() {
            addCriterion("changeUserName is not null");
            return (Criteria) this;
        }

        public Criteria andChangeUserNameEqualTo(String value) {
            addCriterion("changeUserName =", value, "changeUserName");
            return (Criteria) this;
        }

        public Criteria andChangeUserNameNotEqualTo(String value) {
            addCriterion("changeUserName <>", value, "changeUserName");
            return (Criteria) this;
        }

        public Criteria andChangeUserNameGreaterThan(String value) {
            addCriterion("changeUserName >", value, "changeUserName");
            return (Criteria) this;
        }

        public Criteria andChangeUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("changeUserName >=", value, "changeUserName");
            return (Criteria) this;
        }

        public Criteria andChangeUserNameLessThan(String value) {
            addCriterion("changeUserName <", value, "changeUserName");
            return (Criteria) this;
        }

        public Criteria andChangeUserNameLessThanOrEqualTo(String value) {
            addCriterion("changeUserName <=", value, "changeUserName");
            return (Criteria) this;
        }

        public Criteria andChangeUserNameLike(String value) {
            addCriterion("changeUserName like", value, "changeUserName");
            return (Criteria) this;
        }

        public Criteria andChangeUserNameNotLike(String value) {
            addCriterion("changeUserName not like", value, "changeUserName");
            return (Criteria) this;
        }

        public Criteria andChangeUserNameIn(List<String> values) {
            addCriterion("changeUserName in", values, "changeUserName");
            return (Criteria) this;
        }

        public Criteria andChangeUserNameNotIn(List<String> values) {
            addCriterion("changeUserName not in", values, "changeUserName");
            return (Criteria) this;
        }

        public Criteria andChangeUserNameBetween(String value1, String value2) {
            addCriterion("changeUserName between", value1, value2, "changeUserName");
            return (Criteria) this;
        }

        public Criteria andChangeUserNameNotBetween(String value1, String value2) {
            addCriterion("changeUserName not between", value1, value2, "changeUserName");
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

        public Criteria andIsPaidNameIsNull() {
            addCriterion("isPaidName is null");
            return (Criteria) this;
        }

        public Criteria andIsPaidNameIsNotNull() {
            addCriterion("isPaidName is not null");
            return (Criteria) this;
        }

        public Criteria andIsPaidNameEqualTo(String value) {
            addCriterion("isPaidName =", value, "isPaidName");
            return (Criteria) this;
        }

        public Criteria andIsPaidNameNotEqualTo(String value) {
            addCriterion("isPaidName <>", value, "isPaidName");
            return (Criteria) this;
        }

        public Criteria andIsPaidNameGreaterThan(String value) {
            addCriterion("isPaidName >", value, "isPaidName");
            return (Criteria) this;
        }

        public Criteria andIsPaidNameGreaterThanOrEqualTo(String value) {
            addCriterion("isPaidName >=", value, "isPaidName");
            return (Criteria) this;
        }

        public Criteria andIsPaidNameLessThan(String value) {
            addCriterion("isPaidName <", value, "isPaidName");
            return (Criteria) this;
        }

        public Criteria andIsPaidNameLessThanOrEqualTo(String value) {
            addCriterion("isPaidName <=", value, "isPaidName");
            return (Criteria) this;
        }

        public Criteria andIsPaidNameLike(String value) {
            addCriterion("isPaidName like", value, "isPaidName");
            return (Criteria) this;
        }

        public Criteria andIsPaidNameNotLike(String value) {
            addCriterion("isPaidName not like", value, "isPaidName");
            return (Criteria) this;
        }

        public Criteria andIsPaidNameIn(List<String> values) {
            addCriterion("isPaidName in", values, "isPaidName");
            return (Criteria) this;
        }

        public Criteria andIsPaidNameNotIn(List<String> values) {
            addCriterion("isPaidName not in", values, "isPaidName");
            return (Criteria) this;
        }

        public Criteria andIsPaidNameBetween(String value1, String value2) {
            addCriterion("isPaidName between", value1, value2, "isPaidName");
            return (Criteria) this;
        }

        public Criteria andIsPaidNameNotBetween(String value1, String value2) {
            addCriterion("isPaidName not between", value1, value2, "isPaidName");
            return (Criteria) this;
        }

        public Criteria andIsAbolishedNameIsNull() {
            addCriterion("isAbolishedName is null");
            return (Criteria) this;
        }

        public Criteria andIsAbolishedNameIsNotNull() {
            addCriterion("isAbolishedName is not null");
            return (Criteria) this;
        }

        public Criteria andIsAbolishedNameEqualTo(String value) {
            addCriterion("isAbolishedName =", value, "isAbolishedName");
            return (Criteria) this;
        }

        public Criteria andIsAbolishedNameNotEqualTo(String value) {
            addCriterion("isAbolishedName <>", value, "isAbolishedName");
            return (Criteria) this;
        }

        public Criteria andIsAbolishedNameGreaterThan(String value) {
            addCriterion("isAbolishedName >", value, "isAbolishedName");
            return (Criteria) this;
        }

        public Criteria andIsAbolishedNameGreaterThanOrEqualTo(String value) {
            addCriterion("isAbolishedName >=", value, "isAbolishedName");
            return (Criteria) this;
        }

        public Criteria andIsAbolishedNameLessThan(String value) {
            addCriterion("isAbolishedName <", value, "isAbolishedName");
            return (Criteria) this;
        }

        public Criteria andIsAbolishedNameLessThanOrEqualTo(String value) {
            addCriterion("isAbolishedName <=", value, "isAbolishedName");
            return (Criteria) this;
        }

        public Criteria andIsAbolishedNameLike(String value) {
            addCriterion("isAbolishedName like", value, "isAbolishedName");
            return (Criteria) this;
        }

        public Criteria andIsAbolishedNameNotLike(String value) {
            addCriterion("isAbolishedName not like", value, "isAbolishedName");
            return (Criteria) this;
        }

        public Criteria andIsAbolishedNameIn(List<String> values) {
            addCriterion("isAbolishedName in", values, "isAbolishedName");
            return (Criteria) this;
        }

        public Criteria andIsAbolishedNameNotIn(List<String> values) {
            addCriterion("isAbolishedName not in", values, "isAbolishedName");
            return (Criteria) this;
        }

        public Criteria andIsAbolishedNameBetween(String value1, String value2) {
            addCriterion("isAbolishedName between", value1, value2, "isAbolishedName");
            return (Criteria) this;
        }

        public Criteria andIsAbolishedNameNotBetween(String value1, String value2) {
            addCriterion("isAbolishedName not between", value1, value2, "isAbolishedName");
            return (Criteria) this;
        }

        public Criteria andIsDrawnNameIsNull() {
            addCriterion("isDrawnName is null");
            return (Criteria) this;
        }

        public Criteria andIsDrawnNameIsNotNull() {
            addCriterion("isDrawnName is not null");
            return (Criteria) this;
        }

        public Criteria andIsDrawnNameEqualTo(String value) {
            addCriterion("isDrawnName =", value, "isDrawnName");
            return (Criteria) this;
        }

        public Criteria andIsDrawnNameNotEqualTo(String value) {
            addCriterion("isDrawnName <>", value, "isDrawnName");
            return (Criteria) this;
        }

        public Criteria andIsDrawnNameGreaterThan(String value) {
            addCriterion("isDrawnName >", value, "isDrawnName");
            return (Criteria) this;
        }

        public Criteria andIsDrawnNameGreaterThanOrEqualTo(String value) {
            addCriterion("isDrawnName >=", value, "isDrawnName");
            return (Criteria) this;
        }

        public Criteria andIsDrawnNameLessThan(String value) {
            addCriterion("isDrawnName <", value, "isDrawnName");
            return (Criteria) this;
        }

        public Criteria andIsDrawnNameLessThanOrEqualTo(String value) {
            addCriterion("isDrawnName <=", value, "isDrawnName");
            return (Criteria) this;
        }

        public Criteria andIsDrawnNameLike(String value) {
            addCriterion("isDrawnName like", value, "isDrawnName");
            return (Criteria) this;
        }

        public Criteria andIsDrawnNameNotLike(String value) {
            addCriterion("isDrawnName not like", value, "isDrawnName");
            return (Criteria) this;
        }

        public Criteria andIsDrawnNameIn(List<String> values) {
            addCriterion("isDrawnName in", values, "isDrawnName");
            return (Criteria) this;
        }

        public Criteria andIsDrawnNameNotIn(List<String> values) {
            addCriterion("isDrawnName not in", values, "isDrawnName");
            return (Criteria) this;
        }

        public Criteria andIsDrawnNameBetween(String value1, String value2) {
            addCriterion("isDrawnName between", value1, value2, "isDrawnName");
            return (Criteria) this;
        }

        public Criteria andIsDrawnNameNotBetween(String value1, String value2) {
            addCriterion("isDrawnName not between", value1, value2, "isDrawnName");
            return (Criteria) this;
        }

        public Criteria andIsExecutedNameIsNull() {
            addCriterion("isExecutedName is null");
            return (Criteria) this;
        }

        public Criteria andIsExecutedNameIsNotNull() {
            addCriterion("isExecutedName is not null");
            return (Criteria) this;
        }

        public Criteria andIsExecutedNameEqualTo(String value) {
            addCriterion("isExecutedName =", value, "isExecutedName");
            return (Criteria) this;
        }

        public Criteria andIsExecutedNameNotEqualTo(String value) {
            addCriterion("isExecutedName <>", value, "isExecutedName");
            return (Criteria) this;
        }

        public Criteria andIsExecutedNameGreaterThan(String value) {
            addCriterion("isExecutedName >", value, "isExecutedName");
            return (Criteria) this;
        }

        public Criteria andIsExecutedNameGreaterThanOrEqualTo(String value) {
            addCriterion("isExecutedName >=", value, "isExecutedName");
            return (Criteria) this;
        }

        public Criteria andIsExecutedNameLessThan(String value) {
            addCriterion("isExecutedName <", value, "isExecutedName");
            return (Criteria) this;
        }

        public Criteria andIsExecutedNameLessThanOrEqualTo(String value) {
            addCriterion("isExecutedName <=", value, "isExecutedName");
            return (Criteria) this;
        }

        public Criteria andIsExecutedNameLike(String value) {
            addCriterion("isExecutedName like", value, "isExecutedName");
            return (Criteria) this;
        }

        public Criteria andIsExecutedNameNotLike(String value) {
            addCriterion("isExecutedName not like", value, "isExecutedName");
            return (Criteria) this;
        }

        public Criteria andIsExecutedNameIn(List<String> values) {
            addCriterion("isExecutedName in", values, "isExecutedName");
            return (Criteria) this;
        }

        public Criteria andIsExecutedNameNotIn(List<String> values) {
            addCriterion("isExecutedName not in", values, "isExecutedName");
            return (Criteria) this;
        }

        public Criteria andIsExecutedNameBetween(String value1, String value2) {
            addCriterion("isExecutedName between", value1, value2, "isExecutedName");
            return (Criteria) this;
        }

        public Criteria andIsExecutedNameNotBetween(String value1, String value2) {
            addCriterion("isExecutedName not between", value1, value2, "isExecutedName");
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