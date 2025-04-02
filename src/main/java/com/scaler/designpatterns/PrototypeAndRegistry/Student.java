package com.scaler.designpatterns.PrototypeAndRegistry;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {
    private int id;
    private String name;
    private String batch;

    Student(){

    }

    Student(Student s){
        this.id = s.id;
        this.name = s.name;
        this.batch = s.batch;
    }

    public Student copy(){
        Student s = new Student(this);
        return s;
    }
}
