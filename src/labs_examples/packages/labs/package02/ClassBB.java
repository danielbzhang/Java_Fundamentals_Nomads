package labs_examples.packages.labs.package02;

import labs_examples.packages.labs.package01.ClassAA;

public class ClassBB {
    public static void main(String[] args) {
        methodB1();
    }

    protected static void methodB1() {
        System.out.println("Calling methodB1...");
        ClassAA.methodA3();
    }

    public static int methodB2(int a, int b) {
        return a + b;
    }
}
