package $Encypt;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.IOException;

public class BASE64 {

    public static byte[] decryptBASW64(String key) throws IOException {
        return new BASE64Decoder().decodeBuffer(key);
    }

    public static String encryptBASE64(byte[] key) {
        return new BASE64Encoder().encode(key);
    }

    public static void main(String[] args) throws IOException {

        String  str="12345678";
        String result1 = BASE64.encryptBASE64(str.getBytes());
        System.out.println("=====加密数据===== "+result1);

        byte[] result2 = BASE64.decryptBASW64(result1);
        System.out.println("=====decrypt数据===== "+new String(result2));
    }

}
