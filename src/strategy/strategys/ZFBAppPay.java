package strategy.strategys;

import strategy.AppPay;

/**
 * @author zjq
 * @date 2020/3/19 15:39
 */
public class ZFBAppPay extends AppPay {


    @Override
    public void toPay(Object... params) {
        System.out.println("zfb appPay");

    }

}
