package designpatterns.factorymethod.factory;

import designpatterns.factorymethod.leifeng.LeiFeng;
import designpatterns.factorymethod.leifeng.Volunteer;

/**
 * 创建社会人士学雷锋者的工厂
 */
public class VolunteerFactory implements Factory{
    @Override
    public LeiFeng createLeiFeng() {
        return new Volunteer();
    }
}
