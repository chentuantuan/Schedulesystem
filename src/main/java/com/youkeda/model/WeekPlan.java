package com.youkeda.model;

public class WeekPlan {
    //星期数
    private int weekDay;
    //几节课
    private int count;
    //上课时间：am（上午）,pm（下午）
    private String time;

    public int getWeekDay() {
        return weekDay;
    }

    public void setWeekDay(int weekDay) {
        this.weekDay = weekDay;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
