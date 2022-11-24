package gfgCourse.fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo {

	public static void main(String[] args) {
		FileInputStream in=null;
		FileOutputStream out=null;
		try {
			File inputFile = new File("input.txt");
			File outputFile = new File("output.txt");
			if(!inputFile.exists()) {inputFile.createNewFile();}
			if(!outputFile.exists()) {outputFile.createNewFile();}
			
			in=new FileInputStream(inputFile);
			out=new FileOutputStream(outputFile);
			int c;
			while(-1!=(c=in.read())) {
				out.write(c);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(out != null) {
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
