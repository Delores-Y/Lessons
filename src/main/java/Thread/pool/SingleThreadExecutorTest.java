package Thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class SingleThreadExecutorTest {

    public static void main(String[] args) {

        ExecutorService pool = Executors.newSingleThreadExecutor();

        ExecutorService pooll = Executors.newFixedThreadPool(2);

        ExecutorService poolll=Executors.newCachedThreadPool();



        //创建实现了Runnable接口对象，Thread对象当然也实现了Runnable接口;


        Thread t1 = new MyThread();

        Thread t2 = new MyThread();

        Thread t3 = new MyThread();

        Thread t4 = new MyThread();

        Thread t5 = new MyThread();

        //将线程放到池中执行；

        pool.execute(t1);

        pool.execute(t2);

        pool.execute(t3);

        pool.execute(t4);

        pool.execute(t5);

        //关闭线程池

        pool.shutdown();


        ScheduledThreadPoolExecutor exec =new ScheduledThreadPoolExecutor(1);
        exec.scheduleAtFixedRate(new Runnable(){//每隔一段时间就触发异常

            @Override
            public void run() {
                // TODO Auto-generated method stub
                //throw new RuntimeException();
                System.out.println("===================");

            }}, 1000, 5000, TimeUnit.MILLISECONDS);

        exec.scheduleAtFixedRate(new Runnable(){//每隔一段时间打印系统时间，证明两者是互不影响的

            @Override
            public void run() {
                // TODO Auto-generated method stub
                System.out.println(System.nanoTime());

            }}, 1000, 2000, TimeUnit.MILLISECONDS);
    }
}
