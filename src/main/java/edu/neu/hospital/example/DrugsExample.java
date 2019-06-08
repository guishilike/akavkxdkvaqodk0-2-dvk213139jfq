package edu.neu.hospital.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DrugsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public DrugsExample() {
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

        public Criteria andDrugscodeIsNull() {
            addCriterion("drugsCode is null");
            return (Criteria) this;
        }

        public Criteria andDrugscodeIsNotNull() {
            addCriterion("drugsCode is not null");
            return (Criteria) this;
        }

        public Criteria andDrugscodeEqualTo(String value) {
            addCriterion("drugsCode =", value, "drugscode");
            return (Criteria) this;
        }

        public Criteria andDrugscodeNotEqualTo(String value) {
            addCriterion("drugsCode <>", value, "drugscode");
            return (Criteria) this;
        }

        public Criteria andDrugscodeGreaterThan(String value) {
            addCriterion("drugsCode >", value, "drugscode");
            return (Criteria) this;
        }

        public Criteria andDrugscodeGreaterThanOrEqualTo(String value) {
            addCriterion("drugsCode >=", value, "drugscode");
            return (Criteria) this;
        }

        public Criteria andDrugscodeLessThan(String value) {
            addCriterion("drugsCode <", value, "drugscode");
            return (Criteria) this;
        }

        public Criteria andDrugscodeLessThanOrEqualTo(String value) {
            addCriterion("drugsCode <=", value, "drugscode");
            return (Criteria) this;
        }

        public Criteria andDrugscodeLike(String value) {
            addCriterion("drugsCode like", value, "drugscode");
            return (Criteria) this;
        }

        public Criteria andDrugscodeNotLike(String value) {
            addCriterion("drugsCode not like", value, "drugscode");
            return (Criteria) this;
        }

        public Criteria andDrugscodeIn(List<String> values) {
            addCriterion("drugsCode in", values, "drugscode");
            return (Criteria) this;
        }

        public Criteria andDrugscodeNotIn(List<String> values) {
            addCriterion("drugsCode not in", values, "drugscode");
            return (Criteria) this;
        }

        public Criteria andDrugscodeBetween(String value1, String value2) {
            addCriterion("drugsCode between", value1, value2, "drugscode");
            return (Criteria) this;
        }

        public Criteria andDrugscodeNotBetween(String value1, String value2) {
            addCriterion("drugsCode not between", value1, value2, "drugscode");
            return (Criteria) this;
        }

        public Criteria andDrugsnameIsNull() {
            addCriterion("drugsName is null");
            return (Criteria) this;
        }

        public Criteria andDrugsnameIsNotNull() {
            addCriterion("drugsName is not null");
            return (Criteria) this;
        }

        public Criteria andDrugsnameEqualTo(String value) {
            addCriterion("drugsName =", value, "drugsname");
            return (Criteria) this;
        }

        public Criteria andDrugsnameNotEqualTo(String value) {
            addCriterion("drugsName <>", value, "drugsname");
            return (Criteria) this;
        }

        public Criteria andDrugsnameGreaterThan(String value) {
            addCriterion("drugsName >", value, "drugsname");
            return (Criteria) this;
        }

        public Criteria andDrugsnameGreaterThanOrEqualTo(String value) {
            addCriterion("drugsName >=", value, "drugsname");
            return (Criteria) this;
        }

        public Criteria andDrugsnameLessThan(String value) {
            addCriterion("drugsName <", value, "drugsname");
            return (Criteria) this;
        }

        public Criteria andDrugsnameLessThanOrEqualTo(String value) {
            addCriterion("drugsName <=", value, "drugsname");
            return (Criteria) this;
        }

        public Criteria andDrugsnameLike(String value) {
            addCriterion("drugsName like", value, "drugsname");
            return (Criteria) this;
        }

        public Criteria andDrugsnameNotLike(String value) {
            addCriterion("drugsName not like", value, "drugsname");
            return (Criteria) this;
        }

        public Criteria andDrugsnameIn(List<String> values) {
            addCriterion("drugsName in", values, "drugsname");
            return (Criteria) this;
        }

        public Criteria andDrugsnameNotIn(List<String> values) {
            addCriterion("drugsName not in", values, "drugsname");
            return (Criteria) this;
        }

        public Criteria andDrugsnameBetween(String value1, String value2) {
            addCriterion("drugsName between", value1, value2, "drugsname");
            return (Criteria) this;
        }

        public Criteria andDrugsnameNotBetween(String value1, String value2) {
            addCriterion("drugsName not between", value1, value2, "drugsname");
            return (Criteria) this;
        }

        public Criteria andDrugsformatIsNull() {
            addCriterion("drugsFormat is null");
            return (Criteria) this;
        }

        public Criteria andDrugsformatIsNotNull() {
            addCriterion("drugsFormat is not null");
            return (Criteria) this;
        }

        public Criteria andDrugsformatEqualTo(String value) {
            addCriterion("drugsFormat =", value, "drugsformat");
            return (Criteria) this;
        }

        public Criteria andDrugsformatNotEqualTo(String value) {
            addCriterion("drugsFormat <>", value, "drugsformat");
            return (Criteria) this;
        }

        public Criteria andDrugsformatGreaterThan(String value) {
            addCriterion("drugsFormat >", value, "drugsformat");
            return (Criteria) this;
        }

        public Criteria andDrugsformatGreaterThanOrEqualTo(String value) {
            addCriterion("drugsFormat >=", value, "drugsformat");
            return (Criteria) this;
        }

        public Criteria andDrugsformatLessThan(String value) {
            addCriterion("drugsFormat <", value, "drugsformat");
            return (Criteria) this;
        }

        public Criteria andDrugsformatLessThanOrEqualTo(String value) {
            addCriterion("drugsFormat <=", value, "drugsformat");
            return (Criteria) this;
        }

        public Criteria andDrugsformatLike(String value) {
            addCriterion("drugsFormat like", value, "drugsformat");
            return (Criteria) this;
        }

        public Criteria andDrugsformatNotLike(String value) {
            addCriterion("drugsFormat not like", value, "drugsformat");
            return (Criteria) this;
        }

        public Criteria andDrugsformatIn(List<String> values) {
            addCriterion("drugsFormat in", values, "drugsformat");
            return (Criteria) this;
        }

        public Criteria andDrugsformatNotIn(List<String> values) {
            addCriterion("drugsFormat not in", values, "drugsformat");
            return (Criteria) this;
        }

        public Criteria andDrugsformatBetween(String value1, String value2) {
            addCriterion("drugsFormat between", value1, value2, "drugsformat");
            return (Criteria) this;
        }

        public Criteria andDrugsformatNotBetween(String value1, String value2) {
            addCriterion("drugsFormat not between", value1, value2, "drugsformat");
            return (Criteria) this;
        }

        public Criteria andDrugsunitIsNull() {
            addCriterion("drugsUnit is null");
            return (Criteria) this;
        }

        public Criteria andDrugsunitIsNotNull() {
            addCriterion("drugsUnit is not null");
            return (Criteria) this;
        }

        public Criteria andDrugsunitEqualTo(String value) {
            addCriterion("drugsUnit =", value, "drugsunit");
            return (Criteria) this;
        }

        public Criteria andDrugsunitNotEqualTo(String value) {
            addCriterion("drugsUnit <>", value, "drugsunit");
            return (Criteria) this;
        }

        public Criteria andDrugsunitGreaterThan(String value) {
            addCriterion("drugsUnit >", value, "drugsunit");
            return (Criteria) this;
        }

        public Criteria andDrugsunitGreaterThanOrEqualTo(String value) {
            addCriterion("drugsUnit >=", value, "drugsunit");
            return (Criteria) this;
        }

        public Criteria andDrugsunitLessThan(String value) {
            addCriterion("drugsUnit <", value, "drugsunit");
            return (Criteria) this;
        }

        public Criteria andDrugsunitLessThanOrEqualTo(String value) {
            addCriterion("drugsUnit <=", value, "drugsunit");
            return (Criteria) this;
        }

        public Criteria andDrugsunitLike(String value) {
            addCriterion("drugsUnit like", value, "drugsunit");
            return (Criteria) this;
        }

        public Criteria andDrugsunitNotLike(String value) {
            addCriterion("drugsUnit not like", value, "drugsunit");
            return (Criteria) this;
        }

        public Criteria andDrugsunitIn(List<String> values) {
            addCriterion("drugsUnit in", values, "drugsunit");
            return (Criteria) this;
        }

        public Criteria andDrugsunitNotIn(List<String> values) {
            addCriterion("drugsUnit not in", values, "drugsunit");
            return (Criteria) this;
        }

        public Criteria andDrugsunitBetween(String value1, String value2) {
            addCriterion("drugsUnit between", value1, value2, "drugsunit");
            return (Criteria) this;
        }

        public Criteria andDrugsunitNotBetween(String value1, String value2) {
            addCriterion("drugsUnit not between", value1, value2, "drugsunit");
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

        public Criteria andDrugsdosageidIsNull() {
            addCriterion("drugsDosageID is null");
            return (Criteria) this;
        }

        public Criteria andDrugsdosageidIsNotNull() {
            addCriterion("drugsDosageID is not null");
            return (Criteria) this;
        }

        public Criteria andDrugsdosageidEqualTo(Integer value) {
            addCriterion("drugsDosageID =", value, "drugsdosageid");
            return (Criteria) this;
        }

        public Criteria andDrugsdosageidNotEqualTo(Integer value) {
            addCriterion("drugsDosageID <>", value, "drugsdosageid");
            return (Criteria) this;
        }

        public Criteria andDrugsdosageidGreaterThan(Integer value) {
            addCriterion("drugsDosageID >", value, "drugsdosageid");
            return (Criteria) this;
        }

        public Criteria andDrugsdosageidGreaterThanOrEqualTo(Integer value) {
            addCriterion("drugsDosageID >=", value, "drugsdosageid");
            return (Criteria) this;
        }

        public Criteria andDrugsdosageidLessThan(Integer value) {
            addCriterion("drugsDosageID <", value, "drugsdosageid");
            return (Criteria) this;
        }

        public Criteria andDrugsdosageidLessThanOrEqualTo(Integer value) {
            addCriterion("drugsDosageID <=", value, "drugsdosageid");
            return (Criteria) this;
        }

        public Criteria andDrugsdosageidIn(List<Integer> values) {
            addCriterion("drugsDosageID in", values, "drugsdosageid");
            return (Criteria) this;
        }

        public Criteria andDrugsdosageidNotIn(List<Integer> values) {
            addCriterion("drugsDosageID not in", values, "drugsdosageid");
            return (Criteria) this;
        }

        public Criteria andDrugsdosageidBetween(Integer value1, Integer value2) {
            addCriterion("drugsDosageID between", value1, value2, "drugsdosageid");
            return (Criteria) this;
        }

        public Criteria andDrugsdosageidNotBetween(Integer value1, Integer value2) {
            addCriterion("drugsDosageID not between", value1, value2, "drugsdosageid");
            return (Criteria) this;
        }

        public Criteria andDrugstypeidIsNull() {
            addCriterion("drugsTypeID is null");
            return (Criteria) this;
        }

        public Criteria andDrugstypeidIsNotNull() {
            addCriterion("drugsTypeID is not null");
            return (Criteria) this;
        }

        public Criteria andDrugstypeidEqualTo(Integer value) {
            addCriterion("drugsTypeID =", value, "drugstypeid");
            return (Criteria) this;
        }

        public Criteria andDrugstypeidNotEqualTo(Integer value) {
            addCriterion("drugsTypeID <>", value, "drugstypeid");
            return (Criteria) this;
        }

        public Criteria andDrugstypeidGreaterThan(Integer value) {
            addCriterion("drugsTypeID >", value, "drugstypeid");
            return (Criteria) this;
        }

        public Criteria andDrugstypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("drugsTypeID >=", value, "drugstypeid");
            return (Criteria) this;
        }

        public Criteria andDrugstypeidLessThan(Integer value) {
            addCriterion("drugsTypeID <", value, "drugstypeid");
            return (Criteria) this;
        }

        public Criteria andDrugstypeidLessThanOrEqualTo(Integer value) {
            addCriterion("drugsTypeID <=", value, "drugstypeid");
            return (Criteria) this;
        }

        public Criteria andDrugstypeidIn(List<Integer> values) {
            addCriterion("drugsTypeID in", values, "drugstypeid");
            return (Criteria) this;
        }

        public Criteria andDrugstypeidNotIn(List<Integer> values) {
            addCriterion("drugsTypeID not in", values, "drugstypeid");
            return (Criteria) this;
        }

        public Criteria andDrugstypeidBetween(Integer value1, Integer value2) {
            addCriterion("drugsTypeID between", value1, value2, "drugstypeid");
            return (Criteria) this;
        }

        public Criteria andDrugstypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("drugsTypeID not between", value1, value2, "drugstypeid");
            return (Criteria) this;
        }

        public Criteria andDrugspriceIsNull() {
            addCriterion("drugsPrice is null");
            return (Criteria) this;
        }

        public Criteria andDrugspriceIsNotNull() {
            addCriterion("drugsPrice is not null");
            return (Criteria) this;
        }

        public Criteria andDrugspriceEqualTo(BigDecimal value) {
            addCriterion("drugsPrice =", value, "drugsprice");
            return (Criteria) this;
        }

        public Criteria andDrugspriceNotEqualTo(BigDecimal value) {
            addCriterion("drugsPrice <>", value, "drugsprice");
            return (Criteria) this;
        }

        public Criteria andDrugspriceGreaterThan(BigDecimal value) {
            addCriterion("drugsPrice >", value, "drugsprice");
            return (Criteria) this;
        }

        public Criteria andDrugspriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("drugsPrice >=", value, "drugsprice");
            return (Criteria) this;
        }

        public Criteria andDrugspriceLessThan(BigDecimal value) {
            addCriterion("drugsPrice <", value, "drugsprice");
            return (Criteria) this;
        }

        public Criteria andDrugspriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("drugsPrice <=", value, "drugsprice");
            return (Criteria) this;
        }

        public Criteria andDrugspriceIn(List<BigDecimal> values) {
            addCriterion("drugsPrice in", values, "drugsprice");
            return (Criteria) this;
        }

        public Criteria andDrugspriceNotIn(List<BigDecimal> values) {
            addCriterion("drugsPrice not in", values, "drugsprice");
            return (Criteria) this;
        }

        public Criteria andDrugspriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("drugsPrice between", value1, value2, "drugsprice");
            return (Criteria) this;
        }

        public Criteria andDrugspriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("drugsPrice not between", value1, value2, "drugsprice");
            return (Criteria) this;
        }

        public Criteria andMnemoniccodeIsNull() {
            addCriterion("mnemonicCode is null");
            return (Criteria) this;
        }

        public Criteria andMnemoniccodeIsNotNull() {
            addCriterion("mnemonicCode is not null");
            return (Criteria) this;
        }

        public Criteria andMnemoniccodeEqualTo(String value) {
            addCriterion("mnemonicCode =", value, "mnemoniccode");
            return (Criteria) this;
        }

        public Criteria andMnemoniccodeNotEqualTo(String value) {
            addCriterion("mnemonicCode <>", value, "mnemoniccode");
            return (Criteria) this;
        }

        public Criteria andMnemoniccodeGreaterThan(String value) {
            addCriterion("mnemonicCode >", value, "mnemoniccode");
            return (Criteria) this;
        }

        public Criteria andMnemoniccodeGreaterThanOrEqualTo(String value) {
            addCriterion("mnemonicCode >=", value, "mnemoniccode");
            return (Criteria) this;
        }

        public Criteria andMnemoniccodeLessThan(String value) {
            addCriterion("mnemonicCode <", value, "mnemoniccode");
            return (Criteria) this;
        }

        public Criteria andMnemoniccodeLessThanOrEqualTo(String value) {
            addCriterion("mnemonicCode <=", value, "mnemoniccode");
            return (Criteria) this;
        }

        public Criteria andMnemoniccodeLike(String value) {
            addCriterion("mnemonicCode like", value, "mnemoniccode");
            return (Criteria) this;
        }

        public Criteria andMnemoniccodeNotLike(String value) {
            addCriterion("mnemonicCode not like", value, "mnemoniccode");
            return (Criteria) this;
        }

        public Criteria andMnemoniccodeIn(List<String> values) {
            addCriterion("mnemonicCode in", values, "mnemoniccode");
            return (Criteria) this;
        }

        public Criteria andMnemoniccodeNotIn(List<String> values) {
            addCriterion("mnemonicCode not in", values, "mnemoniccode");
            return (Criteria) this;
        }

        public Criteria andMnemoniccodeBetween(String value1, String value2) {
            addCriterion("mnemonicCode between", value1, value2, "mnemoniccode");
            return (Criteria) this;
        }

        public Criteria andMnemoniccodeNotBetween(String value1, String value2) {
            addCriterion("mnemonicCode not between", value1, value2, "mnemoniccode");
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

        public Criteria andAppeardateIsNull() {
            addCriterion("appearDate is null");
            return (Criteria) this;
        }

        public Criteria andAppeardateIsNotNull() {
            addCriterion("appearDate is not null");
            return (Criteria) this;
        }

        public Criteria andAppeardateEqualTo(Date value) {
            addCriterion("appearDate =", value, "appeardate");
            return (Criteria) this;
        }

        public Criteria andAppeardateNotEqualTo(Date value) {
            addCriterion("appearDate <>", value, "appeardate");
            return (Criteria) this;
        }

        public Criteria andAppeardateGreaterThan(Date value) {
            addCriterion("appearDate >", value, "appeardate");
            return (Criteria) this;
        }

        public Criteria andAppeardateGreaterThanOrEqualTo(Date value) {
            addCriterion("appearDate >=", value, "appeardate");
            return (Criteria) this;
        }

        public Criteria andAppeardateLessThan(Date value) {
            addCriterion("appearDate <", value, "appeardate");
            return (Criteria) this;
        }

        public Criteria andAppeardateLessThanOrEqualTo(Date value) {
            addCriterion("appearDate <=", value, "appeardate");
            return (Criteria) this;
        }

        public Criteria andAppeardateIn(List<Date> values) {
            addCriterion("appearDate in", values, "appeardate");
            return (Criteria) this;
        }

        public Criteria andAppeardateNotIn(List<Date> values) {
            addCriterion("appearDate not in", values, "appeardate");
            return (Criteria) this;
        }

        public Criteria andAppeardateBetween(Date value1, Date value2) {
            addCriterion("appearDate between", value1, value2, "appeardate");
            return (Criteria) this;
        }

        public Criteria andAppeardateNotBetween(Date value1, Date value2) {
            addCriterion("appearDate not between", value1, value2, "appeardate");
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

        public Criteria andChangedateIsNull() {
            addCriterion("changeDate is null");
            return (Criteria) this;
        }

        public Criteria andChangedateIsNotNull() {
            addCriterion("changeDate is not null");
            return (Criteria) this;
        }

        public Criteria andChangedateEqualTo(Date value) {
            addCriterion("changeDate =", value, "changedate");
            return (Criteria) this;
        }

        public Criteria andChangedateNotEqualTo(Date value) {
            addCriterion("changeDate <>", value, "changedate");
            return (Criteria) this;
        }

        public Criteria andChangedateGreaterThan(Date value) {
            addCriterion("changeDate >", value, "changedate");
            return (Criteria) this;
        }

        public Criteria andChangedateGreaterThanOrEqualTo(Date value) {
            addCriterion("changeDate >=", value, "changedate");
            return (Criteria) this;
        }

        public Criteria andChangedateLessThan(Date value) {
            addCriterion("changeDate <", value, "changedate");
            return (Criteria) this;
        }

        public Criteria andChangedateLessThanOrEqualTo(Date value) {
            addCriterion("changeDate <=", value, "changedate");
            return (Criteria) this;
        }

        public Criteria andChangedateIn(List<Date> values) {
            addCriterion("changeDate in", values, "changedate");
            return (Criteria) this;
        }

        public Criteria andChangedateNotIn(List<Date> values) {
            addCriterion("changeDate not in", values, "changedate");
            return (Criteria) this;
        }

        public Criteria andChangedateBetween(Date value1, Date value2) {
            addCriterion("changeDate between", value1, value2, "changedate");
            return (Criteria) this;
        }

        public Criteria andChangedateNotBetween(Date value1, Date value2) {
            addCriterion("changeDate not between", value1, value2, "changedate");
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