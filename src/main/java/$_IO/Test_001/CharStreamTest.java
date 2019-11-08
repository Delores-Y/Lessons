package $_IO.Test_001;

import java.io.*;

public class CharStreamTest {

    public static void main(String[] args) throws IOException {
        File file = new File("/Users/heylee/Hubs/Art/A_Projects/Lessons/src/main/java/$_IO/Test_001/test.txt");
        Writer out = new FileWriter(file);
        String str = "Hello World ccc";
        out.write(str);
        out.close();

        Reader input = new FileReader(file);
        char[] c = new char[1024];
        int len = input.read(c);
        input.close();
        System.out.println(new String(c, 0, len));
    }
}
