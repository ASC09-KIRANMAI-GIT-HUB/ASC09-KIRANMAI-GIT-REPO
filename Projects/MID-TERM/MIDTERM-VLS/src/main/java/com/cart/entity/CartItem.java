package com.cart.entity;

public class CartItem {

    private Integer courseId;
    private String courseName;
    private String authorName;
    private Integer duration;
    private Boolean availability;

    public CartItem() {}

    public CartItem(Integer courseId, String courseName, String authorName, Integer duration, Boolean availability) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.authorName = authorName;
        this.duration = duration;
        this.availability = availability;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Boolean getAvailability() {
        return availability;
    }

    public void setAvailability(Boolean availability) {
        this.availability = availability;
    }
}
