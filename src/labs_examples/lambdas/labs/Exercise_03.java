package labs_examples.lambdas.labs;

import java.lang.invoke.MethodHandle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

import static labs_examples.lambdas.labs.MethodReference.findNumbers;

/**
 * Lambdas Exercise 3:
 *
 *      1) Demonstrate the use of a static method reference
 *      2) Demonstrate the use of an instance method reference
 *      3) Demonstrate the use of a constructor reference
 *
 */

class MethodReference {
    public static boolean isMoreThanFifty(int num1, int num2) {
        return (num1 + num2) > 50;
    }

    public static List<Integer> findNumbers(List<Integer> lst, BiPredicate<Integer, Integer> p) {
        List<Integer> newList = new ArrayList<>();
        for(Integer i : lst) {
            if(p.test(i, i+10)) {
                newList.add(i);
            }
        }
        return newList;
    }
}

class MethodReferenceController{
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12, 5, 45, 18, 33, 24, 40);

        // Using a lambda expression
        findNumbers(list, (i1, i2) -> MethodReference.isMoreThanFifty(i1, i2));
        // Using a method reference
        System.out.println(findNumbers(list, MethodReference :: isMoreThanFifty));
    }
}