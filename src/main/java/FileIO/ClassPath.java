package FileIO;


public class ClassPath {

    public static void main(String[] args) {

        System.out.println(System.getProperty("user.dir"));

        // 得到的是当前的classpath的绝对URI路径。
        String class_str1 = ClassPath.class.getResource("/").getPath();
        System.out.println(class_str1);

        // 得到的是当前类ClassPath.class文件的URI目录。不包括自己！
        String class_str2 = ClassPath.class.getResource("").getPath();
        System.out.println(class_str2);

        // 得到的是当前的classpath的绝对URI路径。
        String class_str3 = ClassPath.class.getClassLoader().getResource("").getPath();
        System.out.println(class_str3);

        // 得到的也是当前ClassPath的绝对URI路径。
        // 推荐！！！
        String path = Thread.currentThread().getContextClassLoader().getResource("").getPath();
        System.out.println(path);

        // 得到的也是当前ClassPath的绝对URI路径。
        // String path2 = ClassLoader.getSystemClassLoader().getResource("").getPath();
        String path2 = ClassLoader.getSystemResource("").getPath();
        System.out.println(path2);


        String path3 = Thread.currentThread().getContextClassLoader().getResource("images/logo.png").getPath();
        System.out.println(path3);

    }
}
