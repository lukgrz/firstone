package com.kodilla.stream.forumUser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> userList = new ArrayList<>();

    public Forum () {
        userList.add(new ForumUser(1, "Michael", 'M',
                1989, 2, 18, 0));
        userList.add(new ForumUser(2, "Stephanie", 'F',
                2000, 2, 18, 10));
        userList.add(new ForumUser(3, "Suszie", 'F',
                1989, 2, 18, 10));
        userList.add(new ForumUser(4, "Carmichael", 'M',
                2003, 2, 18, 10));
        userList.add(new ForumUser(5, "WeirdDude", 'M',
                1955, 2, 18, 10));
        userList.add(new ForumUser(6, "OldLady", 'F',
                1989, 2, 18, 10));
        userList.add(new ForumUser(7, "MonkeyKing", 'M',
                1989, 2, 18, 10));
    }

    public List<ForumUser> getUserList() {
        return userList;
    }
}
