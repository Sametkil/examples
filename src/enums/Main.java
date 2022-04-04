package enums;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		//System.out.println(CoffeeSize.LARGE);
		System.out.println(Day.FRIDAY);
		for(Day day : Day.values()) {
			System.out.println(
					day.getName()+"-" + day.getDayofWeek());
		}
	}
	List<Object>list = new ArrayList<Object>();
}
