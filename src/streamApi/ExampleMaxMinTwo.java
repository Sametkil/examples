package streamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ExampleMaxMinTwo {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("Mahesh", 30),
                new User("Krishna", 29),
                new User("Virat", 28)
        );

        System.out.println("---Min and Max on the basis of user name---");

        users.stream()
                .min(Comparator.comparing(u -> u.getUserName()))
                .ifPresent(e -> System.out.println("Min: " + e.getUserName()));

        users.stream()
                .max(Comparator.comparing(u -> u.getUserName()))
                .ifPresent(e -> System.out.println("Max: " + e.getUserName()));

        System.out.println("---Min and Max on the basis of age---");
        users.stream()
                .min(Comparator.comparing(User::getAge))
                .ifPresent(e -> System.out.println("Min: " + e.getUserName()));

        users.stream()
                .max(Comparator.comparing(User::getAge))
                .ifPresent(e -> System.out.println("Max: " + e.getUserName()));
    }
}
