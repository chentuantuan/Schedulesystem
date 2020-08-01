package com.youkeda.service.impl;

import com.youkeda.model.Course;
import com.youkeda.service.CourseService;

import java.util.ArrayList;
import java.util.List;

public class CourseServiceImpl implements CourseService {
    private static List<Course>COURSE = new ArrayList<>();
    public void add(Course course){
        COURSE.add(course);
    }
    public Course get(String courseId){
        for (Course courses : COURSE) {
            if (courses.getId().equals(courseId)) {
                return courses;
            }
        }
        return null;
    }
}
