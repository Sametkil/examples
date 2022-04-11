package streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExampleFilter {

	public static void main(String[] args) {
		List<String> name = Arrays.asList("Ahmet", "Burak", "Duman","Berke");
		List<String> result = name.stream()
				.filter(s -> s.startsWith("B"))
				.filter(s -> s.contains("e"))
				.collect(Collectors.toList());
		System.out.println(result);
		System.out.println(name);
		
		List<String>result2 = new ArrayList<String>();
		for(String s : name) {
			if(s.startsWith("B")) {
				result2.add(s);
			}
		}
		System.out.println(result2);

	}

}
