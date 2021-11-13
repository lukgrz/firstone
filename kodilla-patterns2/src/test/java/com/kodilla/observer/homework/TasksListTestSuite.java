package com.kodilla.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TasksListTestSuite {

    @Test
    public void update() {
        //Given
        Student student1 = new Student("Student 1");
        Student student2 = new Student("Student 2");
        Student student3 = new Student("Student 3");

        Mentor mentor1 = new Mentor("Mentor1");
        Mentor mentor2 = new Mentor("Mentor2");

        Task task1 = new Task("Title 1", "Link 1");
        Task task2 = new Task("Title 2", "Link 2");
        Task task3 = new Task("Title 3", "Link 3");
        Task task4 = new Task("Title 4", "Link 4");

        TaskList taskList1 = new TaskList(student1);
        TaskList taskList2 = new TaskList(student2);
        TaskList taskList3 = new TaskList(student3);

        taskList1.registerObserver(mentor1);
        taskList2.registerObserver(mentor1);
        taskList3.registerObserver(mentor2);
        //When
        taskList1.addTask(task1);
        taskList1.addTask(task2);
        taskList1.addTask(task3);
        taskList1.addTask(task4);
        taskList2.addTask(task1);
        taskList2.addTask(task2);
        taskList3.addTask(task1);
        taskList3.addTask(task4);
        taskList1.removeTask(task1);
        //Then
        assertEquals(6,mentor1.getCount());
        assertEquals(2,mentor2.getCount());
        assertEquals(3, taskList1.getTasks().size());
    }
}
