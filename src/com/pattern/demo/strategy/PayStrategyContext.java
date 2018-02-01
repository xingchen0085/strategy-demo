package com.pattern.demo.strategy;

/**
 * @Auth:chenxinghua
 * @Date:2018\1\31 0031 16:28
 * @Description:
 */
public class PayStrategyContext {

    private IPayStrategy payStrategy;

    public PayStrategyContext() {
    }

    /**
     * 执行支付
     */
    public void excutePay() {
        if (null == payStrategy) {
            throw new RuntimeException("支付策略未配置");
        }
        payStrategy.pay();
    }


    public IPayStrategy getPayStrategy() {
        return payStrategy;
    }

    public void setPayStrategy(IPayStrategy payStrategy) {
        this.payStrategy = payStrategy;
    }
}
