package com.education.ztu.game;

import java.util.ArrayList;
import java.util.List;

public class Team<T extends Participant> {
    private String name;
    private List<T> participants = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void addParticipant(T participant) {
        participants.add(participant);
        System.out.println(participant.getName() + " added to team " + name);
    }

    public void playWith(Team<T> opponent) {
        System.out.println(this.name + " is playing with " + opponent.getName());
    }

    public String getName() {
        return name;
    }

    public List<T> getParticipants() {
        return participants;
    }

    // Deep cloning using constructor
    public Team<T> cloneTeam() {
        Team<T> clonedTeam = new Team<>(this.name);
        for (T participant : this.participants) {
            clonedTeam.addParticipant((T) participant.clone());
        }
        return clonedTeam;
    }
}
