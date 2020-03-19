package strategy.strategys;

import strategy.AppPay;

/**
 * @author zjq
 * @date 2020/3/19 16:35
 */
public class WFTAppPay extends AppPay {
    @Override
    public void toPay(Object... params) {
        System.out.println("wft appPay");
    }
}
