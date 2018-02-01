package com.pattern.demo.strategy.im;

import com.pattern.demo.strategy.IPayStrategy;

/**
 * @Auth:chenxinghua
 * @Date:2018\1\31 0031 16:29
 * @Description:支付宝
 */
public class AliPayStrategy implements IPayStrategy {
    private static AliPayStrategy aliPayStrategy;

    private AliPayStrategy() {
    }

    public static AliPayStrategy getInstance() {
        if (null == aliPayStrategy) {
            aliPayStrategy = new AliPayStrategy();
        }
        return aliPayStrategy;
    }

    @Override
    public void pay() {
        System.out.println("支付宝支付.");
    }
}
