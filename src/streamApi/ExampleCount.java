package streamApi;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class ExampleCount {
    public static void main(String[] args) {

        //IntStream.range(18, 25).forEach(System.out::println);
        long x = IntStream.range(18, 25).count();
        System.out.println(x);


    }
}
