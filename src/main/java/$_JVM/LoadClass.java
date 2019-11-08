package $_JVM;

public class LoadClass {

    public static void main(String[] args) {

        ClassLoader loader = LoadClass.class.getClassLoader();
        while (loader!=null){
            System.out.println(loader);
            loader = loader.getParent();
        }
    }
}
