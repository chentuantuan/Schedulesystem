package com.youkeda.model;

public class Course {
    //课程ID
    private String id;
    //课程名称
    private String name;
    //课程总节数
    private int sections;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSections() {
        return sections;
    }

    public void setSections(int sections) {
        this.sections = sections;
    }
}
