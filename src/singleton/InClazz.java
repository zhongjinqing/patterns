package singleton;

public class InClazz {
}

/**
 * 静态内部类方式懒加载
 */
class Singleton7{

    private Singleton7(){}

    /**
     * 外部类的加载不会导致内部类的加载
     */
    private static class SingletonInClass{
        private static Singleton7 singleton7 = new Singleton7();
    }

    /**
     * 用到了内部类导致内部类加载创建了对象。内部类的加载线程安全
     * @return
     */
    public static Singleton7 getInstance(){
        return SingletonInClass.singleton7;
    }
}
