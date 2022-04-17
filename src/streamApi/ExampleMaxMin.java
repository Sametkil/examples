package streamApi;

import java.util.Arrays;
import java.util.List;

public class ExampleMaxMin {
    public static void main(String[] args) {
        System.out.println("---Min and Max for Integer---");
        List<Integer> numList = Arrays.asList(42, 44, 43, 41);

        //For min
        numList.stream().reduce(Integer::min).ifPresent(s -> System.out.println(s)); //41
        //For max
        numList.stream().reduce(Integer::max).ifPresent(s -> System.out.println(s)); //44

        System.out.println("---Min and Max for String---");
        List<String> list = Arrays.asList("Mohit", "Nilesh", "Shankar", "Brajesh");

        //For min
        list.stream().reduce((s1, s2) -> {
            if (s1.compareTo(s2) <= 0) {
                return s1;
            }
            return s2;
        }).ifPresent(s -> System.out.println(s)); //Brajesh

        //For max
        list.stream().reduce((s1, s2) -> {
            if (s1.compareTo(s2) >= 0) {
                return s1;
            }
            return s2;
        }).ifPresent(s -> System.out.println(s)); //Shankar
    }
}
