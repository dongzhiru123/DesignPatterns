package designpatterns.decorate.person;

/**
 * 要被装饰的人
 */
public class Person {
    //姓名
    private String name;

    public Person() {

    }

    public Person(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println(" 装饰的" + name);
    }
}
