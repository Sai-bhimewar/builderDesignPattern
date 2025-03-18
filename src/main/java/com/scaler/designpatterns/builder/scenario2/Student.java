package com.scaler.designpatterns.builder.scenario2;

public class Student {
    private String id;
    private String name;
    private int age;
    private double psp;
    private String university;
    private int gradeYear;
    private String phone;


    public static Builder getBuilder(){
        return new Builder();
    }
    public Student(Builder builder) {

        this.id = builder.getId();
        this.name = builder.getName();
        this.age = builder.getAge();
        this.psp = builder.getPsp();
        this.university = builder.getUniversity();
        this.gradeYear = builder.getGradeYear();
        this.phone = builder.getPhone();
    }
}
