package com.course.service;

import com.course.entity.CourseEntity;

import java.util.List;

public interface CourseService {
    List<CourseEntity> getAllCourses();
    CourseEntity getCourseById(Integer id);
    CourseEntity addCourse(CourseEntity course);
    CourseEntity updateCourse(Integer id, CourseEntity course);
    void deleteCourse(Integer id);

    List<CourseEntity> searchByCourseName(String courseName);
    List<CourseEntity> searchByAuthorName(String authorName);
}
