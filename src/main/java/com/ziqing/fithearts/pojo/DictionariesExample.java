package com.ziqing.fithearts.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DictionariesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DictionariesExample() {
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

        public Criteria andTypecodeIsNull() {
            addCriterion("typecode is null");
            return (Criteria) this;
        }

        public Criteria andTypecodeIsNotNull() {
            addCriterion("typecode is not null");
            return (Criteria) this;
        }

        public Criteria andTypecodeEqualTo(String value) {
            addCriterion("typecode =", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeNotEqualTo(String value) {
            addCriterion("typecode <>", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeGreaterThan(String value) {
            addCriterion("typecode >", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeGreaterThanOrEqualTo(String value) {
            addCriterion("typecode >=", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeLessThan(String value) {
            addCriterion("typecode <", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeLessThanOrEqualTo(String value) {
            addCriterion("typecode <=", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeLike(String value) {
            addCriterion("typecode like", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeNotLike(String value) {
            addCriterion("typecode not like", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeIn(List<String> values) {
            addCriterion("typecode in", values, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeNotIn(List<String> values) {
            addCriterion("typecode not in", values, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeBetween(String value1, String value2) {
            addCriterion("typecode between", value1, value2, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeNotBetween(String value1, String value2) {
            addCriterion("typecode not between", value1, value2, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypenameIsNull() {
            addCriterion("typename is null");
            return (Criteria) this;
        }

        public Criteria andTypenameIsNotNull() {
            addCriterion("typename is not null");
            return (Criteria) this;
        }

        public Criteria andTypenameEqualTo(String value) {
            addCriterion("typename =", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotEqualTo(String value) {
            addCriterion("typename <>", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameGreaterThan(String value) {
            addCriterion("typename >", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameGreaterThanOrEqualTo(String value) {
            addCriterion("typename >=", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameLessThan(String value) {
            addCriterion("typename <", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameLessThanOrEqualTo(String value) {
            addCriterion("typename <=", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameLike(String value) {
            addCriterion("typename like", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotLike(String value) {
            addCriterion("typename not like", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameIn(List<String> values) {
            addCriterion("typename in", values, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotIn(List<String> values) {
            addCriterion("typename not in", values, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameBetween(String value1, String value2) {
            addCriterion("typename between", value1, value2, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotBetween(String value1, String value2) {
            addCriterion("typename not between", value1, value2, "typename");
            return (Criteria) this;
        }

        public Criteria andValue_idIsNull() {
            addCriterion("value_id is null");
            return (Criteria) this;
        }

        public Criteria andValue_idIsNotNull() {
            addCriterion("value_id is not null");
            return (Criteria) this;
        }

        public Criteria andValue_idEqualTo(Integer value) {
            addCriterion("value_id =", value, "value_id");
            return (Criteria) this;
        }

        public Criteria andValue_idNotEqualTo(Integer value) {
            addCriterion("value_id <>", value, "value_id");
            return (Criteria) this;
        }

        public Criteria andValue_idGreaterThan(Integer value) {
            addCriterion("value_id >", value, "value_id");
            return (Criteria) this;
        }

        public Criteria andValue_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("value_id >=", value, "value_id");
            return (Criteria) this;
        }

        public Criteria andValue_idLessThan(Integer value) {
            addCriterion("value_id <", value, "value_id");
            return (Criteria) this;
        }

        public Criteria andValue_idLessThanOrEqualTo(Integer value) {
            addCriterion("value_id <=", value, "value_id");
            return (Criteria) this;
        }

        public Criteria andValue_idIn(List<Integer> values) {
            addCriterion("value_id in", values, "value_id");
            return (Criteria) this;
        }

        public Criteria andValue_idNotIn(List<Integer> values) {
            addCriterion("value_id not in", values, "value_id");
            return (Criteria) this;
        }

        public Criteria andValue_idBetween(Integer value1, Integer value2) {
            addCriterion("value_id between", value1, value2, "value_id");
            return (Criteria) this;
        }

        public Criteria andValue_idNotBetween(Integer value1, Integer value2) {
            addCriterion("value_id not between", value1, value2, "value_id");
            return (Criteria) this;
        }

        public Criteria andValue_content1IsNull() {
            addCriterion("value_content1 is null");
            return (Criteria) this;
        }

        public Criteria andValue_content1IsNotNull() {
            addCriterion("value_content1 is not null");
            return (Criteria) this;
        }

        public Criteria andValue_content1EqualTo(String value) {
            addCriterion("value_content1 =", value, "value_content1");
            return (Criteria) this;
        }

        public Criteria andValue_content1NotEqualTo(String value) {
            addCriterion("value_content1 <>", value, "value_content1");
            return (Criteria) this;
        }

        public Criteria andValue_content1GreaterThan(String value) {
            addCriterion("value_content1 >", value, "value_content1");
            return (Criteria) this;
        }

        public Criteria andValue_content1GreaterThanOrEqualTo(String value) {
            addCriterion("value_content1 >=", value, "value_content1");
            return (Criteria) this;
        }

        public Criteria andValue_content1LessThan(String value) {
            addCriterion("value_content1 <", value, "value_content1");
            return (Criteria) this;
        }

        public Criteria andValue_content1LessThanOrEqualTo(String value) {
            addCriterion("value_content1 <=", value, "value_content1");
            return (Criteria) this;
        }

        public Criteria andValue_content1Like(String value) {
            addCriterion("value_content1 like", value, "value_content1");
            return (Criteria) this;
        }

        public Criteria andValue_content1NotLike(String value) {
            addCriterion("value_content1 not like", value, "value_content1");
            return (Criteria) this;
        }

        public Criteria andValue_content1In(List<String> values) {
            addCriterion("value_content1 in", values, "value_content1");
            return (Criteria) this;
        }

        public Criteria andValue_content1NotIn(List<String> values) {
            addCriterion("value_content1 not in", values, "value_content1");
            return (Criteria) this;
        }

        public Criteria andValue_content1Between(String value1, String value2) {
            addCriterion("value_content1 between", value1, value2, "value_content1");
            return (Criteria) this;
        }

        public Criteria andValue_content1NotBetween(String value1, String value2) {
            addCriterion("value_content1 not between", value1, value2, "value_content1");
            return (Criteria) this;
        }

        public Criteria andValue_content2IsNull() {
            addCriterion("value_content2 is null");
            return (Criteria) this;
        }

        public Criteria andValue_content2IsNotNull() {
            addCriterion("value_content2 is not null");
            return (Criteria) this;
        }

        public Criteria andValue_content2EqualTo(String value) {
            addCriterion("value_content2 =", value, "value_content2");
            return (Criteria) this;
        }

        public Criteria andValue_content2NotEqualTo(String value) {
            addCriterion("value_content2 <>", value, "value_content2");
            return (Criteria) this;
        }

        public Criteria andValue_content2GreaterThan(String value) {
            addCriterion("value_content2 >", value, "value_content2");
            return (Criteria) this;
        }

        public Criteria andValue_content2GreaterThanOrEqualTo(String value) {
            addCriterion("value_content2 >=", value, "value_content2");
            return (Criteria) this;
        }

        public Criteria andValue_content2LessThan(String value) {
            addCriterion("value_content2 <", value, "value_content2");
            return (Criteria) this;
        }

        public Criteria andValue_content2LessThanOrEqualTo(String value) {
            addCriterion("value_content2 <=", value, "value_content2");
            return (Criteria) this;
        }

        public Criteria andValue_content2Like(String value) {
            addCriterion("value_content2 like", value, "value_content2");
            return (Criteria) this;
        }

        public Criteria andValue_content2NotLike(String value) {
            addCriterion("value_content2 not like", value, "value_content2");
            return (Criteria) this;
        }

        public Criteria andValue_content2In(List<String> values) {
            addCriterion("value_content2 in", values, "value_content2");
            return (Criteria) this;
        }

        public Criteria andValue_content2NotIn(List<String> values) {
            addCriterion("value_content2 not in", values, "value_content2");
            return (Criteria) this;
        }

        public Criteria andValue_content2Between(String value1, String value2) {
            addCriterion("value_content2 between", value1, value2, "value_content2");
            return (Criteria) this;
        }

        public Criteria andValue_content2NotBetween(String value1, String value2) {
            addCriterion("value_content2 not between", value1, value2, "value_content2");
            return (Criteria) this;
        }

        public Criteria andValue_content3IsNull() {
            addCriterion("value_content3 is null");
            return (Criteria) this;
        }

        public Criteria andValue_content3IsNotNull() {
            addCriterion("value_content3 is not null");
            return (Criteria) this;
        }

        public Criteria andValue_content3EqualTo(String value) {
            addCriterion("value_content3 =", value, "value_content3");
            return (Criteria) this;
        }

        public Criteria andValue_content3NotEqualTo(String value) {
            addCriterion("value_content3 <>", value, "value_content3");
            return (Criteria) this;
        }

        public Criteria andValue_content3GreaterThan(String value) {
            addCriterion("value_content3 >", value, "value_content3");
            return (Criteria) this;
        }

        public Criteria andValue_content3GreaterThanOrEqualTo(String value) {
            addCriterion("value_content3 >=", value, "value_content3");
            return (Criteria) this;
        }

        public Criteria andValue_content3LessThan(String value) {
            addCriterion("value_content3 <", value, "value_content3");
            return (Criteria) this;
        }

        public Criteria andValue_content3LessThanOrEqualTo(String value) {
            addCriterion("value_content3 <=", value, "value_content3");
            return (Criteria) this;
        }

        public Criteria andValue_content3Like(String value) {
            addCriterion("value_content3 like", value, "value_content3");
            return (Criteria) this;
        }

        public Criteria andValue_content3NotLike(String value) {
            addCriterion("value_content3 not like", value, "value_content3");
            return (Criteria) this;
        }

        public Criteria andValue_content3In(List<String> values) {
            addCriterion("value_content3 in", values, "value_content3");
            return (Criteria) this;
        }

        public Criteria andValue_content3NotIn(List<String> values) {
            addCriterion("value_content3 not in", values, "value_content3");
            return (Criteria) this;
        }

        public Criteria andValue_content3Between(String value1, String value2) {
            addCriterion("value_content3 between", value1, value2, "value_content3");
            return (Criteria) this;
        }

        public Criteria andValue_content3NotBetween(String value1, String value2) {
            addCriterion("value_content3 not between", value1, value2, "value_content3");
            return (Criteria) this;
        }

        public Criteria andValue_content4IsNull() {
            addCriterion("value_content4 is null");
            return (Criteria) this;
        }

        public Criteria andValue_content4IsNotNull() {
            addCriterion("value_content4 is not null");
            return (Criteria) this;
        }

        public Criteria andValue_content4EqualTo(String value) {
            addCriterion("value_content4 =", value, "value_content4");
            return (Criteria) this;
        }

        public Criteria andValue_content4NotEqualTo(String value) {
            addCriterion("value_content4 <>", value, "value_content4");
            return (Criteria) this;
        }

        public Criteria andValue_content4GreaterThan(String value) {
            addCriterion("value_content4 >", value, "value_content4");
            return (Criteria) this;
        }

        public Criteria andValue_content4GreaterThanOrEqualTo(String value) {
            addCriterion("value_content4 >=", value, "value_content4");
            return (Criteria) this;
        }

        public Criteria andValue_content4LessThan(String value) {
            addCriterion("value_content4 <", value, "value_content4");
            return (Criteria) this;
        }

        public Criteria andValue_content4LessThanOrEqualTo(String value) {
            addCriterion("value_content4 <=", value, "value_content4");
            return (Criteria) this;
        }

        public Criteria andValue_content4Like(String value) {
            addCriterion("value_content4 like", value, "value_content4");
            return (Criteria) this;
        }

        public Criteria andValue_content4NotLike(String value) {
            addCriterion("value_content4 not like", value, "value_content4");
            return (Criteria) this;
        }

        public Criteria andValue_content4In(List<String> values) {
            addCriterion("value_content4 in", values, "value_content4");
            return (Criteria) this;
        }

        public Criteria andValue_content4NotIn(List<String> values) {
            addCriterion("value_content4 not in", values, "value_content4");
            return (Criteria) this;
        }

        public Criteria andValue_content4Between(String value1, String value2) {
            addCriterion("value_content4 between", value1, value2, "value_content4");
            return (Criteria) this;
        }

        public Criteria andValue_content4NotBetween(String value1, String value2) {
            addCriterion("value_content4 not between", value1, value2, "value_content4");
            return (Criteria) this;
        }

        public Criteria andValue_content5IsNull() {
            addCriterion("value_content5 is null");
            return (Criteria) this;
        }

        public Criteria andValue_content5IsNotNull() {
            addCriterion("value_content5 is not null");
            return (Criteria) this;
        }

        public Criteria andValue_content5EqualTo(String value) {
            addCriterion("value_content5 =", value, "value_content5");
            return (Criteria) this;
        }

        public Criteria andValue_content5NotEqualTo(String value) {
            addCriterion("value_content5 <>", value, "value_content5");
            return (Criteria) this;
        }

        public Criteria andValue_content5GreaterThan(String value) {
            addCriterion("value_content5 >", value, "value_content5");
            return (Criteria) this;
        }

        public Criteria andValue_content5GreaterThanOrEqualTo(String value) {
            addCriterion("value_content5 >=", value, "value_content5");
            return (Criteria) this;
        }

        public Criteria andValue_content5LessThan(String value) {
            addCriterion("value_content5 <", value, "value_content5");
            return (Criteria) this;
        }

        public Criteria andValue_content5LessThanOrEqualTo(String value) {
            addCriterion("value_content5 <=", value, "value_content5");
            return (Criteria) this;
        }

        public Criteria andValue_content5Like(String value) {
            addCriterion("value_content5 like", value, "value_content5");
            return (Criteria) this;
        }

        public Criteria andValue_content5NotLike(String value) {
            addCriterion("value_content5 not like", value, "value_content5");
            return (Criteria) this;
        }

        public Criteria andValue_content5In(List<String> values) {
            addCriterion("value_content5 in", values, "value_content5");
            return (Criteria) this;
        }

        public Criteria andValue_content5NotIn(List<String> values) {
            addCriterion("value_content5 not in", values, "value_content5");
            return (Criteria) this;
        }

        public Criteria andValue_content5Between(String value1, String value2) {
            addCriterion("value_content5 between", value1, value2, "value_content5");
            return (Criteria) this;
        }

        public Criteria andValue_content5NotBetween(String value1, String value2) {
            addCriterion("value_content5 not between", value1, value2, "value_content5");
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