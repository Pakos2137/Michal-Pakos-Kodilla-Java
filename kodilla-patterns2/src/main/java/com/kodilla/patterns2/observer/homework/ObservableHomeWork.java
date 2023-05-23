package com.kodilla.patterns2.observer.homework;

public interface ObservableHomeWork {

    void registerMentor(ObserverHomeWork observerHomeWork);
    void notifyObservers();
    void removeMentor(ObserverHomeWork observerHomeWork);

}