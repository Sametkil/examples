package collection.three;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0;i<9;i++) {
			System.out.println("Enter Number:");
			int number = scanner.nextInt();
			
			if(map.keySet().contains(number)) {
				map.put(number, map.get(number)+1);
			}else {
				map.put(number, 1);
			}
		}
		
		Map.Entry<Integer, Integer> result = null;
		
		for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
			if(result ==null) {
				result = entry;
			}else {
				if(entry.getValue()>result.getValue()) {
					result= entry;
				}
			}
		}
		
		
		System.out.println("Result : "+ result.getKey() + " - "+ result.getValue());

	}

}
