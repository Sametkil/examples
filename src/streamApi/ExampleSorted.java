package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExampleSorted {

	public static void main(String[] args) {
		List<String> name = Arrays.asList("Burak", "Taner","burak", "Duman","Ahmet");
		List<String> test = name.stream()
				.sorted()
				.collect(Collectors.toList());
		System.out.println(test);


	}

}
