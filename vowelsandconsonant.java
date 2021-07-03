package Java;
import java.util.Scanner;
public class vowelsandconsonant {
	public static void main(String[] args) {
		System.out.println("Welcome to Alphabet");

		Scanner sc= new Scanner(System.in);   
		System.out.print("Enter a Letter:");  
		char c = sc.next().charAt(0);
		
		if ( c == 'A'|| c == 'a' || 
				c == 'e' || c == 'E' || 
				c == 'i' || c == 'I' || 
				c == 'o' || c == 'O' ||
				c == 'u' || c == 'U') {
			System.out.println("Given Alphabet is Vowel:"+c);
		}
		else {
			System.out.println("Given Alphabet is Consonant:"+c);
		}
	}
}