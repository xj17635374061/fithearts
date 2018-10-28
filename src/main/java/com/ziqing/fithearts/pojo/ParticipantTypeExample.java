package com.ziqing.fithearts.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ParticipantTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ParticipantTypeExample() {
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

        public Criteria andPtype_nameIsNull() {
            addCriterion("ptype_name is null");
            return (Criteria) this;
        }

        public Criteria andPtype_nameIsNotNull() {
            addCriterion("ptype_name is not null");
            return (Criteria) this;
        }

        public Criteria andPtype_nameEqualTo(String value) {
            addCriterion("ptype_name =", value, "ptype_name");
            return (Criteria) this;
        }

        public Criteria andPtype_nameNotEqualTo(String value) {
            addCriterion("ptype_name <>", value, "ptype_name");
            return (Criteria) this;
        }

        public Criteria andPtype_nameGreaterThan(String value) {
            addCriterion("ptype_name >", value, "ptype_name");
            return (Criteria) this;
        }

        public Criteria andPtype_nameGreaterThanOrEqualTo(String value) {
            addCriterion("ptype_name >=", value, "ptype_name");
            return (Criteria) this;
        }

        public Criteria andPtype_nameLessThan(String value) {
            addCriterion("ptype_name <", value, "ptype_name");
            return (Criteria) this;
        }

        public Criteria andPtype_nameLessThanOrEqualTo(String value) {
            addCriterion("ptype_name <=", value, "ptype_name");
            return (Criteria) this;
        }

        public Criteria andPtype_nameLike(String value) {
            addCriterion("ptype_name like", value, "ptype_name");
            return (Criteria) this;
        }

        public Criteria andPtype_nameNotLike(String value) {
            addCriterion("ptype_name not like", value, "ptype_name");
            return (Criteria) this;
        }

        public Criteria andPtype_nameIn(List<String> values) {
            addCriterion("ptype_name in", values, "ptype_name");
            return (Criteria) this;
        }

        public Criteria andPtype_nameNotIn(List<String> values) {
            addCriterion("ptype_name not in", values, "ptype_name");
            return (Criteria) this;
        }

        public Criteria andPtype_nameBetween(String value1, String value2) {
            addCriterion("ptype_name between", value1, value2, "ptype_name");
            return (Criteria) this;
        }

        public Criteria andPtype_nameNotBetween(String value1, String value2) {
            addCriterion("ptype_name not between", value1, value2, "ptype_name");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreate_timeEqualTo(Date value) {
            addCriterionForJDBCDate("create_time =", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotEqualTo(Date value) {
            addCriterionForJDBCDate("create_time <>", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThan(Date value) {
            addCriterionForJDBCDate("create_time >", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_time >=", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThan(Date value) {
            addCriterionForJDBCDate("create_time <", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_time <=", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIn(List<Date> values) {
            addCriterionForJDBCDate("create_time in", values, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotIn(List<Date> values) {
            addCriterionForJDBCDate("create_time not in", values, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_time between", value1, value2, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_time not between", value1, value2, "create_time");
            return (Criteria) this;
        }

        public Criteria andModify_timeIsNull() {
            addCriterion("modify_time is null");
            return (Criteria) this;
        }

        public Criteria andModify_timeIsNotNull() {
            addCriterion("modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andModify_timeEqualTo(Date value) {
            addCriterionForJDBCDate("modify_time =", value, "modify_time");
            return (Criteria) this;
        }

        public Criteria andModify_timeNotEqualTo(Date value) {
            addCriterionForJDBCDate("modify_time <>", value, "modify_time");
            return (Criteria) this;
        }

        public Criteria andModify_timeGreaterThan(Date value) {
            addCriterionForJDBCDate("modify_time >", value, "modify_time");
            return (Criteria) this;
        }

        public Criteria andModify_timeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("modify_time >=", value, "modify_time");
            return (Criteria) this;
        }

        public Criteria andModify_timeLessThan(Date value) {
            addCriterionForJDBCDate("modify_time <", value, "modify_time");
            return (Criteria) this;
        }

        public Criteria andModify_timeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("modify_time <=", value, "modify_time");
            return (Criteria) this;
        }

        public Criteria andModify_timeIn(List<Date> values) {
            addCriterionForJDBCDate("modify_time in", values, "modify_time");
            return (Criteria) this;
        }

        public Criteria andModify_timeNotIn(List<Date> values) {
            addCriterionForJDBCDate("modify_time not in", values, "modify_time");
            return (Criteria) this;
        }

        public Criteria andModify_timeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("modify_time between", value1, value2, "modify_time");
            return (Criteria) this;
        }

        public Criteria andModify_timeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("modify_time not between", value1, value2, "modify_time");
            return (Criteria) this;
        }

        public Criteria andIs_delIsNull() {
            addCriterion("is_del is null");
            return (Criteria) this;
        }

        public Criteria andIs_delIsNotNull() {
            addCriterion("is_del is not null");
            return (Criteria) this;
        }

        public Criteria andIs_delEqualTo(String value) {
            addCriterion("is_del =", value, "is_del");
            return (Criteria) this;
        }

        public Criteria andIs_delNotEqualTo(String value) {
            addCriterion("is_del <>", value, "is_del");
            return (Criteria) this;
        }

        public Criteria andIs_delGreaterThan(String value) {
            addCriterion("is_del >", value, "is_del");
            return (Criteria) this;
        }

        public Criteria andIs_delGreaterThanOrEqualTo(String value) {
            addCriterion("is_del >=", value, "is_del");
            return (Criteria) this;
        }

        public Criteria andIs_delLessThan(String value) {
            addCriterion("is_del <", value, "is_del");
            return (Criteria) this;
        }

        public Criteria andIs_delLessThanOrEqualTo(String value) {
            addCriterion("is_del <=", value, "is_del");
            return (Criteria) this;
        }

        public Criteria andIs_delLike(String value) {
            addCriterion("is_del like", value, "is_del");
            return (Criteria) this;
        }

        public Criteria andIs_delNotLike(String value) {
            addCriterion("is_del not like", value, "is_del");
            return (Criteria) this;
        }

        public Criteria andIs_delIn(List<String> values) {
            addCriterion("is_del in", values, "is_del");
            return (Criteria) this;
        }

        public Criteria andIs_delNotIn(List<String> values) {
            addCriterion("is_del not in", values, "is_del");
            return (Criteria) this;
        }

        public Criteria andIs_delBetween(String value1, String value2) {
            addCriterion("is_del between", value1, value2, "is_del");
            return (Criteria) this;
        }

        public Criteria andIs_delNotBetween(String value1, String value2) {
            addCriterion("is_del not between", value1, value2, "is_del");
            return (Criteria) this;
        }

        public Criteria andValue_oneIsNull() {
            addCriterion("value_one is null");
            return (Criteria) this;
        }

        public Criteria andValue_oneIsNotNull() {
            addCriterion("value_one is not null");
            return (Criteria) this;
        }

        public Criteria andValue_oneEqualTo(String value) {
            addCriterion("value_one =", value, "value_one");
            return (Criteria) this;
        }

        public Criteria andValue_oneNotEqualTo(String value) {
            addCriterion("value_one <>", value, "value_one");
            return (Criteria) this;
        }

        public Criteria andValue_oneGreaterThan(String value) {
            addCriterion("value_one >", value, "value_one");
            return (Criteria) this;
        }

        public Criteria andValue_oneGreaterThanOrEqualTo(String value) {
            addCriterion("value_one >=", value, "value_one");
            return (Criteria) this;
        }

        public Criteria andValue_oneLessThan(String value) {
            addCriterion("value_one <", value, "value_one");
            return (Criteria) this;
        }

        public Criteria andValue_oneLessThanOrEqualTo(String value) {
            addCriterion("value_one <=", value, "value_one");
            return (Criteria) this;
        }

        public Criteria andValue_oneLike(String value) {
            addCriterion("value_one like", value, "value_one");
            return (Criteria) this;
        }

        public Criteria andValue_oneNotLike(String value) {
            addCriterion("value_one not like", value, "value_one");
            return (Criteria) this;
        }

        public Criteria andValue_oneIn(List<String> values) {
            addCriterion("value_one in", values, "value_one");
            return (Criteria) this;
        }

        public Criteria andValue_oneNotIn(List<String> values) {
            addCriterion("value_one not in", values, "value_one");
            return (Criteria) this;
        }

        public Criteria andValue_oneBetween(String value1, String value2) {
            addCriterion("value_one between", value1, value2, "value_one");
            return (Criteria) this;
        }

        public Criteria andValue_oneNotBetween(String value1, String value2) {
            addCriterion("value_one not between", value1, value2, "value_one");
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