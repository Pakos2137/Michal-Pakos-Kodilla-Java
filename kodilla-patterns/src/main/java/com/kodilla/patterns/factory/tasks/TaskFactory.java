package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String DRIVING_TASK = "DRIVING_TASK";
    public static final String PAINTING_TASK = "PAINTING_TASK";
    public static final String SHOPPING_TASK = "SHOPPING_TASK";

    public final Task makeTask(final String TaskClass) {
        return switch (TaskClass) {
            case DRIVING_TASK -> new DrivingTask("Drive","To Work","Car");
            case PAINTING_TASK -> new PaintingTask("Paint","Grey","Image");
            case SHOPPING_TASK -> new ShoppingTask("Buy","Food",10);
            default -> null;
        };
    }
}
