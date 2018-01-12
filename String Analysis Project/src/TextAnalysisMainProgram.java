
public class TextAnalysisMainProgram {
	
	public static void main (String[] args) {
		
		String testString = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, and where is the use of a book, thought Alice, without pictures or conversations? So she was considering in her own mind, (as well as she could, for the hot day made her feel very sleepy and stupid,) whether the pleasure of making a daisy-chain was worth the trouble of getting up and picking the daisies, when a white rabbit with pink eyes ran close by her.";
		CharacterFrequencies.displayFrequencies(CharacterFrequencies.letterFrequencies(testString), CharacterFrequencies.charAlphabet);
		CharacterFrequencies.displayFrequencies(CharacterFrequencies.nonAlphaNumericFrequencies(testString), CharacterFrequencies.charNonAlphaNumeric);
		CharacterFrequencies.displayFrequencies(CharacterFrequencies.numberFrequencies(testString), CharacterFrequencies.charNumbers);
		
	}

}
