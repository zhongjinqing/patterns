package strategy.apphandler;

import strategy.Pay;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author zjq
 * @date 2020/3/19 16:18
 */
public class AppHandler implements IPayhandler{

    @Override
    public String Execute(Object... params) {
        Pay pay = getPay(params[0]);
        if (pay != null) {
            pay.toPay(params);
        }else{
            System.out.println("pay channel not exist");
            return "pay channel not exist";
        }

        return "result";
    }

    private Pay getPay(Object param) {
        String payType = (String) param;
        payType = "strategy.strategys."+payType + "AppPay";
        System.out.println("create:"+payType);
        Class<?> appPayClass = null;
        Pay pay = null;
        try {
            appPayClass = Class.forName(payType);
            Constructor<?> constructor = appPayClass.getConstructor();
            pay = (Pay)constructor.newInstance();
        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            System.out.println("pay channel not exist");
        }
        return pay;
    }
}
