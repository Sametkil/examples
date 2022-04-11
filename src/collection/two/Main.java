package collection.two;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
     
	
	 public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 HashSet<String> set = new HashSet<String>();
		
		 for(int i=0;i<5;i++) {
			 System.out.println("Enter String");
			 String stringVal = scanner.next();
			 set.add(stringVal);
		 }
		 
		 System.out.println("Result : " +set + " size:" +set.size());
		 
     }
}
