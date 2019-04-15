package JK8.Demo.lambda;

import java.util.function.Predicate;

public class Test_Predicate {

    public static void main(String[] args) {

        Test_Predicate test = new Test_Predicate();
        test.testPredicate();
    }

    public void testPredicate() {
        Predicate<String> predicate = (x) -> x.length() > 3;
        System.out.println(predicate.test("heylee"));
    }
}
