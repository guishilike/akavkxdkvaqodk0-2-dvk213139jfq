package edu.neu.hospital.example.baseExample;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DepartmentViewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public DepartmentViewExample() {
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

        public Criteria andDeptCodeIsNull() {
            addCriterion("deptCode is null");
            return (Criteria) this;
        }

        public Criteria andDeptCodeIsNotNull() {
            addCriterion("deptCode is not null");
            return (Criteria) this;
        }

        public Criteria andDeptCodeEqualTo(String value) {
            addCriterion("deptCode =", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotEqualTo(String value) {
            addCriterion("deptCode <>", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeGreaterThan(String value) {
            addCriterion("deptCode >", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeGreaterThanOrEqualTo(String value) {
            addCriterion("deptCode >=", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeLessThan(String value) {
            addCriterion("deptCode <", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeLessThanOrEqualTo(String value) {
            addCriterion("deptCode <=", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeLike(String value) {
            addCriterion("deptCode like", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotLike(String value) {
            addCriterion("deptCode not like", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeIn(List<String> values) {
            addCriterion("deptCode in", values, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotIn(List<String> values) {
            addCriterion("deptCode not in", values, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeBetween(String value1, String value2) {
            addCriterion("deptCode between", value1, value2, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotBetween(String value1, String value2) {
            addCriterion("deptCode not between", value1, value2, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptNameIsNull() {
            addCriterion("deptName is null");
            return (Criteria) this;
        }

        public Criteria andDeptNameIsNotNull() {
            addCriterion("deptName is not null");
            return (Criteria) this;
        }

        public Criteria andDeptNameEqualTo(String value) {
            addCriterion("deptName =", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotEqualTo(String value) {
            addCriterion("deptName <>", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameGreaterThan(String value) {
            addCriterion("deptName >", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameGreaterThanOrEqualTo(String value) {
            addCriterion("deptName >=", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLessThan(String value) {
            addCriterion("deptName <", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLessThanOrEqualTo(String value) {
            addCriterion("deptName <=", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLike(String value) {
            addCriterion("deptName like", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotLike(String value) {
            addCriterion("deptName not like", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameIn(List<String> values) {
            addCriterion("deptName in", values, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotIn(List<String> values) {
            addCriterion("deptName not in", values, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameBetween(String value1, String value2) {
            addCriterion("deptName between", value1, value2, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotBetween(String value1, String value2) {
            addCriterion("deptName not between", value1, value2, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptTypeIDIsNull() {
            addCriterion("deptTypeID is null");
            return (Criteria) this;
        }

        public Criteria andDeptTypeIDIsNotNull() {
            addCriterion("deptTypeID is not null");
            return (Criteria) this;
        }

        public Criteria andDeptTypeIDEqualTo(Integer value) {
            addCriterion("deptTypeID =", value, "deptTypeID");
            return (Criteria) this;
        }

        public Criteria andDeptTypeIDNotEqualTo(Integer value) {
            addCriterion("deptTypeID <>", value, "deptTypeID");
            return (Criteria) this;
        }

        public Criteria andDeptTypeIDGreaterThan(Integer value) {
            addCriterion("deptTypeID >", value, "deptTypeID");
            return (Criteria) this;
        }

        public Criteria andDeptTypeIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("deptTypeID >=", value, "deptTypeID");
            return (Criteria) this;
        }

        public Criteria andDeptTypeIDLessThan(Integer value) {
            addCriterion("deptTypeID <", value, "deptTypeID");
            return (Criteria) this;
        }

        public Criteria andDeptTypeIDLessThanOrEqualTo(Integer value) {
            addCriterion("deptTypeID <=", value, "deptTypeID");
            return (Criteria) this;
        }

        public Criteria andDeptTypeIDIn(List<Integer> values) {
            addCriterion("deptTypeID in", values, "deptTypeID");
            return (Criteria) this;
        }

        public Criteria andDeptTypeIDNotIn(List<Integer> values) {
            addCriterion("deptTypeID not in", values, "deptTypeID");
            return (Criteria) this;
        }

        public Criteria andDeptTypeIDBetween(Integer value1, Integer value2) {
            addCriterion("deptTypeID between", value1, value2, "deptTypeID");
            return (Criteria) this;
        }

        public Criteria andDeptTypeIDNotBetween(Integer value1, Integer value2) {
            addCriterion("deptTypeID not between", value1, value2, "deptTypeID");
            return (Criteria) this;
        }

        public Criteria andDeptTypeCodeIsNull() {
            addCriterion("deptTypeCode is null");
            return (Criteria) this;
        }

        public Criteria andDeptTypeCodeIsNotNull() {
            addCriterion("deptTypeCode is not null");
            return (Criteria) this;
        }

        public Criteria andDeptTypeCodeEqualTo(String value) {
            addCriterion("deptTypeCode =", value, "deptTypeCode");
            return (Criteria) this;
        }

        public Criteria andDeptTypeCodeNotEqualTo(String value) {
            addCriterion("deptTypeCode <>", value, "deptTypeCode");
            return (Criteria) this;
        }

        public Criteria andDeptTypeCodeGreaterThan(String value) {
            addCriterion("deptTypeCode >", value, "deptTypeCode");
            return (Criteria) this;
        }

        public Criteria andDeptTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("deptTypeCode >=", value, "deptTypeCode");
            return (Criteria) this;
        }

        public Criteria andDeptTypeCodeLessThan(String value) {
            addCriterion("deptTypeCode <", value, "deptTypeCode");
            return (Criteria) this;
        }

        public Criteria andDeptTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("deptTypeCode <=", value, "deptTypeCode");
            return (Criteria) this;
        }

        public Criteria andDeptTypeCodeLike(String value) {
            addCriterion("deptTypeCode like", value, "deptTypeCode");
            return (Criteria) this;
        }

        public Criteria andDeptTypeCodeNotLike(String value) {
            addCriterion("deptTypeCode not like", value, "deptTypeCode");
            return (Criteria) this;
        }

        public Criteria andDeptTypeCodeIn(List<String> values) {
            addCriterion("deptTypeCode in", values, "deptTypeCode");
            return (Criteria) this;
        }

        public Criteria andDeptTypeCodeNotIn(List<String> values) {
            addCriterion("deptTypeCode not in", values, "deptTypeCode");
            return (Criteria) this;
        }

        public Criteria andDeptTypeCodeBetween(String value1, String value2) {
            addCriterion("deptTypeCode between", value1, value2, "deptTypeCode");
            return (Criteria) this;
        }

        public Criteria andDeptTypeCodeNotBetween(String value1, String value2) {
            addCriterion("deptTypeCode not between", value1, value2, "deptTypeCode");
            return (Criteria) this;
        }

        public Criteria andDeptTypeIsNull() {
            addCriterion("deptType is null");
            return (Criteria) this;
        }

        public Criteria andDeptTypeIsNotNull() {
            addCriterion("deptType is not null");
            return (Criteria) this;
        }

        public Criteria andDeptTypeEqualTo(String value) {
            addCriterion("deptType =", value, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeNotEqualTo(String value) {
            addCriterion("deptType <>", value, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeGreaterThan(String value) {
            addCriterion("deptType >", value, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeGreaterThanOrEqualTo(String value) {
            addCriterion("deptType >=", value, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeLessThan(String value) {
            addCriterion("deptType <", value, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeLessThanOrEqualTo(String value) {
            addCriterion("deptType <=", value, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeLike(String value) {
            addCriterion("deptType like", value, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeNotLike(String value) {
            addCriterion("deptType not like", value, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeIn(List<String> values) {
            addCriterion("deptType in", values, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeNotIn(List<String> values) {
            addCriterion("deptType not in", values, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeBetween(String value1, String value2) {
            addCriterion("deptType between", value1, value2, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptTypeNotBetween(String value1, String value2) {
            addCriterion("deptType not between", value1, value2, "deptType");
            return (Criteria) this;
        }

        public Criteria andDeptCategoryIDIsNull() {
            addCriterion("deptCategoryID is null");
            return (Criteria) this;
        }

        public Criteria andDeptCategoryIDIsNotNull() {
            addCriterion("deptCategoryID is not null");
            return (Criteria) this;
        }

        public Criteria andDeptCategoryIDEqualTo(Integer value) {
            addCriterion("deptCategoryID =", value, "deptCategoryID");
            return (Criteria) this;
        }

        public Criteria andDeptCategoryIDNotEqualTo(Integer value) {
            addCriterion("deptCategoryID <>", value, "deptCategoryID");
            return (Criteria) this;
        }

        public Criteria andDeptCategoryIDGreaterThan(Integer value) {
            addCriterion("deptCategoryID >", value, "deptCategoryID");
            return (Criteria) this;
        }

        public Criteria andDeptCategoryIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("deptCategoryID >=", value, "deptCategoryID");
            return (Criteria) this;
        }

        public Criteria andDeptCategoryIDLessThan(Integer value) {
            addCriterion("deptCategoryID <", value, "deptCategoryID");
            return (Criteria) this;
        }

        public Criteria andDeptCategoryIDLessThanOrEqualTo(Integer value) {
            addCriterion("deptCategoryID <=", value, "deptCategoryID");
            return (Criteria) this;
        }

        public Criteria andDeptCategoryIDIn(List<Integer> values) {
            addCriterion("deptCategoryID in", values, "deptCategoryID");
            return (Criteria) this;
        }

        public Criteria andDeptCategoryIDNotIn(List<Integer> values) {
            addCriterion("deptCategoryID not in", values, "deptCategoryID");
            return (Criteria) this;
        }

        public Criteria andDeptCategoryIDBetween(Integer value1, Integer value2) {
            addCriterion("deptCategoryID between", value1, value2, "deptCategoryID");
            return (Criteria) this;
        }

        public Criteria andDeptCategoryIDNotBetween(Integer value1, Integer value2) {
            addCriterion("deptCategoryID not between", value1, value2, "deptCategoryID");
            return (Criteria) this;
        }

        public Criteria andDeptCategoryCodeIsNull() {
            addCriterion("deptCategoryCode is null");
            return (Criteria) this;
        }

        public Criteria andDeptCategoryCodeIsNotNull() {
            addCriterion("deptCategoryCode is not null");
            return (Criteria) this;
        }

        public Criteria andDeptCategoryCodeEqualTo(String value) {
            addCriterion("deptCategoryCode =", value, "deptCategoryCode");
            return (Criteria) this;
        }

        public Criteria andDeptCategoryCodeNotEqualTo(String value) {
            addCriterion("deptCategoryCode <>", value, "deptCategoryCode");
            return (Criteria) this;
        }

        public Criteria andDeptCategoryCodeGreaterThan(String value) {
            addCriterion("deptCategoryCode >", value, "deptCategoryCode");
            return (Criteria) this;
        }

        public Criteria andDeptCategoryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("deptCategoryCode >=", value, "deptCategoryCode");
            return (Criteria) this;
        }

        public Criteria andDeptCategoryCodeLessThan(String value) {
            addCriterion("deptCategoryCode <", value, "deptCategoryCode");
            return (Criteria) this;
        }

        public Criteria andDeptCategoryCodeLessThanOrEqualTo(String value) {
            addCriterion("deptCategoryCode <=", value, "deptCategoryCode");
            return (Criteria) this;
        }

        public Criteria andDeptCategoryCodeLike(String value) {
            addCriterion("deptCategoryCode like", value, "deptCategoryCode");
            return (Criteria) this;
        }

        public Criteria andDeptCategoryCodeNotLike(String value) {
            addCriterion("deptCategoryCode not like", value, "deptCategoryCode");
            return (Criteria) this;
        }

        public Criteria andDeptCategoryCodeIn(List<String> values) {
            addCriterion("deptCategoryCode in", values, "deptCategoryCode");
            return (Criteria) this;
        }

        public Criteria andDeptCategoryCodeNotIn(List<String> values) {
            addCriterion("deptCategoryCode not in", values, "deptCategoryCode");
            return (Criteria) this;
        }

        public Criteria andDeptCategoryCodeBetween(String value1, String value2) {
            addCriterion("deptCategoryCode between", value1, value2, "deptCategoryCode");
            return (Criteria) this;
        }

        public Criteria andDeptCategoryCodeNotBetween(String value1, String value2) {
            addCriterion("deptCategoryCode not between", value1, value2, "deptCategoryCode");
            return (Criteria) this;
        }

        public Criteria andDeptCategoryIsNull() {
            addCriterion("deptCategory is null");
            return (Criteria) this;
        }

        public Criteria andDeptCategoryIsNotNull() {
            addCriterion("deptCategory is not null");
            return (Criteria) this;
        }

        public Criteria andDeptCategoryEqualTo(String value) {
            addCriterion("deptCategory =", value, "deptCategory");
            return (Criteria) this;
        }

        public Criteria andDeptCategoryNotEqualTo(String value) {
            addCriterion("deptCategory <>", value, "deptCategory");
            return (Criteria) this;
        }

        public Criteria andDeptCategoryGreaterThan(String value) {
            addCriterion("deptCategory >", value, "deptCategory");
            return (Criteria) this;
        }

        public Criteria andDeptCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("deptCategory >=", value, "deptCategory");
            return (Criteria) this;
        }

        public Criteria andDeptCategoryLessThan(String value) {
            addCriterion("deptCategory <", value, "deptCategory");
            return (Criteria) this;
        }

        public Criteria andDeptCategoryLessThanOrEqualTo(String value) {
            addCriterion("deptCategory <=", value, "deptCategory");
            return (Criteria) this;
        }

        public Criteria andDeptCategoryLike(String value) {
            addCriterion("deptCategory like", value, "deptCategory");
            return (Criteria) this;
        }

        public Criteria andDeptCategoryNotLike(String value) {
            addCriterion("deptCategory not like", value, "deptCategory");
            return (Criteria) this;
        }

        public Criteria andDeptCategoryIn(List<String> values) {
            addCriterion("deptCategory in", values, "deptCategory");
            return (Criteria) this;
        }

        public Criteria andDeptCategoryNotIn(List<String> values) {
            addCriterion("deptCategory not in", values, "deptCategory");
            return (Criteria) this;
        }

        public Criteria andDeptCategoryBetween(String value1, String value2) {
            addCriterion("deptCategory between", value1, value2, "deptCategory");
            return (Criteria) this;
        }

        public Criteria andDeptCategoryNotBetween(String value1, String value2) {
            addCriterion("deptCategory not between", value1, value2, "deptCategory");
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