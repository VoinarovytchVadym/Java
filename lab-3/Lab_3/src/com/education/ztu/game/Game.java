package com.education.ztu.game;

public class Game {
    public static void main(String[] args) {
        // Create participants
        Schoolar schoolar1 = new Schoolar("Ivan", 13);
        Schoolar schoolar2 = new Schoolar("Mariya", 15);
        Schoolar schoolar3 = new Schoolar("Sergey", 12);
        Schoolar schoolar4 = new Schoolar("Olga", 14);
        Student student1 = new Student("Mykola", 20);
        Student student2 = new Student("Viktoria", 21);
        Employee employee1 = new Employee("Andriy", 28);
        Employee employee2 = new Employee("Oksana", 25);

        // Create teams
        Team<Schoolar> scollarTeam = new Team<>("Dragon");
        scollarTeam.addParticipant(schoolar1);
        scollarTeam.addParticipant(schoolar2);

        Team<Schoolar> scollarTeam2 = new Team<>("Rozumnyky");
        scollarTeam2.addParticipant(schoolar3);
        scollarTeam2.addParticipant(schoolar4);

        Team<Student> studentTeam = new Team<>("Vpered");
        studentTeam.addParticipant(student1);
        studentTeam.addParticipant(student2);

        Team<Employee> employeeTeam = new Team<>("Robotyagi");
        employeeTeam.addParticipant(employee1);
        employeeTeam.addParticipant(employee2);

        // Play games
        scollarTeam.playWith(scollarTeam2); // Valid
        // scollarTeam.playWith(studentTeam); // Compilation error
        // scollarTeam.playWith(employeeTeam); // Compilation error
    }
}
