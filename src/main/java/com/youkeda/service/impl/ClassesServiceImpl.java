package com.youkeda.service.impl;

import com.youkeda.model.Classes;
import com.youkeda.service.ClassesService;

import java.util.ArrayList;
import java.util.List;

public class ClassesServiceImpl implements ClassesService {
    private static List<Classes>CLASSES = new ArrayList<>();
    public void add(Classes classes){
        CLASSES.add(classes);
    }
    public List<Classes>getAll(){
        return CLASSES;
    }
}
