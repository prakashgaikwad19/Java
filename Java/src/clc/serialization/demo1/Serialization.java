package clc.serialization.demo1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {

	public static void main(String[] args) {
		Employee empObj = new Employee(1, "emp1", 25, "add1", "1111111111");

		try {
			ObjectOutputStream oos = new ObjectOutputStream(
					new FileOutputStream("empSerializationDemo1.txt"));
			oos.writeObject(empObj);
			oos.close();
			System.out.println("Object serialized");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
