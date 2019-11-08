import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Hyelee {

    public static void main(String[] args) {

        System.out.println("Heylee");

//        Collection
//        Map
        Map<String, String> map = new HashMap<>();

        map.put("user", "heylee");
//        map.put("haha", "heylee");

        System.out.println(map.hashCode());


    }

}
