package edu.neu.hospital.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public UserExample() {
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

        public Criteria andUsernameIsNull() {
            addCriterion("userName is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("userName is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("userName =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("userName <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("userName >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("userName >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("userName <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("userName <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("userName like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("userName not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("userName in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("userName not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("userName between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("userName not between", value1, value2, "username");
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

        public Criteria andDepartmentidIsNull() {
            addCriterion("departmentID is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIsNotNull() {
            addCriterion("departmentID is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentidEqualTo(Integer value) {
            addCriterion("departmentID =", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotEqualTo(Integer value) {
            addCriterion("departmentID <>", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidGreaterThan(Integer value) {
            addCriterion("departmentID >", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("departmentID >=", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidLessThan(Integer value) {
            addCriterion("departmentID <", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidLessThanOrEqualTo(Integer value) {
            addCriterion("departmentID <=", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIn(List<Integer> values) {
            addCriterion("departmentID in", values, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotIn(List<Integer> values) {
            addCriterion("departmentID not in", values, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidBetween(Integer value1, Integer value2) {
            addCriterion("departmentID between", value1, value2, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotBetween(Integer value1, Integer value2) {
            addCriterion("departmentID not between", value1, value2, "departmentid");
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

        public Criteria andRankIsNull() {
            addCriterion("`rank` is null");
            return (Criteria) this;
        }

        public Criteria andRankIsNotNull() {
            addCriterion("`rank` is not null");
            return (Criteria) this;
        }

        public Criteria andRankEqualTo(Integer value) {
            addCriterion("`rank` =", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotEqualTo(Integer value) {
            addCriterion("`rank` <>", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankGreaterThan(Integer value) {
            addCriterion("`rank` >", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankGreaterThanOrEqualTo(Integer value) {
            addCriterion("`rank` >=", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankLessThan(Integer value) {
            addCriterion("`rank` <", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankLessThanOrEqualTo(Integer value) {
            addCriterion("`rank` <=", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankIn(List<Integer> values) {
            addCriterion("`rank` in", values, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotIn(List<Integer> values) {
            addCriterion("`rank` not in", values, "rank");
            return (Criteria) this;
        }

        public Criteria andRankBetween(Integer value1, Integer value2) {
            addCriterion("`rank` between", value1, value2, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotBetween(Integer value1, Integer value2) {
            addCriterion("`rank` not between", value1, value2, "rank");
            return (Criteria) this;
        }

        public Criteria andIsscheduleIsNull() {
            addCriterion("isSchedule is null");
            return (Criteria) this;
        }

        public Criteria andIsscheduleIsNotNull() {
            addCriterion("isSchedule is not null");
            return (Criteria) this;
        }

        public Criteria andIsscheduleEqualTo(String value) {
            addCriterion("isSchedule =", value, "isschedule");
            return (Criteria) this;
        }

        public Criteria andIsscheduleNotEqualTo(String value) {
            addCriterion("isSchedule <>", value, "isschedule");
            return (Criteria) this;
        }

        public Criteria andIsscheduleGreaterThan(String value) {
            addCriterion("isSchedule >", value, "isschedule");
            return (Criteria) this;
        }

        public Criteria andIsscheduleGreaterThanOrEqualTo(String value) {
            addCriterion("isSchedule >=", value, "isschedule");
            return (Criteria) this;
        }

        public Criteria andIsscheduleLessThan(String value) {
            addCriterion("isSchedule <", value, "isschedule");
            return (Criteria) this;
        }

        public Criteria andIsscheduleLessThanOrEqualTo(String value) {
            addCriterion("isSchedule <=", value, "isschedule");
            return (Criteria) this;
        }

        public Criteria andIsscheduleLike(String value) {
            addCriterion("isSchedule like", value, "isschedule");
            return (Criteria) this;
        }

        public Criteria andIsscheduleNotLike(String value) {
            addCriterion("isSchedule not like", value, "isschedule");
            return (Criteria) this;
        }

        public Criteria andIsscheduleIn(List<String> values) {
            addCriterion("isSchedule in", values, "isschedule");
            return (Criteria) this;
        }

        public Criteria andIsscheduleNotIn(List<String> values) {
            addCriterion("isSchedule not in", values, "isschedule");
            return (Criteria) this;
        }

        public Criteria andIsscheduleBetween(String value1, String value2) {
            addCriterion("isSchedule between", value1, value2, "isschedule");
            return (Criteria) this;
        }

        public Criteria andIsscheduleNotBetween(String value1, String value2) {
            addCriterion("isSchedule not between", value1, value2, "isschedule");
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

        public Criteria andAppearuseridIsNull() {
            addCriterion("appearUserID is null");
            return (Criteria) this;
        }

        public Criteria andAppearuseridIsNotNull() {
            addCriterion("appearUserID is not null");
            return (Criteria) this;
        }

        public Criteria andAppearuseridEqualTo(Integer value) {
            addCriterion("appearUserID =", value, "appearuserid");
            return (Criteria) this;
        }

        public Criteria andAppearuseridNotEqualTo(Integer value) {
            addCriterion("appearUserID <>", value, "appearuserid");
            return (Criteria) this;
        }

        public Criteria andAppearuseridGreaterThan(Integer value) {
            addCriterion("appearUserID >", value, "appearuserid");
            return (Criteria) this;
        }

        public Criteria andAppearuseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("appearUserID >=", value, "appearuserid");
            return (Criteria) this;
        }

        public Criteria andAppearuseridLessThan(Integer value) {
            addCriterion("appearUserID <", value, "appearuserid");
            return (Criteria) this;
        }

        public Criteria andAppearuseridLessThanOrEqualTo(Integer value) {
            addCriterion("appearUserID <=", value, "appearuserid");
            return (Criteria) this;
        }

        public Criteria andAppearuseridIn(List<Integer> values) {
            addCriterion("appearUserID in", values, "appearuserid");
            return (Criteria) this;
        }

        public Criteria andAppearuseridNotIn(List<Integer> values) {
            addCriterion("appearUserID not in", values, "appearuserid");
            return (Criteria) this;
        }

        public Criteria andAppearuseridBetween(Integer value1, Integer value2) {
            addCriterion("appearUserID between", value1, value2, "appearuserid");
            return (Criteria) this;
        }

        public Criteria andAppearuseridNotBetween(Integer value1, Integer value2) {
            addCriterion("appearUserID not between", value1, value2, "appearuserid");
            return (Criteria) this;
        }

        public Criteria andChangeuseridIsNull() {
            addCriterion("changeUserID is null");
            return (Criteria) this;
        }

        public Criteria andChangeuseridIsNotNull() {
            addCriterion("changeUserID is not null");
            return (Criteria) this;
        }

        public Criteria andChangeuseridEqualTo(Integer value) {
            addCriterion("changeUserID =", value, "changeuserid");
            return (Criteria) this;
        }

        public Criteria andChangeuseridNotEqualTo(Integer value) {
            addCriterion("changeUserID <>", value, "changeuserid");
            return (Criteria) this;
        }

        public Criteria andChangeuseridGreaterThan(Integer value) {
            addCriterion("changeUserID >", value, "changeuserid");
            return (Criteria) this;
        }

        public Criteria andChangeuseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("changeUserID >=", value, "changeuserid");
            return (Criteria) this;
        }

        public Criteria andChangeuseridLessThan(Integer value) {
            addCriterion("changeUserID <", value, "changeuserid");
            return (Criteria) this;
        }

        public Criteria andChangeuseridLessThanOrEqualTo(Integer value) {
            addCriterion("changeUserID <=", value, "changeuserid");
            return (Criteria) this;
        }

        public Criteria andChangeuseridIn(List<Integer> values) {
            addCriterion("changeUserID in", values, "changeuserid");
            return (Criteria) this;
        }

        public Criteria andChangeuseridNotIn(List<Integer> values) {
            addCriterion("changeUserID not in", values, "changeuserid");
            return (Criteria) this;
        }

        public Criteria andChangeuseridBetween(Integer value1, Integer value2) {
            addCriterion("changeUserID between", value1, value2, "changeuserid");
            return (Criteria) this;
        }

        public Criteria andChangeuseridNotBetween(Integer value1, Integer value2) {
            addCriterion("changeUserID not between", value1, value2, "changeuserid");
            return (Criteria) this;
        }

        public Criteria andAppeardateIsNull() {
            addCriterion("appearDate is null");
            return (Criteria) this;
        }

        public Criteria andAppeardateIsNotNull() {
            addCriterion("appearDate is not null");
            return (Criteria) this;
        }

        public Criteria andAppeardateEqualTo(Date value) {
            addCriterion("appearDate =", value, "appeardate");
            return (Criteria) this;
        }

        public Criteria andAppeardateNotEqualTo(Date value) {
            addCriterion("appearDate <>", value, "appeardate");
            return (Criteria) this;
        }

        public Criteria andAppeardateGreaterThan(Date value) {
            addCriterion("appearDate >", value, "appeardate");
            return (Criteria) this;
        }

        public Criteria andAppeardateGreaterThanOrEqualTo(Date value) {
            addCriterion("appearDate >=", value, "appeardate");
            return (Criteria) this;
        }

        public Criteria andAppeardateLessThan(Date value) {
            addCriterion("appearDate <", value, "appeardate");
            return (Criteria) this;
        }

        public Criteria andAppeardateLessThanOrEqualTo(Date value) {
            addCriterion("appearDate <=", value, "appeardate");
            return (Criteria) this;
        }

        public Criteria andAppeardateIn(List<Date> values) {
            addCriterion("appearDate in", values, "appeardate");
            return (Criteria) this;
        }

        public Criteria andAppeardateNotIn(List<Date> values) {
            addCriterion("appearDate not in", values, "appeardate");
            return (Criteria) this;
        }

        public Criteria andAppeardateBetween(Date value1, Date value2) {
            addCriterion("appearDate between", value1, value2, "appeardate");
            return (Criteria) this;
        }

        public Criteria andAppeardateNotBetween(Date value1, Date value2) {
            addCriterion("appearDate not between", value1, value2, "appeardate");
            return (Criteria) this;
        }

        public Criteria andChangedateIsNull() {
            addCriterion("changeDate is null");
            return (Criteria) this;
        }

        public Criteria andChangedateIsNotNull() {
            addCriterion("changeDate is not null");
            return (Criteria) this;
        }

        public Criteria andChangedateEqualTo(Date value) {
            addCriterion("changeDate =", value, "changedate");
            return (Criteria) this;
        }

        public Criteria andChangedateNotEqualTo(Date value) {
            addCriterion("changeDate <>", value, "changedate");
            return (Criteria) this;
        }

        public Criteria andChangedateGreaterThan(Date value) {
            addCriterion("changeDate >", value, "changedate");
            return (Criteria) this;
        }

        public Criteria andChangedateGreaterThanOrEqualTo(Date value) {
            addCriterion("changeDate >=", value, "changedate");
            return (Criteria) this;
        }

        public Criteria andChangedateLessThan(Date value) {
            addCriterion("changeDate <", value, "changedate");
            return (Criteria) this;
        }

        public Criteria andChangedateLessThanOrEqualTo(Date value) {
            addCriterion("changeDate <=", value, "changedate");
            return (Criteria) this;
        }

        public Criteria andChangedateIn(List<Date> values) {
            addCriterion("changeDate in", values, "changedate");
            return (Criteria) this;
        }

        public Criteria andChangedateNotIn(List<Date> values) {
            addCriterion("changeDate not in", values, "changedate");
            return (Criteria) this;
        }

        public Criteria andChangedateBetween(Date value1, Date value2) {
            addCriterion("changeDate between", value1, value2, "changedate");
            return (Criteria) this;
        }

        public Criteria andChangedateNotBetween(Date value1, Date value2) {
            addCriterion("changeDate not between", value1, value2, "changedate");
            return (Criteria) this;
        }

        public Criteria andPhotolocationIsNull() {
            addCriterion("photoLocation is null");
            return (Criteria) this;
        }

        public Criteria andPhotolocationIsNotNull() {
            addCriterion("photoLocation is not null");
            return (Criteria) this;
        }

        public Criteria andPhotolocationEqualTo(String value) {
            addCriterion("photoLocation =", value, "photolocation");
            return (Criteria) this;
        }

        public Criteria andPhotolocationNotEqualTo(String value) {
            addCriterion("photoLocation <>", value, "photolocation");
            return (Criteria) this;
        }

        public Criteria andPhotolocationGreaterThan(String value) {
            addCriterion("photoLocation >", value, "photolocation");
            return (Criteria) this;
        }

        public Criteria andPhotolocationGreaterThanOrEqualTo(String value) {
            addCriterion("photoLocation >=", value, "photolocation");
            return (Criteria) this;
        }

        public Criteria andPhotolocationLessThan(String value) {
            addCriterion("photoLocation <", value, "photolocation");
            return (Criteria) this;
        }

        public Criteria andPhotolocationLessThanOrEqualTo(String value) {
            addCriterion("photoLocation <=", value, "photolocation");
            return (Criteria) this;
        }

        public Criteria andPhotolocationLike(String value) {
            addCriterion("photoLocation like", value, "photolocation");
            return (Criteria) this;
        }

        public Criteria andPhotolocationNotLike(String value) {
            addCriterion("photoLocation not like", value, "photolocation");
            return (Criteria) this;
        }

        public Criteria andPhotolocationIn(List<String> values) {
            addCriterion("photoLocation in", values, "photolocation");
            return (Criteria) this;
        }

        public Criteria andPhotolocationNotIn(List<String> values) {
            addCriterion("photoLocation not in", values, "photolocation");
            return (Criteria) this;
        }

        public Criteria andPhotolocationBetween(String value1, String value2) {
            addCriterion("photoLocation between", value1, value2, "photolocation");
            return (Criteria) this;
        }

        public Criteria andPhotolocationNotBetween(String value1, String value2) {
            addCriterion("photoLocation not between", value1, value2, "photolocation");
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

        public Criteria andReserve1IsNull() {
            addCriterion("reserve1 is null");
            return (Criteria) this;
        }

        public Criteria andReserve1IsNotNull() {
            addCriterion("reserve1 is not null");
            return (Criteria) this;
        }

        public Criteria andReserve1EqualTo(String value) {
            addCriterion("reserve1 =", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1NotEqualTo(String value) {
            addCriterion("reserve1 <>", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1GreaterThan(String value) {
            addCriterion("reserve1 >", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1GreaterThanOrEqualTo(String value) {
            addCriterion("reserve1 >=", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1LessThan(String value) {
            addCriterion("reserve1 <", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1LessThanOrEqualTo(String value) {
            addCriterion("reserve1 <=", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1Like(String value) {
            addCriterion("reserve1 like", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1NotLike(String value) {
            addCriterion("reserve1 not like", value, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1In(List<String> values) {
            addCriterion("reserve1 in", values, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1NotIn(List<String> values) {
            addCriterion("reserve1 not in", values, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1Between(String value1, String value2) {
            addCriterion("reserve1 between", value1, value2, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve1NotBetween(String value1, String value2) {
            addCriterion("reserve1 not between", value1, value2, "reserve1");
            return (Criteria) this;
        }

        public Criteria andReserve2IsNull() {
            addCriterion("reserve2 is null");
            return (Criteria) this;
        }

        public Criteria andReserve2IsNotNull() {
            addCriterion("reserve2 is not null");
            return (Criteria) this;
        }

        public Criteria andReserve2EqualTo(String value) {
            addCriterion("reserve2 =", value, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2NotEqualTo(String value) {
            addCriterion("reserve2 <>", value, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2GreaterThan(String value) {
            addCriterion("reserve2 >", value, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2GreaterThanOrEqualTo(String value) {
            addCriterion("reserve2 >=", value, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2LessThan(String value) {
            addCriterion("reserve2 <", value, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2LessThanOrEqualTo(String value) {
            addCriterion("reserve2 <=", value, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2Like(String value) {
            addCriterion("reserve2 like", value, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2NotLike(String value) {
            addCriterion("reserve2 not like", value, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2In(List<String> values) {
            addCriterion("reserve2 in", values, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2NotIn(List<String> values) {
            addCriterion("reserve2 not in", values, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2Between(String value1, String value2) {
            addCriterion("reserve2 between", value1, value2, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve2NotBetween(String value1, String value2) {
            addCriterion("reserve2 not between", value1, value2, "reserve2");
            return (Criteria) this;
        }

        public Criteria andReserve3IsNull() {
            addCriterion("reserve3 is null");
            return (Criteria) this;
        }

        public Criteria andReserve3IsNotNull() {
            addCriterion("reserve3 is not null");
            return (Criteria) this;
        }

        public Criteria andReserve3EqualTo(String value) {
            addCriterion("reserve3 =", value, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3NotEqualTo(String value) {
            addCriterion("reserve3 <>", value, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3GreaterThan(String value) {
            addCriterion("reserve3 >", value, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3GreaterThanOrEqualTo(String value) {
            addCriterion("reserve3 >=", value, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3LessThan(String value) {
            addCriterion("reserve3 <", value, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3LessThanOrEqualTo(String value) {
            addCriterion("reserve3 <=", value, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3Like(String value) {
            addCriterion("reserve3 like", value, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3NotLike(String value) {
            addCriterion("reserve3 not like", value, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3In(List<String> values) {
            addCriterion("reserve3 in", values, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3NotIn(List<String> values) {
            addCriterion("reserve3 not in", values, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3Between(String value1, String value2) {
            addCriterion("reserve3 between", value1, value2, "reserve3");
            return (Criteria) this;
        }

        public Criteria andReserve3NotBetween(String value1, String value2) {
            addCriterion("reserve3 not between", value1, value2, "reserve3");
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