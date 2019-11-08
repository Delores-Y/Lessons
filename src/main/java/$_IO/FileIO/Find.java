package $_IO.FileIO;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.nio.file.Files.readAllLines;

public class Find {

    public static void main(String[] args) throws IOException {

        List<String> lines = null;
        lines = readAllLines(Paths.get("/Users/heylee/OneDrive/expiration.txt"));

        String regx = ":\\[(.*?)\\]";
        Pattern pattern = Pattern.compile(regx);
        Matcher match = null;

        for (String line : lines) {
            match = pattern.matcher(line);
            if (match.find()) {
                System.out.print("'" + match.group(1) + "',");
            }
        }
    }
}
