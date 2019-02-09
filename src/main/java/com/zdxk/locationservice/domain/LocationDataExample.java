package com.zdxk.locationservice.domain;

import java.util.ArrayList;
import java.util.List;

public class LocationDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LocationDataExample() {
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

        public Criteria andChainStateIsNull() {
            addCriterion("chainState is null");
            return (Criteria) this;
        }

        public Criteria andChainStateIsNotNull() {
            addCriterion("chainState is not null");
            return (Criteria) this;
        }

        public Criteria andChainStateEqualTo(String value) {
            addCriterion("chainState =", value, "chainState");
            return (Criteria) this;
        }

        public Criteria andChainStateNotEqualTo(String value) {
            addCriterion("chainState <>", value, "chainState");
            return (Criteria) this;
        }

        public Criteria andChainStateGreaterThan(String value) {
            addCriterion("chainState >", value, "chainState");
            return (Criteria) this;
        }

        public Criteria andChainStateGreaterThanOrEqualTo(String value) {
            addCriterion("chainState >=", value, "chainState");
            return (Criteria) this;
        }

        public Criteria andChainStateLessThan(String value) {
            addCriterion("chainState <", value, "chainState");
            return (Criteria) this;
        }

        public Criteria andChainStateLessThanOrEqualTo(String value) {
            addCriterion("chainState <=", value, "chainState");
            return (Criteria) this;
        }

        public Criteria andChainStateLike(String value) {
            addCriterion("chainState like", value, "chainState");
            return (Criteria) this;
        }

        public Criteria andChainStateNotLike(String value) {
            addCriterion("chainState not like", value, "chainState");
            return (Criteria) this;
        }

        public Criteria andChainStateIn(List<String> values) {
            addCriterion("chainState in", values, "chainState");
            return (Criteria) this;
        }

        public Criteria andChainStateNotIn(List<String> values) {
            addCriterion("chainState not in", values, "chainState");
            return (Criteria) this;
        }

        public Criteria andChainStateBetween(String value1, String value2) {
            addCriterion("chainState between", value1, value2, "chainState");
            return (Criteria) this;
        }

        public Criteria andChainStateNotBetween(String value1, String value2) {
            addCriterion("chainState not between", value1, value2, "chainState");
            return (Criteria) this;
        }

        public Criteria andBatValueIsNull() {
            addCriterion("batValue is null");
            return (Criteria) this;
        }

        public Criteria andBatValueIsNotNull() {
            addCriterion("batValue is not null");
            return (Criteria) this;
        }

        public Criteria andBatValueEqualTo(String value) {
            addCriterion("batValue =", value, "batValue");
            return (Criteria) this;
        }

        public Criteria andBatValueNotEqualTo(String value) {
            addCriterion("batValue <>", value, "batValue");
            return (Criteria) this;
        }

        public Criteria andBatValueGreaterThan(String value) {
            addCriterion("batValue >", value, "batValue");
            return (Criteria) this;
        }

        public Criteria andBatValueGreaterThanOrEqualTo(String value) {
            addCriterion("batValue >=", value, "batValue");
            return (Criteria) this;
        }

        public Criteria andBatValueLessThan(String value) {
            addCriterion("batValue <", value, "batValue");
            return (Criteria) this;
        }

        public Criteria andBatValueLessThanOrEqualTo(String value) {
            addCriterion("batValue <=", value, "batValue");
            return (Criteria) this;
        }

        public Criteria andBatValueLike(String value) {
            addCriterion("batValue like", value, "batValue");
            return (Criteria) this;
        }

        public Criteria andBatValueNotLike(String value) {
            addCriterion("batValue not like", value, "batValue");
            return (Criteria) this;
        }

        public Criteria andBatValueIn(List<String> values) {
            addCriterion("batValue in", values, "batValue");
            return (Criteria) this;
        }

        public Criteria andBatValueNotIn(List<String> values) {
            addCriterion("batValue not in", values, "batValue");
            return (Criteria) this;
        }

        public Criteria andBatValueBetween(String value1, String value2) {
            addCriterion("batValue between", value1, value2, "batValue");
            return (Criteria) this;
        }

        public Criteria andBatValueNotBetween(String value1, String value2) {
            addCriterion("batValue not between", value1, value2, "batValue");
            return (Criteria) this;
        }

        public Criteria andRepTimeIsNull() {
            addCriterion("repTime is null");
            return (Criteria) this;
        }

        public Criteria andRepTimeIsNotNull() {
            addCriterion("repTime is not null");
            return (Criteria) this;
        }

        public Criteria andRepTimeEqualTo(String value) {
            addCriterion("repTime =", value, "repTime");
            return (Criteria) this;
        }

