package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task{
    private final String taskName;
    private final String whatToBuy;
    private final double quantity;

    ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public String executeTask() {
        return "Shopping was Executed";
    }

    @Override
    public String getTaskName() {
        return "Shopping";
    }

    @Override
    public boolean isTaskExecuted() {
        return true;
    }
}
