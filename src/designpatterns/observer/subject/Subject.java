package designpatterns.observer.subject;

import designpatterns.observer.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象通知者。
 */
public abstract class Subject {

    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.Update();
        }
    }
}
