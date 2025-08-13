package com.course.controller;

import com.course.entity.CourseEntity;
import com.course.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

    private final CourseService courseService;

    @Autowired
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping
    public List<CourseEntity> getAllCourses() {
        return courseService.getAllCourses();
    }

    @GetMapping("/{id}")
    public CourseEntity getCourseById(@PathVariable Integer id) {
        return courseService.getCourseById(id);
    }

    @PostMapping
    public CourseEntity addCourse(@RequestBody CourseEntity course) {
        return courseService.addCourse(course);
    }

    @PutMapping("/{id}")
    public CourseEntity updateCourse(@PathVariable Integer id, @RequestBody CourseEntity course) {
        return courseService.updateCourse(id, course);
    }

    @DeleteMapping("/{id}")
    public void deleteCourse(@PathVariable Integer id) {
        courseService.deleteCourse(id);
    }

    @GetMapping("/search/name/{name}")
    public List<CourseEntity> searchByCourseName(@PathVariable String name) {
        return courseService.searchByCourseName(name);
    }

    @GetMapping("/search/author/{author}")
    public List<CourseEntity> searchByAuthorName(@PathVariable String author) {
        return courseService.searchByAuthorName(author);
    }
}
