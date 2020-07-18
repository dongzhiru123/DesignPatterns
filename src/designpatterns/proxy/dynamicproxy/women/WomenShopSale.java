package designpatterns.proxy.dynamicproxy.women;

public class WomenShopSale implements SaleWomenShop{
    @Override
    public void saleWomenShop(float height) {
        System.out.println("定制一个高 ：" + height + "男性模特!");
    }

    @Override
    public void getWomeShop() {
        System.out.println("我在getWomeShop方法中！");
    }
}
