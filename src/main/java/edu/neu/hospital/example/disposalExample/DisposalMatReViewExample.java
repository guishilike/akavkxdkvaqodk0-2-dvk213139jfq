package edu.neu.hospital.example.disposalExample;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DisposalMatReViewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public DisposalMatReViewExample() {
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

        public Criteria andConstantNameIsNull() {
            addCriterion("constantName is null");
            return (Criteria) this;
        }

        public Criteria andConstantNameIsNotNull() {
            addCriterion("constantName is not null");
            return (Criteria) this;
        }

        public Criteria andConstantNameEqualTo(String value) {
            addCriterion("constantName =", value, "constantName");
            return (Criteria) this;
        }

        public Criteria andConstantNameNotEqualTo(String value) {
            addCriterion("constantName <>", value, "constantName");
            return (Criteria) this;
        }

        public Criteria andConstantNameGreaterThan(String value) {
            addCriterion("constantName >", value, "constantName");
            return (Criteria) this;
        }

        public Criteria andConstantNameGreaterThanOrEqualTo(String value) {
            addCriterion("constantName >=", value, "constantName");
            return (Criteria) this;
        }

        public Criteria andConstantNameLessThan(String value) {
            addCriterion("constantName <", value, "constantName");
            return (Criteria) this;
        }

        public Criteria andConstantNameLessThanOrEqualTo(String value) {
            addCriterion("constantName <=", value, "constantName");
            return (Criteria) this;
        }

        public Criteria andConstantNameLike(String value) {
            addCriterion("constantName like", value, "constantName");
            return (Criteria) this;
        }

        public Criteria andConstantNameNotLike(String value) {
            addCriterion("constantName not like", value, "constantName");
            return (Criteria) this;
        }

        public Criteria andConstantNameIn(List<String> values) {
            addCriterion("constantName in", values, "constantName");
            return (Criteria) this;
        }

        public Criteria andConstantNameNotIn(List<String> values) {
            addCriterion("constantName not in", values, "constantName");
            return (Criteria) this;
        }

        public Criteria andConstantNameBetween(String value1, String value2) {
            addCriterion("constantName between", value1, value2, "constantName");
            return (Criteria) this;
        }

        public Criteria andConstantNameNotBetween(String value1, String value2) {
            addCriterion("constantName not between", value1, value2, "constantName");
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

        public Criteria andCreatRNameIsNull() {
            addCriterion("creatRName is null");
            return (Criteria) this;
        }

        public Criteria andCreatRNameIsNotNull() {
            addCriterion("creatRName is not null");
            return (Criteria) this;
        }

        public Criteria andCreatRNameEqualTo(String value) {
            addCriterion("creatRName =", value, "creatRName");
            return (Criteria) this;
        }

        public Criteria andCreatRNameNotEqualTo(String value) {
            addCriterion("creatRName <>", value, "creatRName");
            return (Criteria) this;
        }

        public Criteria andCreatRNameGreaterThan(String value) {
            addCriterion("creatRName >", value, "creatRName");
            return (Criteria) this;
        }

        public Criteria andCreatRNameGreaterThanOrEqualTo(String value) {
            addCriterion("creatRName >=", value, "creatRName");
            return (Criteria) this;
        }

        public Criteria andCreatRNameLessThan(String value) {
            addCriterion("creatRName <", value, "creatRName");
            return (Criteria) this;
        }

        public Criteria andCreatRNameLessThanOrEqualTo(String value) {
            addCriterion("creatRName <=", value, "creatRName");
            return (Criteria) this;
        }

        public Criteria andCreatRNameLike(String value) {
            addCriterion("creatRName like", value, "creatRName");
            return (Criteria) this;
        }

        public Criteria andCreatRNameNotLike(String value) {
            addCriterion("creatRName not like", value, "creatRName");
            return (Criteria) this;
        }

        public Criteria andCreatRNameIn(List<String> values) {
            addCriterion("creatRName in", values, "creatRName");
            return (Criteria) this;
        }

        public Criteria andCreatRNameNotIn(List<String> values) {
            addCriterion("creatRName not in", values, "creatRName");
            return (Criteria) this;
        }

        public Criteria andCreatRNameBetween(String value1, String value2) {
            addCriterion("creatRName between", value1, value2, "creatRName");
            return (Criteria) this;
        }

        public Criteria andCreatRNameNotBetween(String value1, String value2) {
            addCriterion("creatRName not between", value1, value2, "creatRName");
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

        public Criteria andMatIDIsNull() {
            addCriterion("matID is null");
            return (Criteria) this;
        }

        public Criteria andMatIDIsNotNull() {
            addCriterion("matID is not null");
            return (Criteria) this;
        }

        public Criteria andMatIDEqualTo(Integer value) {
            addCriterion("matID =", value, "matID");
            return (Criteria) this;
        }

        public Criteria andMatIDNotEqualTo(Integer value) {
            addCriterion("matID <>", value, "matID");
            return (Criteria) this;
        }

        public Criteria andMatIDGreaterThan(Integer value) {
            addCriterion("matID >", value, "matID");
            return (Criteria) this;
        }

        public Criteria andMatIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("matID >=", value, "matID");
            return (Criteria) this;
        }

        public Criteria andMatIDLessThan(Integer value) {
            addCriterion("matID <", value, "matID");
            return (Criteria) this;
        }

        public Criteria andMatIDLessThanOrEqualTo(Integer value) {
            addCriterion("matID <=", value, "matID");
            return (Criteria) this;
        }

        public Criteria andMatIDIn(List<Integer> values) {
            addCriterion("matID in", values, "matID");
            return (Criteria) this;
        }

        public Criteria andMatIDNotIn(List<Integer> values) {
            addCriterion("matID not in", values, "matID");
            return (Criteria) this;
        }

        public Criteria andMatIDBetween(Integer value1, Integer value2) {
            addCriterion("matID between", value1, value2, "matID");
            return (Criteria) this;
        }

        public Criteria andMatIDNotBetween(Integer value1, Integer value2) {
            addCriterion("matID not between", value1, value2, "matID");
            return (Criteria) this;
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

        public Criteria andFormatIsNull() {
            addCriterion("format is null");
            return (Criteria) this;
        }

        public Criteria andFormatIsNotNull() {
            addCriterion("format is not null");
            return (Criteria) this;
        }

        public Criteria andFormatEqualTo(String value) {
            addCriterion("format =", value, "format");
            return (Criteria) this;
        }

        public Criteria andFormatNotEqualTo(String value) {
            addCriterion("format <>", value, "format");
            return (Criteria) this;
        }

        public Criteria andFormatGreaterThan(String value) {
            addCriterion("format >", value, "format");
            return (Criteria) this;
        }

        public Criteria andFormatGreaterThanOrEqualTo(String value) {
            addCriterion("format >=", value, "format");
            return (Criteria) this;
        }

        public Criteria andFormatLessThan(String value) {
            addCriterion("format <", value, "format");
            return (Criteria) this;
        }

        public Criteria andFormatLessThanOrEqualTo(String value) {
            addCriterion("format <=", value, "format");
            return (Criteria) this;
        }

        public Criteria andFormatLike(String value) {
            addCriterion("format like", value, "format");
            return (Criteria) this;
        }

        public Criteria andFormatNotLike(String value) {
            addCriterion("format not like", value, "format");
            return (Criteria) this;
        }

        public Criteria andFormatIn(List<String> values) {
            addCriterion("format in", values, "format");
            return (Criteria) this;
        }

        public Criteria andFormatNotIn(List<String> values) {
            addCriterion("format not in", values, "format");
            return (Criteria) this;
        }

        public Criteria andFormatBetween(String value1, String value2) {
            addCriterion("format between", value1, value2, "format");
            return (Criteria) this;
        }

        public Criteria andFormatNotBetween(String value1, String value2) {
            addCriterion("format not between", value1, value2, "format");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
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