package com.duan.dormitorysystem.bean;

import java.util.Date;

public class Building {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_building.dorm_id
     *
     * @mbg.generated Fri Jun 29 08:47:09 CST 2018
     */
    private Long dormId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_building.building_number
     *
     * @mbg.generated Fri Jun 29 08:47:09 CST 2018
     */
    private String buildingNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_building.dorm_number
     *
     * @mbg.generated Fri Jun 29 08:47:09 CST 2018
     */
    private String dormNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_building.dorm_max_people
     *
     * @mbg.generated Fri Jun 29 08:47:09 CST 2018
     */
    private Byte dormMaxPeople;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_building.dorm_current_people
     *
     * @mbg.generated Fri Jun 29 08:47:09 CST 2018
     */
    private Byte dormCurrentPeople;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_building.dorm_1_bed
     *
     * @mbg.generated Fri Jun 29 08:47:09 CST 2018
     */
    private Byte dorm1Bed;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_building.dorm_2_bed
     *
     * @mbg.generated Fri Jun 29 08:47:09 CST 2018
     */
    private Byte dorm2Bed;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_building.dorm_3_bed
     *
     * @mbg.generated Fri Jun 29 08:47:09 CST 2018
     */
    private Byte dorm3Bed;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_building.dorm_4_bed
     *
     * @mbg.generated Fri Jun 29 08:47:09 CST 2018
     */
    private Byte dorm4Bed;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_building.dorm_5_bed
     *
     * @mbg.generated Fri Jun 29 08:47:09 CST 2018
     */
    private Byte dorm5Bed;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_building.dorm_6_bed
     *
     * @mbg.generated Fri Jun 29 08:47:09 CST 2018
     */
    private Byte dorm6Bed;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_building.gmt_create
     *
     * @mbg.generated Fri Jun 29 08:47:09 CST 2018
     */
    private Date gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_building.gmt_modified
     *
     * @mbg.generated Fri Jun 29 08:47:09 CST 2018
     */
    private Date gmtModified;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_building
     *
     * @mbg.generated Fri Jun 29 08:47:09 CST 2018
     */
    public Building(Long dormId, String buildingNumber, String dormNumber, Byte dormMaxPeople, Byte dormCurrentPeople, Byte dorm1Bed, Byte dorm2Bed, Byte dorm3Bed, Byte dorm4Bed, Byte dorm5Bed, Byte dorm6Bed, Date gmtCreate, Date gmtModified) {
        this.dormId = dormId;
        this.buildingNumber = buildingNumber;
        this.dormNumber = dormNumber;
        this.dormMaxPeople = dormMaxPeople;
        this.dormCurrentPeople = dormCurrentPeople;
        this.dorm1Bed = dorm1Bed;
        this.dorm2Bed = dorm2Bed;
        this.dorm3Bed = dorm3Bed;
        this.dorm4Bed = dorm4Bed;
        this.dorm5Bed = dorm5Bed;
        this.dorm6Bed = dorm6Bed;
        this.gmtCreate = gmtCreate;
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_building
     *
     * @mbg.generated Fri Jun 29 08:47:09 CST 2018
     */
    public Building() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_building.dorm_id
     *
     * @return the value of tbl_building.dorm_id
     *
     * @mbg.generated Fri Jun 29 08:47:09 CST 2018
     */
    public Long getDormId() {
        return dormId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_building.dorm_id
     *
     * @param dormId the value for tbl_building.dorm_id
     *
     * @mbg.generated Fri Jun 29 08:47:09 CST 2018
     */
    public void setDormId(Long dormId) {
        this.dormId = dormId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_building.building_number
     *
     * @return the value of tbl_building.building_number
     *
     * @mbg.generated Fri Jun 29 08:47:09 CST 2018
     */
    public String getBuildingNumber() {
        return buildingNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_building.building_number
     *
     * @param buildingNumber the value for tbl_building.building_number
     *
     * @mbg.generated Fri Jun 29 08:47:09 CST 2018
     */
    public void setBuildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber == null ? null : buildingNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_building.dorm_number
     *
     * @return the value of tbl_building.dorm_number
     *
     * @mbg.generated Fri Jun 29 08:47:09 CST 2018
     */
    public String getDormNumber() {
        return dormNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_building.dorm_number
     *
     * @param dormNumber the value for tbl_building.dorm_number
     *
     * @mbg.generated Fri Jun 29 08:47:09 CST 2018
     */
    public void setDormNumber(String dormNumber) {
        this.dormNumber = dormNumber == null ? null : dormNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_building.dorm_max_people
     *
     * @return the value of tbl_building.dorm_max_people
     *
     * @mbg.generated Fri Jun 29 08:47:09 CST 2018
     */
    public Byte getDormMaxPeople() {
        return dormMaxPeople;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_building.dorm_max_people
     *
     * @param dormMaxPeople the value for tbl_building.dorm_max_people
     *
     * @mbg.generated Fri Jun 29 08:47:09 CST 2018
     */
    public void setDormMaxPeople(Byte dormMaxPeople) {
        this.dormMaxPeople = dormMaxPeople;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_building.dorm_current_people
     *
     * @return the value of tbl_building.dorm_current_people
     *
     * @mbg.generated Fri Jun 29 08:47:09 CST 2018
     */
    public Byte getDormCurrentPeople() {
        return dormCurrentPeople;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_building.dorm_current_people
     *
     * @param dormCurrentPeople the value for tbl_building.dorm_current_people
     *
     * @mbg.generated Fri Jun 29 08:47:09 CST 2018
     */
    public void setDormCurrentPeople(Byte dormCurrentPeople) {
        this.dormCurrentPeople = dormCurrentPeople;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_building.dorm_1_bed
     *
     * @return the value of tbl_building.dorm_1_bed
     *
     * @mbg.generated Fri Jun 29 08:47:09 CST 2018
     */
    public Byte getDorm1Bed() {
        return dorm1Bed;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_building.dorm_1_bed
     *
     * @param dorm1Bed the value for tbl_building.dorm_1_bed
     *
     * @mbg.generated Fri Jun 29 08:47:09 CST 2018
     */
    public void setDorm1Bed(Byte dorm1Bed) {
        this.dorm1Bed = dorm1Bed;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_building.dorm_2_bed
     *
     * @return the value of tbl_building.dorm_2_bed
     *
     * @mbg.generated Fri Jun 29 08:47:09 CST 2018
     */
    public Byte getDorm2Bed() {
        return dorm2Bed;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_building.dorm_2_bed
     *
     * @param dorm2Bed the value for tbl_building.dorm_2_bed
     *
     * @mbg.generated Fri Jun 29 08:47:09 CST 2018
     */
    public void setDorm2Bed(Byte dorm2Bed) {
        this.dorm2Bed = dorm2Bed;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_building.dorm_3_bed
     *
     * @return the value of tbl_building.dorm_3_bed
     *
     * @mbg.generated Fri Jun 29 08:47:09 CST 2018
     */
    public Byte getDorm3Bed() {
        return dorm3Bed;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_building.dorm_3_bed
     *
     * @param dorm3Bed the value for tbl_building.dorm_3_bed
     *
     * @mbg.generated Fri Jun 29 08:47:09 CST 2018
     */
    public void setDorm3Bed(Byte dorm3Bed) {
        this.dorm3Bed = dorm3Bed;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_building.dorm_4_bed
     *
     * @return the value of tbl_building.dorm_4_bed
     *
     * @mbg.generated Fri Jun 29 08:47:09 CST 2018
     */
    public Byte getDorm4Bed() {
        return dorm4Bed;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_building.dorm_4_bed
     *
     * @param dorm4Bed the value for tbl_building.dorm_4_bed
     *
     * @mbg.generated Fri Jun 29 08:47:09 CST 2018
     */
    public void setDorm4Bed(Byte dorm4Bed) {
        this.dorm4Bed = dorm4Bed;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_building.dorm_5_bed
     *
     * @return the value of tbl_building.dorm_5_bed
     *
     * @mbg.generated Fri Jun 29 08:47:09 CST 2018
     */
    public Byte getDorm5Bed() {
        return dorm5Bed;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_building.dorm_5_bed
     *
     * @param dorm5Bed the value for tbl_building.dorm_5_bed
     *
     * @mbg.generated Fri Jun 29 08:47:09 CST 2018
     */
    public void setDorm5Bed(Byte dorm5Bed) {
        this.dorm5Bed = dorm5Bed;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_building.dorm_6_bed
     *
     * @return the value of tbl_building.dorm_6_bed
     *
     * @mbg.generated Fri Jun 29 08:47:09 CST 2018
     */
    public Byte getDorm6Bed() {
        return dorm6Bed;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_building.dorm_6_bed
     *
     * @param dorm6Bed the value for tbl_building.dorm_6_bed
     *
     * @mbg.generated Fri Jun 29 08:47:09 CST 2018
     */
    public void setDorm6Bed(Byte dorm6Bed) {
        this.dorm6Bed = dorm6Bed;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_building.gmt_create
     *
     * @return the value of tbl_building.gmt_create
     *
     * @mbg.generated Fri Jun 29 08:47:09 CST 2018
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_building.gmt_create
     *
     * @param gmtCreate the value for tbl_building.gmt_create
     *
     * @mbg.generated Fri Jun 29 08:47:09 CST 2018
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_building.gmt_modified
     *
     * @return the value of tbl_building.gmt_modified
     *
     * @mbg.generated Fri Jun 29 08:47:09 CST 2018
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_building.gmt_modified
     *
     * @param gmtModified the value for tbl_building.gmt_modified
     *
     * @mbg.generated Fri Jun 29 08:47:09 CST 2018
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}