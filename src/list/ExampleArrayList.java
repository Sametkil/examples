package list;

import java.util.ArrayList;
import java.util.Iterator;

public class ExampleArrayList {

	public static void main(String[] args) {
		//null olursa exp fýrlar
		ArrayList<String> days = new ArrayList<>();
		days.add("Monday");
		days.add("Tuesday");
		days.add("Wednesday");
		days.add("Thursday");
		days.add("Friday");
		days.add("Saturday");
		days.add("Sunday");
		
		System.out.println("ArrayList : "+ days);
		
		days.add("Burak");
		
		System.out.println("ArrayList : "+ days);
		
		//listeyi temizler
		//days.clear();
		//System.out.println("ArrayList : "+ days);
		
		ArrayList<String> testDays = (ArrayList<String>) days.clone();
		System.out.println("TestArrayList: "+ testDays);
		
		System.out.println(days.equals(testDays));
		
		testDays.addAll(days);
		System.out.println("TestArrayList: "+ testDays);
		
		System.out.println("Contains Monday : " + days.contains("Monday"));
		
		
		
		System.out.println("2. index: "+days.get(2));
		
		System.out.println(days.indexOf("Wednesday") + ". index");
		
		System.out.println("Size : "+days.size());
	
		days.remove("Wednesday");
		System.out.println(days);
		
		for(String stringVal : days) {
			System.out.print(stringVal+",");
		}
		
		Iterator<String> iterator = days.iterator();
		System.out.println();
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+","); 
		}
		System.out.println();
		 days.add(5, "Duman");
		 for(String stringVal : days) {
				System.out.print(stringVal+",");
			}
	}

	
}
