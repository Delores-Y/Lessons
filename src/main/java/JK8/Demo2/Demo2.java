package JK8.Demo2;

import JK8.Apple;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Demo2 {

    public static void main(String[] args) {

        Apple a1 = new Apple();
        a1.setColor("Green");
        a1.setWeight(5.0);
        Apple a2 = new Apple();
        a2.setColor("Red");
        a2.setWeight(6.0);
        Apple a3 = new Apple();
        a3.setColor("Red");
        a3.setWeight(4.0);
        Apple a4 = new Apple();
        a4.setColor("Green");
        a4.setWeight(8.0);
        Apple a5 = new Apple();
        a5.setColor("Green");
        a5.setWeight(7.0);

        List<Apple> list = new ArrayList<>();
        list.add(a1);
        list.add(a2);
        list.add(a3);
        list.add(a4);
        list.add(a5);

        //************ Step 1 use  outer class implements ApplePredicate*********
        List<Apple> greenApples = filterApples(list, new AppleColorPredicate());
        for (Apple apple : greenApples) {
            System.out.println(apple.getColor() + " ------- " + apple.getWeight());
        }

        System.out.println("********************************");

        List<Apple> heavyApples = filterApples(list, new AppleWeightPredicate());
        for (Apple apple : heavyApples) {
            System.out.println(apple.getColor() + " ------- " + apple.getWeight());
        }

        //************ Step 2 use  anonymous class implements ApplePredicate*********
        List<Apple> greenApples2 = filterApples(list, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return "Green".equals(apple.getColor());
            }
        });

        //************ Step 3 use Lambda*********
        List<Apple> greenApples3 = filterApples(list, (Apple apple) -> "Green".equals(apple.getColor()));

        //************ Step 4 if method body too long ----- use :: *********
        List<Apple> greenApples4 = filterApples(list, Demo2::isGreenApple);

        //************ Step 5 List 类型抽象化 Apple Banana Peach Grape Balabala*********
        List<Apple> greenApples5 = filter(list, Demo2::isGreenApple);
        List<Apple> greenApples6 = list.stream().filter(Demo2::isGreenApple).collect(Collectors.toList());

        // list.sort
        list.sort(new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return o1.getWeight().compareTo(o2.getWeight());
            }
        });
        System.out.println("************* List.sort : *************");
        for (Apple apple : list) {
            System.out.println(apple.getColor() + " ------- " + apple.getWeight());
        }

        // list.sort
        list.sort((Apple a, Apple b) -> b.getWeight().compareTo(a.getWeight()));
        System.out.println("************* List.sort : *************");
        for (Apple apple : list) {
            System.out.println(apple.getColor() + " ------- " + apple.getWeight());
        }


    }

    private static boolean isGreenApple(Apple apple) {

        return "Green".equals(apple.getColor());
    }


    private static List<Apple> filterApples(List<Apple> inventory, ApplePredicate p) {

        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

    private static <T> List<T> filter(List<T> list, Predicate<T> p) {
        List<T> result = new ArrayList<>();
        for (T e : list) {
            if (p.test(e)) {
                result.add(e);
            }
        }
        return result;
    }

}
