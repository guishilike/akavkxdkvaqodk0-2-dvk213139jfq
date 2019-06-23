package edu.neu.hospital.example.basicTableExample;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class InspectionFeeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public InspectionFeeExample() {
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

        public Criteria andInspectiondetailsIDIsNull() {
            addCriterion("inspectiondetailsID is null");
            return (Criteria) this;
        }

        public Criteria andInspectiondetailsIDIsNotNull() {
            addCriterion("inspectiondetailsID is not null");
            return (Criteria) this;
        }

        public Criteria andInspectiondetailsIDEqualTo(Integer value) {
            addCriterion("inspectiondetailsID =", value, "inspectiondetailsID");
            return (Criteria) this;
        }

        public Criteria andInspectiondetailsIDNotEqualTo(Integer value) {
            addCriterion("inspectiondetailsID <>", value, "inspectiondetailsID");
            return (Criteria) this;
        }

        public Criteria andInspectiondetailsIDGreaterThan(Integer value) {
            addCriterion("inspectiondetailsID >", value, "inspectiondetailsID");
            return (Criteria) this;
        }

        public Criteria andInspectiondetailsIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("inspectiondetailsID >=", value, "inspectiondetailsID");
            return (Criteria) this;
        }

        public Criteria andInspectiondetailsIDLessThan(Integer value) {
            addCriterion("inspectiondetailsID <", value, "inspectiondetailsID");
            return (Criteria) this;
        }

        public Criteria andInspectiondetailsIDLessThanOrEqualTo(Integer value) {
            addCriterion("inspectiondetailsID <=", value, "inspectiondetailsID");
            return (Criteria) this;
        }

        public Criteria andInspectiondetailsIDIn(List<Integer> values) {
            addCriterion("inspectiondetailsID in", values, "inspectiondetailsID");
            return (Criteria) this;
        }

        public Criteria andInspectiondetailsIDNotIn(List<Integer> values) {
            addCriterion("inspectiondetailsID not in", values, "inspectiondetailsID");
            return (Criteria) this;
        }

        public Criteria andInspectiondetailsIDBetween(Integer value1, Integer value2) {
            addCriterion("inspectiondetailsID between", value1, value2, "inspectiondetailsID");
            return (Criteria) this;
        }

        public Criteria andInspectiondetailsIDNotBetween(Integer value1, Integer value2) {
            addCriterion("inspectiondetailsID not between", value1, value2, "inspectiondetailsID");
            return (Criteria) this;
        }

        public Criteria andInspectionIDIsNull() {
            addCriterion("InspectionID is null");
            return (Criteria) this;
        }

        public Criteria andInspectionIDIsNotNull() {
            addCriterion("InspectionID is not null");
            return (Criteria) this;
        }

        public Criteria andInspectionIDEqualTo(Integer value) {
            addCriterion("InspectionID =", value, "inspectionID");
            return (Criteria) this;
        }

        public Criteria andInspectionIDNotEqualTo(Integer value) {
            addCriterion("InspectionID <>", value, "inspectionID");
            return (Criteria) this;
        }

        public Criteria andInspectionIDGreaterThan(Integer value) {
            addCriterion("InspectionID >", value, "inspectionID");
            return (Criteria) this;
        }

        public Criteria andInspectionIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("InspectionID >=", value, "inspectionID");
            return (Criteria) this;
        }

        public Criteria andInspectionIDLessThan(Integer value) {
            addCriterion("InspectionID <", value, "inspectionID");
            return (Criteria) this;
        }

        public Criteria andInspectionIDLessThanOrEqualTo(Integer value) {
            addCriterion("InspectionID <=", value, "inspectionID");
            return (Criteria) this;
        }

        public Criteria andInspectionIDIn(List<Integer> values) {
            addCriterion("InspectionID in", values, "inspectionID");
            return (Criteria) this;
        }

        public Criteria andInspectionIDNotIn(List<Integer> values) {
            addCriterion("InspectionID not in", values, "inspectionID");
            return (Criteria) this;
        }

        public Criteria andInspectionIDBetween(Integer value1, Integer value2) {
            addCriterion("InspectionID between", value1, value2, "inspectionID");
            return (Criteria) this;
        }

        public Criteria andInspectionIDNotBetween(Integer value1, Integer value2) {
            addCriterion("InspectionID not between", value1, value2, "inspectionID");
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

        public Criteria andExpClassIDIsNull() {
            addCriterion("expClassID is null");
            return (Criteria) this;
        }

        public Criteria andExpClassIDIsNotNull() {
            addCriterion("expClassID is not null");
            return (Criteria) this;
        }

        public Criteria andExpClassIDEqualTo(Integer value) {
            addCriterion("expClassID =", value, "expClassID");
            return (Criteria) this;
        }

        public Criteria andExpClassIDNotEqualTo(Integer value) {
            addCriterion("expClassID <>", value, "expClassID");
            return (Criteria) this;
        }

        public Criteria andExpClassIDGreaterThan(Integer value) {
            addCriterion("expClassID >", value, "expClassID");
            return (Criteria) this;
        }

        public Criteria andExpClassIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("expClassID >=", value, "expClassID");
            return (Criteria) this;
        }

        public Criteria andExpClassIDLessThan(Integer value) {
            addCriterion("expClassID <", value, "expClassID");
            return (Criteria) this;
        }

        public Criteria andExpClassIDLessThanOrEqualTo(Integer value) {
            addCriterion("expClassID <=", value, "expClassID");
            return (Criteria) this;
        }

        public Criteria andExpClassIDIn(List<Integer> values) {
            addCriterion("expClassID in", values, "expClassID");
            return (Criteria) this;
        }

        public Criteria andExpClassIDNotIn(List<Integer> values) {
            addCriterion("expClassID not in", values, "expClassID");
            return (Criteria) this;
        }

        public Criteria andExpClassIDBetween(Integer value1, Integer value2) {
            addCriterion("expClassID between", value1, value2, "expClassID");
            return (Criteria) this;
        }

        public Criteria andExpClassIDNotBetween(Integer value1, Integer value2) {
            addCriterion("expClassID not between", value1, value2, "expClassID");
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