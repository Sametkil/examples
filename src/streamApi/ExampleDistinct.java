package streamApi;

import java.util.ArrayList;
import java.util.List;

public class ExampleDistinct {

	public static void main(String[] args) {
		List<String> names= new ArrayList<String>();
		names.add("aaaa");
		names.add("aaaa");
		names.add("aaaa");
		names.add("bbbb");
		names.add("bbbb");
		names.stream()
		.distinct()
		.filter(s -> s.contains("a"))
		.sorted()
		.forEach(System.out::println);
		System.out.println(names);

	}

}
