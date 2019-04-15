package InnerClass;

public class OuterClass {

    // ****************************************************************************************************
    // 内部类

    private void outerMethod() {
        System.out.println("This is a outer method!!!");
    }

    public static void main(String[] args) {
        OuterClass t = new OuterClass();
        InnerClass in = t.new InnerClass();
//        OuterClass.InnerClass inn = t.new InnerClass();
        in.innerMethod();

    }

    private class InnerClass {
        private void outerMethod() {
            System.out.println("This is a inner method!!!");
        }

        private void innerMethod() {
            OuterClass.this.outerMethod(); // 内部类成员方法与外部类成员方法同名时，使用this调用外部类的方法
            outerMethod(); // 内部类没有同名方法时执行外部类的方法
        }
    }

    // ****************************************************************************************************
    // 内部类访问外部类的变量必须声明为final

    private int num_1 = 0; // 成员变量

    private void outerMethod_2() {
        int num_2 = 0; // 局部变量

        class InnerClass_2 {
            private void innerMethod() {
                System.out.println(num_1); // 方法中内部类的方法，可以正常访问外部类的成员变量
                System.out.println(num_2); // JDK1.8以前，方法中内部类的方法，不能直接访问外部类的方法的局部变量，必须声明为final
            }
        }
    }

    // ****************************************************************************************************
    // 内部类的实例化

    private void outerMethod_3() {
        InnerClass in = new InnerClass();
    }
}
