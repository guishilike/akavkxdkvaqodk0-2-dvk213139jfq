package edu.neu.hospital.example.baseExample;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserViewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public UserViewExample() {
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

        public Criteria andUserNameIsNull() {
            addCriterion("userName is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("userName is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("userName =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("userName <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("userName >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("userName >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("userName <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("userName <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("userName like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("userName not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("userName in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("userName not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("userName between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("userName not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNull() {
            addCriterion("realName is null");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNotNull() {
            addCriterion("realName is not null");
            return (Criteria) this;
        }

        public Criteria andRealNameEqualTo(String value) {
            addCriterion("realName =", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotEqualTo(String value) {
            addCriterion("realName <>", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThan(String value) {
            addCriterion("realName >", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("realName >=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThan(String value) {
            addCriterion("realName <", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThanOrEqualTo(String value) {
            addCriterion("realName <=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLike(String value) {
            addCriterion("realName like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotLike(String value) {
            addCriterion("realName not like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameIn(List<String> values) {
            addCriterion("realName in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotIn(List<String> values) {
            addCriterion("realName not in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameBetween(String value1, String value2) {
            addCriterion("realName between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotBetween(String value1, String value2) {
            addCriterion("realName not between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andPasswdIsNull() {
            addCriterion("passwd is null");
            return (Criteria) this;
        }

        public Criteria andPasswdIsNotNull() {
            addCriterion("passwd is not null");
            return (Criteria) this;
        }

        public Criteria andPasswdEqualTo(String value) {
            addCriterion("passwd =", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdNotEqualTo(String value) {
            addCriterion("passwd <>", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdGreaterThan(String value) {
            addCriterion("passwd >", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdGreaterThanOrEqualTo(String value) {
            addCriterion("passwd >=", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdLessThan(String value) {
            addCriterion("passwd <", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdLessThanOrEqualTo(String value) {
            addCriterion("passwd <=", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdLike(String value) {
            addCriterion("passwd like", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdNotLike(String value) {
            addCriterion("passwd not like", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdIn(List<String> values) {
            addCriterion("passwd in", values, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdNotIn(List<String> values) {
            addCriterion("passwd not in", values, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdBetween(String value1, String value2) {
            addCriterion("passwd between", value1, value2, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdNotBetween(String value1, String value2) {
            addCriterion("passwd not between", value1, value2, "passwd");
            return (Criteria) this;
        }

        public Criteria andDepartmentIDIsNull() {
            addCriterion("departmentID is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIDIsNotNull() {
            addCriterion("departmentID is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIDEqualTo(Integer value) {
            addCriterion("departmentID =", value, "departmentID");
            return (Criteria) this;
        }

        public Criteria andDepartmentIDNotEqualTo(Integer value) {
            addCriterion("departmentID <>", value, "departmentID");
            return (Criteria) this;
        }

        public Criteria andDepartmentIDGreaterThan(Integer value) {
            addCriterion("departmentID >", value, "departmentID");
            return (Criteria) this;
        }

        public Criteria andDepartmentIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("departmentID >=", value, "departmentID");
            return (Criteria) this;
        }

        public Criteria andDepartmentIDLessThan(Integer value) {
            addCriterion("departmentID <", value, "departmentID");
            return (Criteria) this;
        }

        public Criteria andDepartmentIDLessThanOrEqualTo(Integer value) {
            addCriterion("departmentID <=", value, "departmentID");
            return (Criteria) this;
        }

        public Criteria andDepartmentIDIn(List<Integer> values) {
            addCriterion("departmentID in", values, "departmentID");
            return (Criteria) this;
        }

        public Criteria andDepartmentIDNotIn(List<Integer> values) {
            addCriterion("departmentID not in", values, "departmentID");
            return (Criteria) this;
        }

        public Criteria andDepartmentIDBetween(Integer value1, Integer value2) {
            addCriterion("departmentID between", value1, value2, "departmentID");
            return (Criteria) this;
        }

        public Criteria andDepartmentIDNotBetween(Integer value1, Integer value2) {
            addCriterion("departmentID not between", value1, value2, "departmentID");
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

        public Criteria andTypeIDIsNull() {
            addCriterion("typeID is null");
            return (Criteria) this;
        }

        public Criteria andTypeIDIsNotNull() {
            addCriterion("typeID is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIDEqualTo(Integer value) {
            addCriterion("typeID =", value, "typeID");
            return (Criteria) this;
        }

        public Criteria andTypeIDNotEqualTo(Integer value) {
            addCriterion("typeID <>", value, "typeID");
            return (Criteria) this;
        }

        public Criteria andTypeIDGreaterThan(Integer value) {
            addCriterion("typeID >", value, "typeID");
            return (Criteria) this;
        }

        public Criteria andTypeIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("typeID >=", value, "typeID");
            return (Criteria) this;
        }

        public Criteria andTypeIDLessThan(Integer value) {
            addCriterion("typeID <", value, "typeID");
            return (Criteria) this;
        }

        public Criteria andTypeIDLessThanOrEqualTo(Integer value) {
            addCriterion("typeID <=", value, "typeID");
            return (Criteria) this;
        }

        public Criteria andTypeIDIn(List<Integer> values) {
            addCriterion("typeID in", values, "typeID");
            return (Criteria) this;
        }

        public Criteria andTypeIDNotIn(List<Integer> values) {
            addCriterion("typeID not in", values, "typeID");
            return (Criteria) this;
        }

        public Criteria andTypeIDBetween(Integer value1, Integer value2) {
            addCriterion("typeID between", value1, value2, "typeID");
            return (Criteria) this;
        }

        public Criteria andTypeIDNotBetween(Integer value1, Integer value2) {
            addCriterion("typeID not between", value1, value2, "typeID");
            return (Criteria) this;
        }

        public Criteria andTypeCodeIsNull() {
            addCriterion("typeCode is null");
            return (Criteria) this;
        }

        public Criteria andTypeCodeIsNotNull() {
            addCriterion("typeCode is not null");
            return (Criteria) this;
        }

        public Criteria andTypeCodeEqualTo(String value) {
            addCriterion("typeCode =", value, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeNotEqualTo(String value) {
            addCriterion("typeCode <>", value, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeGreaterThan(String value) {
            addCriterion("typeCode >", value, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("typeCode >=", value, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeLessThan(String value) {
            addCriterion("typeCode <", value, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("typeCode <=", value, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeLike(String value) {
            addCriterion("typeCode like", value, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeNotLike(String value) {
            addCriterion("typeCode not like", value, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeIn(List<String> values) {
            addCriterion("typeCode in", values, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeNotIn(List<String> values) {
            addCriterion("typeCode not in", values, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeBetween(String value1, String value2) {
            addCriterion("typeCode between", value1, value2, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeNotBetween(String value1, String value2) {
            addCriterion("typeCode not between", value1, value2, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("`type` is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("`type` is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("`type` =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("`type` <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("`type` >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("`type` >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("`type` <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("`type` <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("`type` like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("`type` not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("`type` in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("`type` not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("`type` between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("`type` not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andRankIDIsNull() {
            addCriterion("rankID is null");
            return (Criteria) this;
        }

        public Criteria andRankIDIsNotNull() {
            addCriterion("rankID is not null");
            return (Criteria) this;
        }

        public Criteria andRankIDEqualTo(Integer value) {
            addCriterion("rankID =", value, "rankID");
            return (Criteria) this;
        }

        public Criteria andRankIDNotEqualTo(Integer value) {
            addCriterion("rankID <>", value, "rankID");
            return (Criteria) this;
        }

        public Criteria andRankIDGreaterThan(Integer value) {
            addCriterion("rankID >", value, "rankID");
            return (Criteria) this;
        }

        public Criteria andRankIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("rankID >=", value, "rankID");
            return (Criteria) this;
        }

        public Criteria andRankIDLessThan(Integer value) {
            addCriterion("rankID <", value, "rankID");
            return (Criteria) this;
        }

        public Criteria andRankIDLessThanOrEqualTo(Integer value) {
            addCriterion("rankID <=", value, "rankID");
            return (Criteria) this;
        }

        public Criteria andRankIDIn(List<Integer> values) {
            addCriterion("rankID in", values, "rankID");
            return (Criteria) this;
        }

        public Criteria andRankIDNotIn(List<Integer> values) {
            addCriterion("rankID not in", values, "rankID");
            return (Criteria) this;
        }

        public Criteria andRankIDBetween(Integer value1, Integer value2) {
            addCriterion("rankID between", value1, value2, "rankID");
            return (Criteria) this;
        }

        public Criteria andRankIDNotBetween(Integer value1, Integer value2) {
            addCriterion("rankID not between", value1, value2, "rankID");
            return (Criteria) this;
        }

        public Criteria andRankCodeIsNull() {
            addCriterion("rankCode is null");
            return (Criteria) this;
        }

        public Criteria andRankCodeIsNotNull() {
            addCriterion("rankCode is not null");
            return (Criteria) this;
        }

        public Criteria andRankCodeEqualTo(String value) {
            addCriterion("rankCode =", value, "rankCode");
            return (Criteria) this;
        }

        public Criteria andRankCodeNotEqualTo(String value) {
            addCriterion("rankCode <>", value, "rankCode");
            return (Criteria) this;
        }

        public Criteria andRankCodeGreaterThan(String value) {
            addCriterion("rankCode >", value, "rankCode");
            return (Criteria) this;
        }

        public Criteria andRankCodeGreaterThanOrEqualTo(String value) {
            addCriterion("rankCode >=", value, "rankCode");
            return (Criteria) this;
        }

        public Criteria andRankCodeLessThan(String value) {
            addCriterion("rankCode <", value, "rankCode");
            return (Criteria) this;
        }

        public Criteria andRankCodeLessThanOrEqualTo(String value) {
            addCriterion("rankCode <=", value, "rankCode");
            return (Criteria) this;
        }

        public Criteria andRankCodeLike(String value) {
            addCriterion("rankCode like", value, "rankCode");
            return (Criteria) this;
        }

        public Criteria andRankCodeNotLike(String value) {
            addCriterion("rankCode not like", value, "rankCode");
            return (Criteria) this;
        }

        public Criteria andRankCodeIn(List<String> values) {
            addCriterion("rankCode in", values, "rankCode");
            return (Criteria) this;
        }

        public Criteria andRankCodeNotIn(List<String> values) {
            addCriterion("rankCode not in", values, "rankCode");
            return (Criteria) this;
        }

        public Criteria andRankCodeBetween(String value1, String value2) {
            addCriterion("rankCode between", value1, value2, "rankCode");
            return (Criteria) this;
        }

        public Criteria andRankCodeNotBetween(String value1, String value2) {
            addCriterion("rankCode not between", value1, value2, "rankCode");
            return (Criteria) this;
        }

        public Criteria andRankIsNull() {
            addCriterion("`rank` is null");
            return (Criteria) this;
        }

        public Criteria andRankIsNotNull() {
            addCriterion("`rank` is not null");
            return (Criteria) this;
        }

        public Criteria andRankEqualTo(String value) {
            addCriterion("`rank` =", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotEqualTo(String value) {
            addCriterion("`rank` <>", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankGreaterThan(String value) {
            addCriterion("`rank` >", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankGreaterThanOrEqualTo(String value) {
            addCriterion("`rank` >=", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankLessThan(String value) {
            addCriterion("`rank` <", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankLessThanOrEqualTo(String value) {
            addCriterion("`rank` <=", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankLike(String value) {
            addCriterion("`rank` like", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotLike(String value) {
            addCriterion("`rank` not like", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankIn(List<String> values) {
            addCriterion("`rank` in", values, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotIn(List<String> values) {
            addCriterion("`rank` not in", values, "rank");
            return (Criteria) this;
        }

        public Criteria andRankBetween(String value1, String value2) {
            addCriterion("`rank` between", value1, value2, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotBetween(String value1, String value2) {
            addCriterion("`rank` not between", value1, value2, "rank");
            return (Criteria) this;
        }

        public Criteria andIsScheduleIsNull() {
            addCriterion("isSchedule is null");
            return (Criteria) this;
        }

        public Criteria andIsScheduleIsNotNull() {
            addCriterion("isSchedule is not null");
            return (Criteria) this;
        }

        public Criteria andIsScheduleEqualTo(String value) {
            addCriterion("isSchedule =", value, "isSchedule");
            return (Criteria) this;
        }

        public Criteria andIsScheduleNotEqualTo(String value) {
            addCriterion("isSchedule <>", value, "isSchedule");
            return (Criteria) this;
        }

        public Criteria andIsScheduleGreaterThan(String value) {
            addCriterion("isSchedule >", value, "isSchedule");
            return (Criteria) this;
        }

        public Criteria andIsScheduleGreaterThanOrEqualTo(String value) {
            addCriterion("isSchedule >=", value, "isSchedule");
            return (Criteria) this;
        }

        public Criteria andIsScheduleLessThan(String value) {
            addCriterion("isSchedule <", value, "isSchedule");
            return (Criteria) this;
        }

        public Criteria andIsScheduleLessThanOrEqualTo(String value) {
            addCriterion("isSchedule <=", value, "isSchedule");
            return (Criteria) this;
        }

        public Criteria andIsScheduleLike(String value) {
            addCriterion("isSchedule like", value, "isSchedule");
            return (Criteria) this;
        }

        public Criteria andIsScheduleNotLike(String value) {
            addCriterion("isSchedule not like", value, "isSchedule");
            return (Criteria) this;
        }

        public Criteria andIsScheduleIn(List<String> values) {
            addCriterion("isSchedule in", values, "isSchedule");
            return (Criteria) this;
        }

        public Criteria andIsScheduleNotIn(List<String> values) {
            addCriterion("isSchedule not in", values, "isSchedule");
            return (Criteria) this;
        }

        public Criteria andIsScheduleBetween(String value1, String value2) {
            addCriterion("isSchedule between", value1, value2, "isSchedule");
            return (Criteria) this;
        }

        public Criteria andIsScheduleNotBetween(String value1, String value2) {
            addCriterion("isSchedule not between", value1, value2, "isSchedule");
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

        public Criteria andPhotoLocationIsNull() {
            addCriterion("photoLocation is null");
            return (Criteria) this;
        }

        public Criteria andPhotoLocationIsNotNull() {
            addCriterion("photoLocation is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoLocationEqualTo(String value) {
            addCriterion("photoLocation =", value, "photoLocation");
            return (Criteria) this;
        }

        public Criteria andPhotoLocationNotEqualTo(String value) {
            addCriterion("photoLocation <>", value, "photoLocation");
            return (Criteria) this;
        }

        public Criteria andPhotoLocationGreaterThan(String value) {
            addCriterion("photoLocation >", value, "photoLocation");
            return (Criteria) this;
        }

        public Criteria andPhotoLocationGreaterThanOrEqualTo(String value) {
            addCriterion("photoLocation >=", value, "photoLocation");
            return (Criteria) this;
        }

        public Criteria andPhotoLocationLessThan(String value) {
            addCriterion("photoLocation <", value, "photoLocation");
            return (Criteria) this;
        }

        public Criteria andPhotoLocationLessThanOrEqualTo(String value) {
            addCriterion("photoLocation <=", value, "photoLocation");
            return (Criteria) this;
        }

        public Criteria andPhotoLocationLike(String value) {
            addCriterion("photoLocation like", value, "photoLocation");
            return (Criteria) this;
        }

        public Criteria andPhotoLocationNotLike(String value) {
            addCriterion("photoLocation not like", value, "photoLocation");
            return (Criteria) this;
        }

        public Criteria andPhotoLocationIn(List<String> values) {
            addCriterion("photoLocation in", values, "photoLocation");
            return (Criteria) this;
        }

        public Criteria andPhotoLocationNotIn(List<String> values) {
            addCriterion("photoLocation not in", values, "photoLocation");
            return (Criteria) this;
        }

        public Criteria andPhotoLocationBetween(String value1, String value2) {
            addCriterion("photoLocation between", value1, value2, "photoLocation");
            return (Criteria) this;
        }

        public Criteria andPhotoLocationNotBetween(String value1, String value2) {
            addCriterion("photoLocation not between", value1, value2, "photoLocation");
            return (Criteria) this;
        }

        public Criteria andContactIsNull() {
            addCriterion("contact is null");
            return (Criteria) this;
        }

        public Criteria andContactIsNotNull() {
            addCriterion("contact is not null");
            return (Criteria) this;
        }

        public Criteria andContactEqualTo(Integer value) {
            addCriterion("contact =", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotEqualTo(Integer value) {
            addCriterion("contact <>", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThan(Integer value) {
            addCriterion("contact >", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThanOrEqualTo(Integer value) {
            addCriterion("contact >=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThan(Integer value) {
            addCriterion("contact <", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThanOrEqualTo(Integer value) {
            addCriterion("contact <=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactIn(List<Integer> values) {
            addCriterion("contact in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotIn(List<Integer> values) {
            addCriterion("contact not in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactBetween(Integer value1, Integer value2) {
            addCriterion("contact between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotBetween(Integer value1, Integer value2) {
            addCriterion("contact not between", value1, value2, "contact");
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