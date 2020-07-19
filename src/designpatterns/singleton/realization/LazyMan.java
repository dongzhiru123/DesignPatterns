package designpatterns.singleton.realization;

public class LazyMan {
//    private volatile static LazyMan lazyMan;
//    private LazyMan() {
//
//    }
//    public static LazyMan getInstance() {
//        if (lazyMan == null) {
//            synchronized (LazyMan.class){
//                if (lazyMan == null) {
//                    lazyMan = new LazyMan();
//                }
//            }
//        }
//        return lazyMan;
//    }
    private volatile static LazyMan lazyMan;
    private LazyMan() {

    }

    public static LazyMan getLazyMan() {
        if (lazyMan == null) {
            synchronized (LazyMan.class) {
                if (lazyMan == null) {
                    lazyMan = new LazyMan();
                }
            }
        }
        return lazyMan;
    }
}
