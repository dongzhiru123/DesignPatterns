package designpatterns.singleton.realization;
//静态内部类
public class StaticClass {
    private static class GetInstance{
        private static StaticClass staticClass = new StaticClass();
    }
    private StaticClass() {

    }
    public static StaticClass getInstance() {
        return GetInstance.staticClass;
    }
}
