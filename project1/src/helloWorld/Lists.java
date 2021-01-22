package helloWorld;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lists {

	public static void main(String[] args) {
		method1();
	}
	
	public static void method1() {
		//Creating the array and adding 2 values to it
		List<String> names = new ArrayList<>();
		
		names.add("Camen");
		names.add("John");
		names.add("Sarah");
		names.add("Beth");
		names.add("James");
		
		System.out.println(names);
		
		//Changing the value at index 0
		names.set(0, "Cameron");
		
		System.out.println(names);
		
		//Sort the array alphabetically
		Collections.sort(names);
		
		System.out.println(names);
		
		//Removing the value at index 1
		names.remove(1);
		
		System.out.println(names);
	}
}
