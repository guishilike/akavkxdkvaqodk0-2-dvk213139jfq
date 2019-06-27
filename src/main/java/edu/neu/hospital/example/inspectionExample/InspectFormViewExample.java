package edu.neu.hospital.example.inspectionExample;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InspectFormViewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public InspectFormViewExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause(String inspectionAppearDate_asc) {
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

        public Criteria andInspectionIdIsNull() {
            addCriterion("inspectionId is null");
            return (Criteria) this;
        }

        public Criteria andInspectionIdIsNotNull() {
            addCriterion("inspectionId is not null");
            return (Criteria) this;
        }

        public Criteria andInspectionIdEqualTo(Integer value) {
            addCriterion("inspectionId =", value, "inspectionId");
            return (Criteria) this;
        }

        public Criteria andInspectionIdNotEqualTo(Integer value) {
            addCriterion("inspectionId <>", value, "inspectionId");
            return (Criteria) this;
        }

        public Criteria andInspectionIdGreaterThan(Integer value) {
            addCriterion("inspectionId >", value, "inspectionId");
            return (Criteria) this;
        }

        public Criteria andInspectionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("inspectionId >=", value, "inspectionId");
            return (Criteria) this;
        }

        public Criteria andInspectionIdLessThan(Integer value) {
            addCriterion("inspectionId <", value, "inspectionId");
            return (Criteria) this;
        }

        public Criteria andInspectionIdLessThanOrEqualTo(Integer value) {
            addCriterion("inspectionId <=", value, "inspectionId");
            return (Criteria) this;
        }

        public Criteria andInspectionIdIn(List<Integer> values) {
            addCriterion("inspectionId in", values, "inspectionId");
            return (Criteria) this;
        }

        public Criteria andInspectionIdNotIn(List<Integer> values) {
            addCriterion("inspectionId not in", values, "inspectionId");
            return (Criteria) this;
        }

        public Criteria andInspectionIdBetween(Integer value1, Integer value2) {
            addCriterion("inspectionId between", value1, value2, "inspectionId");
            return (Criteria) this;
        }

        public Criteria andInspectionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("inspectionId not between", value1, value2, "inspectionId");
            return (Criteria) this;
        }

        public Criteria andInspectionAppearDateIsNull() {
            addCriterion("inspectionAppearDate is null");
            return (Criteria) this;
        }

        public Criteria andInspectionAppearDateIsNotNull() {
            addCriterion("inspectionAppearDate is not null");
            return (Criteria) this;
        }

        public Criteria andInspectionAppearDateEqualTo(Date value) {
            addCriterion("inspectionAppearDate =", value, "inspectionAppearDate");
            return (Criteria) this;
        }

        public Criteria andInspectionAppearDateNotEqualTo(Date value) {
            addCriterion("inspectionAppearDate <>", value, "inspectionAppearDate");
            return (Criteria) this;
        }

        public Criteria andInspectionAppearDateGreaterThan(Date value) {
            addCriterion("inspectionAppearDate >", value, "inspectionAppearDate");
            return (Criteria) this;
        }

        public Criteria andInspectionAppearDateGreaterThanOrEqualTo(Date value) {
            addCriterion("inspectionAppearDate >=", value, "inspectionAppearDate");
            return (Criteria) this;
        }

        public Criteria andInspectionAppearDateLessThan(Date value) {
            addCriterion("inspectionAppearDate <", value, "inspectionAppearDate");
            return (Criteria) this;
        }

        public Criteria andInspectionAppearDateLessThanOrEqualTo(Date value) {
            addCriterion("inspectionAppearDate <=", value, "inspectionAppearDate");
            return (Criteria) this;
        }

        public Criteria andInspectionAppearDateIn(List<Date> values) {
            addCriterion("inspectionAppearDate in", values, "inspectionAppearDate");
            return (Criteria) this;
        }

        public Criteria andInspectionAppearDateNotIn(List<Date> values) {
            addCriterion("inspectionAppearDate not in", values, "inspectionAppearDate");
            return (Criteria) this;
        }

        public Criteria andInspectionAppearDateBetween(Date value1, Date value2) {
            addCriterion("inspectionAppearDate between", value1, value2, "inspectionAppearDate");
            return (Criteria) this;
        }

        public Criteria andInspectionAppearDateNotBetween(Date value1, Date value2) {
            addCriterion("inspectionAppearDate not between", value1, value2, "inspectionAppearDate");
            return (Criteria) this;
        }

        public Criteria andFmeditemNameIsNull() {
            addCriterion("fmeditemName is null");
            return (Criteria) this;
        }

        public Criteria andFmeditemNameIsNotNull() {
            addCriterion("fmeditemName is not null");
            return (Criteria) this;
        }

        public Criteria andFmeditemNameEqualTo(String value) {
            addCriterion("fmeditemName =", value, "fmeditemName");
            return (Criteria) this;
        }

        public Criteria andFmeditemNameNotEqualTo(String value) {
            addCriterion("fmeditemName <>", value, "fmeditemName");
            return (Criteria) this;
        }

        public Criteria andFmeditemNameGreaterThan(String value) {
            addCriterion("fmeditemName >", value, "fmeditemName");
            return (Criteria) this;
        }

        public Criteria andFmeditemNameGreaterThanOrEqualTo(String value) {
            addCriterion("fmeditemName >=", value, "fmeditemName");
            return (Criteria) this;
        }

        public Criteria andFmeditemNameLessThan(String value) {
            addCriterion("fmeditemName <", value, "fmeditemName");
            return (Criteria) this;
        }

        public Criteria andFmeditemNameLessThanOrEqualTo(String value) {
            addCriterion("fmeditemName <=", value, "fmeditemName");
            return (Criteria) this;
        }

        public Criteria andFmeditemNameLike(String value) {
            addCriterion("fmeditemName like", value, "fmeditemName");
            return (Criteria) this;
        }

        public Criteria andFmeditemNameNotLike(String value) {
            addCriterion("fmeditemName not like", value, "fmeditemName");
            return (Criteria) this;
        }

        public Criteria andFmeditemNameIn(List<String> values) {
            addCriterion("fmeditemName in", values, "fmeditemName");
            return (Criteria) this;
        }

        public Criteria andFmeditemNameNotIn(List<String> values) {
            addCriterion("fmeditemName not in", values, "fmeditemName");
            return (Criteria) this;
        }

        public Criteria andFmeditemNameBetween(String value1, String value2) {
            addCriterion("fmeditemName between", value1, value2, "fmeditemName");
            return (Criteria) this;
        }

        public Criteria andFmeditemNameNotBetween(String value1, String value2) {
            addCriterion("fmeditemName not between", value1, value2, "fmeditemName");
            return (Criteria) this;
        }

        public Criteria andFmeditemCodeIsNull() {
            addCriterion("fmeditemCode is null");
            return (Criteria) this;
        }

        public Criteria andFmeditemCodeIsNotNull() {
            addCriterion("fmeditemCode is not null");
            return (Criteria) this;
        }

        public Criteria andFmeditemCodeEqualTo(String value) {
            addCriterion("fmeditemCode =", value, "fmeditemCode");
            return (Criteria) this;
        }

        public Criteria andFmeditemCodeNotEqualTo(String value) {
            addCriterion("fmeditemCode <>", value, "fmeditemCode");
            return (Criteria) this;
        }

        public Criteria andFmeditemCodeGreaterThan(String value) {
            addCriterion("fmeditemCode >", value, "fmeditemCode");
            return (Criteria) this;
        }

        public Criteria andFmeditemCodeGreaterThanOrEqualTo(String value) {
            addCriterion("fmeditemCode >=", value, "fmeditemCode");
            return (Criteria) this;
        }

        public Criteria andFmeditemCodeLessThan(String value) {
            addCriterion("fmeditemCode <", value, "fmeditemCode");
            return (Criteria) this;
        }

        public Criteria andFmeditemCodeLessThanOrEqualTo(String value) {
            addCriterion("fmeditemCode <=", value, "fmeditemCode");
            return (Criteria) this;
        }

        public Criteria andFmeditemCodeLike(String value) {
            addCriterion("fmeditemCode like", value, "fmeditemCode");
            return (Criteria) this;
        }

        public Criteria andFmeditemCodeNotLike(String value) {
            addCriterion("fmeditemCode not like", value, "fmeditemCode");
            return (Criteria) this;
        }

        public Criteria andFmeditemCodeIn(List<String> values) {
            addCriterion("fmeditemCode in", values, "fmeditemCode");
            return (Criteria) this;
        }

        public Criteria andFmeditemCodeNotIn(List<String> values) {
            addCriterion("fmeditemCode not in", values, "fmeditemCode");
            return (Criteria) this;
        }

        public Criteria andFmeditemCodeBetween(String value1, String value2) {
            addCriterion("fmeditemCode between", value1, value2, "fmeditemCode");
            return (Criteria) this;
        }

        public Criteria andFmeditemCodeNotBetween(String value1, String value2) {
            addCriterion("fmeditemCode not between", value1, value2, "fmeditemCode");
            return (Criteria) this;
        }

        public Criteria andFmeditemFormatIsNull() {
            addCriterion("fmeditemFormat is null");
            return (Criteria) this;
        }

        public Criteria andFmeditemFormatIsNotNull() {
            addCriterion("fmeditemFormat is not null");
            return (Criteria) this;
        }

        public Criteria andFmeditemFormatEqualTo(String value) {
            addCriterion("fmeditemFormat =", value, "fmeditemFormat");
            return (Criteria) this;
        }

        public Criteria andFmeditemFormatNotEqualTo(String value) {
            addCriterion("fmeditemFormat <>", value, "fmeditemFormat");
            return (Criteria) this;
        }

        public Criteria andFmeditemFormatGreaterThan(String value) {
            addCriterion("fmeditemFormat >", value, "fmeditemFormat");
            return (Criteria) this;
        }

        public Criteria andFmeditemFormatGreaterThanOrEqualTo(String value) {
            addCriterion("fmeditemFormat >=", value, "fmeditemFormat");
            return (Criteria) this;
        }

        public Criteria andFmeditemFormatLessThan(String value) {
            addCriterion("fmeditemFormat <", value, "fmeditemFormat");
            return (Criteria) this;
        }

        public Criteria andFmeditemFormatLessThanOrEqualTo(String value) {
            addCriterion("fmeditemFormat <=", value, "fmeditemFormat");
            return (Criteria) this;
        }

        public Criteria andFmeditemFormatLike(String value) {
            addCriterion("fmeditemFormat like", value, "fmeditemFormat");
            return (Criteria) this;
        }

        public Criteria andFmeditemFormatNotLike(String value) {
            addCriterion("fmeditemFormat not like", value, "fmeditemFormat");
            return (Criteria) this;
        }

        public Criteria andFmeditemFormatIn(List<String> values) {
            addCriterion("fmeditemFormat in", values, "fmeditemFormat");
            return (Criteria) this;
        }

        public Criteria andFmeditemFormatNotIn(List<String> values) {
            addCriterion("fmeditemFormat not in", values, "fmeditemFormat");
            return (Criteria) this;
        }

        public Criteria andFmeditemFormatBetween(String value1, String value2) {
            addCriterion("fmeditemFormat between", value1, value2, "fmeditemFormat");
            return (Criteria) this;
        }

        public Criteria andFmeditemFormatNotBetween(String value1, String value2) {
            addCriterion("fmeditemFormat not between", value1, value2, "fmeditemFormat");
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

        public Criteria andFmeditemMnemonicCodeIsNull() {
            addCriterion("fmeditemMnemonicCode is null");
            return (Criteria) this;
        }

        public Criteria andFmeditemMnemonicCodeIsNotNull() {
            addCriterion("fmeditemMnemonicCode is not null");
            return (Criteria) this;
        }

        public Criteria andFmeditemMnemonicCodeEqualTo(String value) {
            addCriterion("fmeditemMnemonicCode =", value, "fmeditemMnemonicCode");
            return (Criteria) this;
        }

        public Criteria andFmeditemMnemonicCodeNotEqualTo(String value) {
            addCriterion("fmeditemMnemonicCode <>", value, "fmeditemMnemonicCode");
            return (Criteria) this;
        }

        public Criteria andFmeditemMnemonicCodeGreaterThan(String value) {
            addCriterion("fmeditemMnemonicCode >", value, "fmeditemMnemonicCode");
            return (Criteria) this;
        }

        public Criteria andFmeditemMnemonicCodeGreaterThanOrEqualTo(String value) {
            addCriterion("fmeditemMnemonicCode >=", value, "fmeditemMnemonicCode");
            return (Criteria) this;
        }

        public Criteria andFmeditemMnemonicCodeLessThan(String value) {
            addCriterion("fmeditemMnemonicCode <", value, "fmeditemMnemonicCode");
            return (Criteria) this;
        }

        public Criteria andFmeditemMnemonicCodeLessThanOrEqualTo(String value) {
            addCriterion("fmeditemMnemonicCode <=", value, "fmeditemMnemonicCode");
            return (Criteria) this;
        }

        public Criteria andFmeditemMnemonicCodeLike(String value) {
            addCriterion("fmeditemMnemonicCode like", value, "fmeditemMnemonicCode");
            return (Criteria) this;
        }

        public Criteria andFmeditemMnemonicCodeNotLike(String value) {
            addCriterion("fmeditemMnemonicCode not like", value, "fmeditemMnemonicCode");
            return (Criteria) this;
        }

        public Criteria andFmeditemMnemonicCodeIn(List<String> values) {
            addCriterion("fmeditemMnemonicCode in", values, "fmeditemMnemonicCode");
            return (Criteria) this;
        }

        public Criteria andFmeditemMnemonicCodeNotIn(List<String> values) {
            addCriterion("fmeditemMnemonicCode not in", values, "fmeditemMnemonicCode");
            return (Criteria) this;
        }

        public Criteria andFmeditemMnemonicCodeBetween(String value1, String value2) {
            addCriterion("fmeditemMnemonicCode between", value1, value2, "fmeditemMnemonicCode");
            return (Criteria) this;
        }

        public Criteria andFmeditemMnemonicCodeNotBetween(String value1, String value2) {
            addCriterion("fmeditemMnemonicCode not between", value1, value2, "fmeditemMnemonicCode");
            return (Criteria) this;
        }

        public Criteria andDrawmNameIsNull() {
            addCriterion("drawmName is null");
            return (Criteria) this;
        }

        public Criteria andDrawmNameIsNotNull() {
            addCriterion("drawmName is not null");
            return (Criteria) this;
        }

        public Criteria andDrawmNameEqualTo(String value) {
            addCriterion("drawmName =", value, "drawmName");
            return (Criteria) this;
        }

        public Criteria andDrawmNameNotEqualTo(String value) {
            addCriterion("drawmName <>", value, "drawmName");
            return (Criteria) this;
        }

        public Criteria andDrawmNameGreaterThan(String value) {
            addCriterion("drawmName >", value, "drawmName");
            return (Criteria) this;
        }

        public Criteria andDrawmNameGreaterThanOrEqualTo(String value) {
            addCriterion("drawmName >=", value, "drawmName");
            return (Criteria) this;
        }

        public Criteria andDrawmNameLessThan(String value) {
            addCriterion("drawmName <", value, "drawmName");
            return (Criteria) this;
        }

        public Criteria andDrawmNameLessThanOrEqualTo(String value) {
            addCriterion("drawmName <=", value, "drawmName");
            return (Criteria) this;
        }

        public Criteria andDrawmNameLike(String value) {
            addCriterion("drawmName like", value, "drawmName");
            return (Criteria) this;
        }

        public Criteria andDrawmNameNotLike(String value) {
            addCriterion("drawmName not like", value, "drawmName");
            return (Criteria) this;
        }

        public Criteria andDrawmNameIn(List<String> values) {
            addCriterion("drawmName in", values, "drawmName");
            return (Criteria) this;
        }

        public Criteria andDrawmNameNotIn(List<String> values) {
            addCriterion("drawmName not in", values, "drawmName");
            return (Criteria) this;
        }

        public Criteria andDrawmNameBetween(String value1, String value2) {
            addCriterion("drawmName between", value1, value2, "drawmName");
            return (Criteria) this;
        }

        public Criteria andDrawmNameNotBetween(String value1, String value2) {
            addCriterion("drawmName not between", value1, value2, "drawmName");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordIdIsNull() {
            addCriterion("medicalrecordId is null");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordIdIsNotNull() {
            addCriterion("medicalrecordId is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordIdEqualTo(Integer value) {
            addCriterion("medicalrecordId =", value, "medicalrecordId");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordIdNotEqualTo(Integer value) {
            addCriterion("medicalrecordId <>", value, "medicalrecordId");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordIdGreaterThan(Integer value) {
            addCriterion("medicalrecordId >", value, "medicalrecordId");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("medicalrecordId >=", value, "medicalrecordId");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordIdLessThan(Integer value) {
            addCriterion("medicalrecordId <", value, "medicalrecordId");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordIdLessThanOrEqualTo(Integer value) {
            addCriterion("medicalrecordId <=", value, "medicalrecordId");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordIdIn(List<Integer> values) {
            addCriterion("medicalrecordId in", values, "medicalrecordId");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordIdNotIn(List<Integer> values) {
            addCriterion("medicalrecordId not in", values, "medicalrecordId");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordIdBetween(Integer value1, Integer value2) {
            addCriterion("medicalrecordId between", value1, value2, "medicalrecordId");
            return (Criteria) this;
        }

        public Criteria andMedicalrecordIdNotBetween(Integer value1, Integer value2) {
            addCriterion("medicalrecordId not between", value1, value2, "medicalrecordId");
            return (Criteria) this;
        }

        public Criteria andFmeditemIdIsNull() {
            addCriterion("fmeditemId is null");
            return (Criteria) this;
        }

        public Criteria andFmeditemIdIsNotNull() {
            addCriterion("fmeditemId is not null");
            return (Criteria) this;
        }

        public Criteria andFmeditemIdEqualTo(Integer value) {
            addCriterion("fmeditemId =", value, "fmeditemId");
            return (Criteria) this;
        }

        public Criteria andFmeditemIdNotEqualTo(Integer value) {
            addCriterion("fmeditemId <>", value, "fmeditemId");
            return (Criteria) this;
        }

        public Criteria andFmeditemIdGreaterThan(Integer value) {
            addCriterion("fmeditemId >", value, "fmeditemId");
            return (Criteria) this;
        }

        public Criteria andFmeditemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("fmeditemId >=", value, "fmeditemId");
            return (Criteria) this;
        }

        public Criteria andFmeditemIdLessThan(Integer value) {
            addCriterion("fmeditemId <", value, "fmeditemId");
            return (Criteria) this;
        }

        public Criteria andFmeditemIdLessThanOrEqualTo(Integer value) {
            addCriterion("fmeditemId <=", value, "fmeditemId");
            return (Criteria) this;
        }

        public Criteria andFmeditemIdIn(List<Integer> values) {
            addCriterion("fmeditemId in", values, "fmeditemId");
            return (Criteria) this;
        }

        public Criteria andFmeditemIdNotIn(List<Integer> values) {
            addCriterion("fmeditemId not in", values, "fmeditemId");
            return (Criteria) this;
        }

        public Criteria andFmeditemIdBetween(Integer value1, Integer value2) {
            addCriterion("fmeditemId between", value1, value2, "fmeditemId");
            return (Criteria) this;
        }

        public Criteria andFmeditemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("fmeditemId not between", value1, value2, "fmeditemId");
            return (Criteria) this;
        }

        public Criteria andPatientIdIsNull() {
            addCriterion("patientId is null");
            return (Criteria) this;
        }

        public Criteria andPatientIdIsNotNull() {
            addCriterion("patientId is not null");
            return (Criteria) this;
        }

        public Criteria andPatientIdEqualTo(Integer value) {
            addCriterion("patientId =", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdNotEqualTo(Integer value) {
            addCriterion("patientId <>", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdGreaterThan(Integer value) {
            addCriterion("patientId >", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("patientId >=", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdLessThan(Integer value) {
            addCriterion("patientId <", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdLessThanOrEqualTo(Integer value) {
            addCriterion("patientId <=", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdIn(List<Integer> values) {
            addCriterion("patientId in", values, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdNotIn(List<Integer> values) {
            addCriterion("patientId not in", values, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdBetween(Integer value1, Integer value2) {
            addCriterion("patientId between", value1, value2, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdNotBetween(Integer value1, Integer value2) {
            addCriterion("patientId not between", value1, value2, "patientId");
            return (Criteria) this;
        }

        public Criteria andInspectionDetailsIDIsNull() {
            addCriterion("inspectionDetailsID is null");
            return (Criteria) this;
        }

        public Criteria andInspectionDetailsIDIsNotNull() {
            addCriterion("inspectionDetailsID is not null");
            return (Criteria) this;
        }

        public Criteria andInspectionDetailsIDEqualTo(Integer value) {
            addCriterion("inspectionDetailsID =", value, "inspectionDetailsID");
            return (Criteria) this;
        }

        public Criteria andInspectionDetailsIDNotEqualTo(Integer value) {
            addCriterion("inspectionDetailsID <>", value, "inspectionDetailsID");
            return (Criteria) this;
        }

        public Criteria andInspectionDetailsIDGreaterThan(Integer value) {
            addCriterion("inspectionDetailsID >", value, "inspectionDetailsID");
            return (Criteria) this;
        }

        public Criteria andInspectionDetailsIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("inspectionDetailsID >=", value, "inspectionDetailsID");
            return (Criteria) this;
        }

        public Criteria andInspectionDetailsIDLessThan(Integer value) {
            addCriterion("inspectionDetailsID <", value, "inspectionDetailsID");
            return (Criteria) this;
        }

        public Criteria andInspectionDetailsIDLessThanOrEqualTo(Integer value) {
            addCriterion("inspectionDetailsID <=", value, "inspectionDetailsID");
            return (Criteria) this;
        }

        public Criteria andInspectionDetailsIDIn(List<Integer> values) {
            addCriterion("inspectionDetailsID in", values, "inspectionDetailsID");
            return (Criteria) this;
        }

        public Criteria andInspectionDetailsIDNotIn(List<Integer> values) {
            addCriterion("inspectionDetailsID not in", values, "inspectionDetailsID");
            return (Criteria) this;
        }

        public Criteria andInspectionDetailsIDBetween(Integer value1, Integer value2) {
            addCriterion("inspectionDetailsID between", value1, value2, "inspectionDetailsID");
            return (Criteria) this;
        }

        public Criteria andInspectionDetailsIDNotBetween(Integer value1, Integer value2) {
            addCriterion("inspectionDetailsID not between", value1, value2, "inspectionDetailsID");
            return (Criteria) this;
        }

        public Criteria andIsDrawnIsNull() {
            addCriterion("isDrawn is null");
            return (Criteria) this;
        }

        public Criteria andIsDrawnIsNotNull() {
            addCriterion("isDrawn is not null");
            return (Criteria) this;
        }

        public Criteria andIsDrawnEqualTo(Integer value) {
            addCriterion("isDrawn =", value, "isDrawn");
            return (Criteria) this;
        }

        public Criteria andIsDrawnNotEqualTo(Integer value) {
            addCriterion("isDrawn <>", value, "isDrawn");
            return (Criteria) this;
        }

        public Criteria andIsDrawnGreaterThan(Integer value) {
            addCriterion("isDrawn >", value, "isDrawn");
            return (Criteria) this;
        }

        public Criteria andIsDrawnGreaterThanOrEqualTo(Integer value) {
            addCriterion("isDrawn >=", value, "isDrawn");
            return (Criteria) this;
        }

        public Criteria andIsDrawnLessThan(Integer value) {
            addCriterion("isDrawn <", value, "isDrawn");
            return (Criteria) this;
        }

        public Criteria andIsDrawnLessThanOrEqualTo(Integer value) {
            addCriterion("isDrawn <=", value, "isDrawn");
            return (Criteria) this;
        }

        public Criteria andIsDrawnIn(List<Integer> values) {
            addCriterion("isDrawn in", values, "isDrawn");
            return (Criteria) this;
        }

        public Criteria andIsDrawnNotIn(List<Integer> values) {
            addCriterion("isDrawn not in", values, "isDrawn");
            return (Criteria) this;
        }

        public Criteria andIsDrawnBetween(Integer value1, Integer value2) {
            addCriterion("isDrawn between", value1, value2, "isDrawn");
            return (Criteria) this;
        }

        public Criteria andIsDrawnNotBetween(Integer value1, Integer value2) {
            addCriterion("isDrawn not between", value1, value2, "isDrawn");
            return (Criteria) this;
        }

        public Criteria andIsPaidIsNull() {
            addCriterion("isPaid is null");
            return (Criteria) this;
        }

        public Criteria andIsPaidIsNotNull() {
            addCriterion("isPaid is not null");
            return (Criteria) this;
        }

        public Criteria andIsPaidEqualTo(Integer value) {
            addCriterion("isPaid =", value, "isPaid");
            return (Criteria) this;
        }

        public Criteria andIsPaidNotEqualTo(Integer value) {
            addCriterion("isPaid <>", value, "isPaid");
            return (Criteria) this;
        }

        public Criteria andIsPaidGreaterThan(Integer value) {
            addCriterion("isPaid >", value, "isPaid");
            return (Criteria) this;
        }

        public Criteria andIsPaidGreaterThanOrEqualTo(Integer value) {
            addCriterion("isPaid >=", value, "isPaid");
            return (Criteria) this;
        }

        public Criteria andIsPaidLessThan(Integer value) {
            addCriterion("isPaid <", value, "isPaid");
            return (Criteria) this;
        }

        public Criteria andIsPaidLessThanOrEqualTo(Integer value) {
            addCriterion("isPaid <=", value, "isPaid");
            return (Criteria) this;
        }

        public Criteria andIsPaidIn(List<Integer> values) {
            addCriterion("isPaid in", values, "isPaid");
            return (Criteria) this;
        }

        public Criteria andIsPaidNotIn(List<Integer> values) {
            addCriterion("isPaid not in", values, "isPaid");
            return (Criteria) this;
        }

        public Criteria andIsPaidBetween(Integer value1, Integer value2) {
            addCriterion("isPaid between", value1, value2, "isPaid");
            return (Criteria) this;
        }

        public Criteria andIsPaidNotBetween(Integer value1, Integer value2) {
            addCriterion("isPaid not between", value1, value2, "isPaid");
            return (Criteria) this;
        }

        public Criteria andIsCheckedIsNull() {
            addCriterion("isChecked is null");
            return (Criteria) this;
        }

        public Criteria andIsCheckedIsNotNull() {
            addCriterion("isChecked is not null");
            return (Criteria) this;
        }

        public Criteria andIsCheckedEqualTo(Integer value) {
            addCriterion("isChecked =", value, "isChecked");
            return (Criteria) this;
        }

        public Criteria andIsCheckedNotEqualTo(Integer value) {
            addCriterion("isChecked <>", value, "isChecked");
            return (Criteria) this;
        }

        public Criteria andIsCheckedGreaterThan(Integer value) {
            addCriterion("isChecked >", value, "isChecked");
            return (Criteria) this;
        }

        public Criteria andIsCheckedGreaterThanOrEqualTo(Integer value) {
            addCriterion("isChecked >=", value, "isChecked");
            return (Criteria) this;
        }

        public Criteria andIsCheckedLessThan(Integer value) {
            addCriterion("isChecked <", value, "isChecked");
            return (Criteria) this;
        }

        public Criteria andIsCheckedLessThanOrEqualTo(Integer value) {
            addCriterion("isChecked <=", value, "isChecked");
            return (Criteria) this;
        }

        public Criteria andIsCheckedIn(List<Integer> values) {
            addCriterion("isChecked in", values, "isChecked");
            return (Criteria) this;
        }

        public Criteria andIsCheckedNotIn(List<Integer> values) {
            addCriterion("isChecked not in", values, "isChecked");
            return (Criteria) this;
        }

        public Criteria andIsCheckedBetween(Integer value1, Integer value2) {
            addCriterion("isChecked between", value1, value2, "isChecked");
            return (Criteria) this;
        }

        public Criteria andIsCheckedNotBetween(Integer value1, Integer value2) {
            addCriterion("isChecked not between", value1, value2, "isChecked");
            return (Criteria) this;
        }

        public Criteria andIsRegisteredIsNull() {
            addCriterion("isRegistered is null");
            return (Criteria) this;
        }

        public Criteria andIsRegisteredIsNotNull() {
            addCriterion("isRegistered is not null");
            return (Criteria) this;
        }

        public Criteria andIsRegisteredEqualTo(Integer value) {
            addCriterion("isRegistered =", value, "isRegistered");
            return (Criteria) this;
        }

        public Criteria andIsRegisteredNotEqualTo(Integer value) {
            addCriterion("isRegistered <>", value, "isRegistered");
            return (Criteria) this;
        }

        public Criteria andIsRegisteredGreaterThan(Integer value) {
            addCriterion("isRegistered >", value, "isRegistered");
            return (Criteria) this;
        }

        public Criteria andIsRegisteredGreaterThanOrEqualTo(Integer value) {
            addCriterion("isRegistered >=", value, "isRegistered");
            return (Criteria) this;
        }

        public Criteria andIsRegisteredLessThan(Integer value) {
            addCriterion("isRegistered <", value, "isRegistered");
            return (Criteria) this;
        }

        public Criteria andIsRegisteredLessThanOrEqualTo(Integer value) {
            addCriterion("isRegistered <=", value, "isRegistered");
            return (Criteria) this;
        }

        public Criteria andIsRegisteredIn(List<Integer> values) {
            addCriterion("isRegistered in", values, "isRegistered");
            return (Criteria) this;
        }

        public Criteria andIsRegisteredNotIn(List<Integer> values) {
            addCriterion("isRegistered not in", values, "isRegistered");
            return (Criteria) this;
        }

        public Criteria andIsRegisteredBetween(Integer value1, Integer value2) {
            addCriterion("isRegistered between", value1, value2, "isRegistered");
            return (Criteria) this;
        }

        public Criteria andIsRegisteredNotBetween(Integer value1, Integer value2) {
            addCriterion("isRegistered not between", value1, value2, "isRegistered");
            return (Criteria) this;
        }

        public Criteria andIsAbolishedIsNull() {
            addCriterion("isAbolished is null");
            return (Criteria) this;
        }

        public Criteria andIsAbolishedIsNotNull() {
            addCriterion("isAbolished is not null");
            return (Criteria) this;
        }

        public Criteria andIsAbolishedEqualTo(Integer value) {
            addCriterion("isAbolished =", value, "isAbolished");
            return (Criteria) this;
        }

        public Criteria andIsAbolishedNotEqualTo(Integer value) {
            addCriterion("isAbolished <>", value, "isAbolished");
            return (Criteria) this;
        }

        public Criteria andIsAbolishedGreaterThan(Integer value) {
            addCriterion("isAbolished >", value, "isAbolished");
            return (Criteria) this;
        }

        public Criteria andIsAbolishedGreaterThanOrEqualTo(Integer value) {
            addCriterion("isAbolished >=", value, "isAbolished");
            return (Criteria) this;
        }

        public Criteria andIsAbolishedLessThan(Integer value) {
            addCriterion("isAbolished <", value, "isAbolished");
            return (Criteria) this;
        }

        public Criteria andIsAbolishedLessThanOrEqualTo(Integer value) {
            addCriterion("isAbolished <=", value, "isAbolished");
            return (Criteria) this;
        }

        public Criteria andIsAbolishedIn(List<Integer> values) {
            addCriterion("isAbolished in", values, "isAbolished");
            return (Criteria) this;
        }

        public Criteria andIsAbolishedNotIn(List<Integer> values) {
            addCriterion("isAbolished not in", values, "isAbolished");
            return (Criteria) this;
        }

        public Criteria andIsAbolishedBetween(Integer value1, Integer value2) {
            addCriterion("isAbolished between", value1, value2, "isAbolished");
            return (Criteria) this;
        }

        public Criteria andIsAbolishedNotBetween(Integer value1, Integer value2) {
            addCriterion("isAbolished not between", value1, value2, "isAbolished");
            return (Criteria) this;
        }

        public Criteria andIsExecutedIsNull() {
            addCriterion("isExecuted is null");
            return (Criteria) this;
        }

        public Criteria andIsExecutedIsNotNull() {
            addCriterion("isExecuted is not null");
            return (Criteria) this;
        }

        public Criteria andIsExecutedEqualTo(Integer value) {
            addCriterion("isExecuted =", value, "isExecuted");
            return (Criteria) this;
        }

        public Criteria andIsExecutedNotEqualTo(Integer value) {
            addCriterion("isExecuted <>", value, "isExecuted");
            return (Criteria) this;
        }

        public Criteria andIsExecutedGreaterThan(Integer value) {
            addCriterion("isExecuted >", value, "isExecuted");
            return (Criteria) this;
        }

        public Criteria andIsExecutedGreaterThanOrEqualTo(Integer value) {
            addCriterion("isExecuted >=", value, "isExecuted");
            return (Criteria) this;
        }

        public Criteria andIsExecutedLessThan(Integer value) {
            addCriterion("isExecuted <", value, "isExecuted");
            return (Criteria) this;
        }

        public Criteria andIsExecutedLessThanOrEqualTo(Integer value) {
            addCriterion("isExecuted <=", value, "isExecuted");
            return (Criteria) this;
        }

        public Criteria andIsExecutedIn(List<Integer> values) {
            addCriterion("isExecuted in", values, "isExecuted");
            return (Criteria) this;
        }

        public Criteria andIsExecutedNotIn(List<Integer> values) {
            addCriterion("isExecuted not in", values, "isExecuted");
            return (Criteria) this;
        }

        public Criteria andIsExecutedBetween(Integer value1, Integer value2) {
            addCriterion("isExecuted between", value1, value2, "isExecuted");
            return (Criteria) this;
        }

        public Criteria andIsExecutedNotBetween(Integer value1, Integer value2) {
            addCriterion("isExecuted not between", value1, value2, "isExecuted");
            return (Criteria) this;
        }

        public Criteria andPaidNameIsNull() {
            addCriterion("paidName is null");
            return (Criteria) this;
        }

        public Criteria andPaidNameIsNotNull() {
            addCriterion("paidName is not null");
            return (Criteria) this;
        }

        public Criteria andPaidNameEqualTo(String value) {
            addCriterion("paidName =", value, "paidName");
            return (Criteria) this;
        }

        public Criteria andPaidNameNotEqualTo(String value) {
            addCriterion("paidName <>", value, "paidName");
            return (Criteria) this;
        }

        public Criteria andPaidNameGreaterThan(String value) {
            addCriterion("paidName >", value, "paidName");
            return (Criteria) this;
        }

        public Criteria andPaidNameGreaterThanOrEqualTo(String value) {
            addCriterion("paidName >=", value, "paidName");
            return (Criteria) this;
        }

        public Criteria andPaidNameLessThan(String value) {
            addCriterion("paidName <", value, "paidName");
            return (Criteria) this;
        }

        public Criteria andPaidNameLessThanOrEqualTo(String value) {
            addCriterion("paidName <=", value, "paidName");
            return (Criteria) this;
        }

        public Criteria andPaidNameLike(String value) {
            addCriterion("paidName like", value, "paidName");
            return (Criteria) this;
        }

        public Criteria andPaidNameNotLike(String value) {
            addCriterion("paidName not like", value, "paidName");
            return (Criteria) this;
        }

        public Criteria andPaidNameIn(List<String> values) {
            addCriterion("paidName in", values, "paidName");
            return (Criteria) this;
        }

        public Criteria andPaidNameNotIn(List<String> values) {
            addCriterion("paidName not in", values, "paidName");
            return (Criteria) this;
        }

        public Criteria andPaidNameBetween(String value1, String value2) {
            addCriterion("paidName between", value1, value2, "paidName");
            return (Criteria) this;
        }

        public Criteria andPaidNameNotBetween(String value1, String value2) {
            addCriterion("paidName not between", value1, value2, "paidName");
            return (Criteria) this;
        }

        public Criteria andCheckedNameIsNull() {
            addCriterion("checkedName is null");
            return (Criteria) this;
        }

        public Criteria andCheckedNameIsNotNull() {
            addCriterion("checkedName is not null");
            return (Criteria) this;
        }

        public Criteria andCheckedNameEqualTo(String value) {
            addCriterion("checkedName =", value, "checkedName");
            return (Criteria) this;
        }

        public Criteria andCheckedNameNotEqualTo(String value) {
            addCriterion("checkedName <>", value, "checkedName");
            return (Criteria) this;
        }

        public Criteria andCheckedNameGreaterThan(String value) {
            addCriterion("checkedName >", value, "checkedName");
            return (Criteria) this;
        }

        public Criteria andCheckedNameGreaterThanOrEqualTo(String value) {
            addCriterion("checkedName >=", value, "checkedName");
            return (Criteria) this;
        }

        public Criteria andCheckedNameLessThan(String value) {
            addCriterion("checkedName <", value, "checkedName");
            return (Criteria) this;
        }

        public Criteria andCheckedNameLessThanOrEqualTo(String value) {
            addCriterion("checkedName <=", value, "checkedName");
            return (Criteria) this;
        }

        public Criteria andCheckedNameLike(String value) {
            addCriterion("checkedName like", value, "checkedName");
            return (Criteria) this;
        }

        public Criteria andCheckedNameNotLike(String value) {
            addCriterion("checkedName not like", value, "checkedName");
            return (Criteria) this;
        }

        public Criteria andCheckedNameIn(List<String> values) {
            addCriterion("checkedName in", values, "checkedName");
            return (Criteria) this;
        }

        public Criteria andCheckedNameNotIn(List<String> values) {
            addCriterion("checkedName not in", values, "checkedName");
            return (Criteria) this;
        }

        public Criteria andCheckedNameBetween(String value1, String value2) {
            addCriterion("checkedName between", value1, value2, "checkedName");
            return (Criteria) this;
        }

        public Criteria andCheckedNameNotBetween(String value1, String value2) {
            addCriterion("checkedName not between", value1, value2, "checkedName");
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

        public Criteria andAbolishedNameIsNull() {
            addCriterion("abolishedName is null");
            return (Criteria) this;
        }

        public Criteria andAbolishedNameIsNotNull() {
            addCriterion("abolishedName is not null");
            return (Criteria) this;
        }

        public Criteria andAbolishedNameEqualTo(String value) {
            addCriterion("abolishedName =", value, "abolishedName");
            return (Criteria) this;
        }

        public Criteria andAbolishedNameNotEqualTo(String value) {
            addCriterion("abolishedName <>", value, "abolishedName");
            return (Criteria) this;
        }

        public Criteria andAbolishedNameGreaterThan(String value) {
            addCriterion("abolishedName >", value, "abolishedName");
            return (Criteria) this;
        }

        public Criteria andAbolishedNameGreaterThanOrEqualTo(String value) {
            addCriterion("abolishedName >=", value, "abolishedName");
            return (Criteria) this;
        }

        public Criteria andAbolishedNameLessThan(String value) {
            addCriterion("abolishedName <", value, "abolishedName");
            return (Criteria) this;
        }

        public Criteria andAbolishedNameLessThanOrEqualTo(String value) {
            addCriterion("abolishedName <=", value, "abolishedName");
            return (Criteria) this;
        }

        public Criteria andAbolishedNameLike(String value) {
            addCriterion("abolishedName like", value, "abolishedName");
            return (Criteria) this;
        }

        public Criteria andAbolishedNameNotLike(String value) {
            addCriterion("abolishedName not like", value, "abolishedName");
            return (Criteria) this;
        }

        public Criteria andAbolishedNameIn(List<String> values) {
            addCriterion("abolishedName in", values, "abolishedName");
            return (Criteria) this;
        }

        public Criteria andAbolishedNameNotIn(List<String> values) {
            addCriterion("abolishedName not in", values, "abolishedName");
            return (Criteria) this;
        }

        public Criteria andAbolishedNameBetween(String value1, String value2) {
            addCriterion("abolishedName between", value1, value2, "abolishedName");
            return (Criteria) this;
        }

        public Criteria andAbolishedNameNotBetween(String value1, String value2) {
            addCriterion("abolishedName not between", value1, value2, "abolishedName");
            return (Criteria) this;
        }

        public Criteria andExecutedNameIsNull() {
            addCriterion("executedName is null");
            return (Criteria) this;
        }

        public Criteria andExecutedNameIsNotNull() {
            addCriterion("executedName is not null");
            return (Criteria) this;
        }

        public Criteria andExecutedNameEqualTo(String value) {
            addCriterion("executedName =", value, "executedName");
            return (Criteria) this;
        }

        public Criteria andExecutedNameNotEqualTo(String value) {
            addCriterion("executedName <>", value, "executedName");
            return (Criteria) this;
        }

        public Criteria andExecutedNameGreaterThan(String value) {
            addCriterion("executedName >", value, "executedName");
            return (Criteria) this;
        }

        public Criteria andExecutedNameGreaterThanOrEqualTo(String value) {
            addCriterion("executedName >=", value, "executedName");
            return (Criteria) this;
        }

        public Criteria andExecutedNameLessThan(String value) {
            addCriterion("executedName <", value, "executedName");
            return (Criteria) this;
        }

        public Criteria andExecutedNameLessThanOrEqualTo(String value) {
            addCriterion("executedName <=", value, "executedName");
            return (Criteria) this;
        }

        public Criteria andExecutedNameLike(String value) {
            addCriterion("executedName like", value, "executedName");
            return (Criteria) this;
        }

        public Criteria andExecutedNameNotLike(String value) {
            addCriterion("executedName not like", value, "executedName");
            return (Criteria) this;
        }

        public Criteria andExecutedNameIn(List<String> values) {
            addCriterion("executedName in", values, "executedName");
            return (Criteria) this;
        }

        public Criteria andExecutedNameNotIn(List<String> values) {
            addCriterion("executedName not in", values, "executedName");
            return (Criteria) this;
        }

        public Criteria andExecutedNameBetween(String value1, String value2) {
            addCriterion("executedName between", value1, value2, "executedName");
            return (Criteria) this;
        }

        public Criteria andExecutedNameNotBetween(String value1, String value2) {
            addCriterion("executedName not between", value1, value2, "executedName");
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

        public Criteria andNumberIsNull() {
            addCriterion("`number` is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("`number` is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(Integer value) {
            addCriterion("`number` =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(Integer value) {
            addCriterion("`number` <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(Integer value) {
            addCriterion("`number` >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("`number` >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(Integer value) {
            addCriterion("`number` <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(Integer value) {
            addCriterion("`number` <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<Integer> values) {
            addCriterion("`number` in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<Integer> values) {
            addCriterion("`number` not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(Integer value1, Integer value2) {
            addCriterion("`number` between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("`number` not between", value1, value2, "number");
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