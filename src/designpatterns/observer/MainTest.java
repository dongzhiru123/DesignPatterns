package designpatterns.observer;

import designpatterns.observer.observer.ConcreteObserver;
import designpatterns.observer.subject.ConcreteSubject;

public class MainTest {
    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();
        concreteSubject.setSubjectState("现在的状态");
        concreteSubject.addObserver(new ConcreteObserver("A", concreteSubject));
        concreteSubject.addObserver(new ConcreteObserver("B", concreteSubject));
        concreteSubject.addObserver(new ConcreteObserver("C", concreteSubject));

        concreteSubject.notifyObserver();
    }
}
