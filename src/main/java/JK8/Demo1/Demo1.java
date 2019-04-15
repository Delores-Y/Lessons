package JK8.Demo1;

import JK8.Apple;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Demo1 {

    public static void main(String[] args) {

        Apple a1 = new Apple();
        a1.setColor("Green");
        a1.setWeight(5.0);
        Apple a2 = new Apple();
        a2.setColor("Red");
        a2.setWeight(6.0);
        Apple a3 = new Apple();
        a3.setColor("Red");
        a3.setWeight(7.0);
        Apple a4 = new Apple();
        a4.setColor("Green");
        a4.setWeight(8.0);
        Apple a5 = new Apple();
        a5.setColor("Green");
        a5.setWeight(9.0);

        List<Apple> list = new ArrayList<>();
        list.add(a1);
        list.add(a2);
        list.add(a3);
        list.add(a4);
        list.add(a5);

        List<Apple> greenApples = new ArrayList<>();
        List<Apple> heavyApples = new ArrayList<>();
        greenApples = filterGreenApples(list);
        greenApples = filterApples(list, Demo1::isGreenApple);
        greenApples = filterApples(list, (Apple a) -> "Green".equals(a.getColor()));
        heavyApples = filterApples(list, Demo1::isHeavyApple);

        // Stream
        // 顺序处理
        heavyApples = list.stream().filter((Apple a) -> a.getWeight() > 6.0).collect(Collectors.toList());
        // 并行处理
        heavyApples = list.parallelStream().filter(Demo1::isHeavyApple).collect(Collectors.toList());

        for (Apple a : greenApples) {
            System.out.println("Apple: " + a.getColor() + " " + a.getWeight());
        }
        System.out.println("----------------------------------------------------");
        for (Apple a : heavyApples) {
            System.out.println("Apple: " + a.getColor() + " " + a.getWeight());
        }

    }

    private static List<Apple> filterGreenApples(List<Apple> inventory) {

        List<Apple> result = new ArrayList<>();
        for (Apple a : inventory) {
//            if ("Green".equals(a.getColor())) {
//                result.add(a);
//            }
            if (isGreenApple(a))
                result.add(a);
        }

        return result;
    }

    private static boolean isGreenApple(Apple apple) {

        return "Green".equals(apple.getColor());
    }

    private static boolean isHeavyApple(Apple apple) {

        return apple.getWeight() > 6.0;
    }

    private static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> p) {

        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (p.test(apple)) {
                result.add(apple);
            }
        }

        return result;
    }


}














