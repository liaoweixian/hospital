package com.example.hospital.pojo;

import java.io.Serializable;
import java.util.Date;

public class HospitalRecordT implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hospital_record_t.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hospital_record_t.record_user_id
     *
     * @mbggenerated
     */
    private Integer recordUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hospital_record_t.record_user_name
     *
     * @mbggenerated
     */
    private String recordUserName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hospital_record_t.record_cases_title_id
     *
     * @mbggenerated
     */
    private Integer recordCasesTitleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hospital_record_t.record_cases_title
     *
     * @mbggenerated
     */
    private String recordCasesTitle;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hospital_record_t.record_push_plan_id
     *
     * @mbggenerated
     */
    private Integer recordPushPlanId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hospital_record_t.record_push_content
     *
     * @mbggenerated
     */
    private String recordPushContent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hospital_record_t.creat_time
     *
     * @mbggenerated
     */
    private Date creatTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hospital_record_t.last_modify_time
     *
     * @mbggenerated
     */
    private Date lastModifyTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hospital_record_t.data_state
     *
     * @mbggenerated
     */
    private Byte dataState;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hospital_record_t
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hospital_record_t.id
     *
     * @return the value of hospital_record_t.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hospital_record_t.id
     *
     * @param id the value for hospital_record_t.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hospital_record_t.record_user_id
     *
     * @return the value of hospital_record_t.record_user_id
     *
     * @mbggenerated
     */
    public Integer getRecordUserId() {
        return recordUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hospital_record_t.record_user_id
     *
     * @param recordUserId the value for hospital_record_t.record_user_id
     *
     * @mbggenerated
     */
    public void setRecordUserId(Integer recordUserId) {
        this.recordUserId = recordUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hospital_record_t.record_user_name
     *
     * @return the value of hospital_record_t.record_user_name
     *
     * @mbggenerated
     */
    public String getRecordUserName() {
        return recordUserName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hospital_record_t.record_user_name
     *
     * @param recordUserName the value for hospital_record_t.record_user_name
     *
     * @mbggenerated
     */
    public void setRecordUserName(String recordUserName) {
        this.recordUserName = recordUserName == null ? null : recordUserName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hospital_record_t.record_cases_title_id
     *
     * @return the value of hospital_record_t.record_cases_title_id
     *
     * @mbggenerated
     */
    public Integer getRecordCasesTitleId() {
        return recordCasesTitleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hospital_record_t.record_cases_title_id
     *
     * @param recordCasesTitleId the value for hospital_record_t.record_cases_title_id
     *
     * @mbggenerated
     */
    public void setRecordCasesTitleId(Integer recordCasesTitleId) {
        this.recordCasesTitleId = recordCasesTitleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hospital_record_t.record_cases_title
     *
     * @return the value of hospital_record_t.record_cases_title
     *
     * @mbggenerated
     */
    public String getRecordCasesTitle() {
        return recordCasesTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hospital_record_t.record_cases_title
     *
     * @param recordCasesTitle the value for hospital_record_t.record_cases_title
     *
     * @mbggenerated
     */
    public void setRecordCasesTitle(String recordCasesTitle) {
        this.recordCasesTitle = recordCasesTitle == null ? null : recordCasesTitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hospital_record_t.record_push_plan_id
     *
     * @return the value of hospital_record_t.record_push_plan_id
     *
     * @mbggenerated
     */
    public Integer getRecordPushPlanId() {
        return recordPushPlanId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hospital_record_t.record_push_plan_id
     *
     * @param recordPushPlanId the value for hospital_record_t.record_push_plan_id
     *
     * @mbggenerated
     */
    public void setRecordPushPlanId(Integer recordPushPlanId) {
        this.recordPushPlanId = recordPushPlanId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hospital_record_t.record_push_content
     *
     * @return the value of hospital_record_t.record_push_content
     *
     * @mbggenerated
     */
    public String getRecordPushContent() {
        return recordPushContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hospital_record_t.record_push_content
     *
     * @param recordPushContent the value for hospital_record_t.record_push_content
     *
     * @mbggenerated
     */
    public void setRecordPushContent(String recordPushContent) {
        this.recordPushContent = recordPushContent == null ? null : recordPushContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hospital_record_t.creat_time
     *
     * @return the value of hospital_record_t.creat_time
     *
     * @mbggenerated
     */
    public Date getCreatTime() {
        return creatTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hospital_record_t.creat_time
     *
     * @param creatTime the value for hospital_record_t.creat_time
     *
     * @mbggenerated
     */
    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hospital_record_t.last_modify_time
     *
     * @return the value of hospital_record_t.last_modify_time
     *
     * @mbggenerated
     */
    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hospital_record_t.last_modify_time
     *
     * @param lastModifyTime the value for hospital_record_t.last_modify_time
     *
     * @mbggenerated
     */
    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hospital_record_t.data_state
     *
     * @return the value of hospital_record_t.data_state
     *
     * @mbggenerated
     */
    public Byte getDataState() {
        return dataState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hospital_record_t.data_state
     *
     * @param dataState the value for hospital_record_t.data_state
     *
     * @mbggenerated
     */
    public void setDataState(Byte dataState) {
        this.dataState = dataState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hospital_record_t
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
        sb.append(", recordUserId=").append(recordUserId);
        sb.append(", recordUserName=").append(recordUserName);
        sb.append(", recordCasesTitleId=").append(recordCasesTitleId);
        sb.append(", recordCasesTitle=").append(recordCasesTitle);
        sb.append(", recordPushPlanId=").append(recordPushPlanId);
        sb.append(", recordPushContent=").append(recordPushContent);
        sb.append(", creatTime=").append(creatTime);
        sb.append(", lastModifyTime=").append(lastModifyTime);
        sb.append(", dataState=").append(dataState);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}