package com.pattern.demo.strategy.im;

import com.pattern.demo.strategy.IPayStrategy;

/**
 * @Auth:chenxinghua
 * @Date:2018\1\31 0031 16:30
 * @Description:银联
 */
public class EBankPayStrategy implements IPayStrategy{

    private static EBankPayStrategy eBankPayStrategy;

    private EBankPayStrategy() {
    }

    public static EBankPayStrategy getInstance() {
        if (null == eBankPayStrategy) {
            eBankPayStrategy = new EBankPayStrategy();
        }
        return eBankPayStrategy;
    }

    @Override
    public void pay() {
        System.out.println("银联支付.");
    }
}
