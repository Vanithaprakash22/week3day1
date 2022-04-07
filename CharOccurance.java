package week3.day2;

public class CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "welcome to chennai";
		
		int count =0;
		for(char ch:str.toCharArray()) {
			if(ch=='e')
			{
				
				count++;
			}
		}
		System.out.println(count);
			}
		
		
	}


