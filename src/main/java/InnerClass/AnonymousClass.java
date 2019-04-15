package InnerClass;

public class AnonymousClass {

    // ****************************************************************************************************
    // 匿名内部类


    public static void main(String[] args) {

        Father f1 = new Father() {

            @Override
            public void eat() {
                super.drink();
                System.out.println("eat something!!!");
            }
        }; //这里就是有个匿名内部类


        Father f2 = new Son();

        f1.eat();
        f2.eat();

        System.out.println("^^^^^^^^^^^^^^^");

        Son son = new Son();
        son.eat();
        System.out.println("****************");
        son.drink();
        System.out.println("****************");
        son.init();

    }
}

class Son extends Father {

    @Override
    public void eat() {
        super.drink();
        System.out.println("son eat somthing!!!");
    }

//    @Override
//    public void dance() {
//
//    }
}

abstract class Father {
    // ... ...
    public abstract void eat();
//    public abstract void dance();

    void init() {
        System.out.println("abstract father init");
    }

    public void drink() {
        System.out.println("abstract father drink");
    }
}
