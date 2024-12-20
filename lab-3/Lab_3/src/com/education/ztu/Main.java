package com.education.ztu;

import com.education.ztu.game.Team;
import com.education.ztu.game.Schoolar;
import com.education.ztu.game.Student;
import com.education.ztu.game.Employee;

public class Main {
    public static void main(String[] args) {
        // Створення команди школярів
        Team<Schoolar> schoolarTeam = new Team<>("Schoolars Team");
        schoolarTeam.addParticipant(new Schoolar("Alex", 10));
        schoolarTeam.addParticipant(new Schoolar("Emma", 12));

        // Створення команди студентів
        Team<Student> studentTeam = new Team<>("Students Team");
        studentTeam.addParticipant(new Student("John", 20));
        studentTeam.addParticipant(new Student("Sophia", 22));

        // Створення команди працівників
        Team<Employee> employeeTeam = new Team<>("Employees Team");
        employeeTeam.addParticipant(new Employee("Michael", 30));
        employeeTeam.addParticipant(new Employee("Sarah", 28));

        // Ігри
        Team<Schoolar> anotherSchoolarTeam = new Team<>("Another Schoolars Team");
        schoolarTeam.playWith(anotherSchoolarTeam);

        Team<Student> anotherStudentTeam = new Team<>("Another Students Team");
        studentTeam.playWith(anotherStudentTeam);

        // Наступний рядок спричинить помилку компіляції через обмеження Generics
        // schoolarTeam.playWith(studentTeam);
    }
}
