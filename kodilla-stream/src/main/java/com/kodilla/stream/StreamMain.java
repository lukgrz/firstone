package com.kodilla.stream;

import com.kodilla.stream.forumUser.Forum;
import com.kodilla.stream.forumUser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {

        Forum theForum = new Forum();

        Map<Integer, ForumUser> theResultMap = theForum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex()=='M')
                .filter(forumUser -> forumUser.getBirthDate().isBefore(LocalDate.now().minusYears(20)))
                .filter(forumUser -> forumUser.getPostsNumber()>1)
                .collect(Collectors.toMap(ForumUser::getIdNumber,forumUser -> forumUser));

        theResultMap.entrySet().stream()
                .forEach(System.out::println);

    }
}