package JK8.Demo.lambda;

public class Test_01 {

    public static void main(String[] args) {

        Test_01 test_01 = new Test_01();

        // 类型声明
        MathOperation addition_origin = new MathOperation() {
            @Override
            public int operation(int a, int b) {
                return a + b;
            }
        };

        System.out.println(addition_origin.operation(3,7));

        // 类型声明
        MathOperation addition = (int a, int b) -> a + b;

        // 不用类型声明
        MathOperation subtraction = (a, b) -> a + b;

        // 大括号中的返回语句
        MathOperation multiplication = (int a, int b) -> {return a * b;};

        // 没有大括号及返回语句
        MathOperation division = (int a, int b) -> a / b;

        System.out.println("10 + 5 = " + test_01.operate(10, 5, addition));
        System.out.println("113 - 5 = " + test_01.operate(113, 5, subtraction));
        System.out.println("106 x 56 = " + test_01.operate(106, 56, multiplication));
        System.out.println("10 / 5 = " + test_01.operate(10, 5, division));


        String hello = "Hello";

        // 在 Lambda 表达式当中不允许声明一个与局部变量同名的参数或者局部变量。
        // String message = "";

        // 不用括号
        GreetingService greetService1 = message ->
                System.out.println(hello + message);

        // 用括号
        GreetingService greetService2 = (message) ->
                System.out.println("Hello " + message);

        //报错信息：Local variable num defined in an enclosing scope must be final or effectively final
        //  hello = hello + "ss";

        greetService1.sayMessage("Runoob");
        greetService2.sayMessage("Google");
    }



    @FunctionalInterface
    interface MathOperation {
        int operation(int a, int b);
    }

    @FunctionalInterface
    interface GreetingService {
        void sayMessage(String message);
    }

    private int operate(int a, int b, MathOperation mathOperation){
        return mathOperation.operation(a, b);
    }
}
