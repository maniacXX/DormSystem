package com.duan.dormitorysystem.dao;

import com.duan.dormitorysystem.bean.ManaRelationStu;
import com.duan.dormitorysystem.bean.ManaRelationStuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ManaRelationStuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mana_stu
     *
     * @mbg.generated Sun Aug 05 11:44:27 CST 2018
     */
    long countByExample(ManaRelationStuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mana_stu
     *
     * @mbg.generated Sun Aug 05 11:44:27 CST 2018
     */
    int deleteByExample(ManaRelationStuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mana_stu
     *
     * @mbg.generated Sun Aug 05 11:44:27 CST 2018
     */
    int deleteByPrimaryKey(Long relationId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mana_stu
     *
     * @mbg.generated Sun Aug 05 11:44:27 CST 2018
     */
    int insert(ManaRelationStu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mana_stu
     *
     * @mbg.generated Sun Aug 05 11:44:27 CST 2018
     */
    int insertSelective(ManaRelationStu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mana_stu
     *
     * @mbg.generated Sun Aug 05 11:44:27 CST 2018
     */
    List<ManaRelationStu> selectByExample(ManaRelationStuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mana_stu
     *
     * @mbg.generated Sun Aug 05 11:44:27 CST 2018
     */
    ManaRelationStu selectByPrimaryKey(Long relationId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mana_stu
     *
     * @mbg.generated Sun Aug 05 11:44:27 CST 2018
     */
    int updateByExampleSelective(@Param("record") ManaRelationStu record, @Param("example") ManaRelationStuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mana_stu
     *
     * @mbg.generated Sun Aug 05 11:44:27 CST 2018
     */
    int updateByExample(@Param("record") ManaRelationStu record, @Param("example") ManaRelationStuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mana_stu
     *
     * @mbg.generated Sun Aug 05 11:44:27 CST 2018
     */
    int updateByPrimaryKeySelective(ManaRelationStu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mana_stu
     *
     * @mbg.generated Sun Aug 05 11:44:27 CST 2018
     */
    int updateByPrimaryKey(ManaRelationStu record);
}