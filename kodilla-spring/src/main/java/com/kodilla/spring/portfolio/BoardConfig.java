package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {
    private TaskList toDoList;
    private TaskList inProgressList;
    private TaskList doneList;

    @Bean
    Board crateBoard() {
        return new Board(createToDoList(), createInProgressList(), createDoneList());
    }
    @Bean(name = "taskToDo")
    @Scope("prototype")
    TaskList createToDoList() {
        return new TaskList();
    }
    @Bean(name = "taskInProgress")
    @Scope("prototype")
    TaskList createInProgressList() {
        return new TaskList();
    }
    @Bean(name = "taskDone")
    @Scope("prototype")
    TaskList createDoneList() {
        return new TaskList();
    }
}