package com.duan.dormitorysystem.dao;

import com.duan.dormitorysystem.bean.Student;
import com.duan.dormitorysystem.bean.StudentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_stu
     *
     * @mbg.generated Fri Jun 29 08:47:09 CST 2018
     */
    long countByExample(StudentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_stu
     *
     * @mbg.generated Fri Jun 29 08:47:09 CST 2018
     */
    int deleteByExample(StudentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_stu
     *
     * @mbg.generated Fri Jun 29 08:47:09 CST 2018
     */
    int deleteByPrimaryKey(Long stuId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_stu
     *
     * @mbg.generated Fri Jun 29 08:47:09 CST 2018
     */
    int insert(Student record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_stu
     *
     * @mbg.generated Fri Jun 29 08:47:09 CST 2018
     */
    int insertSelective(Student record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_stu
     *
     * @mbg.generated Fri Jun 29 08:47:09 CST 2018
     */
    List<Student> selectByExample(StudentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_stu
     *
     * @mbg.generated Fri Jun 29 08:47:09 CST 2018
     */
    Student selectByPrimaryKey(Long stuId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_stu
     *
     * @mbg.generated Fri Jun 29 08:47:09 CST 2018
     */
    int updateByExampleSelective(@Param("record") Student record, @Param("example") StudentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_stu
     *
     * @mbg.generated Fri Jun 29 08:47:09 CST 2018
     */
    int updateByExample(@Param("record") Student record, @Param("example") StudentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_stu
     *
     * @mbg.generated Fri Jun 29 08:47:09 CST 2018
     */
    int updateByPrimaryKeySelective(Student record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_stu
     *
     * @mbg.generated Fri Jun 29 08:47:09 CST 2018
     */
    int updateByPrimaryKey(Student record);
}