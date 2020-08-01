package com.youkeda.service.impl;

import com.youkeda.model.Course;
import com.youkeda.model.CourseTimetable;
import com.youkeda.model.Timetable;
import com.youkeda.model.WeekPlan;
import com.youkeda.service.CourseTimetableService;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CourseTimetableServiceImpl implements CourseTimetableService {
    private static List<CourseTimetable> COURSETIMETABLE = new ArrayList<>();

    public void invoke(CourseTimetable courseTimetable, LocalDateTime startDay, LocalDateTime endDay, List<WeekPlan> weekPlans) {
        if (courseTimetable.getTimetables() == null) {
            courseTimetable.setTimetables(new ArrayList<>());
        }

        // 根据课时安排课程
        int sections = courseTimetable.getCourse().getSections();
        //获取学习总天数
        long days = Duration.between(startDay, endDay).toDays();

        for (int i = 0; i < days; i++) {
            // 如果课程已经分配完了，不用再排课了
            if (sections == 0) {
                break;
            }
            // 使用 plusDays 让日期递增
            LocalDateTime now = startDay.plusDays(i);

            // TODO 根据课程计划来判断这一天是否需要上课，上课的具体时间
            for (WeekPlan weekplan : weekPlans) {
                if (now.getDayOfWeek().getValue() == weekplan.getWeekDay()) {
                    Timetable Timetable = new Timetable();
                    Timetable.setId(UUID.randomUUID().toString());
                    //默认上课时间
                    LocalDateTime begin = now.withHour(8).withMinute(0);

                    // 从8点开始上课
                    if (weekplan.getTime().equals("am")) {
                        begin = now.withHour(8).withMinute(0);
                    }
                    // 如果是下午从13点开始上课
                    else if (weekplan.getTime().equals("pm")) {
                        begin = now.withHour(13).withMinute(0);
                    }
                    Timetable.setStartTime(begin);
                    // 每节课耗时一个小时，所以结束时间等于开始时间+几节
                    Timetable.setEndTime(begin.plusHours(weekplan.getCount()));

                    courseTimetable.getTimetables().add(Timetable);
                    sections = sections - weekplan.getCount();
                }
            }
        }
        COURSETIMETABLE.add(courseTimetable);
    }

    public CourseTimetable queryForClasses(String classesId) {
        for (CourseTimetable courseTimetable : COURSETIMETABLE) {
            if (courseTimetable.getClasses().getId().equals(classesId)) {
                return courseTimetable;
            }
        }
        return null;
    }
}