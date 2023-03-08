package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BoardTestSuite {

    @Autowired
    private Board board;

    @Test
    void testTaskAdd() {
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        board.getToDoList().getTasks().add("Task To Do");
        System.out.println(board.getToDoList().getTasks());

        board.getInProgressList().getTasks().add("In Progress Task");
        System.out.println(board.getInProgressList().getTasks());

        board.getDoneList().getTasks().add("Done Tasks");
        System.out.println(board.getDoneList().getTasks());

        assertEquals("Task To Do",board.getToDoList().getTasks().get(0));
        assertEquals("In Progress Task",board.getInProgressList().getTasks().get(0));
        assertEquals("Done Tasks",board.getDoneList().getTasks().get(0));
    }
}