package $_proxy.Cglib;

public class MainCglibProxy {
    public static void main(String[] args) {
        CglibInterceptor cglibProxy = new CglibInterceptor();
        CglibHelloClass cglibHelloClass = (CglibHelloClass) cglibProxy.newProxyInstance(CglibHelloClass.class);
        cglibHelloClass.sayHello("isole");
        cglibHelloClass.sayByeBye("sss");
    }
}
