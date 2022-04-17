package collection.seven;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("burak","duman",30);
        Person person2 = new Person("hasan","huseyin",24);
        Person person3 = new Person("Enes","Sanli",25);

        List<Person>personList= Arrays.asList(person,person2,person3);

        System.out.println(personList);
        System.out.println("Sorting....");
        personList.sort(personAgeComparator);
        System.out.println(personList);
    }
    private static Comparator<Person> personAgeComparator = new Comparator<Person>() {
        //negatifse o2>o1
        //pozitifse o1>o2
        //eşitse o1=o2
        //doğal ascii
        @Override
        public int compare(Person o1, Person o2) {
            System.out.println("o1 : "+o1.getAge()+" o2 : "+o2.getAge());
            if(o1.getAge()>o2.getAge())
                return 1;
            else if(o1.getAge() == o2.getAge())
                return 0;
            else
                return -1;
        }
    };
}
