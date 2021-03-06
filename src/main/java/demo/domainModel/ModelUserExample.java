package demo.domainModel;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ModelUserExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table yearmonthday
     *
     * @mbg.generated Tue May 19 15:56:54 JST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table yearmonthday
     *
     * @mbg.generated Tue May 19 15:56:54 JST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table yearmonthday
     *
     * @mbg.generated Tue May 19 15:56:54 JST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yearmonthday
     *
     * @mbg.generated Tue May 19 15:56:54 JST 2020
     */
    public ModelUserExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yearmonthday
     *
     * @mbg.generated Tue May 19 15:56:54 JST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yearmonthday
     *
     * @mbg.generated Tue May 19 15:56:54 JST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yearmonthday
     *
     * @mbg.generated Tue May 19 15:56:54 JST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yearmonthday
     *
     * @mbg.generated Tue May 19 15:56:54 JST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yearmonthday
     *
     * @mbg.generated Tue May 19 15:56:54 JST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yearmonthday
     *
     * @mbg.generated Tue May 19 15:56:54 JST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yearmonthday
     *
     * @mbg.generated Tue May 19 15:56:54 JST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yearmonthday
     *
     * @mbg.generated Tue May 19 15:56:54 JST 2020
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
     * This method corresponds to the database table yearmonthday
     *
     * @mbg.generated Tue May 19 15:56:54 JST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yearmonthday
     *
     * @mbg.generated Tue May 19 15:56:54 JST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table yearmonthday
     *
     * @mbg.generated Tue May 19 15:56:54 JST 2020
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
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
            List<java.sql.Date> dateList = new ArrayList<>();
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andYearMonthDayIsNull() {
            addCriterion("YEAR_MONTH_DAY is null");
            return (Criteria) this;
        }

        public Criteria andYearMonthDayIsNotNull() {
            addCriterion("YEAR_MONTH_DAY is not null");
            return (Criteria) this;
        }

        public Criteria andYearMonthDayEqualTo(Date value) {
            addCriterionForJDBCDate("YEAR_MONTH_DAY =", value, "yearMonthDay");
            return (Criteria) this;
        }

        public Criteria andYearMonthDayNotEqualTo(Date value) {
            addCriterionForJDBCDate("YEAR_MONTH_DAY <>", value, "yearMonthDay");
            return (Criteria) this;
        }

        public Criteria andYearMonthDayGreaterThan(Date value) {
            addCriterionForJDBCDate("YEAR_MONTH_DAY >", value, "yearMonthDay");
            return (Criteria) this;
        }

        public Criteria andYearMonthDayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("YEAR_MONTH_DAY >=", value, "yearMonthDay");
            return (Criteria) this;
        }

        public Criteria andYearMonthDayLessThan(Date value) {
            addCriterionForJDBCDate("YEAR_MONTH_DAY <", value, "yearMonthDay");
            return (Criteria) this;
        }

        public Criteria andYearMonthDayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("YEAR_MONTH_DAY <=", value, "yearMonthDay");
            return (Criteria) this;
        }

        public Criteria andYearMonthDayIn(List<Date> values) {
            addCriterionForJDBCDate("YEAR_MONTH_DAY in", values, "yearMonthDay");
            return (Criteria) this;
        }

        public Criteria andYearMonthDayNotIn(List<Date> values) {
            addCriterionForJDBCDate("YEAR_MONTH_DAY not in", values, "yearMonthDay");
            return (Criteria) this;
        }

        public Criteria andYearMonthDayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("YEAR_MONTH_DAY between", value1, value2, "yearMonthDay");
            return (Criteria) this;
        }

        public Criteria andYearMonthDayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("YEAR_MONTH_DAY not between", value1, value2, "yearMonthDay");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table yearmonthday
     *
     * @mbg.generated do_not_delete_during_merge Tue May 19 15:56:54 JST 2020
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table yearmonthday
     *
     * @mbg.generated Tue May 19 15:56:54 JST 2020
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