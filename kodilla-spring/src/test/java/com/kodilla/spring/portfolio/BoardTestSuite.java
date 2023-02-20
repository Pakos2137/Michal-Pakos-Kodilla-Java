package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;


@SpringBootTest
public class BoardTestSuite {

    @Test
    void testTaskAdd() {
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        List<String> toDoTaskList = new ArrayList<>();
        toDoTaskList.add("zrobić zadanie do kodilli");

        board.getToDoList().getTasks().addAll(toDoTaskList);

        System.out.println(toDoTaskList);
    }
}