        public Criteria andRepTimeNotEqualTo(String value) {
            addCriterion("repTime <>", value, "repTime");
            return (Criteria) this;
        }

        public Criteria andRepTimeGreaterThan(String value) {
            addCriterion("repTime >", value, "repTime");
            return (Criteria) this;
        }

        public Criteria andRepTimeGreaterThanOrEqualTo(String value) {
            addCriterion("repTime >=", value, "repTime");
            return (Criteria) this;
        }

        public Criteria andRepTimeLessThan(String value) {
            addCriterion("repTime <", value, "repTime");
            return (Criteria) this;
        }

        public Criteria andRepTimeLessThanOrEqualTo(String value) {
            addCriterion("repTime <=", value, "repTime");
            return (Criteria) this;
        }

        public Criteria andRepTimeLike(String value) {
            addCriterion("repTime like", value, "repTime");
            return (Criteria) this;
        }

        public Criteria andRepTimeNotLike(String value) {
            addCriterion("repTime not like", value, "repTime");
            return (Criteria) this;
        }

        public Criteria andRepTimeIn(List<String> values) {
            addCriterion("repTime in", values, "repTime");
            return (Criteria) this;
        }

        public Criteria andRepTimeNotIn(List<String> values) {
            addCriterion("repTime not in", values, "repTime");
            return (Criteria) this;
        }

        public Criteria andRepTimeBetween(String value1, String value2) {
            addCriterion("repTime between", value1, value2, "repTime");
            return (Criteria) this;
        }

        public Criteria andRepTimeNotBetween(String value1, String value2) {
            addCriterion("repTime not between", value1, value2, "repTime");
            return (Criteria) this;
        }

        public Criteria andSpTypeIsNull() {
            addCriterion("spType is null");
            return (Criteria) this;
        }

        public Criteria andSpTypeIsNotNull() {
            addCriterion("spType is not null");
            return (Criteria) this;
        }

        public Criteria andSpTypeEqualTo(String value) {
            addCriterion("spType =", value, "spType");
            return (Criteria) this;
        }

        public Criteria andSpTypeNotEqualTo(String value) {
            addCriterion("spType <>", value, "spType");
            return (Criteria) this;
        }

        public Criteria andSpTypeGreaterThan(String value) {
            addCriterion("spType >", value, "spType");
            return (Criteria) this;
        }

        public Criteria andSpTypeGreaterThanOrEqualTo(String value) {
            addCriterion("spType >=", value, "spType");
            return (Criteria) this;
        }

        public Criteria andSpTypeLessThan(String value) {
            addCriterion("spType <", value, "spType");
            return (Criteria) this;
        }

        public Criteria andSpTypeLessThanOrEqualTo(String value) {
            addCriterion("spType <=", value, "spType");
            return (Criteria) this;
        }

        public Criteria andSpTypeLike(String value) {
            addCriterion("spType like", value, "spType");
            return (Criteria) this;
        }

        public Criteria andSpTypeNotLike(String value) {
            addCriterion("spType not like", value, "spType");
            return (Criteria) this;
        }

        public Criteria andSpTypeIn(List<String> values) {
            addCriterion("spType in", values, "spType");
            return (Criteria) this;
        }

        public Criteria andSpTypeNotIn(List<String> values) {
            addCriterion("spType not in", values, "spType");
            return (Criteria) this;
        }

        public Criteria andSpTypeBetween(String value1, String value2) {
            addCriterion("spType between", value1, value2, "spType");
            return (Criteria) this;
        }

        public Criteria andSpTypeNotBetween(String value1, String value2) {
            addCriterion("spType not between", value1, value2, "spType");
            return (Criteria) this;
        }

        public Criteria andLocTypeIsNull() {
            addCriterion("locType is null");
            return (Criteria) this;
        }

        public Criteria andLocTypeIsNotNull() {
            addCriterion("locType is not null");
            return (Criteria) this;
        }

        public Criteria andLocTypeEqualTo(String value) {
            addCriterion("locType =", value, "locType");
            return (Criteria) this;
        }

        public Criteria andLocTypeNotEqualTo(String value) {
            addCriterion("locType <>", value, "locType");
            return (Criteria) this;
        }

        public Criteria andLocTypeGreaterThan(String value) {
            addCriterion("locType >", value, "locType");
            return (Criteria) this;
        }

        public Criteria andLocTypeGreaterThanOrEqualTo(String value) {
            addCriterion("locType >=", value, "locType");
            return (Criteria) this;
        }

        public Criteria andLocTypeLessThan(String value) {
            addCriterion("locType <", value, "locType");
            return (Criteria) this;
        }

