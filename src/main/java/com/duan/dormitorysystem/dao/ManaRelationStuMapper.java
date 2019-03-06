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
     * @mbg.generated Wed Mar 06 11:18:37 CST 2019
     */
    long countByExample(ManaRelationStuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mana_stu
     *
     * @mbg.generated Wed Mar 06 11:18:37 CST 2019
     */
    int deleteByExample(ManaRelationStuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mana_stu
     *
     * @mbg.generated Wed Mar 06 11:18:37 CST 2019
     */
    int deleteByPrimaryKey(Long relationId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mana_stu
     *
     * @mbg.generated Wed Mar 06 11:18:37 CST 2019
     */
    int insert(ManaRelationStu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mana_stu
     *
     * @mbg.generated Wed Mar 06 11:18:37 CST 2019
     */
    int insertSelective(ManaRelationStu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mana_stu
     *
     * @mbg.generated Wed Mar 06 11:18:37 CST 2019
     */
    List<ManaRelationStu> selectByExample(ManaRelationStuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mana_stu
     *
     * @mbg.generated Wed Mar 06 11:18:37 CST 2019
     */
    ManaRelationStu selectByPrimaryKey(Long relationId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mana_stu
     *
     * @mbg.generated Wed Mar 06 11:18:37 CST 2019
     */
    int updateByExampleSelective(@Param("record") ManaRelationStu record, @Param("example") ManaRelationStuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mana_stu
     *
     * @mbg.generated Wed Mar 06 11:18:37 CST 2019
     */
    int updateByExample(@Param("record") ManaRelationStu record, @Param("example") ManaRelationStuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mana_stu
     *
     * @mbg.generated Wed Mar 06 11:18:37 CST 2019
     */
    int updateByPrimaryKeySelective(ManaRelationStu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mana_stu
     *
     * @mbg.generated Wed Mar 06 11:18:37 CST 2019
     */
    int updateByPrimaryKey(ManaRelationStu record);
}