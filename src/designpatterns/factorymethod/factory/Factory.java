package designpatterns.factorymethod.factory;

import designpatterns.factorymethod.leifeng.LeiFeng;

/**
 * 工厂的接口，具体工厂去实现该接口
 */
public interface Factory {
    LeiFeng createLeiFeng();
}
