package $_proxy;

public class HelloImpl implements Hello {
    @Override
    public String say(String str) {
        System.out.println("hello " + str);
        return "hello " + str;
    }
}
