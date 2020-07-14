package designpatterns.simplefactory;

/**
 * 获取操作类的工厂
 */
public class OperationFactory {
    public static Operation createOperate(String operate) {
        switch (operate) {
            case "+" :
                return new OperationAdd();
            case "-" :
                return new OperationSub();
            case "*" :
                return new OperationMul();
            case "/" :
                return new OperationDiv();
            default : return new Operation();
        }
    }
}
