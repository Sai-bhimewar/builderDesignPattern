package com.scaler.designpatterns.PrototypeAndRegistry;

public class Client {
    public static void main(String[] args) {
        Student s = new Student();
        s.setId(1);
        s.setName("John Smith");
        s.setBatch("Apr24");
        IntelligentStudent i = new IntelligentStudent();
        i.setId(2);
        i.setName("Ian Bell");
        i.setBatch("Mar25");
        i.setIq(26);
        Student t = s.copy();
        Student t1 = i.copy();
        System.out.println(t);
        System.out.println(t1);
        StudentRegisty s1 = new StudentRegisty();
        s1.addStudent("BatchApr24",s);
        Student s4=s1.getStudent("BatchApr24").copy();
    }
}
