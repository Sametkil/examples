package streamApi;

import java.util.stream.DoubleStream;

public class ExampleMapTwo {
    public static void main(String[] args){
        DoubleStream doubleStream = DoubleStream.of(0.7, 8.2, 0.1, 6.2);
        doubleStream.mapToInt(v -> (int) v).forEach(System.out::println);
    }
}
