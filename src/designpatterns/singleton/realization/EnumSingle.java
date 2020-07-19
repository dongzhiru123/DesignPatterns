package designpatterns.singleton.realization;
//避免反射
public enum  EnumSingle {
    instance;
    public static EnumSingle getInstance() {
        return instance;
    }
}
