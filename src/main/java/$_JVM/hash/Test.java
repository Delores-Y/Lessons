package $_JVM.hash;

import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        HashSet<User> set = new HashSet<>();
        User user1 = new User("123", "zhangsan", 11);
        User user2 = new User("123", "zhangsan", 11);
        System.out.println(user1.hashCode()); // 140435067
        System.out.println(user2.hashCode()); // 1450495309
        // 不同的对象hashCode不同 如果没有重写hashCode方法 则会重复添加 不会执行equals方法
        set.add(user1);
        set.add(user2);

        // 添加同一对象（一定没问题！！！） hashCode相同 发生冲突 同一对象  不必执行后面的equals方法 不会重复添加
        set.add(user2);
        System.out.println(set.size());

        // 如果只重写hashCode方法 添加不同的对象（同一类，不同的Instance, 对象地址不同）没问题 会发生冲突 执行equals方法 地址不同 会重复添加
        // 如果只重写equals方法 添加不同的对象（同一类，不同的Instance, 对象地址不同）不会发生冲突 会重复添加

        // set.add >> map.put
        // set.add 方法
        //        public boolean add(E e) {
        //            return map.put(e, PRESENT)==null;
        //        }
        // Dummy value to associate with an Object in the backing Map
        // private static final Object PRESENT = new Object();
        // Set 中的对象 作为Map 的 key 存放 ，value 是一个 dummy value 无意义

        // map.put 方法
        //        public V put(K key, V value) {
        //            return putVal(hash(key), key, value, false, true);
        //        }

        //        static final int hash(Object key) {
        //            int h;
        //            return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
        //        }

        // 发生hash冲突时
        //        if (p.hash == hash && ((k = p.key) == key || (key != null && key.equals(k))))
        //  (k = p.key) == key 如果是同一对象 直接返回true 不会执行后面的equals判断
        //  如果不是同一对象 执行equals方法 不同对象的地址一定不一样 一定返回false 会导致属性值完全相同的对象 重复的加入到map set 中
        //  所以 Set 中的对象为自定义对象时 一定要重写 hashCode 方法 和 equals 方法
        //       Map 中Key 为自定义对象时 一定要重写 hashCode 方法 和 equals 方法

    }
}
