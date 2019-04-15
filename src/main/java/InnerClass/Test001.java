package InnerClass;

public class Test001 {

    // ****************************************************************************************************
    // 在静态方法中实例化内部类例子：（内部类放在静态方法中）

    public static void main(String[] args) {

        class Boy implements Person {

            public void say() { // 匿名内部类自定义的方法say
                System.out.println("say方法调用");
            }

            @Override
            public void speak() { // 实现接口的的方法speak
                System.out.println("speak方法调用");
            }
        }
        Person per = new Boy();
        per.speak();
        ((Boy) per).say();
    }
}

@FunctionalInterface
interface Person {
    public void speak();
}
