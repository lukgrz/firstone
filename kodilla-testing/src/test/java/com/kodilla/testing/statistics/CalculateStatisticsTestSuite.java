package com.kodilla.testing.statistics;

import com.kodilla.testing.forum.statistics.CalculateStatistics;
import com.kodilla.testing.forum.statistics.Statistics;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculateStatisticsTestSuite {

    Statistics statisticsMock = mock(Statistics.class);
    CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);

    public List<String> generateUsers(int i){
        List<String> userList = new ArrayList<>();
        for (int n=0;n<i;n++){
            userList.add("Username"+n);
        }
        return userList;
    }
    @BeforeEach
    public void prepareData(){
        List<String> exampleUserNames = generateUsers(100);
        int examplePostsNumber = 1000;
        int exampleCommentsNumber = 0;
        when(statisticsMock.userNames()).thenReturn(exampleUserNames);
        when(statisticsMock.postsCount()).thenReturn(examplePostsNumber);
        when(statisticsMock.commentsCount()).thenReturn(exampleCommentsNumber);
    }

    @Test
    void testCalculateStatisticsWith0Posts() {
        //Given
        when(statisticsMock.postsCount()).thenReturn(0);
        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(0,statisticsMock.postsCount());
        assertEquals(0,statisticsMock.commentsCount());
        assertEquals(100,statisticsMock.userNames().size());
        assertEquals(0,calculateStatistics.getNumberPostsPerUser());
        assertEquals(0,calculateStatistics.getNumberCommentsPerPost());
        assertEquals(0,calculateStatistics.getNumberCommentsPerUser());
    }

    @Test
    void testCalculateStatisticsWith1000posts() {
        //Given
        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(1000.0,statisticsMock.postsCount());
        assertEquals(0.0,statisticsMock.commentsCount());
        assertEquals(100.0,statisticsMock.userNames().size());
        assertEquals(10.0,calculateStatistics.getNumberPostsPerUser());
        assertEquals(0.0,calculateStatistics.getNumberCommentsPerPost());
        assertEquals(0.0,calculateStatistics.getNumberCommentsPerUser());

    }

    @Test
    void testCalculateStatisticsWith0Comments() {
        //Given
        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(1000.0,statisticsMock.postsCount());
        assertEquals(0.0,statisticsMock.commentsCount());
        assertEquals(100.0,statisticsMock.userNames().size());
        assertEquals(10.0,calculateStatistics.getNumberPostsPerUser());
        assertEquals(0.0,calculateStatistics.getNumberCommentsPerPost());
        assertEquals(0.0,calculateStatistics.getNumberCommentsPerUser());
    }

    @Test
    void testCalculateStatisticsWhenNumberOfCommentsIsHigherThanNumberOfPosts () {
        //Given
        when(statisticsMock.postsCount()).thenReturn(1);
        when(statisticsMock.commentsCount()).thenReturn(2);
        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(1.0,statisticsMock.postsCount());
        assertEquals(2.0,statisticsMock.commentsCount());
        assertEquals(100.0,statisticsMock.userNames().size());
        assertEquals(0.01,calculateStatistics.getNumberPostsPerUser());
        assertEquals(2.0,calculateStatistics.getNumberCommentsPerPost());
        assertEquals(0.02,calculateStatistics.getNumberCommentsPerUser());
    }

    @Test
    void testCalculateStatisticsWhenNumberOfPostsHigherIsHigherThanNumberOfComments() {
        //Given
        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(1000.0,statisticsMock.postsCount());
        assertEquals(0.0,statisticsMock.commentsCount());
        assertEquals(100.0,statisticsMock.userNames().size());
        assertEquals(10.0,calculateStatistics.getNumberPostsPerUser());
        assertEquals(0.0,calculateStatistics.getNumberCommentsPerPost());
        assertEquals(0.0,calculateStatistics.getNumberCommentsPerUser());
    }

    @Test
    void testCalculateStatisticswith0Users() {
        //Given
        List<String> exampleUserNames = generateUsers(0);
        when(statisticsMock.userNames()).thenReturn(exampleUserNames);
        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(1000.0,statisticsMock.postsCount());
        assertEquals(0.0,statisticsMock.commentsCount());
        assertEquals(0.0,statisticsMock.userNames().size());
        assertEquals(0.0,calculateStatistics.getNumberPostsPerUser());
        assertEquals(0.0,calculateStatistics.getNumberCommentsPerPost());
        assertEquals(0.0,calculateStatistics.getNumberCommentsPerUser());
    }

    @Test
    void testCalculateStatisticsWith100users(){
        //Given
        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(1000.0,statisticsMock.postsCount());
        assertEquals(0.0,statisticsMock.commentsCount());
        assertEquals(100.0,statisticsMock.userNames().size());
        assertEquals(10.0,calculateStatistics.getNumberPostsPerUser());
        assertEquals(0.0,calculateStatistics.getNumberCommentsPerPost());
        assertEquals(0.0,calculateStatistics.getNumberCommentsPerUser());
    }
}
