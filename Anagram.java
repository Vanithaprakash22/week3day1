package week3.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
	
		String str="stops";
		
		String str2="potss";
		
		
		char a[]=str.toCharArray();
		char b[]=str2.toCharArray();
				
				Arrays.sort(a);
		Arrays.sort(b);
		Boolean res=Arrays.equals(a, b);
		if(res==true)
		{
			System.out.println("Strings are Anagram");
			
		}
		else {
			System.out.println("strings are not Anagaram");
		}
		
		
		

	}

}
