package com.scaler.designpatterns.builder.scenario1;

public class Client {
    public static void main(String[] args) {
        Builder b = new Builder();
        b.setId("1");
        b.setName("James");
        b.setAge(20);
        b.setPsp(80.3);
        b.setUniversity("University");
        b.setGradeYear(2021);
        b.setPhone("12345678");
        Student student=new Student(b);
        System.out.println(student);
    }
}
