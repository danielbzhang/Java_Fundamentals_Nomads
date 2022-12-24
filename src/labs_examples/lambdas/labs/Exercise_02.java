package labs_examples.lambdas.labs;

import java.util.ArrayList;
import java.util.function.*;

/**
 * Lambdas Exercise 2:
 *
 *      1) Demonstrate the use of 10 pre-built Functional Interfaces from the java.util.functions package. That's right,
 *      10 of them! You can do it! You'll know so much about them when you're done!
 *
 */

public class Exercise_02{
    public static void main(String[] args) {
        // Predicate<T> (returns only boolean)
        Predicate<Integer> isEven = (i) -> i % 2 == 0;
        System.out.println(isEven.test(9992));

        Predicate<String> isNick = (i) -> i.equalsIgnoreCase("Nick");
        System.out.println(isNick.test("niCKe"));

        Predicate<String> isLongEnough = (i) -> i.length() > 10;
        System.out.println(isLongEnough.test("Oregon State University"));

        // Function<T, R>  T is input type, R is return type
        Function<String, Integer> findLength = (s) -> s.length();
        System.out.println(findLength.apply("OregonState"));

        Function<Integer, Double> findArea = (x) -> (double) x * x / 2;
        System.out.println(findArea.apply(5));

        Function<String, String> greet = (s) -> "Hey " + s;
        System.out.println(greet.apply("Nick"));

        // Consumer<T> T is input type, return void
        Consumer<String> returnLength = (s) -> System.out.println(s.length());
        returnLength.accept("What am I doing here");

        Consumer<String> repeat = s -> System.out.println(s);
        repeat.accept("Repeat after me!");

        Consumer<Character> makeSentence = x -> System.out.println("I got a " + x + " for my Math final");
        makeSentence.accept('B');

        // Supplier<R>  no input
        Supplier<String> otps = () -> {
            String otp = "";
            for (int i = 0; i <= 4; i++) {
                otp += (int) (Math.random() * 10);
            }
            return otp;
        };
        System.out.println(otps.get());
        System.out.println(otps.get());

        // BiPredicate<T, U>  same as Predicate but with two inputs
        BiPredicate<Integer, Integer> sumIsEven = (a, b) -> (a+b) %2 == 0;
        System.out.println(sumIsEven.test(3,12));

        BiPredicate<String, String> isLonger = (a, b) -> (a.length() + b.length()) >= 10;
        System.out.println(isLonger.test("Nick", "Heck"));

        // BiFunction<T, U, R>  same as Function; T & U are method inputs & R is return type
        BiFunction<Integer, Integer, Double> findSum = (a, b) -> (double) a + b;
        System.out.println(findSum.apply(3, 4));

        BiFunction<String, Integer, String> exp = (a, b) -> a + b;
        System.out.println(exp.apply("Nick", 10));

        // BiConsumer<T, U>  same as Consumer<T> except that it has two input parameters
        BiConsumer<String, String> concatTwo = (a, b) -> System.out.println(a + " love " +b);
        concatTwo.accept("Nick", "drinking");

        BiConsumer<Integer, Double> addTwo = (a, b) -> System.out.println(a+b);
        addTwo.accept(10, 9.7);
    }
}