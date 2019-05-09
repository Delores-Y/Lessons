package Thread.reentrantLock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTest {

    static class NumberWrapper {
        public int value = 1;
    }

    public static void main(String[] args) {
        // 初始化可重入锁
        final Lock lock = new ReentrantLock();

        // 第一个条件当屏幕上输出到3
        final Condition reachThreeCondition = lock.newCondition();
        // 第二个条件当屏幕上输出到6
        final Condition reachSixCondition = lock.newCondition();

        // NumberWrapper只是为了封装一个数字，一边可以将数字对象共享，并可以设置为final
        // 注意这里不要用Integer, Integer 是不可变对象
        final NumberWrapper num = new NumberWrapper();

        // 初始化A线程
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("threadA start");
                // 需要先获得锁
                lock.lock();

                if (num.value > -1) {
                    num.value++;
                    System.out.println("hi pretty");
                }


//                try {
//                    Thread.sleep(5);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }


                try {
                    System.out.println("threadA start write");
                    // A线程先输出前3个数
                    while (num.value <= 3) {
                        System.out.println(num.value);
                        num.value++;
                    }
                    // 输出到3时要signal，告诉B线程可以开始了
                    reachThreeCondition.signal();
                    System.out.println("signal three condition");
                } finally {
                    lock.unlock();
                }

                lock.lock();
                try {
                    // 等待输出6的条件
                    System.out.println("before six await");
                    reachSixCondition.await();
                    System.out.println("after six await");
                    System.out.println("threadA start write");
                    // 输出剩余数字
                    while (num.value <= 9) {
                        System.out.println(num.value);
                        num.value++;
                    }

                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        });

        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                while (num.value <= 3) {
                    System.out.println("threadB start");
                }
                lock.lock();
                try {

//                    System.out.println("*********** before three await");
//                    reachThreeCondition.await();
//                    System.out.println("*********** after three await");

                    while (num.value <= 3) {
                        // 等待3输出完毕的信号
                        System.out.println("************** before three await");
                        reachThreeCondition.await();
                        System.out.println("************** after three await");
                    }

                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }

                try {
                    lock.lock();
                    // 已经收到信号，开始输出4，5，6
                    System.out.println("threadB start write");
                    while (num.value <= 6) {
                        System.out.println(num.value);
                        num.value++;
                    }
                    // 4，5，6输出完毕，告诉A线程6输出完了
                    reachSixCondition.signal();
                    System.out.println("signal six condition");
                } finally {
                    lock.unlock();
                }
            }
        });

        threadA.start();
        threadB.start();


    }
}
