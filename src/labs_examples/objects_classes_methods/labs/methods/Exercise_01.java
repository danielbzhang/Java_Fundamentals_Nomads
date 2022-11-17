package labs_examples.objects_classes_methods.labs.methods;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {

        // please create the methods as instructed below then
        // call each of those methods from here, within the main()
        int result1 = multiply(2, 3);
        System.out.println(result1);

        int result2 = divide(4, 9);
        System.out.println(result2);

        printJoke();
        int inSec = convertSec(2);

        int len = printLength("one", "two", "three", "four");
        System.out.println(len);

    }


    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b
    public static int multiply(int a, int b) {
        return a * b;
    }
    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b
    public static int divide(int a, int b) {
        return a / b;
    }
    // 3) Create a static void method that will print of joke of your choice to the console
    public static void printJoke() {
        System.out.println("This is a joke.");
    }

    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents
    public static int convertSec (int years) {
        return years * 31557600;
    }

    // 5) Create a varargs method that will return the length of the varargs array passed in
    public static int printLength(String... arr) {
        return arr.length;
    }
}
