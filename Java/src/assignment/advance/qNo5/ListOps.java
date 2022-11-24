package assignment.advance.qNo5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class ListOps {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		addElementsInList(list);
		System.out.println("Original list \n" + list);
		
		Collections.shuffle(list);
		System.out.println("List elements in random order\n" + list);
		
		Collections.sort(list);
		System.out.println("List after sorting\n" + list);
		
		printElementsUsingStreams(list);
		printElementsUsingEnhancedFor(list);
		
	}

	private static void printElementsUsingEnhancedFor(List<String> list) {
		System.out.println("Print elements using traditional enhanced for");
		for(String str: list) {
			System.out.println(str);
		}
	}

	private static void printElementsUsingStreams(List<String> list) {
		System.out.println("Print elements using streams");
		Stream<List<String>> stream = Stream.of(list);
		stream.forEach(s -> System.out.println(s));
	}

	private static void addElementsInList(List<String> A) {
		A.add("book1");
		A.add("book2");
		A.add("book3");
		A.add("book4");
		A.add("book5");
	}

}
