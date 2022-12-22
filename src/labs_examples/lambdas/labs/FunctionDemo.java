package labs_examples.lambdas.labs;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        String[] countries = {"US", "UK", "AUS", "CAN", "ITA"};
        Function<String[], String> converter = (lst) -> {
            String names = "";
            for(String c : lst) {
                names += c + " ";
            }
            return names;
        };

        System.out.println(converter.apply(countries));
    }
}
