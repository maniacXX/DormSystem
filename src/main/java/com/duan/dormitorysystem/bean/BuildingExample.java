package com.duan.dormitorysystem.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BuildingExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tbl_building
     *
     * @mbg.generated Fri Jun 29 08:47:09 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tbl_building
     *
     * @mbg.generated Fri Jun 29 08:47:09 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tbl_building
     *
     * @mbg.generated Fri Jun 29 08:47:09 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_building
     *
     * @mbg.generated Fri Jun 29 08:47:09 CST 2018
     */
    public BuildingExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_building
     *
     * @mbg.generated Fri Jun 29 08:47:09 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_building
     *
     * @mbg.generated Fri Jun 29 08:47:09 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_building
     *
     * @mbg.generated Fri Jun 29 08:47:09 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_building
     *
     * @mbg.generated Fri Jun 29 08:47:09 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_building
     *
     * @mbg.generated Fri Jun 29 08:47:09 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_building
     *
     * @mbg.generated Fri Jun 29 08:47:09 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_building
     *
     * @mbg.generated Fri Jun 29 08:47:09 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_building
     *
     * @mbg.generated Fri Jun 29 08:47:09 CST 2018
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
     * This method corresponds to the database table tbl_building
     *
     * @mbg.generated Fri Jun 29 08:47:09 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_building
     *
     * @mbg.generated Fri Jun 29 08:47:09 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tbl_building
     *
     * @mbg.generated Fri Jun 29 08:47:09 CST 2018
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

        public Criteria andDormIdIsNull() {
            addCriterion("dorm_id is null");
            return (Criteria) this;
        }

        public Criteria andDormIdIsNotNull() {
            addCriterion("dorm_id is not null");
            return (Criteria) this;
        }

        public Criteria andDormIdEqualTo(Long value) {
            addCriterion("dorm_id =", value, "dormId");
            return (Criteria) this;
        }

        public Criteria andDormIdNotEqualTo(Long value) {
            addCriterion("dorm_id <>", value, "dormId");
            return (Criteria) this;
        }

        public Criteria andDormIdGreaterThan(Long value) {
            addCriterion("dorm_id >", value, "dormId");
            return (Criteria) this;
        }

        public Criteria andDormIdGreaterThanOrEqualTo(Long value) {
            addCriterion("dorm_id >=", value, "dormId");
            return (Criteria) this;
        }

        public Criteria andDormIdLessThan(Long value) {
            addCriterion("dorm_id <", value, "dormId");
            return (Criteria) this;
        }

        public Criteria andDormIdLessThanOrEqualTo(Long value) {
            addCriterion("dorm_id <=", value, "dormId");
            return (Criteria) this;
        }

        public Criteria andDormIdIn(List<Long> values) {
            addCriterion("dorm_id in", values, "dormId");
            return (Criteria) this;
        }

        public Criteria andDormIdNotIn(List<Long> values) {
            addCriterion("dorm_id not in", values, "dormId");
            return (Criteria) this;
        }

        public Criteria andDormIdBetween(Long value1, Long value2) {
            addCriterion("dorm_id between", value1, value2, "dormId");
            return (Criteria) this;
        }

        public Criteria andDormIdNotBetween(Long value1, Long value2) {
            addCriterion("dorm_id not between", value1, value2, "dormId");
            return (Criteria) this;
        }

        public Criteria andBuildingNumberIsNull() {
            addCriterion("building_number is null");
            return (Criteria) this;
        }

        public Criteria andBuildingNumberIsNotNull() {
            addCriterion("building_number is not null");
            return (Criteria) this;
        }

        public Criteria andBuildingNumberEqualTo(String value) {
            addCriterion("building_number =", value, "buildingNumber");
            return (Criteria) this;
        }

        public Criteria andBuildingNumberNotEqualTo(String value) {
            addCriterion("building_number <>", value, "buildingNumber");
            return (Criteria) this;
        }

        public Criteria andBuildingNumberGreaterThan(String value) {
            addCriterion("building_number >", value, "buildingNumber");
            return (Criteria) this;
        }

        public Criteria andBuildingNumberGreaterThanOrEqualTo(String value) {
            addCriterion("building_number >=", value, "buildingNumber");
            return (Criteria) this;
        }

        public Criteria andBuildingNumberLessThan(String value) {
            addCriterion("building_number <", value, "buildingNumber");
            return (Criteria) this;
        }

        public Criteria andBuildingNumberLessThanOrEqualTo(String value) {
            addCriterion("building_number <=", value, "buildingNumber");
            return (Criteria) this;
        }

        public Criteria andBuildingNumberLike(String value) {
            addCriterion("building_number like", value, "buildingNumber");
            return (Criteria) this;
        }

        public Criteria andBuildingNumberNotLike(String value) {
            addCriterion("building_number not like", value, "buildingNumber");
            return (Criteria) this;
        }

        public Criteria andBuildingNumberIn(List<String> values) {
            addCriterion("building_number in", values, "buildingNumber");
            return (Criteria) this;
        }

        public Criteria andBuildingNumberNotIn(List<String> values) {
            addCriterion("building_number not in", values, "buildingNumber");
            return (Criteria) this;
        }

        public Criteria andBuildingNumberBetween(String value1, String value2) {
            addCriterion("building_number between", value1, value2, "buildingNumber");
            return (Criteria) this;
        }

        public Criteria andBuildingNumberNotBetween(String value1, String value2) {
            addCriterion("building_number not between", value1, value2, "buildingNumber");
            return (Criteria) this;
        }

        public Criteria andDormNumberIsNull() {
            addCriterion("dorm_number is null");
            return (Criteria) this;
        }

        public Criteria andDormNumberIsNotNull() {
            addCriterion("dorm_number is not null");
            return (Criteria) this;
        }

        public Criteria andDormNumberEqualTo(String value) {
            addCriterion("dorm_number =", value, "dormNumber");
            return (Criteria) this;
        }

        public Criteria andDormNumberNotEqualTo(String value) {
            addCriterion("dorm_number <>", value, "dormNumber");
            return (Criteria) this;
        }

        public Criteria andDormNumberGreaterThan(String value) {
            addCriterion("dorm_number >", value, "dormNumber");
            return (Criteria) this;
        }

        public Criteria andDormNumberGreaterThanOrEqualTo(String value) {
            addCriterion("dorm_number >=", value, "dormNumber");
            return (Criteria) this;
        }

        public Criteria andDormNumberLessThan(String value) {
            addCriterion("dorm_number <", value, "dormNumber");
            return (Criteria) this;
        }

        public Criteria andDormNumberLessThanOrEqualTo(String value) {
            addCriterion("dorm_number <=", value, "dormNumber");
            return (Criteria) this;
        }

        public Criteria andDormNumberLike(String value) {
            addCriterion("dorm_number like", value, "dormNumber");
            return (Criteria) this;
        }

        public Criteria andDormNumberNotLike(String value) {
            addCriterion("dorm_number not like", value, "dormNumber");
            return (Criteria) this;
        }

        public Criteria andDormNumberIn(List<String> values) {
            addCriterion("dorm_number in", values, "dormNumber");
            return (Criteria) this;
        }

        public Criteria andDormNumberNotIn(List<String> values) {
            addCriterion("dorm_number not in", values, "dormNumber");
            return (Criteria) this;
        }

        public Criteria andDormNumberBetween(String value1, String value2) {
            addCriterion("dorm_number between", value1, value2, "dormNumber");
            return (Criteria) this;
        }

        public Criteria andDormNumberNotBetween(String value1, String value2) {
            addCriterion("dorm_number not between", value1, value2, "dormNumber");
            return (Criteria) this;
        }

        public Criteria andDormMaxPeopleIsNull() {
            addCriterion("dorm_max_people is null");
            return (Criteria) this;
        }

        public Criteria andDormMaxPeopleIsNotNull() {
            addCriterion("dorm_max_people is not null");
            return (Criteria) this;
        }

        public Criteria andDormMaxPeopleEqualTo(Byte value) {
            addCriterion("dorm_max_people =", value, "dormMaxPeople");
            return (Criteria) this;
        }

        public Criteria andDormMaxPeopleNotEqualTo(Byte value) {
            addCriterion("dorm_max_people <>", value, "dormMaxPeople");
            return (Criteria) this;
        }

        public Criteria andDormMaxPeopleGreaterThan(Byte value) {
            addCriterion("dorm_max_people >", value, "dormMaxPeople");
            return (Criteria) this;
        }

        public Criteria andDormMaxPeopleGreaterThanOrEqualTo(Byte value) {
            addCriterion("dorm_max_people >=", value, "dormMaxPeople");
            return (Criteria) this;
        }

        public Criteria andDormMaxPeopleLessThan(Byte value) {
            addCriterion("dorm_max_people <", value, "dormMaxPeople");
            return (Criteria) this;
        }

        public Criteria andDormMaxPeopleLessThanOrEqualTo(Byte value) {
            addCriterion("dorm_max_people <=", value, "dormMaxPeople");
            return (Criteria) this;
        }

        public Criteria andDormMaxPeopleIn(List<Byte> values) {
            addCriterion("dorm_max_people in", values, "dormMaxPeople");
            return (Criteria) this;
        }

        public Criteria andDormMaxPeopleNotIn(List<Byte> values) {
            addCriterion("dorm_max_people not in", values, "dormMaxPeople");
            return (Criteria) this;
        }

        public Criteria andDormMaxPeopleBetween(Byte value1, Byte value2) {
            addCriterion("dorm_max_people between", value1, value2, "dormMaxPeople");
            return (Criteria) this;
        }

        public Criteria andDormMaxPeopleNotBetween(Byte value1, Byte value2) {
            addCriterion("dorm_max_people not between", value1, value2, "dormMaxPeople");
            return (Criteria) this;
        }

        public Criteria andDormCurrentPeopleIsNull() {
            addCriterion("dorm_current_people is null");
            return (Criteria) this;
        }

        public Criteria andDormCurrentPeopleIsNotNull() {
            addCriterion("dorm_current_people is not null");
            return (Criteria) this;
        }

        public Criteria andDormCurrentPeopleEqualTo(Byte value) {
            addCriterion("dorm_current_people =", value, "dormCurrentPeople");
            return (Criteria) this;
        }

        public Criteria andDormCurrentPeopleNotEqualTo(Byte value) {
            addCriterion("dorm_current_people <>", value, "dormCurrentPeople");
            return (Criteria) this;
        }

        public Criteria andDormCurrentPeopleGreaterThan(Byte value) {
            addCriterion("dorm_current_people >", value, "dormCurrentPeople");
            return (Criteria) this;
        }

        public Criteria andDormCurrentPeopleGreaterThanOrEqualTo(Byte value) {
            addCriterion("dorm_current_people >=", value, "dormCurrentPeople");
            return (Criteria) this;
        }

        public Criteria andDormCurrentPeopleLessThan(Byte value) {
            addCriterion("dorm_current_people <", value, "dormCurrentPeople");
            return (Criteria) this;
        }

        public Criteria andDormCurrentPeopleLessThanOrEqualTo(Byte value) {
            addCriterion("dorm_current_people <=", value, "dormCurrentPeople");
            return (Criteria) this;
        }

        public Criteria andDormCurrentPeopleIn(List<Byte> values) {
            addCriterion("dorm_current_people in", values, "dormCurrentPeople");
            return (Criteria) this;
        }

        public Criteria andDormCurrentPeopleNotIn(List<Byte> values) {
            addCriterion("dorm_current_people not in", values, "dormCurrentPeople");
            return (Criteria) this;
        }

        public Criteria andDormCurrentPeopleBetween(Byte value1, Byte value2) {
            addCriterion("dorm_current_people between", value1, value2, "dormCurrentPeople");
            return (Criteria) this;
        }

        public Criteria andDormCurrentPeopleNotBetween(Byte value1, Byte value2) {
            addCriterion("dorm_current_people not between", value1, value2, "dormCurrentPeople");
            return (Criteria) this;
        }

        public Criteria andDorm1BedIsNull() {
            addCriterion("dorm_1_bed is null");
            return (Criteria) this;
        }

        public Criteria andDorm1BedIsNotNull() {
            addCriterion("dorm_1_bed is not null");
            return (Criteria) this;
        }

        public Criteria andDorm1BedEqualTo(Byte value) {
            addCriterion("dorm_1_bed =", value, "dorm1Bed");
            return (Criteria) this;
        }

        public Criteria andDorm1BedNotEqualTo(Byte value) {
            addCriterion("dorm_1_bed <>", value, "dorm1Bed");
            return (Criteria) this;
        }

        public Criteria andDorm1BedGreaterThan(Byte value) {
            addCriterion("dorm_1_bed >", value, "dorm1Bed");
            return (Criteria) this;
        }

        public Criteria andDorm1BedGreaterThanOrEqualTo(Byte value) {
            addCriterion("dorm_1_bed >=", value, "dorm1Bed");
            return (Criteria) this;
        }

        public Criteria andDorm1BedLessThan(Byte value) {
            addCriterion("dorm_1_bed <", value, "dorm1Bed");
            return (Criteria) this;
        }

        public Criteria andDorm1BedLessThanOrEqualTo(Byte value) {
            addCriterion("dorm_1_bed <=", value, "dorm1Bed");
            return (Criteria) this;
        }

        public Criteria andDorm1BedIn(List<Byte> values) {
            addCriterion("dorm_1_bed in", values, "dorm1Bed");
            return (Criteria) this;
        }

        public Criteria andDorm1BedNotIn(List<Byte> values) {
            addCriterion("dorm_1_bed not in", values, "dorm1Bed");
            return (Criteria) this;
        }

        public Criteria andDorm1BedBetween(Byte value1, Byte value2) {
            addCriterion("dorm_1_bed between", value1, value2, "dorm1Bed");
            return (Criteria) this;
        }

        public Criteria andDorm1BedNotBetween(Byte value1, Byte value2) {
            addCriterion("dorm_1_bed not between", value1, value2, "dorm1Bed");
            return (Criteria) this;
        }

        public Criteria andDorm2BedIsNull() {
            addCriterion("dorm_2_bed is null");
            return (Criteria) this;
        }

        public Criteria andDorm2BedIsNotNull() {
            addCriterion("dorm_2_bed is not null");
            return (Criteria) this;
        }

        public Criteria andDorm2BedEqualTo(Byte value) {
            addCriterion("dorm_2_bed =", value, "dorm2Bed");
            return (Criteria) this;
        }

        public Criteria andDorm2BedNotEqualTo(Byte value) {
            addCriterion("dorm_2_bed <>", value, "dorm2Bed");
            return (Criteria) this;
        }

        public Criteria andDorm2BedGreaterThan(Byte value) {
            addCriterion("dorm_2_bed >", value, "dorm2Bed");
            return (Criteria) this;
        }

        public Criteria andDorm2BedGreaterThanOrEqualTo(Byte value) {
            addCriterion("dorm_2_bed >=", value, "dorm2Bed");
            return (Criteria) this;
        }

        public Criteria andDorm2BedLessThan(Byte value) {
            addCriterion("dorm_2_bed <", value, "dorm2Bed");
            return (Criteria) this;
        }

        public Criteria andDorm2BedLessThanOrEqualTo(Byte value) {
            addCriterion("dorm_2_bed <=", value, "dorm2Bed");
            return (Criteria) this;
        }

        public Criteria andDorm2BedIn(List<Byte> values) {
            addCriterion("dorm_2_bed in", values, "dorm2Bed");
            return (Criteria) this;
        }

        public Criteria andDorm2BedNotIn(List<Byte> values) {
            addCriterion("dorm_2_bed not in", values, "dorm2Bed");
            return (Criteria) this;
        }

        public Criteria andDorm2BedBetween(Byte value1, Byte value2) {
            addCriterion("dorm_2_bed between", value1, value2, "dorm2Bed");
            return (Criteria) this;
        }

        public Criteria andDorm2BedNotBetween(Byte value1, Byte value2) {
            addCriterion("dorm_2_bed not between", value1, value2, "dorm2Bed");
            return (Criteria) this;
        }

        public Criteria andDorm3BedIsNull() {
            addCriterion("dorm_3_bed is null");
            return (Criteria) this;
        }

        public Criteria andDorm3BedIsNotNull() {
            addCriterion("dorm_3_bed is not null");
            return (Criteria) this;
        }

        public Criteria andDorm3BedEqualTo(Byte value) {
            addCriterion("dorm_3_bed =", value, "dorm3Bed");
            return (Criteria) this;
        }

        public Criteria andDorm3BedNotEqualTo(Byte value) {
            addCriterion("dorm_3_bed <>", value, "dorm3Bed");
            return (Criteria) this;
        }

        public Criteria andDorm3BedGreaterThan(Byte value) {
            addCriterion("dorm_3_bed >", value, "dorm3Bed");
            return (Criteria) this;
        }

        public Criteria andDorm3BedGreaterThanOrEqualTo(Byte value) {
            addCriterion("dorm_3_bed >=", value, "dorm3Bed");
            return (Criteria) this;
        }

        public Criteria andDorm3BedLessThan(Byte value) {
            addCriterion("dorm_3_bed <", value, "dorm3Bed");
            return (Criteria) this;
        }

        public Criteria andDorm3BedLessThanOrEqualTo(Byte value) {
            addCriterion("dorm_3_bed <=", value, "dorm3Bed");
            return (Criteria) this;
        }

        public Criteria andDorm3BedIn(List<Byte> values) {
            addCriterion("dorm_3_bed in", values, "dorm3Bed");
            return (Criteria) this;
        }

        public Criteria andDorm3BedNotIn(List<Byte> values) {
            addCriterion("dorm_3_bed not in", values, "dorm3Bed");
            return (Criteria) this;
        }

        public Criteria andDorm3BedBetween(Byte value1, Byte value2) {
            addCriterion("dorm_3_bed between", value1, value2, "dorm3Bed");
            return (Criteria) this;
        }

        public Criteria andDorm3BedNotBetween(Byte value1, Byte value2) {
            addCriterion("dorm_3_bed not between", value1, value2, "dorm3Bed");
            return (Criteria) this;
        }

        public Criteria andDorm4BedIsNull() {
            addCriterion("dorm_4_bed is null");
            return (Criteria) this;
        }

        public Criteria andDorm4BedIsNotNull() {
            addCriterion("dorm_4_bed is not null");
            return (Criteria) this;
        }

        public Criteria andDorm4BedEqualTo(Byte value) {
            addCriterion("dorm_4_bed =", value, "dorm4Bed");
            return (Criteria) this;
        }

        public Criteria andDorm4BedNotEqualTo(Byte value) {
            addCriterion("dorm_4_bed <>", value, "dorm4Bed");
            return (Criteria) this;
        }

        public Criteria andDorm4BedGreaterThan(Byte value) {
            addCriterion("dorm_4_bed >", value, "dorm4Bed");
            return (Criteria) this;
        }

        public Criteria andDorm4BedGreaterThanOrEqualTo(Byte value) {
            addCriterion("dorm_4_bed >=", value, "dorm4Bed");
            return (Criteria) this;
        }

        public Criteria andDorm4BedLessThan(Byte value) {
            addCriterion("dorm_4_bed <", value, "dorm4Bed");
            return (Criteria) this;
        }

        public Criteria andDorm4BedLessThanOrEqualTo(Byte value) {
            addCriterion("dorm_4_bed <=", value, "dorm4Bed");
            return (Criteria) this;
        }

        public Criteria andDorm4BedIn(List<Byte> values) {
            addCriterion("dorm_4_bed in", values, "dorm4Bed");
            return (Criteria) this;
        }

        public Criteria andDorm4BedNotIn(List<Byte> values) {
            addCriterion("dorm_4_bed not in", values, "dorm4Bed");
            return (Criteria) this;
        }

        public Criteria andDorm4BedBetween(Byte value1, Byte value2) {
            addCriterion("dorm_4_bed between", value1, value2, "dorm4Bed");
            return (Criteria) this;
        }

        public Criteria andDorm4BedNotBetween(Byte value1, Byte value2) {
            addCriterion("dorm_4_bed not between", value1, value2, "dorm4Bed");
            return (Criteria) this;
        }

        public Criteria andDorm5BedIsNull() {
            addCriterion("dorm_5_bed is null");
            return (Criteria) this;
        }

        public Criteria andDorm5BedIsNotNull() {
            addCriterion("dorm_5_bed is not null");
            return (Criteria) this;
        }

        public Criteria andDorm5BedEqualTo(Byte value) {
            addCriterion("dorm_5_bed =", value, "dorm5Bed");
            return (Criteria) this;
        }

        public Criteria andDorm5BedNotEqualTo(Byte value) {
            addCriterion("dorm_5_bed <>", value, "dorm5Bed");
            return (Criteria) this;
        }

        public Criteria andDorm5BedGreaterThan(Byte value) {
            addCriterion("dorm_5_bed >", value, "dorm5Bed");
            return (Criteria) this;
        }

        public Criteria andDorm5BedGreaterThanOrEqualTo(Byte value) {
            addCriterion("dorm_5_bed >=", value, "dorm5Bed");
            return (Criteria) this;
        }

        public Criteria andDorm5BedLessThan(Byte value) {
            addCriterion("dorm_5_bed <", value, "dorm5Bed");
            return (Criteria) this;
        }

        public Criteria andDorm5BedLessThanOrEqualTo(Byte value) {
            addCriterion("dorm_5_bed <=", value, "dorm5Bed");
            return (Criteria) this;
        }

        public Criteria andDorm5BedIn(List<Byte> values) {
            addCriterion("dorm_5_bed in", values, "dorm5Bed");
            return (Criteria) this;
        }

        public Criteria andDorm5BedNotIn(List<Byte> values) {
            addCriterion("dorm_5_bed not in", values, "dorm5Bed");
            return (Criteria) this;
        }

        public Criteria andDorm5BedBetween(Byte value1, Byte value2) {
            addCriterion("dorm_5_bed between", value1, value2, "dorm5Bed");
            return (Criteria) this;
        }

        public Criteria andDorm5BedNotBetween(Byte value1, Byte value2) {
            addCriterion("dorm_5_bed not between", value1, value2, "dorm5Bed");
            return (Criteria) this;
        }

        public Criteria andDorm6BedIsNull() {
            addCriterion("dorm_6_bed is null");
            return (Criteria) this;
        }

        public Criteria andDorm6BedIsNotNull() {
            addCriterion("dorm_6_bed is not null");
            return (Criteria) this;
        }

        public Criteria andDorm6BedEqualTo(Byte value) {
            addCriterion("dorm_6_bed =", value, "dorm6Bed");
            return (Criteria) this;
        }

        public Criteria andDorm6BedNotEqualTo(Byte value) {
            addCriterion("dorm_6_bed <>", value, "dorm6Bed");
            return (Criteria) this;
        }

        public Criteria andDorm6BedGreaterThan(Byte value) {
            addCriterion("dorm_6_bed >", value, "dorm6Bed");
            return (Criteria) this;
        }

        public Criteria andDorm6BedGreaterThanOrEqualTo(Byte value) {
            addCriterion("dorm_6_bed >=", value, "dorm6Bed");
            return (Criteria) this;
        }

        public Criteria andDorm6BedLessThan(Byte value) {
            addCriterion("dorm_6_bed <", value, "dorm6Bed");
            return (Criteria) this;
        }

        public Criteria andDorm6BedLessThanOrEqualTo(Byte value) {
            addCriterion("dorm_6_bed <=", value, "dorm6Bed");
            return (Criteria) this;
        }

        public Criteria andDorm6BedIn(List<Byte> values) {
            addCriterion("dorm_6_bed in", values, "dorm6Bed");
            return (Criteria) this;
        }

        public Criteria andDorm6BedNotIn(List<Byte> values) {
            addCriterion("dorm_6_bed not in", values, "dorm6Bed");
            return (Criteria) this;
        }

        public Criteria andDorm6BedBetween(Byte value1, Byte value2) {
            addCriterion("dorm_6_bed between", value1, value2, "dorm6Bed");
            return (Criteria) this;
        }

        public Criteria andDorm6BedNotBetween(Byte value1, Byte value2) {
            addCriterion("dorm_6_bed not between", value1, value2, "dorm6Bed");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Date> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNull() {
            addCriterion("gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNotNull() {
            addCriterion("gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedEqualTo(Date value) {
            addCriterion("gmt_modified =", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotEqualTo(Date value) {
            addCriterion("gmt_modified <>", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThan(Date value) {
            addCriterion("gmt_modified >", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_modified >=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThan(Date value) {
            addCriterion("gmt_modified <", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("gmt_modified <=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIn(List<Date> values) {
            addCriterion("gmt_modified in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotIn(List<Date> values) {
            addCriterion("gmt_modified not in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("gmt_modified between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("gmt_modified not between", value1, value2, "gmtModified");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tbl_building
     *
     * @mbg.generated do_not_delete_during_merge Fri Jun 29 08:47:09 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tbl_building
     *
     * @mbg.generated Fri Jun 29 08:47:09 CST 2018
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