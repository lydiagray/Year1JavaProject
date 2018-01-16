
public class DisplayMethods {
	
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
