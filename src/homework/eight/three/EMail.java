package homework.eight.three;

import java.util.Arrays;
import java.util.Date;

public class EMail extends Document{
	private String subject;
	private String[] to;
	
	public EMail(String[] to, String subject, String[] authors , Date date) {
		super(authors,date);
		this.subject =  subject;
		this.to = to;
	}
	
	public String getSubject() {
		return subject;
	}
	public String[] getTo() {
		return to;
	}

	@Override
	public String toString() {
		return "EMail [subject=" + subject + ", to=" + Arrays.toString(to) + ", getAuthors()="
				+ Arrays.toString(getAuthors()) + ", getDate()=" + getDate() + "]";
	}
	
	
	
}
