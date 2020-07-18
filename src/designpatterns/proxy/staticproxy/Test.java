package designpatterns.proxy.staticproxy;

public class Test {
    public static void main(String[] args) {
        FactoryTest factoryTest = new FactoryTest();
        ProxyTest proxyTest = new ProxyTest(factoryTest);
        proxyTest.saleSomeThing("D");
    }
}
