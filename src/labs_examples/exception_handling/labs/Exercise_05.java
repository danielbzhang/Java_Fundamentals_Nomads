package labs_examples.exception_handling.labs;

import java.util.Arrays;

/**
 * Exception Handling Exercise 5:
 *
 *      Demonstrate how to throw an exception.
 *
 */

class Example {

    public static void main(String[] args) {
        try {
            methodOne();
        } catch (ExceptionExample exc) {
            exc.toString();
        }

    }

    public static void methodOne() throws ExceptionExample {
        try{
            methodTwo();
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println(exc.toString());
        }

    }

    public static void methodTwo() throws ArrayIndexOutOfBoundsException {
        int[] nums = {0,1,2,3};
//        try{
//            int x = nums[7];
//        } catch (ArrayIndexOutOfBoundsException exc) {
//            System.out.println("Exception caught in methodTwo");
//            throw exc;
//        }

        int x = nums[8];
        System.out.println(x);
    }

}

class ExceptionExample extends Exception{
    @Override
    public String toString() {
        return "Customized Exception!";
    }
}