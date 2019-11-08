package $_Design_Mode.Singleton;

public class LazySingleton2 {

    private static volatile LazySingleton2 instance = null;

    private LazySingleton2() {
    }    //private 避免类在外部被实例化

    public static synchronized LazySingleton2 getInstance() {
        //getInstance 方法前加同步
        if (instance == null) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            instance = new LazySingleton2();
        }
        return instance;
    }
}
