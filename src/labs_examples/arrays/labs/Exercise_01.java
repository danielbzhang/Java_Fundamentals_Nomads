package labs_examples.arrays.labs;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {

    public static void main(String[] args) {
        int[] myArr = new int[10];

        for (int i = 0; i < myArr.length; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();

            myArr[i] = num;
        }
        System.out.println(Arrays.toString(myArr));

        int sum = 0;
        for(int n: myArr) {
            sum += n;
        }
        System.out.println("sum = " + sum);
        System.out.println("average = " + (sum / myArr.length));
    }

}