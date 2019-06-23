package edu.neu.hospital.example.basicTableExample;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PrescriptionFeeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public PrescriptionFeeExample() {
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

        public Criteria andPrescriptionDetailIDIsNull() {
            addCriterion("prescriptionDetailID is null");
            return (Criteria) this;
        }

        public Criteria andPrescriptionDetailIDIsNotNull() {
            addCriterion("prescriptionDetailID is not null");
            return (Criteria) this;
        }

        public Criteria andPrescriptionDetailIDEqualTo(Integer value) {
            addCriterion("prescriptionDetailID =", value, "prescriptionDetailID");
            return (Criteria) this;
        }

        public Criteria andPrescriptionDetailIDNotEqualTo(Integer value) {
            addCriterion("prescriptionDetailID <>", value, "prescriptionDetailID");
            return (Criteria) this;
        }

        public Criteria andPrescriptionDetailIDGreaterThan(Integer value) {
            addCriterion("prescriptionDetailID >", value, "prescriptionDetailID");
            return (Criteria) this;
        }

        public Criteria andPrescriptionDetailIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("prescriptionDetailID >=", value, "prescriptionDetailID");
            return (Criteria) this;
        }

        public Criteria andPrescriptionDetailIDLessThan(Integer value) {
            addCriterion("prescriptionDetailID <", value, "prescriptionDetailID");
            return (Criteria) this;
        }

        public Criteria andPrescriptionDetailIDLessThanOrEqualTo(Integer value) {
            addCriterion("prescriptionDetailID <=", value, "prescriptionDetailID");
            return (Criteria) this;
        }

        public Criteria andPrescriptionDetailIDIn(List<Integer> values) {
            addCriterion("prescriptionDetailID in", values, "prescriptionDetailID");
            return (Criteria) this;
        }

        public Criteria andPrescriptionDetailIDNotIn(List<Integer> values) {
            addCriterion("prescriptionDetailID not in", values, "prescriptionDetailID");
            return (Criteria) this;
        }

        public Criteria andPrescriptionDetailIDBetween(Integer value1, Integer value2) {
            addCriterion("prescriptionDetailID between", value1, value2, "prescriptionDetailID");
            return (Criteria) this;
        }

        public Criteria andPrescriptionDetailIDNotBetween(Integer value1, Integer value2) {
            addCriterion("prescriptionDetailID not between", value1, value2, "prescriptionDetailID");
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