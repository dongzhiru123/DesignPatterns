package designpatterns.singleton.realization;

import java.io.ObjectStreamException;

//序列化与反序列化
public class Serializable implements java.io.Serializable {
    private static class MyObject{
        private static Serializable serializable = new Serializable();
    }
    private Serializable() {

    }
    public static Serializable getInstance() {
        return MyObject.serializable;
    }
    protected Object readResolve() throws ObjectStreamException{
        return MyObject.serializable;
    }
}
