package $_Design_Mode.Singleton;

public class LazySingleton3 {

    private static volatile LazySingleton3 instance = null;

    private LazySingleton3() {
    }    //private 避免类在外部被实例化

    public static LazySingleton3 getInstance() {
        //getInstance 方法前加同步
        if (instance == null) {
            synchronized (LazySingleton3.class) {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                instance = new LazySingleton3();
            }
        }
        return instance;
    }
}
