package JK8.Demo5;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Test {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(5);

        foreach(list, (Integer i) -> System.out.println(i));

        list.forEach((Integer i) -> System.out.println(i));

    }

    private static <T> void foreach(List<T> list, Consumer<T> c) {

        for (T i : list) {
            c.accept(i);
        }
    }
}
