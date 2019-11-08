package $_Reflect;

class Demo {

}

class Person {

//    public Person(String name){};

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "[" + this.name + "  " + this.age + "]";
    }

    private String name;
    private int age;
}

public class FatherClass {

    public static void main(String[] args) {

        Class demo = Demo.class;
        System.out.println(demo.getName());

        Class<?> demo1 = null;
        Class<?> demo2 = null;
        Class<?> demo3 = null;
        try {
            demo1 = Class.forName("Reflect.Demo");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        demo2 = new Demo().getClass();
        demo3 = Demo.class;


        Class<?> demo4 = null;
        try {
            demo4 = Class.forName("Reflect.Person");
        } catch (Exception e) {
            e.printStackTrace();
        }


        Person per = new Person();
    }
}
