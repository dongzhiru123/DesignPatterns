package designpatterns.factorymethod.factory;

import designpatterns.factorymethod.leifeng.LeiFeng;
import designpatterns.factorymethod.leifeng.Undergraduate;

/**
 * 创建大学生学雷锋人士的工厂
 */
public class UndergraduateFactory implements Factory{
    @Override
    public LeiFeng createLeiFeng() {
        return new Undergraduate();
    }
}
