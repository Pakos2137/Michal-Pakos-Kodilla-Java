package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    List<String> tasks;

    public List<String> getTasks() {
        return tasks;
    }
    public void setTasks(List<String> tasks) {
        this.tasks = new ArrayList<>();
    }
}
