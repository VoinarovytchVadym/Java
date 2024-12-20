package com.education.ztu;

import com.education.ztu.game.Participant;
import com.education.ztu.game.ParticipantAgeComparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        // Create participants
        List<Participant> participants = new ArrayList<>();
        Participant p1 = new Participant("John", 22);
        Participant p2 = new Participant("Alex", 20);
        Participant p3 = new Participant("Sophia", 22);
        Participant p4 = new Participant("Emma", 18);

        participants.add(p1);
        participants.add(p2);
        participants.add(p3);
        participants.add(p4);

        // Demonstrate toString
        System.out.println("Participant details:");
        participants.forEach(System.out::println);

        // Demonstrate hashCode and equals
        System.out.println("\nHashCode and Equals Demonstration:");
        Participant cloneP1 = p1.clone();
        System.out.println("Original hashCode: " + p1.hashCode());
        System.out.println("Clone hashCode: " + cloneP1.hashCode());
        System.out.println("Original equals Clone: " + p1.equals(cloneP1));

        // Sort by name using Comparable
        System.out.println("\nSorting by name:");
        participants.sort(Participant::compareTo);
        participants.forEach(System.out::println);

        // Sort by age using Comparator
        System.out.println("\nSorting by age:");
        participants.sort(new ParticipantAgeComparator());
        participants.forEach(System.out::println);

        // Sort by name, then by age using Java 8 features
        System.out.println("\nSorting by name, then by age:");
        participants.sort(Comparator.comparing(Participant::getName).thenComparing(Participant::getAge));
        participants.forEach(System.out::println);
    }
}