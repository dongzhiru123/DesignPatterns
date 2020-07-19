package designpatterns.singleton.realization;

public class StaticCodeBlock {
    private static StaticCodeBlock staticCodeBlock = null;
    static {
        System.out.println("静态代码块！！！");
        staticCodeBlock = new StaticCodeBlock();
    }
    private StaticCodeBlock() {
        System.out.println("私有构造方法");
    }

    public static StaticCodeBlock getStaticCodeBlock() {
        System.out.println("拿到实例");
        return staticCodeBlock;
    }

    public static void main(String[] args) {
        getStaticCodeBlock();
    }
}
