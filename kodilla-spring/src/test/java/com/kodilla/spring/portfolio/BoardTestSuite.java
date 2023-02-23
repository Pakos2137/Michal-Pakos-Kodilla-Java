package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;


@SpringBootTest
public class BoardTestSuite {

    @Autowired
    private Board board;

    @Test
    void testTaskAdd() {
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        List<String> toDoTaskList = new ArrayList<>();

        board.getToDoList().getTasks().add("TaskToDo");

        System.out.println(toDoTaskList);
    }
}
