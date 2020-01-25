package com.nan.Model;

public class Employee {
    String name;
    int age;
    String Gender;
    int salary;

    public Employee(String name, int age, String Gender, int salary) {
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.Gender = Gender;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }
}
