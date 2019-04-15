package FileIO;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileIO {

    private final static String PATH_READ = "/Users/heylee/Hubs/Art/Eclipse/Heylee/src/com/iata/Heylee/resource/nio_read.txt";
    private final static String PATH_WRITE = "/Users/heylee/Hubs/Art/Eclipse/Heylee/src/com/iata/Heylee/resource/nio_write.txt";
    private final static String PATH_FOLDER = "/Users/heylee/Hubs/Art/Eclipse/Heylee/src/com/iata/Heylee/resource/folder_test";


    public static void main(String[] args) {

        // java.nio.file.files jdk1.7 jdk1.8

        String content = null;
        List<String> lines = null;


        try {
            if (!Files.exists(Paths.get(FileIO.PATH_WRITE)))
                Files.createFile(Paths.get(FileIO.PATH_WRITE));

            Files.createDirectories(Paths.get(FileIO.PATH_FOLDER));

            // 读文件 (空行也会读出来)
            content = new String(Files.readAllBytes(Paths.get(FileIO.PATH_READ)));

            // 逐行读文件到List
            lines = Files.readAllLines(Paths.get(FileIO.PATH_READ));

            // jdk1.8 Files.lines() 流的方式读文件
            Files.lines(Paths.get(FileIO.PATH_READ), StandardCharsets.UTF_8).forEach(System.out::println);


        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("-----------------------------------------------------");

        System.out.println(content);
        System.out.println("-----------------------------------------------------");
        if (lines != null)
            for (String line : lines) {
                System.out.println(line);
            }
        System.out.println("-----------------------------------------------------");


    }
}
