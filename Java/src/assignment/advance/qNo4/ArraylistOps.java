package assignment.advance.qNo4;

import java.util.ArrayList;

public class ArraylistOps {

	public static void main(String[] args) {
		ArrayList<String> A = new ArrayList<>();
		ArrayList<String> B = new ArrayList<>();
		addElementsInArrayList(A, B);

		commonElements(A, B);
		notCommonElements(A, B);
		elementsPresentOnlyInA(A,B);
		elementsPresentOnlyInB(A,B);
	}

	private static void addElementsInArrayList(ArrayList<String> A, ArrayList<String> B) {
		A.add("book1");
		A.add("book2");
		A.add("book3");
		A.add("book4");
		A.add("book5");
		
		B.add("book3");
		B.add("book4");
		B.add("book5");
		B.add("book6");
		B.add("book7");
	}

	private static void elementsPresentOnlyInB(ArrayList<String> A, ArrayList<String> B) {
		System.out.println("elements which are only present in B");
		ArrayList<String> C = new ArrayList<>();
		for(String str:B) {
			if(!A.contains(str)) {
				C.add(str);
			}
		}
		System.out.println(C);
	}

	private static void elementsPresentOnlyInA(ArrayList<String> A, ArrayList<String> B) {
		System.out.println("elements which are only present in A");
		ArrayList<String> C = new ArrayList<>();
		for(String str:A) {
			if(!B.contains(str)) {
				C.add(str);
			}
		}
		System.out.println(C);
	}

	private static void notCommonElements(ArrayList<String> A, ArrayList<String> B) {
		System.out.println("not common elements in both Arraylist");
		ArrayList<String> C = new ArrayList<>();
		for(String str:A) {
			if(!B.contains(str)) {
				C.add(str);
			}
		}
		for(String str:B) {
			if(!A.contains(str)) {
				C.add(str);
			}
		}
		System.out.println(C);
	}

	private static void commonElements(ArrayList<String> A, ArrayList<String> B) {
		System.out.println("Common elements in both Arraylist");
		ArrayList<String> C = new ArrayList<>();
		for(String str:A) {
			if(B.contains(str)) {
				C.add(str);
			}
		}
		System.out.println(C);
	}

}
