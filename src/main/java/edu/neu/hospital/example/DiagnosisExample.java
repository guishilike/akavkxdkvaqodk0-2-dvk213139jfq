package edu.neu.hospital.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DiagnosisExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public DiagnosisExample() {
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

        public Criteria andDiseaseidIsNull() {
            addCriterion("diseaseID is null");
            return (Criteria) this;
        }

        public Criteria andDiseaseidIsNotNull() {
            addCriterion("diseaseID is not null");
            return (Criteria) this;
        }

        public Criteria andDiseaseidEqualTo(Integer value) {
            addCriterion("diseaseID =", value, "diseaseid");
            return (Criteria) this;
        }

        public Criteria andDiseaseidNotEqualTo(Integer value) {
            addCriterion("diseaseID <>", value, "diseaseid");
            return (Criteria) this;
        }

        public Criteria andDiseaseidGreaterThan(Integer value) {
            addCriterion("diseaseID >", value, "diseaseid");
            return (Criteria) this;
        }

        public Criteria andDiseaseidGreaterThanOrEqualTo(Integer value) {
            addCriterion("diseaseID >=", value, "diseaseid");
            return (Criteria) this;
        }

        public Criteria andDiseaseidLessThan(Integer value) {
            addCriterion("diseaseID <", value, "diseaseid");
            return (Criteria) this;
        }

        public Criteria andDiseaseidLessThanOrEqualTo(Integer value) {
            addCriterion("diseaseID <=", value, "diseaseid");
            return (Criteria) this;
        }

        public Criteria andDiseaseidIn(List<Integer> values) {
            addCriterion("diseaseID in", values, "diseaseid");
            return (Criteria) this;
        }

        public Criteria andDiseaseidNotIn(List<Integer> values) {
            addCriterion("diseaseID not in", values, "diseaseid");
            return (Criteria) this;
        }

        public Criteria andDiseaseidBetween(Integer value1, Integer value2) {
            addCriterion("diseaseID between", value1, value2, "diseaseid");
            return (Criteria) this;
        }

        public Criteria andDiseaseidNotBetween(Integer value1, Integer value2) {
            addCriterion("diseaseID not between", value1, value2, "diseaseid");
            return (Criteria) this;
        }

        public Criteria andMedicalresultidIsNull() {
            addCriterion("medicalResultID is null");
            return (Criteria) this;
        }

        public Criteria andMedicalresultidIsNotNull() {
            addCriterion("medicalResultID is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalresultidEqualTo(String value) {
            addCriterion("medicalResultID =", value, "medicalresultid");
            return (Criteria) this;
        }

        public Criteria andMedicalresultidNotEqualTo(String value) {
            addCriterion("medicalResultID <>", value, "medicalresultid");
            return (Criteria) this;
        }

        public Criteria andMedicalresultidGreaterThan(String value) {
            addCriterion("medicalResultID >", value, "medicalresultid");
            return (Criteria) this;
        }

        public Criteria andMedicalresultidGreaterThanOrEqualTo(String value) {
            addCriterion("medicalResultID >=", value, "medicalresultid");
            return (Criteria) this;
        }

        public Criteria andMedicalresultidLessThan(String value) {
            addCriterion("medicalResultID <", value, "medicalresultid");
            return (Criteria) this;
        }

        public Criteria andMedicalresultidLessThanOrEqualTo(String value) {
            addCriterion("medicalResultID <=", value, "medicalresultid");
            return (Criteria) this;
        }

        public Criteria andMedicalresultidLike(String value) {
            addCriterion("medicalResultID like", value, "medicalresultid");
            return (Criteria) this;
        }

        public Criteria andMedicalresultidNotLike(String value) {
            addCriterion("medicalResultID not like", value, "medicalresultid");
            return (Criteria) this;
        }

        public Criteria andMedicalresultidIn(List<String> values) {
            addCriterion("medicalResultID in", values, "medicalresultid");
            return (Criteria) this;
        }

        public Criteria andMedicalresultidNotIn(List<String> values) {
            addCriterion("medicalResultID not in", values, "medicalresultid");
            return (Criteria) this;
        }

        public Criteria andMedicalresultidBetween(String value1, String value2) {
            addCriterion("medicalResultID between", value1, value2, "medicalresultid");
            return (Criteria) this;
        }

        public Criteria andMedicalresultidNotBetween(String value1, String value2) {
            addCriterion("medicalResultID not between", value1, value2, "medicalresultid");
            return (Criteria) this;
        }

        public Criteria andSubjectmarkIsNull() {
            addCriterion("subjectMark is null");
            return (Criteria) this;
        }

        public Criteria andSubjectmarkIsNotNull() {
            addCriterion("subjectMark is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectmarkEqualTo(String value) {
            addCriterion("subjectMark =", value, "subjectmark");
            return (Criteria) this;
        }

        public Criteria andSubjectmarkNotEqualTo(String value) {
            addCriterion("subjectMark <>", value, "subjectmark");
            return (Criteria) this;
        }

        public Criteria andSubjectmarkGreaterThan(String value) {
            addCriterion("subjectMark >", value, "subjectmark");
            return (Criteria) this;
        }

        public Criteria andSubjectmarkGreaterThanOrEqualTo(String value) {
            addCriterion("subjectMark >=", value, "subjectmark");
            return (Criteria) this;
        }

        public Criteria andSubjectmarkLessThan(String value) {
            addCriterion("subjectMark <", value, "subjectmark");
            return (Criteria) this;
        }

        public Criteria andSubjectmarkLessThanOrEqualTo(String value) {
            addCriterion("subjectMark <=", value, "subjectmark");
            return (Criteria) this;
        }

        public Criteria andSubjectmarkLike(String value) {
            addCriterion("subjectMark like", value, "subjectmark");
            return (Criteria) this;
        }

        public Criteria andSubjectmarkNotLike(String value) {
            addCriterion("subjectMark not like", value, "subjectmark");
            return (Criteria) this;
        }

        public Criteria andSubjectmarkIn(List<String> values) {
            addCriterion("subjectMark in", values, "subjectmark");
            return (Criteria) this;
        }

        public Criteria andSubjectmarkNotIn(List<String> values) {
            addCriterion("subjectMark not in", values, "subjectmark");
            return (Criteria) this;
        }

        public Criteria andSubjectmarkBetween(String value1, String value2) {
            addCriterion("subjectMark between", value1, value2, "subjectmark");
            return (Criteria) this;
        }

        public Criteria andSubjectmarkNotBetween(String value1, String value2) {
            addCriterion("subjectMark not between", value1, value2, "subjectmark");
            return (Criteria) this;
        }

        public Criteria andDoubtmarkIsNull() {
            addCriterion("doubtMark is null");
            return (Criteria) this;
        }

        public Criteria andDoubtmarkIsNotNull() {
            addCriterion("doubtMark is not null");
            return (Criteria) this;
        }

        public Criteria andDoubtmarkEqualTo(String value) {
            addCriterion("doubtMark =", value, "doubtmark");
            return (Criteria) this;
        }

        public Criteria andDoubtmarkNotEqualTo(String value) {
            addCriterion("doubtMark <>", value, "doubtmark");
            return (Criteria) this;
        }

        public Criteria andDoubtmarkGreaterThan(String value) {
            addCriterion("doubtMark >", value, "doubtmark");
            return (Criteria) this;
        }

        public Criteria andDoubtmarkGreaterThanOrEqualTo(String value) {
            addCriterion("doubtMark >=", value, "doubtmark");
            return (Criteria) this;
        }

        public Criteria andDoubtmarkLessThan(String value) {
            addCriterion("doubtMark <", value, "doubtmark");
            return (Criteria) this;
        }

        public Criteria andDoubtmarkLessThanOrEqualTo(String value) {
            addCriterion("doubtMark <=", value, "doubtmark");
            return (Criteria) this;
        }

        public Criteria andDoubtmarkLike(String value) {
            addCriterion("doubtMark like", value, "doubtmark");
            return (Criteria) this;
        }

        public Criteria andDoubtmarkNotLike(String value) {
            addCriterion("doubtMark not like", value, "doubtmark");
            return (Criteria) this;
        }

        public Criteria andDoubtmarkIn(List<String> values) {
            addCriterion("doubtMark in", values, "doubtmark");
            return (Criteria) this;
        }

        public Criteria andDoubtmarkNotIn(List<String> values) {
            addCriterion("doubtMark not in", values, "doubtmark");
            return (Criteria) this;
        }

        public Criteria andDoubtmarkBetween(String value1, String value2) {
            addCriterion("doubtMark between", value1, value2, "doubtmark");
            return (Criteria) this;
        }

        public Criteria andDoubtmarkNotBetween(String value1, String value2) {
            addCriterion("doubtMark not between", value1, value2, "doubtmark");
            return (Criteria) this;
        }

        public Criteria andDefiedmarkIsNull() {
            addCriterion("defiedMark is null");
            return (Criteria) this;
        }

        public Criteria andDefiedmarkIsNotNull() {
            addCriterion("defiedMark is not null");
            return (Criteria) this;
        }

        public Criteria andDefiedmarkEqualTo(String value) {
            addCriterion("defiedMark =", value, "defiedmark");
            return (Criteria) this;
        }

        public Criteria andDefiedmarkNotEqualTo(String value) {
            addCriterion("defiedMark <>", value, "defiedmark");
            return (Criteria) this;
        }

        public Criteria andDefiedmarkGreaterThan(String value) {
            addCriterion("defiedMark >", value, "defiedmark");
            return (Criteria) this;
        }

        public Criteria andDefiedmarkGreaterThanOrEqualTo(String value) {
            addCriterion("defiedMark >=", value, "defiedmark");
            return (Criteria) this;
        }

        public Criteria andDefiedmarkLessThan(String value) {
            addCriterion("defiedMark <", value, "defiedmark");
            return (Criteria) this;
        }

        public Criteria andDefiedmarkLessThanOrEqualTo(String value) {
            addCriterion("defiedMark <=", value, "defiedmark");
            return (Criteria) this;
        }

        public Criteria andDefiedmarkLike(String value) {
            addCriterion("defiedMark like", value, "defiedmark");
            return (Criteria) this;
        }

        public Criteria andDefiedmarkNotLike(String value) {
            addCriterion("defiedMark not like", value, "defiedmark");
            return (Criteria) this;
        }

        public Criteria andDefiedmarkIn(List<String> values) {
            addCriterion("defiedMark in", values, "defiedmark");
            return (Criteria) this;
        }

        public Criteria andDefiedmarkNotIn(List<String> values) {
            addCriterion("defiedMark not in", values, "defiedmark");
            return (Criteria) this;
        }

        public Criteria andDefiedmarkBetween(String value1, String value2) {
            addCriterion("defiedMark between", value1, value2, "defiedmark");
            return (Criteria) this;
        }

        public Criteria andDefiedmarkNotBetween(String value1, String value2) {
            addCriterion("defiedMark not between", value1, value2, "defiedmark");
            return (Criteria) this;
        }

        public Criteria andDiseasedateIsNull() {
            addCriterion("diseaseDate is null");
            return (Criteria) this;
        }

        public Criteria andDiseasedateIsNotNull() {
            addCriterion("diseaseDate is not null");
            return (Criteria) this;
        }

        public Criteria andDiseasedateEqualTo(Date value) {
            addCriterionForJDBCDate("diseaseDate =", value, "diseasedate");
            return (Criteria) this;
        }

        public Criteria andDiseasedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("diseaseDate <>", value, "diseasedate");
            return (Criteria) this;
        }

        public Criteria andDiseasedateGreaterThan(Date value) {
            addCriterionForJDBCDate("diseaseDate >", value, "diseasedate");
            return (Criteria) this;
        }

        public Criteria andDiseasedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("diseaseDate >=", value, "diseasedate");
            return (Criteria) this;
        }

        public Criteria andDiseasedateLessThan(Date value) {
            addCriterionForJDBCDate("diseaseDate <", value, "diseasedate");
            return (Criteria) this;
        }

        public Criteria andDiseasedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("diseaseDate <=", value, "diseasedate");
            return (Criteria) this;
        }

        public Criteria andDiseasedateIn(List<Date> values) {
            addCriterionForJDBCDate("diseaseDate in", values, "diseasedate");
            return (Criteria) this;
        }

        public Criteria andDiseasedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("diseaseDate not in", values, "diseasedate");
            return (Criteria) this;
        }

        public Criteria andDiseasedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("diseaseDate between", value1, value2, "diseasedate");
            return (Criteria) this;
        }

        public Criteria andDiseasedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("diseaseDate not between", value1, value2, "diseasedate");
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

        public Criteria andAppeardateEqualTo(Integer value) {
            addCriterion("appearDate =", value, "appeardate");
            return (Criteria) this;
        }

        public Criteria andAppeardateNotEqualTo(Integer value) {
            addCriterion("appearDate <>", value, "appeardate");
            return (Criteria) this;
        }

        public Criteria andAppeardateGreaterThan(Integer value) {
            addCriterion("appearDate >", value, "appeardate");
            return (Criteria) this;
        }

        public Criteria andAppeardateGreaterThanOrEqualTo(Integer value) {
            addCriterion("appearDate >=", value, "appeardate");
            return (Criteria) this;
        }

        public Criteria andAppeardateLessThan(Integer value) {
            addCriterion("appearDate <", value, "appeardate");
            return (Criteria) this;
        }

        public Criteria andAppeardateLessThanOrEqualTo(Integer value) {
            addCriterion("appearDate <=", value, "appeardate");
            return (Criteria) this;
        }

        public Criteria andAppeardateIn(List<Integer> values) {
            addCriterion("appearDate in", values, "appeardate");
            return (Criteria) this;
        }

        public Criteria andAppeardateNotIn(List<Integer> values) {
            addCriterion("appearDate not in", values, "appeardate");
            return (Criteria) this;
        }

        public Criteria andAppeardateBetween(Integer value1, Integer value2) {
            addCriterion("appearDate between", value1, value2, "appeardate");
            return (Criteria) this;
        }

        public Criteria andAppeardateNotBetween(Integer value1, Integer value2) {
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

        public Criteria andChangedateEqualTo(Integer value) {
            addCriterion("changeDate =", value, "changedate");
            return (Criteria) this;
        }

        public Criteria andChangedateNotEqualTo(Integer value) {
            addCriterion("changeDate <>", value, "changedate");
            return (Criteria) this;
        }

        public Criteria andChangedateGreaterThan(Integer value) {
            addCriterion("changeDate >", value, "changedate");
            return (Criteria) this;
        }

        public Criteria andChangedateGreaterThanOrEqualTo(Integer value) {
            addCriterion("changeDate >=", value, "changedate");
            return (Criteria) this;
        }

        public Criteria andChangedateLessThan(Integer value) {
            addCriterion("changeDate <", value, "changedate");
            return (Criteria) this;
        }

        public Criteria andChangedateLessThanOrEqualTo(Integer value) {
            addCriterion("changeDate <=", value, "changedate");
            return (Criteria) this;
        }

        public Criteria andChangedateIn(List<Integer> values) {
            addCriterion("changeDate in", values, "changedate");
            return (Criteria) this;
        }

        public Criteria andChangedateNotIn(List<Integer> values) {
            addCriterion("changeDate not in", values, "changedate");
            return (Criteria) this;
        }

        public Criteria andChangedateBetween(Integer value1, Integer value2) {
            addCriterion("changeDate between", value1, value2, "changedate");
            return (Criteria) this;
        }

        public Criteria andChangedateNotBetween(Integer value1, Integer value2) {
            addCriterion("changeDate not between", value1, value2, "changedate");
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