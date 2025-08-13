package com.course.service;

import com.course.entity.CourseEntity;
import com.course.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    private final CourseRepository courseRepository;

    @Autowired
    public CourseServiceImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public List<CourseEntity> getAllCourses() {
        return courseRepository.findAll();
    }

    @Override
    public CourseEntity getCourseById(Integer id) {
        return courseRepository.findById(id).orElse(null);
    }

    @Override
    public CourseEntity addCourse(CourseEntity course) {
        return courseRepository.save(course);
    }

    @Override
    public CourseEntity updateCourse(Integer id, CourseEntity course) {
        CourseEntity existing = courseRepository.findById(id).orElse(null);
        if (existing != null) {
            existing.setCourseName(course.getCourseName());
            existing.setAuthorName(course.getAuthorName());
            existing.setDuration(course.getDuration());
            existing.setAvailability(course.getAvailability());
            return courseRepository.save(existing);
        }
        return null;
    }

    @Override
    public void deleteCourse(Integer id) {
        courseRepository.deleteById(id);
    }

    @Override
    public List<CourseEntity> searchByCourseName(String courseName) {
        return courseRepository.findByCourseNameContainingIgnoreCase(courseName);
    }

    @Override
    public List<CourseEntity> searchByAuthorName(String authorName) {
        return courseRepository.findByAuthorNameContainingIgnoreCase(authorName);
    }
}
