package $_Genericity;

import sun.rmi.runtime.Log;

/**
 * @author William
 * @date 2019-11-04 10:30
 * @description
 */
public class Test {

    public static void showKeyValue1(Generic<?> obj){
        System.out.println("泛型测试" + "key value is ");
    }

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Generic<Number> numberGeneric = new Generic<>();
        Generic<Integer> integerGeneric = new Generic<>();

        Generic generic = new Generic();

        showKeyValue1(integerGeneric);
        showKeyValue1(generic);



        Object obj = genericMethod(Class.forName("$_Genericity.Generic"));
//        Generic<Integer> generic1 = genericMethod(Class.forName("$_Genericity.Generic"));

    }

    // -------------------------------------------------------

    /**
     * 泛型方法的基本介绍
     * 为什么要使用泛型方法呢？因为泛型类要在实例化的时候就指明类型，如果想换一种类型，不得不重新new一次，可能不够灵活；而泛型方法可以在调用的时候指明类型，更加灵活。
     * @param tClass 传入的泛型实参
     * @return T 返回值为T类型
     * 说明：
     *     1）public 与 返回值中间<T>非常重要，可以理解为声明此方法为泛型方法。
     *     2）只有声明了<T>的方法才是泛型方法，泛型类中的使用了泛型的成员方法并不是泛型方法。
     *     3）<T>表明该方法将使用泛型类型T，此时才可以在方法中使用泛型类型T。
     *     4）与泛型类的定义一样，此处T可以随便写为任意标识，常见的如T、E、K、V等形式的参数常用于表示泛型。
     */
    public static  <T> T genericMethod(Class<T> tClass)throws InstantiationException ,
            IllegalAccessException{
        T instance = tClass.newInstance();
        return instance;
    }

    public <T> void printMsg( T... args){
        for(T t : args){
            System.out.println("泛型测试 t is " + t);
        }
    }

    public <T> void printMsg2( T... args){
        for(T t : args){
            System.out.println("泛型测试 t is " + t);
        }
    }

}
