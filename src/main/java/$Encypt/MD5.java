package $Encypt;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 {

    public static final String KEY_MD5 = "MD5";

    public static String encrypt(String in) {
        System.out.println("password: " + in);
        MessageDigest md5 = null;
        try {
            md5 = MessageDigest.getInstance(KEY_MD5);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        byte[] byteArray = in.getBytes();
        for (int i = 0; i < byteArray.length; i++) {
            System.out.print(byteArray[i] + " ");
        }
        StringBuilder hexValue = new StringBuilder();
        if (md5 != null) {
            byte[] md5Bytes = md5.digest(byteArray);
            System.out.println();
            for (int i = 0; i < md5Bytes.length; i++) {
                System.out.print(md5Bytes[i] + " ");
            }
            for (int i = 0; i < md5Bytes.length; i++) {
                // 0xff  >>>>> 11111111
                int val = ((int) md5Bytes[i]) & 0xff;
                System.out.println("Binary: " + Integer.toBinaryString(val));
                System.out.println("Hex: " + Integer.toHexString(val));
                if (val < 16) {
                    hexValue.append("0");
                }
                hexValue.append(Integer.toHexString(val));
            }
        }
        return hexValue.toString();
    }

    public static void main(String[] args) {
        String pwd = "1qaz@WSX";
        String en_pwd = MD5.encrypt(pwd);
        System.out.println("\n" + en_pwd);
    }
}