        public Criteria andLocTypeLessThanOrEqualTo(String value) {
            addCriterion("locType <=", value, "locType");
            return (Criteria) this;
        }

        public Criteria andLocTypeLike(String value) {
            addCriterion("locType like", value, "locType");
            return (Criteria) this;
        }

        public Criteria andLocTypeNotLike(String value) {
            addCriterion("locType not like", value, "locType");
            return (Criteria) this;
        }

        public Criteria andLocTypeIn(List<String> values) {
            addCriterion("locType in", values, "locType");
            return (Criteria) this;
        }

        public Criteria andLocTypeNotIn(List<String> values) {
            addCriterion("locType not in", values, "locType");
            return (Criteria) this;
        }

        public Criteria andLocTypeBetween(String value1, String value2) {
            addCriterion("locType between", value1, value2, "locType");
            return (Criteria) this;
        }

        public Criteria andLocTypeNotBetween(String value1, String value2) {
            addCriterion("locType not between", value1, value2, "locType");
            return (Criteria) this;
        }

        public Criteria andMcc1IsNull() {
            addCriterion("mcc1 is null");
            return (Criteria) this;
        }

        public Criteria andMcc1IsNotNull() {
            addCriterion("mcc1 is not null");
            return (Criteria) this;
        }

        public Criteria andMcc1EqualTo(String value) {
            addCriterion("mcc1 =", value, "mcc1");
            return (Criteria) this;
        }

        public Criteria andMcc1NotEqualTo(String value) {
            addCriterion("mcc1 <>", value, "mcc1");
            return (Criteria) this;
        }

        public Criteria andMcc1GreaterThan(String value) {
            addCriterion("mcc1 >", value, "mcc1");
            return (Criteria) this;
        }

        public Criteria andMcc1GreaterThanOrEqualTo(String value) {
            addCriterion("mcc1 >=", value, "mcc1");
            return (Criteria) this;
        }

        public Criteria andMcc1LessThan(String value) {
            addCriterion("mcc1 <", value, "mcc1");
            return (Criteria) this;
        }

        public Criteria andMcc1LessThanOrEqualTo(String value) {
            addCriterion("mcc1 <=", value, "mcc1");
            return (Criteria) this;
        }

        public Criteria andMcc1Like(String value) {
            addCriterion("mcc1 like", value, "mcc1");
            return (Criteria) this;
        }

        public Criteria andMcc1NotLike(String value) {
            addCriterion("mcc1 not like", value, "mcc1");
            return (Criteria) this;
        }

        public Criteria andMcc1In(List<String> values) {
            addCriterion("mcc1 in", values, "mcc1");
            return (Criteria) this;
        }

        public Criteria andMcc1NotIn(List<String> values) {
            addCriterion("mcc1 not in", values, "mcc1");
            return (Criteria) this;
        }

        public Criteria andMcc1Between(String value1, String value2) {
            addCriterion("mcc1 between", value1, value2, "mcc1");
            return (Criteria) this;
        }

        public Criteria andMcc1NotBetween(String value1, String value2) {
            addCriterion("mcc1 not between", value1, value2, "mcc1");
            return (Criteria) this;
        }

        public Criteria andMnc1IsNull() {
            addCriterion("mnc1 is null");
            return (Criteria) this;
        }

        public Criteria andMnc1IsNotNull() {
            addCriterion("mnc1 is not null");
            return (Criteria) this;
        }

        public Criteria andMnc1EqualTo(String value) {
            addCriterion("mnc1 =", value, "mnc1");
            return (Criteria) this;
        }

        public Criteria andMnc1NotEqualTo(String value) {
            addCriterion("mnc1 <>", value, "mnc1");
            return (Criteria) this;
        }

        public Criteria andMnc1GreaterThan(String value) {
            addCriterion("mnc1 >", value, "mnc1");
            return (Criteria) this;
        }

        public Criteria andMnc1GreaterThanOrEqualTo(String value) {
            addCriterion("mnc1 >=", value, "mnc1");
            return (Criteria) this;
        }

        public Criteria andMnc1LessThan(String value) {
            addCriterion("mnc1 <", value, "mnc1");
            return (Criteria) this;
        }

        public Criteria andMnc1LessThanOrEqualTo(String value) {
            addCriterion("mnc1 <=", value, "mnc1");
            return (Criteria) this;
        }

        public Criteria andMnc1Like(String value) {
            addCriterion("mnc1 like", value, "mnc1");
            return (Criteria) this;
        }

        public Criteria andMnc1NotLike(String value) {
            addCriterion("mnc1 not like", value, "mnc1");
            return (Criteria) this;
        }

