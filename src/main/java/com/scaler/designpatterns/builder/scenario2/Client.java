package com.scaler.designpatterns.builder.scenario2;


public class Client {
    public static void main(String[] args) {
        Student st = Student.getBuilder()
                .setId("1").
                setAge(20).
                setName("Sai").
                setPsp(90.3).
                setUniversity("Pune").
                setPhone("1234567890").
                setGradeYear(2020).
                build();
        System.out.println(st);


//        Builder b=Student.getBuilder();  here validations are kept inside builder not student
//        b.setGradeYear(2020);            and we are calling student so this is not throwing error
//        Student student=new Student(b);  so in scenario3 we are copying builder class into student
//        System.out.println(student);
    }
}
