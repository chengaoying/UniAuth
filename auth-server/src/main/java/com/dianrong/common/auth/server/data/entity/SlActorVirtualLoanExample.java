package com.dianrong.common.auth.server.data.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SlActorVirtualLoanExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table SL$ACTOR_VIRTUAL_LOAN
     *
     * @mbggenerated Thu May 05 10:43:21 CST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table SL$ACTOR_VIRTUAL_LOAN
     *
     * @mbggenerated Thu May 05 10:43:21 CST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table SL$ACTOR_VIRTUAL_LOAN
     *
     * @mbggenerated Thu May 05 10:43:21 CST 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SL$ACTOR_VIRTUAL_LOAN
     *
     * @mbggenerated Thu May 05 10:43:21 CST 2016
     */
    public SlActorVirtualLoanExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SL$ACTOR_VIRTUAL_LOAN
     *
     * @mbggenerated Thu May 05 10:43:21 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SL$ACTOR_VIRTUAL_LOAN
     *
     * @mbggenerated Thu May 05 10:43:21 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SL$ACTOR_VIRTUAL_LOAN
     *
     * @mbggenerated Thu May 05 10:43:21 CST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SL$ACTOR_VIRTUAL_LOAN
     *
     * @mbggenerated Thu May 05 10:43:21 CST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SL$ACTOR_VIRTUAL_LOAN
     *
     * @mbggenerated Thu May 05 10:43:21 CST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SL$ACTOR_VIRTUAL_LOAN
     *
     * @mbggenerated Thu May 05 10:43:21 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SL$ACTOR_VIRTUAL_LOAN
     *
     * @mbggenerated Thu May 05 10:43:21 CST 2016
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SL$ACTOR_VIRTUAL_LOAN
     *
     * @mbggenerated Thu May 05 10:43:21 CST 2016
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SL$ACTOR_VIRTUAL_LOAN
     *
     * @mbggenerated Thu May 05 10:43:21 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SL$ACTOR_VIRTUAL_LOAN
     *
     * @mbggenerated Thu May 05 10:43:21 CST 2016
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table SL$ACTOR_VIRTUAL_LOAN
     *
     * @mbggenerated Thu May 05 10:43:21 CST 2016
     */
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

        public Criteria andAidIsNull() {
            addCriterion("AID is null");
            return (Criteria) this;
        }

        public Criteria andAidIsNotNull() {
            addCriterion("AID is not null");
            return (Criteria) this;
        }

        public Criteria andAidEqualTo(BigDecimal value) {
            addCriterion("AID =", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotEqualTo(BigDecimal value) {
            addCriterion("AID <>", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThan(BigDecimal value) {
            addCriterion("AID >", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AID >=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThan(BigDecimal value) {
            addCriterion("AID <", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AID <=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidIn(List<BigDecimal> values) {
            addCriterion("AID in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotIn(List<BigDecimal> values) {
            addCriterion("AID not in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AID between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AID not between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andReferralsIsNull() {
            addCriterion("REFERRALS is null");
            return (Criteria) this;
        }

        public Criteria andReferralsIsNotNull() {
            addCriterion("REFERRALS is not null");
            return (Criteria) this;
        }

        public Criteria andReferralsEqualTo(BigDecimal value) {
            addCriterion("REFERRALS =", value, "referrals");
            return (Criteria) this;
        }

        public Criteria andReferralsNotEqualTo(BigDecimal value) {
            addCriterion("REFERRALS <>", value, "referrals");
            return (Criteria) this;
        }

        public Criteria andReferralsGreaterThan(BigDecimal value) {
            addCriterion("REFERRALS >", value, "referrals");
            return (Criteria) this;
        }

        public Criteria andReferralsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REFERRALS >=", value, "referrals");
            return (Criteria) this;
        }

        public Criteria andReferralsLessThan(BigDecimal value) {
            addCriterion("REFERRALS <", value, "referrals");
            return (Criteria) this;
        }

        public Criteria andReferralsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REFERRALS <=", value, "referrals");
            return (Criteria) this;
        }

        public Criteria andReferralsIn(List<BigDecimal> values) {
            addCriterion("REFERRALS in", values, "referrals");
            return (Criteria) this;
        }

        public Criteria andReferralsNotIn(List<BigDecimal> values) {
            addCriterion("REFERRALS not in", values, "referrals");
            return (Criteria) this;
        }

        public Criteria andReferralsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REFERRALS between", value1, value2, "referrals");
            return (Criteria) this;
        }

        public Criteria andReferralsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REFERRALS not between", value1, value2, "referrals");
            return (Criteria) this;
        }

        public Criteria andTotalProfitIsNull() {
            addCriterion("TOTAL_PROFIT is null");
            return (Criteria) this;
        }

        public Criteria andTotalProfitIsNotNull() {
            addCriterion("TOTAL_PROFIT is not null");
            return (Criteria) this;
        }

        public Criteria andTotalProfitEqualTo(BigDecimal value) {
            addCriterion("TOTAL_PROFIT =", value, "totalProfit");
            return (Criteria) this;
        }

        public Criteria andTotalProfitNotEqualTo(BigDecimal value) {
            addCriterion("TOTAL_PROFIT <>", value, "totalProfit");
            return (Criteria) this;
        }

        public Criteria andTotalProfitGreaterThan(BigDecimal value) {
            addCriterion("TOTAL_PROFIT >", value, "totalProfit");
            return (Criteria) this;
        }

        public Criteria andTotalProfitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_PROFIT >=", value, "totalProfit");
            return (Criteria) this;
        }

        public Criteria andTotalProfitLessThan(BigDecimal value) {
            addCriterion("TOTAL_PROFIT <", value, "totalProfit");
            return (Criteria) this;
        }

        public Criteria andTotalProfitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_PROFIT <=", value, "totalProfit");
            return (Criteria) this;
        }

        public Criteria andTotalProfitIn(List<BigDecimal> values) {
            addCriterion("TOTAL_PROFIT in", values, "totalProfit");
            return (Criteria) this;
        }

        public Criteria andTotalProfitNotIn(List<BigDecimal> values) {
            addCriterion("TOTAL_PROFIT not in", values, "totalProfit");
            return (Criteria) this;
        }

        public Criteria andTotalProfitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_PROFIT between", value1, value2, "totalProfit");
            return (Criteria) this;
        }

        public Criteria andTotalProfitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_PROFIT not between", value1, value2, "totalProfit");
            return (Criteria) this;
        }

        public Criteria andTotalProfitDateIsNull() {
            addCriterion("TOTAL_PROFIT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andTotalProfitDateIsNotNull() {
            addCriterion("TOTAL_PROFIT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andTotalProfitDateEqualTo(Date value) {
            addCriterion("TOTAL_PROFIT_DATE =", value, "totalProfitDate");
            return (Criteria) this;
        }

        public Criteria andTotalProfitDateNotEqualTo(Date value) {
            addCriterion("TOTAL_PROFIT_DATE <>", value, "totalProfitDate");
            return (Criteria) this;
        }

        public Criteria andTotalProfitDateGreaterThan(Date value) {
            addCriterion("TOTAL_PROFIT_DATE >", value, "totalProfitDate");
            return (Criteria) this;
        }

        public Criteria andTotalProfitDateGreaterThanOrEqualTo(Date value) {
            addCriterion("TOTAL_PROFIT_DATE >=", value, "totalProfitDate");
            return (Criteria) this;
        }

        public Criteria andTotalProfitDateLessThan(Date value) {
            addCriterion("TOTAL_PROFIT_DATE <", value, "totalProfitDate");
            return (Criteria) this;
        }

        public Criteria andTotalProfitDateLessThanOrEqualTo(Date value) {
            addCriterion("TOTAL_PROFIT_DATE <=", value, "totalProfitDate");
            return (Criteria) this;
        }

        public Criteria andTotalProfitDateIn(List<Date> values) {
            addCriterion("TOTAL_PROFIT_DATE in", values, "totalProfitDate");
            return (Criteria) this;
        }

        public Criteria andTotalProfitDateNotIn(List<Date> values) {
            addCriterion("TOTAL_PROFIT_DATE not in", values, "totalProfitDate");
            return (Criteria) this;
        }

        public Criteria andTotalProfitDateBetween(Date value1, Date value2) {
            addCriterion("TOTAL_PROFIT_DATE between", value1, value2, "totalProfitDate");
            return (Criteria) this;
        }

        public Criteria andTotalProfitDateNotBetween(Date value1, Date value2) {
            addCriterion("TOTAL_PROFIT_DATE not between", value1, value2, "totalProfitDate");
            return (Criteria) this;
        }

        public Criteria andYesterdayProfitIsNull() {
            addCriterion("YESTERDAY_PROFIT is null");
            return (Criteria) this;
        }

        public Criteria andYesterdayProfitIsNotNull() {
            addCriterion("YESTERDAY_PROFIT is not null");
            return (Criteria) this;
        }

        public Criteria andYesterdayProfitEqualTo(BigDecimal value) {
            addCriterion("YESTERDAY_PROFIT =", value, "yesterdayProfit");
            return (Criteria) this;
        }

        public Criteria andYesterdayProfitNotEqualTo(BigDecimal value) {
            addCriterion("YESTERDAY_PROFIT <>", value, "yesterdayProfit");
            return (Criteria) this;
        }

        public Criteria andYesterdayProfitGreaterThan(BigDecimal value) {
            addCriterion("YESTERDAY_PROFIT >", value, "yesterdayProfit");
            return (Criteria) this;
        }

        public Criteria andYesterdayProfitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("YESTERDAY_PROFIT >=", value, "yesterdayProfit");
            return (Criteria) this;
        }

        public Criteria andYesterdayProfitLessThan(BigDecimal value) {
            addCriterion("YESTERDAY_PROFIT <", value, "yesterdayProfit");
            return (Criteria) this;
        }

        public Criteria andYesterdayProfitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("YESTERDAY_PROFIT <=", value, "yesterdayProfit");
            return (Criteria) this;
        }

        public Criteria andYesterdayProfitIn(List<BigDecimal> values) {
            addCriterion("YESTERDAY_PROFIT in", values, "yesterdayProfit");
            return (Criteria) this;
        }

        public Criteria andYesterdayProfitNotIn(List<BigDecimal> values) {
            addCriterion("YESTERDAY_PROFIT not in", values, "yesterdayProfit");
            return (Criteria) this;
        }

        public Criteria andYesterdayProfitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YESTERDAY_PROFIT between", value1, value2, "yesterdayProfit");
            return (Criteria) this;
        }

        public Criteria andYesterdayProfitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YESTERDAY_PROFIT not between", value1, value2, "yesterdayProfit");
            return (Criteria) this;
        }

        public Criteria andYesterdayProfitDateIsNull() {
            addCriterion("YESTERDAY_PROFIT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andYesterdayProfitDateIsNotNull() {
            addCriterion("YESTERDAY_PROFIT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andYesterdayProfitDateEqualTo(Date value) {
            addCriterion("YESTERDAY_PROFIT_DATE =", value, "yesterdayProfitDate");
            return (Criteria) this;
        }

        public Criteria andYesterdayProfitDateNotEqualTo(Date value) {
            addCriterion("YESTERDAY_PROFIT_DATE <>", value, "yesterdayProfitDate");
            return (Criteria) this;
        }

        public Criteria andYesterdayProfitDateGreaterThan(Date value) {
            addCriterion("YESTERDAY_PROFIT_DATE >", value, "yesterdayProfitDate");
            return (Criteria) this;
        }

        public Criteria andYesterdayProfitDateGreaterThanOrEqualTo(Date value) {
            addCriterion("YESTERDAY_PROFIT_DATE >=", value, "yesterdayProfitDate");
            return (Criteria) this;
        }

        public Criteria andYesterdayProfitDateLessThan(Date value) {
            addCriterion("YESTERDAY_PROFIT_DATE <", value, "yesterdayProfitDate");
            return (Criteria) this;
        }

        public Criteria andYesterdayProfitDateLessThanOrEqualTo(Date value) {
            addCriterion("YESTERDAY_PROFIT_DATE <=", value, "yesterdayProfitDate");
            return (Criteria) this;
        }

        public Criteria andYesterdayProfitDateIn(List<Date> values) {
            addCriterion("YESTERDAY_PROFIT_DATE in", values, "yesterdayProfitDate");
            return (Criteria) this;
        }

        public Criteria andYesterdayProfitDateNotIn(List<Date> values) {
            addCriterion("YESTERDAY_PROFIT_DATE not in", values, "yesterdayProfitDate");
            return (Criteria) this;
        }

        public Criteria andYesterdayProfitDateBetween(Date value1, Date value2) {
            addCriterion("YESTERDAY_PROFIT_DATE between", value1, value2, "yesterdayProfitDate");
            return (Criteria) this;
        }

        public Criteria andYesterdayProfitDateNotBetween(Date value1, Date value2) {
            addCriterion("YESTERDAY_PROFIT_DATE not between", value1, value2, "yesterdayProfitDate");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Short value) {
            addCriterion("TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Short value) {
            addCriterion("TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Short value) {
            addCriterion("TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Short value) {
            addCriterion("TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Short value) {
            addCriterion("TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Short> values) {
            addCriterion("TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Short> values) {
            addCriterion("TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Short value1, Short value2) {
            addCriterion("TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Short value1, Short value2) {
            addCriterion("TYPE not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andVirtualLoanIdIsNull() {
            addCriterion("VIRTUAL_LOAN_ID is null");
            return (Criteria) this;
        }

        public Criteria andVirtualLoanIdIsNotNull() {
            addCriterion("VIRTUAL_LOAN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andVirtualLoanIdEqualTo(BigDecimal value) {
            addCriterion("VIRTUAL_LOAN_ID =", value, "virtualLoanId");
            return (Criteria) this;
        }

        public Criteria andVirtualLoanIdNotEqualTo(BigDecimal value) {
            addCriterion("VIRTUAL_LOAN_ID <>", value, "virtualLoanId");
            return (Criteria) this;
        }

        public Criteria andVirtualLoanIdGreaterThan(BigDecimal value) {
            addCriterion("VIRTUAL_LOAN_ID >", value, "virtualLoanId");
            return (Criteria) this;
        }

        public Criteria andVirtualLoanIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("VIRTUAL_LOAN_ID >=", value, "virtualLoanId");
            return (Criteria) this;
        }

        public Criteria andVirtualLoanIdLessThan(BigDecimal value) {
            addCriterion("VIRTUAL_LOAN_ID <", value, "virtualLoanId");
            return (Criteria) this;
        }

        public Criteria andVirtualLoanIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("VIRTUAL_LOAN_ID <=", value, "virtualLoanId");
            return (Criteria) this;
        }

        public Criteria andVirtualLoanIdIn(List<BigDecimal> values) {
            addCriterion("VIRTUAL_LOAN_ID in", values, "virtualLoanId");
            return (Criteria) this;
        }

        public Criteria andVirtualLoanIdNotIn(List<BigDecimal> values) {
            addCriterion("VIRTUAL_LOAN_ID not in", values, "virtualLoanId");
            return (Criteria) this;
        }

        public Criteria andVirtualLoanIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VIRTUAL_LOAN_ID between", value1, value2, "virtualLoanId");
            return (Criteria) this;
        }

        public Criteria andVirtualLoanIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VIRTUAL_LOAN_ID not between", value1, value2, "virtualLoanId");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table SL$ACTOR_VIRTUAL_LOAN
     *
     * @mbggenerated do_not_delete_during_merge Thu May 05 10:43:21 CST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table SL$ACTOR_VIRTUAL_LOAN
     *
     * @mbggenerated Thu May 05 10:43:21 CST 2016
     */
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