package edu.neu.hospital.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CheckExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public CheckExample() {
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

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNull() {
            addCriterion("realName is null");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNotNull() {
            addCriterion("realName is not null");
            return (Criteria) this;
        }

        public Criteria andRealnameEqualTo(String value) {
            addCriterion("realName =", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotEqualTo(String value) {
            addCriterion("realName <>", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThan(String value) {
            addCriterion("realName >", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThanOrEqualTo(String value) {
            addCriterion("realName >=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThan(String value) {
            addCriterion("realName <", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThanOrEqualTo(String value) {
            addCriterion("realName <=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLike(String value) {
            addCriterion("realName like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotLike(String value) {
            addCriterion("realName not like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameIn(List<String> values) {
            addCriterion("realName in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotIn(List<String> values) {
            addCriterion("realName not in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameBetween(String value1, String value2) {
            addCriterion("realName between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotBetween(String value1, String value2) {
            addCriterion("realName not between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andDeptnameIsNull() {
            addCriterion("deptName is null");
            return (Criteria) this;
        }

        public Criteria andDeptnameIsNotNull() {
            addCriterion("deptName is not null");
            return (Criteria) this;
        }

        public Criteria andDeptnameEqualTo(String value) {
            addCriterion("deptName =", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameNotEqualTo(String value) {
            addCriterion("deptName <>", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameGreaterThan(String value) {
            addCriterion("deptName >", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameGreaterThanOrEqualTo(String value) {
            addCriterion("deptName >=", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameLessThan(String value) {
            addCriterion("deptName <", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameLessThanOrEqualTo(String value) {
            addCriterion("deptName <=", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameLike(String value) {
            addCriterion("deptName like", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameNotLike(String value) {
            addCriterion("deptName not like", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameIn(List<String> values) {
            addCriterion("deptName in", values, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameNotIn(List<String> values) {
            addCriterion("deptName not in", values, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameBetween(String value1, String value2) {
            addCriterion("deptName between", value1, value2, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameNotBetween(String value1, String value2) {
            addCriterion("deptName not between", value1, value2, "deptname");
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

        public Criteria andFeecategoryIsNull() {
            addCriterion("feeCategory is null");
            return (Criteria) this;
        }

        public Criteria andFeecategoryIsNotNull() {
            addCriterion("feeCategory is not null");
            return (Criteria) this;
        }

        public Criteria andFeecategoryEqualTo(String value) {
            addCriterion("feeCategory =", value, "feecategory");
            return (Criteria) this;
        }

        public Criteria andFeecategoryNotEqualTo(String value) {
            addCriterion("feeCategory <>", value, "feecategory");
            return (Criteria) this;
        }

        public Criteria andFeecategoryGreaterThan(String value) {
            addCriterion("feeCategory >", value, "feecategory");
            return (Criteria) this;
        }

        public Criteria andFeecategoryGreaterThanOrEqualTo(String value) {
            addCriterion("feeCategory >=", value, "feecategory");
            return (Criteria) this;
        }

        public Criteria andFeecategoryLessThan(String value) {
            addCriterion("feeCategory <", value, "feecategory");
            return (Criteria) this;
        }

        public Criteria andFeecategoryLessThanOrEqualTo(String value) {
            addCriterion("feeCategory <=", value, "feecategory");
            return (Criteria) this;
        }

        public Criteria andFeecategoryLike(String value) {
            addCriterion("feeCategory like", value, "feecategory");
            return (Criteria) this;
        }

        public Criteria andFeecategoryNotLike(String value) {
            addCriterion("feeCategory not like", value, "feecategory");
            return (Criteria) this;
        }

        public Criteria andFeecategoryIn(List<String> values) {
            addCriterion("feeCategory in", values, "feecategory");
            return (Criteria) this;
        }

        public Criteria andFeecategoryNotIn(List<String> values) {
            addCriterion("feeCategory not in", values, "feecategory");
            return (Criteria) this;
        }

        public Criteria andFeecategoryBetween(String value1, String value2) {
            addCriterion("feeCategory between", value1, value2, "feecategory");
            return (Criteria) this;
        }

        public Criteria andFeecategoryNotBetween(String value1, String value2) {
            addCriterion("feeCategory not between", value1, value2, "feecategory");
            return (Criteria) this;
        }

        public Criteria andFee1IsNull() {
            addCriterion("fee1 is null");
            return (Criteria) this;
        }

        public Criteria andFee1IsNotNull() {
            addCriterion("fee1 is not null");
            return (Criteria) this;
        }

        public Criteria andFee1EqualTo(BigDecimal value) {
            addCriterion("fee1 =", value, "fee1");
            return (Criteria) this;
        }

        public Criteria andFee1NotEqualTo(BigDecimal value) {
            addCriterion("fee1 <>", value, "fee1");
            return (Criteria) this;
        }

        public Criteria andFee1GreaterThan(BigDecimal value) {
            addCriterion("fee1 >", value, "fee1");
            return (Criteria) this;
        }

        public Criteria andFee1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fee1 >=", value, "fee1");
            return (Criteria) this;
        }

        public Criteria andFee1LessThan(BigDecimal value) {
            addCriterion("fee1 <", value, "fee1");
            return (Criteria) this;
        }

        public Criteria andFee1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("fee1 <=", value, "fee1");
            return (Criteria) this;
        }

        public Criteria andFee1In(List<BigDecimal> values) {
            addCriterion("fee1 in", values, "fee1");
            return (Criteria) this;
        }

        public Criteria andFee1NotIn(List<BigDecimal> values) {
            addCriterion("fee1 not in", values, "fee1");
            return (Criteria) this;
        }

        public Criteria andFee1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("fee1 between", value1, value2, "fee1");
            return (Criteria) this;
        }

        public Criteria andFee1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fee1 not between", value1, value2, "fee1");
            return (Criteria) this;
        }

        public Criteria andFee2IsNull() {
            addCriterion("fee2 is null");
            return (Criteria) this;
        }

        public Criteria andFee2IsNotNull() {
            addCriterion("fee2 is not null");
            return (Criteria) this;
        }

        public Criteria andFee2EqualTo(BigDecimal value) {
            addCriterion("fee2 =", value, "fee2");
            return (Criteria) this;
        }

        public Criteria andFee2NotEqualTo(BigDecimal value) {
            addCriterion("fee2 <>", value, "fee2");
            return (Criteria) this;
        }

        public Criteria andFee2GreaterThan(BigDecimal value) {
            addCriterion("fee2 >", value, "fee2");
            return (Criteria) this;
        }

        public Criteria andFee2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fee2 >=", value, "fee2");
            return (Criteria) this;
        }

        public Criteria andFee2LessThan(BigDecimal value) {
            addCriterion("fee2 <", value, "fee2");
            return (Criteria) this;
        }

        public Criteria andFee2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("fee2 <=", value, "fee2");
            return (Criteria) this;
        }

        public Criteria andFee2In(List<BigDecimal> values) {
            addCriterion("fee2 in", values, "fee2");
            return (Criteria) this;
        }

        public Criteria andFee2NotIn(List<BigDecimal> values) {
            addCriterion("fee2 not in", values, "fee2");
            return (Criteria) this;
        }

        public Criteria andFee2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("fee2 between", value1, value2, "fee2");
            return (Criteria) this;
        }

        public Criteria andFee2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fee2 not between", value1, value2, "fee2");
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