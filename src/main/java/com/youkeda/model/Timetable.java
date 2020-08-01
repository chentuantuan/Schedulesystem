package com.youkeda.model;


import java.time.LocalDateTime;
import java.util.UUID;

public class Timetable {
    //课表Id
    private String id = UUID.randomUUID().toString();
    //上课时间
    private LocalDateTime startTime;
    //结束时间
    private LocalDateTime endTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }
}
