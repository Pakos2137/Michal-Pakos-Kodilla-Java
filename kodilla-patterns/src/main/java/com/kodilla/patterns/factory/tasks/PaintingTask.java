package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task{
    private final String taskName;
    private final String color;
    private final String  whatToPaint;
    PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public String executeTask() {
        return "Painting was Executed";
    }

    @Override
    public String getTaskName() {
        return "Painting";
    }

    @Override
    public boolean isTaskExecuted() {
        return true;
    }
}
