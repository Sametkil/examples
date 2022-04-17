package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExampleMap {
    public static void main(String[] args){
        List<String> name = Arrays.asList("Yusuf", "Test");
        List<String> result =name.stream()
                .map(s -> s + " Burak")
                .collect(Collectors.toList());
        System.out.println(result);
        System.out.println(name);
    }
}
