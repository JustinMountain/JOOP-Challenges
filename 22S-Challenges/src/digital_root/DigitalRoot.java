package digital_root;

/**
 * The DigitialRoot class calculates the digital root of input numbers.
 * Problem from: https://www.codewars.com/kata/541c8630095125aba6000c00
 * @author Justin Mountain
 */
public class DigitalRoot {

	/**
	 * The main method to the program calls the sumOfDigits function on each int in the array testWords
	 * @param args Command line arguments are not used by this program
	 */
	public static void main(String[] args) {
		int[] testNumbers = { 16, 942, 132189, 493193 };
		
		for (int i = 0; i < testNumbers.length; i++) {
			
			sumOfDigits(testNumbers[i]);
			System.out.println();
		}
	}
	
	/**
	 * Recursively determines the digital root for the input integer
	 * @param input integer to find the digital root for
	 * @return
	 */
	public static int sumOfDigits(int input) {
		String inputAsString = Integer.toString(input);
		
		System.out.printf("%n%8d --> ", input); // Outputs the input number to the console
				
		if (inputAsString.length() == 1) { // Digital root found if input has only 1 digit
			return input;
		} else { // Convert input to charArray and sum the array
			char[] charArray = inputAsString.toCharArray();
			int sum = 0;
			
			for (int i = 0; i < charArray.length; i++) {
				int value = Character.getNumericValue(charArray[i]);	
				sum += value;
				
				if (i ==  charArray.length - 1) { // Formatting for console output
					System.out.print(value + " ");
				} else {
					System.out.print(value + " + ");

				}
			}
			System.out.print(" = " + sum);
			
			// If sum has 1 digit return sum, else recurse with new sum
			return (sum < 9) ? sum : (sum = sumOfDigits(sum));
		}	
	}
}
