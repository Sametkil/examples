package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ExampleWriteObject {

	public static void main(String[] args) {
		try(ObjectOutputStream oos = 
				new ObjectOutputStream((
						new FileOutputStream("studentObject.bin")))) {
			Student student = new Student("burak", "duman", "Bil muh"
					, "Comp101");
			Student student2 = new Student("burak2", "duman2", "Bil muh"
					, "Comp101");
			oos.writeObject(student);
			oos.writeObject(student2);
			
		}catch(IOException ex) {
			
		}
		
		try(ObjectInputStream ois = 
				new ObjectInputStream((
						new FileInputStream("studentObject.bin")))){
			Student s1 = (Student) ois.readObject();
			Student s2 = (Student) ois.readObject();
			
			System.out.println("Student 1 :"+ s1.toString());
			System.out.println("Student 2 :"+ s2.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
