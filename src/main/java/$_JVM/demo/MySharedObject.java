package $_JVM.demo;

public class MySharedObject {

    // 指向MySharedObject的静态变量
    public static final MySharedObject sharedInstance = new MySharedObject();

    // 成员变量指向两个堆上的对象
    public Integer object1 = new Integer(22);
    public Integer object2 = new Integer(44);

    public long member1 = 12345;
    public long member2 = 67890;
}
