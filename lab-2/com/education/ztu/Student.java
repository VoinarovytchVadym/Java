package com.education.ztu;

public class Student extends Person {
    private String major;

    public Student() {
        super();
        this.major = "Undeclared";
    }

    public Student(String fullName, int age, Location location, Gender gender, String major) {
        super(fullName, age, location, gender);
        this.major = major;
    }

    @Override
    public String getOccupation() {
        return "Student";
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public void sayFullName() {
        System.out.println("Full Name: " + getFullName());
    }

    @Override
    public void sayAge() {
        System.out.println("Age: " + getAge());
    }

    @Override
    public void sayLocation() {
        System.out.println("Location: " + getLocation());
    }

    @Override
    public void sayGender() {
        System.out.println("Gender: " + getGender());
    }
}
