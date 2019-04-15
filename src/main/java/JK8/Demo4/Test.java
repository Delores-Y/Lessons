package JK8.Demo4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test {

    public static void main(String[] args) throws IOException {

        String result = processFile((BufferedReader br) -> br.readLine() + br.readLine());
        System.out.println(result);
    }

    private static String processFile(BufferReaderProcessor p) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("/Users/heylee/Hubs/Art/Eclipse/Heylee/src/com/iata/Heylee/resource/nio_read.txt"));
        return p.process(br);
    }
}
