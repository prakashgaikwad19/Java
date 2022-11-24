package assignment.core.qNo14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountWordInFile {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		File file1 = createFileCode(sc);
		writeUntilConditonMet(sc, file1);
		
		System.out.println("enter word to be whose occurence need to find");
		String word = sc.next();
		
		findWordCount(file1, word);
		
		sc.close();
	}
	
	private static void findWordCount(File file1, String word) throws Exception {
		Scanner sc = new Scanner(file1);
		int count = 0;
		while(sc.hasNext()) {
			String lineInFile = sc.next();
			int count1 = countWordInLine(lineInFile, word);
			count = count + count1;
		}
		System.out.println(count + " times " + word + " found in file");
	}

	private static int countWordInLine(String lineInFile, String word) {
		Matcher matcher = Pattern.compile(String.valueOf(word)).matcher(lineInFile);
		int n = 0;
		while(matcher.find()) {
			n++;
		}
		return n;
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

}
