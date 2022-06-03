package palindrome;

// https://workat.tech/problem-solving/practice/palindrome
public class Palindrome {
	
	public boolean isPalindrome(String inputWord) {
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
