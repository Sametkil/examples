package streamApi.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ExampleOne {
    public static void main(String[] args) {
        List<Object> objectsList = new ArrayList<>();
        objectsList.add("Test");
        objectsList.add(523);
        objectsList.add(334);
        objectsList.add("Test2");
        objectsList.add(123);

        objectsList.stream()
                .filter(o -> o instanceof Integer)
                .sorted()
                .forEach(System.out::println);
    }
}
