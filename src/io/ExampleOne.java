package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExampleOne {

	public static void main(String[] args) throws IOException {
		write("burakduman.txt");
		read("burakduman.txt");
		write("abc.txt");
		read("abc.txt");

	}
	
	public static void write(String path) {
		FileOutputStream fos = null;
		//yazdýrma
		try {
			fos = new FileOutputStream(path);
			String name = "Burak Duman 13.03.2022";
			fos.write(name.getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public static void read(String path) {
		FileInputStream fis =null;
		try {
			fis = new FileInputStream(new File(path));
			int value;
			String result = "";
			while((value=fis.read())!=-1) {
				result=result+(char)value;
			}
			System.out.println(result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
