package assignment.core.qNo6;

import java.util.Scanner;

public class ExtractNumber {

	public static void main(String[] args) {
		System.out.println("Enter input in this form >  tel:XXXXXXXXXX");
		Scanner sc = new Scanner(System.in);
		String inputStr = sc.nextLine();
		
		ExtractNumber en = new ExtractNumber();
		en.extractNoMethod1(inputStr);
		en.extractNoMethod2(inputStr);
		
		sc.close();
	}

	private void extractNoMethod2(String inputStr) {
		//used split and parsed using Long
		String[] strArr = inputStr.split(":");
		long no = Long.parseLong(strArr[1]);
		System.out.println("No is: "+ no);
	}

	private void extractNoMethod1(String inputStr) {
		//used replaceAll method
		// [^0-9] = non digit regex
		String str = inputStr.replaceAll("[^0-9]", "");
		long no = Long.parseLong(str);
		System.out.println("No is: "+ no);
	}
}
