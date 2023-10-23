package java_assignment_1;

import java.util.*;

public class Pangram {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		//checking the entered input string value is pangram are not... 
		    System.out.println("Enter the String: as an input here");
		    String s = scan.nextLine();

		    int[]check = new int[26];
		    String str = s.toLowerCase(); //to convert the entire string into lowercase

		    for(int i = 0; i < str.length(); i++)
		    {
		      if(str.charAt(i) != 36 && str.charAt(i) >= 97 && str.charAt(i) <= 122)
		      {
		        check[str.charAt(i) - 97] = 1; 
		      }
		    }

		    for(int i = 0; i < 26; i++)
		    {
		      if(check[i] != 1)
		      {
		        System.out.println(" Entered string value is Not Pangram");
		        System.exit(0);
		      }
		    }

		    System.out.println("Entered string value is Pangram");
		  }
		

	}


