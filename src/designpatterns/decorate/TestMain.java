package designpatterns.decorate;

import designpatterns.decorate.decorator.ConcreteDecorator;
import designpatterns.decorate.person.Person;

/**
 * 主函数
 */
public class TestMain {
    public static void main(String[] args) {
        Person person = new Person("小明");

        ConcreteDecorator concreteDecorator = new ConcreteDecorator();
        //具体装饰内容
        ConcreteDecorator.TShirts tShirts = concreteDecorator.new TShirts();
        ConcreteDecorator.Jeans jeans = concreteDecorator.new Jeans();
        ConcreteDecorator.Vest vest = concreteDecorator.new Vest();
        //进行装饰
        tShirts.decorate(person);
        jeans.decorate(tShirts);
        vest.decorate(jeans);

        vest.show();
    }
}
