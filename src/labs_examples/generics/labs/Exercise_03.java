package labs_examples.generics.labs;

import java.util.ArrayList;
import java.util.Arrays;
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
        // test 1
        System.out.println(addDouble(1, 25));

        // test 2
        Collection<String> arr = Arrays.asList("abba", "101", "vl");
        System.out.println(countPalin(arr));

        // test 3
        Character[] charArr = {'a', 'b', 'c', 'd', 'e'};
        swap(charArr, 1,3);

        // test 4
        Double[] doubleArr = {1.1, 3.3, 4.0, 10.26, -2.98, 0.0, 45.83};
        System.out.println(max(doubleArr, 1, 6));
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

    public static <T> void swap(T[] arr, int pos1, int pos2) {
        T temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;

        System.out.println("arr after swapping: " + Arrays.toString(arr));
    }

    public static <T extends Comparable<T>> T max(T[] arr, int begin, int end) {
        T maxEle = arr[begin];
        for (int i = begin+1; i <= end; i++) {
            if (maxEle.compareTo(arr[i]) < 0) {
                maxEle = arr[i];
            }
        }
        return maxEle;
    }
}