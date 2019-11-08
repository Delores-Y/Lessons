package String_something;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterAddress {

    public static void main(String[] args) {
        String[] source = {"aaa","bbb","ccc"};
        String[] filter = {"ccc","ddd"};
        System.out.println(Arrays.toString(filterByArray(source, filter)));
    }

    private static String[] filterByArray(String[] source, String[] filter) {
        List<String> result = new ArrayList<>();
        for (String s : source) {
            boolean contains = false;
            for (String f : filter) {
                if (s.contains(f)) {
                    contains = true;
                    break;
                }
            }
            if (!contains) {
                result.add(s);
            }
        }

        result.stream().toArray(sss -> new String[sss]);
        return result.stream().toArray(String[]::new);
    }
}
