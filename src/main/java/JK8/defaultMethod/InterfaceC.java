package JK8.defaultMethod;

/**
 * @author William
 * @date 2019-10-28 15:47
 * @description
 */
public interface InterfaceC extends InterfaceA {
    @Override
    default void foo() {
        System.out.println("InterfaceC foo");
    }
}
