package com.duan.dormitorysystem.bean;

import java.util.Date;

public class Manager {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_manager.mana_id
     *
     * @mbg.generated Sun Aug 05 11:44:27 CST 2018
     */
    private Long manaId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_manager.mana_name
     *
     * @mbg.generated Sun Aug 05 11:44:27 CST 2018
     */
    private String manaName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_manager.mana_password
     *
     * @mbg.generated Sun Aug 05 11:44:27 CST 2018
     */
    private String manaPassword;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_manager.mana_email
     *
     * @mbg.generated Sun Aug 05 11:44:27 CST 2018
     */
    private String manaEmail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_manager.gmt_creat
     *
     * @mbg.generated Sun Aug 05 11:44:27 CST 2018
     */
    private Date gmtCreat;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_manager.gmt_modified
     *
     * @mbg.generated Sun Aug 05 11:44:27 CST 2018
     */
    private Date gmtModified;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_manager
     *
     * @mbg.generated Sun Aug 05 11:44:27 CST 2018
     */
    public Manager(Long manaId, String manaName, String manaPassword, String manaEmail, Date gmtCreat, Date gmtModified) {
        this.manaId = manaId;
        this.manaName = manaName;
        this.manaPassword = manaPassword;
        this.manaEmail = manaEmail;
        this.gmtCreat = gmtCreat;
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_manager
     *
     * @mbg.generated Sun Aug 05 11:44:27 CST 2018
     */
    public Manager() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_manager.mana_id
     *
     * @return the value of tbl_manager.mana_id
     *
     * @mbg.generated Sun Aug 05 11:44:27 CST 2018
     */
    public Long getManaId() {
        return manaId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_manager.mana_id
     *
     * @param manaId the value for tbl_manager.mana_id
     *
     * @mbg.generated Sun Aug 05 11:44:27 CST 2018
     */
    public void setManaId(Long manaId) {
        this.manaId = manaId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_manager.mana_name
     *
     * @return the value of tbl_manager.mana_name
     *
     * @mbg.generated Sun Aug 05 11:44:27 CST 2018
     */
    public String getManaName() {
        return manaName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_manager.mana_name
     *
     * @param manaName the value for tbl_manager.mana_name
     *
     * @mbg.generated Sun Aug 05 11:44:27 CST 2018
     */
    public void setManaName(String manaName) {
        this.manaName = manaName == null ? null : manaName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_manager.mana_password
     *
     * @return the value of tbl_manager.mana_password
     *
     * @mbg.generated Sun Aug 05 11:44:27 CST 2018
     */
    public String getManaPassword() {
        return manaPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_manager.mana_password
     *
     * @param manaPassword the value for tbl_manager.mana_password
     *
     * @mbg.generated Sun Aug 05 11:44:27 CST 2018
     */
    public void setManaPassword(String manaPassword) {
        this.manaPassword = manaPassword == null ? null : manaPassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_manager.mana_email
     *
     * @return the value of tbl_manager.mana_email
     *
     * @mbg.generated Sun Aug 05 11:44:27 CST 2018
     */
    public String getManaEmail() {
        return manaEmail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_manager.mana_email
     *
     * @param manaEmail the value for tbl_manager.mana_email
     *
     * @mbg.generated Sun Aug 05 11:44:27 CST 2018
     */
    public void setManaEmail(String manaEmail) {
        this.manaEmail = manaEmail == null ? null : manaEmail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_manager.gmt_creat
     *
     * @return the value of tbl_manager.gmt_creat
     *
     * @mbg.generated Sun Aug 05 11:44:27 CST 2018
     */
    public Date getGmtCreat() {
        return gmtCreat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_manager.gmt_creat
     *
     * @param gmtCreat the value for tbl_manager.gmt_creat
     *
     * @mbg.generated Sun Aug 05 11:44:27 CST 2018
     */
    public void setGmtCreat(Date gmtCreat) {
        this.gmtCreat = gmtCreat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_manager.gmt_modified
     *
     * @return the value of tbl_manager.gmt_modified
     *
     * @mbg.generated Sun Aug 05 11:44:27 CST 2018
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_manager.gmt_modified
     *
     * @param gmtModified the value for tbl_manager.gmt_modified
     *
     * @mbg.generated Sun Aug 05 11:44:27 CST 2018
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}