package InnerClass;

public class AnonymousClass2 {

    public static void main(String[] args) {

        // ****************************************************************************************************
        // 匿名内部类的方法调用
        Person2 per = new Person2() {

            public void say() {
                System.out.println("匿名内部类自定义 say 方法");
            }

            @Override
            public void hello() {

            }

            @Override
            public void speak() {
                System.out.println("speak 方法调用");
            }
        };

        per.speak();

//        ((Person2) per).say(); ERROR


        new Person2() {

            @Override
            public void speak() {

            }

            @Override
            public void hello() {

            }

            public void say() {
                System.out.println("匿名内部类自定义 say 方法");
            }
        }.say();

    }
}

//@FunctionalInterface
interface Person2 {

    void speak();

    void hello();
}
