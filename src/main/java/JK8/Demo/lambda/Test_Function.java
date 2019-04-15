package JK8.Demo.lambda;

import java.util.function.Function;

public class Test_Function {

    public static void main(String[] args) {

        Test_Function test = new Test_Function();
        test.testFunction();

    }

    public void testFunction() {
        Function<Integer, String> function1 = (x) -> "test result: " + x;

        Function<String, String> function2 = (x) -> {
            return "after function1 " + x;
        };

        System.out.println(function1.apply(6));
        System.out.println(function2.apply("heylee"));
    }
}
