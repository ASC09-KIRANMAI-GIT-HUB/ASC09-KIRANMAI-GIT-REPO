package com.course.repository;

import com.course.entity.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<CourseEntity, Integer> {
    List<CourseEntity> findByCourseNameContainingIgnoreCase(String courseName);
    List<CourseEntity> findByAuthorNameContainingIgnoreCase(String authorName);
}
