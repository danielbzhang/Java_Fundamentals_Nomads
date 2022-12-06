package labs_examples.exception_handling.labs;

public class ExceptionA {
    public static void main(String[] args) {
        double[] nums = {1.2, 2.3, 94.5, 0};
        try{
            double b = nums[2]/nums[3];
            System.out.println(b);
            try{
                double a = nums[5];
            } catch (ArrayIndexOutOfBoundsException exc) {
                System.out.println("Out of bounds!");
            }
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Index Array out of bounds!");
        } catch (Exception exc) {
            exc.toString();
        } finally {
            System.out.println("Finally claus!");
        }
    }


}
