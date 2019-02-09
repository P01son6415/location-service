package com.zdxk.locationservice.domain;

import java.util.ArrayList;
import java.util.List;

public class DeviceInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeviceInfoExample() {
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

        public Criteria andSidIsNull() {
            addCriterion("sid is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("sid is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(Integer value) {
            addCriterion("sid =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(Integer value) {
            addCriterion("sid <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(Integer value) {
            addCriterion("sid >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sid >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(Integer value) {
            addCriterion("sid <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(Integer value) {
            addCriterion("sid <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<Integer> values) {
            addCriterion("sid in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<Integer> values) {
            addCriterion("sid not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(Integer value1, Integer value2) {
            addCriterion("sid between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(Integer value1, Integer value2) {
            addCriterion("sid not between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andDevImeiIsNull() {
            addCriterion("devImei is null");
            return (Criteria) this;
        }

        public Criteria andDevImeiIsNotNull() {
            addCriterion("devImei is not null");
            return (Criteria) this;
        }

        public Criteria andDevImeiEqualTo(String value) {
            addCriterion("devImei =", value, "devImei");
            return (Criteria) this;
        }

        public Criteria andDevImeiNotEqualTo(String value) {
            addCriterion("devImei <>", value, "devImei");
            return (Criteria) this;
        }

        public Criteria andDevImeiGreaterThan(String value) {
            addCriterion("devImei >", value, "devImei");
            return (Criteria) this;
        }

        public Criteria andDevImeiGreaterThanOrEqualTo(String value) {
            addCriterion("devImei >=", value, "devImei");
            return (Criteria) this;
        }

        public Criteria andDevImeiLessThan(String value) {
            addCriterion("devImei <", value, "devImei");
            return (Criteria) this;
        }

        public Criteria andDevImeiLessThanOrEqualTo(String value) {
            addCriterion("devImei <=", value, "devImei");
            return (Criteria) this;
        }

        public Criteria andDevImeiLike(String value) {
            addCriterion("devImei like", value, "devImei");
            return (Criteria) this;
        }

        public Criteria andDevImeiNotLike(String value) {
            addCriterion("devImei not like", value, "devImei");
            return (Criteria) this;
        }

        public Criteria andDevImeiIn(List<String> values) {
            addCriterion("devImei in", values, "devImei");
            return (Criteria) this;
        }

        public Criteria andDevImeiNotIn(List<String> values) {
            addCriterion("devImei not in", values, "devImei");
            return (Criteria) this;
        }

        public Criteria andDevImeiBetween(String value1, String value2) {
            addCriterion("devImei between", value1, value2, "devImei");
            return (Criteria) this;
        }

        public Criteria andDevImeiNotBetween(String value1, String value2) {
            addCriterion("devImei not between", value1, value2, "devImei");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andProducerIsNull() {
            addCriterion("producer is null");
            return (Criteria) this;
        }

        public Criteria andProducerIsNotNull() {
            addCriterion("producer is not null");
            return (Criteria) this;
        }

        public Criteria andProducerEqualTo(String value) {
            addCriterion("producer =", value, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerNotEqualTo(String value) {
            addCriterion("producer <>", value, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerGreaterThan(String value) {
            addCriterion("producer >", value, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerGreaterThanOrEqualTo(String value) {
            addCriterion("producer >=", value, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerLessThan(String value) {
            addCriterion("producer <", value, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerLessThanOrEqualTo(String value) {
            addCriterion("producer <=", value, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerLike(String value) {
            addCriterion("producer like", value, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerNotLike(String value) {
            addCriterion("producer not like", value, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerIn(List<String> values) {
            addCriterion("producer in", values, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerNotIn(List<String> values) {
            addCriterion("producer not in", values, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerBetween(String value1, String value2) {
            addCriterion("producer between", value1, value2, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerNotBetween(String value1, String value2) {
            addCriterion("producer not between", value1, value2, "producer");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIsNull() {
            addCriterion("registerTime is null");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIsNotNull() {
            addCriterion("registerTime is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeEqualTo(String value) {
            addCriterion("registerTime =", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotEqualTo(String value) {
            addCriterion("registerTime <>", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeGreaterThan(String value) {
            addCriterion("registerTime >", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeGreaterThanOrEqualTo(String value) {
            addCriterion("registerTime >=", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeLessThan(String value) {
            addCriterion("registerTime <", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeLessThanOrEqualTo(String value) {
            addCriterion("registerTime <=", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeLike(String value) {
            addCriterion("registerTime like", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotLike(String value) {
            addCriterion("registerTime not like", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIn(List<String> values) {
            addCriterion("registerTime in", values, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotIn(List<String> values) {
            addCriterion("registerTime not in", values, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeBetween(String value1, String value2) {
            addCriterion("registerTime between", value1, value2, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotBetween(String value1, String value2) {
            addCriterion("registerTime not between", value1, value2, "registerTime");
            return (Criteria) this;
        }

        public Criteria andLngIsNull() {
            addCriterion("lng is null");
            return (Criteria) this;
        }

        public Criteria andLngIsNotNull() {
            addCriterion("lng is not null");
            return (Criteria) this;
        }

        public Criteria andLngEqualTo(String value) {
            addCriterion("lng =", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotEqualTo(String value) {
            addCriterion("lng <>", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngGreaterThan(String value) {
            addCriterion("lng >", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngGreaterThanOrEqualTo(String value) {
            addCriterion("lng >=", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngLessThan(String value) {
            addCriterion("lng <", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngLessThanOrEqualTo(String value) {
            addCriterion("lng <=", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngLike(String value) {
            addCriterion("lng like", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotLike(String value) {
            addCriterion("lng not like", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngIn(List<String> values) {
            addCriterion("lng in", values, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotIn(List<String> values) {
            addCriterion("lng not in", values, "lng");
            return (Criteria) this;
        }

        public Criteria andLngBetween(String value1, String value2) {
            addCriterion("lng between", value1, value2, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotBetween(String value1, String value2) {
            addCriterion("lng not between", value1, value2, "lng");
            return (Criteria) this;
        }

        public Criteria andLatIsNull() {
            addCriterion("lat is null");
            return (Criteria) this;
        }

        public Criteria andLatIsNotNull() {
            addCriterion("lat is not null");
            return (Criteria) this;
        }

        public Criteria andLatEqualTo(String value) {
            addCriterion("lat =", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotEqualTo(String value) {
            addCriterion("lat <>", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatGreaterThan(String value) {
            addCriterion("lat >", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatGreaterThanOrEqualTo(String value) {
            addCriterion("lat >=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLessThan(String value) {
            addCriterion("lat <", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLessThanOrEqualTo(String value) {
            addCriterion("lat <=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLike(String value) {
            addCriterion("lat like", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotLike(String value) {
            addCriterion("lat not like", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatIn(List<String> values) {
            addCriterion("lat in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotIn(List<String> values) {
            addCriterion("lat not in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andLatBetween(String value1, String value2) {
            addCriterion("lat between", value1, value2, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotBetween(String value1, String value2) {
            addCriterion("lat not between", value1, value2, "lat");
            return (Criteria) this;
        }

        public Criteria andLastLocationTimeIsNull() {
            addCriterion("lastLocationTime is null");
            return (Criteria) this;
        }

        public Criteria andLastLocationTimeIsNotNull() {
            addCriterion("lastLocationTime is not null");
            return (Criteria) this;
        }

        public Criteria andLastLocationTimeEqualTo(String value) {
            addCriterion("lastLocationTime =", value, "lastLocationTime");
            return (Criteria) this;
        }

        public Criteria andLastLocationTimeNotEqualTo(String value) {
            addCriterion("lastLocationTime <>", value, "lastLocationTime");
            return (Criteria) this;
        }

        public Criteria andLastLocationTimeGreaterThan(String value) {
            addCriterion("lastLocationTime >", value, "lastLocationTime");
            return (Criteria) this;
        }

        public Criteria andLastLocationTimeGreaterThanOrEqualTo(String value) {
            addCriterion("lastLocationTime >=", value, "lastLocationTime");
            return (Criteria) this;
        }

        public Criteria andLastLocationTimeLessThan(String value) {
            addCriterion("lastLocationTime <", value, "lastLocationTime");
            return (Criteria) this;
        }

        public Criteria andLastLocationTimeLessThanOrEqualTo(String value) {
            addCriterion("lastLocationTime <=", value, "lastLocationTime");
            return (Criteria) this;
        }

        public Criteria andLastLocationTimeLike(String value) {
            addCriterion("lastLocationTime like", value, "lastLocationTime");
            return (Criteria) this;
        }

        public Criteria andLastLocationTimeNotLike(String value) {
            addCriterion("lastLocationTime not like", value, "lastLocationTime");
            return (Criteria) this;
        }

        public Criteria andLastLocationTimeIn(List<String> values) {
            addCriterion("lastLocationTime in", values, "lastLocationTime");
            return (Criteria) this;
        }

        public Criteria andLastLocationTimeNotIn(List<String> values) {
            addCriterion("lastLocationTime not in", values, "lastLocationTime");
            return (Criteria) this;
        }

        public Criteria andLastLocationTimeBetween(String value1, String value2) {
            addCriterion("lastLocationTime between", value1, value2, "lastLocationTime");
            return (Criteria) this;
        }

        public Criteria andLastLocationTimeNotBetween(String value1, String value2) {
            addCriterion("lastLocationTime not between", value1, value2, "lastLocationTime");
            return (Criteria) this;
        }

        public Criteria andLastMessageTimeIsNull() {
            addCriterion("lastMessageTime is null");
            return (Criteria) this;
        }

        public Criteria andLastMessageTimeIsNotNull() {
            addCriterion("lastMessageTime is not null");
            return (Criteria) this;
        }

        public Criteria andLastMessageTimeEqualTo(String value) {
            addCriterion("lastMessageTime =", value, "lastMessageTime");
            return (Criteria) this;
        }

        public Criteria andLastMessageTimeNotEqualTo(String value) {
            addCriterion("lastMessageTime <>", value, "lastMessageTime");
            return (Criteria) this;
        }

        public Criteria andLastMessageTimeGreaterThan(String value) {
            addCriterion("lastMessageTime >", value, "lastMessageTime");
            return (Criteria) this;
        }

        public Criteria andLastMessageTimeGreaterThanOrEqualTo(String value) {
            addCriterion("lastMessageTime >=", value, "lastMessageTime");
            return (Criteria) this;
        }

        public Criteria andLastMessageTimeLessThan(String value) {
            addCriterion("lastMessageTime <", value, "lastMessageTime");
            return (Criteria) this;
        }

        public Criteria andLastMessageTimeLessThanOrEqualTo(String value) {
            addCriterion("lastMessageTime <=", value, "lastMessageTime");
            return (Criteria) this;
        }

        public Criteria andLastMessageTimeLike(String value) {
            addCriterion("lastMessageTime like", value, "lastMessageTime");
            return (Criteria) this;
        }

        public Criteria andLastMessageTimeNotLike(String value) {
            addCriterion("lastMessageTime not like", value, "lastMessageTime");
            return (Criteria) this;
        }

        public Criteria andLastMessageTimeIn(List<String> values) {
            addCriterion("lastMessageTime in", values, "lastMessageTime");
            return (Criteria) this;
        }

        public Criteria andLastMessageTimeNotIn(List<String> values) {
            addCriterion("lastMessageTime not in", values, "lastMessageTime");
            return (Criteria) this;
        }

        public Criteria andLastMessageTimeBetween(String value1, String value2) {
            addCriterion("lastMessageTime between", value1, value2, "lastMessageTime");
            return (Criteria) this;
        }

        public Criteria andLastMessageTimeNotBetween(String value1, String value2) {
            addCriterion("lastMessageTime not between", value1, value2, "lastMessageTime");
            return (Criteria) this;
        }

        public Criteria andLocNameIsNull() {
            addCriterion("locName is null");
            return (Criteria) this;
        }

        public Criteria andLocNameIsNotNull() {
            addCriterion("locName is not null");
            return (Criteria) this;
        }

        public Criteria andLocNameEqualTo(String value) {
            addCriterion("locName =", value, "locName");
            return (Criteria) this;
        }

        public Criteria andLocNameNotEqualTo(String value) {
            addCriterion("locName <>", value, "locName");
            return (Criteria) this;
        }

        public Criteria andLocNameGreaterThan(String value) {
            addCriterion("locName >", value, "locName");
            return (Criteria) this;
        }

        public Criteria andLocNameGreaterThanOrEqualTo(String value) {
            addCriterion("locName >=", value, "locName");
            return (Criteria) this;
        }

        public Criteria andLocNameLessThan(String value) {
            addCriterion("locName <", value, "locName");
            return (Criteria) this;
        }

        public Criteria andLocNameLessThanOrEqualTo(String value) {
            addCriterion("locName <=", value, "locName");
            return (Criteria) this;
        }

        public Criteria andLocNameLike(String value) {
            addCriterion("locName like", value, "locName");
            return (Criteria) this;
        }

        public Criteria andLocNameNotLike(String value) {
            addCriterion("locName not like", value, "locName");
            return (Criteria) this;
        }

        public Criteria andLocNameIn(List<String> values) {
            addCriterion("locName in", values, "locName");
            return (Criteria) this;
        }

        public Criteria andLocNameNotIn(List<String> values) {
            addCriterion("locName not in", values, "locName");
            return (Criteria) this;
        }

        public Criteria andLocNameBetween(String value1, String value2) {
            addCriterion("locName between", value1, value2, "locName");
            return (Criteria) this;
        }

        public Criteria andLocNameNotBetween(String value1, String value2) {
            addCriterion("locName not between", value1, value2, "locName");
            return (Criteria) this;
        }

        public Criteria andTimeIntervalIsNull() {
            addCriterion("timeInterval is null");
            return (Criteria) this;
        }

        public Criteria andTimeIntervalIsNotNull() {
            addCriterion("timeInterval is not null");
            return (Criteria) this;
        }

        public Criteria andTimeIntervalEqualTo(String value) {
            addCriterion("timeInterval =", value, "timeInterval");
            return (Criteria) this;
        }

        public Criteria andTimeIntervalNotEqualTo(String value) {
            addCriterion("timeInterval <>", value, "timeInterval");
            return (Criteria) this;
        }

        public Criteria andTimeIntervalGreaterThan(String value) {
            addCriterion("timeInterval >", value, "timeInterval");
            return (Criteria) this;
        }

        public Criteria andTimeIntervalGreaterThanOrEqualTo(String value) {
            addCriterion("timeInterval >=", value, "timeInterval");
            return (Criteria) this;
        }

        public Criteria andTimeIntervalLessThan(String value) {
            addCriterion("timeInterval <", value, "timeInterval");
            return (Criteria) this;
        }

        public Criteria andTimeIntervalLessThanOrEqualTo(String value) {
            addCriterion("timeInterval <=", value, "timeInterval");
            return (Criteria) this;
        }

        public Criteria andTimeIntervalLike(String value) {
            addCriterion("timeInterval like", value, "timeInterval");
            return (Criteria) this;
        }

        public Criteria andTimeIntervalNotLike(String value) {
            addCriterion("timeInterval not like", value, "timeInterval");
            return (Criteria) this;
        }

        public Criteria andTimeIntervalIn(List<String> values) {
            addCriterion("timeInterval in", values, "timeInterval");
            return (Criteria) this;
        }

        public Criteria andTimeIntervalNotIn(List<String> values) {
            addCriterion("timeInterval not in", values, "timeInterval");
            return (Criteria) this;
        }

        public Criteria andTimeIntervalBetween(String value1, String value2) {
            addCriterion("timeInterval between", value1, value2, "timeInterval");
            return (Criteria) this;
        }

        public Criteria andTimeIntervalNotBetween(String value1, String value2) {
            addCriterion("timeInterval not between", value1, value2, "timeInterval");
            return (Criteria) this;
        }

        public Criteria andTransmitUrlIsNull() {
            addCriterion("transmitUrl is null");
            return (Criteria) this;
        }

        public Criteria andTransmitUrlIsNotNull() {
            addCriterion("transmitUrl is not null");
            return (Criteria) this;
        }

        public Criteria andTransmitUrlEqualTo(String value) {
            addCriterion("transmitUrl =", value, "transmitUrl");
            return (Criteria) this;
        }

        public Criteria andTransmitUrlNotEqualTo(String value) {
            addCriterion("transmitUrl <>", value, "transmitUrl");
            return (Criteria) this;
        }

        public Criteria andTransmitUrlGreaterThan(String value) {
            addCriterion("transmitUrl >", value, "transmitUrl");
            return (Criteria) this;
        }

        public Criteria andTransmitUrlGreaterThanOrEqualTo(String value) {
            addCriterion("transmitUrl >=", value, "transmitUrl");
            return (Criteria) this;
        }

        public Criteria andTransmitUrlLessThan(String value) {
            addCriterion("transmitUrl <", value, "transmitUrl");
            return (Criteria) this;
        }

        public Criteria andTransmitUrlLessThanOrEqualTo(String value) {
            addCriterion("transmitUrl <=", value, "transmitUrl");
            return (Criteria) this;
        }

        public Criteria andTransmitUrlLike(String value) {
            addCriterion("transmitUrl like", value, "transmitUrl");
            return (Criteria) this;
        }

        public Criteria andTransmitUrlNotLike(String value) {
            addCriterion("transmitUrl not like", value, "transmitUrl");
            return (Criteria) this;
        }

        public Criteria andTransmitUrlIn(List<String> values) {
            addCriterion("transmitUrl in", values, "transmitUrl");
            return (Criteria) this;
        }

        public Criteria andTransmitUrlNotIn(List<String> values) {
            addCriterion("transmitUrl not in", values, "transmitUrl");
            return (Criteria) this;
        }

        public Criteria andTransmitUrlBetween(String value1, String value2) {
            addCriterion("transmitUrl between", value1, value2, "transmitUrl");
            return (Criteria) this;
        }

        public Criteria andTransmitUrlNotBetween(String value1, String value2) {
            addCriterion("transmitUrl not between", value1, value2, "transmitUrl");
            return (Criteria) this;
        }

        public Criteria andConnectionStatusIsNull() {
            addCriterion("connectionStatus is null");
            return (Criteria) this;
        }

        public Criteria andConnectionStatusIsNotNull() {
            addCriterion("connectionStatus is not null");
            return (Criteria) this;
        }

        public Criteria andConnectionStatusEqualTo(String value) {
            addCriterion("connectionStatus =", value, "connectionStatus");
            return (Criteria) this;
        }

        public Criteria andConnectionStatusNotEqualTo(String value) {
            addCriterion("connectionStatus <>", value, "connectionStatus");
            return (Criteria) this;
        }

        public Criteria andConnectionStatusGreaterThan(String value) {
            addCriterion("connectionStatus >", value, "connectionStatus");
            return (Criteria) this;
        }

        public Criteria andConnectionStatusGreaterThanOrEqualTo(String value) {
            addCriterion("connectionStatus >=", value, "connectionStatus");
            return (Criteria) this;
        }

        public Criteria andConnectionStatusLessThan(String value) {
            addCriterion("connectionStatus <", value, "connectionStatus");
            return (Criteria) this;
        }

        public Criteria andConnectionStatusLessThanOrEqualTo(String value) {
            addCriterion("connectionStatus <=", value, "connectionStatus");
            return (Criteria) this;
        }

        public Criteria andConnectionStatusLike(String value) {
            addCriterion("connectionStatus like", value, "connectionStatus");
            return (Criteria) this;
        }

        public Criteria andConnectionStatusNotLike(String value) {
            addCriterion("connectionStatus not like", value, "connectionStatus");
            return (Criteria) this;
        }

        public Criteria andConnectionStatusIn(List<String> values) {
            addCriterion("connectionStatus in", values, "connectionStatus");
            return (Criteria) this;
        }

        public Criteria andConnectionStatusNotIn(List<String> values) {
            addCriterion("connectionStatus not in", values, "connectionStatus");
            return (Criteria) this;
        }

        public Criteria andConnectionStatusBetween(String value1, String value2) {
            addCriterion("connectionStatus between", value1, value2, "connectionStatus");
            return (Criteria) this;
        }

        public Criteria andConnectionStatusNotBetween(String value1, String value2) {
            addCriterion("connectionStatus not between", value1, value2, "connectionStatus");
            return (Criteria) this;
        }

        public Criteria andReserved1IsNull() {
            addCriterion("reserved1 is null");
            return (Criteria) this;
        }

        public Criteria andReserved1IsNotNull() {
            addCriterion("reserved1 is not null");
            return (Criteria) this;
        }

        public Criteria andReserved1EqualTo(String value) {
            addCriterion("reserved1 =", value, "reserved1");
            return (Criteria) this;
        }

        public Criteria andReserved1NotEqualTo(String value) {
            addCriterion("reserved1 <>", value, "reserved1");
            return (Criteria) this;
        }

        public Criteria andReserved1GreaterThan(String value) {
            addCriterion("reserved1 >", value, "reserved1");
            return (Criteria) this;
        }

        public Criteria andReserved1GreaterThanOrEqualTo(String value) {
            addCriterion("reserved1 >=", value, "reserved1");
            return (Criteria) this;
        }

        public Criteria andReserved1LessThan(String value) {
            addCriterion("reserved1 <", value, "reserved1");
            return (Criteria) this;
        }

        public Criteria andReserved1LessThanOrEqualTo(String value) {
            addCriterion("reserved1 <=", value, "reserved1");
            return (Criteria) this;
        }

        public Criteria andReserved1Like(String value) {
            addCriterion("reserved1 like", value, "reserved1");
            return (Criteria) this;
        }

        public Criteria andReserved1NotLike(String value) {
            addCriterion("reserved1 not like", value, "reserved1");
            return (Criteria) this;
        }

        public Criteria andReserved1In(List<String> values) {
            addCriterion("reserved1 in", values, "reserved1");
            return (Criteria) this;
        }

        public Criteria andReserved1NotIn(List<String> values) {
            addCriterion("reserved1 not in", values, "reserved1");
            return (Criteria) this;
        }

        public Criteria andReserved1Between(String value1, String value2) {
            addCriterion("reserved1 between", value1, value2, "reserved1");
            return (Criteria) this;
        }

        public Criteria andReserved1NotBetween(String value1, String value2) {
            addCriterion("reserved1 not between", value1, value2, "reserved1");
            return (Criteria) this;
        }

        public Criteria andReserved2IsNull() {
            addCriterion("reserved2 is null");
            return (Criteria) this;
        }

        public Criteria andReserved2IsNotNull() {
            addCriterion("reserved2 is not null");
            return (Criteria) this;
        }

        public Criteria andReserved2EqualTo(String value) {
            addCriterion("reserved2 =", value, "reserved2");
            return (Criteria) this;
        }

        public Criteria andReserved2NotEqualTo(String value) {
            addCriterion("reserved2 <>", value, "reserved2");
            return (Criteria) this;
        }

        public Criteria andReserved2GreaterThan(String value) {
            addCriterion("reserved2 >", value, "reserved2");
            return (Criteria) this;
        }

        public Criteria andReserved2GreaterThanOrEqualTo(String value) {
            addCriterion("reserved2 >=", value, "reserved2");
            return (Criteria) this;
        }

        public Criteria andReserved2LessThan(String value) {
            addCriterion("reserved2 <", value, "reserved2");
            return (Criteria) this;
        }

        public Criteria andReserved2LessThanOrEqualTo(String value) {
            addCriterion("reserved2 <=", value, "reserved2");
            return (Criteria) this;
        }

        public Criteria andReserved2Like(String value) {
            addCriterion("reserved2 like", value, "reserved2");
            return (Criteria) this;
        }

        public Criteria andReserved2NotLike(String value) {
            addCriterion("reserved2 not like", value, "reserved2");
            return (Criteria) this;
        }

        public Criteria andReserved2In(List<String> values) {
            addCriterion("reserved2 in", values, "reserved2");
            return (Criteria) this;
        }

        public Criteria andReserved2NotIn(List<String> values) {
            addCriterion("reserved2 not in", values, "reserved2");
            return (Criteria) this;
        }

        public Criteria andReserved2Between(String value1, String value2) {
            addCriterion("reserved2 between", value1, value2, "reserved2");
            return (Criteria) this;
        }

        public Criteria andReserved2NotBetween(String value1, String value2) {
            addCriterion("reserved2 not between", value1, value2, "reserved2");
            return (Criteria) this;
        }

        public Criteria andReserved3IsNull() {
            addCriterion("reserved3 is null");
            return (Criteria) this;
        }

        public Criteria andReserved3IsNotNull() {
            addCriterion("reserved3 is not null");
            return (Criteria) this;
        }

        public Criteria andReserved3EqualTo(String value) {
            addCriterion("reserved3 =", value, "reserved3");
            return (Criteria) this;
        }

        public Criteria andReserved3NotEqualTo(String value) {
            addCriterion("reserved3 <>", value, "reserved3");
            return (Criteria) this;
        }

        public Criteria andReserved3GreaterThan(String value) {
            addCriterion("reserved3 >", value, "reserved3");
            return (Criteria) this;
        }

        public Criteria andReserved3GreaterThanOrEqualTo(String value) {
            addCriterion("reserved3 >=", value, "reserved3");
            return (Criteria) this;
        }

        public Criteria andReserved3LessThan(String value) {
            addCriterion("reserved3 <", value, "reserved3");
            return (Criteria) this;
        }

        public Criteria andReserved3LessThanOrEqualTo(String value) {
            addCriterion("reserved3 <=", value, "reserved3");
            return (Criteria) this;
        }

        public Criteria andReserved3Like(String value) {
            addCriterion("reserved3 like", value, "reserved3");
            return (Criteria) this;
        }

        public Criteria andReserved3NotLike(String value) {
            addCriterion("reserved3 not like", value, "reserved3");
            return (Criteria) this;
        }

        public Criteria andReserved3In(List<String> values) {
            addCriterion("reserved3 in", values, "reserved3");
            return (Criteria) this;
        }

        public Criteria andReserved3NotIn(List<String> values) {
            addCriterion("reserved3 not in", values, "reserved3");
            return (Criteria) this;
        }

        public Criteria andReserved3Between(String value1, String value2) {
            addCriterion("reserved3 between", value1, value2, "reserved3");
            return (Criteria) this;
        }

        public Criteria andReserved3NotBetween(String value1, String value2) {
            addCriterion("reserved3 not between", value1, value2, "reserved3");
            return (Criteria) this;
        }

        public Criteria andReserved4IsNull() {
            addCriterion("reserved4 is null");
            return (Criteria) this;
        }

        public Criteria andReserved4IsNotNull() {
            addCriterion("reserved4 is not null");
            return (Criteria) this;
        }

        public Criteria andReserved4EqualTo(String value) {
            addCriterion("reserved4 =", value, "reserved4");
            return (Criteria) this;
        }

        public Criteria andReserved4NotEqualTo(String value) {
            addCriterion("reserved4 <>", value, "reserved4");
            return (Criteria) this;
        }

        public Criteria andReserved4GreaterThan(String value) {
            addCriterion("reserved4 >", value, "reserved4");
            return (Criteria) this;
        }

        public Criteria andReserved4GreaterThanOrEqualTo(String value) {
            addCriterion("reserved4 >=", value, "reserved4");
            return (Criteria) this;
        }

        public Criteria andReserved4LessThan(String value) {
            addCriterion("reserved4 <", value, "reserved4");
            return (Criteria) this;
        }

        public Criteria andReserved4LessThanOrEqualTo(String value) {
            addCriterion("reserved4 <=", value, "reserved4");
            return (Criteria) this;
        }

        public Criteria andReserved4Like(String value) {
            addCriterion("reserved4 like", value, "reserved4");
            return (Criteria) this;
        }

        public Criteria andReserved4NotLike(String value) {
            addCriterion("reserved4 not like", value, "reserved4");
            return (Criteria) this;
        }

        public Criteria andReserved4In(List<String> values) {
            addCriterion("reserved4 in", values, "reserved4");
            return (Criteria) this;
        }

        public Criteria andReserved4NotIn(List<String> values) {
            addCriterion("reserved4 not in", values, "reserved4");
            return (Criteria) this;
        }

        public Criteria andReserved4Between(String value1, String value2) {
            addCriterion("reserved4 between", value1, value2, "reserved4");
            return (Criteria) this;
        }

        public Criteria andReserved4NotBetween(String value1, String value2) {
            addCriterion("reserved4 not between", value1, value2, "reserved4");
            return (Criteria) this;
        }

        public Criteria andReserved5IsNull() {
            addCriterion("reserved5 is null");
            return (Criteria) this;
        }

        public Criteria andReserved5IsNotNull() {
            addCriterion("reserved5 is not null");
            return (Criteria) this;
        }

        public Criteria andReserved5EqualTo(String value) {
            addCriterion("reserved5 =", value, "reserved5");
            return (Criteria) this;
        }

        public Criteria andReserved5NotEqualTo(String value) {
            addCriterion("reserved5 <>", value, "reserved5");
            return (Criteria) this;
        }

        public Criteria andReserved5GreaterThan(String value) {
            addCriterion("reserved5 >", value, "reserved5");
            return (Criteria) this;
        }

        public Criteria andReserved5GreaterThanOrEqualTo(String value) {
            addCriterion("reserved5 >=", value, "reserved5");
            return (Criteria) this;
        }

        public Criteria andReserved5LessThan(String value) {
            addCriterion("reserved5 <", value, "reserved5");
            return (Criteria) this;
        }

        public Criteria andReserved5LessThanOrEqualTo(String value) {
            addCriterion("reserved5 <=", value, "reserved5");
            return (Criteria) this;
        }

        public Criteria andReserved5Like(String value) {
            addCriterion("reserved5 like", value, "reserved5");
            return (Criteria) this;
        }

        public Criteria andReserved5NotLike(String value) {
            addCriterion("reserved5 not like", value, "reserved5");
            return (Criteria) this;
        }

        public Criteria andReserved5In(List<String> values) {
            addCriterion("reserved5 in", values, "reserved5");
            return (Criteria) this;
        }

        public Criteria andReserved5NotIn(List<String> values) {
            addCriterion("reserved5 not in", values, "reserved5");
            return (Criteria) this;
        }

        public Criteria andReserved5Between(String value1, String value2) {
            addCriterion("reserved5 between", value1, value2, "reserved5");
            return (Criteria) this;
        }

        public Criteria andReserved5NotBetween(String value1, String value2) {
            addCriterion("reserved5 not between", value1, value2, "reserved5");
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