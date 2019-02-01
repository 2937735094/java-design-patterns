package sigleton;

/**
 * 第二种实现方式: 急切
 */
public class Singleton2 {
    // 静态初始化保证了线程安全
    private static Singleton2 uniqueInstance = new Singleton2();

    // 构造函数私有化防止创建新实例
    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        return uniqueInstance;
    }
}
