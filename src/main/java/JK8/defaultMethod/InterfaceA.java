package JK8.defaultMethod;

/**
 * @author William
 * @date 2019-10-28 15:46
 * @description
 */
public interface InterfaceA {
    default void foo() {
        System.out.println("InterfaceA foo");
    }

}
