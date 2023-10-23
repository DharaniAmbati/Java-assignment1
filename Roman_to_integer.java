package java_assignment_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Roman_to_integer {
      static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter  the roman value");
		String roman=sc.next();
		int resultInteger=romanToInteger(roman);
		System.out.println(resultInteger);

	}
	public static int romanToInteger(String roman) {
			 
		      //If string value is null or zero
		       if(roman == null || roman.length() == 0) {
		           return 0;
		       }
		 
		       //Create a mapping of roman numerals and it's integer value
		       Map<Character, Integer> charMap = new HashMap<>();
		       charMap.put('I', 1);
		       charMap.put('V', 5);
		       charMap.put('X', 10);
		       charMap.put('L', 50);
		       charMap.put('C', 100);
		       charMap.put('D', 500);
		       charMap.put('M', 1000);
		 
		       int result = 0;
		 
		       /*
		         Traverse a string and pick each character at a time.
		       */
		       for(int i = 0; i < roman.length()-1; i++) {
		 
		             /*
		               If current Roman numeral value is greater than
		               then the next value, the do addition.
		             */
		             if(charMap.get(roman.charAt(i)) >= charMap.get(roman.charAt(i+1))) {
		                result = result + charMap.get(roman.charAt(i));
		              } else {
		                result = result - charMap.get(roman.charAt(i));
		              } 
		        }
		 
		         //Add the value of last numeral
		         result = result + charMap.get(roman.charAt(roman.length()-1));
		 
		        return result;
		   
	}

}
