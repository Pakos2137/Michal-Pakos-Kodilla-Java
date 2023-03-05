package com.kodilla.patterns.factory.tasks;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryDriveTask() {
        TaskFactory factory = new TaskFactory();

        Task driving = factory.makeTask(TaskFactory.DRIVING_TASK);

        assertEquals("Driving",driving.getTaskName());
        assertEquals(true,driving.isTaskExecuted());

    }
    @Test
    void testFactoryPaintTask() {
        TaskFactory factory = new TaskFactory();

        Task painting = factory.makeTask(TaskFactory.PAINTING_TASK);

        assertEquals("Painting",painting.getTaskName());
        assertEquals(true,painting.isTaskExecuted());

    }
    @Test
    void testFactoryShoppingTask() {
        TaskFactory factory = new TaskFactory();

        Task shopping = factory.makeTask(TaskFactory.SHOPPING_TASK);

        assertEquals("Shopping",shopping.getTaskName());
        assertEquals(true,shopping.isTaskExecuted());

    }
}
