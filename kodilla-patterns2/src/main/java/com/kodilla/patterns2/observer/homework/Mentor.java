package com.kodilla.patterns2.observer.homework;

public class Mentor implements ObserverHomeWork{

    private final String username;
    private int count;

    public Mentor(String username) {
        this.username = username;
    }

    @Override
    public void update(QueueHomeWorkTasks queueHomeWorkTasks) {
        System.out.println("New Homework : " + queueHomeWorkTasks.getUsername() + '\n');
        System.out.println("Total Homeworks : " + queueHomeWorkTasks.getMentorMessage().size());
        count++;
    }

    public String getUsername() {
        return username;
    }

    public int getCount() {
        return count;
    }
}
