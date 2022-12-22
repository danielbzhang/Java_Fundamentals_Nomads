package labs_examples.lambdas.labs;

/**
 * Lambdas Exercise 1:
 *
 *    x  1) Demonstrate creating a functional interface with an abstract method that takes no parameters and returns void
 *    x  2) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *    x  3) Demonstrate creating a functional interface with an abstract method that takes 1 parameter and returns a
 *          value of the same type as the parameter
 *    x  4) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *   x   5) Demonstrate creating a functional interface with an abstract method that takes 2 parameters and returns a
 *          value
 *   x   6) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      7) Demonstrate the use of at least two built-in functional interfaces from the java.util.function package.
 *
 */
@FunctionalInterface
interface Exercise_02_02{
    public String method3(String a, String b);
}

@FunctionalInterface
public interface Exercise_01 {
    public void method1();
}

class FuncInterDemo{
    public static void main(String[] args) {
        Exercise_01 test1 = () -> System.out.println("calling method1...");
        test1.method1();

        Exercise_01 test2 = new Exercise_01() {
            @Override
            public void method1() {
                System.out.println("Inner class with Functional Interface!");
            }
        };

        Exercise_01_02 test3 = (String a) -> {return "Hello " + a;};
        System.out.println(test3.method2("Nick"));

        Exercise_01_02 test4 = new Exercise_01_02() {
            @Override
            public String method2(String a) {
                return "Sup" + a;
            }
        };

        Exercise_02_02 test5 = (String a, String b) -> a + b;
        System.out.println(test5.method3("Hello", "Bob"));

        Exercise_02_02 test6 = new Exercise_02_02() {
            @Override
            public String method3(String a, String b) {
                return a + b;
            }
        };

    }

}