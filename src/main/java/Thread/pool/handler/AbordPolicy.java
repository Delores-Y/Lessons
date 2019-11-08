package Thread.pool.handler;


import java.util.concurrent.*;

public class AbordPolicy {

    private static class Worker implements Runnable {

        public void run() {

            System.out.println(Thread.currentThread().getName() + " is running");

        }

    }


    @SuppressWarnings("Duplicates")
    public static void main(String[] args) {

        int corePoolSize = 5;

        int maxPoolSize = 10;

        long keepAliveTime = 5;

        BlockingQueue<Runnable> queue = new LinkedBlockingQueue<Runnable>(10);

        //拒绝策略1：将抛出 RejectedExecutionException.

        RejectedExecutionHandler handler =

                new ThreadPoolExecutor.AbortPolicy();

//                //
//                new ThreadPoolExecutor.CallerRunsPolicy();

        ThreadPoolExecutor executor = new ThreadPoolExecutor

                (corePoolSize, maxPoolSize,

                        keepAliveTime, TimeUnit.SECONDS,

                        queue, handler);

        for (int i = 0; i < 100; i++) {
            final int index = i;

            executor.submit(new Thread(() -> {
                System.out.println("Task " + index + " " + Thread.currentThread().getName()+" begin run");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Task " + index + " " + Thread.currentThread().getName()+" finish run");
            }));

        }

        executor.shutdown();

    }
}
