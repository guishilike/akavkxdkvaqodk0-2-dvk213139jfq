package edu.neu.hospital.example.basicTableExample;

import java.util.ArrayList;
import java.util.List;

public class PrescriptionviewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public PrescriptionviewExample() {
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

        public Criteria andDoctorNameIsNull() {
            addCriterion("doctorName is null");
            return (Criteria) this;
        }

        public Criteria andDoctorNameIsNotNull() {
            addCriterion("doctorName is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorNameEqualTo(String value) {
            addCriterion("doctorName =", value, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameNotEqualTo(String value) {
            addCriterion("doctorName <>", value, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameGreaterThan(String value) {
            addCriterion("doctorName >", value, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameGreaterThanOrEqualTo(String value) {
            addCriterion("doctorName >=", value, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameLessThan(String value) {
            addCriterion("doctorName <", value, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameLessThanOrEqualTo(String value) {
            addCriterion("doctorName <=", value, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameLike(String value) {
            addCriterion("doctorName like", value, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameNotLike(String value) {
            addCriterion("doctorName not like", value, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameIn(List<String> values) {
            addCriterion("doctorName in", values, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameNotIn(List<String> values) {
            addCriterion("doctorName not in", values, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameBetween(String value1, String value2) {
            addCriterion("doctorName between", value1, value2, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameNotBetween(String value1, String value2) {
            addCriterion("doctorName not between", value1, value2, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorRealNameIsNull() {
            addCriterion("doctorRealName is null");
            return (Criteria) this;
        }

        public Criteria andDoctorRealNameIsNotNull() {
            addCriterion("doctorRealName is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorRealNameEqualTo(String value) {
            addCriterion("doctorRealName =", value, "doctorRealName");
            return (Criteria) this;
        }

        public Criteria andDoctorRealNameNotEqualTo(String value) {
            addCriterion("doctorRealName <>", value, "doctorRealName");
            return (Criteria) this;
        }

        public Criteria andDoctorRealNameGreaterThan(String value) {
            addCriterion("doctorRealName >", value, "doctorRealName");
            return (Criteria) this;
        }

        public Criteria andDoctorRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("doctorRealName >=", value, "doctorRealName");
            return (Criteria) this;
        }

        public Criteria andDoctorRealNameLessThan(String value) {
            addCriterion("doctorRealName <", value, "doctorRealName");
            return (Criteria) this;
        }

        public Criteria andDoctorRealNameLessThanOrEqualTo(String value) {
            addCriterion("doctorRealName <=", value, "doctorRealName");
            return (Criteria) this;
        }

        public Criteria andDoctorRealNameLike(String value) {
            addCriterion("doctorRealName like", value, "doctorRealName");
            return (Criteria) this;
        }

        public Criteria andDoctorRealNameNotLike(String value) {
            addCriterion("doctorRealName not like", value, "doctorRealName");
            return (Criteria) this;
        }

        public Criteria andDoctorRealNameIn(List<String> values) {
            addCriterion("doctorRealName in", values, "doctorRealName");
            return (Criteria) this;
        }

        public Criteria andDoctorRealNameNotIn(List<String> values) {
            addCriterion("doctorRealName not in", values, "doctorRealName");
            return (Criteria) this;
        }

        public Criteria andDoctorRealNameBetween(String value1, String value2) {
            addCriterion("doctorRealName between", value1, value2, "doctorRealName");
            return (Criteria) this;
        }

        public Criteria andDoctorRealNameNotBetween(String value1, String value2) {
            addCriterion("doctorRealName not between", value1, value2, "doctorRealName");
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