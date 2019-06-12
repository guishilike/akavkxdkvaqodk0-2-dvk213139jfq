package edu.neu.hospital.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class FmeditemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public FmeditemExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andDeptIDIsNull() {
            addCriterion("deptID is null");
            return (Criteria) this;
        }

        public Criteria andDeptIDIsNotNull() {
            addCriterion("deptID is not null");
            return (Criteria) this;
        }

        public Criteria andDeptIDEqualTo(Integer value) {
            addCriterion("deptID =", value, "deptID");
            return (Criteria) this;
        }

        public Criteria andDeptIDNotEqualTo(Integer value) {
            addCriterion("deptID <>", value, "deptID");
            return (Criteria) this;
        }

        public Criteria andDeptIDGreaterThan(Integer value) {
            addCriterion("deptID >", value, "deptID");
            return (Criteria) this;
        }

        public Criteria andDeptIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("deptID >=", value, "deptID");
            return (Criteria) this;
        }

        public Criteria andDeptIDLessThan(Integer value) {
            addCriterion("deptID <", value, "deptID");
            return (Criteria) this;
        }

        public Criteria andDeptIDLessThanOrEqualTo(Integer value) {
            addCriterion("deptID <=", value, "deptID");
            return (Criteria) this;
        }

        public Criteria andDeptIDIn(List<Integer> values) {
            addCriterion("deptID in", values, "deptID");
            return (Criteria) this;
        }

        public Criteria andDeptIDNotIn(List<Integer> values) {
            addCriterion("deptID not in", values, "deptID");
            return (Criteria) this;
        }

        public Criteria andDeptIDBetween(Integer value1, Integer value2) {
            addCriterion("deptID between", value1, value2, "deptID");
            return (Criteria) this;
        }

        public Criteria andDeptIDNotBetween(Integer value1, Integer value2) {
            addCriterion("deptID not between", value1, value2, "deptID");
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

        public Criteria andRecordTypeIsNull() {
            addCriterion("recordType is null");
            return (Criteria) this;
        }

        public Criteria andRecordTypeIsNotNull() {
            addCriterion("recordType is not null");
            return (Criteria) this;
        }

        public Criteria andRecordTypeEqualTo(Integer value) {
            addCriterion("recordType =", value, "recordType");
            return (Criteria) this;
        }

        public Criteria andRecordTypeNotEqualTo(Integer value) {
            addCriterion("recordType <>", value, "recordType");
            return (Criteria) this;
        }

        public Criteria andRecordTypeGreaterThan(Integer value) {
            addCriterion("recordType >", value, "recordType");
            return (Criteria) this;
        }

        public Criteria andRecordTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("recordType >=", value, "recordType");
            return (Criteria) this;
        }

        public Criteria andRecordTypeLessThan(Integer value) {
            addCriterion("recordType <", value, "recordType");
            return (Criteria) this;
        }

        public Criteria andRecordTypeLessThanOrEqualTo(Integer value) {
            addCriterion("recordType <=", value, "recordType");
            return (Criteria) this;
        }

        public Criteria andRecordTypeIn(List<Integer> values) {
            addCriterion("recordType in", values, "recordType");
            return (Criteria) this;
        }

        public Criteria andRecordTypeNotIn(List<Integer> values) {
            addCriterion("recordType not in", values, "recordType");
            return (Criteria) this;
        }

        public Criteria andRecordTypeBetween(Integer value1, Integer value2) {
            addCriterion("recordType between", value1, value2, "recordType");
            return (Criteria) this;
        }

        public Criteria andRecordTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("recordType not between", value1, value2, "recordType");
            return (Criteria) this;
        }

        public Criteria andCreationDateIsNull() {
            addCriterion("creationDate is null");
            return (Criteria) this;
        }

        public Criteria andCreationDateIsNotNull() {
            addCriterion("creationDate is not null");
            return (Criteria) this;
        }

        public Criteria andCreationDateEqualTo(Date value) {
            addCriterionForJDBCDate("creationDate =", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("creationDate <>", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateGreaterThan(Date value) {
            addCriterionForJDBCDate("creationDate >", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("creationDate >=", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateLessThan(Date value) {
            addCriterionForJDBCDate("creationDate <", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("creationDate <=", value, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateIn(List<Date> values) {
            addCriterionForJDBCDate("creationDate in", values, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("creationDate not in", values, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("creationDate between", value1, value2, "creationDate");
            return (Criteria) this;
        }

        public Criteria andCreationDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("creationDate not between", value1, value2, "creationDate");
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