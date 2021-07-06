package com.kodilla.spring.forum;

import com.kodilla.spring;
import com.kodilla.spring.forum.ForumUser;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ForumUserTestSuite {

    @Test
    void testGetUserName() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        ForumUser forumUser = context.getBean(ForumUser.class);

        //When
        String name = forumUser.getUsername();

        //Then
        asseration.equals("John Smith", name);
    }
}
