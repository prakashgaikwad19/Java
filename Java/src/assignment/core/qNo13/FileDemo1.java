package assignment.core.qNo13;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class FileDemo1 {
	// take filepath, filename and content of file at runtime
	// write content to file1 and print content of file1 then copy file1 content to file2
	public static void main(String[] args) throws Exception {
		System.out.println("Create new folder in this path > C:\\otherFiles");
		System.out.println("Enter path to create new folder");
		Scanner sc = new Scanner(System.in);
		String dirPath = sc.next();
		System.out.println(dirPath);
		
		File dirObj = new File(dirPath);
		dirObj.mkdirs();
		System.out.println("Enter file names to create text file ");
		String filename1 = sc.next();
		
		File fileObj1 = new File(dirPath + "\\" + filename1 + ".txt");
		
		if(!fileObj1.exists()) {
			fileObj1.createNewFile();
		}
		
	//	WRITTING IN FILE
		FileWriter fw = new FileWriter(fileObj1);
		System.out.println("enter some text to write some in file");
		fw.write(sc.next());
		System.out.println("Also writing some text by default");
		fw.write("\n1st dir created using user input \nthen file name taken as "
				+ "input and file created");

		fw.close();
	//	WRITING IN FILE STOPPED
		sc.close();
		
	// READING FILE
		System.out.println("REAIDING FILE USING SCANNER");
		Scanner sc1 = new Scanner(fileObj1);
		while(sc1.hasNextLine()) {
			System.out.println(sc1.nextLine());
		}
		sc1.close();
	// READING FILE STOPPED
		
	// COPYING ONE FILE CONTENT TO ANOTHER FILE	
		File fileObj2 = new File(dirPath + "\\" + filename1 + "COPY.txt");
		if(!fileObj1.exists()) {
			fileObj2.createNewFile();
		}
		FileInputStream in = new FileInputStream(fileObj1);
		FileOutputStream out = new FileOutputStream(fileObj2);
		
		int i;
		while((i = in.read()) != -1) {
			out.write(i);
		}
		in.close();
		out.close();
	}

}
