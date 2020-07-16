package designpatterns.strategy;

import designpatterns.strategy.realization.CashContext;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 * 测试类
 */
public class TestMain {
    public static void main(String[] args) {
        CashContext cashContext;
        double consumerMoney;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("优惠策略 ？（正常消费、8折消费、满300减100）,消费的金额为 ？");
            String[] preferentialStrategy = scanner.nextLine().split(" ");
            cashContext = new CashContext(preferentialStrategy[0], Double.valueOf(preferentialStrategy[1]));
            System.out.println(cashContext.getResult());
        }
    }
}
