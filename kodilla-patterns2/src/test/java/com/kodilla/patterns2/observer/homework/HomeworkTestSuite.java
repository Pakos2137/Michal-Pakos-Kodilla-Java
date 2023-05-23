package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeworkTestSuite {
    @Test
    public void TasksQueueTest() {

        QueueHomeWorkTasks student1 = new Student1();
        QueueHomeWorkTasks student2 = new Student2();
        QueueHomeWorkTasks student3 = new Student3();

        Mentor mentor1 = new Mentor("Karol");
        Mentor mentor2 =new Mentor("Piotr");

        student1.registerMentor(mentor1);
        student2.registerMentor(mentor1);
        student3.registerMentor(mentor2);

        student1.addHomework("Test Task");
        student2.addHomework("Test Task");
        student3.addHomework("Test Task");
        student1.addHomework("Test Task");
        student1.addHomework("Test Task");
        student3.addHomework("Test Task");

        assertEquals(4,mentor1.getCount());
        assertEquals(2,mentor2.getCount());

    }
}
