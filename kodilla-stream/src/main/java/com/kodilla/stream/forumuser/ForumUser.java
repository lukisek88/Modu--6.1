package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.Period;

public class ForumUser {
    private final int numID;
    private String username;
    private char sex;
    private LocalDate date;
    private int numPosts;

    public ForumUser(int numID, String username, char sex, LocalDate date, int numPosts) {
        this.numID = numID;
        this.username = username;
        this.sex = sex;
        this.date = date;
        this.numPosts = numPosts;
    }

    public int getNumID() {
        return numID;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getNumPosts() {
        return numPosts;
    }

    @Override
    public String toString() {
        return "Imie: " + username +
                "  Plec  " + sex +
                "  Urodziny  " + date +
                "  Wiek  "+ Period.between(getDate(),LocalDate.now()).getYears()+
                "  Liczba Postow " + numPosts;

    }
}
