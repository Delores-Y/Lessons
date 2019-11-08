package Others.IntegerTest;

public class Test {
    public static void main(String[] args) {
        Integer num1 = new Integer(20);
        Integer num2 = 20;
        Integer num3 = 20;
        Integer num4 = 127;
        Integer num5 = 127;
        Integer num6 = 128;
        Integer num7 = 128;


        System.out.println(num1 == num2);
        System.out.println(num2 == num3);
        System.out.println(num4 == num5);
        System.out.println(num6 == num7);
    }
}
