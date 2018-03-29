package com.course.pojo;

import java.util.Date;

public class CourseMessage {
    private Long courseId;

    private String courseName;

    private Long typeId;

    private Long coachId;

    private Long equipmentId;

    private Long siteId;

    private Date startTime;

    private Date endTime;

    private String classTime;

    private Long coursePrice;

    private Long cimageId;

    private String courseFeature;

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public Long getCoachId() {
        return coachId;
    }

    public void setCoachId(Long coachId) {
        this.coachId = coachId;
    }

    public Long getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(Long equipmentId) {
        this.equipmentId = equipmentId;
    }

    public Long getSiteId() {
        return siteId;
    }

    public void setSiteId(Long siteId) {
        this.siteId = siteId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getClassTime() {
        return classTime;
    }

    public void setClassTime(String classTime) {
        this.classTime = classTime;
    }

    public Long getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(Long coursePrice) {
        this.coursePrice = coursePrice;
    }

    public Long getCimageId() {
        return cimageId;
    }

    public void setCimageId(Long cimageId) {
        this.cimageId = cimageId;
    }

    public String getCourseFeature() {
        return courseFeature;
    }

    public void setCourseFeature(String courseFeature) {
        this.courseFeature = courseFeature;
    }
}