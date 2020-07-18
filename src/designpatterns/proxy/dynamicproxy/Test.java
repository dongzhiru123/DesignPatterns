package designpatterns.proxy.dynamicproxy;


import designpatterns.proxy.dynamicproxy.man.FactoryTest;
import designpatterns.proxy.dynamicproxy.man.Sale;
import designpatterns.proxy.dynamicproxy.women.SaleWomenShop;
import designpatterns.proxy.dynamicproxy.women.WomenShopSale;

public class Test {
    public static void main(String[] args) {
        //代理
        ProxyTest proxyTest = new ProxyTest();
        //男性
        Sale factoryTest = new FactoryTest();
        proxyTest.setFactoryTest(factoryTest);
        Sale proxyInstance = (Sale) proxyTest.getProxyInstance();
        proxyInstance.saleSomeThing("D");
        //女性
        SaleWomenShop womenShopSale = new WomenShopSale();
        proxyTest.setFactoryTest(womenShopSale);
        SaleWomenShop saleWomenShop = (SaleWomenShop) proxyTest.getProxyInstance();
        saleWomenShop.saleWomenShop(172f);
    }
}
