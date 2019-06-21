package edu.neu.hospital.example.inspectionExample;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InspectMedReViewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public InspectMedReViewExample() {
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

        public Criteria andMedMatListIDIsNull() {
            addCriterion("medMatListID is null");
            return (Criteria) this;
        }

        public Criteria andMedMatListIDIsNotNull() {
            addCriterion("medMatListID is not null");
            return (Criteria) this;
        }

        public Criteria andMedMatListIDEqualTo(Integer value) {
            addCriterion("medMatListID =", value, "medMatListID");
            return (Criteria) this;
        }

        public Criteria andMedMatListIDNotEqualTo(Integer value) {
            addCriterion("medMatListID <>", value, "medMatListID");
            return (Criteria) this;
        }

        public Criteria andMedMatListIDGreaterThan(Integer value) {
            addCriterion("medMatListID >", value, "medMatListID");
            return (Criteria) this;
        }

        public Criteria andMedMatListIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("medMatListID >=", value, "medMatListID");
            return (Criteria) this;
        }

        public Criteria andMedMatListIDLessThan(Integer value) {
            addCriterion("medMatListID <", value, "medMatListID");
            return (Criteria) this;
        }

        public Criteria andMedMatListIDLessThanOrEqualTo(Integer value) {
            addCriterion("medMatListID <=", value, "medMatListID");
            return (Criteria) this;
        }

        public Criteria andMedMatListIDIn(List<Integer> values) {
            addCriterion("medMatListID in", values, "medMatListID");
            return (Criteria) this;
        }

        public Criteria andMedMatListIDNotIn(List<Integer> values) {
            addCriterion("medMatListID not in", values, "medMatListID");
            return (Criteria) this;
        }

        public Criteria andMedMatListIDBetween(Integer value1, Integer value2) {
            addCriterion("medMatListID between", value1, value2, "medMatListID");
            return (Criteria) this;
        }

        public Criteria andMedMatListIDNotBetween(Integer value1, Integer value2) {
            addCriterion("medMatListID not between", value1, value2, "medMatListID");
            return (Criteria) this;
        }

        public Criteria andItemsTypeIsNull() {
            addCriterion("itemsType is null");
            return (Criteria) this;
        }

        public Criteria andItemsTypeIsNotNull() {
            addCriterion("itemsType is not null");
            return (Criteria) this;
        }

        public Criteria andItemsTypeEqualTo(String value) {
            addCriterion("itemsType =", value, "itemsType");
            return (Criteria) this;
        }

        public Criteria andItemsTypeNotEqualTo(String value) {
            addCriterion("itemsType <>", value, "itemsType");
            return (Criteria) this;
        }

        public Criteria andItemsTypeGreaterThan(String value) {
            addCriterion("itemsType >", value, "itemsType");
            return (Criteria) this;
        }

        public Criteria andItemsTypeGreaterThanOrEqualTo(String value) {
            addCriterion("itemsType >=", value, "itemsType");
            return (Criteria) this;
        }

        public Criteria andItemsTypeLessThan(String value) {
            addCriterion("itemsType <", value, "itemsType");
            return (Criteria) this;
        }

        public Criteria andItemsTypeLessThanOrEqualTo(String value) {
            addCriterion("itemsType <=", value, "itemsType");
            return (Criteria) this;
        }

        public Criteria andItemsTypeLike(String value) {
            addCriterion("itemsType like", value, "itemsType");
            return (Criteria) this;
        }

        public Criteria andItemsTypeNotLike(String value) {
            addCriterion("itemsType not like", value, "itemsType");
            return (Criteria) this;
        }

        public Criteria andItemsTypeIn(List<String> values) {
            addCriterion("itemsType in", values, "itemsType");
            return (Criteria) this;
        }

        public Criteria andItemsTypeNotIn(List<String> values) {
            addCriterion("itemsType not in", values, "itemsType");
            return (Criteria) this;
        }

        public Criteria andItemsTypeBetween(String value1, String value2) {
            addCriterion("itemsType between", value1, value2, "itemsType");
            return (Criteria) this;
        }

        public Criteria andItemsTypeNotBetween(String value1, String value2) {
            addCriterion("itemsType not between", value1, value2, "itemsType");
            return (Criteria) this;
        }

        public Criteria andItemsDetailIDIsNull() {
            addCriterion("itemsDetailID is null");
            return (Criteria) this;
        }

        public Criteria andItemsDetailIDIsNotNull() {
            addCriterion("itemsDetailID is not null");
            return (Criteria) this;
        }

        public Criteria andItemsDetailIDEqualTo(Integer value) {
            addCriterion("itemsDetailID =", value, "itemsDetailID");
            return (Criteria) this;
        }

        public Criteria andItemsDetailIDNotEqualTo(Integer value) {
            addCriterion("itemsDetailID <>", value, "itemsDetailID");
            return (Criteria) this;
        }

        public Criteria andItemsDetailIDGreaterThan(Integer value) {
            addCriterion("itemsDetailID >", value, "itemsDetailID");
            return (Criteria) this;
        }

        public Criteria andItemsDetailIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("itemsDetailID >=", value, "itemsDetailID");
            return (Criteria) this;
        }

        public Criteria andItemsDetailIDLessThan(Integer value) {
            addCriterion("itemsDetailID <", value, "itemsDetailID");
            return (Criteria) this;
        }

        public Criteria andItemsDetailIDLessThanOrEqualTo(Integer value) {
            addCriterion("itemsDetailID <=", value, "itemsDetailID");
            return (Criteria) this;
        }

        public Criteria andItemsDetailIDIn(List<Integer> values) {
            addCriterion("itemsDetailID in", values, "itemsDetailID");
            return (Criteria) this;
        }

        public Criteria andItemsDetailIDNotIn(List<Integer> values) {
            addCriterion("itemsDetailID not in", values, "itemsDetailID");
            return (Criteria) this;
        }

        public Criteria andItemsDetailIDBetween(Integer value1, Integer value2) {
            addCriterion("itemsDetailID between", value1, value2, "itemsDetailID");
            return (Criteria) this;
        }

        public Criteria andItemsDetailIDNotBetween(Integer value1, Integer value2) {
            addCriterion("itemsDetailID not between", value1, value2, "itemsDetailID");
            return (Criteria) this;
        }

        public Criteria andMedicinesMaterialsIDIsNull() {
            addCriterion("medicinesMaterialsID is null");
            return (Criteria) this;
        }

        public Criteria andMedicinesMaterialsIDIsNotNull() {
            addCriterion("medicinesMaterialsID is not null");
            return (Criteria) this;
        }

        public Criteria andMedicinesMaterialsIDEqualTo(Integer value) {
            addCriterion("medicinesMaterialsID =", value, "medicinesMaterialsID");
            return (Criteria) this;
        }

        public Criteria andMedicinesMaterialsIDNotEqualTo(Integer value) {
            addCriterion("medicinesMaterialsID <>", value, "medicinesMaterialsID");
            return (Criteria) this;
        }

        public Criteria andMedicinesMaterialsIDGreaterThan(Integer value) {
            addCriterion("medicinesMaterialsID >", value, "medicinesMaterialsID");
            return (Criteria) this;
        }

        public Criteria andMedicinesMaterialsIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("medicinesMaterialsID >=", value, "medicinesMaterialsID");
            return (Criteria) this;
        }

        public Criteria andMedicinesMaterialsIDLessThan(Integer value) {
            addCriterion("medicinesMaterialsID <", value, "medicinesMaterialsID");
            return (Criteria) this;
        }

        public Criteria andMedicinesMaterialsIDLessThanOrEqualTo(Integer value) {
            addCriterion("medicinesMaterialsID <=", value, "medicinesMaterialsID");
            return (Criteria) this;
        }

        public Criteria andMedicinesMaterialsIDIn(List<Integer> values) {
            addCriterion("medicinesMaterialsID in", values, "medicinesMaterialsID");
            return (Criteria) this;
        }

        public Criteria andMedicinesMaterialsIDNotIn(List<Integer> values) {
            addCriterion("medicinesMaterialsID not in", values, "medicinesMaterialsID");
            return (Criteria) this;
        }

        public Criteria andMedicinesMaterialsIDBetween(Integer value1, Integer value2) {
            addCriterion("medicinesMaterialsID between", value1, value2, "medicinesMaterialsID");
            return (Criteria) this;
        }

        public Criteria andMedicinesMaterialsIDNotBetween(Integer value1, Integer value2) {
            addCriterion("medicinesMaterialsID not between", value1, value2, "medicinesMaterialsID");
            return (Criteria) this;
        }

        public Criteria andDosageIsNull() {
            addCriterion("dosage is null");
            return (Criteria) this;
        }

        public Criteria andDosageIsNotNull() {
            addCriterion("dosage is not null");
            return (Criteria) this;
        }

        public Criteria andDosageEqualTo(BigDecimal value) {
            addCriterion("dosage =", value, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageNotEqualTo(BigDecimal value) {
            addCriterion("dosage <>", value, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageGreaterThan(BigDecimal value) {
            addCriterion("dosage >", value, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dosage >=", value, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageLessThan(BigDecimal value) {
            addCriterion("dosage <", value, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageLessThanOrEqualTo(BigDecimal value) {
            addCriterion("dosage <=", value, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageIn(List<BigDecimal> values) {
            addCriterion("dosage in", values, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageNotIn(List<BigDecimal> values) {
            addCriterion("dosage not in", values, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dosage between", value1, value2, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dosage not between", value1, value2, "dosage");
            return (Criteria) this;
        }

        public Criteria andMatOrMedTypeIsNull() {
            addCriterion("matOrMedType is null");
            return (Criteria) this;
        }

        public Criteria andMatOrMedTypeIsNotNull() {
            addCriterion("matOrMedType is not null");
            return (Criteria) this;
        }

        public Criteria andMatOrMedTypeEqualTo(String value) {
            addCriterion("matOrMedType =", value, "matOrMedType");
            return (Criteria) this;
        }

        public Criteria andMatOrMedTypeNotEqualTo(String value) {
            addCriterion("matOrMedType <>", value, "matOrMedType");
            return (Criteria) this;
        }

        public Criteria andMatOrMedTypeGreaterThan(String value) {
            addCriterion("matOrMedType >", value, "matOrMedType");
            return (Criteria) this;
        }

        public Criteria andMatOrMedTypeGreaterThanOrEqualTo(String value) {
            addCriterion("matOrMedType >=", value, "matOrMedType");
            return (Criteria) this;
        }

        public Criteria andMatOrMedTypeLessThan(String value) {
            addCriterion("matOrMedType <", value, "matOrMedType");
            return (Criteria) this;
        }

        public Criteria andMatOrMedTypeLessThanOrEqualTo(String value) {
            addCriterion("matOrMedType <=", value, "matOrMedType");
            return (Criteria) this;
        }

        public Criteria andMatOrMedTypeLike(String value) {
            addCriterion("matOrMedType like", value, "matOrMedType");
            return (Criteria) this;
        }

        public Criteria andMatOrMedTypeNotLike(String value) {
            addCriterion("matOrMedType not like", value, "matOrMedType");
            return (Criteria) this;
        }

        public Criteria andMatOrMedTypeIn(List<String> values) {
            addCriterion("matOrMedType in", values, "matOrMedType");
            return (Criteria) this;
        }

        public Criteria andMatOrMedTypeNotIn(List<String> values) {
            addCriterion("matOrMedType not in", values, "matOrMedType");
            return (Criteria) this;
        }

        public Criteria andMatOrMedTypeBetween(String value1, String value2) {
            addCriterion("matOrMedType between", value1, value2, "matOrMedType");
            return (Criteria) this;
        }

        public Criteria andMatOrMedTypeNotBetween(String value1, String value2) {
            addCriterion("matOrMedType not between", value1, value2, "matOrMedType");
            return (Criteria) this;
        }

        public Criteria andDrugsIDIsNull() {
            addCriterion("drugsID is null");
            return (Criteria) this;
        }

        public Criteria andDrugsIDIsNotNull() {
            addCriterion("drugsID is not null");
            return (Criteria) this;
        }

        public Criteria andDrugsIDEqualTo(Integer value) {
            addCriterion("drugsID =", value, "drugsID");
            return (Criteria) this;
        }

        public Criteria andDrugsIDNotEqualTo(Integer value) {
            addCriterion("drugsID <>", value, "drugsID");
            return (Criteria) this;
        }

        public Criteria andDrugsIDGreaterThan(Integer value) {
            addCriterion("drugsID >", value, "drugsID");
            return (Criteria) this;
        }

        public Criteria andDrugsIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("drugsID >=", value, "drugsID");
            return (Criteria) this;
        }

        public Criteria andDrugsIDLessThan(Integer value) {
            addCriterion("drugsID <", value, "drugsID");
            return (Criteria) this;
        }

        public Criteria andDrugsIDLessThanOrEqualTo(Integer value) {
            addCriterion("drugsID <=", value, "drugsID");
            return (Criteria) this;
        }

        public Criteria andDrugsIDIn(List<Integer> values) {
            addCriterion("drugsID in", values, "drugsID");
            return (Criteria) this;
        }

        public Criteria andDrugsIDNotIn(List<Integer> values) {
            addCriterion("drugsID not in", values, "drugsID");
            return (Criteria) this;
        }

        public Criteria andDrugsIDBetween(Integer value1, Integer value2) {
            addCriterion("drugsID between", value1, value2, "drugsID");
            return (Criteria) this;
        }

        public Criteria andDrugsIDNotBetween(Integer value1, Integer value2) {
            addCriterion("drugsID not between", value1, value2, "drugsID");
            return (Criteria) this;
        }

        public Criteria andDrugsCodeIsNull() {
            addCriterion("drugsCode is null");
            return (Criteria) this;
        }

        public Criteria andDrugsCodeIsNotNull() {
            addCriterion("drugsCode is not null");
            return (Criteria) this;
        }

        public Criteria andDrugsCodeEqualTo(String value) {
            addCriterion("drugsCode =", value, "drugsCode");
            return (Criteria) this;
        }

        public Criteria andDrugsCodeNotEqualTo(String value) {
            addCriterion("drugsCode <>", value, "drugsCode");
            return (Criteria) this;
        }

        public Criteria andDrugsCodeGreaterThan(String value) {
            addCriterion("drugsCode >", value, "drugsCode");
            return (Criteria) this;
        }

        public Criteria andDrugsCodeGreaterThanOrEqualTo(String value) {
            addCriterion("drugsCode >=", value, "drugsCode");
            return (Criteria) this;
        }

        public Criteria andDrugsCodeLessThan(String value) {
            addCriterion("drugsCode <", value, "drugsCode");
            return (Criteria) this;
        }

        public Criteria andDrugsCodeLessThanOrEqualTo(String value) {
            addCriterion("drugsCode <=", value, "drugsCode");
            return (Criteria) this;
        }

        public Criteria andDrugsCodeLike(String value) {
            addCriterion("drugsCode like", value, "drugsCode");
            return (Criteria) this;
        }

        public Criteria andDrugsCodeNotLike(String value) {
            addCriterion("drugsCode not like", value, "drugsCode");
            return (Criteria) this;
        }

        public Criteria andDrugsCodeIn(List<String> values) {
            addCriterion("drugsCode in", values, "drugsCode");
            return (Criteria) this;
        }

        public Criteria andDrugsCodeNotIn(List<String> values) {
            addCriterion("drugsCode not in", values, "drugsCode");
            return (Criteria) this;
        }

        public Criteria andDrugsCodeBetween(String value1, String value2) {
            addCriterion("drugsCode between", value1, value2, "drugsCode");
            return (Criteria) this;
        }

        public Criteria andDrugsCodeNotBetween(String value1, String value2) {
            addCriterion("drugsCode not between", value1, value2, "drugsCode");
            return (Criteria) this;
        }

        public Criteria andDrugsNameIsNull() {
            addCriterion("drugsName is null");
            return (Criteria) this;
        }

        public Criteria andDrugsNameIsNotNull() {
            addCriterion("drugsName is not null");
            return (Criteria) this;
        }

        public Criteria andDrugsNameEqualTo(String value) {
            addCriterion("drugsName =", value, "drugsName");
            return (Criteria) this;
        }

        public Criteria andDrugsNameNotEqualTo(String value) {
            addCriterion("drugsName <>", value, "drugsName");
            return (Criteria) this;
        }

        public Criteria andDrugsNameGreaterThan(String value) {
            addCriterion("drugsName >", value, "drugsName");
            return (Criteria) this;
        }

        public Criteria andDrugsNameGreaterThanOrEqualTo(String value) {
            addCriterion("drugsName >=", value, "drugsName");
            return (Criteria) this;
        }

        public Criteria andDrugsNameLessThan(String value) {
            addCriterion("drugsName <", value, "drugsName");
            return (Criteria) this;
        }

        public Criteria andDrugsNameLessThanOrEqualTo(String value) {
            addCriterion("drugsName <=", value, "drugsName");
            return (Criteria) this;
        }

        public Criteria andDrugsNameLike(String value) {
            addCriterion("drugsName like", value, "drugsName");
            return (Criteria) this;
        }

        public Criteria andDrugsNameNotLike(String value) {
            addCriterion("drugsName not like", value, "drugsName");
            return (Criteria) this;
        }

        public Criteria andDrugsNameIn(List<String> values) {
            addCriterion("drugsName in", values, "drugsName");
            return (Criteria) this;
        }

        public Criteria andDrugsNameNotIn(List<String> values) {
            addCriterion("drugsName not in", values, "drugsName");
            return (Criteria) this;
        }

        public Criteria andDrugsNameBetween(String value1, String value2) {
            addCriterion("drugsName between", value1, value2, "drugsName");
            return (Criteria) this;
        }

        public Criteria andDrugsNameNotBetween(String value1, String value2) {
            addCriterion("drugsName not between", value1, value2, "drugsName");
            return (Criteria) this;
        }

        public Criteria andDrugsFormatIsNull() {
            addCriterion("drugsFormat is null");
            return (Criteria) this;
        }

        public Criteria andDrugsFormatIsNotNull() {
            addCriterion("drugsFormat is not null");
            return (Criteria) this;
        }

        public Criteria andDrugsFormatEqualTo(String value) {
            addCriterion("drugsFormat =", value, "drugsFormat");
            return (Criteria) this;
        }

        public Criteria andDrugsFormatNotEqualTo(String value) {
            addCriterion("drugsFormat <>", value, "drugsFormat");
            return (Criteria) this;
        }

        public Criteria andDrugsFormatGreaterThan(String value) {
            addCriterion("drugsFormat >", value, "drugsFormat");
            return (Criteria) this;
        }

        public Criteria andDrugsFormatGreaterThanOrEqualTo(String value) {
            addCriterion("drugsFormat >=", value, "drugsFormat");
            return (Criteria) this;
        }

        public Criteria andDrugsFormatLessThan(String value) {
            addCriterion("drugsFormat <", value, "drugsFormat");
            return (Criteria) this;
        }

        public Criteria andDrugsFormatLessThanOrEqualTo(String value) {
            addCriterion("drugsFormat <=", value, "drugsFormat");
            return (Criteria) this;
        }

        public Criteria andDrugsFormatLike(String value) {
            addCriterion("drugsFormat like", value, "drugsFormat");
            return (Criteria) this;
        }

        public Criteria andDrugsFormatNotLike(String value) {
            addCriterion("drugsFormat not like", value, "drugsFormat");
            return (Criteria) this;
        }

        public Criteria andDrugsFormatIn(List<String> values) {
            addCriterion("drugsFormat in", values, "drugsFormat");
            return (Criteria) this;
        }

        public Criteria andDrugsFormatNotIn(List<String> values) {
            addCriterion("drugsFormat not in", values, "drugsFormat");
            return (Criteria) this;
        }

        public Criteria andDrugsFormatBetween(String value1, String value2) {
            addCriterion("drugsFormat between", value1, value2, "drugsFormat");
            return (Criteria) this;
        }

        public Criteria andDrugsFormatNotBetween(String value1, String value2) {
            addCriterion("drugsFormat not between", value1, value2, "drugsFormat");
            return (Criteria) this;
        }

        public Criteria andDrugsUnitIsNull() {
            addCriterion("drugsUnit is null");
            return (Criteria) this;
        }

        public Criteria andDrugsUnitIsNotNull() {
            addCriterion("drugsUnit is not null");
            return (Criteria) this;
        }

        public Criteria andDrugsUnitEqualTo(String value) {
            addCriterion("drugsUnit =", value, "drugsUnit");
            return (Criteria) this;
        }

        public Criteria andDrugsUnitNotEqualTo(String value) {
            addCriterion("drugsUnit <>", value, "drugsUnit");
            return (Criteria) this;
        }

        public Criteria andDrugsUnitGreaterThan(String value) {
            addCriterion("drugsUnit >", value, "drugsUnit");
            return (Criteria) this;
        }

        public Criteria andDrugsUnitGreaterThanOrEqualTo(String value) {
            addCriterion("drugsUnit >=", value, "drugsUnit");
            return (Criteria) this;
        }

        public Criteria andDrugsUnitLessThan(String value) {
            addCriterion("drugsUnit <", value, "drugsUnit");
            return (Criteria) this;
        }

        public Criteria andDrugsUnitLessThanOrEqualTo(String value) {
            addCriterion("drugsUnit <=", value, "drugsUnit");
            return (Criteria) this;
        }

        public Criteria andDrugsUnitLike(String value) {
            addCriterion("drugsUnit like", value, "drugsUnit");
            return (Criteria) this;
        }

        public Criteria andDrugsUnitNotLike(String value) {
            addCriterion("drugsUnit not like", value, "drugsUnit");
            return (Criteria) this;
        }

        public Criteria andDrugsUnitIn(List<String> values) {
            addCriterion("drugsUnit in", values, "drugsUnit");
            return (Criteria) this;
        }

        public Criteria andDrugsUnitNotIn(List<String> values) {
            addCriterion("drugsUnit not in", values, "drugsUnit");
            return (Criteria) this;
        }

        public Criteria andDrugsUnitBetween(String value1, String value2) {
            addCriterion("drugsUnit between", value1, value2, "drugsUnit");
            return (Criteria) this;
        }

        public Criteria andDrugsUnitNotBetween(String value1, String value2) {
            addCriterion("drugsUnit not between", value1, value2, "drugsUnit");
            return (Criteria) this;
        }

        public Criteria andManufacturerIsNull() {
            addCriterion("manufacturer is null");
            return (Criteria) this;
        }

        public Criteria andManufacturerIsNotNull() {
            addCriterion("manufacturer is not null");
            return (Criteria) this;
        }

        public Criteria andManufacturerEqualTo(String value) {
            addCriterion("manufacturer =", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotEqualTo(String value) {
            addCriterion("manufacturer <>", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerGreaterThan(String value) {
            addCriterion("manufacturer >", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerGreaterThanOrEqualTo(String value) {
            addCriterion("manufacturer >=", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLessThan(String value) {
            addCriterion("manufacturer <", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLessThanOrEqualTo(String value) {
            addCriterion("manufacturer <=", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLike(String value) {
            addCriterion("manufacturer like", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotLike(String value) {
            addCriterion("manufacturer not like", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerIn(List<String> values) {
            addCriterion("manufacturer in", values, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotIn(List<String> values) {
            addCriterion("manufacturer not in", values, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerBetween(String value1, String value2) {
            addCriterion("manufacturer between", value1, value2, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotBetween(String value1, String value2) {
            addCriterion("manufacturer not between", value1, value2, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageIDIsNull() {
            addCriterion("drugsDosageID is null");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageIDIsNotNull() {
            addCriterion("drugsDosageID is not null");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageIDEqualTo(Integer value) {
            addCriterion("drugsDosageID =", value, "drugsDosageID");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageIDNotEqualTo(Integer value) {
            addCriterion("drugsDosageID <>", value, "drugsDosageID");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageIDGreaterThan(Integer value) {
            addCriterion("drugsDosageID >", value, "drugsDosageID");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("drugsDosageID >=", value, "drugsDosageID");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageIDLessThan(Integer value) {
            addCriterion("drugsDosageID <", value, "drugsDosageID");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageIDLessThanOrEqualTo(Integer value) {
            addCriterion("drugsDosageID <=", value, "drugsDosageID");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageIDIn(List<Integer> values) {
            addCriterion("drugsDosageID in", values, "drugsDosageID");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageIDNotIn(List<Integer> values) {
            addCriterion("drugsDosageID not in", values, "drugsDosageID");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageIDBetween(Integer value1, Integer value2) {
            addCriterion("drugsDosageID between", value1, value2, "drugsDosageID");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageIDNotBetween(Integer value1, Integer value2) {
            addCriterion("drugsDosageID not between", value1, value2, "drugsDosageID");
            return (Criteria) this;
        }

        public Criteria andDrugsTypeIDIsNull() {
            addCriterion("drugsTypeID is null");
            return (Criteria) this;
        }

        public Criteria andDrugsTypeIDIsNotNull() {
            addCriterion("drugsTypeID is not null");
            return (Criteria) this;
        }

        public Criteria andDrugsTypeIDEqualTo(Integer value) {
            addCriterion("drugsTypeID =", value, "drugsTypeID");
            return (Criteria) this;
        }

        public Criteria andDrugsTypeIDNotEqualTo(Integer value) {
            addCriterion("drugsTypeID <>", value, "drugsTypeID");
            return (Criteria) this;
        }

        public Criteria andDrugsTypeIDGreaterThan(Integer value) {
            addCriterion("drugsTypeID >", value, "drugsTypeID");
            return (Criteria) this;
        }

        public Criteria andDrugsTypeIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("drugsTypeID >=", value, "drugsTypeID");
            return (Criteria) this;
        }

        public Criteria andDrugsTypeIDLessThan(Integer value) {
            addCriterion("drugsTypeID <", value, "drugsTypeID");
            return (Criteria) this;
        }

        public Criteria andDrugsTypeIDLessThanOrEqualTo(Integer value) {
            addCriterion("drugsTypeID <=", value, "drugsTypeID");
            return (Criteria) this;
        }

        public Criteria andDrugsTypeIDIn(List<Integer> values) {
            addCriterion("drugsTypeID in", values, "drugsTypeID");
            return (Criteria) this;
        }

        public Criteria andDrugsTypeIDNotIn(List<Integer> values) {
            addCriterion("drugsTypeID not in", values, "drugsTypeID");
            return (Criteria) this;
        }

        public Criteria andDrugsTypeIDBetween(Integer value1, Integer value2) {
            addCriterion("drugsTypeID between", value1, value2, "drugsTypeID");
            return (Criteria) this;
        }

        public Criteria andDrugsTypeIDNotBetween(Integer value1, Integer value2) {
            addCriterion("drugsTypeID not between", value1, value2, "drugsTypeID");
            return (Criteria) this;
        }

        public Criteria andDrugsPriceIsNull() {
            addCriterion("drugsPrice is null");
            return (Criteria) this;
        }

        public Criteria andDrugsPriceIsNotNull() {
            addCriterion("drugsPrice is not null");
            return (Criteria) this;
        }

        public Criteria andDrugsPriceEqualTo(BigDecimal value) {
            addCriterion("drugsPrice =", value, "drugsPrice");
            return (Criteria) this;
        }

        public Criteria andDrugsPriceNotEqualTo(BigDecimal value) {
            addCriterion("drugsPrice <>", value, "drugsPrice");
            return (Criteria) this;
        }

        public Criteria andDrugsPriceGreaterThan(BigDecimal value) {
            addCriterion("drugsPrice >", value, "drugsPrice");
            return (Criteria) this;
        }

        public Criteria andDrugsPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("drugsPrice >=", value, "drugsPrice");
            return (Criteria) this;
        }

        public Criteria andDrugsPriceLessThan(BigDecimal value) {
            addCriterion("drugsPrice <", value, "drugsPrice");
            return (Criteria) this;
        }

        public Criteria andDrugsPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("drugsPrice <=", value, "drugsPrice");
            return (Criteria) this;
        }

        public Criteria andDrugsPriceIn(List<BigDecimal> values) {
            addCriterion("drugsPrice in", values, "drugsPrice");
            return (Criteria) this;
        }

        public Criteria andDrugsPriceNotIn(List<BigDecimal> values) {
            addCriterion("drugsPrice not in", values, "drugsPrice");
            return (Criteria) this;
        }

        public Criteria andDrugsPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("drugsPrice between", value1, value2, "drugsPrice");
            return (Criteria) this;
        }

        public Criteria andDrugsPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("drugsPrice not between", value1, value2, "drugsPrice");
            return (Criteria) this;
        }

        public Criteria andConstIDIsNull() {
            addCriterion("constID is null");
            return (Criteria) this;
        }

        public Criteria andConstIDIsNotNull() {
            addCriterion("constID is not null");
            return (Criteria) this;
        }

        public Criteria andConstIDEqualTo(Integer value) {
            addCriterion("constID =", value, "constID");
            return (Criteria) this;
        }

        public Criteria andConstIDNotEqualTo(Integer value) {
            addCriterion("constID <>", value, "constID");
            return (Criteria) this;
        }

        public Criteria andConstIDGreaterThan(Integer value) {
            addCriterion("constID >", value, "constID");
            return (Criteria) this;
        }

        public Criteria andConstIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("constID >=", value, "constID");
            return (Criteria) this;
        }

        public Criteria andConstIDLessThan(Integer value) {
            addCriterion("constID <", value, "constID");
            return (Criteria) this;
        }

        public Criteria andConstIDLessThanOrEqualTo(Integer value) {
            addCriterion("constID <=", value, "constID");
            return (Criteria) this;
        }

        public Criteria andConstIDIn(List<Integer> values) {
            addCriterion("constID in", values, "constID");
            return (Criteria) this;
        }

        public Criteria andConstIDNotIn(List<Integer> values) {
            addCriterion("constID not in", values, "constID");
            return (Criteria) this;
        }

        public Criteria andConstIDBetween(Integer value1, Integer value2) {
            addCriterion("constID between", value1, value2, "constID");
            return (Criteria) this;
        }

        public Criteria andConstIDNotBetween(Integer value1, Integer value2) {
            addCriterion("constID not between", value1, value2, "constID");
            return (Criteria) this;
        }

        public Criteria andItemsTypeNameIsNull() {
            addCriterion("ItemsTypeName is null");
            return (Criteria) this;
        }

        public Criteria andItemsTypeNameIsNotNull() {
            addCriterion("ItemsTypeName is not null");
            return (Criteria) this;
        }

        public Criteria andItemsTypeNameEqualTo(String value) {
            addCriterion("ItemsTypeName =", value, "itemsTypeName");
            return (Criteria) this;
        }

        public Criteria andItemsTypeNameNotEqualTo(String value) {
            addCriterion("ItemsTypeName <>", value, "itemsTypeName");
            return (Criteria) this;
        }

        public Criteria andItemsTypeNameGreaterThan(String value) {
            addCriterion("ItemsTypeName >", value, "itemsTypeName");
            return (Criteria) this;
        }

        public Criteria andItemsTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("ItemsTypeName >=", value, "itemsTypeName");
            return (Criteria) this;
        }

        public Criteria andItemsTypeNameLessThan(String value) {
            addCriterion("ItemsTypeName <", value, "itemsTypeName");
            return (Criteria) this;
        }

        public Criteria andItemsTypeNameLessThanOrEqualTo(String value) {
            addCriterion("ItemsTypeName <=", value, "itemsTypeName");
            return (Criteria) this;
        }

        public Criteria andItemsTypeNameLike(String value) {
            addCriterion("ItemsTypeName like", value, "itemsTypeName");
            return (Criteria) this;
        }

        public Criteria andItemsTypeNameNotLike(String value) {
            addCriterion("ItemsTypeName not like", value, "itemsTypeName");
            return (Criteria) this;
        }

        public Criteria andItemsTypeNameIn(List<String> values) {
            addCriterion("ItemsTypeName in", values, "itemsTypeName");
            return (Criteria) this;
        }

        public Criteria andItemsTypeNameNotIn(List<String> values) {
            addCriterion("ItemsTypeName not in", values, "itemsTypeName");
            return (Criteria) this;
        }

        public Criteria andItemsTypeNameBetween(String value1, String value2) {
            addCriterion("ItemsTypeName between", value1, value2, "itemsTypeName");
            return (Criteria) this;
        }

        public Criteria andItemsTypeNameNotBetween(String value1, String value2) {
            addCriterion("ItemsTypeName not between", value1, value2, "itemsTypeName");
            return (Criteria) this;
        }

        public Criteria andMnemonicCodeIsNull() {
            addCriterion("mnemonicCode is null");
            return (Criteria) this;
        }

        public Criteria andMnemonicCodeIsNotNull() {
            addCriterion("mnemonicCode is not null");
            return (Criteria) this;
        }

        public Criteria andMnemonicCodeEqualTo(String value) {
            addCriterion("mnemonicCode =", value, "mnemonicCode");
            return (Criteria) this;
        }

        public Criteria andMnemonicCodeNotEqualTo(String value) {
            addCriterion("mnemonicCode <>", value, "mnemonicCode");
            return (Criteria) this;
        }

        public Criteria andMnemonicCodeGreaterThan(String value) {
            addCriterion("mnemonicCode >", value, "mnemonicCode");
            return (Criteria) this;
        }

        public Criteria andMnemonicCodeGreaterThanOrEqualTo(String value) {
            addCriterion("mnemonicCode >=", value, "mnemonicCode");
            return (Criteria) this;
        }

        public Criteria andMnemonicCodeLessThan(String value) {
            addCriterion("mnemonicCode <", value, "mnemonicCode");
            return (Criteria) this;
        }

        public Criteria andMnemonicCodeLessThanOrEqualTo(String value) {
            addCriterion("mnemonicCode <=", value, "mnemonicCode");
            return (Criteria) this;
        }

        public Criteria andMnemonicCodeLike(String value) {
            addCriterion("mnemonicCode like", value, "mnemonicCode");
            return (Criteria) this;
        }

        public Criteria andMnemonicCodeNotLike(String value) {
            addCriterion("mnemonicCode not like", value, "mnemonicCode");
            return (Criteria) this;
        }

        public Criteria andMnemonicCodeIn(List<String> values) {
            addCriterion("mnemonicCode in", values, "mnemonicCode");
            return (Criteria) this;
        }

        public Criteria andMnemonicCodeNotIn(List<String> values) {
            addCriterion("mnemonicCode not in", values, "mnemonicCode");
            return (Criteria) this;
        }

        public Criteria andMnemonicCodeBetween(String value1, String value2) {
            addCriterion("mnemonicCode between", value1, value2, "mnemonicCode");
            return (Criteria) this;
        }

        public Criteria andMnemonicCodeNotBetween(String value1, String value2) {
            addCriterion("mnemonicCode not between", value1, value2, "mnemonicCode");
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

        public Criteria andReimbursementIsNull() {
            addCriterion("reimbursement is null");
            return (Criteria) this;
        }

        public Criteria andReimbursementIsNotNull() {
            addCriterion("reimbursement is not null");
            return (Criteria) this;
        }

        public Criteria andReimbursementEqualTo(BigDecimal value) {
            addCriterion("reimbursement =", value, "reimbursement");
            return (Criteria) this;
        }

        public Criteria andReimbursementNotEqualTo(BigDecimal value) {
            addCriterion("reimbursement <>", value, "reimbursement");
            return (Criteria) this;
        }

        public Criteria andReimbursementGreaterThan(BigDecimal value) {
            addCriterion("reimbursement >", value, "reimbursement");
            return (Criteria) this;
        }

        public Criteria andReimbursementGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("reimbursement >=", value, "reimbursement");
            return (Criteria) this;
        }

        public Criteria andReimbursementLessThan(BigDecimal value) {
            addCriterion("reimbursement <", value, "reimbursement");
            return (Criteria) this;
        }

        public Criteria andReimbursementLessThanOrEqualTo(BigDecimal value) {
            addCriterion("reimbursement <=", value, "reimbursement");
            return (Criteria) this;
        }

        public Criteria andReimbursementIn(List<BigDecimal> values) {
            addCriterion("reimbursement in", values, "reimbursement");
            return (Criteria) this;
        }

        public Criteria andReimbursementNotIn(List<BigDecimal> values) {
            addCriterion("reimbursement not in", values, "reimbursement");
            return (Criteria) this;
        }

        public Criteria andReimbursementBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("reimbursement between", value1, value2, "reimbursement");
            return (Criteria) this;
        }

        public Criteria andReimbursementNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("reimbursement not between", value1, value2, "reimbursement");
            return (Criteria) this;
        }

        public Criteria andAppearRNameIsNull() {
            addCriterion("appearRName is null");
            return (Criteria) this;
        }

        public Criteria andAppearRNameIsNotNull() {
            addCriterion("appearRName is not null");
            return (Criteria) this;
        }

        public Criteria andAppearRNameEqualTo(String value) {
            addCriterion("appearRName =", value, "appearRName");
            return (Criteria) this;
        }

        public Criteria andAppearRNameNotEqualTo(String value) {
            addCriterion("appearRName <>", value, "appearRName");
            return (Criteria) this;
        }

        public Criteria andAppearRNameGreaterThan(String value) {
            addCriterion("appearRName >", value, "appearRName");
            return (Criteria) this;
        }

        public Criteria andAppearRNameGreaterThanOrEqualTo(String value) {
            addCriterion("appearRName >=", value, "appearRName");
            return (Criteria) this;
        }

        public Criteria andAppearRNameLessThan(String value) {
            addCriterion("appearRName <", value, "appearRName");
            return (Criteria) this;
        }

        public Criteria andAppearRNameLessThanOrEqualTo(String value) {
            addCriterion("appearRName <=", value, "appearRName");
            return (Criteria) this;
        }

        public Criteria andAppearRNameLike(String value) {
            addCriterion("appearRName like", value, "appearRName");
            return (Criteria) this;
        }

        public Criteria andAppearRNameNotLike(String value) {
            addCriterion("appearRName not like", value, "appearRName");
            return (Criteria) this;
        }

        public Criteria andAppearRNameIn(List<String> values) {
            addCriterion("appearRName in", values, "appearRName");
            return (Criteria) this;
        }

        public Criteria andAppearRNameNotIn(List<String> values) {
            addCriterion("appearRName not in", values, "appearRName");
            return (Criteria) this;
        }

        public Criteria andAppearRNameBetween(String value1, String value2) {
            addCriterion("appearRName between", value1, value2, "appearRName");
            return (Criteria) this;
        }

        public Criteria andAppearRNameNotBetween(String value1, String value2) {
            addCriterion("appearRName not between", value1, value2, "appearRName");
            return (Criteria) this;
        }

        public Criteria andChangeRNameIsNull() {
            addCriterion("changeRName is null");
            return (Criteria) this;
        }

        public Criteria andChangeRNameIsNotNull() {
            addCriterion("changeRName is not null");
            return (Criteria) this;
        }

        public Criteria andChangeRNameEqualTo(String value) {
            addCriterion("changeRName =", value, "changeRName");
            return (Criteria) this;
        }

        public Criteria andChangeRNameNotEqualTo(String value) {
            addCriterion("changeRName <>", value, "changeRName");
            return (Criteria) this;
        }

        public Criteria andChangeRNameGreaterThan(String value) {
            addCriterion("changeRName >", value, "changeRName");
            return (Criteria) this;
        }

        public Criteria andChangeRNameGreaterThanOrEqualTo(String value) {
            addCriterion("changeRName >=", value, "changeRName");
            return (Criteria) this;
        }

        public Criteria andChangeRNameLessThan(String value) {
            addCriterion("changeRName <", value, "changeRName");
            return (Criteria) this;
        }

        public Criteria andChangeRNameLessThanOrEqualTo(String value) {
            addCriterion("changeRName <=", value, "changeRName");
            return (Criteria) this;
        }

        public Criteria andChangeRNameLike(String value) {
            addCriterion("changeRName like", value, "changeRName");
            return (Criteria) this;
        }

        public Criteria andChangeRNameNotLike(String value) {
            addCriterion("changeRName not like", value, "changeRName");
            return (Criteria) this;
        }

        public Criteria andChangeRNameIn(List<String> values) {
            addCriterion("changeRName in", values, "changeRName");
            return (Criteria) this;
        }

        public Criteria andChangeRNameNotIn(List<String> values) {
            addCriterion("changeRName not in", values, "changeRName");
            return (Criteria) this;
        }

        public Criteria andChangeRNameBetween(String value1, String value2) {
            addCriterion("changeRName between", value1, value2, "changeRName");
            return (Criteria) this;
        }

        public Criteria andChangeRNameNotBetween(String value1, String value2) {
            addCriterion("changeRName not between", value1, value2, "changeRName");
            return (Criteria) this;
        }

        public Criteria andFmedItemIDIsNull() {
            addCriterion("FmedItemID is null");
            return (Criteria) this;
        }

        public Criteria andFmedItemIDIsNotNull() {
            addCriterion("FmedItemID is not null");
            return (Criteria) this;
        }

        public Criteria andFmedItemIDEqualTo(Integer value) {
            addCriterion("FmedItemID =", value, "fmedItemID");
            return (Criteria) this;
        }

        public Criteria andFmedItemIDNotEqualTo(Integer value) {
            addCriterion("FmedItemID <>", value, "fmedItemID");
            return (Criteria) this;
        }

        public Criteria andFmedItemIDGreaterThan(Integer value) {
            addCriterion("FmedItemID >", value, "fmedItemID");
            return (Criteria) this;
        }

        public Criteria andFmedItemIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("FmedItemID >=", value, "fmedItemID");
            return (Criteria) this;
        }

        public Criteria andFmedItemIDLessThan(Integer value) {
            addCriterion("FmedItemID <", value, "fmedItemID");
            return (Criteria) this;
        }

        public Criteria andFmedItemIDLessThanOrEqualTo(Integer value) {
            addCriterion("FmedItemID <=", value, "fmedItemID");
            return (Criteria) this;
        }

        public Criteria andFmedItemIDIn(List<Integer> values) {
            addCriterion("FmedItemID in", values, "fmedItemID");
            return (Criteria) this;
        }

        public Criteria andFmedItemIDNotIn(List<Integer> values) {
            addCriterion("FmedItemID not in", values, "fmedItemID");
            return (Criteria) this;
        }

        public Criteria andFmedItemIDBetween(Integer value1, Integer value2) {
            addCriterion("FmedItemID between", value1, value2, "fmedItemID");
            return (Criteria) this;
        }

        public Criteria andFmedItemIDNotBetween(Integer value1, Integer value2) {
            addCriterion("FmedItemID not between", value1, value2, "fmedItemID");
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

        public Criteria andDrawnNameIsNull() {
            addCriterion("drawnName is null");
            return (Criteria) this;
        }

        public Criteria andDrawnNameIsNotNull() {
            addCriterion("drawnName is not null");
            return (Criteria) this;
        }

        public Criteria andDrawnNameEqualTo(String value) {
            addCriterion("drawnName =", value, "drawnName");
            return (Criteria) this;
        }

        public Criteria andDrawnNameNotEqualTo(String value) {
            addCriterion("drawnName <>", value, "drawnName");
            return (Criteria) this;
        }

        public Criteria andDrawnNameGreaterThan(String value) {
            addCriterion("drawnName >", value, "drawnName");
            return (Criteria) this;
        }

        public Criteria andDrawnNameGreaterThanOrEqualTo(String value) {
            addCriterion("drawnName >=", value, "drawnName");
            return (Criteria) this;
        }

        public Criteria andDrawnNameLessThan(String value) {
            addCriterion("drawnName <", value, "drawnName");
            return (Criteria) this;
        }

        public Criteria andDrawnNameLessThanOrEqualTo(String value) {
            addCriterion("drawnName <=", value, "drawnName");
            return (Criteria) this;
        }

        public Criteria andDrawnNameLike(String value) {
            addCriterion("drawnName like", value, "drawnName");
            return (Criteria) this;
        }

        public Criteria andDrawnNameNotLike(String value) {
            addCriterion("drawnName not like", value, "drawnName");
            return (Criteria) this;
        }

        public Criteria andDrawnNameIn(List<String> values) {
            addCriterion("drawnName in", values, "drawnName");
            return (Criteria) this;
        }

        public Criteria andDrawnNameNotIn(List<String> values) {
            addCriterion("drawnName not in", values, "drawnName");
            return (Criteria) this;
        }

        public Criteria andDrawnNameBetween(String value1, String value2) {
            addCriterion("drawnName between", value1, value2, "drawnName");
            return (Criteria) this;
        }

        public Criteria andDrawnNameNotBetween(String value1, String value2) {
            addCriterion("drawnName not between", value1, value2, "drawnName");
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

        public Criteria andAbolishedNameIsNull() {
            addCriterion("AbolishedName is null");
            return (Criteria) this;
        }

        public Criteria andAbolishedNameIsNotNull() {
            addCriterion("AbolishedName is not null");
            return (Criteria) this;
        }

        public Criteria andAbolishedNameEqualTo(String value) {
            addCriterion("AbolishedName =", value, "abolishedName");
            return (Criteria) this;
        }

        public Criteria andAbolishedNameNotEqualTo(String value) {
            addCriterion("AbolishedName <>", value, "abolishedName");
            return (Criteria) this;
        }

        public Criteria andAbolishedNameGreaterThan(String value) {
            addCriterion("AbolishedName >", value, "abolishedName");
            return (Criteria) this;
        }

        public Criteria andAbolishedNameGreaterThanOrEqualTo(String value) {
            addCriterion("AbolishedName >=", value, "abolishedName");
            return (Criteria) this;
        }

        public Criteria andAbolishedNameLessThan(String value) {
            addCriterion("AbolishedName <", value, "abolishedName");
            return (Criteria) this;
        }

        public Criteria andAbolishedNameLessThanOrEqualTo(String value) {
            addCriterion("AbolishedName <=", value, "abolishedName");
            return (Criteria) this;
        }

        public Criteria andAbolishedNameLike(String value) {
            addCriterion("AbolishedName like", value, "abolishedName");
            return (Criteria) this;
        }

        public Criteria andAbolishedNameNotLike(String value) {
            addCriterion("AbolishedName not like", value, "abolishedName");
            return (Criteria) this;
        }

        public Criteria andAbolishedNameIn(List<String> values) {
            addCriterion("AbolishedName in", values, "abolishedName");
            return (Criteria) this;
        }

        public Criteria andAbolishedNameNotIn(List<String> values) {
            addCriterion("AbolishedName not in", values, "abolishedName");
            return (Criteria) this;
        }

        public Criteria andAbolishedNameBetween(String value1, String value2) {
            addCriterion("AbolishedName between", value1, value2, "abolishedName");
            return (Criteria) this;
        }

        public Criteria andAbolishedNameNotBetween(String value1, String value2) {
            addCriterion("AbolishedName not between", value1, value2, "abolishedName");
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

        public Criteria andDrugsDosageNameIsNull() {
            addCriterion("drugsDosageName is null");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageNameIsNotNull() {
            addCriterion("drugsDosageName is not null");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageNameEqualTo(String value) {
            addCriterion("drugsDosageName =", value, "drugsDosageName");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageNameNotEqualTo(String value) {
            addCriterion("drugsDosageName <>", value, "drugsDosageName");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageNameGreaterThan(String value) {
            addCriterion("drugsDosageName >", value, "drugsDosageName");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageNameGreaterThanOrEqualTo(String value) {
            addCriterion("drugsDosageName >=", value, "drugsDosageName");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageNameLessThan(String value) {
            addCriterion("drugsDosageName <", value, "drugsDosageName");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageNameLessThanOrEqualTo(String value) {
            addCriterion("drugsDosageName <=", value, "drugsDosageName");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageNameLike(String value) {
            addCriterion("drugsDosageName like", value, "drugsDosageName");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageNameNotLike(String value) {
            addCriterion("drugsDosageName not like", value, "drugsDosageName");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageNameIn(List<String> values) {
            addCriterion("drugsDosageName in", values, "drugsDosageName");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageNameNotIn(List<String> values) {
            addCriterion("drugsDosageName not in", values, "drugsDosageName");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageNameBetween(String value1, String value2) {
            addCriterion("drugsDosageName between", value1, value2, "drugsDosageName");
            return (Criteria) this;
        }

        public Criteria andDrugsDosageNameNotBetween(String value1, String value2) {
            addCriterion("drugsDosageName not between", value1, value2, "drugsDosageName");
            return (Criteria) this;
        }

        public Criteria andDrugsTypeNameIsNull() {
            addCriterion("drugsTypeName is null");
            return (Criteria) this;
        }

        public Criteria andDrugsTypeNameIsNotNull() {
            addCriterion("drugsTypeName is not null");
            return (Criteria) this;
        }

        public Criteria andDrugsTypeNameEqualTo(String value) {
            addCriterion("drugsTypeName =", value, "drugsTypeName");
            return (Criteria) this;
        }

        public Criteria andDrugsTypeNameNotEqualTo(String value) {
            addCriterion("drugsTypeName <>", value, "drugsTypeName");
            return (Criteria) this;
        }

        public Criteria andDrugsTypeNameGreaterThan(String value) {
            addCriterion("drugsTypeName >", value, "drugsTypeName");
            return (Criteria) this;
        }

        public Criteria andDrugsTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("drugsTypeName >=", value, "drugsTypeName");
            return (Criteria) this;
        }

        public Criteria andDrugsTypeNameLessThan(String value) {
            addCriterion("drugsTypeName <", value, "drugsTypeName");
            return (Criteria) this;
        }

        public Criteria andDrugsTypeNameLessThanOrEqualTo(String value) {
            addCriterion("drugsTypeName <=", value, "drugsTypeName");
            return (Criteria) this;
        }

        public Criteria andDrugsTypeNameLike(String value) {
            addCriterion("drugsTypeName like", value, "drugsTypeName");
            return (Criteria) this;
        }

        public Criteria andDrugsTypeNameNotLike(String value) {
            addCriterion("drugsTypeName not like", value, "drugsTypeName");
            return (Criteria) this;
        }

        public Criteria andDrugsTypeNameIn(List<String> values) {
            addCriterion("drugsTypeName in", values, "drugsTypeName");
            return (Criteria) this;
        }

        public Criteria andDrugsTypeNameNotIn(List<String> values) {
            addCriterion("drugsTypeName not in", values, "drugsTypeName");
            return (Criteria) this;
        }

        public Criteria andDrugsTypeNameBetween(String value1, String value2) {
            addCriterion("drugsTypeName between", value1, value2, "drugsTypeName");
            return (Criteria) this;
        }

        public Criteria andDrugsTypeNameNotBetween(String value1, String value2) {
            addCriterion("drugsTypeName not between", value1, value2, "drugsTypeName");
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