package strategy;

/**
 * Aggregate pay
 * @author zjq
 * @date 2020/3/19 15:33
 */
public interface Pay {

    public void toPay(Object... params);

    public boolean verify(Object... params);
}
