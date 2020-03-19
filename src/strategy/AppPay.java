package strategy;

/**
 * @author zjq
 * @date 2020/3/19 15:50
 */
public abstract class AppPay implements Pay{

    @Override
    public boolean verify(Object... params) {
        return params.length != 0;
    }
}
