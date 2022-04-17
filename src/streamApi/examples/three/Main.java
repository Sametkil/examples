package streamApi.examples.three;

import streamApi.examples.two.Person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("11aa11","2222",20);
        Person person2 = new Person("3333","4444",14);
        Person person3 = new Person("5555","6666",30);
        Person person4 = new Person("7777","8888",45);
        Person person5 = new Person("99aa99","1010",45);

        List<Person> personList = Arrays.asList(person,person2,person3,person4,person5);
        /*
        List<Person> result = personList.stream()
                .filter(p -> p.getAge()>15 && p.getName().contains("a"))
                .collect(Collectors.toList());

        System.out.println(result);

         */
        personList.stream()
                .filter(p -> p.getAge()>15 && p.getName().contains("a"))
                .forEach(System.out::println);
    }
}
