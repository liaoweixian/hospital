package com.example.hospital.pojo;

import com.example.hospital.pojo.HospitalUserT;
import java.util.List;

public interface HospitalUserTMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital_user_t
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital_user_t
     *
     * @mbggenerated
     */
    int insert(HospitalUserT record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital_user_t
     *
     * @mbggenerated
     */
    HospitalUserT selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital_user_t
     *
     * @mbggenerated
     */
    List<HospitalUserT> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital_user_t
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(HospitalUserT record);
}