        public Criteria andMnc1In(List<String> values) {
            addCriterion("mnc1 in", values, "mnc1");
            return (Criteria) this;
        }

        public Criteria andMnc1NotIn(List<String> values) {
            addCriterion("mnc1 not in", values, "mnc1");
            return (Criteria) this;
        }

        public Criteria andMnc1Between(String value1, String value2) {
            addCriterion("mnc1 between", value1, value2, "mnc1");
            return (Criteria) this;
        }

        public Criteria andMnc1NotBetween(String value1, String value2) {
            addCriterion("mnc1 not between", value1, value2, "mnc1");
            return (Criteria) this;
        }

        public Criteria andLac1IsNull() {
            addCriterion("lac1 is null");
            return (Criteria) this;
        }

        public Criteria andLac1IsNotNull() {
            addCriterion("lac1 is not null");
            return (Criteria) this;
        }

        public Criteria andLac1EqualTo(String value) {
            addCriterion("lac1 =", value, "lac1");
            return (Criteria) this;
        }

        public Criteria andLac1NotEqualTo(String value) {
            addCriterion("lac1 <>", value, "lac1");
            return (Criteria) this;
        }

        public Criteria andLac1GreaterThan(String value) {
            addCriterion("lac1 >", value, "lac1");
            return (Criteria) this;
        }

        public Criteria andLac1GreaterThanOrEqualTo(String value) {
            addCriterion("lac1 >=", value, "lac1");
            return (Criteria) this;
        }

        public Criteria andLac1LessThan(String value) {
            addCriterion("lac1 <", value, "lac1");
            return (Criteria) this;
        }

        public Criteria andLac1LessThanOrEqualTo(String value) {
            addCriterion("lac1 <=", value, "lac1");
            return (Criteria) this;
        }

        public Criteria andLac1Like(String value) {
            addCriterion("lac1 like", value, "lac1");
            return (Criteria) this;
        }

        public Criteria andLac1NotLike(String value) {
            addCriterion("lac1 not like", value, "lac1");
            return (Criteria) this;
        }

        public Criteria andLac1In(List<String> values) {
            addCriterion("lac1 in", values, "lac1");
            return (Criteria) this;
        }

        public Criteria andLac1NotIn(List<String> values) {
            addCriterion("lac1 not in", values, "lac1");
            return (Criteria) this;
        }

        public Criteria andLac1Between(String value1, String value2) {
            addCriterion("lac1 between", value1, value2, "lac1");
            return (Criteria) this;
        }

        public Criteria andLac1NotBetween(String value1, String value2) {
            addCriterion("lac1 not between", value1, value2, "lac1");
            return (Criteria) this;
        }

        public Criteria andCi1IsNull() {
            addCriterion("ci1 is null");
            return (Criteria) this;
        }

        public Criteria andCi1IsNotNull() {
            addCriterion("ci1 is not null");
            return (Criteria) this;
        }

        public Criteria andCi1EqualTo(String value) {
            addCriterion("ci1 =", value, "ci1");
            return (Criteria) this;
        }

        public Criteria andCi1NotEqualTo(String value) {
            addCriterion("ci1 <>", value, "ci1");
            return (Criteria) this;
        }

        public Criteria andCi1GreaterThan(String value) {
            addCriterion("ci1 >", value, "ci1");
            return (Criteria) this;
        }

        public Criteria andCi1GreaterThanOrEqualTo(String value) {
            addCriterion("ci1 >=", value, "ci1");
            return (Criteria) this;
        }

        public Criteria andCi1LessThan(String value) {
            addCriterion("ci1 <", value, "ci1");
            return (Criteria) this;
        }

        public Criteria andCi1LessThanOrEqualTo(String value) {
            addCriterion("ci1 <=", value, "ci1");
            return (Criteria) this;
        }

        public Criteria andCi1Like(String value) {
            addCriterion("ci1 like", value, "ci1");
            return (Criteria) this;
        }

        public Criteria andCi1NotLike(String value) {
            addCriterion("ci1 not like", value, "ci1");
            return (Criteria) this;
        }

        public Criteria andCi1In(List<String> values) {
            addCriterion("ci1 in", values, "ci1");
            return (Criteria) this;
        }

        public Criteria andCi1NotIn(List<String> values) {
            addCriterion("ci1 not in", values, "ci1");
            return (Criteria) this;
        }

        public Criteria andCi1Between(String value1, String value2) {
            addCriterion("ci1 between", value1, value2, "ci1");
            return (Criteria) this;
        }

        public Criteria andCi1NotBetween(String value1, String value2) {
            addCriterion("ci1 not between", value1, value2, "ci1");
            return (Criteria) this;
        }

