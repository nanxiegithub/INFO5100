package com.nan;

import com.nan.Model.Course;
import com.nan.Model.Student;

public class Quest1Test {

    public static void main(String[] args) {
        // write your code here
        Course java = new Course("Java");

        Student a = new Student("a", 121);
        Student b = new Student("b", 122);
        Student c = new Student("c", 123);
        Student d = new Student("d", 124);
        Student e = new Student("e", 125);
        Student f = new Student("f", 126);
        Student g = new Student("g", 127);
        Student h = new Student("h", 128);
        Student i = new Student("i", 129);
        Student j = new Student("j", 120);

        System.out.println("registered 10 students");

        Student extra = new Student("extra", 130);

        // register students
        java.registerStudent(a);
        java.registerStudent(b);
        java.registerStudent(c);
        java.registerStudent(d);
        java.registerStudent(e);
        java.registerStudent(f);
        java.registerStudent(g);
        java.registerStudent(h);
        java.registerStudent(i);
        java.registerStudent(j);

        // This should be rejected due to the class is full
        java.registerStudent(extra);

        Student[] students = java.getStudents();

        for (Student student : students) {
            System.out.println("id: " + student.getId() + " name: " + student.getName());
        }

        // Modify student j's information
        j.setId(999);
        j.setName("jjj");

        System.out.println("modified id: " + students[9].getId() + " modified name: " + students[9].getName());
    }
}
