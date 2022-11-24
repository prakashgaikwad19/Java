package assignment.core.qNo14;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CountCharInFile {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		File file1 = createFileCode(sc);
		writeUntilConditonMet(sc, file1);
		
		System.out.println("enter char to be whose occurence need to find");
		String charStr = sc.next();
		
		findCharCount(file1, charStr.charAt(0));
		
		sc.close();		
	}
	
	private static void writeUntilConditonMet(Scanner sc, File file1) throws Exception {
		FileWriter fw = new FileWriter(file1);
		System.out.println("enter something to write in file");
		while(true) {
			String input = sc.nextLine();
			if(input.endsWith("end")) {
				fw.close();
				break;
			} else {
				fw.write(input+"\n");
			}
		}
	}
	private static void findCharCount(File file1,char ch) throws Exception {
		FileInputStream in = new FileInputStream(file1);
		int i;
		int count = 0;
		while((i=in.read())!=-1) {
			if(ch==(char)i) {
				count++;
			}
		}
		in.close();
		System.out.println(ch + " found " + count + " times");
	}
	private static File createFileCode(Scanner sc) throws Exception {
		System.out.println("Enter directory name to create in this path > C:\\otherFiles");
	
		String path = sc.nextLine();
		
		System.out.println("enter file name");
		String filename = sc.nextLine();
		
		File file = new File("C:\\otherFiles\\" + path);
		file.mkdirs();
		File file1 = new File("C:\\otherFiles\\" + path + "\\" + filename + ".txt");
		if(!file1.exists()) {
			file1.createNewFile();
			System.out.println("file created");
		}
		return file1;
	}
}
