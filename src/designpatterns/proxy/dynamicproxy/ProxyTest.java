package designpatterns.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyTest implements InvocationHandler {
    private Object factoryTest;

    public Object getFactoryTest() {
        return factoryTest;
    }

    public void setFactoryTest(Object factoryTest) {
        this.factoryTest = factoryTest;
    }

    private void beforeSale() {
        System.out.println("为您做好调研！");
    }
    private void afterSale() {
        System.out.println("为您完成一条龙服务!");
    }

    public Object getProxyInstance() {
        return Proxy.newProxyInstance(factoryTest.getClass().getClassLoader(), factoryTest.getClass().getInterfaces(), this::invoke);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        beforeSale();
        Object result = method.invoke(factoryTest, args);
        afterSale();
        return result;
    }
}
