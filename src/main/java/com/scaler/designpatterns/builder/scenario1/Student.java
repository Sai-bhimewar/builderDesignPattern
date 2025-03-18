package com.scaler.designpatterns.builder.scenario1;

public class Student {
    private String id;
    private String name;
    private int age;
    private double psp;
    private String university;
    private int gradeYear;
    private String phone;

    public boolean isPhoneValid(String phone) {
        if(phone.length() != 10){
            return false;
        }else
        return true;
    }
    public Student(Builder builder) {
        if(builder.getGradeYear()<=2020){
            throw new RuntimeException("Grade Year should be greater than 2020");
        }
        if(!isPhoneValid(builder.getPhone())){
            throw new RuntimeException("Phone number is invalid");
        }
        this.id = builder.getId();
        this.name = builder.getName();
        this.age = builder.getAge();
        this.psp = builder.getPsp();
        this.university = builder.getUniversity();
        this.gradeYear = builder.getGradeYear();
        this.phone = builder.getPhone();
    }
}
