package com.education.ztu;

public class Main {
    public static void main(String[] args) {
        // Creating objects
        Student student = new Student("John Doe", 20, Location.CITY, Gender.MALE, "Computer Science");
        Teacher teacher = new Teacher("Jane Smith", 45, Location.TOWN, Gender.FEMALE, "Mathematics", new Car("Toyota"));

        // Demonstrating functionality
        student.sayFullName();
        student.sayAge();
        System.out.println(student.getFullInfo());

        teacher.sayFullName();
        teacher.sayAge();
        System.out.println(teacher.getFullInfo());
        System.out.println("Car model: " + teacher.getCar().getEngine().isEngineWorks());

        // Instanceof demonstration
        System.out.println(student instanceof Person); // true
        System.out.println(teacher instanceof Human);  // true

        // Using Operation methods
        System.out.println("Addition: " + Operation.addition(1, 2, 3));
        System.out.println("Average: " + Operation.average(1, 2, 3));
        System.out.println("Maximum: " + Operation.maximum(1, 2, 3));
    }
}
