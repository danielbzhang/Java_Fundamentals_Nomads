package labs_examples.static_nonstatic.labs;

public class ClassA {
    public static void main(String[] args) {

    }

    public static void staticMethod1() {
        System.out.println("Calling staticMethod1!!");
        staticMethod2();
    }

    public static void staticMethod2() {
        System.out.println("Calling staticMethod2!!");
        ClassA objA = new ClassA();
        double result = objA.nonStaticMehod1(3,4);
        System.out.println(result);
    }

    public double nonStaticMehod1(double a, double b) {
        return a + b;
    }
}
