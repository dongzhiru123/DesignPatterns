package designpatterns.strategy.realization;

import designpatterns.strategy.fathercash.CashSuper;
import designpatterns.strategy.specialstrategy.CashNormal;
import designpatterns.strategy.specialstrategy.CashRebate;
import designpatterns.strategy.specialstrategy.CashReturn;

/**
 * 用来统一操作优惠策略
 */
public class CashContext {
    //传入优惠策略
    private CashSuper cashSuper;

    public CashContext(String preferentialStrategy, double consumerMoney) {
        switch (preferentialStrategy) {
            case "正常消费" :
                cashSuper = new CashNormal(consumerMoney);
                break;
            case "8折消费" :
                cashSuper = new CashRebate(0.8, consumerMoney);
                break;
            case "满300减100" :
                cashSuper = new CashReturn(300, 100, consumerMoney);
                break;
            default:
                cashSuper = new CashNormal(consumerMoney);
                break;
        }
    }

    public double getResult() {
        return cashSuper.getProperConsumption();
    }
}
