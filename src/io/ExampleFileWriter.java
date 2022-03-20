package io;

import java.io.FileWriter;
import java.io.IOException;

public class ExampleFileWriter {

	public static void main(String[] args) {
		FileWriter fw = null; 
		try {
			fw = new FileWriter("Test.txt",true);
			fw.write("Burak Duman");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
