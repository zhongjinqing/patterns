package singleton;
/**
 * 懒汉方式；
 */
public class Lazy {

}
//1.线程不安全
class Singleton3{

    private Singleton3(){}

    private static Singleton3 singleton3;

    public static Singleton3 getInstance(){
        if (singleton3 == null){
            singleton3 = new Singleton3();
        }
        return singleton3;
    }
}
//2.同步方法的线程安全问题
class Singleton4{

    private Singleton4(){}

    private static Singleton4 singleton4;
    //导致获取的效率变低
    public static synchronized Singleton4 getInstance(){
        if (singleton4 == null){
            singleton4 = new Singleton4();
        }
        return singleton4;
    }
}
//3.同步代码块，不能解决线程安全问题
class Singleton5 {

    private Singleton5() {
    }

    private static Singleton5 singleton5;

    public static Singleton5 getInstance() {

        //不能解决线程安全问题
        if (singleton5 == null) {
            synchronized (Singleton5.class) {
                singleton5 = new Singleton5();
            }
        }
        return singleton5;
    }
}
//3.两层检查解决线程安全问题
class Singleton6 {

    private Singleton6() {
    }

    private static volatile Singleton6 singleton6;

    public static Singleton6 getInstance() {

        //不能解决线程安全问题
        if (singleton6 == null) {//解决懒加载问题
            synchronized (singleton.Singleton5.class) {
                if (singleton6 == null) {//解决线程安全问题
                    singleton6 = new Singleton6();
                }
            }
        }
        return singleton6;
    }
}
