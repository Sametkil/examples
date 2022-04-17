package collection.six;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(10,"burak","duman");
        Student studentTwo = new Student(5,"test","test2S");
        Student studentThree = new Student(15,"abc","abcS");

        List<Student>studentList = new ArrayList<>();
        studentList.add(student);
        studentList.add(studentTwo);
        studentList.add(studentThree);

        studentList.sort(ComparatorStudent.studentIdComparator);
        System.out.println(studentList);

        //Comparator<Integer> comparator = Comparator.comparing(Integer::intValue);
        //Comparator.comparing(String::valueOf)
    }

}
