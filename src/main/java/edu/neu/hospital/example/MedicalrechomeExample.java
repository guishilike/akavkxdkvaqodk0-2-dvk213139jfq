package edu.neu.hospital.example;

import java.util.ArrayList;
import java.util.List;

public class MedicalrechomeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public MedicalrechomeExample() {
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

        public Criteria andMedicalrecidIsNull() {
            addCriterion("medicalRecId is null");
            return (Criteria) this;
        }

        public Criteria andMedicalrecidIsNotNull() {
            addCriterion("medicalRecId is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalrecidEqualTo(Integer value) {
            addCriterion("medicalRecId =", value, "medicalrecid");
            return (Criteria) this;
        }

        public Criteria andMedicalrecidNotEqualTo(Integer value) {
            addCriterion("medicalRecId <>", value, "medicalrecid");
            return (Criteria) this;
        }

        public Criteria andMedicalrecidGreaterThan(Integer value) {
            addCriterion("medicalRecId >", value, "medicalrecid");
            return (Criteria) this;
        }

        public Criteria andMedicalrecidGreaterThanOrEqualTo(Integer value) {
            addCriterion("medicalRecId >=", value, "medicalrecid");
            return (Criteria) this;
        }

        public Criteria andMedicalrecidLessThan(Integer value) {
            addCriterion("medicalRecId <", value, "medicalrecid");
            return (Criteria) this;
        }

        public Criteria andMedicalrecidLessThanOrEqualTo(Integer value) {
            addCriterion("medicalRecId <=", value, "medicalrecid");
            return (Criteria) this;
        }

        public Criteria andMedicalrecidIn(List<Integer> values) {
            addCriterion("medicalRecId in", values, "medicalrecid");
            return (Criteria) this;
        }

        public Criteria andMedicalrecidNotIn(List<Integer> values) {
            addCriterion("medicalRecId not in", values, "medicalrecid");
            return (Criteria) this;
        }

        public Criteria andMedicalrecidBetween(Integer value1, Integer value2) {
            addCriterion("medicalRecId between", value1, value2, "medicalrecid");
            return (Criteria) this;
        }

        public Criteria andMedicalrecidNotBetween(Integer value1, Integer value2) {
            addCriterion("medicalRecId not between", value1, value2, "medicalrecid");
            return (Criteria) this;
        }

        public Criteria andDoctoridIsNull() {
            addCriterion("doctorId is null");
            return (Criteria) this;
        }

        public Criteria andDoctoridIsNotNull() {
            addCriterion("doctorId is not null");
            return (Criteria) this;
        }

        public Criteria andDoctoridEqualTo(Integer value) {
            addCriterion("doctorId =", value, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridNotEqualTo(Integer value) {
            addCriterion("doctorId <>", value, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridGreaterThan(Integer value) {
            addCriterion("doctorId >", value, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridGreaterThanOrEqualTo(Integer value) {
            addCriterion("doctorId >=", value, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridLessThan(Integer value) {
            addCriterion("doctorId <", value, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridLessThanOrEqualTo(Integer value) {
            addCriterion("doctorId <=", value, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridIn(List<Integer> values) {
            addCriterion("doctorId in", values, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridNotIn(List<Integer> values) {
            addCriterion("doctorId not in", values, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridBetween(Integer value1, Integer value2) {
            addCriterion("doctorId between", value1, value2, "doctorid");
            return (Criteria) this;
        }

        public Criteria andDoctoridNotBetween(Integer value1, Integer value2) {
            addCriterion("doctorId not between", value1, value2, "doctorid");
            return (Criteria) this;
        }

        public Criteria andChiefcomplaintIsNull() {
            addCriterion("chiefComplaint is null");
            return (Criteria) this;
        }

        public Criteria andChiefcomplaintIsNotNull() {
            addCriterion("chiefComplaint is not null");
            return (Criteria) this;
        }

        public Criteria andChiefcomplaintEqualTo(String value) {
            addCriterion("chiefComplaint =", value, "chiefcomplaint");
            return (Criteria) this;
        }

        public Criteria andChiefcomplaintNotEqualTo(String value) {
            addCriterion("chiefComplaint <>", value, "chiefcomplaint");
            return (Criteria) this;
        }

        public Criteria andChiefcomplaintGreaterThan(String value) {
            addCriterion("chiefComplaint >", value, "chiefcomplaint");
            return (Criteria) this;
        }

        public Criteria andChiefcomplaintGreaterThanOrEqualTo(String value) {
            addCriterion("chiefComplaint >=", value, "chiefcomplaint");
            return (Criteria) this;
        }

        public Criteria andChiefcomplaintLessThan(String value) {
            addCriterion("chiefComplaint <", value, "chiefcomplaint");
            return (Criteria) this;
        }

        public Criteria andChiefcomplaintLessThanOrEqualTo(String value) {
            addCriterion("chiefComplaint <=", value, "chiefcomplaint");
            return (Criteria) this;
        }

        public Criteria andChiefcomplaintLike(String value) {
            addCriterion("chiefComplaint like", value, "chiefcomplaint");
            return (Criteria) this;
        }

        public Criteria andChiefcomplaintNotLike(String value) {
            addCriterion("chiefComplaint not like", value, "chiefcomplaint");
            return (Criteria) this;
        }

        public Criteria andChiefcomplaintIn(List<String> values) {
            addCriterion("chiefComplaint in", values, "chiefcomplaint");
            return (Criteria) this;
        }

        public Criteria andChiefcomplaintNotIn(List<String> values) {
            addCriterion("chiefComplaint not in", values, "chiefcomplaint");
            return (Criteria) this;
        }

        public Criteria andChiefcomplaintBetween(String value1, String value2) {
            addCriterion("chiefComplaint between", value1, value2, "chiefcomplaint");
            return (Criteria) this;
        }

        public Criteria andChiefcomplaintNotBetween(String value1, String value2) {
            addCriterion("chiefComplaint not between", value1, value2, "chiefcomplaint");
            return (Criteria) this;
        }

        public Criteria andCurrentmedicalhistoryIsNull() {
            addCriterion("currentMedicalHistory is null");
            return (Criteria) this;
        }

        public Criteria andCurrentmedicalhistoryIsNotNull() {
            addCriterion("currentMedicalHistory is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentmedicalhistoryEqualTo(String value) {
            addCriterion("currentMedicalHistory =", value, "currentmedicalhistory");
            return (Criteria) this;
        }

        public Criteria andCurrentmedicalhistoryNotEqualTo(String value) {
            addCriterion("currentMedicalHistory <>", value, "currentmedicalhistory");
            return (Criteria) this;
        }

        public Criteria andCurrentmedicalhistoryGreaterThan(String value) {
            addCriterion("currentMedicalHistory >", value, "currentmedicalhistory");
            return (Criteria) this;
        }

        public Criteria andCurrentmedicalhistoryGreaterThanOrEqualTo(String value) {
            addCriterion("currentMedicalHistory >=", value, "currentmedicalhistory");
            return (Criteria) this;
        }

        public Criteria andCurrentmedicalhistoryLessThan(String value) {
            addCriterion("currentMedicalHistory <", value, "currentmedicalhistory");
            return (Criteria) this;
        }

        public Criteria andCurrentmedicalhistoryLessThanOrEqualTo(String value) {
            addCriterion("currentMedicalHistory <=", value, "currentmedicalhistory");
            return (Criteria) this;
        }

        public Criteria andCurrentmedicalhistoryLike(String value) {
            addCriterion("currentMedicalHistory like", value, "currentmedicalhistory");
            return (Criteria) this;
        }

        public Criteria andCurrentmedicalhistoryNotLike(String value) {
            addCriterion("currentMedicalHistory not like", value, "currentmedicalhistory");
            return (Criteria) this;
        }

        public Criteria andCurrentmedicalhistoryIn(List<String> values) {
            addCriterion("currentMedicalHistory in", values, "currentmedicalhistory");
            return (Criteria) this;
        }

        public Criteria andCurrentmedicalhistoryNotIn(List<String> values) {
            addCriterion("currentMedicalHistory not in", values, "currentmedicalhistory");
            return (Criteria) this;
        }

        public Criteria andCurrentmedicalhistoryBetween(String value1, String value2) {
            addCriterion("currentMedicalHistory between", value1, value2, "currentmedicalhistory");
            return (Criteria) this;
        }

        public Criteria andCurrentmedicalhistoryNotBetween(String value1, String value2) {
            addCriterion("currentMedicalHistory not between", value1, value2, "currentmedicalhistory");
            return (Criteria) this;
        }

        public Criteria andCurrenttreatmentsituationIsNull() {
            addCriterion("currentTreatmentSituation is null");
            return (Criteria) this;
        }

        public Criteria andCurrenttreatmentsituationIsNotNull() {
            addCriterion("currentTreatmentSituation is not null");
            return (Criteria) this;
        }

        public Criteria andCurrenttreatmentsituationEqualTo(String value) {
            addCriterion("currentTreatmentSituation =", value, "currenttreatmentsituation");
            return (Criteria) this;
        }

        public Criteria andCurrenttreatmentsituationNotEqualTo(String value) {
            addCriterion("currentTreatmentSituation <>", value, "currenttreatmentsituation");
            return (Criteria) this;
        }

        public Criteria andCurrenttreatmentsituationGreaterThan(String value) {
            addCriterion("currentTreatmentSituation >", value, "currenttreatmentsituation");
            return (Criteria) this;
        }

        public Criteria andCurrenttreatmentsituationGreaterThanOrEqualTo(String value) {
            addCriterion("currentTreatmentSituation >=", value, "currenttreatmentsituation");
            return (Criteria) this;
        }

        public Criteria andCurrenttreatmentsituationLessThan(String value) {
            addCriterion("currentTreatmentSituation <", value, "currenttreatmentsituation");
            return (Criteria) this;
        }

        public Criteria andCurrenttreatmentsituationLessThanOrEqualTo(String value) {
            addCriterion("currentTreatmentSituation <=", value, "currenttreatmentsituation");
            return (Criteria) this;
        }

        public Criteria andCurrenttreatmentsituationLike(String value) {
            addCriterion("currentTreatmentSituation like", value, "currenttreatmentsituation");
            return (Criteria) this;
        }

        public Criteria andCurrenttreatmentsituationNotLike(String value) {
            addCriterion("currentTreatmentSituation not like", value, "currenttreatmentsituation");
            return (Criteria) this;
        }

        public Criteria andCurrenttreatmentsituationIn(List<String> values) {
            addCriterion("currentTreatmentSituation in", values, "currenttreatmentsituation");
            return (Criteria) this;
        }

        public Criteria andCurrenttreatmentsituationNotIn(List<String> values) {
            addCriterion("currentTreatmentSituation not in", values, "currenttreatmentsituation");
            return (Criteria) this;
        }

        public Criteria andCurrenttreatmentsituationBetween(String value1, String value2) {
            addCriterion("currentTreatmentSituation between", value1, value2, "currenttreatmentsituation");
            return (Criteria) this;
        }

        public Criteria andCurrenttreatmentsituationNotBetween(String value1, String value2) {
            addCriterion("currentTreatmentSituation not between", value1, value2, "currenttreatmentsituation");
            return (Criteria) this;
        }

        public Criteria andPastmedicalhistoryIsNull() {
            addCriterion("pastMedicalHistory is null");
            return (Criteria) this;
        }

        public Criteria andPastmedicalhistoryIsNotNull() {
            addCriterion("pastMedicalHistory is not null");
            return (Criteria) this;
        }

        public Criteria andPastmedicalhistoryEqualTo(String value) {
            addCriterion("pastMedicalHistory =", value, "pastmedicalhistory");
            return (Criteria) this;
        }

        public Criteria andPastmedicalhistoryNotEqualTo(String value) {
            addCriterion("pastMedicalHistory <>", value, "pastmedicalhistory");
            return (Criteria) this;
        }

        public Criteria andPastmedicalhistoryGreaterThan(String value) {
            addCriterion("pastMedicalHistory >", value, "pastmedicalhistory");
            return (Criteria) this;
        }

        public Criteria andPastmedicalhistoryGreaterThanOrEqualTo(String value) {
            addCriterion("pastMedicalHistory >=", value, "pastmedicalhistory");
            return (Criteria) this;
        }

        public Criteria andPastmedicalhistoryLessThan(String value) {
            addCriterion("pastMedicalHistory <", value, "pastmedicalhistory");
            return (Criteria) this;
        }

        public Criteria andPastmedicalhistoryLessThanOrEqualTo(String value) {
            addCriterion("pastMedicalHistory <=", value, "pastmedicalhistory");
            return (Criteria) this;
        }

        public Criteria andPastmedicalhistoryLike(String value) {
            addCriterion("pastMedicalHistory like", value, "pastmedicalhistory");
            return (Criteria) this;
        }

        public Criteria andPastmedicalhistoryNotLike(String value) {
            addCriterion("pastMedicalHistory not like", value, "pastmedicalhistory");
            return (Criteria) this;
        }

        public Criteria andPastmedicalhistoryIn(List<String> values) {
            addCriterion("pastMedicalHistory in", values, "pastmedicalhistory");
            return (Criteria) this;
        }

        public Criteria andPastmedicalhistoryNotIn(List<String> values) {
            addCriterion("pastMedicalHistory not in", values, "pastmedicalhistory");
            return (Criteria) this;
        }

        public Criteria andPastmedicalhistoryBetween(String value1, String value2) {
            addCriterion("pastMedicalHistory between", value1, value2, "pastmedicalhistory");
            return (Criteria) this;
        }

        public Criteria andPastmedicalhistoryNotBetween(String value1, String value2) {
            addCriterion("pastMedicalHistory not between", value1, value2, "pastmedicalhistory");
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

        public Criteria andPhysicalexaminationIsNull() {
            addCriterion("physicalExamination is null");
            return (Criteria) this;
        }

        public Criteria andPhysicalexaminationIsNotNull() {
            addCriterion("physicalExamination is not null");
            return (Criteria) this;
        }

        public Criteria andPhysicalexaminationEqualTo(String value) {
            addCriterion("physicalExamination =", value, "physicalexamination");
            return (Criteria) this;
        }

        public Criteria andPhysicalexaminationNotEqualTo(String value) {
            addCriterion("physicalExamination <>", value, "physicalexamination");
            return (Criteria) this;
        }

        public Criteria andPhysicalexaminationGreaterThan(String value) {
            addCriterion("physicalExamination >", value, "physicalexamination");
            return (Criteria) this;
        }

        public Criteria andPhysicalexaminationGreaterThanOrEqualTo(String value) {
            addCriterion("physicalExamination >=", value, "physicalexamination");
            return (Criteria) this;
        }

        public Criteria andPhysicalexaminationLessThan(String value) {
            addCriterion("physicalExamination <", value, "physicalexamination");
            return (Criteria) this;
        }

        public Criteria andPhysicalexaminationLessThanOrEqualTo(String value) {
            addCriterion("physicalExamination <=", value, "physicalexamination");
            return (Criteria) this;
        }

        public Criteria andPhysicalexaminationLike(String value) {
            addCriterion("physicalExamination like", value, "physicalexamination");
            return (Criteria) this;
        }

        public Criteria andPhysicalexaminationNotLike(String value) {
            addCriterion("physicalExamination not like", value, "physicalexamination");
            return (Criteria) this;
        }

        public Criteria andPhysicalexaminationIn(List<String> values) {
            addCriterion("physicalExamination in", values, "physicalexamination");
            return (Criteria) this;
        }

        public Criteria andPhysicalexaminationNotIn(List<String> values) {
            addCriterion("physicalExamination not in", values, "physicalexamination");
            return (Criteria) this;
        }

        public Criteria andPhysicalexaminationBetween(String value1, String value2) {
            addCriterion("physicalExamination between", value1, value2, "physicalexamination");
            return (Criteria) this;
        }

        public Criteria andPhysicalexaminationNotBetween(String value1, String value2) {
            addCriterion("physicalExamination not between", value1, value2, "physicalexamination");
            return (Criteria) this;
        }

        public Criteria andInitialdiagnosisIsNull() {
            addCriterion("initialDiagnosis is null");
            return (Criteria) this;
        }

        public Criteria andInitialdiagnosisIsNotNull() {
            addCriterion("initialDiagnosis is not null");
            return (Criteria) this;
        }

        public Criteria andInitialdiagnosisEqualTo(String value) {
            addCriterion("initialDiagnosis =", value, "initialdiagnosis");
            return (Criteria) this;
        }

        public Criteria andInitialdiagnosisNotEqualTo(String value) {
            addCriterion("initialDiagnosis <>", value, "initialdiagnosis");
            return (Criteria) this;
        }

        public Criteria andInitialdiagnosisGreaterThan(String value) {
            addCriterion("initialDiagnosis >", value, "initialdiagnosis");
            return (Criteria) this;
        }

        public Criteria andInitialdiagnosisGreaterThanOrEqualTo(String value) {
            addCriterion("initialDiagnosis >=", value, "initialdiagnosis");
            return (Criteria) this;
        }

        public Criteria andInitialdiagnosisLessThan(String value) {
            addCriterion("initialDiagnosis <", value, "initialdiagnosis");
            return (Criteria) this;
        }

        public Criteria andInitialdiagnosisLessThanOrEqualTo(String value) {
            addCriterion("initialDiagnosis <=", value, "initialdiagnosis");
            return (Criteria) this;
        }

        public Criteria andInitialdiagnosisLike(String value) {
            addCriterion("initialDiagnosis like", value, "initialdiagnosis");
            return (Criteria) this;
        }

        public Criteria andInitialdiagnosisNotLike(String value) {
            addCriterion("initialDiagnosis not like", value, "initialdiagnosis");
            return (Criteria) this;
        }

        public Criteria andInitialdiagnosisIn(List<String> values) {
            addCriterion("initialDiagnosis in", values, "initialdiagnosis");
            return (Criteria) this;
        }

        public Criteria andInitialdiagnosisNotIn(List<String> values) {
            addCriterion("initialDiagnosis not in", values, "initialdiagnosis");
            return (Criteria) this;
        }

        public Criteria andInitialdiagnosisBetween(String value1, String value2) {
            addCriterion("initialDiagnosis between", value1, value2, "initialdiagnosis");
            return (Criteria) this;
        }

        public Criteria andInitialdiagnosisNotBetween(String value1, String value2) {
            addCriterion("initialDiagnosis not between", value1, value2, "initialdiagnosis");
            return (Criteria) this;
        }

        public Criteria andInitialdiagnosistypeIsNull() {
            addCriterion("initialDiagnosisType is null");
            return (Criteria) this;
        }

        public Criteria andInitialdiagnosistypeIsNotNull() {
            addCriterion("initialDiagnosisType is not null");
            return (Criteria) this;
        }

        public Criteria andInitialdiagnosistypeEqualTo(String value) {
            addCriterion("initialDiagnosisType =", value, "initialdiagnosistype");
            return (Criteria) this;
        }

        public Criteria andInitialdiagnosistypeNotEqualTo(String value) {
            addCriterion("initialDiagnosisType <>", value, "initialdiagnosistype");
            return (Criteria) this;
        }

        public Criteria andInitialdiagnosistypeGreaterThan(String value) {
            addCriterion("initialDiagnosisType >", value, "initialdiagnosistype");
            return (Criteria) this;
        }

        public Criteria andInitialdiagnosistypeGreaterThanOrEqualTo(String value) {
            addCriterion("initialDiagnosisType >=", value, "initialdiagnosistype");
            return (Criteria) this;
        }

        public Criteria andInitialdiagnosistypeLessThan(String value) {
            addCriterion("initialDiagnosisType <", value, "initialdiagnosistype");
            return (Criteria) this;
        }

        public Criteria andInitialdiagnosistypeLessThanOrEqualTo(String value) {
            addCriterion("initialDiagnosisType <=", value, "initialdiagnosistype");
            return (Criteria) this;
        }

        public Criteria andInitialdiagnosistypeLike(String value) {
            addCriterion("initialDiagnosisType like", value, "initialdiagnosistype");
            return (Criteria) this;
        }

        public Criteria andInitialdiagnosistypeNotLike(String value) {
            addCriterion("initialDiagnosisType not like", value, "initialdiagnosistype");
            return (Criteria) this;
        }

        public Criteria andInitialdiagnosistypeIn(List<String> values) {
            addCriterion("initialDiagnosisType in", values, "initialdiagnosistype");
            return (Criteria) this;
        }

        public Criteria andInitialdiagnosistypeNotIn(List<String> values) {
            addCriterion("initialDiagnosisType not in", values, "initialdiagnosistype");
            return (Criteria) this;
        }

        public Criteria andInitialdiagnosistypeBetween(String value1, String value2) {
            addCriterion("initialDiagnosisType between", value1, value2, "initialdiagnosistype");
            return (Criteria) this;
        }

        public Criteria andInitialdiagnosistypeNotBetween(String value1, String value2) {
            addCriterion("initialDiagnosisType not between", value1, value2, "initialdiagnosistype");
            return (Criteria) this;
        }

        public Criteria andInspectrecommendIsNull() {
            addCriterion("inspectRecommend is null");
            return (Criteria) this;
        }

        public Criteria andInspectrecommendIsNotNull() {
            addCriterion("inspectRecommend is not null");
            return (Criteria) this;
        }

        public Criteria andInspectrecommendEqualTo(String value) {
            addCriterion("inspectRecommend =", value, "inspectrecommend");
            return (Criteria) this;
        }

        public Criteria andInspectrecommendNotEqualTo(String value) {
            addCriterion("inspectRecommend <>", value, "inspectrecommend");
            return (Criteria) this;
        }

        public Criteria andInspectrecommendGreaterThan(String value) {
            addCriterion("inspectRecommend >", value, "inspectrecommend");
            return (Criteria) this;
        }

        public Criteria andInspectrecommendGreaterThanOrEqualTo(String value) {
            addCriterion("inspectRecommend >=", value, "inspectrecommend");
            return (Criteria) this;
        }

        public Criteria andInspectrecommendLessThan(String value) {
            addCriterion("inspectRecommend <", value, "inspectrecommend");
            return (Criteria) this;
        }

        public Criteria andInspectrecommendLessThanOrEqualTo(String value) {
            addCriterion("inspectRecommend <=", value, "inspectrecommend");
            return (Criteria) this;
        }

        public Criteria andInspectrecommendLike(String value) {
            addCriterion("inspectRecommend like", value, "inspectrecommend");
            return (Criteria) this;
        }

        public Criteria andInspectrecommendNotLike(String value) {
            addCriterion("inspectRecommend not like", value, "inspectrecommend");
            return (Criteria) this;
        }

        public Criteria andInspectrecommendIn(List<String> values) {
            addCriterion("inspectRecommend in", values, "inspectrecommend");
            return (Criteria) this;
        }

        public Criteria andInspectrecommendNotIn(List<String> values) {
            addCriterion("inspectRecommend not in", values, "inspectrecommend");
            return (Criteria) this;
        }

        public Criteria andInspectrecommendBetween(String value1, String value2) {
            addCriterion("inspectRecommend between", value1, value2, "inspectrecommend");
            return (Criteria) this;
        }

        public Criteria andInspectrecommendNotBetween(String value1, String value2) {
            addCriterion("inspectRecommend not between", value1, value2, "inspectrecommend");
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