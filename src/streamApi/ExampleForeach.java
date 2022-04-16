package streamApi;

import java.util.ArrayList;
import java.util.List;

public class ExampleForeach {

	public static void main(String[] args) {
		List<String> names= new ArrayList<String>();
		names.add("aaaa");
		names.add("aaaa");
		names.add("aaaa");
		names.add("bbbb");
		names.add("bbbb");
		names.stream().forEach(System.out::println);
		//names.stream().forEach((n) ->System.out.println(n));


	}

}
