package com.youkeda.service;

import com.youkeda.model.CourseTimetable;
import com.youkeda.model.WeekPlan;

import java.time.LocalDateTime;
import java.util.List;

public interface CourseTimetableService {
    //进行课程的课表安排
    void invoke(CourseTimetable courseTimetable, LocalDateTime starDay, LocalDateTime endDay, List<WeekPlan>weekPlans);
    //查询某个班级的课表安排
    CourseTimetable queryForClasses(String classesId);
}
