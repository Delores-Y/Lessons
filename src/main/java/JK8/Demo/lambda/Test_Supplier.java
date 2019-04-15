package JK8.Demo.lambda;

import java.util.function.Supplier;

public class Test_Supplier {

    public static void main(String[] args) {

        Test_Supplier test = new Test_Supplier();
        test.testSupplier();

    }

    public void testSupplier() {

        Supplier<String> supplier1 = () -> "heylee";

        Supplier<Integer> supplier2 = () -> {
            return 66;
        };
        System.out.println(supplier1.get());
        System.out.println(supplier2.get());
    }
}
