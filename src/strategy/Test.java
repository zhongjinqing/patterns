package strategy;

import strategy.apphandler.AppHandler;
import strategy.apphandler.IPayhandler;

/**
 * @author zjq
 * @date 2020/3/19 15:44
 */
public class Test {

    public static void main(String[] args) {
        IPayhandler appHandler = new AppHandler();
        appHandler.Execute("ZFB", "");
        appHandler.Execute("WFT", "");
    }

}
