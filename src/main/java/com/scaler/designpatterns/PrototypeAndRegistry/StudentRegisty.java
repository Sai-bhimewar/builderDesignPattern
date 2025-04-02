package com.scaler.designpatterns.PrototypeAndRegistry;

import java.util.HashMap;

public class StudentRegisty {
    private HashMap<String,Student> students;

    public StudentRegisty(){
        students=new HashMap<>();
    }

    public Student getStudent(String name){
        return students.get(name);
    }

    public void addStudent(String name,Student student){
        students.put(name,student);
    }

    public void removeStudent(String name){
        students.remove(name);
    }
}
