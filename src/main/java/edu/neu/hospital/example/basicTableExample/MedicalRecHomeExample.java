package edu.neu.hospital.example.basicTableExample;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MedicalRecHomeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public MedicalRecHomeExample() {
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

        public Criteria andMedicalRecIdIsNull() {
            addCriterion("medicalRecId is null");
            return (Criteria) this;
        }

        public Criteria andMedicalRecIdIsNotNull() {
            addCriterion("medicalRecId is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalRecIdEqualTo(Integer value) {
            addCriterion("medicalRecId =", value, "medicalRecId");
            return (Criteria) this;
        }

        public Criteria andMedicalRecIdNotEqualTo(Integer value) {
            addCriterion("medicalRecId <>", value, "medicalRecId");
            return (Criteria) this;
        }

        public Criteria andMedicalRecIdGreaterThan(Integer value) {
            addCriterion("medicalRecId >", value, "medicalRecId");
            return (Criteria) this;
        }

        public Criteria andMedicalRecIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("medicalRecId >=", value, "medicalRecId");
            return (Criteria) this;
        }

        public Criteria andMedicalRecIdLessThan(Integer value) {
            addCriterion("medicalRecId <", value, "medicalRecId");
            return (Criteria) this;
        }

        public Criteria andMedicalRecIdLessThanOrEqualTo(Integer value) {
            addCriterion("medicalRecId <=", value, "medicalRecId");
            return (Criteria) this;
        }

        public Criteria andMedicalRecIdIn(List<Integer> values) {
            addCriterion("medicalRecId in", values, "medicalRecId");
            return (Criteria) this;
        }

        public Criteria andMedicalRecIdNotIn(List<Integer> values) {
            addCriterion("medicalRecId not in", values, "medicalRecId");
            return (Criteria) this;
        }

        public Criteria andMedicalRecIdBetween(Integer value1, Integer value2) {
            addCriterion("medicalRecId between", value1, value2, "medicalRecId");
            return (Criteria) this;
        }

        public Criteria andMedicalRecIdNotBetween(Integer value1, Integer value2) {
            addCriterion("medicalRecId not between", value1, value2, "medicalRecId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdIsNull() {
            addCriterion("doctorId is null");
            return (Criteria) this;
        }

        public Criteria andDoctorIdIsNotNull() {
            addCriterion("doctorId is not null");
            return (Criteria) this;
        }

        public Criteria andDoctorIdEqualTo(Integer value) {
            addCriterion("doctorId =", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdNotEqualTo(Integer value) {
            addCriterion("doctorId <>", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdGreaterThan(Integer value) {
            addCriterion("doctorId >", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("doctorId >=", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdLessThan(Integer value) {
            addCriterion("doctorId <", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdLessThanOrEqualTo(Integer value) {
            addCriterion("doctorId <=", value, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdIn(List<Integer> values) {
            addCriterion("doctorId in", values, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdNotIn(List<Integer> values) {
            addCriterion("doctorId not in", values, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdBetween(Integer value1, Integer value2) {
            addCriterion("doctorId between", value1, value2, "doctorId");
            return (Criteria) this;
        }

        public Criteria andDoctorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("doctorId not between", value1, value2, "doctorId");
            return (Criteria) this;
        }

        public Criteria andChiefComplaintIsNull() {
            addCriterion("chiefComplaint is null");
            return (Criteria) this;
        }

        public Criteria andChiefComplaintIsNotNull() {
            addCriterion("chiefComplaint is not null");
            return (Criteria) this;
        }

        public Criteria andChiefComplaintEqualTo(String value) {
            addCriterion("chiefComplaint =", value, "chiefComplaint");
            return (Criteria) this;
        }

        public Criteria andChiefComplaintNotEqualTo(String value) {
            addCriterion("chiefComplaint <>", value, "chiefComplaint");
            return (Criteria) this;
        }

        public Criteria andChiefComplaintGreaterThan(String value) {
            addCriterion("chiefComplaint >", value, "chiefComplaint");
            return (Criteria) this;
        }

        public Criteria andChiefComplaintGreaterThanOrEqualTo(String value) {
            addCriterion("chiefComplaint >=", value, "chiefComplaint");
            return (Criteria) this;
        }

        public Criteria andChiefComplaintLessThan(String value) {
            addCriterion("chiefComplaint <", value, "chiefComplaint");
            return (Criteria) this;
        }

        public Criteria andChiefComplaintLessThanOrEqualTo(String value) {
            addCriterion("chiefComplaint <=", value, "chiefComplaint");
            return (Criteria) this;
        }

        public Criteria andChiefComplaintLike(String value) {
            addCriterion("chiefComplaint like", value, "chiefComplaint");
            return (Criteria) this;
        }

        public Criteria andChiefComplaintNotLike(String value) {
            addCriterion("chiefComplaint not like", value, "chiefComplaint");
            return (Criteria) this;
        }

        public Criteria andChiefComplaintIn(List<String> values) {
            addCriterion("chiefComplaint in", values, "chiefComplaint");
            return (Criteria) this;
        }

        public Criteria andChiefComplaintNotIn(List<String> values) {
            addCriterion("chiefComplaint not in", values, "chiefComplaint");
            return (Criteria) this;
        }

        public Criteria andChiefComplaintBetween(String value1, String value2) {
            addCriterion("chiefComplaint between", value1, value2, "chiefComplaint");
            return (Criteria) this;
        }

        public Criteria andChiefComplaintNotBetween(String value1, String value2) {
            addCriterion("chiefComplaint not between", value1, value2, "chiefComplaint");
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

        public Criteria andInitialDiagnosisTypeIsNull() {
            addCriterion("initialDiagnosisType is null");
            return (Criteria) this;
        }

        public Criteria andInitialDiagnosisTypeIsNotNull() {
            addCriterion("initialDiagnosisType is not null");
            return (Criteria) this;
        }

        public Criteria andInitialDiagnosisTypeEqualTo(String value) {
            addCriterion("initialDiagnosisType =", value, "initialDiagnosisType");
            return (Criteria) this;
        }

        public Criteria andInitialDiagnosisTypeNotEqualTo(String value) {
            addCriterion("initialDiagnosisType <>", value, "initialDiagnosisType");
            return (Criteria) this;
        }

        public Criteria andInitialDiagnosisTypeGreaterThan(String value) {
            addCriterion("initialDiagnosisType >", value, "initialDiagnosisType");
            return (Criteria) this;
        }

        public Criteria andInitialDiagnosisTypeGreaterThanOrEqualTo(String value) {
            addCriterion("initialDiagnosisType >=", value, "initialDiagnosisType");
            return (Criteria) this;
        }

        public Criteria andInitialDiagnosisTypeLessThan(String value) {
            addCriterion("initialDiagnosisType <", value, "initialDiagnosisType");
            return (Criteria) this;
        }

        public Criteria andInitialDiagnosisTypeLessThanOrEqualTo(String value) {
            addCriterion("initialDiagnosisType <=", value, "initialDiagnosisType");
            return (Criteria) this;
        }

        public Criteria andInitialDiagnosisTypeLike(String value) {
            addCriterion("initialDiagnosisType like", value, "initialDiagnosisType");
            return (Criteria) this;
        }

        public Criteria andInitialDiagnosisTypeNotLike(String value) {
            addCriterion("initialDiagnosisType not like", value, "initialDiagnosisType");
            return (Criteria) this;
        }

        public Criteria andInitialDiagnosisTypeIn(List<String> values) {
            addCriterion("initialDiagnosisType in", values, "initialDiagnosisType");
            return (Criteria) this;
        }

        public Criteria andInitialDiagnosisTypeNotIn(List<String> values) {
            addCriterion("initialDiagnosisType not in", values, "initialDiagnosisType");
            return (Criteria) this;
        }

        public Criteria andInitialDiagnosisTypeBetween(String value1, String value2) {
            addCriterion("initialDiagnosisType between", value1, value2, "initialDiagnosisType");
            return (Criteria) this;
        }

        public Criteria andInitialDiagnosisTypeNotBetween(String value1, String value2) {
            addCriterion("initialDiagnosisType not between", value1, value2, "initialDiagnosisType");
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