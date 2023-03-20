package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;

    private static final String DESCRIPTION = "Test";

    @Test
    void testFindByListName() {
        TaskList taskList = new TaskList("Lista1",DESCRIPTION);
        taskListDao.save(taskList);
        String listName = taskList.getListName();

        List<TaskList> readTaskList = taskListDao.findByListName(listName);

        assertEquals(listName,"Lista1");

        int id = readTaskList.get(0).getId();
        taskListDao.deleteById(id);
    }
}
