package JK8.Demo.stream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());

        filtered.forEach(System.out::println);

        Random random = new Random();
        random.ints().limit(10).sorted().forEach(System.out::println);

        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        // 获取对应的平方数
        List<Integer> squaresList = numbers.stream().map(i -> i*i).distinct().collect(Collectors.toList());
        List<Integer> squaresList2 = numbers.stream().map(i -> i*i).collect(Collectors.toList());
        squaresList2.forEach(System.out::println);
        squaresList2.forEach(x -> System.out.println(x));


        List<Integer> numbers2 = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        IntSummaryStatistics statistics = numbers2.stream().mapToInt(x -> x).summaryStatistics();
        statistics.getSum();
        statistics.getAverage();
    }
}
