import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.Collections.reverseOrder;

public class Main {
    public Comparator<Integer> reverseSort = new Comparator<Integer>() {
        @Override
        public int compare(Integer int1, Integer int2) {
            return int2.compareTo(int1);
        }
    };

    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(1, 3, 9, 4, 5, 6, 2, 7, 8);

//      Filter even numbers from list
        numList.stream().filter((a) -> a % 2 == 0).sorted().forEach(System.out::print);
        System.out.println();
//
//      Sort integers
        numList.stream().sorted().forEach(System.out::print);
        System.out.println();

//      Sorting elements in reverse order
        numList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::print);
        System.out.println();

//      Sorting a stream of integers using a custom Comparator
        numList.stream().sorted(reverseOrder()).forEach(System.out::print);

        System.out.println();
        System.out.println("Sorting using Lambda Expressions");

//      Sorting using Lambda Expressions
        numList.stream().sorted((i1, i2) -> i1.compareTo(i2)).forEach(System.out::print);


    }


}
