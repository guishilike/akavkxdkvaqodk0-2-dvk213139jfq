package edu.neu.hospital.example.baseExample;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RegistrationLevelViewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public RegistrationLevelViewExample() {
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

        public Criteria andRegisteredCodeIsNull() {
            addCriterion("registeredCode is null");
            return (Criteria) this;
        }

        public Criteria andRegisteredCodeIsNotNull() {
            addCriterion("registeredCode is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteredCodeEqualTo(String value) {
            addCriterion("registeredCode =", value, "registeredCode");
            return (Criteria) this;
        }

        public Criteria andRegisteredCodeNotEqualTo(String value) {
            addCriterion("registeredCode <>", value, "registeredCode");
            return (Criteria) this;
        }

        public Criteria andRegisteredCodeGreaterThan(String value) {
            addCriterion("registeredCode >", value, "registeredCode");
            return (Criteria) this;
        }

        public Criteria andRegisteredCodeGreaterThanOrEqualTo(String value) {
            addCriterion("registeredCode >=", value, "registeredCode");
            return (Criteria) this;
        }

        public Criteria andRegisteredCodeLessThan(String value) {
            addCriterion("registeredCode <", value, "registeredCode");
            return (Criteria) this;
        }

        public Criteria andRegisteredCodeLessThanOrEqualTo(String value) {
            addCriterion("registeredCode <=", value, "registeredCode");
            return (Criteria) this;
        }

        public Criteria andRegisteredCodeLike(String value) {
            addCriterion("registeredCode like", value, "registeredCode");
            return (Criteria) this;
        }

        public Criteria andRegisteredCodeNotLike(String value) {
            addCriterion("registeredCode not like", value, "registeredCode");
            return (Criteria) this;
        }

        public Criteria andRegisteredCodeIn(List<String> values) {
            addCriterion("registeredCode in", values, "registeredCode");
            return (Criteria) this;
        }

        public Criteria andRegisteredCodeNotIn(List<String> values) {
            addCriterion("registeredCode not in", values, "registeredCode");
            return (Criteria) this;
        }

        public Criteria andRegisteredCodeBetween(String value1, String value2) {
            addCriterion("registeredCode between", value1, value2, "registeredCode");
            return (Criteria) this;
        }

        public Criteria andRegisteredCodeNotBetween(String value1, String value2) {
            addCriterion("registeredCode not between", value1, value2, "registeredCode");
            return (Criteria) this;
        }

        public Criteria andRegisteredNameIsNull() {
            addCriterion("registeredName is null");
            return (Criteria) this;
        }

        public Criteria andRegisteredNameIsNotNull() {
            addCriterion("registeredName is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteredNameEqualTo(String value) {
            addCriterion("registeredName =", value, "registeredName");
            return (Criteria) this;
        }

        public Criteria andRegisteredNameNotEqualTo(String value) {
            addCriterion("registeredName <>", value, "registeredName");
            return (Criteria) this;
        }

        public Criteria andRegisteredNameGreaterThan(String value) {
            addCriterion("registeredName >", value, "registeredName");
            return (Criteria) this;
        }

        public Criteria andRegisteredNameGreaterThanOrEqualTo(String value) {
            addCriterion("registeredName >=", value, "registeredName");
            return (Criteria) this;
        }

        public Criteria andRegisteredNameLessThan(String value) {
            addCriterion("registeredName <", value, "registeredName");
            return (Criteria) this;
        }

        public Criteria andRegisteredNameLessThanOrEqualTo(String value) {
            addCriterion("registeredName <=", value, "registeredName");
            return (Criteria) this;
        }

        public Criteria andRegisteredNameLike(String value) {
            addCriterion("registeredName like", value, "registeredName");
            return (Criteria) this;
        }

        public Criteria andRegisteredNameNotLike(String value) {
            addCriterion("registeredName not like", value, "registeredName");
            return (Criteria) this;
        }

        public Criteria andRegisteredNameIn(List<String> values) {
            addCriterion("registeredName in", values, "registeredName");
            return (Criteria) this;
        }

        public Criteria andRegisteredNameNotIn(List<String> values) {
            addCriterion("registeredName not in", values, "registeredName");
            return (Criteria) this;
        }

        public Criteria andRegisteredNameBetween(String value1, String value2) {
            addCriterion("registeredName between", value1, value2, "registeredName");
            return (Criteria) this;
        }

        public Criteria andRegisteredNameNotBetween(String value1, String value2) {
            addCriterion("registeredName not between", value1, value2, "registeredName");
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

        public Criteria andIsDefaultIsNull() {
            addCriterion("isDefault is null");
            return (Criteria) this;
        }

        public Criteria andIsDefaultIsNotNull() {
            addCriterion("isDefault is not null");
            return (Criteria) this;
        }

        public Criteria andIsDefaultEqualTo(String value) {
            addCriterion("isDefault =", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotEqualTo(String value) {
            addCriterion("isDefault <>", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultGreaterThan(String value) {
            addCriterion("isDefault >", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultGreaterThanOrEqualTo(String value) {
            addCriterion("isDefault >=", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultLessThan(String value) {
            addCriterion("isDefault <", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultLessThanOrEqualTo(String value) {
            addCriterion("isDefault <=", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultLike(String value) {
            addCriterion("isDefault like", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotLike(String value) {
            addCriterion("isDefault not like", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultIn(List<String> values) {
            addCriterion("isDefault in", values, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotIn(List<String> values) {
            addCriterion("isDefault not in", values, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultBetween(String value1, String value2) {
            addCriterion("isDefault between", value1, value2, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotBetween(String value1, String value2) {
            addCriterion("isDefault not between", value1, value2, "isDefault");
            return (Criteria) this;
        }

        public Criteria andRegistrationFeeIsNull() {
            addCriterion("registrationFee is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationFeeIsNotNull() {
            addCriterion("registrationFee is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationFeeEqualTo(BigDecimal value) {
            addCriterion("registrationFee =", value, "registrationFee");
            return (Criteria) this;
        }

        public Criteria andRegistrationFeeNotEqualTo(BigDecimal value) {
            addCriterion("registrationFee <>", value, "registrationFee");
            return (Criteria) this;
        }

        public Criteria andRegistrationFeeGreaterThan(BigDecimal value) {
            addCriterion("registrationFee >", value, "registrationFee");
            return (Criteria) this;
        }

        public Criteria andRegistrationFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("registrationFee >=", value, "registrationFee");
            return (Criteria) this;
        }

        public Criteria andRegistrationFeeLessThan(BigDecimal value) {
            addCriterion("registrationFee <", value, "registrationFee");
            return (Criteria) this;
        }

        public Criteria andRegistrationFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("registrationFee <=", value, "registrationFee");
            return (Criteria) this;
        }

        public Criteria andRegistrationFeeIn(List<BigDecimal> values) {
            addCriterion("registrationFee in", values, "registrationFee");
            return (Criteria) this;
        }

        public Criteria andRegistrationFeeNotIn(List<BigDecimal> values) {
            addCriterion("registrationFee not in", values, "registrationFee");
            return (Criteria) this;
        }

        public Criteria andRegistrationFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("registrationFee between", value1, value2, "registrationFee");
            return (Criteria) this;
        }

        public Criteria andRegistrationFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("registrationFee not between", value1, value2, "registrationFee");
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