package Enum;

import java.util.Arrays;

public class Enum_001 {

    public static void main(String[] args) {
        System.out.println(Color.GREEN.name());
        System.out.println(Arrays.toString(Color.values()));
        Color color = Color.PINK;
        switch (color) {
            case GREEN:
                System.out.println("green");
                break;
            case RED:
                System.out.println("red");
                break;
            case PINK:
                System.out.println("pink");
                break;
            default:
                System.out.println("not match");
        }

//        javax.persistence
//        @Enumerated(EnumType.STRING)
//        @Enumerated(EnumType.ORDINAL)

        System.out.println(Day.FRIDAY);
    }
}
