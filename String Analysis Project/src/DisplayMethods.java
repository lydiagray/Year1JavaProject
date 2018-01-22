
public class DisplayMethods {
	
	static final char[] capitalAlphabet = CharacterFrequencies.alphabet.toUpperCase().toCharArray();
	
	public static void displayFrequencies(int[] frequencyValues, char[] characterArray) {
		System.out.format("+---------+---------+\r\n");
		System.out.format("|Character|Frequency|\r\n");
		System.out.format("+---------+---------+\r\n");
		for (int i = 0; i < frequencyValues.length; i++) {
			System.out.format("| %-7s | %-7d |\r\n", characterArray[i], frequencyValues[i]);
		}
		System.out.format("+---------+---------+\r\n");
	}
	
	public static void barChartFrequencies(int[] frequencyValues, char[] characterArray) {
		System.out.println(" Number of character occurances");
		System.out.println(" _______________________________________________________");
		for (int i = 0; i < frequencyValues.length; i++) {
			String bar = "";
			System.out.print(characterArray[i] + "|");
			for (int j = 1; j <= frequencyValues[i]; j++) {
				bar += "X";
			}
			System.out.println(bar);

		}


	}

}
