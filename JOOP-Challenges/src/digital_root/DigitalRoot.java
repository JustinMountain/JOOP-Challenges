package digital_root;

// https://www.codewars.com/kata/541c8630095125aba6000c00
public class DigitalRoot {

	public static void main(String[] args) {
		int testNumber = 493193;
		
		sumOfDigits(testNumber);
	}
	
	// Recursive method to find the digital root
	public static int sumOfDigits(int input) {
		String inputAsString = Integer.toString(input);
				
		if (inputAsString.length() == 1) { // Digital root found if input has only 1 digit
			return input;
		} else { // Convert input to charArray and sum the array
			char[] charArray = inputAsString.toCharArray();
			int sum = 0;
			
			for (int i = 0; i < charArray.length; i++) {
				int value = Character.getNumericValue(charArray[i]);	
				sum += value;
				
				if (i ==  charArray.length - 1) {
					System.out.print(value + " ");
				} else {
					System.out.print(value + " + ");

				}
			}
			System.out.println(" = " + sum);
			
			// If sum has 1 digit return sum, else recurse with new sum
			return (sum < 9) ? sum : (sum = sumOfDigits(sum));
		}	
	}
}
