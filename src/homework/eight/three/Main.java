package homework.eight.three;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		String[] authors= new String[5];
		authors[0]="BBBBB";
		authors[4]="DDDDD";
		String[] to= new String[5];
		to[2]="1234";
		to[3]="12345";
		Book book = new Book("BookTitle",authors,new Date());
		EMail email = new EMail(to,"emailSubject",authors,new Date());
		
		System.out.println(book.toString());
		System.out.println(email.toString());

	}

}