        public Criteria andMcc2IsNull() {
            addCriterion("mcc2 is null");
            return (Criteria) this;
        }

        public Criteria andMcc2IsNotNull() {
            addCriterion("mcc2 is not null");
            return (Criteria) this;
        }

        public Criteria andMcc2EqualTo(String value) {
            addCriterion("mcc2 =", value, "mcc2");
            return (Criteria) this;
        }

        public Criteria andMcc2NotEqualTo(String value) {
            addCriterion("mcc2 <>", value, "mcc2");
            return (Criteria) this;
        }

        public Criteria andMcc2GreaterThan(String value) {
            addCriterion("mcc2 >", value, "mcc2");
            return (Criteria) this;
        }

        public Criteria andMcc2GreaterThanOrEqualTo(String value) {
            addCriterion("mcc2 >=", value, "mcc2");
            return (Criteria) this;
        }

        public Criteria andMcc2LessThan(String value) {
            addCriterion("mcc2 <", value, "mcc2");
            return (Criteria) this;
        }

        public Criteria andMcc2LessThanOrEqualTo(String value) {
            addCriterion("mcc2 <=", value, "mcc2");
            return (Criteria) this;
        }

        public Criteria andMcc2Like(String value) {
            addCriterion("mcc2 like", value, "mcc2");
            return (Criteria) this;
        }

        public Criteria andMcc2NotLike(String value) {
            addCriterion("mcc2 not like", value, "mcc2");
            return (Criteria) this;
        }

        public Criteria andMcc2In(List<String> values) {
            addCriterion("mcc2 in", values, "mcc2");
            return (Criteria) this;
        }

        public Criteria andMcc2NotIn(List<String> values) {
            addCriterion("mcc2 not in", values, "mcc2");
            return (Criteria) this;
        }

        public Criteria andMcc2Between(String value1, String value2) {
            addCriterion("mcc2 between", value1, value2, "mcc2");
            return (Criteria) this;
        }

        public Criteria andMcc2NotBetween(String value1, String value2) {
            addCriterion("mcc2 not between", value1, value2, "mcc2");
            return (Criteria) this;
        }

        public Criteria andMnc2IsNull() {
            addCriterion("mnc2 is null");
            return (Criteria) this;
        }

        public Criteria andMnc2IsNotNull() {
            addCriterion("mnc2 is not null");
            return (Criteria) this;
        }

        public Criteria andMnc2EqualTo(String value) {
            addCriterion("mnc2 =", value, "mnc2");
            return (Criteria) this;
        }

        public Criteria andMnc2NotEqualTo(String value) {
            addCriterion("mnc2 <>", value, "mnc2");
            return (Criteria) this;
        }

        public Criteria andMnc2GreaterThan(String value) {
            addCriterion("mnc2 >", value, "mnc2");
            return (Criteria) this;
        }

        public Criteria andMnc2GreaterThanOrEqualTo(String value) {
            addCriterion("mnc2 >=", value, "mnc2");
            return (Criteria) this;
        }

        public Criteria andMnc2LessThan(String value) {
            addCriterion("mnc2 <", value, "mnc2");
            return (Criteria) this;
        }

        public Criteria andMnc2LessThanOrEqualTo(String value) {
            addCriterion("mnc2 <=", value, "mnc2");
            return (Criteria) this;
        }

        public Criteria andMnc2Like(String value) {
            addCriterion("mnc2 like", value, "mnc2");
            return (Criteria) this;
        }

        public Criteria andMnc2NotLike(String value) {
            addCriterion("mnc2 not like", value, "mnc2");
            return (Criteria) this;
        }

        public Criteria andMnc2In(List<String> values) {
            addCriterion("mnc2 in", values, "mnc2");
            return (Criteria) this;
        }

        public Criteria andMnc2NotIn(List<String> values) {
            addCriterion("mnc2 not in", values, "mnc2");
            return (Criteria) this;
        }

        public Criteria andMnc2Between(String value1, String value2) {
            addCriterion("mnc2 between", value1, value2, "mnc2");
            return (Criteria) this;
        }

        public Criteria andMnc2NotBetween(String value1, String value2) {
            addCriterion("mnc2 not between", value1, value2, "mnc2");
            return (Criteria) this;
        }

        public Criteria andLac2IsNull() {
            addCriterion("lac2 is null");
            return (Criteria) this;
        }

        public Criteria andLac2IsNotNull() {
            addCriterion("lac2 is not null");
            return (Criteria) this;
        }

        public Criteria andLac2EqualTo(String value) {
            addCriterion("lac2 =", value, "lac2");
            return (Criteria) this;
        }

