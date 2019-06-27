package edu.neu.hospital.example.inspectionExample;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InspectReViewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public InspectReViewExample() {
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

        public Criteria andInspectionAppearUserIDIsNull() {
            addCriterion("inspectionAppearUserID is null");
            return (Criteria) this;
        }

        public Criteria andInspectionAppearUserIDIsNotNull() {
            addCriterion("inspectionAppearUserID is not null");
            return (Criteria) this;
        }

        public Criteria andInspectionAppearUserIDEqualTo(Integer value) {
            addCriterion("inspectionAppearUserID =", value, "inspectionAppearUserID");
            return (Criteria) this;
        }

        public Criteria andInspectionAppearUserIDNotEqualTo(Integer value) {
            addCriterion("inspectionAppearUserID <>", value, "inspectionAppearUserID");
            return (Criteria) this;
        }

        public Criteria andInspectionAppearUserIDGreaterThan(Integer value) {
            addCriterion("inspectionAppearUserID >", value, "inspectionAppearUserID");
            return (Criteria) this;
        }

        public Criteria andInspectionAppearUserIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("inspectionAppearUserID >=", value, "inspectionAppearUserID");
            return (Criteria) this;
        }

        public Criteria andInspectionAppearUserIDLessThan(Integer value) {
            addCriterion("inspectionAppearUserID <", value, "inspectionAppearUserID");
            return (Criteria) this;
        }

        public Criteria andInspectionAppearUserIDLessThanOrEqualTo(Integer value) {
            addCriterion("inspectionAppearUserID <=", value, "inspectionAppearUserID");
            return (Criteria) this;
        }

        public Criteria andInspectionAppearUserIDIn(List<Integer> values) {
            addCriterion("inspectionAppearUserID in", values, "inspectionAppearUserID");
            return (Criteria) this;
        }

        public Criteria andInspectionAppearUserIDNotIn(List<Integer> values) {
            addCriterion("inspectionAppearUserID not in", values, "inspectionAppearUserID");
            return (Criteria) this;
        }

        public Criteria andInspectionAppearUserIDBetween(Integer value1, Integer value2) {
            addCriterion("inspectionAppearUserID between", value1, value2, "inspectionAppearUserID");
            return (Criteria) this;
        }

        public Criteria andInspectionAppearUserIDNotBetween(Integer value1, Integer value2) {
            addCriterion("inspectionAppearUserID not between", value1, value2, "inspectionAppearUserID");
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

        public Criteria andInspectiondetailsIdIsNull() {
            addCriterion("inspectiondetailsId is null");
            return (Criteria) this;
        }

        public Criteria andInspectiondetailsIdIsNotNull() {
            addCriterion("inspectiondetailsId is not null");
            return (Criteria) this;
        }

        public Criteria andInspectiondetailsIdEqualTo(Integer value) {
            addCriterion("inspectiondetailsId =", value, "inspectiondetailsId");
            return (Criteria) this;
        }

        public Criteria andInspectiondetailsIdNotEqualTo(Integer value) {
            addCriterion("inspectiondetailsId <>", value, "inspectiondetailsId");
            return (Criteria) this;
        }

        public Criteria andInspectiondetailsIdGreaterThan(Integer value) {
            addCriterion("inspectiondetailsId >", value, "inspectiondetailsId");
            return (Criteria) this;
        }

        public Criteria andInspectiondetailsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("inspectiondetailsId >=", value, "inspectiondetailsId");
            return (Criteria) this;
        }

        public Criteria andInspectiondetailsIdLessThan(Integer value) {
            addCriterion("inspectiondetailsId <", value, "inspectiondetailsId");
            return (Criteria) this;
        }

        public Criteria andInspectiondetailsIdLessThanOrEqualTo(Integer value) {
            addCriterion("inspectiondetailsId <=", value, "inspectiondetailsId");
            return (Criteria) this;
        }

        public Criteria andInspectiondetailsIdIn(List<Integer> values) {
            addCriterion("inspectiondetailsId in", values, "inspectiondetailsId");
            return (Criteria) this;
        }

        public Criteria andInspectiondetailsIdNotIn(List<Integer> values) {
            addCriterion("inspectiondetailsId not in", values, "inspectiondetailsId");
            return (Criteria) this;
        }

        public Criteria andInspectiondetailsIdBetween(Integer value1, Integer value2) {
            addCriterion("inspectiondetailsId between", value1, value2, "inspectiondetailsId");
            return (Criteria) this;
        }

        public Criteria andInspectiondetailsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("inspectiondetailsId not between", value1, value2, "inspectiondetailsId");
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

        public Criteria andPatientIdentityCardNoIsNull() {
            addCriterion("patientIdentityCardNo is null");
            return (Criteria) this;
        }

        public Criteria andPatientIdentityCardNoIsNotNull() {
            addCriterion("patientIdentityCardNo is not null");
            return (Criteria) this;
        }

        public Criteria andPatientIdentityCardNoEqualTo(String value) {
            addCriterion("patientIdentityCardNo =", value, "patientIdentityCardNo");
            return (Criteria) this;
        }

        public Criteria andPatientIdentityCardNoNotEqualTo(String value) {
            addCriterion("patientIdentityCardNo <>", value, "patientIdentityCardNo");
            return (Criteria) this;
        }

        public Criteria andPatientIdentityCardNoGreaterThan(String value) {
            addCriterion("patientIdentityCardNo >", value, "patientIdentityCardNo");
            return (Criteria) this;
        }

        public Criteria andPatientIdentityCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("patientIdentityCardNo >=", value, "patientIdentityCardNo");
            return (Criteria) this;
        }

        public Criteria andPatientIdentityCardNoLessThan(String value) {
            addCriterion("patientIdentityCardNo <", value, "patientIdentityCardNo");
            return (Criteria) this;
        }

        public Criteria andPatientIdentityCardNoLessThanOrEqualTo(String value) {
            addCriterion("patientIdentityCardNo <=", value, "patientIdentityCardNo");
            return (Criteria) this;
        }

        public Criteria andPatientIdentityCardNoLike(String value) {
            addCriterion("patientIdentityCardNo like", value, "patientIdentityCardNo");
            return (Criteria) this;
        }

        public Criteria andPatientIdentityCardNoNotLike(String value) {
            addCriterion("patientIdentityCardNo not like", value, "patientIdentityCardNo");
            return (Criteria) this;
        }

        public Criteria andPatientIdentityCardNoIn(List<String> values) {
            addCriterion("patientIdentityCardNo in", values, "patientIdentityCardNo");
            return (Criteria) this;
        }

        public Criteria andPatientIdentityCardNoNotIn(List<String> values) {
            addCriterion("patientIdentityCardNo not in", values, "patientIdentityCardNo");
            return (Criteria) this;
        }

        public Criteria andPatientIdentityCardNoBetween(String value1, String value2) {
            addCriterion("patientIdentityCardNo between", value1, value2, "patientIdentityCardNo");
            return (Criteria) this;
        }

        public Criteria andPatientIdentityCardNoNotBetween(String value1, String value2) {
            addCriterion("patientIdentityCardNo not between", value1, value2, "patientIdentityCardNo");
            return (Criteria) this;
        }

        public Criteria andPatientAgeIsNull() {
            addCriterion("patientAge is null");
            return (Criteria) this;
        }

        public Criteria andPatientAgeIsNotNull() {
            addCriterion("patientAge is not null");
            return (Criteria) this;
        }

        public Criteria andPatientAgeEqualTo(Integer value) {
            addCriterion("patientAge =", value, "patientAge");
            return (Criteria) this;
        }

        public Criteria andPatientAgeNotEqualTo(Integer value) {
            addCriterion("patientAge <>", value, "patientAge");
            return (Criteria) this;
        }

        public Criteria andPatientAgeGreaterThan(Integer value) {
            addCriterion("patientAge >", value, "patientAge");
            return (Criteria) this;
        }

        public Criteria andPatientAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("patientAge >=", value, "patientAge");
            return (Criteria) this;
        }

        public Criteria andPatientAgeLessThan(Integer value) {
            addCriterion("patientAge <", value, "patientAge");
            return (Criteria) this;
        }

        public Criteria andPatientAgeLessThanOrEqualTo(Integer value) {
            addCriterion("patientAge <=", value, "patientAge");
            return (Criteria) this;
        }

        public Criteria andPatientAgeIn(List<Integer> values) {
            addCriterion("patientAge in", values, "patientAge");
            return (Criteria) this;
        }

        public Criteria andPatientAgeNotIn(List<Integer> values) {
            addCriterion("patientAge not in", values, "patientAge");
            return (Criteria) this;
        }

        public Criteria andPatientAgeBetween(Integer value1, Integer value2) {
            addCriterion("patientAge between", value1, value2, "patientAge");
            return (Criteria) this;
        }

        public Criteria andPatientAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("patientAge not between", value1, value2, "patientAge");
            return (Criteria) this;
        }

        public Criteria andPatientGenderIsNull() {
            addCriterion("patientGender is null");
            return (Criteria) this;
        }

        public Criteria andPatientGenderIsNotNull() {
            addCriterion("patientGender is not null");
            return (Criteria) this;
        }

        public Criteria andPatientGenderEqualTo(String value) {
            addCriterion("patientGender =", value, "patientGender");
            return (Criteria) this;
        }

        public Criteria andPatientGenderNotEqualTo(String value) {
            addCriterion("patientGender <>", value, "patientGender");
            return (Criteria) this;
        }

        public Criteria andPatientGenderGreaterThan(String value) {
            addCriterion("patientGender >", value, "patientGender");
            return (Criteria) this;
        }

        public Criteria andPatientGenderGreaterThanOrEqualTo(String value) {
            addCriterion("patientGender >=", value, "patientGender");
            return (Criteria) this;
        }

        public Criteria andPatientGenderLessThan(String value) {
            addCriterion("patientGender <", value, "patientGender");
            return (Criteria) this;
        }

        public Criteria andPatientGenderLessThanOrEqualTo(String value) {
            addCriterion("patientGender <=", value, "patientGender");
            return (Criteria) this;
        }

        public Criteria andPatientGenderLike(String value) {
            addCriterion("patientGender like", value, "patientGender");
            return (Criteria) this;
        }

        public Criteria andPatientGenderNotLike(String value) {
            addCriterion("patientGender not like", value, "patientGender");
            return (Criteria) this;
        }

        public Criteria andPatientGenderIn(List<String> values) {
            addCriterion("patientGender in", values, "patientGender");
            return (Criteria) this;
        }

        public Criteria andPatientGenderNotIn(List<String> values) {
            addCriterion("patientGender not in", values, "patientGender");
            return (Criteria) this;
        }

        public Criteria andPatientGenderBetween(String value1, String value2) {
            addCriterion("patientGender between", value1, value2, "patientGender");
            return (Criteria) this;
        }

        public Criteria andPatientGenderNotBetween(String value1, String value2) {
            addCriterion("patientGender not between", value1, value2, "patientGender");
            return (Criteria) this;
        }

        public Criteria andPatientBirthdayIsNull() {
            addCriterion("patientBirthday is null");
            return (Criteria) this;
        }

        public Criteria andPatientBirthdayIsNotNull() {
            addCriterion("patientBirthday is not null");
            return (Criteria) this;
        }

        public Criteria andPatientBirthdayEqualTo(Date value) {
            addCriterion("patientBirthday =", value, "patientBirthday");
            return (Criteria) this;
        }

        public Criteria andPatientBirthdayNotEqualTo(Date value) {
            addCriterion("patientBirthday <>", value, "patientBirthday");
            return (Criteria) this;
        }

        public Criteria andPatientBirthdayGreaterThan(Date value) {
            addCriterion("patientBirthday >", value, "patientBirthday");
            return (Criteria) this;
        }

        public Criteria andPatientBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("patientBirthday >=", value, "patientBirthday");
            return (Criteria) this;
        }

        public Criteria andPatientBirthdayLessThan(Date value) {
            addCriterion("patientBirthday <", value, "patientBirthday");
            return (Criteria) this;
        }

        public Criteria andPatientBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("patientBirthday <=", value, "patientBirthday");
            return (Criteria) this;
        }

        public Criteria andPatientBirthdayIn(List<Date> values) {
            addCriterion("patientBirthday in", values, "patientBirthday");
            return (Criteria) this;
        }

        public Criteria andPatientBirthdayNotIn(List<Date> values) {
            addCriterion("patientBirthday not in", values, "patientBirthday");
            return (Criteria) this;
        }

        public Criteria andPatientBirthdayBetween(Date value1, Date value2) {
            addCriterion("patientBirthday between", value1, value2, "patientBirthday");
            return (Criteria) this;
        }

        public Criteria andPatientBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("patientBirthday not between", value1, value2, "patientBirthday");
            return (Criteria) this;
        }

        public Criteria andPatientFamilyAddressIsNull() {
            addCriterion("patientFamilyAddress is null");
            return (Criteria) this;
        }

        public Criteria andPatientFamilyAddressIsNotNull() {
            addCriterion("patientFamilyAddress is not null");
            return (Criteria) this;
        }

        public Criteria andPatientFamilyAddressEqualTo(String value) {
            addCriterion("patientFamilyAddress =", value, "patientFamilyAddress");
            return (Criteria) this;
        }

        public Criteria andPatientFamilyAddressNotEqualTo(String value) {
            addCriterion("patientFamilyAddress <>", value, "patientFamilyAddress");
            return (Criteria) this;
        }

        public Criteria andPatientFamilyAddressGreaterThan(String value) {
            addCriterion("patientFamilyAddress >", value, "patientFamilyAddress");
            return (Criteria) this;
        }

        public Criteria andPatientFamilyAddressGreaterThanOrEqualTo(String value) {
            addCriterion("patientFamilyAddress >=", value, "patientFamilyAddress");
            return (Criteria) this;
        }

        public Criteria andPatientFamilyAddressLessThan(String value) {
            addCriterion("patientFamilyAddress <", value, "patientFamilyAddress");
            return (Criteria) this;
        }

        public Criteria andPatientFamilyAddressLessThanOrEqualTo(String value) {
            addCriterion("patientFamilyAddress <=", value, "patientFamilyAddress");
            return (Criteria) this;
        }

        public Criteria andPatientFamilyAddressLike(String value) {
            addCriterion("patientFamilyAddress like", value, "patientFamilyAddress");
            return (Criteria) this;
        }

        public Criteria andPatientFamilyAddressNotLike(String value) {
            addCriterion("patientFamilyAddress not like", value, "patientFamilyAddress");
            return (Criteria) this;
        }

        public Criteria andPatientFamilyAddressIn(List<String> values) {
            addCriterion("patientFamilyAddress in", values, "patientFamilyAddress");
            return (Criteria) this;
        }

        public Criteria andPatientFamilyAddressNotIn(List<String> values) {
            addCriterion("patientFamilyAddress not in", values, "patientFamilyAddress");
            return (Criteria) this;
        }

        public Criteria andPatientFamilyAddressBetween(String value1, String value2) {
            addCriterion("patientFamilyAddress between", value1, value2, "patientFamilyAddress");
            return (Criteria) this;
        }

        public Criteria andPatientFamilyAddressNotBetween(String value1, String value2) {
            addCriterion("patientFamilyAddress not between", value1, value2, "patientFamilyAddress");
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

        public Criteria andMedicalrechomeIdIsNull() {
            addCriterion("medicalrechomeId is null");
            return (Criteria) this;
        }

        public Criteria andMedicalrechomeIdIsNotNull() {
            addCriterion("medicalrechomeId is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalrechomeIdEqualTo(Integer value) {
            addCriterion("medicalrechomeId =", value, "medicalrechomeId");
            return (Criteria) this;
        }

        public Criteria andMedicalrechomeIdNotEqualTo(Integer value) {
            addCriterion("medicalrechomeId <>", value, "medicalrechomeId");
            return (Criteria) this;
        }

        public Criteria andMedicalrechomeIdGreaterThan(Integer value) {
            addCriterion("medicalrechomeId >", value, "medicalrechomeId");
            return (Criteria) this;
        }

        public Criteria andMedicalrechomeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("medicalrechomeId >=", value, "medicalrechomeId");
            return (Criteria) this;
        }

        public Criteria andMedicalrechomeIdLessThan(Integer value) {
            addCriterion("medicalrechomeId <", value, "medicalrechomeId");
            return (Criteria) this;
        }

        public Criteria andMedicalrechomeIdLessThanOrEqualTo(Integer value) {
            addCriterion("medicalrechomeId <=", value, "medicalrechomeId");
            return (Criteria) this;
        }

        public Criteria andMedicalrechomeIdIn(List<Integer> values) {
            addCriterion("medicalrechomeId in", values, "medicalrechomeId");
            return (Criteria) this;
        }

        public Criteria andMedicalrechomeIdNotIn(List<Integer> values) {
            addCriterion("medicalrechomeId not in", values, "medicalrechomeId");
            return (Criteria) this;
        }

        public Criteria andMedicalrechomeIdBetween(Integer value1, Integer value2) {
            addCriterion("medicalrechomeId between", value1, value2, "medicalrechomeId");
            return (Criteria) this;
        }

        public Criteria andMedicalrechomeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("medicalrechomeId not between", value1, value2, "medicalrechomeId");
            return (Criteria) this;
        }

        public Criteria andCheifComplaintIsNull() {
            addCriterion("cheifComplaint is null");
            return (Criteria) this;
        }

        public Criteria andCheifComplaintIsNotNull() {
            addCriterion("cheifComplaint is not null");
            return (Criteria) this;
        }

        public Criteria andCheifComplaintEqualTo(String value) {
            addCriterion("cheifComplaint =", value, "cheifComplaint");
            return (Criteria) this;
        }

        public Criteria andCheifComplaintNotEqualTo(String value) {
            addCriterion("cheifComplaint <>", value, "cheifComplaint");
            return (Criteria) this;
        }

        public Criteria andCheifComplaintGreaterThan(String value) {
            addCriterion("cheifComplaint >", value, "cheifComplaint");
            return (Criteria) this;
        }

        public Criteria andCheifComplaintGreaterThanOrEqualTo(String value) {
            addCriterion("cheifComplaint >=", value, "cheifComplaint");
            return (Criteria) this;
        }

        public Criteria andCheifComplaintLessThan(String value) {
            addCriterion("cheifComplaint <", value, "cheifComplaint");
            return (Criteria) this;
        }

        public Criteria andCheifComplaintLessThanOrEqualTo(String value) {
            addCriterion("cheifComplaint <=", value, "cheifComplaint");
            return (Criteria) this;
        }

        public Criteria andCheifComplaintLike(String value) {
            addCriterion("cheifComplaint like", value, "cheifComplaint");
            return (Criteria) this;
        }

        public Criteria andCheifComplaintNotLike(String value) {
            addCriterion("cheifComplaint not like", value, "cheifComplaint");
            return (Criteria) this;
        }

        public Criteria andCheifComplaintIn(List<String> values) {
            addCriterion("cheifComplaint in", values, "cheifComplaint");
            return (Criteria) this;
        }

        public Criteria andCheifComplaintNotIn(List<String> values) {
            addCriterion("cheifComplaint not in", values, "cheifComplaint");
            return (Criteria) this;
        }

        public Criteria andCheifComplaintBetween(String value1, String value2) {
            addCriterion("cheifComplaint between", value1, value2, "cheifComplaint");
            return (Criteria) this;
        }

        public Criteria andCheifComplaintNotBetween(String value1, String value2) {
            addCriterion("cheifComplaint not between", value1, value2, "cheifComplaint");
            return (Criteria) this;
        }

        public Criteria andCurrentMedicalHistoryIsNull() {
            addCriterion("currentMedicalHistory is null");
            return (Criteria) this;
        }

        public Criteria andCurrentMedicalHistoryIsNotNull() {
            addCriterion("currentMedicalHistory is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentMedicalHistoryEqualTo(String value) {
            addCriterion("currentMedicalHistory =", value, "currentMedicalHistory");
            return (Criteria) this;
        }

        public Criteria andCurrentMedicalHistoryNotEqualTo(String value) {
            addCriterion("currentMedicalHistory <>", value, "currentMedicalHistory");
            return (Criteria) this;
        }

        public Criteria andCurrentMedicalHistoryGreaterThan(String value) {
            addCriterion("currentMedicalHistory >", value, "currentMedicalHistory");
            return (Criteria) this;
        }

        public Criteria andCurrentMedicalHistoryGreaterThanOrEqualTo(String value) {
            addCriterion("currentMedicalHistory >=", value, "currentMedicalHistory");
            return (Criteria) this;
        }

        public Criteria andCurrentMedicalHistoryLessThan(String value) {
            addCriterion("currentMedicalHistory <", value, "currentMedicalHistory");
            return (Criteria) this;
        }

        public Criteria andCurrentMedicalHistoryLessThanOrEqualTo(String value) {
            addCriterion("currentMedicalHistory <=", value, "currentMedicalHistory");
            return (Criteria) this;
        }

        public Criteria andCurrentMedicalHistoryLike(String value) {
            addCriterion("currentMedicalHistory like", value, "currentMedicalHistory");
            return (Criteria) this;
        }

        public Criteria andCurrentMedicalHistoryNotLike(String value) {
            addCriterion("currentMedicalHistory not like", value, "currentMedicalHistory");
            return (Criteria) this;
        }

        public Criteria andCurrentMedicalHistoryIn(List<String> values) {
            addCriterion("currentMedicalHistory in", values, "currentMedicalHistory");
            return (Criteria) this;
        }

        public Criteria andCurrentMedicalHistoryNotIn(List<String> values) {
            addCriterion("currentMedicalHistory not in", values, "currentMedicalHistory");
            return (Criteria) this;
        }

        public Criteria andCurrentMedicalHistoryBetween(String value1, String value2) {
            addCriterion("currentMedicalHistory between", value1, value2, "currentMedicalHistory");
            return (Criteria) this;
        }

        public Criteria andCurrentMedicalHistoryNotBetween(String value1, String value2) {
            addCriterion("currentMedicalHistory not between", value1, value2, "currentMedicalHistory");
            return (Criteria) this;
        }

        public Criteria andPastMedicalHistoryIsNull() {
            addCriterion("pastMedicalHistory is null");
            return (Criteria) this;
        }

        public Criteria andPastMedicalHistoryIsNotNull() {
            addCriterion("pastMedicalHistory is not null");
            return (Criteria) this;
        }

        public Criteria andPastMedicalHistoryEqualTo(String value) {
            addCriterion("pastMedicalHistory =", value, "pastMedicalHistory");
            return (Criteria) this;
        }

        public Criteria andPastMedicalHistoryNotEqualTo(String value) {
            addCriterion("pastMedicalHistory <>", value, "pastMedicalHistory");
            return (Criteria) this;
        }

        public Criteria andPastMedicalHistoryGreaterThan(String value) {
            addCriterion("pastMedicalHistory >", value, "pastMedicalHistory");
            return (Criteria) this;
        }

        public Criteria andPastMedicalHistoryGreaterThanOrEqualTo(String value) {
            addCriterion("pastMedicalHistory >=", value, "pastMedicalHistory");
            return (Criteria) this;
        }

        public Criteria andPastMedicalHistoryLessThan(String value) {
            addCriterion("pastMedicalHistory <", value, "pastMedicalHistory");
            return (Criteria) this;
        }

        public Criteria andPastMedicalHistoryLessThanOrEqualTo(String value) {
            addCriterion("pastMedicalHistory <=", value, "pastMedicalHistory");
            return (Criteria) this;
        }

        public Criteria andPastMedicalHistoryLike(String value) {
            addCriterion("pastMedicalHistory like", value, "pastMedicalHistory");
            return (Criteria) this;
        }

        public Criteria andPastMedicalHistoryNotLike(String value) {
            addCriterion("pastMedicalHistory not like", value, "pastMedicalHistory");
            return (Criteria) this;
        }

        public Criteria andPastMedicalHistoryIn(List<String> values) {
            addCriterion("pastMedicalHistory in", values, "pastMedicalHistory");
            return (Criteria) this;
        }

        public Criteria andPastMedicalHistoryNotIn(List<String> values) {
            addCriterion("pastMedicalHistory not in", values, "pastMedicalHistory");
            return (Criteria) this;
        }

        public Criteria andPastMedicalHistoryBetween(String value1, String value2) {
            addCriterion("pastMedicalHistory between", value1, value2, "pastMedicalHistory");
            return (Criteria) this;
        }

        public Criteria andPastMedicalHistoryNotBetween(String value1, String value2) {
            addCriterion("pastMedicalHistory not between", value1, value2, "pastMedicalHistory");
            return (Criteria) this;
        }

        public Criteria andAllergiesIsNull() {
            addCriterion("allergies is null");
            return (Criteria) this;
        }

        public Criteria andAllergiesIsNotNull() {
            addCriterion("allergies is not null");
            return (Criteria) this;
        }

        public Criteria andAllergiesEqualTo(String value) {
            addCriterion("allergies =", value, "allergies");
            return (Criteria) this;
        }

        public Criteria andAllergiesNotEqualTo(String value) {
            addCriterion("allergies <>", value, "allergies");
            return (Criteria) this;
        }

        public Criteria andAllergiesGreaterThan(String value) {
            addCriterion("allergies >", value, "allergies");
            return (Criteria) this;
        }

        public Criteria andAllergiesGreaterThanOrEqualTo(String value) {
            addCriterion("allergies >=", value, "allergies");
            return (Criteria) this;
        }

        public Criteria andAllergiesLessThan(String value) {
            addCriterion("allergies <", value, "allergies");
            return (Criteria) this;
        }

        public Criteria andAllergiesLessThanOrEqualTo(String value) {
            addCriterion("allergies <=", value, "allergies");
            return (Criteria) this;
        }

        public Criteria andAllergiesLike(String value) {
            addCriterion("allergies like", value, "allergies");
            return (Criteria) this;
        }

        public Criteria andAllergiesNotLike(String value) {
            addCriterion("allergies not like", value, "allergies");
            return (Criteria) this;
        }

        public Criteria andAllergiesIn(List<String> values) {
            addCriterion("allergies in", values, "allergies");
            return (Criteria) this;
        }

        public Criteria andAllergiesNotIn(List<String> values) {
            addCriterion("allergies not in", values, "allergies");
            return (Criteria) this;
        }

        public Criteria andAllergiesBetween(String value1, String value2) {
            addCriterion("allergies between", value1, value2, "allergies");
            return (Criteria) this;
        }

        public Criteria andAllergiesNotBetween(String value1, String value2) {
            addCriterion("allergies not between", value1, value2, "allergies");
            return (Criteria) this;
        }

        public Criteria andDrawnNameIsNull() {
            addCriterion("DrawnName is null");
            return (Criteria) this;
        }

        public Criteria andDrawnNameIsNotNull() {
            addCriterion("DrawnName is not null");
            return (Criteria) this;
        }

        public Criteria andDrawnNameEqualTo(String value) {
            addCriterion("DrawnName =", value, "drawnName");
            return (Criteria) this;
        }

        public Criteria andDrawnNameNotEqualTo(String value) {
            addCriterion("DrawnName <>", value, "drawnName");
            return (Criteria) this;
        }

        public Criteria andDrawnNameGreaterThan(String value) {
            addCriterion("DrawnName >", value, "drawnName");
            return (Criteria) this;
        }

        public Criteria andDrawnNameGreaterThanOrEqualTo(String value) {
            addCriterion("DrawnName >=", value, "drawnName");
            return (Criteria) this;
        }

        public Criteria andDrawnNameLessThan(String value) {
            addCriterion("DrawnName <", value, "drawnName");
            return (Criteria) this;
        }

        public Criteria andDrawnNameLessThanOrEqualTo(String value) {
            addCriterion("DrawnName <=", value, "drawnName");
            return (Criteria) this;
        }

        public Criteria andDrawnNameLike(String value) {
            addCriterion("DrawnName like", value, "drawnName");
            return (Criteria) this;
        }

        public Criteria andDrawnNameNotLike(String value) {
            addCriterion("DrawnName not like", value, "drawnName");
            return (Criteria) this;
        }

        public Criteria andDrawnNameIn(List<String> values) {
            addCriterion("DrawnName in", values, "drawnName");
            return (Criteria) this;
        }

        public Criteria andDrawnNameNotIn(List<String> values) {
            addCriterion("DrawnName not in", values, "drawnName");
            return (Criteria) this;
        }

        public Criteria andDrawnNameBetween(String value1, String value2) {
            addCriterion("DrawnName between", value1, value2, "drawnName");
            return (Criteria) this;
        }

        public Criteria andDrawnNameNotBetween(String value1, String value2) {
            addCriterion("DrawnName not between", value1, value2, "drawnName");
            return (Criteria) this;
        }

        public Criteria andPaidNameIsNull() {
            addCriterion("PaidName is null");
            return (Criteria) this;
        }

        public Criteria andPaidNameIsNotNull() {
            addCriterion("PaidName is not null");
            return (Criteria) this;
        }

        public Criteria andPaidNameEqualTo(String value) {
            addCriterion("PaidName =", value, "paidName");
            return (Criteria) this;
        }

        public Criteria andPaidNameNotEqualTo(String value) {
            addCriterion("PaidName <>", value, "paidName");
            return (Criteria) this;
        }

        public Criteria andPaidNameGreaterThan(String value) {
            addCriterion("PaidName >", value, "paidName");
            return (Criteria) this;
        }

        public Criteria andPaidNameGreaterThanOrEqualTo(String value) {
            addCriterion("PaidName >=", value, "paidName");
            return (Criteria) this;
        }

        public Criteria andPaidNameLessThan(String value) {
            addCriterion("PaidName <", value, "paidName");
            return (Criteria) this;
        }

        public Criteria andPaidNameLessThanOrEqualTo(String value) {
            addCriterion("PaidName <=", value, "paidName");
            return (Criteria) this;
        }

        public Criteria andPaidNameLike(String value) {
            addCriterion("PaidName like", value, "paidName");
            return (Criteria) this;
        }

        public Criteria andPaidNameNotLike(String value) {
            addCriterion("PaidName not like", value, "paidName");
            return (Criteria) this;
        }

        public Criteria andPaidNameIn(List<String> values) {
            addCriterion("PaidName in", values, "paidName");
            return (Criteria) this;
        }

        public Criteria andPaidNameNotIn(List<String> values) {
            addCriterion("PaidName not in", values, "paidName");
            return (Criteria) this;
        }

        public Criteria andPaidNameBetween(String value1, String value2) {
            addCriterion("PaidName between", value1, value2, "paidName");
            return (Criteria) this;
        }

        public Criteria andPaidNameNotBetween(String value1, String value2) {
            addCriterion("PaidName not between", value1, value2, "paidName");
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

        public Criteria andCurrentTreatmentSituationIsNull() {
            addCriterion("currentTreatmentSituation is null");
            return (Criteria) this;
        }

        public Criteria andCurrentTreatmentSituationIsNotNull() {
            addCriterion("currentTreatmentSituation is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentTreatmentSituationEqualTo(String value) {
            addCriterion("currentTreatmentSituation =", value, "currentTreatmentSituation");
            return (Criteria) this;
        }

        public Criteria andCurrentTreatmentSituationNotEqualTo(String value) {
            addCriterion("currentTreatmentSituation <>", value, "currentTreatmentSituation");
            return (Criteria) this;
        }

        public Criteria andCurrentTreatmentSituationGreaterThan(String value) {
            addCriterion("currentTreatmentSituation >", value, "currentTreatmentSituation");
            return (Criteria) this;
        }

        public Criteria andCurrentTreatmentSituationGreaterThanOrEqualTo(String value) {
            addCriterion("currentTreatmentSituation >=", value, "currentTreatmentSituation");
            return (Criteria) this;
        }

        public Criteria andCurrentTreatmentSituationLessThan(String value) {
            addCriterion("currentTreatmentSituation <", value, "currentTreatmentSituation");
            return (Criteria) this;
        }

        public Criteria andCurrentTreatmentSituationLessThanOrEqualTo(String value) {
            addCriterion("currentTreatmentSituation <=", value, "currentTreatmentSituation");
            return (Criteria) this;
        }

        public Criteria andCurrentTreatmentSituationLike(String value) {
            addCriterion("currentTreatmentSituation like", value, "currentTreatmentSituation");
            return (Criteria) this;
        }

        public Criteria andCurrentTreatmentSituationNotLike(String value) {
            addCriterion("currentTreatmentSituation not like", value, "currentTreatmentSituation");
            return (Criteria) this;
        }

        public Criteria andCurrentTreatmentSituationIn(List<String> values) {
            addCriterion("currentTreatmentSituation in", values, "currentTreatmentSituation");
            return (Criteria) this;
        }

        public Criteria andCurrentTreatmentSituationNotIn(List<String> values) {
            addCriterion("currentTreatmentSituation not in", values, "currentTreatmentSituation");
            return (Criteria) this;
        }

        public Criteria andCurrentTreatmentSituationBetween(String value1, String value2) {
            addCriterion("currentTreatmentSituation between", value1, value2, "currentTreatmentSituation");
            return (Criteria) this;
        }

        public Criteria andCurrentTreatmentSituationNotBetween(String value1, String value2) {
            addCriterion("currentTreatmentSituation not between", value1, value2, "currentTreatmentSituation");
            return (Criteria) this;
        }

        public Criteria andPhysicalExaminationIsNull() {
            addCriterion("physicalExamination is null");
            return (Criteria) this;
        }

        public Criteria andPhysicalExaminationIsNotNull() {
            addCriterion("physicalExamination is not null");
            return (Criteria) this;
        }

        public Criteria andPhysicalExaminationEqualTo(String value) {
            addCriterion("physicalExamination =", value, "physicalExamination");
            return (Criteria) this;
        }

        public Criteria andPhysicalExaminationNotEqualTo(String value) {
            addCriterion("physicalExamination <>", value, "physicalExamination");
            return (Criteria) this;
        }

        public Criteria andPhysicalExaminationGreaterThan(String value) {
            addCriterion("physicalExamination >", value, "physicalExamination");
            return (Criteria) this;
        }

        public Criteria andPhysicalExaminationGreaterThanOrEqualTo(String value) {
            addCriterion("physicalExamination >=", value, "physicalExamination");
            return (Criteria) this;
        }

        public Criteria andPhysicalExaminationLessThan(String value) {
            addCriterion("physicalExamination <", value, "physicalExamination");
            return (Criteria) this;
        }

        public Criteria andPhysicalExaminationLessThanOrEqualTo(String value) {
            addCriterion("physicalExamination <=", value, "physicalExamination");
            return (Criteria) this;
        }

        public Criteria andPhysicalExaminationLike(String value) {
            addCriterion("physicalExamination like", value, "physicalExamination");
            return (Criteria) this;
        }

        public Criteria andPhysicalExaminationNotLike(String value) {
            addCriterion("physicalExamination not like", value, "physicalExamination");
            return (Criteria) this;
        }

        public Criteria andPhysicalExaminationIn(List<String> values) {
            addCriterion("physicalExamination in", values, "physicalExamination");
            return (Criteria) this;
        }

        public Criteria andPhysicalExaminationNotIn(List<String> values) {
            addCriterion("physicalExamination not in", values, "physicalExamination");
            return (Criteria) this;
        }

        public Criteria andPhysicalExaminationBetween(String value1, String value2) {
            addCriterion("physicalExamination between", value1, value2, "physicalExamination");
            return (Criteria) this;
        }

        public Criteria andPhysicalExaminationNotBetween(String value1, String value2) {
            addCriterion("physicalExamination not between", value1, value2, "physicalExamination");
            return (Criteria) this;
        }

        public Criteria andInitialDiagnosisIsNull() {
            addCriterion("initialDiagnosis is null");
            return (Criteria) this;
        }

        public Criteria andInitialDiagnosisIsNotNull() {
            addCriterion("initialDiagnosis is not null");
            return (Criteria) this;
        }

        public Criteria andInitialDiagnosisEqualTo(String value) {
            addCriterion("initialDiagnosis =", value, "initialDiagnosis");
            return (Criteria) this;
        }

        public Criteria andInitialDiagnosisNotEqualTo(String value) {
            addCriterion("initialDiagnosis <>", value, "initialDiagnosis");
            return (Criteria) this;
        }

        public Criteria andInitialDiagnosisGreaterThan(String value) {
            addCriterion("initialDiagnosis >", value, "initialDiagnosis");
            return (Criteria) this;
        }

        public Criteria andInitialDiagnosisGreaterThanOrEqualTo(String value) {
            addCriterion("initialDiagnosis >=", value, "initialDiagnosis");
            return (Criteria) this;
        }

        public Criteria andInitialDiagnosisLessThan(String value) {
            addCriterion("initialDiagnosis <", value, "initialDiagnosis");
            return (Criteria) this;
        }

        public Criteria andInitialDiagnosisLessThanOrEqualTo(String value) {
            addCriterion("initialDiagnosis <=", value, "initialDiagnosis");
            return (Criteria) this;
        }

        public Criteria andInitialDiagnosisLike(String value) {
            addCriterion("initialDiagnosis like", value, "initialDiagnosis");
            return (Criteria) this;
        }

        public Criteria andInitialDiagnosisNotLike(String value) {
            addCriterion("initialDiagnosis not like", value, "initialDiagnosis");
            return (Criteria) this;
        }

        public Criteria andInitialDiagnosisIn(List<String> values) {
            addCriterion("initialDiagnosis in", values, "initialDiagnosis");
            return (Criteria) this;
        }

        public Criteria andInitialDiagnosisNotIn(List<String> values) {
            addCriterion("initialDiagnosis not in", values, "initialDiagnosis");
            return (Criteria) this;
        }

        public Criteria andInitialDiagnosisBetween(String value1, String value2) {
            addCriterion("initialDiagnosis between", value1, value2, "initialDiagnosis");
            return (Criteria) this;
        }

        public Criteria andInitialDiagnosisNotBetween(String value1, String value2) {
            addCriterion("initialDiagnosis not between", value1, value2, "initialDiagnosis");
            return (Criteria) this;
        }

        public Criteria andInspectRecommendIsNull() {
            addCriterion("inspectRecommend is null");
            return (Criteria) this;
        }

        public Criteria andInspectRecommendIsNotNull() {
            addCriterion("inspectRecommend is not null");
            return (Criteria) this;
        }

        public Criteria andInspectRecommendEqualTo(String value) {
            addCriterion("inspectRecommend =", value, "inspectRecommend");
            return (Criteria) this;
        }

        public Criteria andInspectRecommendNotEqualTo(String value) {
            addCriterion("inspectRecommend <>", value, "inspectRecommend");
            return (Criteria) this;
        }

        public Criteria andInspectRecommendGreaterThan(String value) {
            addCriterion("inspectRecommend >", value, "inspectRecommend");
            return (Criteria) this;
        }

        public Criteria andInspectRecommendGreaterThanOrEqualTo(String value) {
            addCriterion("inspectRecommend >=", value, "inspectRecommend");
            return (Criteria) this;
        }

        public Criteria andInspectRecommendLessThan(String value) {
            addCriterion("inspectRecommend <", value, "inspectRecommend");
            return (Criteria) this;
        }

        public Criteria andInspectRecommendLessThanOrEqualTo(String value) {
            addCriterion("inspectRecommend <=", value, "inspectRecommend");
            return (Criteria) this;
        }

        public Criteria andInspectRecommendLike(String value) {
            addCriterion("inspectRecommend like", value, "inspectRecommend");
            return (Criteria) this;
        }

        public Criteria andInspectRecommendNotLike(String value) {
            addCriterion("inspectRecommend not like", value, "inspectRecommend");
            return (Criteria) this;
        }

        public Criteria andInspectRecommendIn(List<String> values) {
            addCriterion("inspectRecommend in", values, "inspectRecommend");
            return (Criteria) this;
        }

        public Criteria andInspectRecommendNotIn(List<String> values) {
            addCriterion("inspectRecommend not in", values, "inspectRecommend");
            return (Criteria) this;
        }

        public Criteria andInspectRecommendBetween(String value1, String value2) {
            addCriterion("inspectRecommend between", value1, value2, "inspectRecommend");
            return (Criteria) this;
        }

        public Criteria andInspectRecommendNotBetween(String value1, String value2) {
            addCriterion("inspectRecommend not between", value1, value2, "inspectRecommend");
            return (Criteria) this;
        }

        public Criteria andAttentionIsNull() {
            addCriterion("attention is null");
            return (Criteria) this;
        }

        public Criteria andAttentionIsNotNull() {
            addCriterion("attention is not null");
            return (Criteria) this;
        }

        public Criteria andAttentionEqualTo(String value) {
            addCriterion("attention =", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionNotEqualTo(String value) {
            addCriterion("attention <>", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionGreaterThan(String value) {
            addCriterion("attention >", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionGreaterThanOrEqualTo(String value) {
            addCriterion("attention >=", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionLessThan(String value) {
            addCriterion("attention <", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionLessThanOrEqualTo(String value) {
            addCriterion("attention <=", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionLike(String value) {
            addCriterion("attention like", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionNotLike(String value) {
            addCriterion("attention not like", value, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionIn(List<String> values) {
            addCriterion("attention in", values, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionNotIn(List<String> values) {
            addCriterion("attention not in", values, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionBetween(String value1, String value2) {
            addCriterion("attention between", value1, value2, "attention");
            return (Criteria) this;
        }

        public Criteria andAttentionNotBetween(String value1, String value2) {
            addCriterion("attention not between", value1, value2, "attention");
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