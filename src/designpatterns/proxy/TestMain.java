package designpatterns.proxy;

import designpatterns.proxy.staticproxy.FactoryTest;
import designpatterns.proxy.staticproxy.ProxyTest;

public class TestMain {
    public static void main(String[] args) {
        FactoryTest factoryTest = new FactoryTest();
        ProxyTest proxyTest = new ProxyTest(factoryTest);
        proxyTest.saleSomeThing("D");
    }
}
