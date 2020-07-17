package designpatterns.decorate.decorator;

import designpatterns.decorate.person.Person;

/**
 * 所有服饰类的父类 装饰类
 */
public class Decorator extends Person {
    //传入的被装饰对象
    protected Person person;

    public void decorate(Person person) {
        this.person = person;
    }

    @Override
    public void show() {
        person.show();
    }
}
