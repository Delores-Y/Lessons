package $_Object;

import java.util.Objects;

/**
 * @author William
 * @date 2019-10-30 17:12
 * @description
 */
public class Test {

    private static String str;

    private static int num;

    public static void main(String[] args) {

        // NPE
//        if (str.equals("Carbon"))
//            System.out.println("Carbon");

        if (Objects.equals(str,"Carbon"))
            System.out.println("Carbon");


        if (Objects.equals(num,"carbon"))
            System.out.println("number");

        int number = 5;
    }
}
