package labs_examples.objects_classes_methods.labs.methods;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodTraining {
    public static void main(String[] args) {
//        System.out.println(add(1.5, 2.5));
//        System.out.println(add(9, 1.1));

        int a = 4;
        int b = 9;
//        "pass by value"
//        System.out.println("a: " + a);
//        squareArea(a,b);
//        System.out.println("b: " + b);

        //"pass by reference"
        Person nick = new Person(36, 6.2, "Nick");
        System.out.println(nick.toString());

        addYearToPerson(nick);
        System.out.println(nick.toString());

        System.out.println(findMax(2,3,4,1));
        System.out.println(countCons("hello world"));
        System.out.println(isPrime(131071));

        int[] testArr = {-1,-3, -2, -100, 80};
        System.out.println(Arrays.toString(printHighestLowest(testArr)));

        System.out.println(intArrayList(10, 2, 3));
        System.out.println(Arrays.toString(reverseArr(testArr)));
    }
    // 1) Demonstrate method overloading in this class
    public static double add(int a, double b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static float add(float a, float b, float c) {
        return a + b + c;
    }

    public static int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    // 2) Demonstrate the difference between "pass by value" and "pass by reference"
    public static void squareArea(int a, int b) {
        a = 99;
        b = 100;
        System.out.println(a);
        System.out.println(b);
        System.out.println(a * b);
    }
//"pass by reference"
    public static void addYearToPerson(Person person) {
        person.age ++;
        System.out.println(person.age);
    }
    // Create a method that will return the largest of 4 numbers (all of which are passed in as arguments)
    public static double findMax(int a, int b, double c, double d) {
        double max = a;
        if(b > max) {
            max = b;
        }
        if(c > max) {
            max = c;
        }
        if(d > max) {
            max = d;
        }
        return max;
    }

    // Write a method to count all consonants (the opposite of vowels) in a String
    public static int countCons(String word) {
        int ct = 0;
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < vowels.length(); j++) {
                if(word.charAt(i) == vowels.charAt(j)) {
                    ct ++;
                }
            }
        }
        return ct;
    }

    // Write a method that will determine whether or not a number is prime
    public static boolean isPrime(int x) {
        for (int i = 2; i < x; i++) {
            if( x % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Write a method that will return a small array containing the highest and lowest numbers in a given numeric array,
    // which is passed in as an argument
    public static int[] printHighestLowest(int[] numbs) {
        int[] arr = new int[2];
        int max = numbs[0];
        int min = numbs[0];

        for (int i = 0; i < numbs.length; i++) {
            if(numbs[i] > max) {
                max = numbs[i];
            }
            if(numbs[i] < min) {
                min = numbs[i];
            }
        }
        arr[0] = max;
        arr[1] = min;

        return arr;
    }

    // Write a method that takes 3 arguments (int maxNum, int divisor1, int divisor2) and returns an Integer Arraylist.
    //        In this method create an Integer ArrayList and populate it with each number between zero and maxNum that is
    //        divisible by both divisor1 and divisor2. Then return this ArrayList. After calling this method, print out the
    //        length of the returned list

    public static ArrayList<Integer> intArrayList(int maxNum, int divisor1, int divisor2) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 1; i <= maxNum; i++) {
            if(i % divisor1 == 0 && i % divisor2 == 0) {
                result.add(i);
            }
        }
        return result;
    }

    // Write a method that will reverse an array in place use only one extra temp variable. For this exercise you cannot
    //        instantiate a second array. You must reverse the array in place using only one extra temp variable. Hint: this
    //        variable is used to temporarily store individual values in the array
    public static int[] reverseArr(int[] arr) {
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            int secondHalfIndex = arr.length - 1 - i;

            result[i] = arr[secondHalfIndex];
            result[secondHalfIndex] = temp;
        }
        for(int n: result) {
            System.out.print(n + " ");
        }
        return result;
    }
}
