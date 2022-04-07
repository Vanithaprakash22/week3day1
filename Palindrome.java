package week3.day2;



public class Palindrome {

	public static void main(String[] args) {


		
String str1 = "MadaM";
str1 = str1.replace(" ", "");

String reverse = "";
for(int i = str1.length() - 1; i >= 0; i--) {
	reverse += str1.charAt(i);
	System.out.println(reverse);
}

boolean palindrome = true;
for(int i = 0; i < str1.length(); i++) {
	if(str1.charAt(i) != reverse.charAt(i)) {
		palindrome = false;
	}
}

if(palindrome) {
	System.out.println("PALINDROME!");
} else {
	System.out.println("Not a palindrome!");
}

}


		
	}


