
public class CharacterFrequencies {
	
	static final String alphabet = "abcdefghijklmnopqrstuvwxyz";
	static final char[] charAlphabet = alphabet.toCharArray();
	static final String nonAlphaNumeric = ".,!?:;\"'&()-@\\/";
	static final char[] charNonAlphaNumeric = nonAlphaNumeric.toCharArray();
	static final String numbers = "0123456789";
	static final char[] charNumbers = numbers.toCharArray();
	
	public static int countCharacters(String str, char character) {
		String newStr = str.toLowerCase();
		char[] charArray = newStr.toCharArray();
		int count = 0;
		
		for (int i = 0; i < charArray.length; i++) {
			if (character == charArray[i]) {
				count++;
			}
		}		
		return count;
	}
	
	public static int[] letterFrequencies(String str) {
		int[] frequencyValues = new int[26];
		char[] charAlphabet = alphabet.toCharArray();
		
		for (int i = 0; i < charAlphabet.length; i++) {
			frequencyValues[i] = countCharacters(str, charAlphabet[i]); 
		}		
		return frequencyValues;
	}
	
	public static int[] nonAlphaNumericFrequencies(String str) {
		int[] frequencyValues = new int[15];
		char[] charNonAlphaNumeric = nonAlphaNumeric.toCharArray();
		
		for (int i = 0; i < charNonAlphaNumeric.length; i++) {
			frequencyValues[i] = countCharacters(str, charNonAlphaNumeric[i]); 
		}		
		return frequencyValues;
	}
	
	public static int[] numberFrequencies(String str) {
		int[] numberFrequencyValues = new int[10];
		char[] charNumbers = numbers.toCharArray();
		
		for (int i = 0; i < charNumbers.length; i++) {
			numberFrequencyValues[i] = countCharacters(str, charNumbers[i]); 
		}		
		return numberFrequencyValues;
	}
	
	public static void displayFrequencies(int[] frequencyValues, char[] characterArray) {
		System.out.format("+---------+---------+\r\n");
		System.out.format("|Character|Frequency|\r\n");
		System.out.format("+---------+---------+\r\n");
		for (int i = 0; i < frequencyValues.length; i++) {
			System.out.format("| %-7s | %-7d |\r\n", characterArray[i], frequencyValues[i]);
		}
		System.out.format("+---------+---------+\r\n");
	}


}

