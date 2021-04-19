package com.kodilla.stream.forumUser;

import java.time.LocalDate;

public final class ForumUser {
    private final int idNumber;
    private final String username;
    private final char sex;
    private final LocalDate birthDate;
    private final int postsNumber;

    public ForumUser(int idNumber, String username, char sex, int yearOfBirth, int monthOfBirth, int dayOfBirth
            , int postsNumber) {
        this.idNumber = idNumber;
        this.username = username;
        this.sex = sex;
        this.birthDate = LocalDate.of(yearOfBirth,monthOfBirth,dayOfBirth);
        this.postsNumber = postsNumber;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPostsNumber() {
        return postsNumber;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "idNumber=" + idNumber +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", postsNumber=" + postsNumber +
                '}';
    }
}
