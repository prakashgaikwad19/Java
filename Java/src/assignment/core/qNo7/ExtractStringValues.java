package assignment.core.qNo7;

import java.util.Arrays;
import java.util.Scanner;

public class ExtractStringValues {

	public static void main(String[] args) {
		System.out.println("enter in iput in this form > sip:displayname<username@domain.com>");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		extractDomainName(str);
		sc.close();
	}

	private static void extractDomainName(String str) {
		String newStr = str.replaceFirst("sip:", "");
		String[] strArr = newStr.split("[<>]");
		
		System.out.println(Arrays.toString(strArr));
		
		String opStr = "Display Name : " + strArr[0] + "\n"
					  + "User Name : " + strArr[1];
		
		System.out.println(opStr);
	}

}
