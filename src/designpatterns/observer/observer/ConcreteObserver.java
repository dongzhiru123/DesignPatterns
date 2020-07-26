package designpatterns.observer.observer;

import designpatterns.observer.subject.ConcreteSubject;

/**
 * 具体观察者。
 */
public class ConcreteObserver extends Observer{
    private String name;
    private String nowState = "初始状态";
    private ConcreteSubject subjectubject;

    public ConcreteObserver(String name, ConcreteSubject subjectubject) {
        this.name = name;
        this.subjectubject = subjectubject;
    }

    @Override
    public void Update() {
        System.out.printf(" 被观察者 %s, 收到通知, 从状态 %s 变为 %s", name, nowState, subjectubject.getSubjectState());
        System.out.println();
        nowState = subjectubject.getSubjectState();
    }
}
