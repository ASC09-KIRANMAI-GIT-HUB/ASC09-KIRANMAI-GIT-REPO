package com.course.entity;

import javax.persistence.*;

@Entity
@Table(name = "Course") // JPA will create this table in MSSQL
public class CourseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer courseId;

    @Column(nullable = false)
    private String courseName;

    @Column(nullable = false)
    private String authorName;

    @Column(nullable = false)
    private Integer duration; // in hours

    @Column(nullable = false)
    private Boolean availability;

    public CourseEntity() {}

    public CourseEntity(Integer courseId, String courseName, String authorName, Integer duration, Boolean availability) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.authorName = authorName;
        this.duration = duration;
        this.availability = availability;
    }

    public Integer getCourseId() { return courseId; }
    public void setCourseId(Integer courseId) { this.courseId = courseId; }

    public String getCourseName() { return courseName; }
    public void setCourseName(String courseName) { this.courseName = courseName; }

    public String getAuthorName() { return authorName; }
    public void setAuthorName(String authorName) { this.authorName = authorName; }

    public Integer getDuration() { return duration; }
    public void setDuration(Integer duration) { this.duration = duration; }

    public Boolean getAvailability() { return availability; }
    public void setAvailability(Boolean availability) { this.availability = availability; }
}
