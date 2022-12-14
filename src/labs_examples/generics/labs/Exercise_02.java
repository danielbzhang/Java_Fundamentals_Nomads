package labs_examples.generics.labs;

/**
 * Generics Exercise 2:
 *      Create a class with a generic method that takes in an ArrayList of any Numeric type and returns the sum of all
 *      Numbers in the ArrayList. Demonstrate how to call this method from the main() method.
 */
import java.util.ArrayList;

class Demo{
    public static void main(String[] args) {
        ArrayList<Double> arr1 = new ArrayList<>();
        arr1.add(2.2);
        arr1.add(1.1);
        arr1.add(5.5);

        System.out.println(add(arr1));

//        Character[] arr = {'h', 'w', 'R'};
//        printArray(arr);

        Integer[] arr = {1,2,3};
        printArray(arr);
    }

    public static <E extends Number> double add(ArrayList<E> arr) {
        double sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i).intValue();
        }
        return sum;
    }

    public static <E extends Number> void printArray(E[] inputArray) {
        for(E ele : inputArray) {
            System.out.printf("%s ",ele);
        }
        System.out.println();
    }
}