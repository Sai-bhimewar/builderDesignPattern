package com.scaler.designpatterns.builder.scenario3;

import lombok.Getter;

@Getter
public class Builder {
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

    public void build() {
        if(this.getGradeYear()<=2020){
            throw new RuntimeException("Grade Year should be greater than 2020");
        }
        if(!isPhoneValid(this.getPhone())){
            throw new RuntimeException("Phone number is invalid");
        }

    }

    public Builder setId(String id) {
        this.id = id;
        return this;
    }
    public Builder setName(String name) {
        this.name = name;
        return this;
    }
    public Builder setAge(int age) {
        this.age = age;
        return this;
    }
    public Builder setPsp(double psp) {
        this.psp = psp;
        return this;
    }
    public Builder setUniversity(String university) {
        this.university = university;
        return this;
    }
    public Builder setGradeYear(int gradeYear) {
        this.gradeYear = gradeYear;
        return this;
    }
    public Builder setPhone(String phone) {
        this.phone = phone;
        return this;
    }


}
