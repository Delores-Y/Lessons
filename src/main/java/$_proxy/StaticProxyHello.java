package $_proxy;

public class StaticProxyHello implements Hello {

    private Hello hello = new HelloImpl();

    @Override
    public String say(String str) {
        System.out.println("Proxy do something");
        return hello.say(str);
    }
}
