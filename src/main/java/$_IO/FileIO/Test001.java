package $_IO.FileIO;

import java.io.File;
import java.io.IOException;

public class Test001 {

    public static void main(String[] args) throws IOException {

        String path;
        File file = new File("/Users/heylee/Hubs/Art/Eclipse/Heylee/src/com/iata/Heylee/resource/nio_read.txt");
        File file2 = new File("/Users/heylee/Hubs/Art/Eclipse/Heylee/src/com/iata/Heylee/resource/test.txt");
        File file3 = new File("/Users/heylee/Hubs/Art/Eclipse/Heylee/src/com/iata/Heylee/resource/test");
        file.isDirectory();
        file.isFile();
        file.isHidden();
        file2.createNewFile();
        file3.mkdir();
        System.out.println("File exixt : " + file.exists());
    }
}
