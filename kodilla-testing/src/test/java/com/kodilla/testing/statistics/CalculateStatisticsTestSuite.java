package com.kodilla.testing.statistics;

import com.kodilla.testing.forum.statistics.CalculateStatistics;
import com.kodilla.testing.forum.statistics.Statistics;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CalculateStatisticsTestSuite {

    @Mock
    private Statistics statisticsMock;

    @Test
    void test0Posts() {
        List<String> exampleUserNames = Arrays.asList("Mike","John","Wildcat","Big Boss","Nikolaj");
        int examplePostsNumber = 0;
        int exampleCommentsNumber = 100;
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        when(statisticsMock.userNames()).thenReturn(exampleUserNames);
        when(statisticsMock.postsCount()).thenReturn(examplePostsNumber);
        when(statisticsMock.commentsCount()).thenReturn(exampleCommentsNumber);
        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0,calculateStatistics.getNumberPostsPerUser());
        assertEquals(0,calculateStatistics.getNumberCommentsPerPost());
        assertEquals(0,calculateStatistics.getNumberCommentsPerUser());
    }

    @Test
    void test1000posts() {
        List<String> exampleUserNames = Arrays.asList("Mike","John","Wildcat","Big Boss","Nikolaj");
        int examplePostsNumber = 1000;
        int exampleCommentsNumber = 100;
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        when(statisticsMock.userNames()).thenReturn(exampleUserNames);
        when(statisticsMock.postsCount()).thenReturn(examplePostsNumber);
        when(statisticsMock.commentsCount()).thenReturn(exampleCommentsNumber);
        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(200,calculateStatistics.getNumberPostsPerUser());
        assertEquals(0.1,calculateStatistics.getNumberCommentsPerPost());
        assertEquals(20,calculateStatistics.getNumberCommentsPerUser());

    }

    @Test
    void test0Comments() {
        List<String> exampleUserNames = Arrays.asList("Mike","John","Wildcat","Big Boss","Nikolaj");
        int examplePostsNumber = 100;
        int exampleCommentsNumber = 0;
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        when(statisticsMock.userNames()).thenReturn(exampleUserNames);
        when(statisticsMock.postsCount()).thenReturn(examplePostsNumber);
        when(statisticsMock.commentsCount()).thenReturn(exampleCommentsNumber);
        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(20,calculateStatistics.getNumberPostsPerUser());
        assertEquals(0,calculateStatistics.getNumberCommentsPerPost());
        assertEquals(0,calculateStatistics.getNumberCommentsPerUser());
    }

    @Test
    void testNumberOfCommentsHigherThanPosts () {
        List<String> exampleUserNames = Arrays.asList("Mike","John","Wildcat","Big Boss","Nikolaj");
        int examplePostsNumber = 5;
        int exampleCommentsNumber = 100;
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        when(statisticsMock.userNames()).thenReturn(exampleUserNames);
        when(statisticsMock.postsCount()).thenReturn(examplePostsNumber);
        when(statisticsMock.commentsCount()).thenReturn(exampleCommentsNumber);
        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(1,calculateStatistics.getNumberPostsPerUser());
        assertEquals(20,calculateStatistics.getNumberCommentsPerPost());
        assertEquals(20,calculateStatistics.getNumberCommentsPerUser());
    }

    @Test
    void testNumberOfPostsHigherThanComments() {
        List<String> exampleUserNames = Arrays.asList("Mike","John","Wildcat","Big Boss","Nikolaj");
        int examplePostsNumber = 100;
        int exampleCommentsNumber = 50;
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        when(statisticsMock.userNames()).thenReturn(exampleUserNames);
        when(statisticsMock.postsCount()).thenReturn(examplePostsNumber);
        when(statisticsMock.commentsCount()).thenReturn(exampleCommentsNumber);
        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(20,calculateStatistics.getNumberPostsPerUser());
        assertEquals(0.5,calculateStatistics.getNumberCommentsPerPost());
        assertEquals(10,calculateStatistics.getNumberCommentsPerUser());
    }

    @Test
    void test0Users() {
        List<String> exampleUserNames = new ArrayList<>();
        int examplePostsNumber = 100;
        int exampleCommentsNumber = 100;
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        when(statisticsMock.userNames()).thenReturn(exampleUserNames);
        when(statisticsMock.postsCount()).thenReturn(examplePostsNumber);
        when(statisticsMock.commentsCount()).thenReturn(exampleCommentsNumber);
        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0,calculateStatistics.getNumberPostsPerUser());
        assertEquals(0,calculateStatistics.getNumberCommentsPerPost());
        assertEquals(0,calculateStatistics.getNumberCommentsPerUser());
    }
    public List<String> generateUsers(int i){
        List<String> userList = new ArrayList<>();
        for (int n=0;n<i;n++){
            userList.add("Username"+n);
        }
        return userList;
    }
    @Test
    void test100users(){
        List<String> exampleUserNames = generateUsers(100);
        int examplePostsNumber = 100;
        int exampleCommentsNumber = 100;
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        when(statisticsMock.userNames()).thenReturn(exampleUserNames);
        when(statisticsMock.postsCount()).thenReturn(examplePostsNumber);
        when(statisticsMock.commentsCount()).thenReturn(exampleCommentsNumber);
        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(1,calculateStatistics.getNumberPostsPerUser());
        assertEquals(1,calculateStatistics.getNumberCommentsPerPost());
        assertEquals(1,calculateStatistics.getNumberCommentsPerUser());
    }
}
