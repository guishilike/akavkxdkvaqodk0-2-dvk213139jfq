package edu.neu.hospital.example.basicTableExample;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DiseaseViewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public DiseaseViewExample() {
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

        public Criteria andDiseaseIcdIsNull() {
            addCriterion("diseaseIcd is null");
            return (Criteria) this;
        }

        public Criteria andDiseaseIcdIsNotNull() {
            addCriterion("diseaseIcd is not null");
            return (Criteria) this;
        }

        public Criteria andDiseaseIcdEqualTo(String value) {
            addCriterion("diseaseIcd =", value, "diseaseIcd");
            return (Criteria) this;
        }

        public Criteria andDiseaseIcdNotEqualTo(String value) {
            addCriterion("diseaseIcd <>", value, "diseaseIcd");
            return (Criteria) this;
        }

        public Criteria andDiseaseIcdGreaterThan(String value) {
            addCriterion("diseaseIcd >", value, "diseaseIcd");
            return (Criteria) this;
        }

        public Criteria andDiseaseIcdGreaterThanOrEqualTo(String value) {
            addCriterion("diseaseIcd >=", value, "diseaseIcd");
            return (Criteria) this;
        }

        public Criteria andDiseaseIcdLessThan(String value) {
            addCriterion("diseaseIcd <", value, "diseaseIcd");
            return (Criteria) this;
        }

        public Criteria andDiseaseIcdLessThanOrEqualTo(String value) {
            addCriterion("diseaseIcd <=", value, "diseaseIcd");
            return (Criteria) this;
        }

        public Criteria andDiseaseIcdLike(String value) {
            addCriterion("diseaseIcd like", value, "diseaseIcd");
            return (Criteria) this;
        }

        public Criteria andDiseaseIcdNotLike(String value) {
            addCriterion("diseaseIcd not like", value, "diseaseIcd");
            return (Criteria) this;
        }

        public Criteria andDiseaseIcdIn(List<String> values) {
            addCriterion("diseaseIcd in", values, "diseaseIcd");
            return (Criteria) this;
        }

        public Criteria andDiseaseIcdNotIn(List<String> values) {
            addCriterion("diseaseIcd not in", values, "diseaseIcd");
            return (Criteria) this;
        }

        public Criteria andDiseaseIcdBetween(String value1, String value2) {
            addCriterion("diseaseIcd between", value1, value2, "diseaseIcd");
            return (Criteria) this;
        }

        public Criteria andDiseaseIcdNotBetween(String value1, String value2) {
            addCriterion("diseaseIcd not between", value1, value2, "diseaseIcd");
            return (Criteria) this;
        }

        public Criteria andDiseaseCatagoryIdIsNull() {
            addCriterion("diseaseCatagoryId is null");
            return (Criteria) this;
        }

        public Criteria andDiseaseCatagoryIdIsNotNull() {
            addCriterion("diseaseCatagoryId is not null");
            return (Criteria) this;
        }

        public Criteria andDiseaseCatagoryIdEqualTo(Integer value) {
            addCriterion("diseaseCatagoryId =", value, "diseaseCatagoryId");
            return (Criteria) this;
        }

        public Criteria andDiseaseCatagoryIdNotEqualTo(Integer value) {
            addCriterion("diseaseCatagoryId <>", value, "diseaseCatagoryId");
            return (Criteria) this;
        }

        public Criteria andDiseaseCatagoryIdGreaterThan(Integer value) {
            addCriterion("diseaseCatagoryId >", value, "diseaseCatagoryId");
            return (Criteria) this;
        }

        public Criteria andDiseaseCatagoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("diseaseCatagoryId >=", value, "diseaseCatagoryId");
            return (Criteria) this;
        }

        public Criteria andDiseaseCatagoryIdLessThan(Integer value) {
            addCriterion("diseaseCatagoryId <", value, "diseaseCatagoryId");
            return (Criteria) this;
        }

        public Criteria andDiseaseCatagoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("diseaseCatagoryId <=", value, "diseaseCatagoryId");
            return (Criteria) this;
        }

        public Criteria andDiseaseCatagoryIdIn(List<Integer> values) {
            addCriterion("diseaseCatagoryId in", values, "diseaseCatagoryId");
            return (Criteria) this;
        }

        public Criteria andDiseaseCatagoryIdNotIn(List<Integer> values) {
            addCriterion("diseaseCatagoryId not in", values, "diseaseCatagoryId");
            return (Criteria) this;
        }

        public Criteria andDiseaseCatagoryIdBetween(Integer value1, Integer value2) {
            addCriterion("diseaseCatagoryId between", value1, value2, "diseaseCatagoryId");
            return (Criteria) this;
        }

        public Criteria andDiseaseCatagoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("diseaseCatagoryId not between", value1, value2, "diseaseCatagoryId");
            return (Criteria) this;
        }

        public Criteria andDiseaseCategoryCodeIsNull() {
            addCriterion("diseaseCategoryCode is null");
            return (Criteria) this;
        }

        public Criteria andDiseaseCategoryCodeIsNotNull() {
            addCriterion("diseaseCategoryCode is not null");
            return (Criteria) this;
        }

        public Criteria andDiseaseCategoryCodeEqualTo(String value) {
            addCriterion("diseaseCategoryCode =", value, "diseaseCategoryCode");
            return (Criteria) this;
        }

        public Criteria andDiseaseCategoryCodeNotEqualTo(String value) {
            addCriterion("diseaseCategoryCode <>", value, "diseaseCategoryCode");
            return (Criteria) this;
        }

        public Criteria andDiseaseCategoryCodeGreaterThan(String value) {
            addCriterion("diseaseCategoryCode >", value, "diseaseCategoryCode");
            return (Criteria) this;
        }

        public Criteria andDiseaseCategoryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("diseaseCategoryCode >=", value, "diseaseCategoryCode");
            return (Criteria) this;
        }

        public Criteria andDiseaseCategoryCodeLessThan(String value) {
            addCriterion("diseaseCategoryCode <", value, "diseaseCategoryCode");
            return (Criteria) this;
        }

        public Criteria andDiseaseCategoryCodeLessThanOrEqualTo(String value) {
            addCriterion("diseaseCategoryCode <=", value, "diseaseCategoryCode");
            return (Criteria) this;
        }

        public Criteria andDiseaseCategoryCodeLike(String value) {
            addCriterion("diseaseCategoryCode like", value, "diseaseCategoryCode");
            return (Criteria) this;
        }

        public Criteria andDiseaseCategoryCodeNotLike(String value) {
            addCriterion("diseaseCategoryCode not like", value, "diseaseCategoryCode");
            return (Criteria) this;
        }

        public Criteria andDiseaseCategoryCodeIn(List<String> values) {
            addCriterion("diseaseCategoryCode in", values, "diseaseCategoryCode");
            return (Criteria) this;
        }

        public Criteria andDiseaseCategoryCodeNotIn(List<String> values) {
            addCriterion("diseaseCategoryCode not in", values, "diseaseCategoryCode");
            return (Criteria) this;
        }

        public Criteria andDiseaseCategoryCodeBetween(String value1, String value2) {
            addCriterion("diseaseCategoryCode between", value1, value2, "diseaseCategoryCode");
            return (Criteria) this;
        }

        public Criteria andDiseaseCategoryCodeNotBetween(String value1, String value2) {
            addCriterion("diseaseCategoryCode not between", value1, value2, "diseaseCategoryCode");
            return (Criteria) this;
        }

        public Criteria andDiseaseCategoryNameIsNull() {
            addCriterion("diseaseCategoryName is null");
            return (Criteria) this;
        }

        public Criteria andDiseaseCategoryNameIsNotNull() {
            addCriterion("diseaseCategoryName is not null");
            return (Criteria) this;
        }

        public Criteria andDiseaseCategoryNameEqualTo(String value) {
            addCriterion("diseaseCategoryName =", value, "diseaseCategoryName");
            return (Criteria) this;
        }

        public Criteria andDiseaseCategoryNameNotEqualTo(String value) {
            addCriterion("diseaseCategoryName <>", value, "diseaseCategoryName");
            return (Criteria) this;
        }

        public Criteria andDiseaseCategoryNameGreaterThan(String value) {
            addCriterion("diseaseCategoryName >", value, "diseaseCategoryName");
            return (Criteria) this;
        }

        public Criteria andDiseaseCategoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("diseaseCategoryName >=", value, "diseaseCategoryName");
            return (Criteria) this;
        }

        public Criteria andDiseaseCategoryNameLessThan(String value) {
            addCriterion("diseaseCategoryName <", value, "diseaseCategoryName");
            return (Criteria) this;
        }

        public Criteria andDiseaseCategoryNameLessThanOrEqualTo(String value) {
            addCriterion("diseaseCategoryName <=", value, "diseaseCategoryName");
            return (Criteria) this;
        }

        public Criteria andDiseaseCategoryNameLike(String value) {
            addCriterion("diseaseCategoryName like", value, "diseaseCategoryName");
            return (Criteria) this;
        }

        public Criteria andDiseaseCategoryNameNotLike(String value) {
            addCriterion("diseaseCategoryName not like", value, "diseaseCategoryName");
            return (Criteria) this;
        }

        public Criteria andDiseaseCategoryNameIn(List<String> values) {
            addCriterion("diseaseCategoryName in", values, "diseaseCategoryName");
            return (Criteria) this;
        }

        public Criteria andDiseaseCategoryNameNotIn(List<String> values) {
            addCriterion("diseaseCategoryName not in", values, "diseaseCategoryName");
            return (Criteria) this;
        }

        public Criteria andDiseaseCategoryNameBetween(String value1, String value2) {
            addCriterion("diseaseCategoryName between", value1, value2, "diseaseCategoryName");
            return (Criteria) this;
        }

        public Criteria andDiseaseCategoryNameNotBetween(String value1, String value2) {
            addCriterion("diseaseCategoryName not between", value1, value2, "diseaseCategoryName");
            return (Criteria) this;
        }

        public Criteria andDicaTypeIDIsNull() {
            addCriterion("dicaTypeID is null");
            return (Criteria) this;
        }

        public Criteria andDicaTypeIDIsNotNull() {
            addCriterion("dicaTypeID is not null");
            return (Criteria) this;
        }

        public Criteria andDicaTypeIDEqualTo(Integer value) {
            addCriterion("dicaTypeID =", value, "dicaTypeID");
            return (Criteria) this;
        }

        public Criteria andDicaTypeIDNotEqualTo(Integer value) {
            addCriterion("dicaTypeID <>", value, "dicaTypeID");
            return (Criteria) this;
        }

        public Criteria andDicaTypeIDGreaterThan(Integer value) {
            addCriterion("dicaTypeID >", value, "dicaTypeID");
            return (Criteria) this;
        }

        public Criteria andDicaTypeIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("dicaTypeID >=", value, "dicaTypeID");
            return (Criteria) this;
        }

        public Criteria andDicaTypeIDLessThan(Integer value) {
            addCriterion("dicaTypeID <", value, "dicaTypeID");
            return (Criteria) this;
        }

        public Criteria andDicaTypeIDLessThanOrEqualTo(Integer value) {
            addCriterion("dicaTypeID <=", value, "dicaTypeID");
            return (Criteria) this;
        }

        public Criteria andDicaTypeIDIn(List<Integer> values) {
            addCriterion("dicaTypeID in", values, "dicaTypeID");
            return (Criteria) this;
        }

        public Criteria andDicaTypeIDNotIn(List<Integer> values) {
            addCriterion("dicaTypeID not in", values, "dicaTypeID");
            return (Criteria) this;
        }

        public Criteria andDicaTypeIDBetween(Integer value1, Integer value2) {
            addCriterion("dicaTypeID between", value1, value2, "dicaTypeID");
            return (Criteria) this;
        }

        public Criteria andDicaTypeIDNotBetween(Integer value1, Integer value2) {
            addCriterion("dicaTypeID not between", value1, value2, "dicaTypeID");
            return (Criteria) this;
        }

        public Criteria andDicaTypeCodeIsNull() {
            addCriterion("dicaTypeCode is null");
            return (Criteria) this;
        }

        public Criteria andDicaTypeCodeIsNotNull() {
            addCriterion("dicaTypeCode is not null");
            return (Criteria) this;
        }

        public Criteria andDicaTypeCodeEqualTo(String value) {
            addCriterion("dicaTypeCode =", value, "dicaTypeCode");
            return (Criteria) this;
        }

        public Criteria andDicaTypeCodeNotEqualTo(String value) {
            addCriterion("dicaTypeCode <>", value, "dicaTypeCode");
            return (Criteria) this;
        }

        public Criteria andDicaTypeCodeGreaterThan(String value) {
            addCriterion("dicaTypeCode >", value, "dicaTypeCode");
            return (Criteria) this;
        }

        public Criteria andDicaTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("dicaTypeCode >=", value, "dicaTypeCode");
            return (Criteria) this;
        }

        public Criteria andDicaTypeCodeLessThan(String value) {
            addCriterion("dicaTypeCode <", value, "dicaTypeCode");
            return (Criteria) this;
        }

        public Criteria andDicaTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("dicaTypeCode <=", value, "dicaTypeCode");
            return (Criteria) this;
        }

        public Criteria andDicaTypeCodeLike(String value) {
            addCriterion("dicaTypeCode like", value, "dicaTypeCode");
            return (Criteria) this;
        }

        public Criteria andDicaTypeCodeNotLike(String value) {
            addCriterion("dicaTypeCode not like", value, "dicaTypeCode");
            return (Criteria) this;
        }

        public Criteria andDicaTypeCodeIn(List<String> values) {
            addCriterion("dicaTypeCode in", values, "dicaTypeCode");
            return (Criteria) this;
        }

        public Criteria andDicaTypeCodeNotIn(List<String> values) {
            addCriterion("dicaTypeCode not in", values, "dicaTypeCode");
            return (Criteria) this;
        }

        public Criteria andDicaTypeCodeBetween(String value1, String value2) {
            addCriterion("dicaTypeCode between", value1, value2, "dicaTypeCode");
            return (Criteria) this;
        }

        public Criteria andDicaTypeCodeNotBetween(String value1, String value2) {
            addCriterion("dicaTypeCode not between", value1, value2, "dicaTypeCode");
            return (Criteria) this;
        }

        public Criteria andDicaTypeNameIsNull() {
            addCriterion("dicaTypeName is null");
            return (Criteria) this;
        }

        public Criteria andDicaTypeNameIsNotNull() {
            addCriterion("dicaTypeName is not null");
            return (Criteria) this;
        }

        public Criteria andDicaTypeNameEqualTo(String value) {
            addCriterion("dicaTypeName =", value, "dicaTypeName");
            return (Criteria) this;
        }

        public Criteria andDicaTypeNameNotEqualTo(String value) {
            addCriterion("dicaTypeName <>", value, "dicaTypeName");
            return (Criteria) this;
        }

        public Criteria andDicaTypeNameGreaterThan(String value) {
            addCriterion("dicaTypeName >", value, "dicaTypeName");
            return (Criteria) this;
        }

        public Criteria andDicaTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("dicaTypeName >=", value, "dicaTypeName");
            return (Criteria) this;
        }

        public Criteria andDicaTypeNameLessThan(String value) {
            addCriterion("dicaTypeName <", value, "dicaTypeName");
            return (Criteria) this;
        }

        public Criteria andDicaTypeNameLessThanOrEqualTo(String value) {
            addCriterion("dicaTypeName <=", value, "dicaTypeName");
            return (Criteria) this;
        }

        public Criteria andDicaTypeNameLike(String value) {
            addCriterion("dicaTypeName like", value, "dicaTypeName");
            return (Criteria) this;
        }

        public Criteria andDicaTypeNameNotLike(String value) {
            addCriterion("dicaTypeName not like", value, "dicaTypeName");
            return (Criteria) this;
        }

        public Criteria andDicaTypeNameIn(List<String> values) {
            addCriterion("dicaTypeName in", values, "dicaTypeName");
            return (Criteria) this;
        }

        public Criteria andDicaTypeNameNotIn(List<String> values) {
            addCriterion("dicaTypeName not in", values, "dicaTypeName");
            return (Criteria) this;
        }

        public Criteria andDicaTypeNameBetween(String value1, String value2) {
            addCriterion("dicaTypeName between", value1, value2, "dicaTypeName");
            return (Criteria) this;
        }

        public Criteria andDicaTypeNameNotBetween(String value1, String value2) {
            addCriterion("dicaTypeName not between", value1, value2, "dicaTypeName");
            return (Criteria) this;
        }

        public Criteria andAppearUserIdIsNull() {
            addCriterion("appearUserId is null");
            return (Criteria) this;
        }

        public Criteria andAppearUserIdIsNotNull() {
            addCriterion("appearUserId is not null");
            return (Criteria) this;
        }

        public Criteria andAppearUserIdEqualTo(Integer value) {
            addCriterion("appearUserId =", value, "appearUserId");
            return (Criteria) this;
        }

        public Criteria andAppearUserIdNotEqualTo(Integer value) {
            addCriterion("appearUserId <>", value, "appearUserId");
            return (Criteria) this;
        }

        public Criteria andAppearUserIdGreaterThan(Integer value) {
            addCriterion("appearUserId >", value, "appearUserId");
            return (Criteria) this;
        }

        public Criteria andAppearUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("appearUserId >=", value, "appearUserId");
            return (Criteria) this;
        }

        public Criteria andAppearUserIdLessThan(Integer value) {
            addCriterion("appearUserId <", value, "appearUserId");
            return (Criteria) this;
        }

        public Criteria andAppearUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("appearUserId <=", value, "appearUserId");
            return (Criteria) this;
        }

        public Criteria andAppearUserIdIn(List<Integer> values) {
            addCriterion("appearUserId in", values, "appearUserId");
            return (Criteria) this;
        }

        public Criteria andAppearUserIdNotIn(List<Integer> values) {
            addCriterion("appearUserId not in", values, "appearUserId");
            return (Criteria) this;
        }

        public Criteria andAppearUserIdBetween(Integer value1, Integer value2) {
            addCriterion("appearUserId between", value1, value2, "appearUserId");
            return (Criteria) this;
        }

        public Criteria andAppearUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("appearUserId not between", value1, value2, "appearUserId");
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

        public Criteria andChangeUserIdIsNull() {
            addCriterion("changeUserId is null");
            return (Criteria) this;
        }

        public Criteria andChangeUserIdIsNotNull() {
            addCriterion("changeUserId is not null");
            return (Criteria) this;
        }

        public Criteria andChangeUserIdEqualTo(Integer value) {
            addCriterion("changeUserId =", value, "changeUserId");
            return (Criteria) this;
        }

        public Criteria andChangeUserIdNotEqualTo(Integer value) {
            addCriterion("changeUserId <>", value, "changeUserId");
            return (Criteria) this;
        }

        public Criteria andChangeUserIdGreaterThan(Integer value) {
            addCriterion("changeUserId >", value, "changeUserId");
            return (Criteria) this;
        }

        public Criteria andChangeUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("changeUserId >=", value, "changeUserId");
            return (Criteria) this;
        }

        public Criteria andChangeUserIdLessThan(Integer value) {
            addCriterion("changeUserId <", value, "changeUserId");
            return (Criteria) this;
        }

        public Criteria andChangeUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("changeUserId <=", value, "changeUserId");
            return (Criteria) this;
        }

        public Criteria andChangeUserIdIn(List<Integer> values) {
            addCriterion("changeUserId in", values, "changeUserId");
            return (Criteria) this;
        }

        public Criteria andChangeUserIdNotIn(List<Integer> values) {
            addCriterion("changeUserId not in", values, "changeUserId");
            return (Criteria) this;
        }

        public Criteria andChangeUserIdBetween(Integer value1, Integer value2) {
            addCriterion("changeUserId between", value1, value2, "changeUserId");
            return (Criteria) this;
        }

        public Criteria andChangeUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("changeUserId not between", value1, value2, "changeUserId");
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