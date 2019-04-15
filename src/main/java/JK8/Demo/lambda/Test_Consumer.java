package JK8.Demo.lambda;

import java.util.function.Consumer;

public class Test_Consumer {

    public static void main(String[] args) {
        Test_Consumer test = new Test_Consumer();
        test.testConsumer();
    }

    public void testConsumer() {

        Consumer<String> consumer0 = System.out::println;
        Consumer<String> consumer1 = (x) -> System.out.println(x);
        Consumer<String> consumer2 = (x) -> {
            System.out.println("after consumer 1");
        };

        consumer0.accept("Wow");
        consumer1.andThen(consumer2).accept("test consumer");
    }
}
