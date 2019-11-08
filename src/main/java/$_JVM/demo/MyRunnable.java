package $_JVM.demo;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        methodOne();
    }

    public void methodOne() {
        int localVariable1 = 45;

        MySharedObject localVariable2 = MySharedObject.sharedInstance;

        // 使用局部变量做更多的事情

        methodTwo();
    }

    public void methodTwo() {
        Integer localVariable1 = new Integer(99);
        // 使用局部变量做更多的事情
    }
}
