package edu.neu.hospital.example.basicTableExample;

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