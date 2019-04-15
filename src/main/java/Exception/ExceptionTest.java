package Exception;

public class ExceptionTest {

//    static final Logger

    public static void main(String[] args) {

        try {
            throw new NullPointerException();
        } catch (Exception e) {
            e.printStackTrace();
        }

//        throw new NullPointerException();

        System.out.println("666");

        ExceptionTest exceptionTest = new ExceptionTest();
        try {
            exceptionTest.testException();
        } catch (Exception e) {
            e.printStackTrace();
        }

//        exceptionTest.testException();

        System.out.println("777");
    }

    private void testException() {
        throw new NullPointerException();
    }
}
