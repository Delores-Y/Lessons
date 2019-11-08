package $_Design_Mode.Singleton;

public class StaticInnerSingleton {

    private StaticInnerSingleton() {
    }

    private static class SingletonInner {
        private static StaticInnerSingleton instance = new StaticInnerSingleton();
    }

    public static StaticInnerSingleton getInstance() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return SingletonInner.instance;
    }
}
