package com.example.hospital.pojo;

import java.io.Serializable;
import java.util.Date;

public class HospitalRoleT  {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hospital_role_t.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hospital_role_t.role_name
     *
     * @mbggenerated
     */
    private String roleName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hospital_role_t.creat_time
     *
     * @mbggenerated
     */
    private Date creatTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hospital_role_t.last_modify_time
     *
     * @mbggenerated
     */
    private Date lastModifyTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hospital_role_t.data_state
     *
     * @mbggenerated
     */
    private Byte dataState;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hospital_role_t
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hospital_role_t.id
     *
     * @return the value of hospital_role_t.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hospital_role_t.id
     *
     * @param id the value for hospital_role_t.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hospital_role_t.role_name
     *
     * @return the value of hospital_role_t.role_name
     *
     * @mbggenerated
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hospital_role_t.role_name
     *
     * @param roleName the value for hospital_role_t.role_name
     *
     * @mbggenerated
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hospital_role_t.creat_time
     *
     * @return the value of hospital_role_t.creat_time
     *
     * @mbggenerated
     */
    public Date getCreatTime() {
        return creatTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hospital_role_t.creat_time
     *
     * @param creatTime the value for hospital_role_t.creat_time
     *
     * @mbggenerated
     */
    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hospital_role_t.last_modify_time
     *
     * @return the value of hospital_role_t.last_modify_time
     *
     * @mbggenerated
     */
    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hospital_role_t.last_modify_time
     *
     * @param lastModifyTime the value for hospital_role_t.last_modify_time
     *
     * @mbggenerated
     */
    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hospital_role_t.data_state
     *
     * @return the value of hospital_role_t.data_state
     *
     * @mbggenerated
     */
    public Byte getDataState() {
        return dataState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hospital_role_t.data_state
     *
     * @param dataState the value for hospital_role_t.data_state
     *
     * @mbggenerated
     */
    public void setDataState(Byte dataState) {
        this.dataState = dataState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital_role_t
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", roleName=").append(roleName);
        sb.append(", creatTime=").append(creatTime);
        sb.append(", lastModifyTime=").append(lastModifyTime);
        sb.append(", dataState=").append(dataState);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }


    
}