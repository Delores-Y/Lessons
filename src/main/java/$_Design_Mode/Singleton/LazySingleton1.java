package $_Design_Mode.Singleton;

public class LazySingleton1 {

    private static LazySingleton1 instance = null;

    private LazySingleton1() {
    }    //private 避免类在外部被实例化

    public static LazySingleton1 getInstance() {
        //getInstance 方法前加同步
        if (instance == null) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            instance = new LazySingleton1();
        }
        return instance;
    }
}
