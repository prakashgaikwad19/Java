package assignment.core.qNo14;

import java.io.File;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherStudy {

	public static void main(String[] args) throws Exception {
		String word = "ab1";
		String lineInFile = "ab1111111111ab1aab1";
		countWordInLine(lineInFile, word);
	}

	private static int countWordInLine(String lineInFile, String word) {
	//	Matcher matcher = Pattern.compile(String.valueOf(word)).matcher(lineInFile); 
		Pattern pattern = Pattern.compile(word);
		Matcher matcher = pattern.matcher(lineInFile);
		int n = 0;
		/*System.out.println("lineInFile.length() "+lineInFile.length());
		System.out.println(matcher.pattern());
		System.out.println(matcher.matches());*/
		while(matcher.find()) {
			System.out.println("matcher.group() "+matcher.group());
			System.out.println(matcher.start());
			System.out.println(matcher.end());
//			System.out.println("matcher.toMatchResult() "+matcher.toMatchResult());
// 			System.out.println(matcher.lookingAt());
			n++;
		}
		System.out.println("@@@@@@@@@@@@@@@@@@ "+ n);

		return n;
	}
	
	/*File file1 = new File("C:\\otherFiles\\qNo14\\charfile\\chafileunique.txt");
	findWordCount(file1, "what");
	*/
	/*private static void findWordCount(File file1, String word) throws Exception {
	Scanner sc = new Scanner(file1);
	int count = 0;
	while(sc.hasNext()) {
		String lineInFile = sc.next();
		int count1 = countWordInLine(lineInFile, word);
		count = count + count1;
	}
	System.out.println(count + " times " + word + " found in file");
}*/
}
