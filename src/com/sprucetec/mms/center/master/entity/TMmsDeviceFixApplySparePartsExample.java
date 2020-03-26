package com.sprucetec.mms.center.master.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TMmsDeviceFixApplySparePartsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TMmsDeviceFixApplySparePartsExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andFixApplyIdIsNull() {
            addCriterion("fix_apply_id is null");
            return (Criteria) this;
        }

        public Criteria andFixApplyIdIsNotNull() {
            addCriterion("fix_apply_id is not null");
            return (Criteria) this;
        }

        public Criteria andFixApplyIdEqualTo(Long value) {
            addCriterion("fix_apply_id =", value, "fixApplyId");
            return (Criteria) this;
        }

        public Criteria andFixApplyIdNotEqualTo(Long value) {
            addCriterion("fix_apply_id <>", value, "fixApplyId");
            return (Criteria) this;
        }

        public Criteria andFixApplyIdGreaterThan(Long value) {
            addCriterion("fix_apply_id >", value, "fixApplyId");
            return (Criteria) this;
        }

        public Criteria andFixApplyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("fix_apply_id >=", value, "fixApplyId");
            return (Criteria) this;
        }

        public Criteria andFixApplyIdLessThan(Long value) {
            addCriterion("fix_apply_id <", value, "fixApplyId");
            return (Criteria) this;
        }

        public Criteria andFixApplyIdLessThanOrEqualTo(Long value) {
            addCriterion("fix_apply_id <=", value, "fixApplyId");
            return (Criteria) this;
        }

        public Criteria andFixApplyIdIn(List<Long> values) {
            addCriterion("fix_apply_id in", values, "fixApplyId");
            return (Criteria) this;
        }

        public Criteria andFixApplyIdNotIn(List<Long> values) {
            addCriterion("fix_apply_id not in", values, "fixApplyId");
            return (Criteria) this;
        }

        public Criteria andFixApplyIdBetween(Long value1, Long value2) {
            addCriterion("fix_apply_id between", value1, value2, "fixApplyId");
            return (Criteria) this;
        }

        public Criteria andFixApplyIdNotBetween(Long value1, Long value2) {
            addCriterion("fix_apply_id not between", value1, value2, "fixApplyId");
            return (Criteria) this;
        }

        public Criteria andSparePartsStockIdIsNull() {
            addCriterion("spare_parts_stock_id is null");
            return (Criteria) this;
        }

        public Criteria andSparePartsStockIdIsNotNull() {
            addCriterion("spare_parts_stock_id is not null");
            return (Criteria) this;
        }

        public Criteria andSparePartsStockIdEqualTo(Long value) {
            addCriterion("spare_parts_stock_id =", value, "sparePartsStockId");
            return (Criteria) this;
        }

        public Criteria andSparePartsStockIdNotEqualTo(Long value) {
            addCriterion("spare_parts_stock_id <>", value, "sparePartsStockId");
            return (Criteria) this;
        }

        public Criteria andSparePartsStockIdGreaterThan(Long value) {
            addCriterion("spare_parts_stock_id >", value, "sparePartsStockId");
            return (Criteria) this;
        }

        public Criteria andSparePartsStockIdGreaterThanOrEqualTo(Long value) {
            addCriterion("spare_parts_stock_id >=", value, "sparePartsStockId");
            return (Criteria) this;
        }

        public Criteria andSparePartsStockIdLessThan(Long value) {
            addCriterion("spare_parts_stock_id <", value, "sparePartsStockId");
            return (Criteria) this;
        }

        public Criteria andSparePartsStockIdLessThanOrEqualTo(Long value) {
            addCriterion("spare_parts_stock_id <=", value, "sparePartsStockId");
            return (Criteria) this;
        }

        public Criteria andSparePartsStockIdIn(List<Long> values) {
            addCriterion("spare_parts_stock_id in", values, "sparePartsStockId");
            return (Criteria) this;
        }

        public Criteria andSparePartsStockIdNotIn(List<Long> values) {
            addCriterion("spare_parts_stock_id not in", values, "sparePartsStockId");
            return (Criteria) this;
        }

        public Criteria andSparePartsStockIdBetween(Long value1, Long value2) {
            addCriterion("spare_parts_stock_id between", value1, value2, "sparePartsStockId");
            return (Criteria) this;
        }

        public Criteria andSparePartsStockIdNotBetween(Long value1, Long value2) {
            addCriterion("spare_parts_stock_id not between", value1, value2, "sparePartsStockId");
            return (Criteria) this;
        }

        public Criteria andSparePartsCountIsNull() {
            addCriterion("spare_parts_count is null");
            return (Criteria) this;
        }

        public Criteria andSparePartsCountIsNotNull() {
            addCriterion("spare_parts_count is not null");
            return (Criteria) this;
        }

        public Criteria andSparePartsCountEqualTo(Integer value) {
            addCriterion("spare_parts_count =", value, "sparePartsCount");
            return (Criteria) this;
        }

        public Criteria andSparePartsCountNotEqualTo(Integer value) {
            addCriterion("spare_parts_count <>", value, "sparePartsCount");
            return (Criteria) this;
        }

        public Criteria andSparePartsCountGreaterThan(Integer value) {
            addCriterion("spare_parts_count >", value, "sparePartsCount");
            return (Criteria) this;
        }

        public Criteria andSparePartsCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("spare_parts_count >=", value, "sparePartsCount");
            return (Criteria) this;
        }

        public Criteria andSparePartsCountLessThan(Integer value) {
            addCriterion("spare_parts_count <", value, "sparePartsCount");
            return (Criteria) this;
        }

        public Criteria andSparePartsCountLessThanOrEqualTo(Integer value) {
            addCriterion("spare_parts_count <=", value, "sparePartsCount");
            return (Criteria) this;
        }

        public Criteria andSparePartsCountIn(List<Integer> values) {
            addCriterion("spare_parts_count in", values, "sparePartsCount");
            return (Criteria) this;
        }

        public Criteria andSparePartsCountNotIn(List<Integer> values) {
            addCriterion("spare_parts_count not in", values, "sparePartsCount");
            return (Criteria) this;
        }

        public Criteria andSparePartsCountBetween(Integer value1, Integer value2) {
            addCriterion("spare_parts_count between", value1, value2, "sparePartsCount");
            return (Criteria) this;
        }

        public Criteria andSparePartsCountNotBetween(Integer value1, Integer value2) {
            addCriterion("spare_parts_count not between", value1, value2, "sparePartsCount");
            return (Criteria) this;
        }

        public Criteria andSparePartsAmountIsNull() {
            addCriterion("spare_parts_amount is null");
            return (Criteria) this;
        }

        public Criteria andSparePartsAmountIsNotNull() {
            addCriterion("spare_parts_amount is not null");
            return (Criteria) this;
        }

        public Criteria andSparePartsAmountEqualTo(BigDecimal value) {
            addCriterion("spare_parts_amount =", value, "sparePartsAmount");
            return (Criteria) this;
        }

        public Criteria andSparePartsAmountNotEqualTo(BigDecimal value) {
            addCriterion("spare_parts_amount <>", value, "sparePartsAmount");
            return (Criteria) this;
        }

        public Criteria andSparePartsAmountGreaterThan(BigDecimal value) {
            addCriterion("spare_parts_amount >", value, "sparePartsAmount");
            return (Criteria) this;
        }

        public Criteria andSparePartsAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("spare_parts_amount >=", value, "sparePartsAmount");
            return (Criteria) this;
        }

        public Criteria andSparePartsAmountLessThan(BigDecimal value) {
            addCriterion("spare_parts_amount <", value, "sparePartsAmount");
            return (Criteria) this;
        }

        public Criteria andSparePartsAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("spare_parts_amount <=", value, "sparePartsAmount");
            return (Criteria) this;
        }

        public Criteria andSparePartsAmountIn(List<BigDecimal> values) {
            addCriterion("spare_parts_amount in", values, "sparePartsAmount");
            return (Criteria) this;
        }

        public Criteria andSparePartsAmountNotIn(List<BigDecimal> values) {
            addCriterion("spare_parts_amount not in", values, "sparePartsAmount");
            return (Criteria) this;
        }

        public Criteria andSparePartsAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("spare_parts_amount between", value1, value2, "sparePartsAmount");
            return (Criteria) this;
        }

        public Criteria andSparePartsAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("spare_parts_amount not between", value1, value2, "sparePartsAmount");
            return (Criteria) this;
        }

        public Criteria andCTIsNull() {
            addCriterion("c_t is null");
            return (Criteria) this;
        }

        public Criteria andCTIsNotNull() {
            addCriterion("c_t is not null");
            return (Criteria) this;
        }

        public Criteria andCTEqualTo(Long value) {
            addCriterion("c_t =", value, "cT");
            return (Criteria) this;
        }

        public Criteria andCTNotEqualTo(Long value) {
            addCriterion("c_t <>", value, "cT");
            return (Criteria) this;
        }

        public Criteria andCTGreaterThan(Long value) {
            addCriterion("c_t >", value, "cT");
            return (Criteria) this;
        }

        public Criteria andCTGreaterThanOrEqualTo(Long value) {
            addCriterion("c_t >=", value, "cT");
            return (Criteria) this;
        }

        public Criteria andCTLessThan(Long value) {
            addCriterion("c_t <", value, "cT");
            return (Criteria) this;
        }

        public Criteria andCTLessThanOrEqualTo(Long value) {
            addCriterion("c_t <=", value, "cT");
            return (Criteria) this;
        }

        public Criteria andCTIn(List<Long> values) {
            addCriterion("c_t in", values, "cT");
            return (Criteria) this;
        }

        public Criteria andCTNotIn(List<Long> values) {
            addCriterion("c_t not in", values, "cT");
            return (Criteria) this;
        }

        public Criteria andCTBetween(Long value1, Long value2) {
            addCriterion("c_t between", value1, value2, "cT");
            return (Criteria) this;
        }

        public Criteria andCTNotBetween(Long value1, Long value2) {
            addCriterion("c_t not between", value1, value2, "cT");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("creator is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("creator is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(Long value) {
            addCriterion("creator =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(Long value) {
            addCriterion("creator <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(Long value) {
            addCriterion("creator >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(Long value) {
            addCriterion("creator >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(Long value) {
            addCriterion("creator <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(Long value) {
            addCriterion("creator <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<Long> values) {
            addCriterion("creator in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<Long> values) {
            addCriterion("creator not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(Long value1, Long value2) {
            addCriterion("creator between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(Long value1, Long value2) {
            addCriterion("creator not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNameIsNull() {
            addCriterion("creator_name is null");
            return (Criteria) this;
        }

        public Criteria andCreatorNameIsNotNull() {
            addCriterion("creator_name is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorNameEqualTo(String value) {
            addCriterion("creator_name =", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameNotEqualTo(String value) {
            addCriterion("creator_name <>", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameGreaterThan(String value) {
            addCriterion("creator_name >", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameGreaterThanOrEqualTo(String value) {
            addCriterion("creator_name >=", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameLessThan(String value) {
            addCriterion("creator_name <", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameLessThanOrEqualTo(String value) {
            addCriterion("creator_name <=", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameLike(String value) {
            addCriterion("creator_name like", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameNotLike(String value) {
            addCriterion("creator_name not like", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameIn(List<String> values) {
            addCriterion("creator_name in", values, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameNotIn(List<String> values) {
            addCriterion("creator_name not in", values, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameBetween(String value1, String value2) {
            addCriterion("creator_name between", value1, value2, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameNotBetween(String value1, String value2) {
            addCriterion("creator_name not between", value1, value2, "creatorName");
            return (Criteria) this;
        }

        public Criteria andUTIsNull() {
            addCriterion("u_t is null");
            return (Criteria) this;
        }

        public Criteria andUTIsNotNull() {
            addCriterion("u_t is not null");
            return (Criteria) this;
        }

        public Criteria andUTEqualTo(Long value) {
            addCriterion("u_t =", value, "uT");
            return (Criteria) this;
        }

        public Criteria andUTNotEqualTo(Long value) {
            addCriterion("u_t <>", value, "uT");
            return (Criteria) this;
        }

        public Criteria andUTGreaterThan(Long value) {
            addCriterion("u_t >", value, "uT");
            return (Criteria) this;
        }

        public Criteria andUTGreaterThanOrEqualTo(Long value) {
            addCriterion("u_t >=", value, "uT");
            return (Criteria) this;
        }

        public Criteria andUTLessThan(Long value) {
            addCriterion("u_t <", value, "uT");
            return (Criteria) this;
        }

        public Criteria andUTLessThanOrEqualTo(Long value) {
            addCriterion("u_t <=", value, "uT");
            return (Criteria) this;
        }

        public Criteria andUTIn(List<Long> values) {
            addCriterion("u_t in", values, "uT");
            return (Criteria) this;
        }

        public Criteria andUTNotIn(List<Long> values) {
            addCriterion("u_t not in", values, "uT");
            return (Criteria) this;
        }

        public Criteria andUTBetween(Long value1, Long value2) {
            addCriterion("u_t between", value1, value2, "uT");
            return (Criteria) this;
        }

        public Criteria andUTNotBetween(Long value1, Long value2) {
            addCriterion("u_t not between", value1, value2, "uT");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(Long value) {
            addCriterion("updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(Long value) {
            addCriterion("updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(Long value) {
            addCriterion("updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(Long value) {
            addCriterion("updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(Long value) {
            addCriterion("updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(Long value) {
            addCriterion("updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<Long> values) {
            addCriterion("updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<Long> values) {
            addCriterion("updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(Long value1, Long value2) {
            addCriterion("updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(Long value1, Long value2) {
            addCriterion("updater not between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNameIsNull() {
            addCriterion("updater_name is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterNameIsNotNull() {
            addCriterion("updater_name is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterNameEqualTo(String value) {
            addCriterion("updater_name =", value, "updaterName");
            return (Criteria) this;
        }

        public Criteria andUpdaterNameNotEqualTo(String value) {
            addCriterion("updater_name <>", value, "updaterName");
            return (Criteria) this;
        }

        public Criteria andUpdaterNameGreaterThan(String value) {
            addCriterion("updater_name >", value, "updaterName");
            return (Criteria) this;
        }

        public Criteria andUpdaterNameGreaterThanOrEqualTo(String value) {
            addCriterion("updater_name >=", value, "updaterName");
            return (Criteria) this;
        }

        public Criteria andUpdaterNameLessThan(String value) {
            addCriterion("updater_name <", value, "updaterName");
            return (Criteria) this;
        }

        public Criteria andUpdaterNameLessThanOrEqualTo(String value) {
            addCriterion("updater_name <=", value, "updaterName");
            return (Criteria) this;
        }

        public Criteria andUpdaterNameLike(String value) {
            addCriterion("updater_name like", value, "updaterName");
            return (Criteria) this;
        }

        public Criteria andUpdaterNameNotLike(String value) {
            addCriterion("updater_name not like", value, "updaterName");
            return (Criteria) this;
        }

        public Criteria andUpdaterNameIn(List<String> values) {
            addCriterion("updater_name in", values, "updaterName");
            return (Criteria) this;
        }

        public Criteria andUpdaterNameNotIn(List<String> values) {
            addCriterion("updater_name not in", values, "updaterName");
            return (Criteria) this;
        }

        public Criteria andUpdaterNameBetween(String value1, String value2) {
            addCriterion("updater_name between", value1, value2, "updaterName");
            return (Criteria) this;
        }

        public Criteria andUpdaterNameNotBetween(String value1, String value2) {
            addCriterion("updater_name not between", value1, value2, "updaterName");
            return (Criteria) this;
        }
    }

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