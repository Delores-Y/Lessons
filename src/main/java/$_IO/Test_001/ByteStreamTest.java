package $_IO.Test_001;

import java.io.*;

public class ByteStreamTest {

    public static void main(String[] args) throws IOException {
        File file = new File("/Users/heylee/Hubs/Art/A_Projects/Lessons/src/main/java/$_IO/Test_001/test.txt");
        OutputStream outputStream = new FileOutputStream(file);
        String str = "Hello World ";
        byte[] b = str.getBytes();

        outputStream.write(b);

        for (int i = 0; i < b.length; i++) {
            outputStream.write(b[i]);
        }

        outputStream.close();

        InputStream inputStream = new FileInputStream(file);

//        byte[] bb = new byte[1024];
//        int len = inputStream.read(bb);
//        System.out.println(new String(bb, 0, len));
//        System.out.println(new String(bb));

        byte[] bbb = new byte[(int) file.length()];
        inputStream.read(bbb);
        inputStream.close();
        System.out.println(new String(bbb));
    }
}
