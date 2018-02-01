package com.pattern.demo.strategy.im;

import com.pattern.demo.strategy.IPayStrategy;

/**
 * @Auth:chenxinghua
 * @Date:2018\1\31 0031 16:29
 * @Description:微信
 */
public class WexinPayStrategy implements IPayStrategy {
    private static WexinPayStrategy wexinPayStrategy;

    private WexinPayStrategy() {
    }

    public static WexinPayStrategy getInstance() {
        if (null == wexinPayStrategy) {
            wexinPayStrategy = new WexinPayStrategy();
        }
        return wexinPayStrategy;
    }

    @Override
    public void pay() {
        System.out.println("微信支付.");
    }
}
