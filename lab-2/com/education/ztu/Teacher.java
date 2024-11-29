package com.education.ztu;

public class Teacher extends Person {
    private String subject;
    private Car car;

    public Teacher() {
        super();
        this.subject = "Unknown";
        this.car = new Car("Default Model");
    }

    public Teacher(String fullName, int age, Location location, Gender gender, String subject, Car car) {
        super(fullName, age, location, gender);
        this.subject = subject;
        this.car = car;
    }

    @Override
    public String getOccupation() {
        return "Teacher";
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
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
