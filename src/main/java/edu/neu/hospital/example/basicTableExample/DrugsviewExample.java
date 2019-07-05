package edu.neu.hospital.example.basicTableExample;

import java.util.ArrayList;
import java.util.List;

public class DrugsviewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public DrugsviewExample() {
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

        public Criteria andDrugsDosageIsNull() {
            addCriterion("drugsDosage is null");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageIsNotNull() {
            addCriterion("drugsDosage is not null");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageEqualTo(String value) {
            addCriterion("drugsDosage =", value, "drugsDosage");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageNotEqualTo(String value) {
            addCriterion("drugsDosage <>", value, "drugsDosage");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageGreaterThan(String value) {
            addCriterion("drugsDosage >", value, "drugsDosage");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageGreaterThanOrEqualTo(String value) {
            addCriterion("drugsDosage >=", value, "drugsDosage");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageLessThan(String value) {
            addCriterion("drugsDosage <", value, "drugsDosage");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageLessThanOrEqualTo(String value) {
            addCriterion("drugsDosage <=", value, "drugsDosage");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageLike(String value) {
            addCriterion("drugsDosage like", value, "drugsDosage");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageNotLike(String value) {
            addCriterion("drugsDosage not like", value, "drugsDosage");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageIn(List<String> values) {
            addCriterion("drugsDosage in", values, "drugsDosage");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageNotIn(List<String> values) {
            addCriterion("drugsDosage not in", values, "drugsDosage");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageBetween(String value1, String value2) {
            addCriterion("drugsDosage between", value1, value2, "drugsDosage");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageNotBetween(String value1, String value2) {
            addCriterion("drugsDosage not between", value1, value2, "drugsDosage");
            return (Criteria) this;
        }

        public Criteria andDrugsTypeIsNull() {
            addCriterion("drugsType is null");
            return (Criteria) this;
        }

        public Criteria andDrugsTypeIsNotNull() {
            addCriterion("drugsType is not null");
            return (Criteria) this;
        }

        public Criteria andDrugsTypeEqualTo(String value) {
            addCriterion("drugsType =", value, "drugsType");
            return (Criteria) this;
        }

        public Criteria andDrugsTypeNotEqualTo(String value) {
            addCriterion("drugsType <>", value, "drugsType");
            return (Criteria) this;
        }

        public Criteria andDrugsTypeGreaterThan(String value) {
            addCriterion("drugsType >", value, "drugsType");
            return (Criteria) this;
        }

        public Criteria andDrugsTypeGreaterThanOrEqualTo(String value) {
            addCriterion("drugsType >=", value, "drugsType");
            return (Criteria) this;
        }

        public Criteria andDrugsTypeLessThan(String value) {
            addCriterion("drugsType <", value, "drugsType");
            return (Criteria) this;
        }

        public Criteria andDrugsTypeLessThanOrEqualTo(String value) {
            addCriterion("drugsType <=", value, "drugsType");
            return (Criteria) this;
        }

        public Criteria andDrugsTypeLike(String value) {
            addCriterion("drugsType like", value, "drugsType");
            return (Criteria) this;
        }

        public Criteria andDrugsTypeNotLike(String value) {
            addCriterion("drugsType not like", value, "drugsType");
            return (Criteria) this;
        }

        public Criteria andDrugsTypeIn(List<String> values) {
            addCriterion("drugsType in", values, "drugsType");
            return (Criteria) this;
        }

        public Criteria andDrugsTypeNotIn(List<String> values) {
            addCriterion("drugsType not in", values, "drugsType");
            return (Criteria) this;
        }

        public Criteria andDrugsTypeBetween(String value1, String value2) {
            addCriterion("drugsType between", value1, value2, "drugsType");
            return (Criteria) this;
        }

        public Criteria andDrugsTypeNotBetween(String value1, String value2) {
            addCriterion("drugsType not between", value1, value2, "drugsType");
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