        public Criteria andLac2NotEqualTo(String value) {
            addCriterion("lac2 <>", value, "lac2");
            return (Criteria) this;
        }

        public Criteria andLac2GreaterThan(String value) {
            addCriterion("lac2 >", value, "lac2");
            return (Criteria) this;
        }

        public Criteria andLac2GreaterThanOrEqualTo(String value) {
            addCriterion("lac2 >=", value, "lac2");
            return (Criteria) this;
        }

        public Criteria andLac2LessThan(String value) {
            addCriterion("lac2 <", value, "lac2");
            return (Criteria) this;
        }

        public Criteria andLac2LessThanOrEqualTo(String value) {
            addCriterion("lac2 <=", value, "lac2");
            return (Criteria) this;
        }

        public Criteria andLac2Like(String value) {
            addCriterion("lac2 like", value, "lac2");
            return (Criteria) this;
        }

        public Criteria andLac2NotLike(String value) {
            addCriterion("lac2 not like", value, "lac2");
            return (Criteria) this;
        }

        public Criteria andLac2In(List<String> values) {
            addCriterion("lac2 in", values, "lac2");
            return (Criteria) this;
        }

        public Criteria andLac2NotIn(List<String> values) {
            addCriterion("lac2 not in", values, "lac2");
            return (Criteria) this;
        }

        public Criteria andLac2Between(String value1, String value2) {
            addCriterion("lac2 between", value1, value2, "lac2");
            return (Criteria) this;
        }

        public Criteria andLac2NotBetween(String value1, String value2) {
            addCriterion("lac2 not between", value1, value2, "lac2");
            return (Criteria) this;
        }

        public Criteria andCi2IsNull() {
            addCriterion("ci2 is null");
            return (Criteria) this;
        }

        public Criteria andCi2IsNotNull() {
            addCriterion("ci2 is not null");
            return (Criteria) this;
        }

        public Criteria andCi2EqualTo(String value) {
            addCriterion("ci2 =", value, "ci2");
            return (Criteria) this;
        }

        public Criteria andCi2NotEqualTo(String value) {
            addCriterion("ci2 <>", value, "ci2");
            return (Criteria) this;
        }

        public Criteria andCi2GreaterThan(String value) {
            addCriterion("ci2 >", value, "ci2");
            return (Criteria) this;
        }

        public Criteria andCi2GreaterThanOrEqualTo(String value) {
            addCriterion("ci2 >=", value, "ci2");
            return (Criteria) this;
        }

        public Criteria andCi2LessThan(String value) {
            addCriterion("ci2 <", value, "ci2");
            return (Criteria) this;
        }

        public Criteria andCi2LessThanOrEqualTo(String value) {
            addCriterion("ci2 <=", value, "ci2");
            return (Criteria) this;
        }

        public Criteria andCi2Like(String value) {
            addCriterion("ci2 like", value, "ci2");
            return (Criteria) this;
        }

        public Criteria andCi2NotLike(String value) {
            addCriterion("ci2 not like", value, "ci2");
            return (Criteria) this;
        }

        public Criteria andCi2In(List<String> values) {
            addCriterion("ci2 in", values, "ci2");
            return (Criteria) this;
        }

        public Criteria andCi2NotIn(List<String> values) {
            addCriterion("ci2 not in", values, "ci2");
            return (Criteria) this;
        }

        public Criteria andCi2Between(String value1, String value2) {
            addCriterion("ci2 between", value1, value2, "ci2");
            return (Criteria) this;
        }

        public Criteria andCi2NotBetween(String value1, String value2) {
            addCriterion("ci2 not between", value1, value2, "ci2");
            return (Criteria) this;
        }

        public Criteria andMcc3IsNull() {
            addCriterion("mcc3 is null");
            return (Criteria) this;
        }

        public Criteria andMcc3IsNotNull() {
            addCriterion("mcc3 is not null");
            return (Criteria) this;
        }

        public Criteria andMcc3EqualTo(String value) {
            addCriterion("mcc3 =", value, "mcc3");
            return (Criteria) this;
        }

        public Criteria andMcc3NotEqualTo(String value) {
            addCriterion("mcc3 <>", value, "mcc3");
            return (Criteria) this;
        }

        public Criteria andMcc3GreaterThan(String value) {
            addCriterion("mcc3 >", value, "mcc3");
            return (Criteria) this;
        }

        public Criteria andMcc3GreaterThanOrEqualTo(String value) {
            addCriterion("mcc3 >=", value, "mcc3");
            return (Criteria) this;
        }

        public Criteria andMcc3LessThan(String value) {
            addCriterion("mcc3 <", value, "mcc3");
            return (Criteria) this;
        }

