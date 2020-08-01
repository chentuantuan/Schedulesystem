package com.youkeda.service;

import com.youkeda.model.Course;

public interface CourseService {
    //添加课程
    void add(Course course);
    //根据课程ID获取课程
    Course get(String courseId);
}
