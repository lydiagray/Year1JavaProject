import java.util.*;

public class TextAnalysisMainProgram {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int programMode;	
		
		do {
		UserInterface.modeSelection();
		programMode = sc.nextInt();
		
		if (programMode == 1) {
			System.out.println("This feature has not been released yet\r\nPlease try again later\r\n");
		}
		else if (programMode == 2) { 
			System.out.println("Demo display of frequencies for a long string");	
			DisplayMethods.displayFrequencies(CharacterFrequencies.letterFrequencies(ProgramUnitTests.longString), CharacterFrequencies.charAlphabet);
			DisplayMethods.displayFrequencies(CharacterFrequencies.nonAlphaNumericFrequencies(ProgramUnitTests.longString), CharacterFrequencies.charNonAlphaNumeric);
			DisplayMethods.displayFrequencies(CharacterFrequencies.numberFrequencies(ProgramUnitTests.longString), CharacterFrequencies.charNumbers);
		}
		else if (programMode == 0) {
			System.out.println("Thank you for using the LG Text Analysis Program\r\nGoodbye");
		}
		else {
			System.out.println("You must select 1, 2 or 0");
		}		
	} while (programMode != 0);
		


//		
//		String testShortString = "99037666 This! What is this? Why, this is a (short) string.";
//		CharacterFrequencies.displayFrequencies(CharacterFrequencies.letterFrequencies(testShortString), CharacterFrequencies.charAlphabet);
//		CharacterFrequencies.displayFrequencies(CharacterFrequencies.nonAlphaNumericFrequencies(testShortString), CharacterFrequencies.charNonAlphaNumeric);
//		CharacterFrequencies.displayFrequencies(CharacterFrequencies.numberFrequencies(testShortString), CharacterFrequencies.charNumbers);
		
	}

}
