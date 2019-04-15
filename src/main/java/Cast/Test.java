package Cast;

public class Test {

    public static void main(String[] args) {

        Animal tig = new Tiger();
        Tiger tiger = new Tiger();
        Tiger tiger1 = (Tiger) tiger;

        if (tiger instanceof Animal) {
            System.out.println("Aha!!!");
        }


        Animal animal = new Animal();
        Tiger tiger2 = (Tiger) animal;

    }

}

class Animal {
    String name;

    Animal() {
        name = "animal";
    }

    Animal(String name) {
        this.name = name;
    }
}

class Tiger extends Animal {
    Tiger() {
        super("tiger");
    }
}

class Lion extends Animal {
    Lion() {
        super("lion");
    }
}
