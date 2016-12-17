import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args){
		System.out.println("enter a word to see if it is a palindrome");
		Scanner in = new Scanner(System.in);
		String userInput = in.next();
		check(userInput);
	}

	public static void check(String input){
		boolean isPalindrome = true;
		int n = input.length();
		  for (int i = 0; i < (n/2); ++i) {
		     if (input.charAt(i) != input.charAt(n - i - 1)) {
		         isPalindrome = false;
		     }
		  }
		if(isPalindrome){
			System.out.println("The word you entered is a palindrome");
		}
		else{
			System.out.println("The word you entered is not a palindrome");
		}
	}
}

