package com.education.ztu;

public abstract class Person implements Human {
    private String fullName;
    private int age;
    private Location location;
    private Gender gender;
    protected static int counter = 0;

    static {
        counter = 0;
    }

    {
        this.fullName = "Unknown";
        this.age = 0;
        this.location = Location.UNKNOWN;
        this.gender = Gender.UNKNOWN;
    }

    public Person() {
        counter++;
    }

    public Person(String fullName, int age, Location location, Gender gender) {
        this();
        this.fullName = fullName;
        this.age = age;
        this.location = location;
        this.gender = gender;
    }

    public abstract String getOccupation();

    public String getFullInfo() {
        return String.format("Name: %s, Age: %d, Location: %s, Gender: %s",
                fullName, age, location, gender);
    }

    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public Location getLocation() { return location; }
    public void setLocation(Location location) { this.location = location; }
    public Gender getGender() { return gender; }
    public void setGender(Gender gender) { this.gender = gender; }

    public static int showCounter() {
        return counter;
    }
}
