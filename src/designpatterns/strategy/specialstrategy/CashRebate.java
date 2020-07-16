package designpatterns.strategy.specialstrategy;

import designpatterns.strategy.fathercash.CashSuper;

/**
 * 打折的优惠策略
 */
public class CashRebate extends CashSuper {
    //打折的折扣
    private double rebate;

    public CashRebate(double rebate, double consumerMoney) {
        this.rebate = rebate;
        super.consumerMoney = consumerMoney;
    }

    @Override
    public double getProperConsumption() {
        return super.consumerMoney * rebate;
    }
}
