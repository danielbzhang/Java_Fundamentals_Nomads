package labs_examples.arrays.labs;

/**
 *  Traversing Arrays Backwards
 *
 *      Please create and populate an array of your choosing. Then, please demonstrate how to print out every other
 *      element in the array in reverse order.
 *
 */

public class Exercise_05 {
    public static void main(String[] args) {

        int[] arr = new int[7];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i *3;
            System.out.print(arr[i] + " ");
        }

        for (int i =  arr.length - 1; i >= 0; i-=2) {
            System.out.println(arr[i]);
        }
    }

}
