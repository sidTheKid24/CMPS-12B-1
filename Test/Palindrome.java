import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args){
		System.out.println("enter a number to check if it is a palindrome");
		Scanner in = new Scanner(System.in);
		int userNumber = in.nextInt();
		check(userNumber);
	}
	
	public static void check(int number){
		StringBuffer s =  new StringBuffer(Integer.toString(number));
		int size = 	s.length()-1;
		StringBuffer palindrome = new StringBuffer("");
		for(int i = size; i >= 0; i--){
			palindrome.append(s.charAt(i));
		}

		if(palindrome.toString().equals(s.toString())){
			System.out.println("The number you entered is a palindrome");
		}
		else{
			System.out.println("The number you entered is not a palindrome");
		}
	}
}
