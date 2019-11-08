package Thread.pool;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.*;

public class ThreadFactoryTest {

    public static void main(String[] args) {

        ThreadFactory namedThreadFactory = new ThreadFactoryBuilder().setDaemon(true).setNameFormat("demo-pool-%d").build();

        ExecutorService pool = new ThreadPoolExecutor(
                5,
                200,
                0L,
                TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>(1024),
                namedThreadFactory,
                new ThreadPoolExecutor.CallerRunsPolicy());

        for (int i = 0; i < 100; i++) {
            pool.execute(() -> {
                //todo 此处写业务
                System.out.println(Thread.currentThread().getName()+"正在执行....");
            });
        }

        pool.shutdown();
    }
}
