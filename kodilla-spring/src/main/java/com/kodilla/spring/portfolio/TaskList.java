package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    List<String> tasks;

    public List<String> getTasks() {
        return tasks;
    }
   TaskList() {
        tasks = new ArrayList<>();
   }
}
