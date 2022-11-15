package labs_examples.arrays.labs;

import java.util.Arrays;
import java.util.Scanner;

/**
 *  More labs_examples.arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        // write code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer btw 1 to 10: ");
        int num = scanner.nextInt();

//        System.out.println(String.format("Index of %d", num ) );
        for (int i = 0; i < array.length; i++) {
            if(num == array[i]) {
                System.out.println("Index is " + i);
                break;
            }
        }
    }
}