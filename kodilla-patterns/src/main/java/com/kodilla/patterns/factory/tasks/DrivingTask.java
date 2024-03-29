package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {
    private final String taskName;
    private final String where;
    private final String using;
    DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public String executeTask() {
        return "Driving was Executed";
    }
    @Override
    public String getTaskName() {
        return "Driving";
    }

    @Override
    public boolean isTaskExecuted() {
        return true;
    }
}
