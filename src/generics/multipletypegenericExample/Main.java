package generics.multipletypegenericExample;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Key : ");
        String key = scanner.next();
        System.out.println("Enter Value : ");
        int value = scanner.nextInt();
        KeyValuePair<String,Integer> keyValuePair = new KeyValuePair<>(key,value);
        System.out.println(keyValuePair.getKey());
        System.out.println(keyValuePair.getValue());
        keyValuePair.displayInfo();

        KeyValuePair<Integer,Integer> keyValuePair2 = new KeyValuePair<>(value,value);
        System.out.println(keyValuePair.getKey());
        System.out.println(keyValuePair.getValue());
        keyValuePair.displayInfo();
    }
}
