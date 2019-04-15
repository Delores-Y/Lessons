package JK8.Demo5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Test2 {

    public static void main(String[] args) {

        List<Integer> list = map(Arrays.asList("Lambda", "in", "action"), (String s) -> s.length());
        List<String> listStr = map(Arrays.asList("Lambda", "in", "action"), (String s) -> s.substring(0, 2));
        list.forEach((Integer i) -> System.out.println(i));
        listStr.forEach((String str) -> System.out.println(str));

    }

    private static <T, R> List<R> map(List<T> list, Function<T, R> f) {

        List<R> result = new ArrayList<>();
        for (T t : list) {
            result.add(f.apply(t));
        }
        return result;
    }
}
