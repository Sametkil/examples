package collection.seven;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ExampleMain {

    public static void main(String[] args) {
        Integer number = 10;
        Integer number2= 20;
        List<Integer>integerList = Arrays.asList(number,number2);
        System.out.println(number.compareTo(number2));
        integerList.sort(Comparator.comparing(Integer::intValue));
        System.out.println(integerList);
    }
}
