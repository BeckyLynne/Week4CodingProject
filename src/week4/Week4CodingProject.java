/**
 * 
 */
package week4;

/**
 * 
 */
public class Week4CodingProject {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub


//1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		
		int [] ages = {3,9,23,64,2,8,28,93}; 
//a. Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
		
		System.out.println("Coding Step 1a:"); 
		int difference = ages[ages.length -1] - ages[0];
		System.out.println(difference);
		
//b. Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array, and have more elements).  
		
		System.out.println("Coding Step 1b:");
		int [] ages2 = {1, 2, 15, 21, 3, 4, 12,1, 232}; //created a new array with more numbers
		int difference2 = ages2[ages2.length -1] - ages2[0];// subtracting the value at the last position from the value at the first

//array[array.length-1] finds the last index element no matter how long the array;
		
		System.out.println(difference2);
		int sum = 0;
		for (int i = 0; i <ages2.length; i++) {
			sum += ages2[i];
		}
		int average = sum/ages2.length;

//c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		
		System.out.println("Coding Step 1c:");
		System.out.println(average);

//2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.

//a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		
		System.out.println("Coding Step 2a:");
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		System.out.println(averageWordLength(names));
		
//b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
		
		System.out.println("Coding Step 2b:");
		StringBuilder sb = new StringBuilder();
		for (String name: names) {
			sb.append(' ');
		sb.append(name);
		}
		String withSpaces = sb.toString();
		System.out.println(withSpaces);
		
//3. How do you access the last element of any array?
		
		System.out.println("Coding Step 3:");
		String lastPosition= names[names.length-1]; 
		System.out.println(lastPosition);
		
//4. How do you access the first element of any array?
		
		System.out.println("Coding Step 4:");
		System.out.println(names[0]); // you find the first element at index 0

//5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.

	System.out.println("Coding Step 5:");
	int [] nameLengths = new int [names.length];
	for(int i = 0; i<names.length; i++) {
		nameLengths[i] = names[i].length();	
	System.out.println(nameLengths[i]);
	}
	
//	6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
    
	System.out.println("Coding Step 6:");
	int sumofArray = 0;
	for(int i = 0; i<nameLengths.length; i++) {
	sumofArray += nameLengths[i];
	}
	System.out.println(sumofArray);
	
//	7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).

	System.out.println("Coding Step 7:");
	System.out.println(repeatWord("Hello", 5));
	
//	8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).

	System.out.println("Coding Step 8:");
	System.out.println(fullName("Bob", "Harvey"));

//	9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.

	System.out.println("Coding Step 9:");
	System.out.println(isGreaterThan100(ages2)); 

//	10. Write a method that takes an array of double and returns the average of all the elements in the array.
	
	System.out.println("Coding Step 10:");
	
//create new array of double to check method
	double [] random = {1.5, 2.5, 2.0}; 
	System.out.println(average(random));
 
//	11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
	
	System.out.println("Coding Step 11:");
	double [] random2 = {5.1, 5.2, 5.3};
	
 //Testing if the average of random2 is greater than random
	System.out.println(isFirstArrayAverageGreater(random2, random));
 
//Testing if the average of random is greater than random2
 	System.out.println(isFirstArrayAverageGreater(random, random2));
 
//	12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
 	System.out.println("Coding Step 12:");
 	System.out.println(willBuyDrink(true, 8.00));
//	13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
// I created a method for problem 2. It helped find the average word length for the string I was working with.
	}//end of main
	//---------------------------------------------
	
	//Method for Coding Step 12:
	
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside == true && moneyInPocket > 10.50) {
			return true;
		}
		return false;
	}
	
	//Method for Coding Step 11:
	
	public static boolean isFirstArrayAverageGreater(double [] array1, double [] array2) {
		double sum1 = 0;
		double sum2 =0;
		for (double num: array1) {
			sum1 += num;
		}
		for (double num: array2) {
			sum2 += num;
		}
		if (sum1 > sum2) {
			return true;
		}
		return false;
	}
	
	//Method for Coding Step 10:
	
	public static double average(double [] array) {
		double sum =0;
		for (double num: array) {
			sum += num;
		}
		return sum/array.length;	
		}
	
	//Method for Coding Step 9:
	
	public static boolean isGreaterThan100(int [] array) {
		int sum = 0;
		for (int num : array) {
			sum += num;
		}
		if (sum >100) {
			return true;
		} else {
			return false;	
		}
	}
	//Method for Coding Step 8:
	
	public static String fullName(String f, String l) {
		String fullName = (f + " " + l);
		return fullName;
	}
	
	//Method for Coding Step 7:
	
	public static String repeatWord(String word, int n) {
		String result = "";
		for (int i = 0; i <=n; i++) {
		result +=word;
	}
	return result;	
	}
	
	//Method for Coding Step 2:
	
	public static int averageWordLength(String[] str) {
		int total = 0;
		int averageLetters = 0;
		for (String name:str) { 
			int sumLetters =name.length();
		total += sumLetters;
		averageLetters = total/sumLetters;
		}
		return averageLetters;	
	}
		
}

 