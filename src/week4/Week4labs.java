package week4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class Week4labs {

//	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		// Copyright (c) 2023 Promineo Tech
		// Author:  Promineo Tech Academic Team
		// Subject:  StringBuilders, Lists, Sets, & Maps
		// Java Week 04 Lab  
		//
		//package week04;

		//public class Week04StringBuilderListSetMapLab {

			public static void main(String[] args) {

				// 1. Why would we use a StringBuilder instead of a String? To save space and easily change the String.
				// 		a. Instantiate a new StringBuilder
				//		b. Append the characters 0 through 9 to it separated by dashes
				// 				Note:  make sure no dash appears at the end of the StringBuilder

				StringBuilder sb = new StringBuilder(" ");
				for (int i = 0; i<=9; i++) {
					sb.append("-");
				sb.append(i);
				
					
				}
				System.out.println(sb.toString());
			
				// 2. List of String:
				//		a. Create a list of Strings 
				//		b. Add 5 Strings to it, each with a different length
				
				List<String> str = new ArrayList<String>();
				
				str.add("Hello");
				str.add("I");
				str.add("am");
				str.add("sleepy");
				str.add("now");
				
				
			
			
				// 3. Write and test a method that takes a list of strings 
				//			and returns the shortest string
System.out.println("Lab Question #3");			
System.out.println(findShortest(str));
			

				
				// 4. Write and test a method that takes a list of strings 
				//			and returns the list with the first and last element switched
System.out.println("Lab Question #4");
		List<String> swapped =	swapFirstAndLast(str); 	
		for (String string : swapped) {
			System.out.println(string);
		}
				// 5. Write and test a method that takes a list of strings 
				//			and returns a string with all the list elements concatenated to each other,
				// 			separated by a comma
		System.out.println("Lab Question #5");
		List<String> concat = concatWithComma(str);
	System.out.println(concat);

							
				// 6. Write and test a method that takes a list of strings and a string 
				//			and returns a new list with all strings from the original list
				// 			containing the second string parameter (i.e. like a search method)
			System.out.println("Lab Question #6");
			List<String> search = searchMethod(str,"o");
			System.out.println(search);
			
				// 7. Write and test a method that takes a list of integers 
				//			and returns a List<List<Integer>> with the following conditions specified
				//			for the return value:
				//		a. The first List in the returned value contains any number from the input list 
				//			that is divisible by 2
				//		b. The second List contains values from the input list that are divisible by 3
				//		c. The third containing values divisible by 5, and 
				//		d. The fourth all numbers from the input List not divisible by 2, 3, or 5

			System.out.println("Lab Question #7");
			List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 15, 16, 20, 25, 30);
			List<List<Integer>> sortedNumbers = findFactors(numbers);
			for (List<Integer> list : sortedNumbers) {
				for (Integer number : list) {
					System.out.println(number);
				}
			System.out.println("Next List:");
			}
			
// 8. Write and test a method that takes a list of strings 
//and returns a list of integers that contains the length of each string
			System.out.println(stringLength(str));	
			}		
// 9. Create a set of strings and add 5 values
// Set <String> values = new HashSet<String>();
// values.add("Is");
 
 
 
				
				// 10. Write and test a method that takes a set of strings and a character 
				//			and returns a set of strings consisting of all the strings in the
				// 			input set that start with the character parameter.


				
				// 11. Write and test a method that takes a set of strings 
				//			and returns a list of the same strings
			
				

				// 12. Write and test a method that takes a set of integers 
				//			and returns a new set of integers containing only even numbers 
				//			from the original set


				
				// 13. Create a map of string and string and add 3 items to it where the key of each
				// 			is a word and the value is the definition of the word

			
				
				// 14. Write and test a method that takes a Map<String, String> and a string 
				// 			and returns the value for a key in the map that matches the
				// 			string parameter (i.e. like a language dictionary lookup)

				
				// 15. Write and test a method that takes a List<String> 
				//			and returns a Map<Character, Integer> containing a count of 
				//			all the strings that start with a given character
				

				



	
			
			
			// Method 15:
			
			
			
			// Method 14:
			

			
			// Method 12:
			

			
			// Method 11:
			


			// Method 10:
			

			// Method 8:
			public static List<String> stringLength(List<String> list){
				List<String> result = new ArrayList<>();
				for (String num : list) {
					result.add(num.length(), num);
					
				}
					return result;
				}
		
			
			
			// Method 7:
			public static List<List<Integer>> findFactors(List<Integer> list){
				List<List<Integer>> results = new ArrayList<List<Integer>>();
				results.add(new ArrayList<Integer>());
				results.add(new ArrayList<Integer>());
				results.add(new ArrayList<Integer>());
				results.add(new ArrayList<Integer>());
				for (int num : list) {
					if (num % 2 == 0) {
					results.get(0).add(num);
					}
					if (num % 3 == 0) {
					results.get(1).add(num);
						}
					if (num % 5 == 0) {
					results.get(2).add(num);
					} else {
					results.get(3).add(num);
					}
				}
				return results;
				
			}
			
			
			// Method 6:
			public static List<String> searchMethod(List<String> list, String c){
				List<String> newList = new ArrayList<String>();
				for (String str: list)
				if (str.contains(c)) {
					newList.add(str);
				} 
				return newList;
			}

			
			// Method 5:
			
			
			public static List<String> concatWithComma(List<String> list){
				String together = list.get(0);
				for (String strings : list ) {
					together = strings + ", " + together;
				}
				return list;
			}
			
			
			// Method 4:
			public static List<String> swapFirstAndLast(List<String> list  ){
				String temp = list.get(0);
				 list.set(0, list.get(list.size()-1));
			list.set(list.size()-1, temp);
			return list;
				}
			
			
			// Method 3:
				public static String findShortest(List<String> list) {
				String shortest = list.get(0);
				for (String strings : list) {
					if (strings.length() < shortest.length()) {  
				shortest = strings;
					}
					}
				return shortest;
			}


}
			


