package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TasksFactoryTestSuite {

    @Test
    void testFactoryShoppingTask() {
        //Given
        TaskFactory task = new TaskFactory();
        //When
        Task shopping  = task.createTask(task.SHOPPING);
        //Then
        shopping.executeTask();
        assertEquals("Shopping", shopping.getTaskName());
        assertEquals(true, shopping.isTaskExecuted());
    }

    @Test
    void testFactoryDrivingTask() {
        //Given
        TaskFactory task = new TaskFactory();
        //When
        Task driving = task.createTask(task.DRIVING);
        //Then
        driving.executeTask();
        assertEquals("Driving", driving.getTaskName());
    }

    @Test
    void  testFactoryPaintingTask() {
        //Given
        TaskFactory task = new TaskFactory();
        //When
        Task painting = task.createTask(task.PAINTING);
        //Then
        painting.executeTask();
        assertEquals("Painting", painting.getTaskName());
    }
}
