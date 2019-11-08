package $_JVM;

public   class  Sample        //运行时, jvm 把appmain的信息都放入方法区
{
/** 范例名称 */
    private String  name;      //new Sample实例后， 成员变量 引用类型 引用和对象都存储在堆中
    private int flag;          // 成员变量 基本类型 存储在堆中

    /** 构造方法 */
    public  Sample(String name)
    {
        this .name = name;
    }

    /** 输出 */
    public   void  printName()   //print方法本身放入 方法区里。
    {
        String xxx = "sss";     // 局部变量 引用类型 对象存储在堆中 引用存储在线程栈中
        int flag = 5;           // 局部变量 基本类型 存储在线程栈中
        System.out.println(name);
    }
}
