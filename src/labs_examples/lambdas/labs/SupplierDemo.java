package labs_examples.lambdas.labs;

import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {

    }

    private static void printNames(Supplier<String> arg) {
        System.out.println(arg.get());
    }

    private static void listBeginWith(List<String>list, Predicate<String> valid) {

    }

}
