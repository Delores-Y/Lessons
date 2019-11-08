package $_Design_Mode.Singleton;

public class Test {

    public static void main(String[] args) {

//        LazySingleton1 instance = new LazySingleton1();

        LazySingleton1 instance = LazySingleton1.getInstance();
        HungrySingleton hungrySingleton = HungrySingleton.getInstance();

    }
}
