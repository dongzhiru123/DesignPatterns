package designpatterns.singleton;

import designpatterns.singleton.realization.LazyMan;

public class TestMain {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                LazyMan lazyMan = LazyMan.getLazyMan();
                System.out.println(lazyMan.hashCode());
            }).start();
        }
    }
}
