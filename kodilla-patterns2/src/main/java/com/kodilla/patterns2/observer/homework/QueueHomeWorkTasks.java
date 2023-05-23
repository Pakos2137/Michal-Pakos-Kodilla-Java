package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class QueueHomeWorkTasks  implements ObservableHomeWork {
    private List<ObserverHomeWork> homeworkObserver;
    private List<String> mentorMessage;
    private String username;

    public QueueHomeWorkTasks(String username) {
        homeworkObserver = new ArrayList<>();
        mentorMessage = new ArrayList<>();
        this.username = username;
    }

    public List<String> getMentorMessage() {
        return mentorMessage;
    }

    public String getUsername() {
        return username;
    }
    public void addHomework(String homework){
        mentorMessage.add(homework);
        notifyObservers();
    }

    @Override
    public void registerMentor(ObserverHomeWork observerHomeWork) {
        homeworkObserver.add(observerHomeWork);
    }

    @Override
    public void notifyObservers() {
       for (ObserverHomeWork observerHomeWork : homeworkObserver) {
           observerHomeWork.update(this);
       }
    }

    @Override
    public void removeMentor(ObserverHomeWork observerHomeWork) {
        homeworkObserver.remove(homeworkObserver);
    }
}

