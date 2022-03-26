package homework.seven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class HomeworkEmployee {

	public static void main(String[] args) {
		Employee [] arrayEmp = new Employee[5];
		Employee e1 = new Employee();
		e1.age=19;
		e1.name="e1name";
		e1.surname="e1surname";
		e1.salary=100;
		Employee e2 = new Employee();
		e2.age=20;
		e2.name="e2name";
		e2.surname="e2surname";
		e2.salary=200;
		Employee e3 = new Employee();
		e3.age=21;
		e3.name="e3name";
		e3.surname="e3surname";
		e3.salary=300;
		Employee e4 = new Employee();
		e4.age=22;
		e4.name="e4name";
		e4.surname="e4surname";
		e4.salary=500;
		Employee e5 = new Employee();
		e5.age=23;
		e5.name="e5name";
		e5.surname="e5surname";
		e5.salary=600;
		arrayEmp[0]=e1;
		arrayEmp[1]=e2;
		arrayEmp[2]=e3;
		arrayEmp[3]=e4;
		arrayEmp[4]=e5;
		writeFile(arrayEmp);
		readFile(arrayEmp);
	}
	
	public static void writeFile(Employee [] arrayEmp){
		try(ObjectOutputStream oos = 
				new ObjectOutputStream((
						new FileOutputStream("empObject.bin")))) {
			for(int i=0;i<arrayEmp.length;i++){
				oos.writeObject(arrayEmp[i]);
			}
		}catch(IOException ex) {
			
		}
		
	}
	public static void readFile(Employee [] arrayEmp){
		try(ObjectInputStream ois = 
				new ObjectInputStream((
						new FileInputStream("empObject.bin")))){
			for(int i=0;i<arrayEmp.length;i++){
				Employee emp = (Employee) ois.readObject();
				System.out.println(emp.toString());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
