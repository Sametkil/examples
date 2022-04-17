package streamApi.examples.two;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("1111","2222");
        Person person2 = new Person("3333","4444");
        Person person3 = new Person("5555","6666");
        Person person4 = new Person("7777","8888");
        Person person5 = new Person("9999","1010");
        /*
        List<Person> personList = Arrays.asList(person,person2,person3,person4
        ,person5); */
        List<Person> personList = new ArrayList<>();
        personList.add(person);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        personList.add(person5);

        List<String> result = personList.stream()
                //.map(p -> p.toString())
                .map((p) -> p.getName() + " " + p.getSurname())
                .collect(Collectors.toList());
        System.out.println("Person List : " +personList);
        System.out.println(result);
    }
}
