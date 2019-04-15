package Lambda;

public class Lambda2 {

    public static void main(String[] args) {

        runThreadByInnerClass();
        runThreadByLambda();
    }

    private static void runThreadByInnerClass() {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("This is a thread implemented by inner class!!!");
            }
        };
        new Thread(runnable).start();
    }

    private static void runThreadByLambda() {

        Runnable runnable = () -> System.out.println("This is a thread implemented by lambda!!!");
        new Thread(runnable).start();
    }
}
