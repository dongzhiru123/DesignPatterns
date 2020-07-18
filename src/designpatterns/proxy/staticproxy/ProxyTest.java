package designpatterns.proxy.staticproxy;

public class ProxyTest implements Sale {
    private FactoryTest factoryTest;

    public ProxyTest(FactoryTest factoryTest) {
        this.factoryTest = factoryTest;
    }

    @Override
    public void saleSomeThing(String size) {
        beforeSale();
        factoryTest.saleSomeThing(size);
        afterSale();
    }

    private void beforeSale() {
        System.out.println("为您做好调研！");
    }
    private void afterSale() {
        System.out.println("为您完成一条龙服务!");
    }
}
