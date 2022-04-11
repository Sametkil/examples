package homework.eight.three;

import java.util.Date;

public class Document {
	private String[] authors;
	private Date date;
	
	
	public Document(String[] authors, Date date) {
		this.authors = authors;
		this.date = date;
	}
	
	public void addAuthors(String[] authors) {
		this.authors=authors;
	}
	public String[] getAuthors() {
		return authors;
	}
	public Date getDate() {
		return date;
	}
	
	
}
