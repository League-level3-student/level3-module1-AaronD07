package _01_IntroToArrayLists;

import java.util.ArrayList;

public class _01_IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
ArrayList<String> list = new ArrayList<String>();
		//2. Add five Strings to your list
		list.add("Hello");
		list.add("there");
		list.add("I");
		list.add("am");
		list.add("Aaron");
		//3. Print all the Strings using a standard for-loop
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		for(String s:list) {
			System.out.println(s);
			
		}
		for(int i=0; i<list.size(); i++) {
			if (i%2==0) {
				System.out.println(list.get(i));
			}
			
		}
		
	
			for (int i=list.size();i > 1; i--) {

				System.out.println(list.get(i));
			}
		
		
		
		//4. Print all the Strings using a for-each loop
		
		//5. Print only the even numbered elements in the list.
		
		//6. Print all the Strings in reverse order.
		
		//7. Print only the Strings that have the letter 'e' in them.
	}
}
