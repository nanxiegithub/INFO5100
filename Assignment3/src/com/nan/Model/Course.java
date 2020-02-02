package com.nan.Model;

public class Course {

    private String name;

    private Student[] registeredStudent;

    private int numberOfStudent;

    public Course(String name) {
        this.name = name;
        registeredStudent = new Student[10];
    }

    public Student[] getStudents() {
        return registeredStudent;
    }

    public boolean isFull(){
        return numberOfStudent == 10;
    }

    public void registerStudent(Student student){

        if (isFull()) {
            System.out.println("Error registering student " + student.getName()  + " because the class is full");
        } else {
            registeredStudent[numberOfStudent] = student;
            numberOfStudent ++;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfStudent() {
        return numberOfStudent;
    }

    public void setNumberOfStudent(int numberOfStudent) {
        this.numberOfStudent = numberOfStudent;
    }

}
