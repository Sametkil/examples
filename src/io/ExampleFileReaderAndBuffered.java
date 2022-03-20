package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ExampleFileReaderAndBuffered {
	//new InputStreamReader(new FileInputStream("student.txt"),StandardCharsets.UTF_8))
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(new BufferedReader(
				new FileReader("student.txt")))) {
			while (scanner.hasNextLine()) {
				String studentInfo = scanner.nextLine();
				String[] array = studentInfo.split("\\+");	
				//Integer.parseInt(array[1]);
				if (array[1].equals("Bilgisayar Muhendisligi")) {
					System.out.println("Öðrenci Bilgisi: " + studentInfo);
					System.out.println("Öðrenci Adý: " + array[0]);
				}

			}

		} catch (FileNotFoundException ex) {
			System.out.println("Dosya Bulunamadý...");
		} catch (IOException ex) {
			System.out.println("Dosya açýlýrken bir hata oluþtu....");
		}

		try (BufferedWriter writer = new BufferedWriter(new FileWriter("student.txt", true))) {
			writer.write("Ozan Yay+Astrofizik\n");
		} catch (IOException ex) {
			System.out.println("Dosya açýlýrken hata oluþtu...");
		}
	}

}
