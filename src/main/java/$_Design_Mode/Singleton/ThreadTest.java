package $_Design_Mode.Singleton;

public class ThreadTest {

    public static void main(String[] args) {

        DemoThread[] threads = new DemoThread[10];

        for (DemoThread thread: threads) {
            thread = new DemoThread();
            thread.start();
        }

    }
}

class DemoThread extends Thread {
    @Override
    public void run() {
//        System.out.println(HungrySingleton.getInstance().hashCode());
//        782551294
//        782551294
//        782551294
//        782551294
//        782551294
//        782551294
//        782551294
//        782551294
//        782551294
//        782551294
//        HungerSingleton instance 在类加载额时候就已经产生了 线程安全


//        System.out.println(LazySingleton1.getInstance().hashCode());
//        148855203
//        1764629672
//        1823766773
//        7051476
//        1632313370
//        1495464538
//        1855910453
//        764250227
//        141560443
//        1632313370
//        LazySingleton1 instance 在多线程下会出现问题

//        System.out.println(LazySingleton2.getInstance().hashCode());
//        620459277
//        620459277
//        620459277
//        620459277
//        620459277
//        620459277
//        620459277
//        620459277
//        620459277
//        620459277
//        LazySingleton2 加入 在getInstance()加锁 效率太低

//        System.out.println(LazySingleton3.getInstance().hashCode());
//        1837859564
//        1287741756
//        1772848056
//        1824843025
//        1855910453
//        141560443
//        491374641
//        790555439
//        2070526052
//        1458743678
//        LazySingleton3 给方法内部代码枷锁 效率依然太低

//        System.out.println(LazySingleton4.getInstance().hashCode());
//        246857949
//        1789676478
//        377433899
//        378778546
//        197461654
//        1575346308
//        1745028020
//        1950507483
//        2063187041
//        859900583
//        LazySingleton4 给创建实例的代码枷锁 但是两个线程都会进入到判断instance if null or not 方法里 最终还是会创建不同的instance

//        System.out.println(LazySingleton5.getInstance().hashCode());
        System.out.println(StaticInnerSingleton.getInstance().hashCode());

    }
}