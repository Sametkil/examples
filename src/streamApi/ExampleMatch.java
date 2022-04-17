package streamApi;

import java.util.Arrays;
import java.util.List;

public class ExampleMatch {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ahmet", "Burak", "Duman","Berke");
        boolean isNoneMatch = names.stream().noneMatch(n -> n.contains("z"));
        System.out.println("isNoneMatch : "+isNoneMatch);
        boolean isAllMatch = names.stream().allMatch(n -> n.contains("a"));
        System.out.println("isAllMatch : "+isAllMatch);
        boolean isAnyMatch = names.stream().anyMatch(n -> n.contains("a"));
        System.out.println("isAnyMatch : "+isAnyMatch);
    }
}
