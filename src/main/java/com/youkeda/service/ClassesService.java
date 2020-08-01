package com.youkeda.service;

import com.youkeda.model.Classes;

import java.util.List;

public interface ClassesService {
    void add(Classes classes);
    List<Classes>getAll();

    default Classes get(String classesId) {
        List<Classes> classes = getAll();

        for (int i = 0; i < classes.size(); i++) {
            Classes classs = classes.get(i);
            if (classs.getId().equals(classesId)) {
                return classs;
            }
        }

        return null;
    }
}
