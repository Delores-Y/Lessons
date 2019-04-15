package Others;

public class MaxTest {

    public static <T extends Comparable<T>> T max(T x, T y, T z) {
        T max = x; // 假设x是初始最大值
        if ( y.compareTo( max ) > 0 ){
            max = y; //y 更大
        }
        if ( z.compareTo( max ) > 0 ){
            max = z; // 现在 z 更大
        }
        return max; // 返回最大对象
    }

//    public static <T extends Comparable<T>> T max(T x, T y, T z) {
//
//    }

    public static void main(String[] args) {
        Generic<Integer> generic = new Generic<>(6);
        Generic<Number> generic1 = new Generic<>(6);

        System.out.printf( "%d, %d 和 %d 中最大的数为 %d\n\n",
                3, 4, 5, max( 3, 4, 5 ) );

        System.out.printf( "%.1f, %.1f 和 %.1f 中最大的数为 %.1f\n\n",
                6.6, 8.8, 7.7, max( 6.6, 8.8, 7.7 ) );

        System.out.printf( "%s, %s 和 %s 中最大的数为 %s\n","pear",
                "apple", "orange", max( "pear", "apple", "orange" ) );
    }
}
