package labs_examples.arrays.labs;

import java.util.Arrays;

/**
 *  2D Array
 *
 *      Creat and populate a 5x5 2D array with multiples of 3, starting with 3. Once populated, print out the results.
 *
 *      The output should look something like this:
 *
 *      3 6 9 12 15
 *      18 21 24 27 30
 *      ...
 *      ...
 *      ...
 *
 */

public class Exercise_03 {

    public static void main(String[] args) {

        int[][] arr = new int[5][5];
        int a = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = 3 * a;
                a ++;
                System.out.print(arr[i][j] + " ");
            }
//            System.out.print(Arrays.toString(arr[i]));
            System.out.println(" ");
        }
        
    }
}
