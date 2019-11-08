package $_proxy.DynamicProxy;

// 委托类接口
public interface HelloService {

    /**
     * 方法1
     * @param userName
     * @return
     */
    String sayHello(String userName);

    /**
     * 方法2
     * @param userName
     * @return
     */
    String sayByeBye(String userName);
}
