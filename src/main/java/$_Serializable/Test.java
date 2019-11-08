package $_Serializable;

import java.io.*;

public class Test {


    @org.junit.Test
    public void testVersion1L() throws Exception {

        File file = new File("person.out");
        // 序列化
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        Person person = new Person("heylee", 18, "BJS");
        oos.writeObject(person);
        oos.close();

        // 反序列化
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        Object newPerson = ois.readObject();
        ois.close();
        System.out.println(newPerson);
    }

    @org.junit.Test
    public void testVersion1LWithExtraEmail() throws Exception {
        File file = new File("person.out");
        ObjectInputStream oin = new ObjectInputStream(new FileInputStream(file));
        Object newPerson = oin.readObject();
        oin.close();
        System.out.println(newPerson);
    }
}
