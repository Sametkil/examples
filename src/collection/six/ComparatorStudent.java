package collection.six;

import java.util.Comparator;

public class ComparatorStudent {
    //Person class ı name surname age . comparator yazın. main 5 tane elemanlı listede age büyükten kçük
    public static Comparator<Student> studentNameComparator = new Comparator<Student>() {
        /*
         * String studentName1.compareTo(String studentName2) metodunu kullanırız.
         * studentName1 < studentName2 ise negatif,
         * studentName1 = studentName2 ise 0 ,
         * studentName1 > studentName2 ise pozitif değer alır.
         */
        @Override
        public int compare(Student student, Student studentTwo) {
            String studentName1 = student.getName();
            String studentName2 = studentTwo.getName();
            return studentName1.compareTo(studentName2);
        }
    };

    public static Comparator<Student> studentIdComparator = new Comparator<Student>() {
        @Override
        public int compare(Student student, Student studentTwo) {
            int studentId = student.getId();
            int studentId2 = studentTwo.getId();
            return studentId-studentId2;
        }
    };
}
