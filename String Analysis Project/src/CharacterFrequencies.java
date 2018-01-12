
public class CharacterFrequencies {
	
	static final String alphabet = "abcdefghijklmnopqrstuvwxyz";
	static final String nonAlphaNumeric = ".,!?:;\"'&()-@\\/";
	
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

}

