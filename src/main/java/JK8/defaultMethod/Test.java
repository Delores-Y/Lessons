package JK8.defaultMethod;

/**
 * @author William
 * @date 2019-10-28 15:50
 * @description
 */
public class Test {

    public static void main(String[] args) {
        new ClassA().foo();

        new InterfaceB(){}.foo();

        new InterfaceD(){
            @Override
            public void foo() {
                System.out.println(Thread.currentThread().getName() + " InterfaceD foo");
            }
        }.foo();


        //        (InterfaceD) () -> System.out.println("InterfaceD foo");

        ((InterfaceD) () -> System.out.println("interfaceD foo")).foo();



        new Runnable(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " test");
            }
        }.run();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " test2");
            }
        }).start();

        new Thread(() -> System.out.println(Thread.currentThread().getName() + " test3")).start();



    }
}
