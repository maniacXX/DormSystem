package com.duan.dormitorysystem.dao;

import com.duan.dormitorysystem.bean.ManaRelationBul;
import com.duan.dormitorysystem.bean.ManaRelationBulExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ManaRelationBulMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mana_building
     *
     * @mbg.generated Wed Mar 06 11:18:37 CST 2019
     */
    long countByExample(ManaRelationBulExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mana_building
     *
     * @mbg.generated Wed Mar 06 11:18:37 CST 2019
     */
    int deleteByExample(ManaRelationBulExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mana_building
     *
     * @mbg.generated Wed Mar 06 11:18:37 CST 2019
     */
    int deleteByPrimaryKey(Long relationId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mana_building
     *
     * @mbg.generated Wed Mar 06 11:18:37 CST 2019
     */
    int insert(ManaRelationBul record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mana_building
     *
     * @mbg.generated Wed Mar 06 11:18:37 CST 2019
     */
    int insertSelective(ManaRelationBul record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mana_building
     *
     * @mbg.generated Wed Mar 06 11:18:37 CST 2019
     */
    List<ManaRelationBul> selectByExample(ManaRelationBulExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mana_building
     *
     * @mbg.generated Wed Mar 06 11:18:37 CST 2019
     */
    ManaRelationBul selectByPrimaryKey(Long relationId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mana_building
     *
     * @mbg.generated Wed Mar 06 11:18:37 CST 2019
     */
    int updateByExampleSelective(@Param("record") ManaRelationBul record, @Param("example") ManaRelationBulExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mana_building
     *
     * @mbg.generated Wed Mar 06 11:18:37 CST 2019
     */
    int updateByExample(@Param("record") ManaRelationBul record, @Param("example") ManaRelationBulExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mana_building
     *
     * @mbg.generated Wed Mar 06 11:18:37 CST 2019
     */
    int updateByPrimaryKeySelective(ManaRelationBul record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mana_building
     *
     * @mbg.generated Wed Mar 06 11:18:37 CST 2019
     */
    int updateByPrimaryKey(ManaRelationBul record);
}