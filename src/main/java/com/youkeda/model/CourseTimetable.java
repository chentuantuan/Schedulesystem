package com.youkeda.model;

import java.util.List;

public class CourseTimetable {
    //课程数据
    private Course course;
    //班级数据
    private Classes classes;
    //老师名称
    private String teacher;
    //课表数据
    private List<Timetable> timetables;

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Classes getClasses() {
        return classes;
    }

    public void setClasses(Classes classes) {
        this.classes = classes;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public List<Timetable> getTimetables() {
        return timetables;
    }

    public void setTimetables(List<Timetable> timetables) {
        this.timetables = timetables;
    }
}
