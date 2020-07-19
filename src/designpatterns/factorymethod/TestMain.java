package designpatterns.factorymethod;

import designpatterns.factorymethod.factory.UndergraduateFactory;
import designpatterns.factorymethod.leifeng.LeiFeng;
import designpatterns.factorymethod.leifeng.Undergraduate;

/**
 * 测试主方法
 */
public class TestMain {
    public static void main(String[] args) {
        //从大学生学雷锋人士工厂拿到俩个学雷锋的大学生
        UndergraduateFactory undergraduateFactory = new UndergraduateFactory();

        LeiFeng undergraduate1 = undergraduateFactory.createLeiFeng();
        LeiFeng undergraduate2 = undergraduateFactory.createLeiFeng();

        undergraduate1.wash();
        undergraduate2.sweep();
    }
}
