package sigleton;

/**
 * 第三种实现方式: 双重检查加锁
 */
public class Singleton3 {
    private volatile static Singleton3 uniqueInstance;

    // 构造函数私有化防止创建新实例
    private Singleton3() {
    }

    public static synchronized Singleton3 getInstance() {
        if (uniqueInstance == null) {
            // 锁住类对象而不是实例对象
            synchronized (Singleton3.class) {
                if (uniqueInstance == null) {
                    System.out.println(Singleton3.class.getSimpleName() + " 创建实例对象!");
                    uniqueInstance = new Singleton3();
                }
            }
        }
        return uniqueInstance;
    }
}
