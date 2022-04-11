package collection.one;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	ArrayList<Integer> list = new ArrayList<>(); 
    	
    	
    	System.out.println("Length Enter : ");
    	int length =  scanner.nextInt();
    
    	//Listeye ekleme işlemi
    	for(int i=0;i<length;i++) {
    		System.out.println("Enter Number:");
    		int number = scanner.nextInt();
    		list.add(number);
    	}
    	
    	System.out.println("Max : "+ findMax(list));
    	System.out.println("Min : "+ findMin(list));
    	System.out.println("Average : "+ findAverage(list));
    	
    }
    
    public static Integer findMax(ArrayList<Integer> list) {
    	int maxNumber=list.get(0);
    	for(int i=0;i<list.size();i++) {
    		if(maxNumber<list.get(i)) {
    			maxNumber=list.get(i);
    		}
    	}
    	return maxNumber;
    }
    
    public static Integer findMin(ArrayList<Integer> list) {
    	int minNumber=list.get(0);
    	for(int i=0;i<list.size();i++) {
    		if(minNumber>list.get(i)) {
    			minNumber=list.get(i);
    		}
    	}
    	return minNumber;
    }
    
    public static Integer findAverage(ArrayList<Integer> list) {
    	int average=0;
    	for(int i=0;i<list.size();i++) {
    		average += list.get(i);
    	}
    	return average/list.size();
    }
}