        public Criteria andMcc3LessThanOrEqualTo(String value) {
            addCriterion("mcc3 <=", value, "mcc3");
            return (Criteria) this;
        }

        public Criteria andMcc3Like(String value) {
            addCriterion("mcc3 like", value, "mcc3");
            return (Criteria) this;
        }

        public Criteria andMcc3NotLike(String value) {
            addCriterion("mcc3 not like", value, "mcc3");
            return (Criteria) this;
        }

        public Criteria andMcc3In(List<String> values) {
            addCriterion("mcc3 in", values, "mcc3");
            return (Criteria) this;
        }

        public Criteria andMcc3NotIn(List<String> values) {
            addCriterion("mcc3 not in", values, "mcc3");
            return (Criteria) this;
        }

        public Criteria andMcc3Between(String value1, String value2) {
            addCriterion("mcc3 between", value1, value2, "mcc3");
            return (Criteria) this;
        }

        public Criteria andMcc3NotBetween(String value1, String value2) {
            addCriterion("mcc3 not between", value1, value2, "mcc3");
            return (Criteria) this;
        }

        public Criteria andMnc3IsNull() {
            addCriterion("mnc3 is null");
            return (Criteria) this;
        }

        public Criteria andMnc3IsNotNull() {
            addCriterion("mnc3 is not null");
            return (Criteria) this;
        }

        public Criteria andMnc3EqualTo(String value) {
            addCriterion("mnc3 =", value, "mnc3");
            return (Criteria) this;
        }

        public Criteria andMnc3NotEqualTo(String value) {
            addCriterion("mnc3 <>", value, "mnc3");
            return (Criteria) this;
        }

        public Criteria andMnc3GreaterThan(String value) {
            addCriterion("mnc3 >", value, "mnc3");
            return (Criteria) this;
        }

        public Criteria andMnc3GreaterThanOrEqualTo(String value) {
            addCriterion("mnc3 >=", value, "mnc3");
            return (Criteria) this;
        }

        public Criteria andMnc3LessThan(String value) {
            addCriterion("mnc3 <", value, "mnc3");
            return (Criteria) this;
        }

        public Criteria andMnc3LessThanOrEqualTo(String value) {
            addCriterion("mnc3 <=", value, "mnc3");
            return (Criteria) this;
        }

        public Criteria andMnc3Like(String value) {
            addCriterion("mnc3 like", value, "mnc3");
            return (Criteria) this;
        }

        public Criteria andMnc3NotLike(String value) {
            addCriterion("mnc3 not like", value, "mnc3");
            return (Criteria) this;
        }

        public Criteria andMnc3In(List<String> values) {
            addCriterion("mnc3 in", values, "mnc3");
            return (Criteria) this;
        }

        public Criteria andMnc3NotIn(List<String> values) {
            addCriterion("mnc3 not in", values, "mnc3");
            return (Criteria) this;
        }

        public Criteria andMnc3Between(String value1, String value2) {
            addCriterion("mnc3 between", value1, value2, "mnc3");
            return (Criteria) this;
        }

        public Criteria andMnc3NotBetween(String value1, String value2) {
            addCriterion("mnc3 not between", value1, value2, "mnc3");
            return (Criteria) this;
        }

        public Criteria andLac3IsNull() {
            addCriterion("lac3 is null");
            return (Criteria) this;
        }

        public Criteria andLac3IsNotNull() {
            addCriterion("lac3 is not null");
            return (Criteria) this;
        }

        public Criteria andLac3EqualTo(String value) {
            addCriterion("lac3 =", value, "lac3");
            return (Criteria) this;
        }

        public Criteria andLac3NotEqualTo(String value) {
            addCriterion("lac3 <>", value, "lac3");
            return (Criteria) this;
        }

        public Criteria andLac3GreaterThan(String value) {
            addCriterion("lac3 >", value, "lac3");
            return (Criteria) this;
        }

        public Criteria andLac3GreaterThanOrEqualTo(String value) {
            addCriterion("lac3 >=", value, "lac3");
            return (Criteria) this;
        }

        public Criteria andLac3LessThan(String value) {
            addCriterion("lac3 <", value, "lac3");
            return (Criteria) this;
        }

        public Criteria andLac3LessThanOrEqualTo(String value) {
            addCriterion("lac3 <=", value, "lac3");
            return (Criteria) this;
        }

        public Criteria andLac3Like(String value) {
            addCriterion("lac3 like", value, "lac3");
            return (Criteria) this;
        }

        public Criteria andLac3NotLike(String value) {
            addCriterion("lac3 not like", value, "lac3");
            return (Criteria) this;
        }

