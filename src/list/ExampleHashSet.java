package list;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ExampleHashSet {

	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<>();

		hashSet.add("Ekin");
		hashSet.add("Burak");
		hashSet.add("Serhat");
		hashSet.add("Taner");
		//hashSet.add("Taner");
		
		System.out.println(hashSet);
		
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("Ekin");
		treeSet.add("Burak");
		treeSet.add("Serhat");
		treeSet.add("Taner");
		treeSet.add("burak");
		System.out.println(treeSet);
		
		
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
		linkedHashSet.add("Ekin");
		linkedHashSet.add("Burak");
		linkedHashSet.add("Serhat");
		linkedHashSet.add("Taner");
		linkedHashSet.add("burak");
		System.out.println(linkedHashSet);

	}

}
