package $_proxy;

public class ProxyTest {

    public static void main(String[] args) {

//        HelloImpl hello = new HelloImpl();
//        Hello hi = new HelloImpl();
//        hello.say("william");
//        hi.say("heylee");

        StaticProxyHello proxyHello = new StaticProxyHello();
        proxyHello.say("heylee");

    }
}