        public Criteria andLac3In(List<String> values) {
            addCriterion("lac3 in", values, "lac3");
            return (Criteria) this;
        }

        public Criteria andLac3NotIn(List<String> values) {
            addCriterion("lac3 not in", values, "lac3");
            return (Criteria) this;
        }

        public Criteria andLac3Between(String value1, String value2) {
            addCriterion("lac3 between", value1, value2, "lac3");
            return (Criteria) this;
        }

        public Criteria andLac3NotBetween(String value1, String value2) {
            addCriterion("lac3 not between", value1, value2, "lac3");
            return (Criteria) this;
        }

        public Criteria andCi3IsNull() {
            addCriterion("ci3 is null");
            return (Criteria) this;
        }

        public Criteria andCi3IsNotNull() {
            addCriterion("ci3 is not null");
            return (Criteria) this;
        }

        public Criteria andCi3EqualTo(String value) {
            addCriterion("ci3 =", value, "ci3");
            return (Criteria) this;
        }

        public Criteria andCi3NotEqualTo(String value) {
            addCriterion("ci3 <>", value, "ci3");
            return (Criteria) this;
        }

        public Criteria andCi3GreaterThan(String value) {
            addCriterion("ci3 >", value, "ci3");
            return (Criteria) this;
        }

        public Criteria andCi3GreaterThanOrEqualTo(String value) {
            addCriterion("ci3 >=", value, "ci3");
            return (Criteria) this;
        }

        public Criteria andCi3LessThan(String value) {
            addCriterion("ci3 <", value, "ci3");
            return (Criteria) this;
        }

        public Criteria andCi3LessThanOrEqualTo(String value) {
            addCriterion("ci3 <=", value, "ci3");
            return (Criteria) this;
        }

        public Criteria andCi3Like(String value) {
            addCriterion("ci3 like", value, "ci3");
            return (Criteria) this;
        }

        public Criteria andCi3NotLike(String value) {
            addCriterion("ci3 not like", value, "ci3");
            return (Criteria) this;
        }

        public Criteria andCi3In(List<String> values) {
            addCriterion("ci3 in", values, "ci3");
            return (Criteria) this;
        }

        public Criteria andCi3NotIn(List<String> values) {
            addCriterion("ci3 not in", values, "ci3");
            return (Criteria) this;
        }

        public Criteria andCi3Between(String value1, String value2) {
            addCriterion("ci3 between", value1, value2, "ci3");
            return (Criteria) this;
        }

        public Criteria andCi3NotBetween(String value1, String value2) {
            addCriterion("ci3 not between", value1, value2, "ci3");
            return (Criteria) this;
        }

        public Criteria andUploaderIsNull() {
            addCriterion("uploader is null");
            return (Criteria) this;
        }

        public Criteria andUploaderIsNotNull() {
            addCriterion("uploader is not null");
            return (Criteria) this;
        }

        public Criteria andUploaderEqualTo(String value) {
            addCriterion("uploader =", value, "uploader");
            return (Criteria) this;
        }

        public Criteria andUploaderNotEqualTo(String value) {
            addCriterion("uploader <>", value, "uploader");
            return (Criteria) this;
        }

        public Criteria andUploaderGreaterThan(String value) {
            addCriterion("uploader >", value, "uploader");
            return (Criteria) this;
        }

        public Criteria andUploaderGreaterThanOrEqualTo(String value) {
            addCriterion("uploader >=", value, "uploader");
            return (Criteria) this;
        }

        public Criteria andUploaderLessThan(String value) {
            addCriterion("uploader <", value, "uploader");
            return (Criteria) this;
        }

        public Criteria andUploaderLessThanOrEqualTo(String value) {
            addCriterion("uploader <=", value, "uploader");
            return (Criteria) this;
        }

        public Criteria andUploaderLike(String value) {
            addCriterion("uploader like", value, "uploader");
            return (Criteria) this;
        }

        public Criteria andUploaderNotLike(String value) {
            addCriterion("uploader not like", value, "uploader");
            return (Criteria) this;
        }

        public Criteria andUploaderIn(List<String> values) {
            addCriterion("uploader in", values, "uploader");
            return (Criteria) this;
        }

        public Criteria andUploaderNotIn(List<String> values) {
            addCriterion("uploader not in", values, "uploader");
            return (Criteria) this;
        }

        public Criteria andUploaderBetween(String value1, String value2) {
            addCriterion("uploader between", value1, value2, "uploader");
            return (Criteria) this;
        }

        public Criteria andUploaderNotBetween(String value1, String value2) {
            addCriterion("uploader not between", value1, value2, "uploader");
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