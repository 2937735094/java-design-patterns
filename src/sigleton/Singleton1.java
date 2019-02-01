package sigleton;

/**
 * 第一种实现方式:
 * public static synchronized Singleton1 getInstance(){} 锁住的是类对象
 * 当大批量请求到达时,大家都卡住了(等待前面的线程完成释放锁)
 */
public class Singleton1 {
    private static Singleton1 uniqueInstance;

    // 构造函数私有化防止创建新实例
    private Singleton1() {
    }

    public static synchronized Singleton1 getInstance() {
        if (uniqueInstance == null) {
            System.out.println(Singleton1.class.getSimpleName() + " 创建实例对象!");
            uniqueInstance = new Singleton1();
        }
        return uniqueInstance;
    }
}
