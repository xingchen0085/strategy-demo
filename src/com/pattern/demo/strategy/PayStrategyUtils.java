package com.pattern.demo.strategy;

/**
 * @Auth:chenxinghua
 * @Date:2018\1\31 0031 17:16
 * @Description:负责创建各个策略对象
 */
public class PayStrategyUtils {

    //静态代码块
    public static IPayStrategy getPayStrategy(String payType) {
        try {
            String path = "com.pattern.demo.strategy.im." + payType.concat("PayStrategy");

            Class<?> clazz = Class.forName(path);
            IPayStrategy instance = (IPayStrategy) clazz.getDeclaredMethod("getInstance").invoke(null, null);
            return instance;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Load [" + payType.concat("Strategy") + "] Error :", e);
        }
    }
}
