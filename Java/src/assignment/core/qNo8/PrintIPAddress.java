package assignment.core.qNo8;

import java.util.Arrays;

public class PrintIPAddress {

	public static void main(String[] args) {
		String str = "[IP-Address]: [ipv4]: [11.111.11.111]";
		String[] strArr = str.split("[:]");
		System.out.println(Arrays.toString(strArr));
		System.out.println(strArr[2].replace("[", "").replace("]", "").trim());
	}

}
