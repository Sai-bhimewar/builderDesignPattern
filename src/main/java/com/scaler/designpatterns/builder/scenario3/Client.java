package com.scaler.designpatterns.builder.scenario3;


public class Client {
    public static void main(String[] args) {
        Student st = Student.getBuilder()
                .setId("1")
                .setAge(20)
                .setName("Sai")
                .setPsp(90.3)
                .setUniversity("Pune")
                .setPhone("1234567890")
                .setGradeYear(2023)
                .build();
        System.out.println(st);


//        Builder b=Student.getBuilder();  //now this will not work as constructor is private
//        b.setGradeYear(2020);
//        Student student=new Student(b);
//        System.out.println(student);
    }
}
