package cn.donut.ordermq.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MqInterfaceInformationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MqInterfaceInformationExample() {
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

        public Criteria andPrimaryKeyIsNull() {
            addCriterion("primary_key is null");
            return (Criteria) this;
        }

        public Criteria andPrimaryKeyIsNotNull() {
            addCriterion("primary_key is not null");
            return (Criteria) this;
        }

        public Criteria andPrimaryKeyEqualTo(Integer value) {
            addCriterion("primary_key =", value, "primaryKey");
            return (Criteria) this;
        }

        public Criteria andPrimaryKeyNotEqualTo(Integer value) {
            addCriterion("primary_key <>", value, "primaryKey");
            return (Criteria) this;
        }

        public Criteria andPrimaryKeyGreaterThan(Integer value) {
            addCriterion("primary_key >", value, "primaryKey");
            return (Criteria) this;
        }

        public Criteria andPrimaryKeyGreaterThanOrEqualTo(Integer value) {
            addCriterion("primary_key >=", value, "primaryKey");
            return (Criteria) this;
        }

        public Criteria andPrimaryKeyLessThan(Integer value) {
            addCriterion("primary_key <", value, "primaryKey");
            return (Criteria) this;
        }

        public Criteria andPrimaryKeyLessThanOrEqualTo(Integer value) {
            addCriterion("primary_key <=", value, "primaryKey");
            return (Criteria) this;
        }

        public Criteria andPrimaryKeyIn(List<Integer> values) {
            addCriterion("primary_key in", values, "primaryKey");
            return (Criteria) this;
        }

        public Criteria andPrimaryKeyNotIn(List<Integer> values) {
            addCriterion("primary_key not in", values, "primaryKey");
            return (Criteria) this;
        }

        public Criteria andPrimaryKeyBetween(Integer value1, Integer value2) {
            addCriterion("primary_key between", value1, value2, "primaryKey");
            return (Criteria) this;
        }

        public Criteria andPrimaryKeyNotBetween(Integer value1, Integer value2) {
            addCriterion("primary_key not between", value1, value2, "primaryKey");
            return (Criteria) this;
        }

        public Criteria andProductLineIsNull() {
            addCriterion("product_line is null");
            return (Criteria) this;
        }

        public Criteria andProductLineIsNotNull() {
            addCriterion("product_line is not null");
            return (Criteria) this;
        }

        public Criteria andProductLineEqualTo(Integer value) {
            addCriterion("product_line =", value, "productLine");
            return (Criteria) this;
        }

        public Criteria andProductLineNotEqualTo(Integer value) {
            addCriterion("product_line <>", value, "productLine");
            return (Criteria) this;
        }

        public Criteria andProductLineGreaterThan(Integer value) {
            addCriterion("product_line >", value, "productLine");
            return (Criteria) this;
        }

        public Criteria andProductLineGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_line >=", value, "productLine");
            return (Criteria) this;
        }

        public Criteria andProductLineLessThan(Integer value) {
            addCriterion("product_line <", value, "productLine");
            return (Criteria) this;
        }

        public Criteria andProductLineLessThanOrEqualTo(Integer value) {
            addCriterion("product_line <=", value, "productLine");
            return (Criteria) this;
        }

        public Criteria andProductLineIn(List<Integer> values) {
            addCriterion("product_line in", values, "productLine");
            return (Criteria) this;
        }

        public Criteria andProductLineNotIn(List<Integer> values) {
            addCriterion("product_line not in", values, "productLine");
            return (Criteria) this;
        }

        public Criteria andProductLineBetween(Integer value1, Integer value2) {
            addCriterion("product_line between", value1, value2, "productLine");
            return (Criteria) this;
        }

        public Criteria andProductLineNotBetween(Integer value1, Integer value2) {
            addCriterion("product_line not between", value1, value2, "productLine");
            return (Criteria) this;
        }

        public Criteria andInterfaceAddressIsNull() {
            addCriterion("interface_address is null");
            return (Criteria) this;
        }

        public Criteria andInterfaceAddressIsNotNull() {
            addCriterion("interface_address is not null");
            return (Criteria) this;
        }

        public Criteria andInterfaceAddressEqualTo(String value) {
            addCriterion("interface_address =", value, "interfaceAddress");
            return (Criteria) this;
        }

        public Criteria andInterfaceAddressNotEqualTo(String value) {
            addCriterion("interface_address <>", value, "interfaceAddress");
            return (Criteria) this;
        }

        public Criteria andInterfaceAddressGreaterThan(String value) {
            addCriterion("interface_address >", value, "interfaceAddress");
            return (Criteria) this;
        }

        public Criteria andInterfaceAddressGreaterThanOrEqualTo(String value) {
            addCriterion("interface_address >=", value, "interfaceAddress");
            return (Criteria) this;
        }

        public Criteria andInterfaceAddressLessThan(String value) {
            addCriterion("interface_address <", value, "interfaceAddress");
            return (Criteria) this;
        }

        public Criteria andInterfaceAddressLessThanOrEqualTo(String value) {
            addCriterion("interface_address <=", value, "interfaceAddress");
            return (Criteria) this;
        }

        public Criteria andInterfaceAddressLike(String value) {
            addCriterion("interface_address like", value, "interfaceAddress");
            return (Criteria) this;
        }

        public Criteria andInterfaceAddressNotLike(String value) {
            addCriterion("interface_address not like", value, "interfaceAddress");
            return (Criteria) this;
        }

        public Criteria andInterfaceAddressIn(List<String> values) {
            addCriterion("interface_address in", values, "interfaceAddress");
            return (Criteria) this;
        }

        public Criteria andInterfaceAddressNotIn(List<String> values) {
            addCriterion("interface_address not in", values, "interfaceAddress");
            return (Criteria) this;
        }

        public Criteria andInterfaceAddressBetween(String value1, String value2) {
            addCriterion("interface_address between", value1, value2, "interfaceAddress");
            return (Criteria) this;
        }

        public Criteria andInterfaceAddressNotBetween(String value1, String value2) {
            addCriterion("interface_address not between", value1, value2, "interfaceAddress");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Byte value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Byte value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Byte value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Byte value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Byte value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Byte> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Byte> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Byte value1, Byte value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Byte value1, Byte value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
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