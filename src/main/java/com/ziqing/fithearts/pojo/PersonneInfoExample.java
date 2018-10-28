package com.ziqing.fithearts.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PersonneInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PersonneInfoExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andPhone_or_wechatIsNull() {
            addCriterion("phone_or_wechat is null");
            return (Criteria) this;
        }

        public Criteria andPhone_or_wechatIsNotNull() {
            addCriterion("phone_or_wechat is not null");
            return (Criteria) this;
        }

        public Criteria andPhone_or_wechatEqualTo(String value) {
            addCriterion("phone_or_wechat =", value, "phone_or_wechat");
            return (Criteria) this;
        }

        public Criteria andPhone_or_wechatNotEqualTo(String value) {
            addCriterion("phone_or_wechat <>", value, "phone_or_wechat");
            return (Criteria) this;
        }

        public Criteria andPhone_or_wechatGreaterThan(String value) {
            addCriterion("phone_or_wechat >", value, "phone_or_wechat");
            return (Criteria) this;
        }

        public Criteria andPhone_or_wechatGreaterThanOrEqualTo(String value) {
            addCriterion("phone_or_wechat >=", value, "phone_or_wechat");
            return (Criteria) this;
        }

        public Criteria andPhone_or_wechatLessThan(String value) {
            addCriterion("phone_or_wechat <", value, "phone_or_wechat");
            return (Criteria) this;
        }

        public Criteria andPhone_or_wechatLessThanOrEqualTo(String value) {
            addCriterion("phone_or_wechat <=", value, "phone_or_wechat");
            return (Criteria) this;
        }

        public Criteria andPhone_or_wechatLike(String value) {
            addCriterion("phone_or_wechat like", value, "phone_or_wechat");
            return (Criteria) this;
        }

        public Criteria andPhone_or_wechatNotLike(String value) {
            addCriterion("phone_or_wechat not like", value, "phone_or_wechat");
            return (Criteria) this;
        }

        public Criteria andPhone_or_wechatIn(List<String> values) {
            addCriterion("phone_or_wechat in", values, "phone_or_wechat");
            return (Criteria) this;
        }

        public Criteria andPhone_or_wechatNotIn(List<String> values) {
            addCriterion("phone_or_wechat not in", values, "phone_or_wechat");
            return (Criteria) this;
        }

        public Criteria andPhone_or_wechatBetween(String value1, String value2) {
            addCriterion("phone_or_wechat between", value1, value2, "phone_or_wechat");
            return (Criteria) this;
        }

        public Criteria andPhone_or_wechatNotBetween(String value1, String value2) {
            addCriterion("phone_or_wechat not between", value1, value2, "phone_or_wechat");
            return (Criteria) this;
        }

        public Criteria andParticipantidIsNull() {
            addCriterion("participantid is null");
            return (Criteria) this;
        }

        public Criteria andParticipantidIsNotNull() {
            addCriterion("participantid is not null");
            return (Criteria) this;
        }

        public Criteria andParticipantidEqualTo(Integer value) {
            addCriterion("participantid =", value, "participantid");
            return (Criteria) this;
        }

        public Criteria andParticipantidNotEqualTo(Integer value) {
            addCriterion("participantid <>", value, "participantid");
            return (Criteria) this;
        }

        public Criteria andParticipantidGreaterThan(Integer value) {
            addCriterion("participantid >", value, "participantid");
            return (Criteria) this;
        }

        public Criteria andParticipantidGreaterThanOrEqualTo(Integer value) {
            addCriterion("participantid >=", value, "participantid");
            return (Criteria) this;
        }

        public Criteria andParticipantidLessThan(Integer value) {
            addCriterion("participantid <", value, "participantid");
            return (Criteria) this;
        }

        public Criteria andParticipantidLessThanOrEqualTo(Integer value) {
            addCriterion("participantid <=", value, "participantid");
            return (Criteria) this;
        }

        public Criteria andParticipantidIn(List<Integer> values) {
            addCriterion("participantid in", values, "participantid");
            return (Criteria) this;
        }

        public Criteria andParticipantidNotIn(List<Integer> values) {
            addCriterion("participantid not in", values, "participantid");
            return (Criteria) this;
        }

        public Criteria andParticipantidBetween(Integer value1, Integer value2) {
            addCriterion("participantid between", value1, value2, "participantid");
            return (Criteria) this;
        }

        public Criteria andParticipantidNotBetween(Integer value1, Integer value2) {
            addCriterion("participantid not between", value1, value2, "participantid");
            return (Criteria) this;
        }

        public Criteria andMessageIsNull() {
            addCriterion("message is null");
            return (Criteria) this;
        }

        public Criteria andMessageIsNotNull() {
            addCriterion("message is not null");
            return (Criteria) this;
        }

        public Criteria andMessageEqualTo(String value) {
            addCriterion("message =", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotEqualTo(String value) {
            addCriterion("message <>", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThan(String value) {
            addCriterion("message >", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThanOrEqualTo(String value) {
            addCriterion("message >=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThan(String value) {
            addCriterion("message <", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThanOrEqualTo(String value) {
            addCriterion("message <=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLike(String value) {
            addCriterion("message like", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotLike(String value) {
            addCriterion("message not like", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageIn(List<String> values) {
            addCriterion("message in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotIn(List<String> values) {
            addCriterion("message not in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageBetween(String value1, String value2) {
            addCriterion("message between", value1, value2, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotBetween(String value1, String value2) {
            addCriterion("message not between", value1, value2, "message");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andComnameIsNull() {
            addCriterion("comname is null");
            return (Criteria) this;
        }

        public Criteria andComnameIsNotNull() {
            addCriterion("comname is not null");
            return (Criteria) this;
        }

        public Criteria andComnameEqualTo(String value) {
            addCriterion("comname =", value, "comname");
            return (Criteria) this;
        }

        public Criteria andComnameNotEqualTo(String value) {
            addCriterion("comname <>", value, "comname");
            return (Criteria) this;
        }

        public Criteria andComnameGreaterThan(String value) {
            addCriterion("comname >", value, "comname");
            return (Criteria) this;
        }

        public Criteria andComnameGreaterThanOrEqualTo(String value) {
            addCriterion("comname >=", value, "comname");
            return (Criteria) this;
        }

        public Criteria andComnameLessThan(String value) {
            addCriterion("comname <", value, "comname");
            return (Criteria) this;
        }

        public Criteria andComnameLessThanOrEqualTo(String value) {
            addCriterion("comname <=", value, "comname");
            return (Criteria) this;
        }

        public Criteria andComnameLike(String value) {
            addCriterion("comname like", value, "comname");
            return (Criteria) this;
        }

        public Criteria andComnameNotLike(String value) {
            addCriterion("comname not like", value, "comname");
            return (Criteria) this;
        }

        public Criteria andComnameIn(List<String> values) {
            addCriterion("comname in", values, "comname");
            return (Criteria) this;
        }

        public Criteria andComnameNotIn(List<String> values) {
            addCriterion("comname not in", values, "comname");
            return (Criteria) this;
        }

        public Criteria andComnameBetween(String value1, String value2) {
            addCriterion("comname between", value1, value2, "comname");
            return (Criteria) this;
        }

        public Criteria andComnameNotBetween(String value1, String value2) {
            addCriterion("comname not between", value1, value2, "comname");
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