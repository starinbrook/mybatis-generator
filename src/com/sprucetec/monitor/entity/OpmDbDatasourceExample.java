package com.sprucetec.monitor.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OpmDbDatasourceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OpmDbDatasourceExample() {
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

        public Criteria andDatasourceNameIsNull() {
            addCriterion("datasource_name is null");
            return (Criteria) this;
        }

        public Criteria andDatasourceNameIsNotNull() {
            addCriterion("datasource_name is not null");
            return (Criteria) this;
        }

        public Criteria andDatasourceNameEqualTo(String value) {
            addCriterion("datasource_name =", value, "datasourceName");
            return (Criteria) this;
        }

        public Criteria andDatasourceNameNotEqualTo(String value) {
            addCriterion("datasource_name <>", value, "datasourceName");
            return (Criteria) this;
        }

        public Criteria andDatasourceNameGreaterThan(String value) {
            addCriterion("datasource_name >", value, "datasourceName");
            return (Criteria) this;
        }

        public Criteria andDatasourceNameGreaterThanOrEqualTo(String value) {
            addCriterion("datasource_name >=", value, "datasourceName");
            return (Criteria) this;
        }

        public Criteria andDatasourceNameLessThan(String value) {
            addCriterion("datasource_name <", value, "datasourceName");
            return (Criteria) this;
        }

        public Criteria andDatasourceNameLessThanOrEqualTo(String value) {
            addCriterion("datasource_name <=", value, "datasourceName");
            return (Criteria) this;
        }

        public Criteria andDatasourceNameLike(String value) {
            addCriterion("datasource_name like", value, "datasourceName");
            return (Criteria) this;
        }

        public Criteria andDatasourceNameNotLike(String value) {
            addCriterion("datasource_name not like", value, "datasourceName");
            return (Criteria) this;
        }

        public Criteria andDatasourceNameIn(List<String> values) {
            addCriterion("datasource_name in", values, "datasourceName");
            return (Criteria) this;
        }

        public Criteria andDatasourceNameNotIn(List<String> values) {
            addCriterion("datasource_name not in", values, "datasourceName");
            return (Criteria) this;
        }

        public Criteria andDatasourceNameBetween(String value1, String value2) {
            addCriterion("datasource_name between", value1, value2, "datasourceName");
            return (Criteria) this;
        }

        public Criteria andDatasourceNameNotBetween(String value1, String value2) {
            addCriterion("datasource_name not between", value1, value2, "datasourceName");
            return (Criteria) this;
        }

        public Criteria andDatasourceUrlIsNull() {
            addCriterion("datasource_url is null");
            return (Criteria) this;
        }

        public Criteria andDatasourceUrlIsNotNull() {
            addCriterion("datasource_url is not null");
            return (Criteria) this;
        }

        public Criteria andDatasourceUrlEqualTo(String value) {
            addCriterion("datasource_url =", value, "datasourceUrl");
            return (Criteria) this;
        }

        public Criteria andDatasourceUrlNotEqualTo(String value) {
            addCriterion("datasource_url <>", value, "datasourceUrl");
            return (Criteria) this;
        }

        public Criteria andDatasourceUrlGreaterThan(String value) {
            addCriterion("datasource_url >", value, "datasourceUrl");
            return (Criteria) this;
        }

        public Criteria andDatasourceUrlGreaterThanOrEqualTo(String value) {
            addCriterion("datasource_url >=", value, "datasourceUrl");
            return (Criteria) this;
        }

        public Criteria andDatasourceUrlLessThan(String value) {
            addCriterion("datasource_url <", value, "datasourceUrl");
            return (Criteria) this;
        }

        public Criteria andDatasourceUrlLessThanOrEqualTo(String value) {
            addCriterion("datasource_url <=", value, "datasourceUrl");
            return (Criteria) this;
        }

        public Criteria andDatasourceUrlLike(String value) {
            addCriterion("datasource_url like", value, "datasourceUrl");
            return (Criteria) this;
        }

        public Criteria andDatasourceUrlNotLike(String value) {
            addCriterion("datasource_url not like", value, "datasourceUrl");
            return (Criteria) this;
        }

        public Criteria andDatasourceUrlIn(List<String> values) {
            addCriterion("datasource_url in", values, "datasourceUrl");
            return (Criteria) this;
        }

        public Criteria andDatasourceUrlNotIn(List<String> values) {
            addCriterion("datasource_url not in", values, "datasourceUrl");
            return (Criteria) this;
        }

        public Criteria andDatasourceUrlBetween(String value1, String value2) {
            addCriterion("datasource_url between", value1, value2, "datasourceUrl");
            return (Criteria) this;
        }

        public Criteria andDatasourceUrlNotBetween(String value1, String value2) {
            addCriterion("datasource_url not between", value1, value2, "datasourceUrl");
            return (Criteria) this;
        }

        public Criteria andDatasourceUsernameIsNull() {
            addCriterion("datasource_username is null");
            return (Criteria) this;
        }

        public Criteria andDatasourceUsernameIsNotNull() {
            addCriterion("datasource_username is not null");
            return (Criteria) this;
        }

        public Criteria andDatasourceUsernameEqualTo(String value) {
            addCriterion("datasource_username =", value, "datasourceUsername");
            return (Criteria) this;
        }

        public Criteria andDatasourceUsernameNotEqualTo(String value) {
            addCriterion("datasource_username <>", value, "datasourceUsername");
            return (Criteria) this;
        }

        public Criteria andDatasourceUsernameGreaterThan(String value) {
            addCriterion("datasource_username >", value, "datasourceUsername");
            return (Criteria) this;
        }

        public Criteria andDatasourceUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("datasource_username >=", value, "datasourceUsername");
            return (Criteria) this;
        }

        public Criteria andDatasourceUsernameLessThan(String value) {
            addCriterion("datasource_username <", value, "datasourceUsername");
            return (Criteria) this;
        }

        public Criteria andDatasourceUsernameLessThanOrEqualTo(String value) {
            addCriterion("datasource_username <=", value, "datasourceUsername");
            return (Criteria) this;
        }

        public Criteria andDatasourceUsernameLike(String value) {
            addCriterion("datasource_username like", value, "datasourceUsername");
            return (Criteria) this;
        }

        public Criteria andDatasourceUsernameNotLike(String value) {
            addCriterion("datasource_username not like", value, "datasourceUsername");
            return (Criteria) this;
        }

        public Criteria andDatasourceUsernameIn(List<String> values) {
            addCriterion("datasource_username in", values, "datasourceUsername");
            return (Criteria) this;
        }

        public Criteria andDatasourceUsernameNotIn(List<String> values) {
            addCriterion("datasource_username not in", values, "datasourceUsername");
            return (Criteria) this;
        }

        public Criteria andDatasourceUsernameBetween(String value1, String value2) {
            addCriterion("datasource_username between", value1, value2, "datasourceUsername");
            return (Criteria) this;
        }

        public Criteria andDatasourceUsernameNotBetween(String value1, String value2) {
            addCriterion("datasource_username not between", value1, value2, "datasourceUsername");
            return (Criteria) this;
        }

        public Criteria andDatasourcePasswordIsNull() {
            addCriterion("datasource_password is null");
            return (Criteria) this;
        }

        public Criteria andDatasourcePasswordIsNotNull() {
            addCriterion("datasource_password is not null");
            return (Criteria) this;
        }

        public Criteria andDatasourcePasswordEqualTo(String value) {
            addCriterion("datasource_password =", value, "datasourcePassword");
            return (Criteria) this;
        }

        public Criteria andDatasourcePasswordNotEqualTo(String value) {
            addCriterion("datasource_password <>", value, "datasourcePassword");
            return (Criteria) this;
        }

        public Criteria andDatasourcePasswordGreaterThan(String value) {
            addCriterion("datasource_password >", value, "datasourcePassword");
            return (Criteria) this;
        }

        public Criteria andDatasourcePasswordGreaterThanOrEqualTo(String value) {
            addCriterion("datasource_password >=", value, "datasourcePassword");
            return (Criteria) this;
        }

        public Criteria andDatasourcePasswordLessThan(String value) {
            addCriterion("datasource_password <", value, "datasourcePassword");
            return (Criteria) this;
        }

        public Criteria andDatasourcePasswordLessThanOrEqualTo(String value) {
            addCriterion("datasource_password <=", value, "datasourcePassword");
            return (Criteria) this;
        }

        public Criteria andDatasourcePasswordLike(String value) {
            addCriterion("datasource_password like", value, "datasourcePassword");
            return (Criteria) this;
        }

        public Criteria andDatasourcePasswordNotLike(String value) {
            addCriterion("datasource_password not like", value, "datasourcePassword");
            return (Criteria) this;
        }

        public Criteria andDatasourcePasswordIn(List<String> values) {
            addCriterion("datasource_password in", values, "datasourcePassword");
            return (Criteria) this;
        }

        public Criteria andDatasourcePasswordNotIn(List<String> values) {
            addCriterion("datasource_password not in", values, "datasourcePassword");
            return (Criteria) this;
        }

        public Criteria andDatasourcePasswordBetween(String value1, String value2) {
            addCriterion("datasource_password between", value1, value2, "datasourcePassword");
            return (Criteria) this;
        }

        public Criteria andDatasourcePasswordNotBetween(String value1, String value2) {
            addCriterion("datasource_password not between", value1, value2, "datasourcePassword");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNull() {
            addCriterion("update_user is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNotNull() {
            addCriterion("update_user is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserEqualTo(String value) {
            addCriterion("update_user =", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotEqualTo(String value) {
            addCriterion("update_user <>", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThan(String value) {
            addCriterion("update_user >", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThanOrEqualTo(String value) {
            addCriterion("update_user >=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThan(String value) {
            addCriterion("update_user <", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThanOrEqualTo(String value) {
            addCriterion("update_user <=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLike(String value) {
            addCriterion("update_user like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotLike(String value) {
            addCriterion("update_user not like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIn(List<String> values) {
            addCriterion("update_user in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotIn(List<String> values) {
            addCriterion("update_user not in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserBetween(String value1, String value2) {
            addCriterion("update_user between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotBetween(String value1, String value2) {
            addCriterion("update_user not between", value1, value2, "updateUser");
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