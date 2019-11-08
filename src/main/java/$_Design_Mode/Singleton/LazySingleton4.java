package $_Design_Mode.Singleton;

public class LazySingleton4 {

    private static volatile LazySingleton4 instance = null;

    private LazySingleton4() {
    }    //private 避免类在外部被实例化

    public static LazySingleton4 getInstance() {
        //getInstance 方法前加同步
        if (instance == null) {
            // 两个线程都能进入到判断null方法里面 最终还是会创建instance
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (LazySingleton4.class) {

                instance = new LazySingleton4();
            }
        }
        return instance;
    }
}
