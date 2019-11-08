package $_JVM.hash;

import java.util.HashMap;
import java.util.Map;

public class HashMethod {

    public static void main(String[] args) {

        Map<String,String> map = new HashMap<>();

        String key = new String("test");
        int h = key.hashCode();
        System.out.println(h);
        // 3556498
        // 无符号右移
        System.out.println(h >>> 16);
        // 54
        map.put(key,"heylee");


        // hashCode()
        // 3556498
        // 0000 0000 0011 0110 0100 0100 1001 0010

        // h >>> 16
        // 0000 0000 0000 0000 0000 0000 0011 0110

        // hash = h ^ (h >>> 16)
        // 0000 0000 0011 0110 0100 0100 1001 0010
        // 0000 0000 0000 0000 0000 0000 0011 0110
        // =
        // 0000 0000 0011 0110 0100 0100 1010 0100

        // n default 16
        // (n - 1) & hash
        // 0000 0000 0000 0000 0000 0000 0000 1111
        // 0000 0000 0011 0110 0100 0100 1010 0100
        // =
        // 0000 0000 0000 0000 0000 0000 0000 0100
        // = 4
        // 所以放在数组的第四个位置



    }
}
