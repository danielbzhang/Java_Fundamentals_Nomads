package labs_examples.generics.labs;

/**
 * Generics Exercise 1:
 *      1.) Write a generic class with at least two instance variables, a constructor, and getter and setter methods.
 *      2.) Create a few objects of your generic class with different data types to demonstrate it's
 *          dynamic usage.
 */

class GenericExample1 <T, U> {

    T val1;
    U val2;

    public GenericExample1(T val1, U val2) {
        this.val1 = val1;
        this.val2 = val2;
    }

    public T getVal1() {
        return val1;
    }

    public void setVal1(T val1) {
        this.val1 = val1;
    }

    public U getVal2() {
        return val2;
    }

    public void setVal2(U val2) {
        this.val2 = val2;
    }
}

class Main {
    public static void main(String[] args) {
        GenericExample1<Double, String> a = new GenericExample1<>(1.1, "Nick");
        GenericExample1<Integer, Boolean> b = new GenericExample1<>(308, true);

        System.out.println(a.getVal1());
        System.out.println(a.getVal2());

        System.out.println(b.getVal2());
    }
}