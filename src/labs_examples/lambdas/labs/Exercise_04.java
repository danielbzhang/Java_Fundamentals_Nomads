package labs_examples.lambdas.labs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Lambdas Exercise 4:
 * <p>
 * Stream API Labs
 * <p>
 * 1) Demonstrate the use of the range function to print out the numbers 1 through 15 (inclusive)
 * 2) Demonstrate the use of the sum function to determine the range of a set of numbers.
 * 3) Demonstrate the use of the map() function to alter each int in a List of Integers, then use the sum function
 * to get the sum of the modified list
 * 4) Demonstrate the filter function by filtering out all Integers that are less than 10 - then use the average
 * function to average the remaining numbers, assign this result to an int variable.
 * 5) Demonstrate the reduce() function to determine the sum of a list of Integers
 * 6) Demonstrate how to Stream a text file and print out each line
 * 7) Demonstrate how to Stream the stream_text_lab.csv file in this package. Split the lines into String arrays,
 * then print out the element at the 1 index for each array.
 * 8) Demonstrate how to Stream the stream_text_lab.csv file in this package. Split the lines into String arrays,
 * then print out the sum of all elements at index 2.
 * 9) Demonstrate the anyMatch() function.
 * 10) Demonstrate the allMatch() function.
 * 11) Demonstrate the collect() terminal operation to store resulting values into a List
 */

class Example {
    public static void main(String[] args) throws IOException {
        // 1
//        IntStream.range(1, 16).forEach(System.out :: print);

        // 2
        int sum = IntStream.range(1, 10).sum();
//        System.out.println(sum);

        // 3
        int sum2 = IntStream.range(1, 10).map(x -> x * x).sum();
//        System.out.println(sum2);

        // 4
//        Arrays.stream(new int[]{2, 3, 14, 56, 100}).filter(x -> x > 10).average().ifPresent(System.out::println);

        // 5
        int sum3 = IntStream.range(1, 20).reduce(0, (int a, int b) -> a + b);
//        System.out.println(sum3);

        // 6
        String fileAddress = "src/labs_examples/lambdas/labs/stream_text_lab.csv";
        Stream<String> file = Files.lines(Paths.get(fileAddress));
//        file.forEach(System.out :: println);

        // 7
//        file.map(x -> x.split(","))
//                .filter(x -> x.length == 3)
//                .forEach(x -> System.out.println(x[1]));

        // 8
        file.map(x -> x.split(","))
                .filter(x -> x.length == 3)
                .forEach(x -> System.out.println(x[2]));
//                .collect(Collectors.toList());
//                .reduce(0.0, (a, b) -> a + Double.parseDouble(b));

        // 9
        List<Integer> list = Arrays.asList(3, 4, 5, 16, 7, 68, 29);
        boolean answer1 = list.stream().anyMatch(x -> x % 5 == 0);
        System.out.println(answer1);

        // 10 (keep using the list above)
        boolean answer2 = list.stream().allMatch(x -> x%3 == 0);
        System.out.println(answer2);

        // 11
        Stream<String> result = Files.lines(Paths.get(fileAddress));
        Map<String, Double> map = new HashMap<>();
        map = result
                .map(x -> x.split(","))
                .collect(Collectors.toMap(
                        x -> x[0],
                        x -> Double.parseDouble(x[2])
                ));
        file.close();
        for (String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
    }
}
