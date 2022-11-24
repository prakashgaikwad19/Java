package assignment.core.qNo13;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CopyFileContentToOther {

	public static void main(String[] args) throws IOException {
		String path = "C:\\otherFiles\\copyFileOps\\";
		File file = new File(path);
		file.mkdirs();
		
		File file1 = new File(path + "file1.txt");
		File file2 = new File(path + "file2.txt");
		
		if(!(file1.exists() && file2.exists())) {
			file1.createNewFile();
			file2.createNewFile();
		}
		
		System.out.println("enter something to write in file");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		sc.close();
		
		FileWriter fw1 = new FileWriter(file1);
		fw1.write(input);
		fw1.close();
		System.out.println("written in file1 \nnow copying to file2");
		
		FileInputStream in = null;
		FileOutputStream out = null;
		try {
			 in = new FileInputStream(file1);
			 out = new FileOutputStream(file2);
			
			int i;
			while((i=in.read())!=-1) {	//reading file till end of file
				out.write(i);	//write one by one to file2
			}
		} finally {
			if(in!=null) {
				in.close();
			}
			if(out!=null) {
				out.close();
			}
			System.out.println("copied to file2");
		}
		
		System.out.println("content of file2");
		Scanner sc1 = new Scanner(file2);
		while(sc1.hasNextLine()) {
			String data = sc1.nextLine();
			System.out.println(data);
		}
		sc.close();
		
	}

}
