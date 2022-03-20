package oop;

public class ExampleString {

	public static void main(String[] args) {
		String text = "   TODO Auto-generated method stub";
		String text2="";
		String text3= new String("duman");
		
		System.out.println("length :" + text.length());
		System.out.println("isEmpty :"+ text.isEmpty());
		System.out.println("isEmpty :"+ text2.isEmpty());
		String text4= new String("Duman");
		//dönüþ

		System.out.println("isEquals : "+ (text3==text4));
		System.out.println("isEquals : "+ (text3.equals(text4)));
		System.out.println("isEqualsWithIgnoreCase : "
		+ (text3.equalsIgnoreCase(text4)));
		
		System.out.println("startWith : "+ text.startsWith("TODO"));
		
		System.out.println("indexOf : "+ text.indexOf("O",2));
		
		
		System.out.println("subString : "+ text.substring(5,9));
		
		
		System.out.println("lowercase : "+ text.toLowerCase());
		System.out.println("uppercase : "+ text.toUpperCase());
		
		System.out.println("trim :"+ text.trim());
		
		
		System.out.println("replace : "+ text.replace("Auto", "Burak"));
		
		System.out.println("concat :"+ text.concat("burakDuman"));
		
		//split
		System.out.println("join : " + text.join("+",text, "burak","duman","abvb"));
		System.out.println("text : "+ text);
	
	}
	
}
