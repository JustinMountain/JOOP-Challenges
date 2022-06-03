package palindrome;

/**
 * The palindrome class contains a method which determines if an input String is a palindrome.
 * Problem from: https://workat.tech/problem-solving/practice/palindrome
 * @author Justin Mountain
 */
public class Palindrome {
	
	/**
	 * The main method to the program calls the isPalindrome function on each String in the array testWords
	 * @param args Command line arguments are not used by this program
	 */
	public static void main(String[] args) {
		String[] testWords = { "banana", "madam", "racecar", "Justin" };
		
		for (int i = 0; i < testWords.length; i++ ) {
			System.out.printf("%10s --> %b%n", testWords[i], isPalindrome(testWords[i]));
		}
	}
	
	/**
	 * Determines whether or not the input String is a palindrome
	 * 
	 * This is a simple program which does not ignore case or spacing. Improvements to this code
	 * would add guard clauses as well as case- and space- insensitivity.
	 * @param inputWord the String to test
	 * @return True or False
	 */
	public static boolean isPalindrome(String inputWord) {
		char[] input = inputWord.toCharArray();
		int length = input.length;
		
		for (int i = 0; i < length - 1; i++) {
			if(input[i] != input[length -1 -i]) {
				return false;
			}
		}
		return true;
	}
}
