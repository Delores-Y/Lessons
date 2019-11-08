package $_JVM;

public class Area { //运行时, jvm 把Area的信息都放入方法区

    public static void main(String[] args) {
        Sample test1 = new  Sample( " 测试1 " );   //test1是引用，所以放到栈区里， Sample是自定义对象应该放到堆里面
        Sample test2 = new  Sample( " 测试2 " );
        test1.hashCode();

        test1.printName();
        test2.printName();
    }
}
