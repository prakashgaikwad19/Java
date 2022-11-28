package clc.serialization.demo1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserializaton {

	public static void main(String[] args) {
		ObjectInputStream ois;
		try {
			ois = new ObjectInputStream(
					new FileInputStream("empSerializationDemo1.txt"));
			Employee empObj = (Employee)ois.readObject();
			ois.close();
			System.out.println("Object deserialized");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
