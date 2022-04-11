package homework.eight.three;

import java.util.Arrays;
import java.util.Date;

public class Book extends Document{
	private String title;
	
	public Book(String title, String[] authors , Date date) {
		super(authors,date);
		this.title = title;
	}
	
	public Book() {
		super(new String[5],new Date());
	}

	public String getTitle() {
		return title;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", getAuthors()=" + Arrays.toString(getAuthors()) + ", getDate()=" + getDate()
				+ "]";
	}
	
	
}
