import java.util.ArrayList;
import java.util.List;

public class List_001 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("1");
        list.add("2");
        list.add("3");
        int index = 0;

//        list.clear();
        System.out.println(list.get(0));

        System.out.println(list.get(++index));
        System.out.println(index);
    }
}
