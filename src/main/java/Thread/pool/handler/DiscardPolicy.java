package Thread.pool.handler;

import java.util.concurrent.*;

public class DiscardPolicy {

    public static void main(String[] args) {

        int corePoolSize = 5;

        int maxPoolSize = 5;

        long keepAliveTime = 5;

        BlockingQueue<Runnable> queue = new LinkedBlockingQueue<Runnable>(5);

        //拒绝策略1：将抛出 RejectedExecutionException.

        RejectedExecutionHandler handler =

//                new ThreadPoolExecutor.DiscardPolicy();
                new ThreadPoolExecutor.DiscardOldestPolicy();

        ThreadPoolExecutor executor = new ThreadPoolExecutor

                (corePoolSize, maxPoolSize,

                        keepAliveTime, TimeUnit.SECONDS,

                        queue, handler);
        for (int i = 0; i < 100; i++) {
            final int index = i;

            executor.submit(new Thread(() -> {
                System.out.println("Task " + index + " " + Thread.currentThread().getName()+" begin run");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Task " + index + " " + Thread.currentThread().getName()+" finish run");
            }));

        }

        executor.shutdown();
    }
}
