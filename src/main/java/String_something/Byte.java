package String_something;

import java.util.Arrays;

public class Byte {

    public static void main(String[] args) {


        String str = "123456abc博饕餮";

        byte[] bytes = str.getBytes();

        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
            int num = (int)bytes[i];
            System.out.println("Hex :" + Integer.toHexString(num));
        }

        System.out.println(Integer.toBinaryString(-110));
        System.out.println(Integer.toBinaryString(110));
        System.out.println(-110 & 110);

    }
}
