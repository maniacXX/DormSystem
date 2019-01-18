package com.duan.dormitorysystem.bean;

import java.util.Date;

public class ManaRelationBul {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mana_building.relation_id
     *
     * @mbg.generated Sun Aug 05 11:44:27 CST 2018
     */
    private Long relationId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mana_building.mana_id
     *
     * @mbg.generated Sun Aug 05 11:44:27 CST 2018
     */
    private Long manaId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mana_building.dorm_id
     *
     * @mbg.generated Sun Aug 05 11:44:27 CST 2018
     */
    private Long dormId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mana_building.gmt_creat
     *
     * @mbg.generated Sun Aug 05 11:44:27 CST 2018
     */
    private Date gmtCreat;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mana_building.gmt_modified
     *
     * @mbg.generated Sun Aug 05 11:44:27 CST 2018
     */
    private Date gmtModified;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mana_building
     *
     * @mbg.generated Sun Aug 05 11:44:27 CST 2018
     */
    public ManaRelationBul(Long relationId, Long manaId, Long dormId, Date gmtCreat, Date gmtModified) {
        this.relationId = relationId;
        this.manaId = manaId;
        this.dormId = dormId;
        this.gmtCreat = gmtCreat;
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mana_building
     *
     * @mbg.generated Sun Aug 05 11:44:27 CST 2018
     */
    public ManaRelationBul() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mana_building.relation_id
     *
     * @return the value of mana_building.relation_id
     *
     * @mbg.generated Sun Aug 05 11:44:27 CST 2018
     */
    public Long getRelationId() {
        return relationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mana_building.relation_id
     *
     * @param relationId the value for mana_building.relation_id
     *
     * @mbg.generated Sun Aug 05 11:44:27 CST 2018
     */
    public void setRelationId(Long relationId) {
        this.relationId = relationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mana_building.mana_id
     *
     * @return the value of mana_building.mana_id
     *
     * @mbg.generated Sun Aug 05 11:44:27 CST 2018
     */
    public Long getManaId() {
        return manaId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mana_building.mana_id
     *
     * @param manaId the value for mana_building.mana_id
     *
     * @mbg.generated Sun Aug 05 11:44:27 CST 2018
     */
    public void setManaId(Long manaId) {
        this.manaId = manaId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mana_building.dorm_id
     *
     * @return the value of mana_building.dorm_id
     *
     * @mbg.generated Sun Aug 05 11:44:27 CST 2018
     */
    public Long getDormId() {
        return dormId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mana_building.dorm_id
     *
     * @param dormId the value for mana_building.dorm_id
     *
     * @mbg.generated Sun Aug 05 11:44:27 CST 2018
     */
    public void setDormId(Long dormId) {
        this.dormId = dormId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mana_building.gmt_creat
     *
     * @return the value of mana_building.gmt_creat
     *
     * @mbg.generated Sun Aug 05 11:44:27 CST 2018
     */
    public Date getGmtCreat() {
        return gmtCreat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mana_building.gmt_creat
     *
     * @param gmtCreat the value for mana_building.gmt_creat
     *
     * @mbg.generated Sun Aug 05 11:44:27 CST 2018
     */
    public void setGmtCreat(Date gmtCreat) {
        this.gmtCreat = gmtCreat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mana_building.gmt_modified
     *
     * @return the value of mana_building.gmt_modified
     *
     * @mbg.generated Sun Aug 05 11:44:27 CST 2018
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mana_building.gmt_modified
     *
     * @param gmtModified the value for mana_building.gmt_modified
     *
     * @mbg.generated Sun Aug 05 11:44:27 CST 2018
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}