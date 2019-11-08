package $_JVM;

public class JvmTest {

    private int i = 0;

    public void a() {
        System.out.println(i++);
        a();
    }

    public static void main(String[] args) {
        JvmTest j = new JvmTest();
        j.a();
    }
}
