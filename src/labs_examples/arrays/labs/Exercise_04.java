package labs_examples.arrays.labs;

/**
 *  Irregular Arrays
 *
 *      Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {
    public static void main(String[] args) {
        char[][] myArr = {{'a', 'b', 'c'}, {'d', 'e'}};

        for(char[] c: myArr) {
            for(char ci: c) {
                System.out.print(ci + " ");
            }
            System.out.println(" ");
        }
    }

}
