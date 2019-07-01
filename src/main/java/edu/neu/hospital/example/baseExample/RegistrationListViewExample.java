package edu.neu.hospital.example.baseExample;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RegistrationListViewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public RegistrationListViewExample() {
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

        public Criteria andMedRecIDIsNull() {
            addCriterion("medRecID is null");
            return (Criteria) this;
        }

        public Criteria andMedRecIDIsNotNull() {
            addCriterion("medRecID is not null");
            return (Criteria) this;
        }

        public Criteria andMedRecIDEqualTo(Integer value) {
            addCriterion("medRecID =", value, "medRecID");
            return (Criteria) this;
        }

        public Criteria andMedRecIDNotEqualTo(Integer value) {
            addCriterion("medRecID <>", value, "medRecID");
            return (Criteria) this;
        }

        public Criteria andMedRecIDGreaterThan(Integer value) {
            addCriterion("medRecID >", value, "medRecID");
            return (Criteria) this;
        }

        public Criteria andMedRecIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("medRecID >=", value, "medRecID");
            return (Criteria) this;
        }

        public Criteria andMedRecIDLessThan(Integer value) {
            addCriterion("medRecID <", value, "medRecID");
            return (Criteria) this;
        }

        public Criteria andMedRecIDLessThanOrEqualTo(Integer value) {
            addCriterion("medRecID <=", value, "medRecID");
            return (Criteria) this;
        }

        public Criteria andMedRecIDIn(List<Integer> values) {
            addCriterion("medRecID in", values, "medRecID");
            return (Criteria) this;
        }

        public Criteria andMedRecIDNotIn(List<Integer> values) {
            addCriterion("medRecID not in", values, "medRecID");
            return (Criteria) this;
        }

        public Criteria andMedRecIDBetween(Integer value1, Integer value2) {
            addCriterion("medRecID between", value1, value2, "medRecID");
            return (Criteria) this;
        }

        public Criteria andMedRecIDNotBetween(Integer value1, Integer value2) {
            addCriterion("medRecID not between", value1, value2, "medRecID");
            return (Criteria) this;
        }

        public Criteria andPatientNameIsNull() {
            addCriterion("patientName is null");
            return (Criteria) this;
        }

        public Criteria andPatientNameIsNotNull() {
            addCriterion("patientName is not null");
            return (Criteria) this;
        }

        public Criteria andPatientNameEqualTo(String value) {
            addCriterion("patientName =", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameNotEqualTo(String value) {
            addCriterion("patientName <>", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameGreaterThan(String value) {
            addCriterion("patientName >", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameGreaterThanOrEqualTo(String value) {
            addCriterion("patientName >=", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameLessThan(String value) {
            addCriterion("patientName <", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameLessThanOrEqualTo(String value) {
            addCriterion("patientName <=", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameLike(String value) {
            addCriterion("patientName like", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameNotLike(String value) {
            addCriterion("patientName not like", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameIn(List<String> values) {
            addCriterion("patientName in", values, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameNotIn(List<String> values) {
            addCriterion("patientName not in", values, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameBetween(String value1, String value2) {
            addCriterion("patientName between", value1, value2, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameNotBetween(String value1, String value2) {
            addCriterion("patientName not between", value1, value2, "patientName");
            return (Criteria) this;
        }

        public Criteria andRegLevelIsNull() {
            addCriterion("regLevel is null");
            return (Criteria) this;
        }

        public Criteria andRegLevelIsNotNull() {
            addCriterion("regLevel is not null");
            return (Criteria) this;
        }

        public Criteria andRegLevelEqualTo(String value) {
            addCriterion("regLevel =", value, "regLevel");
            return (Criteria) this;
        }

        public Criteria andRegLevelNotEqualTo(String value) {
            addCriterion("regLevel <>", value, "regLevel");
            return (Criteria) this;
        }

        public Criteria andRegLevelGreaterThan(String value) {
            addCriterion("regLevel >", value, "regLevel");
            return (Criteria) this;
        }

        public Criteria andRegLevelGreaterThanOrEqualTo(String value) {
            addCriterion("regLevel >=", value, "regLevel");
            return (Criteria) this;
        }

        public Criteria andRegLevelLessThan(String value) {
            addCriterion("regLevel <", value, "regLevel");
            return (Criteria) this;
        }

        public Criteria andRegLevelLessThanOrEqualTo(String value) {
            addCriterion("regLevel <=", value, "regLevel");
            return (Criteria) this;
        }

        public Criteria andRegLevelLike(String value) {
            addCriterion("regLevel like", value, "regLevel");
            return (Criteria) this;
        }

        public Criteria andRegLevelNotLike(String value) {
            addCriterion("regLevel not like", value, "regLevel");
            return (Criteria) this;
        }

        public Criteria andRegLevelIn(List<String> values) {
            addCriterion("regLevel in", values, "regLevel");
            return (Criteria) this;
        }

        public Criteria andRegLevelNotIn(List<String> values) {
            addCriterion("regLevel not in", values, "regLevel");
            return (Criteria) this;
        }

        public Criteria andRegLevelBetween(String value1, String value2) {
            addCriterion("regLevel between", value1, value2, "regLevel");
            return (Criteria) this;
        }

        public Criteria andRegLevelNotBetween(String value1, String value2) {
            addCriterion("regLevel not between", value1, value2, "regLevel");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateIsNull() {
            addCriterion("registrationDate is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateIsNotNull() {
            addCriterion("registrationDate is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateEqualTo(Date value) {
            addCriterion("registrationDate =", value, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateNotEqualTo(Date value) {
            addCriterion("registrationDate <>", value, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateGreaterThan(Date value) {
            addCriterion("registrationDate >", value, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateGreaterThanOrEqualTo(Date value) {
            addCriterion("registrationDate >=", value, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateLessThan(Date value) {
            addCriterion("registrationDate <", value, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateLessThanOrEqualTo(Date value) {
            addCriterion("registrationDate <=", value, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateIn(List<Date> values) {
            addCriterion("registrationDate in", values, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateNotIn(List<Date> values) {
            addCriterion("registrationDate not in", values, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateBetween(Date value1, Date value2) {
            addCriterion("registrationDate between", value1, value2, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateNotBetween(Date value1, Date value2) {
            addCriterion("registrationDate not between", value1, value2, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andSeeDoctorDateIsNull() {
            addCriterion("seeDoctorDate is null");
            return (Criteria) this;
        }

        public Criteria andSeeDoctorDateIsNotNull() {
            addCriterion("seeDoctorDate is not null");
            return (Criteria) this;
        }

        public Criteria andSeeDoctorDateEqualTo(Date value) {
            addCriterionForJDBCDate("seeDoctorDate =", value, "seeDoctorDate");
            return (Criteria) this;
        }

        public Criteria andSeeDoctorDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("seeDoctorDate <>", value, "seeDoctorDate");
            return (Criteria) this;
        }

        public Criteria andSeeDoctorDateGreaterThan(Date value) {
            addCriterionForJDBCDate("seeDoctorDate >", value, "seeDoctorDate");
            return (Criteria) this;
        }

        public Criteria andSeeDoctorDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("seeDoctorDate >=", value, "seeDoctorDate");
            return (Criteria) this;
        }

        public Criteria andSeeDoctorDateLessThan(Date value) {
            addCriterionForJDBCDate("seeDoctorDate <", value, "seeDoctorDate");
            return (Criteria) this;
        }

        public Criteria andSeeDoctorDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("seeDoctorDate <=", value, "seeDoctorDate");
            return (Criteria) this;
        }

        public Criteria andSeeDoctorDateIn(List<Date> values) {
            addCriterionForJDBCDate("seeDoctorDate in", values, "seeDoctorDate");
            return (Criteria) this;
        }

        public Criteria andSeeDoctorDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("seeDoctorDate not in", values, "seeDoctorDate");
            return (Criteria) this;
        }

        public Criteria andSeeDoctorDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("seeDoctorDate between", value1, value2, "seeDoctorDate");
            return (Criteria) this;
        }

        public Criteria andSeeDoctorDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("seeDoctorDate not between", value1, value2, "seeDoctorDate");
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

        public Criteria andDoctorNameIsNull() {
            addCriterion("doctorName is null");
            return (Criteria) this;
        }

        public Criteria andDoctorNameIsNotNull() {
            addCriterion("doctorName is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorNameEqualTo(String value) {
            addCriterion("doctorName =", value, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameNotEqualTo(String value) {
            addCriterion("doctorName <>", value, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameGreaterThan(String value) {
            addCriterion("doctorName >", value, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameGreaterThanOrEqualTo(String value) {
            addCriterion("doctorName >=", value, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameLessThan(String value) {
            addCriterion("doctorName <", value, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameLessThanOrEqualTo(String value) {
            addCriterion("doctorName <=", value, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameLike(String value) {
            addCriterion("doctorName like", value, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameNotLike(String value) {
            addCriterion("doctorName not like", value, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameIn(List<String> values) {
            addCriterion("doctorName in", values, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameNotIn(List<String> values) {
            addCriterion("doctorName not in", values, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameBetween(String value1, String value2) {
            addCriterion("doctorName between", value1, value2, "doctorName");
            return (Criteria) this;
        }

        public Criteria andDoctorNameNotBetween(String value1, String value2) {
            addCriterion("doctorName not between", value1, value2, "doctorName");
            return (Criteria) this;
        }

        public Criteria andRegSourceIsNull() {
            addCriterion("regSource is null");
            return (Criteria) this;
        }

        public Criteria andRegSourceIsNotNull() {
            addCriterion("regSource is not null");
            return (Criteria) this;
        }

        public Criteria andRegSourceEqualTo(String value) {
            addCriterion("regSource =", value, "regSource");
            return (Criteria) this;
        }

        public Criteria andRegSourceNotEqualTo(String value) {
            addCriterion("regSource <>", value, "regSource");
            return (Criteria) this;
        }

        public Criteria andRegSourceGreaterThan(String value) {
            addCriterion("regSource >", value, "regSource");
            return (Criteria) this;
        }

        public Criteria andRegSourceGreaterThanOrEqualTo(String value) {
            addCriterion("regSource >=", value, "regSource");
            return (Criteria) this;
        }

        public Criteria andRegSourceLessThan(String value) {
            addCriterion("regSource <", value, "regSource");
            return (Criteria) this;
        }

        public Criteria andRegSourceLessThanOrEqualTo(String value) {
            addCriterion("regSource <=", value, "regSource");
            return (Criteria) this;
        }

        public Criteria andRegSourceLike(String value) {
            addCriterion("regSource like", value, "regSource");
            return (Criteria) this;
        }

        public Criteria andRegSourceNotLike(String value) {
            addCriterion("regSource not like", value, "regSource");
            return (Criteria) this;
        }

        public Criteria andRegSourceIn(List<String> values) {
            addCriterion("regSource in", values, "regSource");
            return (Criteria) this;
        }

        public Criteria andRegSourceNotIn(List<String> values) {
            addCriterion("regSource not in", values, "regSource");
            return (Criteria) this;
        }

        public Criteria andRegSourceBetween(String value1, String value2) {
            addCriterion("regSource between", value1, value2, "regSource");
            return (Criteria) this;
        }

        public Criteria andRegSourceNotBetween(String value1, String value2) {
            addCriterion("regSource not between", value1, value2, "regSource");
            return (Criteria) this;
        }

        public Criteria andPayCategoryIsNull() {
            addCriterion("payCategory is null");
            return (Criteria) this;
        }

        public Criteria andPayCategoryIsNotNull() {
            addCriterion("payCategory is not null");
            return (Criteria) this;
        }

        public Criteria andPayCategoryEqualTo(String value) {
            addCriterion("payCategory =", value, "payCategory");
            return (Criteria) this;
        }

        public Criteria andPayCategoryNotEqualTo(String value) {
            addCriterion("payCategory <>", value, "payCategory");
            return (Criteria) this;
        }

        public Criteria andPayCategoryGreaterThan(String value) {
            addCriterion("payCategory >", value, "payCategory");
            return (Criteria) this;
        }

        public Criteria andPayCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("payCategory >=", value, "payCategory");
            return (Criteria) this;
        }

        public Criteria andPayCategoryLessThan(String value) {
            addCriterion("payCategory <", value, "payCategory");
            return (Criteria) this;
        }

        public Criteria andPayCategoryLessThanOrEqualTo(String value) {
            addCriterion("payCategory <=", value, "payCategory");
            return (Criteria) this;
        }

        public Criteria andPayCategoryLike(String value) {
            addCriterion("payCategory like", value, "payCategory");
            return (Criteria) this;
        }

        public Criteria andPayCategoryNotLike(String value) {
            addCriterion("payCategory not like", value, "payCategory");
            return (Criteria) this;
        }

        public Criteria andPayCategoryIn(List<String> values) {
            addCriterion("payCategory in", values, "payCategory");
            return (Criteria) this;
        }

        public Criteria andPayCategoryNotIn(List<String> values) {
            addCriterion("payCategory not in", values, "payCategory");
            return (Criteria) this;
        }

        public Criteria andPayCategoryBetween(String value1, String value2) {
            addCriterion("payCategory between", value1, value2, "payCategory");
            return (Criteria) this;
        }

        public Criteria andPayCategoryNotBetween(String value1, String value2) {
            addCriterion("payCategory not between", value1, value2, "payCategory");
            return (Criteria) this;
        }

        public Criteria andIsSeenDoctorIsNull() {
            addCriterion("isSeenDoctor is null");
            return (Criteria) this;
        }

        public Criteria andIsSeenDoctorIsNotNull() {
            addCriterion("isSeenDoctor is not null");
            return (Criteria) this;
        }

        public Criteria andIsSeenDoctorEqualTo(String value) {
            addCriterion("isSeenDoctor =", value, "isSeenDoctor");
            return (Criteria) this;
        }

        public Criteria andIsSeenDoctorNotEqualTo(String value) {
            addCriterion("isSeenDoctor <>", value, "isSeenDoctor");
            return (Criteria) this;
        }

        public Criteria andIsSeenDoctorGreaterThan(String value) {
            addCriterion("isSeenDoctor >", value, "isSeenDoctor");
            return (Criteria) this;
        }

        public Criteria andIsSeenDoctorGreaterThanOrEqualTo(String value) {
            addCriterion("isSeenDoctor >=", value, "isSeenDoctor");
            return (Criteria) this;
        }

        public Criteria andIsSeenDoctorLessThan(String value) {
            addCriterion("isSeenDoctor <", value, "isSeenDoctor");
            return (Criteria) this;
        }

        public Criteria andIsSeenDoctorLessThanOrEqualTo(String value) {
            addCriterion("isSeenDoctor <=", value, "isSeenDoctor");
            return (Criteria) this;
        }

        public Criteria andIsSeenDoctorLike(String value) {
            addCriterion("isSeenDoctor like", value, "isSeenDoctor");
            return (Criteria) this;
        }

        public Criteria andIsSeenDoctorNotLike(String value) {
            addCriterion("isSeenDoctor not like", value, "isSeenDoctor");
            return (Criteria) this;
        }

        public Criteria andIsSeenDoctorIn(List<String> values) {
            addCriterion("isSeenDoctor in", values, "isSeenDoctor");
            return (Criteria) this;
        }

        public Criteria andIsSeenDoctorNotIn(List<String> values) {
            addCriterion("isSeenDoctor not in", values, "isSeenDoctor");
            return (Criteria) this;
        }

        public Criteria andIsSeenDoctorBetween(String value1, String value2) {
            addCriterion("isSeenDoctor between", value1, value2, "isSeenDoctor");
            return (Criteria) this;
        }

        public Criteria andIsSeenDoctorNotBetween(String value1, String value2) {
            addCriterion("isSeenDoctor not between", value1, value2, "isSeenDoctor");
            return (Criteria) this;
        }

        public Criteria andExpenseIsNull() {
            addCriterion("expense is null");
            return (Criteria) this;
        }

        public Criteria andExpenseIsNotNull() {
            addCriterion("expense is not null");
            return (Criteria) this;
        }

        public Criteria andExpenseEqualTo(BigDecimal value) {
            addCriterion("expense =", value, "expense");
            return (Criteria) this;
        }

        public Criteria andExpenseNotEqualTo(BigDecimal value) {
            addCriterion("expense <>", value, "expense");
            return (Criteria) this;
        }

        public Criteria andExpenseGreaterThan(BigDecimal value) {
            addCriterion("expense >", value, "expense");
            return (Criteria) this;
        }

        public Criteria andExpenseGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("expense >=", value, "expense");
            return (Criteria) this;
        }

        public Criteria andExpenseLessThan(BigDecimal value) {
            addCriterion("expense <", value, "expense");
            return (Criteria) this;
        }

        public Criteria andExpenseLessThanOrEqualTo(BigDecimal value) {
            addCriterion("expense <=", value, "expense");
            return (Criteria) this;
        }

        public Criteria andExpenseIn(List<BigDecimal> values) {
            addCriterion("expense in", values, "expense");
            return (Criteria) this;
        }

        public Criteria andExpenseNotIn(List<BigDecimal> values) {
            addCriterion("expense not in", values, "expense");
            return (Criteria) this;
        }

        public Criteria andExpenseBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("expense between", value1, value2, "expense");
            return (Criteria) this;
        }

        public Criteria andExpenseNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("expense not between", value1, value2, "expense");
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

        public Criteria andAppearUserIsNull() {
            addCriterion("appearUser is null");
            return (Criteria) this;
        }

        public Criteria andAppearUserIsNotNull() {
            addCriterion("appearUser is not null");
            return (Criteria) this;
        }

        public Criteria andAppearUserEqualTo(String value) {
            addCriterion("appearUser =", value, "appearUser");
            return (Criteria) this;
        }

        public Criteria andAppearUserNotEqualTo(String value) {
            addCriterion("appearUser <>", value, "appearUser");
            return (Criteria) this;
        }

        public Criteria andAppearUserGreaterThan(String value) {
            addCriterion("appearUser >", value, "appearUser");
            return (Criteria) this;
        }

        public Criteria andAppearUserGreaterThanOrEqualTo(String value) {
            addCriterion("appearUser >=", value, "appearUser");
            return (Criteria) this;
        }

        public Criteria andAppearUserLessThan(String value) {
            addCriterion("appearUser <", value, "appearUser");
            return (Criteria) this;
        }

        public Criteria andAppearUserLessThanOrEqualTo(String value) {
            addCriterion("appearUser <=", value, "appearUser");
            return (Criteria) this;
        }

        public Criteria andAppearUserLike(String value) {
            addCriterion("appearUser like", value, "appearUser");
            return (Criteria) this;
        }

        public Criteria andAppearUserNotLike(String value) {
            addCriterion("appearUser not like", value, "appearUser");
            return (Criteria) this;
        }

        public Criteria andAppearUserIn(List<String> values) {
            addCriterion("appearUser in", values, "appearUser");
            return (Criteria) this;
        }

        public Criteria andAppearUserNotIn(List<String> values) {
            addCriterion("appearUser not in", values, "appearUser");
            return (Criteria) this;
        }

        public Criteria andAppearUserBetween(String value1, String value2) {
            addCriterion("appearUser between", value1, value2, "appearUser");
            return (Criteria) this;
        }

        public Criteria andAppearUserNotBetween(String value1, String value2) {
            addCriterion("appearUser not between", value1, value2, "appearUser");
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