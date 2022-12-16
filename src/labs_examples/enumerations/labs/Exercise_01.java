package labs_examples.enumerations.labs;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Enumerations Exercise 1:
 * <p>
 * 1) Create an enumeration. Use a controller class to demonstrate the use of the enum from a seperate class.
 * 2) Create a parameterized enumeration that passes one or more values to it's constructor. Demonstrate the use
 * of this enum from a seperate class.
 */

enum Direction {
    NORTH, SOUTH, WEST, EAST
}

class EnumExample1 {
    public static void main(String[] args) {
        Direction myDir = Direction.NORTH;

        switch (myDir) {
            case NORTH:
                System.out.println("We are heading north!");
                break;
            case SOUTH:
                System.out.println("We are heading south!");
                break;
            case WEST:
                System.out.println("We are heading west!");
                break;
            case EAST:
                System.out.println("We are heading east!");
                break;
        }
    }
}

class EnumPara {
    public enum Food {
        BURGER(10), FRIES(5), HOTDOG(3), PIZZA(11);

        Food(int price) {
            this.price = price;
        }

        private final int price;

        public int getPrice() {
            return price;
        }
    }
}

//public class UsingParameterizedEnum {
//    public static void main(String[] args) {
//        for (Food f : Food.values) {
//            System.out.println("Food: " + f + ", ");
//            if (f.getPrice() >= 4) {
//                System.out.println("Expensive, ");
//            } else {
//                System.out.println("Affordable, ");
//            }
//            switch (f) {
//                case BURGER:
//                    System.out.println("Tasty");
//                    continue;
//                default:
//                    System.out.println("Ok");
//            }
//        }
//    }
//}

