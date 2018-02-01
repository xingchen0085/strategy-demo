package com.pattern.demo.strategy.test;

import com.pattern.demo.strategy.IPayStrategy;
import com.pattern.demo.strategy.PayStrategyContext;
import com.pattern.demo.strategy.PayStrategyUtils;
import com.pattern.demo.strategy.im.AliPayStrategy;
import com.pattern.demo.strategy.im.EBankPayStrategy;
import com.pattern.demo.strategy.im.WexinPayStrategy;

/**
 * @Auth:chenxinghua
 * @Date:2018\1\31 0031 16:32
 * @Description:
 */
public class MainTest {
    public static void main(String[] args) {
        //执行上下文
        PayStrategyContext payStrategyContext = new PayStrategyContext();
        IPayStrategy payStrategy = null;
        //1.1支付宝支付
//        payStrategy = new AliPayStrategy();
//        payStrategyContext.setPayStrategy(payStrategy);
//        payStrategyContext.excutePay();
//
//        //1.2微信支付
//        payStrategy = new WexinPayStrategy();
//        payStrategyContext.setPayStrategy(payStrategy);
//        payStrategyContext.excutePay();
//
//        //1.3银联支付
//        payStrategy = new EBankPayStrategy();
//        payStrategyContext.setPayStrategy(payStrategy);
//        payStrategyContext.excutePay();


//        1.1支付宝支付
        payStrategy = PayStrategyUtils.getPayStrategy("Ali");
        payStrategyContext.setPayStrategy(payStrategy);
        payStrategyContext.excutePay();

//        1.2微信支付
        payStrategy = PayStrategyUtils.getPayStrategy("Wexin");
        payStrategyContext.setPayStrategy(payStrategy);
        payStrategyContext.excutePay();

//        1.3银联支付
        payStrategy = PayStrategyUtils.getPayStrategy("EBank");
        payStrategyContext.setPayStrategy(payStrategy);
        payStrategyContext.excutePay();
    }
}
