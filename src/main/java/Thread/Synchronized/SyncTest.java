package Thread.Synchronized;

public class SyncTest {

    public static void main(String[] args) {
        SyncThread syncThread = new SyncThread();
        // 对于同一对象
        Thread A_thread1 = new Thread(syncThread, "A_thread1");
        Thread A_thread2 = new Thread(syncThread, "A_thread2");
        Thread B_thread1 = new Thread(syncThread, "B_thread1");
        Thread B_thread2 = new Thread(syncThread, "B_thread2");
        Thread C_thread1 = new Thread(syncThread, "C_thread1");
        Thread C_thread2 = new Thread(syncThread, "C_thread2");

//        A_thread1.start();
//        A_thread2.start();

        B_thread1.start();
        B_thread2.start();
//
//        C_thread1.start();
//        C_thread2.start();
    }
}
