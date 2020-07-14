package designpatterns.simplefactory;

public class Operation {

    private double numberA = 0;
    private double numberB = 0;

    public double getResult(double number1, double number2) {
        return 0;
    }

    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }
}
