import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Comparator_001 {

    class Dog {
        private int age;
        private String name;

        private Dog(int age, String name) {
            super();
            this.age = age;
            this.name = name;
        }

        public String toString() {
            return "Dog [age = " + age + ", name = " + name + "]";
        }
    }

    public static void main(String[] args) {

        List<Dog> list = new ArrayList<>();
        list.add(new Comparator_001().new Dog(5, "haha"));
        list.add(new Comparator_001().new Dog(6, "xixi"));
        list.add(new Comparator_001().new Dog(7, "heihei"));


//        Collections.sort(list, new Comparator<Dog>() {
//            @Override
//            public int compare(Dog o1, Dog o2) {
//                return o1.name.compareTo(o2.name);
//            }
//        });

        list.sort(new Comparator<Dog>() {
            @Override
            public int compare(Dog o1, Dog o2) {
                return o2.name.compareTo(o1.name);
            }
        });

        System.out.println(list);
    }
}
