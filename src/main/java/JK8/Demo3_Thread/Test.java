package JK8.Demo3_Thread;

public class Test {

    public static void main(String[] args) {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello Heylee");
            }
        });

        Thread thread2 = new Thread(() -> System.out.println("Hello Heylee"));

        thread.start();
        thread2.start();
    }
}
