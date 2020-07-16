package designpatterns.strategy.specialstrategy;

import designpatterns.strategy.fathercash.CashSuper;

/**
 * 不参加优惠活动的策略
 */
public class CashNormal extends CashSuper {

    public CashNormal(double consumerMoney) {
        super.consumerMoney = consumerMoney;
    }

    @Override
    public double getProperConsumption() {
        return super.consumerMoney;
    }
}
