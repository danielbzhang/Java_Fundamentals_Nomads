package labs_examples.generics.labs;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Generics Exercise 3:
 * <p>
 * 1) Write a generic method that accepts two generic arguments. This generic method should only accept
 * arguments which are sublasses of Number. The generic method must return the sum (as a double) of whatever two
 * numbers were passed in regardless of their type.
 * <p>
 * 2) Write a generic method to count the number of elements in a "Collection" of Strings that are palindromes
 * <p>
 * 3) Write a generic method to exchange the positions of two different elements in an array.
 * <p>
 * 4) Write a generic method to find the largest element within the range (begin, end) of a list.
 */

class GenericExample2 {
    public static void main(String[] args) {

    }

    public static <T extends Number, U extends Number> double addDouble(T a, U b) {
        return a.doubleValue() + b.doubleValue();
    }

    public static <T> int countPalin(Collection<T> c) {
        int count = 0;
        for (T ele : c) {
            if (isPalindrome((String) ele)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isPalindrome(String str) {
        String rev = "";
        boolean result = false;

        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        if (str.equals(rev)) {
            result = true;
        }

        return result;
    }
}