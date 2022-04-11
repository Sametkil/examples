package collection.four;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	//employee classý name,surname,salary field
	//5 objeli liste
	//listeyi maaþa göre sýrala (büyükten küçüðe)
	public static void main(String[] args) {
		Student student = new Student("aaaa", "bbbb", 5000);
		Student student3 = new Student("ffff","gggg",3000);
		Student student2= new Student("dddd","eeee",9000);
		
		List<Student> studentList = new ArrayList<Student>();
		
		studentList.add(student);
		studentList.add(student3);
		studentList.add(student2);
		
		
		for(Student s : studentList) {
			System.out.println(s.getName() + "-"+s.getSurname()+"-"+s.getNumber());
		}
		
		Collections.sort(studentList);
		System.out.println("Sorting...");
		for(Student s : studentList) {
			System.out.println(s.getName() + "-"+s.getSurname()+"-"+s.getNumber());
		}
		
		Collections.sort(studentList,Collections.reverseOrder());
		System.out.println("Reverse Sorting...");
		for(Student s : studentList) {
			System.out.println(s.getName() + "-"+s.getSurname()+"-"+s.getNumber());
		}
	}

}
