package designpatterns.proxy.staticproxy;

public class FactoryTest implements Sale {
    @Override
    public void saleSomeThing(String size) {
        System.out.println("出售一个尺寸为 ：" + size + "的产品！");
    }
}
