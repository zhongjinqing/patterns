package singleton;

public class NotLazy {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        System.out.println(instance);
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance1);
    }
}

/**
 * 饿汉的方式；可能类加载就创建了对象，但永远用不到，造成内存浪费。
 */
//1.饿汉。静态成员的方式
class Singleton{
    //1.构造器隐藏
    private Singleton(){}
    //2.内部创建对象
    private final static Singleton instance = new Singleton();
    //3.提供获取方法
    public static Singleton getInstance(){
        return instance;
    }

}
//1.饿汉。静态代码块方式
class Singleton2{
    //1.构造器隐藏
    private Singleton2(){}
    //2.内部创建对象
    private  static Singleton2 instance;
    //4.静态代码中创建对象
    static{
        instance = new Singleton2();
    }
    //3.提供获取方法
    public static Singleton2 getInstance(){
        return instance;
    }

}