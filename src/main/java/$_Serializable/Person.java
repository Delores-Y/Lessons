package $_Serializable;

import java.io.Serializable;

public class Person implements Serializable {

    private static final long serialVersionUID = -2924978220067226985L;

//    private static final long serialVersionUID = 1L;
//    private static final long serialVersionUID = 2L;

    private String name;
    private Integer age;
    private String address;
    private String email;

    public Person() {
    }

    public Person(String name, Integer age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Person(String name, Integer age, String address,String email) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.email = email;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
