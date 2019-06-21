package edu.neu.hospital.example.baseExample;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SettleCategoryViewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public SettleCategoryViewExample() {
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

        public Criteria andSettleCategoryCodeIsNull() {
            addCriterion("settleCategoryCode is null");
            return (Criteria) this;
        }

        public Criteria andSettleCategoryCodeIsNotNull() {
            addCriterion("settleCategoryCode is not null");
            return (Criteria) this;
        }

        public Criteria andSettleCategoryCodeEqualTo(String value) {
            addCriterion("settleCategoryCode =", value, "settleCategoryCode");
            return (Criteria) this;
        }

        public Criteria andSettleCategoryCodeNotEqualTo(String value) {
            addCriterion("settleCategoryCode <>", value, "settleCategoryCode");
            return (Criteria) this;
        }

        public Criteria andSettleCategoryCodeGreaterThan(String value) {
            addCriterion("settleCategoryCode >", value, "settleCategoryCode");
            return (Criteria) this;
        }

        public Criteria andSettleCategoryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("settleCategoryCode >=", value, "settleCategoryCode");
            return (Criteria) this;
        }

        public Criteria andSettleCategoryCodeLessThan(String value) {
            addCriterion("settleCategoryCode <", value, "settleCategoryCode");
            return (Criteria) this;
        }

        public Criteria andSettleCategoryCodeLessThanOrEqualTo(String value) {
            addCriterion("settleCategoryCode <=", value, "settleCategoryCode");
            return (Criteria) this;
        }

        public Criteria andSettleCategoryCodeLike(String value) {
            addCriterion("settleCategoryCode like", value, "settleCategoryCode");
            return (Criteria) this;
        }

        public Criteria andSettleCategoryCodeNotLike(String value) {
            addCriterion("settleCategoryCode not like", value, "settleCategoryCode");
            return (Criteria) this;
        }

        public Criteria andSettleCategoryCodeIn(List<String> values) {
            addCriterion("settleCategoryCode in", values, "settleCategoryCode");
            return (Criteria) this;
        }

        public Criteria andSettleCategoryCodeNotIn(List<String> values) {
            addCriterion("settleCategoryCode not in", values, "settleCategoryCode");
            return (Criteria) this;
        }

        public Criteria andSettleCategoryCodeBetween(String value1, String value2) {
            addCriterion("settleCategoryCode between", value1, value2, "settleCategoryCode");
            return (Criteria) this;
        }

        public Criteria andSettleCategoryCodeNotBetween(String value1, String value2) {
            addCriterion("settleCategoryCode not between", value1, value2, "settleCategoryCode");
            return (Criteria) this;
        }

        public Criteria andSettleCategoryNameIsNull() {
            addCriterion("settleCategoryName is null");
            return (Criteria) this;
        }

        public Criteria andSettleCategoryNameIsNotNull() {
            addCriterion("settleCategoryName is not null");
            return (Criteria) this;
        }

        public Criteria andSettleCategoryNameEqualTo(String value) {
            addCriterion("settleCategoryName =", value, "settleCategoryName");
            return (Criteria) this;
        }

        public Criteria andSettleCategoryNameNotEqualTo(String value) {
            addCriterion("settleCategoryName <>", value, "settleCategoryName");
            return (Criteria) this;
        }

        public Criteria andSettleCategoryNameGreaterThan(String value) {
            addCriterion("settleCategoryName >", value, "settleCategoryName");
            return (Criteria) this;
        }

        public Criteria andSettleCategoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("settleCategoryName >=", value, "settleCategoryName");
            return (Criteria) this;
        }

        public Criteria andSettleCategoryNameLessThan(String value) {
            addCriterion("settleCategoryName <", value, "settleCategoryName");
            return (Criteria) this;
        }

        public Criteria andSettleCategoryNameLessThanOrEqualTo(String value) {
            addCriterion("settleCategoryName <=", value, "settleCategoryName");
            return (Criteria) this;
        }

        public Criteria andSettleCategoryNameLike(String value) {
            addCriterion("settleCategoryName like", value, "settleCategoryName");
            return (Criteria) this;
        }

        public Criteria andSettleCategoryNameNotLike(String value) {
            addCriterion("settleCategoryName not like", value, "settleCategoryName");
            return (Criteria) this;
        }

        public Criteria andSettleCategoryNameIn(List<String> values) {
            addCriterion("settleCategoryName in", values, "settleCategoryName");
            return (Criteria) this;
        }

        public Criteria andSettleCategoryNameNotIn(List<String> values) {
            addCriterion("settleCategoryName not in", values, "settleCategoryName");
            return (Criteria) this;
        }

        public Criteria andSettleCategoryNameBetween(String value1, String value2) {
            addCriterion("settleCategoryName between", value1, value2, "settleCategoryName");
            return (Criteria) this;
        }

        public Criteria andSettleCategoryNameNotBetween(String value1, String value2) {
            addCriterion("settleCategoryName not between", value1, value2, "settleCategoryName");
            return (Criteria) this;
        }

        public Criteria andSequenceIDIsNull() {
            addCriterion("sequenceID is null");
            return (Criteria) this;
        }

        public Criteria andSequenceIDIsNotNull() {
            addCriterion("sequenceID is not null");
            return (Criteria) this;
        }

        public Criteria andSequenceIDEqualTo(Integer value) {
            addCriterion("sequenceID =", value, "sequenceID");
            return (Criteria) this;
        }

        public Criteria andSequenceIDNotEqualTo(Integer value) {
            addCriterion("sequenceID <>", value, "sequenceID");
            return (Criteria) this;
        }

        public Criteria andSequenceIDGreaterThan(Integer value) {
            addCriterion("sequenceID >", value, "sequenceID");
            return (Criteria) this;
        }

        public Criteria andSequenceIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("sequenceID >=", value, "sequenceID");
            return (Criteria) this;
        }

        public Criteria andSequenceIDLessThan(Integer value) {
            addCriterion("sequenceID <", value, "sequenceID");
            return (Criteria) this;
        }

        public Criteria andSequenceIDLessThanOrEqualTo(Integer value) {
            addCriterion("sequenceID <=", value, "sequenceID");
            return (Criteria) this;
        }

        public Criteria andSequenceIDIn(List<Integer> values) {
            addCriterion("sequenceID in", values, "sequenceID");
            return (Criteria) this;
        }

        public Criteria andSequenceIDNotIn(List<Integer> values) {
            addCriterion("sequenceID not in", values, "sequenceID");
            return (Criteria) this;
        }

        public Criteria andSequenceIDBetween(Integer value1, Integer value2) {
            addCriterion("sequenceID between", value1, value2, "sequenceID");
            return (Criteria) this;
        }

        public Criteria andSequenceIDNotBetween(Integer value1, Integer value2) {
            addCriterion("sequenceID not between", value1, value2, "sequenceID");
            return (Criteria) this;
        }

        public Criteria andThresnold1IsNull() {
            addCriterion("thresnold1 is null");
            return (Criteria) this;
        }

        public Criteria andThresnold1IsNotNull() {
            addCriterion("thresnold1 is not null");
            return (Criteria) this;
        }

        public Criteria andThresnold1EqualTo(BigDecimal value) {
            addCriterion("thresnold1 =", value, "thresnold1");
            return (Criteria) this;
        }

        public Criteria andThresnold1NotEqualTo(BigDecimal value) {
            addCriterion("thresnold1 <>", value, "thresnold1");
            return (Criteria) this;
        }

        public Criteria andThresnold1GreaterThan(BigDecimal value) {
            addCriterion("thresnold1 >", value, "thresnold1");
            return (Criteria) this;
        }

        public Criteria andThresnold1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("thresnold1 >=", value, "thresnold1");
            return (Criteria) this;
        }

        public Criteria andThresnold1LessThan(BigDecimal value) {
            addCriterion("thresnold1 <", value, "thresnold1");
            return (Criteria) this;
        }

        public Criteria andThresnold1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("thresnold1 <=", value, "thresnold1");
            return (Criteria) this;
        }

        public Criteria andThresnold1In(List<BigDecimal> values) {
            addCriterion("thresnold1 in", values, "thresnold1");
            return (Criteria) this;
        }

        public Criteria andThresnold1NotIn(List<BigDecimal> values) {
            addCriterion("thresnold1 not in", values, "thresnold1");
            return (Criteria) this;
        }

        public Criteria andThresnold1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("thresnold1 between", value1, value2, "thresnold1");
            return (Criteria) this;
        }

        public Criteria andThresnold1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("thresnold1 not between", value1, value2, "thresnold1");
            return (Criteria) this;
        }

        public Criteria andThresnold2IsNull() {
            addCriterion("thresnold2 is null");
            return (Criteria) this;
        }

        public Criteria andThresnold2IsNotNull() {
            addCriterion("thresnold2 is not null");
            return (Criteria) this;
        }

        public Criteria andThresnold2EqualTo(BigDecimal value) {
            addCriterion("thresnold2 =", value, "thresnold2");
            return (Criteria) this;
        }

        public Criteria andThresnold2NotEqualTo(BigDecimal value) {
            addCriterion("thresnold2 <>", value, "thresnold2");
            return (Criteria) this;
        }

        public Criteria andThresnold2GreaterThan(BigDecimal value) {
            addCriterion("thresnold2 >", value, "thresnold2");
            return (Criteria) this;
        }

        public Criteria andThresnold2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("thresnold2 >=", value, "thresnold2");
            return (Criteria) this;
        }

        public Criteria andThresnold2LessThan(BigDecimal value) {
            addCriterion("thresnold2 <", value, "thresnold2");
            return (Criteria) this;
        }

        public Criteria andThresnold2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("thresnold2 <=", value, "thresnold2");
            return (Criteria) this;
        }

        public Criteria andThresnold2In(List<BigDecimal> values) {
            addCriterion("thresnold2 in", values, "thresnold2");
            return (Criteria) this;
        }

        public Criteria andThresnold2NotIn(List<BigDecimal> values) {
            addCriterion("thresnold2 not in", values, "thresnold2");
            return (Criteria) this;
        }

        public Criteria andThresnold2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("thresnold2 between", value1, value2, "thresnold2");
            return (Criteria) this;
        }

        public Criteria andThresnold2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("thresnold2 not between", value1, value2, "thresnold2");
            return (Criteria) this;
        }

        public Criteria andThresnold3IsNull() {
            addCriterion("thresnold3 is null");
            return (Criteria) this;
        }

        public Criteria andThresnold3IsNotNull() {
            addCriterion("thresnold3 is not null");
            return (Criteria) this;
        }

        public Criteria andThresnold3EqualTo(BigDecimal value) {
            addCriterion("thresnold3 =", value, "thresnold3");
            return (Criteria) this;
        }

        public Criteria andThresnold3NotEqualTo(BigDecimal value) {
            addCriterion("thresnold3 <>", value, "thresnold3");
            return (Criteria) this;
        }

        public Criteria andThresnold3GreaterThan(BigDecimal value) {
            addCriterion("thresnold3 >", value, "thresnold3");
            return (Criteria) this;
        }

        public Criteria andThresnold3GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("thresnold3 >=", value, "thresnold3");
            return (Criteria) this;
        }

        public Criteria andThresnold3LessThan(BigDecimal value) {
            addCriterion("thresnold3 <", value, "thresnold3");
            return (Criteria) this;
        }

        public Criteria andThresnold3LessThanOrEqualTo(BigDecimal value) {
            addCriterion("thresnold3 <=", value, "thresnold3");
            return (Criteria) this;
        }

        public Criteria andThresnold3In(List<BigDecimal> values) {
            addCriterion("thresnold3 in", values, "thresnold3");
            return (Criteria) this;
        }

        public Criteria andThresnold3NotIn(List<BigDecimal> values) {
            addCriterion("thresnold3 not in", values, "thresnold3");
            return (Criteria) this;
        }

        public Criteria andThresnold3Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("thresnold3 between", value1, value2, "thresnold3");
            return (Criteria) this;
        }

        public Criteria andThresnold3NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("thresnold3 not between", value1, value2, "thresnold3");
            return (Criteria) this;
        }

        public Criteria andProportion1IsNull() {
            addCriterion("proportion1 is null");
            return (Criteria) this;
        }

        public Criteria andProportion1IsNotNull() {
            addCriterion("proportion1 is not null");
            return (Criteria) this;
        }

        public Criteria andProportion1EqualTo(BigDecimal value) {
            addCriterion("proportion1 =", value, "proportion1");
            return (Criteria) this;
        }

        public Criteria andProportion1NotEqualTo(BigDecimal value) {
            addCriterion("proportion1 <>", value, "proportion1");
            return (Criteria) this;
        }

        public Criteria andProportion1GreaterThan(BigDecimal value) {
            addCriterion("proportion1 >", value, "proportion1");
            return (Criteria) this;
        }

        public Criteria andProportion1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("proportion1 >=", value, "proportion1");
            return (Criteria) this;
        }

        public Criteria andProportion1LessThan(BigDecimal value) {
            addCriterion("proportion1 <", value, "proportion1");
            return (Criteria) this;
        }

        public Criteria andProportion1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("proportion1 <=", value, "proportion1");
            return (Criteria) this;
        }

        public Criteria andProportion1In(List<BigDecimal> values) {
            addCriterion("proportion1 in", values, "proportion1");
            return (Criteria) this;
        }

        public Criteria andProportion1NotIn(List<BigDecimal> values) {
            addCriterion("proportion1 not in", values, "proportion1");
            return (Criteria) this;
        }

        public Criteria andProportion1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("proportion1 between", value1, value2, "proportion1");
            return (Criteria) this;
        }

        public Criteria andProportion1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("proportion1 not between", value1, value2, "proportion1");
            return (Criteria) this;
        }

        public Criteria andProportion2IsNull() {
            addCriterion("proportion2 is null");
            return (Criteria) this;
        }

        public Criteria andProportion2IsNotNull() {
            addCriterion("proportion2 is not null");
            return (Criteria) this;
        }

        public Criteria andProportion2EqualTo(BigDecimal value) {
            addCriterion("proportion2 =", value, "proportion2");
            return (Criteria) this;
        }

        public Criteria andProportion2NotEqualTo(BigDecimal value) {
            addCriterion("proportion2 <>", value, "proportion2");
            return (Criteria) this;
        }

        public Criteria andProportion2GreaterThan(BigDecimal value) {
            addCriterion("proportion2 >", value, "proportion2");
            return (Criteria) this;
        }

        public Criteria andProportion2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("proportion2 >=", value, "proportion2");
            return (Criteria) this;
        }

        public Criteria andProportion2LessThan(BigDecimal value) {
            addCriterion("proportion2 <", value, "proportion2");
            return (Criteria) this;
        }

        public Criteria andProportion2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("proportion2 <=", value, "proportion2");
            return (Criteria) this;
        }

        public Criteria andProportion2In(List<BigDecimal> values) {
            addCriterion("proportion2 in", values, "proportion2");
            return (Criteria) this;
        }

        public Criteria andProportion2NotIn(List<BigDecimal> values) {
            addCriterion("proportion2 not in", values, "proportion2");
            return (Criteria) this;
        }

        public Criteria andProportion2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("proportion2 between", value1, value2, "proportion2");
            return (Criteria) this;
        }

        public Criteria andProportion2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("proportion2 not between", value1, value2, "proportion2");
            return (Criteria) this;
        }

        public Criteria andProportion3IsNull() {
            addCriterion("proportion3 is null");
            return (Criteria) this;
        }

        public Criteria andProportion3IsNotNull() {
            addCriterion("proportion3 is not null");
            return (Criteria) this;
        }

        public Criteria andProportion3EqualTo(BigDecimal value) {
            addCriterion("proportion3 =", value, "proportion3");
            return (Criteria) this;
        }

        public Criteria andProportion3NotEqualTo(BigDecimal value) {
            addCriterion("proportion3 <>", value, "proportion3");
            return (Criteria) this;
        }

        public Criteria andProportion3GreaterThan(BigDecimal value) {
            addCriterion("proportion3 >", value, "proportion3");
            return (Criteria) this;
        }

        public Criteria andProportion3GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("proportion3 >=", value, "proportion3");
            return (Criteria) this;
        }

        public Criteria andProportion3LessThan(BigDecimal value) {
            addCriterion("proportion3 <", value, "proportion3");
            return (Criteria) this;
        }

        public Criteria andProportion3LessThanOrEqualTo(BigDecimal value) {
            addCriterion("proportion3 <=", value, "proportion3");
            return (Criteria) this;
        }

        public Criteria andProportion3In(List<BigDecimal> values) {
            addCriterion("proportion3 in", values, "proportion3");
            return (Criteria) this;
        }

        public Criteria andProportion3NotIn(List<BigDecimal> values) {
            addCriterion("proportion3 not in", values, "proportion3");
            return (Criteria) this;
        }

        public Criteria andProportion3Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("proportion3 between", value1, value2, "proportion3");
            return (Criteria) this;
        }

        public Criteria andProportion3NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("proportion3 not between", value1, value2, "proportion3");
            return (Criteria) this;
        }

        public Criteria andProportion4IsNull() {
            addCriterion("proportion4 is null");
            return (Criteria) this;
        }

        public Criteria andProportion4IsNotNull() {
            addCriterion("proportion4 is not null");
            return (Criteria) this;
        }

        public Criteria andProportion4EqualTo(BigDecimal value) {
            addCriterion("proportion4 =", value, "proportion4");
            return (Criteria) this;
        }

        public Criteria andProportion4NotEqualTo(BigDecimal value) {
            addCriterion("proportion4 <>", value, "proportion4");
            return (Criteria) this;
        }

        public Criteria andProportion4GreaterThan(BigDecimal value) {
            addCriterion("proportion4 >", value, "proportion4");
            return (Criteria) this;
        }

        public Criteria andProportion4GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("proportion4 >=", value, "proportion4");
            return (Criteria) this;
        }

        public Criteria andProportion4LessThan(BigDecimal value) {
            addCriterion("proportion4 <", value, "proportion4");
            return (Criteria) this;
        }

        public Criteria andProportion4LessThanOrEqualTo(BigDecimal value) {
            addCriterion("proportion4 <=", value, "proportion4");
            return (Criteria) this;
        }

        public Criteria andProportion4In(List<BigDecimal> values) {
            addCriterion("proportion4 in", values, "proportion4");
            return (Criteria) this;
        }

        public Criteria andProportion4NotIn(List<BigDecimal> values) {
            addCriterion("proportion4 not in", values, "proportion4");
            return (Criteria) this;
        }

        public Criteria andProportion4Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("proportion4 between", value1, value2, "proportion4");
            return (Criteria) this;
        }

        public Criteria andProportion4NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("proportion4 not between", value1, value2, "proportion4");
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

        public Criteria andApearUserIDIsNull() {
            addCriterion("apearUserID is null");
            return (Criteria) this;
        }

        public Criteria andApearUserIDIsNotNull() {
            addCriterion("apearUserID is not null");
            return (Criteria) this;
        }

        public Criteria andApearUserIDEqualTo(Integer value) {
            addCriterion("apearUserID =", value, "apearUserID");
            return (Criteria) this;
        }

        public Criteria andApearUserIDNotEqualTo(Integer value) {
            addCriterion("apearUserID <>", value, "apearUserID");
            return (Criteria) this;
        }

        public Criteria andApearUserIDGreaterThan(Integer value) {
            addCriterion("apearUserID >", value, "apearUserID");
            return (Criteria) this;
        }

        public Criteria andApearUserIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("apearUserID >=", value, "apearUserID");
            return (Criteria) this;
        }

        public Criteria andApearUserIDLessThan(Integer value) {
            addCriterion("apearUserID <", value, "apearUserID");
            return (Criteria) this;
        }

        public Criteria andApearUserIDLessThanOrEqualTo(Integer value) {
            addCriterion("apearUserID <=", value, "apearUserID");
            return (Criteria) this;
        }

        public Criteria andApearUserIDIn(List<Integer> values) {
            addCriterion("apearUserID in", values, "apearUserID");
            return (Criteria) this;
        }

        public Criteria andApearUserIDNotIn(List<Integer> values) {
            addCriterion("apearUserID not in", values, "apearUserID");
            return (Criteria) this;
        }

        public Criteria andApearUserIDBetween(Integer value1, Integer value2) {
            addCriterion("apearUserID between", value1, value2, "apearUserID");
            return (Criteria) this;
        }

        public Criteria andApearUserIDNotBetween(Integer value1, Integer value2) {
            addCriterion("apearUserID not between", value1, value2, "apearUserID");
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