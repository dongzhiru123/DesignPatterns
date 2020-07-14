package designpatterns.simplefactory;

public class OperationSub extends Operation {
    @Override
    public double getResult(double number1, double number2) {
        return number1 - number2;
    }
}
