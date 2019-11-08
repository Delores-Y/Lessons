package $_Design_Mode.Singleton;

public class LazySingleton5 {

    private static volatile LazySingleton5 instance = null;

    private LazySingleton5() {
    }    //private 避免类在外部被实例化

    public static LazySingleton5 getInstance() {
        //getInstance 方法前加同步
        if (instance == null) {
            // 两个线程都能进入到判断null方法里面 最终还是会创建instance XXXXXXXXX
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (LazySingleton5.class) {

                // DCL双重检查锁机制解决了懒加载模式的效率问题和线程安全问题！！！！！
                if (instance == null) {
                    instance = new LazySingleton5();
                }
            }
        }
        return instance;
    }
}
