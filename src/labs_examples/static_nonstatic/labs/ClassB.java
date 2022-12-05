package labs_examples.static_nonstatic.labs;

public class ClassB {
    public static void main(String[] args) {
        staticMethodB1();
    }

    public static void staticMethodB1() {
        System.out.println("Calling static methodB1");
        ClassA.staticMethod1();

        ClassA objA = new ClassA();
        double result = objA.nonStaticMehod1(5,5);
        System.out.println(result);
    }
}
