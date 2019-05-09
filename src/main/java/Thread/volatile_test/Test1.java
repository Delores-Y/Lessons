package Thread.volatile_test;

public class Test1 {

//    public int inc = 0;
    public volatile int inc = 0;

    public void increase() {
        inc++;
    }

    public static void main(String[] args) {
        final Test1 test = new Test1();
        for(int i=0;i<10;i++){
            new Thread(){
                public void run() {
                    for(int j=0;j<1000;j++) {
                        test.increase();
//                        System.out.println(test.inc);
                    }
                };
            }.start();
        }

        System.out.println(Thread.currentThread().getName());
        while(Thread.activeCount()>2)  //保证前面的线程都执行完
            Thread.yield();
        System.out.println(test.inc);
    }
}
