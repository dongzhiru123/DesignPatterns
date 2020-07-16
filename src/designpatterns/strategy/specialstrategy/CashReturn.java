package designpatterns.strategy.specialstrategy;

import designpatterns.strategy.fathercash.CashSuper;

/**
 * 满减的优惠策略
 */
public class CashReturn extends CashSuper {
    //满多少金额触发满减策略
    private double achieveMoney;
    //减多少？
    private double subMoney;

    public CashReturn(double achieveMoney, double subMoney, double consumerMoney) {
        this.achieveMoney = achieveMoney;
        this.subMoney = subMoney;
        super.consumerMoney = consumerMoney;
    }

    @Override
    public double getProperConsumption() {
        int numAchieve = 0;
        if (super.consumerMoney >= achieveMoney) {
            numAchieve = (int) (consumerMoney / achieveMoney);
        }
        return consumerMoney - numAchieve * subMoney;
    }
}
