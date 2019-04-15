package String_something;

public class String_001 {

    public static void main(String[] args) {

        String doctor = "Heylee";

        byte[] bb = doctor.getBytes();
        char[] cc = doctor.toCharArray();

        for (byte aBb : bb) {

            System.out.println(aBb + "     " + (char) aBb);

        }

        System.out.println("**********************************************************************");

        for (char aCc : cc) {

            System.out.println(aCc);
        }

        System.out.println("**********************************************************************");

        String byteArr2String = new String(bb);

        System.out.println(byteArr2String);

        StringBuilder sb = new StringBuilder();
        sb.append("1" + ",");
        sb.append("2" + ",");

    }
}
