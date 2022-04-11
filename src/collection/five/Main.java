package collection.five;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<Integer,Person> aprtmn 
		= new HashMap<Integer, Person>();
		
		int choose=0;
		int daireNumarasi;
		boolean exitFlag=false;
		while(true) {
			System.out.println("Lütfen Secim Yapiniz:");
			choose = scanner.nextInt();
			switch(choose) {
			case 1:
				//kiþi atama
				System.out.println("Lutfen Daire Numarasi Giriniz:");
				daireNumarasi =  scanner.nextInt();
				//soru???
				setPerson(aprtmn, daireNumarasi);
				break;
			case 2:
				//listele
				print(aprtmn);
				break;
			case -1:
				//cikis
				System.out.println("Cikis yapiliyor..");
				exitFlag=true;
				break;
			default:
				System.out.println("Yanlis islem");
			}
			
			if(exitFlag) {
				break;
			}
			
		}
		

	}

	public static void setPerson(HashMap<Integer,Person> aprtmn,
			int daireNumarasi) {
		Person person = new Person("AAAA", "bbbb", 30);
		aprtmn.put(daireNumarasi, person);
		System.out.println("Kisi Eklendi..");
	}

	public static void print(HashMap<Integer,Person> aprtmn) {
		
		for(int i=1;i<21;i++) {
			if((i-1)%4==0) {
				System.out.println();
			}
			if(aprtmn.containsKey(i)) {
			System.out.print(aprtmn.get(i).getName());
			}else {
				System.out.print("*");
			}
		}
		System.out.println();
	}
}
