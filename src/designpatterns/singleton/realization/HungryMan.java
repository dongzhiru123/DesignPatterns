package designpatterns.singleton.realization;

public class HungryMan {
    private static HungryMan hungryMan = new HungryMan();
    private HungryMan() {

    }
    public static HungryMan getInstance() {
        return hungryMan;
    }
}
