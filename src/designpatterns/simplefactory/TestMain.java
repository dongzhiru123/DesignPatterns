package designpatterns.simplefactory;

import java.util.Scanner;

/**
 * 测试方法
 */
public class TestMain {
    public static void main(String[] args) {
        while (true) {
            System.out.println("请选择你要做的操作（'+'、 '-'、 '*'、 '/'）: ");
            Scanner scanner = new Scanner(System.in);
            String operate = scanner.nextLine();
            if (!"+".equals(operate)
                    && !"-".equals(operate)
                    && !"*".equals(operate)
                    && !"/".equals(operate))
            {
                continue;
            }
            Operation operation = OperationFactory.createOperate(operate);
            System.out.println("请依次输入操作数 ： ");
            double number1 = scanner.nextDouble();
            double number2 = scanner.nextDouble();
            System.out.println("运算结果为：" + operation.getResult(number1, number2));
        }
    }
}
