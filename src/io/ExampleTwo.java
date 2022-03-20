package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ExampleTwo {

	//öğrenci adı , vize1,vize2,final
	//vize*0.2+vize2*0.2+final*0.6 harf karşılığı
	//farklı dosyaya sonuç yaz
	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(new BufferedReader(
				new FileReader("studentGrade.txt")));
				BufferedWriter writer = 
						new BufferedWriter(
								new FileWriter("studentAverageGrade.txt"))) {
			while(scanner.hasNextLine()) {
				String studentInfo = scanner.nextLine();
				String[]arrayStudent= studentInfo.split(",");
				Integer midterm1= Integer.parseInt(arrayStudent[1]);
				Integer midterm2= Integer.parseInt(arrayStudent[2]);
				Integer finalGrade= Integer.parseInt(arrayStudent[3]);
				String grade= calculateGrade(midterm1,midterm2,finalGrade);
				writer.write(studentInfo+","+grade+"\n");
			}
		}catch(IOException ex) {
			ex.printStackTrace();
		}
	}
	
	public static String calculateGrade(int midterm1, int midterm2, int finalGrade) {
		float average = (float) ((midterm1*0.2)+(midterm2*0.2)+(finalGrade*0.6));
		if(average>=90) {
			return "AA";
		}else if(average<90 && average>=85){
			return "BA";
		}else if(average<85 && average>=80){
			return "BB";
		}else if(average<80 && average>=75){
			return "CB";
		}else if(average<75 && average>=70){
			return "CC";
		}else if(average<70 && average>=65){
			return "DC";
		}
		else if(average<65 && average>=60){
			return "DD";
		}
		else if(average<60 && average>=55){
			return "FD";
		}else{
			return "FF";
		}
		
	}

}
