package edu.neu.hospital.example.basicTableExample;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DiagnosisViewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public DiagnosisViewExample() {
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

        public Criteria andMedicalRecordIDIsNull() {
            addCriterion("medicalRecordID is null");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordIDIsNotNull() {
            addCriterion("medicalRecordID is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordIDEqualTo(Integer value) {
            addCriterion("medicalRecordID =", value, "medicalRecordID");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordIDNotEqualTo(Integer value) {
            addCriterion("medicalRecordID <>", value, "medicalRecordID");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordIDGreaterThan(Integer value) {
            addCriterion("medicalRecordID >", value, "medicalRecordID");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("medicalRecordID >=", value, "medicalRecordID");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordIDLessThan(Integer value) {
            addCriterion("medicalRecordID <", value, "medicalRecordID");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordIDLessThanOrEqualTo(Integer value) {
            addCriterion("medicalRecordID <=", value, "medicalRecordID");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordIDIn(List<Integer> values) {
            addCriterion("medicalRecordID in", values, "medicalRecordID");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordIDNotIn(List<Integer> values) {
            addCriterion("medicalRecordID not in", values, "medicalRecordID");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordIDBetween(Integer value1, Integer value2) {
            addCriterion("medicalRecordID between", value1, value2, "medicalRecordID");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordIDNotBetween(Integer value1, Integer value2) {
            addCriterion("medicalRecordID not between", value1, value2, "medicalRecordID");
            return (Criteria) this;
        }

        public Criteria andDiseaseIDIsNull() {
            addCriterion("diseaseID is null");
            return (Criteria) this;
        }

        public Criteria andDiseaseIDIsNotNull() {
            addCriterion("diseaseID is not null");
            return (Criteria) this;
        }

        public Criteria andDiseaseIDEqualTo(Integer value) {
            addCriterion("diseaseID =", value, "diseaseID");
            return (Criteria) this;
        }

        public Criteria andDiseaseIDNotEqualTo(Integer value) {
            addCriterion("diseaseID <>", value, "diseaseID");
            return (Criteria) this;
        }

        public Criteria andDiseaseIDGreaterThan(Integer value) {
            addCriterion("diseaseID >", value, "diseaseID");
            return (Criteria) this;
        }

        public Criteria andDiseaseIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("diseaseID >=", value, "diseaseID");
            return (Criteria) this;
        }

        public Criteria andDiseaseIDLessThan(Integer value) {
            addCriterion("diseaseID <", value, "diseaseID");
            return (Criteria) this;
        }

        public Criteria andDiseaseIDLessThanOrEqualTo(Integer value) {
            addCriterion("diseaseID <=", value, "diseaseID");
            return (Criteria) this;
        }

        public Criteria andDiseaseIDIn(List<Integer> values) {
            addCriterion("diseaseID in", values, "diseaseID");
            return (Criteria) this;
        }

        public Criteria andDiseaseIDNotIn(List<Integer> values) {
            addCriterion("diseaseID not in", values, "diseaseID");
            return (Criteria) this;
        }

        public Criteria andDiseaseIDBetween(Integer value1, Integer value2) {
            addCriterion("diseaseID between", value1, value2, "diseaseID");
            return (Criteria) this;
        }

        public Criteria andDiseaseIDNotBetween(Integer value1, Integer value2) {
            addCriterion("diseaseID not between", value1, value2, "diseaseID");
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

        public Criteria andSubjectMarkIsNull() {
            addCriterion("subjectMark is null");
            return (Criteria) this;
        }

        public Criteria andSubjectMarkIsNotNull() {
            addCriterion("subjectMark is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectMarkEqualTo(String value) {
            addCriterion("subjectMark =", value, "subjectMark");
            return (Criteria) this;
        }

        public Criteria andSubjectMarkNotEqualTo(String value) {
            addCriterion("subjectMark <>", value, "subjectMark");
            return (Criteria) this;
        }

        public Criteria andSubjectMarkGreaterThan(String value) {
            addCriterion("subjectMark >", value, "subjectMark");
            return (Criteria) this;
        }

        public Criteria andSubjectMarkGreaterThanOrEqualTo(String value) {
            addCriterion("subjectMark >=", value, "subjectMark");
            return (Criteria) this;
        }

        public Criteria andSubjectMarkLessThan(String value) {
            addCriterion("subjectMark <", value, "subjectMark");
            return (Criteria) this;
        }

        public Criteria andSubjectMarkLessThanOrEqualTo(String value) {
            addCriterion("subjectMark <=", value, "subjectMark");
            return (Criteria) this;
        }

        public Criteria andSubjectMarkLike(String value) {
            addCriterion("subjectMark like", value, "subjectMark");
            return (Criteria) this;
        }

        public Criteria andSubjectMarkNotLike(String value) {
            addCriterion("subjectMark not like", value, "subjectMark");
            return (Criteria) this;
        }

        public Criteria andSubjectMarkIn(List<String> values) {
            addCriterion("subjectMark in", values, "subjectMark");
            return (Criteria) this;
        }

        public Criteria andSubjectMarkNotIn(List<String> values) {
            addCriterion("subjectMark not in", values, "subjectMark");
            return (Criteria) this;
        }

        public Criteria andSubjectMarkBetween(String value1, String value2) {
            addCriterion("subjectMark between", value1, value2, "subjectMark");
            return (Criteria) this;
        }

        public Criteria andSubjectMarkNotBetween(String value1, String value2) {
            addCriterion("subjectMark not between", value1, value2, "subjectMark");
            return (Criteria) this;
        }

        public Criteria andDoubtMarkIsNull() {
            addCriterion("doubtMark is null");
            return (Criteria) this;
        }

        public Criteria andDoubtMarkIsNotNull() {
            addCriterion("doubtMark is not null");
            return (Criteria) this;
        }

        public Criteria andDoubtMarkEqualTo(String value) {
            addCriterion("doubtMark =", value, "doubtMark");
            return (Criteria) this;
        }

        public Criteria andDoubtMarkNotEqualTo(String value) {
            addCriterion("doubtMark <>", value, "doubtMark");
            return (Criteria) this;
        }

        public Criteria andDoubtMarkGreaterThan(String value) {
            addCriterion("doubtMark >", value, "doubtMark");
            return (Criteria) this;
        }

        public Criteria andDoubtMarkGreaterThanOrEqualTo(String value) {
            addCriterion("doubtMark >=", value, "doubtMark");
            return (Criteria) this;
        }

        public Criteria andDoubtMarkLessThan(String value) {
            addCriterion("doubtMark <", value, "doubtMark");
            return (Criteria) this;
        }

        public Criteria andDoubtMarkLessThanOrEqualTo(String value) {
            addCriterion("doubtMark <=", value, "doubtMark");
            return (Criteria) this;
        }

        public Criteria andDoubtMarkLike(String value) {
            addCriterion("doubtMark like", value, "doubtMark");
            return (Criteria) this;
        }

        public Criteria andDoubtMarkNotLike(String value) {
            addCriterion("doubtMark not like", value, "doubtMark");
            return (Criteria) this;
        }

        public Criteria andDoubtMarkIn(List<String> values) {
            addCriterion("doubtMark in", values, "doubtMark");
            return (Criteria) this;
        }

        public Criteria andDoubtMarkNotIn(List<String> values) {
            addCriterion("doubtMark not in", values, "doubtMark");
            return (Criteria) this;
        }

        public Criteria andDoubtMarkBetween(String value1, String value2) {
            addCriterion("doubtMark between", value1, value2, "doubtMark");
            return (Criteria) this;
        }

        public Criteria andDoubtMarkNotBetween(String value1, String value2) {
            addCriterion("doubtMark not between", value1, value2, "doubtMark");
            return (Criteria) this;
        }

        public Criteria andDefiedMarkIsNull() {
            addCriterion("defiedMark is null");
            return (Criteria) this;
        }

        public Criteria andDefiedMarkIsNotNull() {
            addCriterion("defiedMark is not null");
            return (Criteria) this;
        }

        public Criteria andDefiedMarkEqualTo(String value) {
            addCriterion("defiedMark =", value, "defiedMark");
            return (Criteria) this;
        }

        public Criteria andDefiedMarkNotEqualTo(String value) {
            addCriterion("defiedMark <>", value, "defiedMark");
            return (Criteria) this;
        }

        public Criteria andDefiedMarkGreaterThan(String value) {
            addCriterion("defiedMark >", value, "defiedMark");
            return (Criteria) this;
        }

        public Criteria andDefiedMarkGreaterThanOrEqualTo(String value) {
            addCriterion("defiedMark >=", value, "defiedMark");
            return (Criteria) this;
        }

        public Criteria andDefiedMarkLessThan(String value) {
            addCriterion("defiedMark <", value, "defiedMark");
            return (Criteria) this;
        }

        public Criteria andDefiedMarkLessThanOrEqualTo(String value) {
            addCriterion("defiedMark <=", value, "defiedMark");
            return (Criteria) this;
        }

        public Criteria andDefiedMarkLike(String value) {
            addCriterion("defiedMark like", value, "defiedMark");
            return (Criteria) this;
        }

        public Criteria andDefiedMarkNotLike(String value) {
            addCriterion("defiedMark not like", value, "defiedMark");
            return (Criteria) this;
        }

        public Criteria andDefiedMarkIn(List<String> values) {
            addCriterion("defiedMark in", values, "defiedMark");
            return (Criteria) this;
        }

        public Criteria andDefiedMarkNotIn(List<String> values) {
            addCriterion("defiedMark not in", values, "defiedMark");
            return (Criteria) this;
        }

        public Criteria andDefiedMarkBetween(String value1, String value2) {
            addCriterion("defiedMark between", value1, value2, "defiedMark");
            return (Criteria) this;
        }

        public Criteria andDefiedMarkNotBetween(String value1, String value2) {
            addCriterion("defiedMark not between", value1, value2, "defiedMark");
            return (Criteria) this;
        }

        public Criteria andDiseaseDateIsNull() {
            addCriterion("diseaseDate is null");
            return (Criteria) this;
        }

        public Criteria andDiseaseDateIsNotNull() {
            addCriterion("diseaseDate is not null");
            return (Criteria) this;
        }

        public Criteria andDiseaseDateEqualTo(Date value) {
            addCriterionForJDBCDate("diseaseDate =", value, "diseaseDate");
            return (Criteria) this;
        }

        public Criteria andDiseaseDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("diseaseDate <>", value, "diseaseDate");
            return (Criteria) this;
        }

        public Criteria andDiseaseDateGreaterThan(Date value) {
            addCriterionForJDBCDate("diseaseDate >", value, "diseaseDate");
            return (Criteria) this;
        }

        public Criteria andDiseaseDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("diseaseDate >=", value, "diseaseDate");
            return (Criteria) this;
        }

        public Criteria andDiseaseDateLessThan(Date value) {
            addCriterionForJDBCDate("diseaseDate <", value, "diseaseDate");
            return (Criteria) this;
        }

        public Criteria andDiseaseDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("diseaseDate <=", value, "diseaseDate");
            return (Criteria) this;
        }

        public Criteria andDiseaseDateIn(List<Date> values) {
            addCriterionForJDBCDate("diseaseDate in", values, "diseaseDate");
            return (Criteria) this;
        }

        public Criteria andDiseaseDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("diseaseDate not in", values, "diseaseDate");
            return (Criteria) this;
        }

        public Criteria andDiseaseDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("diseaseDate between", value1, value2, "diseaseDate");
            return (Criteria) this;
        }

        public Criteria andDiseaseDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("diseaseDate not between", value1, value2, "diseaseDate");
            return (Criteria) this;
        }

        public Criteria andDiagnosisMarkIsNull() {
            addCriterion("diagnosisMark is null");
            return (Criteria) this;
        }

        public Criteria andDiagnosisMarkIsNotNull() {
            addCriterion("diagnosisMark is not null");
            return (Criteria) this;
        }

        public Criteria andDiagnosisMarkEqualTo(Integer value) {
            addCriterion("diagnosisMark =", value, "diagnosisMark");
            return (Criteria) this;
        }

        public Criteria andDiagnosisMarkNotEqualTo(Integer value) {
            addCriterion("diagnosisMark <>", value, "diagnosisMark");
            return (Criteria) this;
        }

        public Criteria andDiagnosisMarkGreaterThan(Integer value) {
            addCriterion("diagnosisMark >", value, "diagnosisMark");
            return (Criteria) this;
        }

        public Criteria andDiagnosisMarkGreaterThanOrEqualTo(Integer value) {
            addCriterion("diagnosisMark >=", value, "diagnosisMark");
            return (Criteria) this;
        }

        public Criteria andDiagnosisMarkLessThan(Integer value) {
            addCriterion("diagnosisMark <", value, "diagnosisMark");
            return (Criteria) this;
        }

        public Criteria andDiagnosisMarkLessThanOrEqualTo(Integer value) {
            addCriterion("diagnosisMark <=", value, "diagnosisMark");
            return (Criteria) this;
        }

        public Criteria andDiagnosisMarkIn(List<Integer> values) {
            addCriterion("diagnosisMark in", values, "diagnosisMark");
            return (Criteria) this;
        }

        public Criteria andDiagnosisMarkNotIn(List<Integer> values) {
            addCriterion("diagnosisMark not in", values, "diagnosisMark");
            return (Criteria) this;
        }

        public Criteria andDiagnosisMarkBetween(Integer value1, Integer value2) {
            addCriterion("diagnosisMark between", value1, value2, "diagnosisMark");
            return (Criteria) this;
        }

        public Criteria andDiagnosisMarkNotBetween(Integer value1, Integer value2) {
            addCriterion("diagnosisMark not between", value1, value2, "diagnosisMark");
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