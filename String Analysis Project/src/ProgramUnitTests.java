import org.junit.Assert;
import org.junit.jupiter.api.Test;

class ProgramUnitTests {
	
	public String longString = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, and where is the use of a book, thought Alice, without pictures or conversations? So she was considering in her own mind, (as well as she could, for the hot day made her feel very sleepy and stupid,) whether the pleasure of making a daisy-chain was worth the trouble of getting up and picking the daisies, when a white rabbit with pink eyes ran close by her.";
	public String shortString = "This! What is this? Why, this is a (short) string.";
	
	@Test
	public void returnsCorrectCharacterCountForOneLetter_LongString() {
		// arrange
		int expectedResult = 14; 
		char character = 'w';
		// act
		int result = CharacterFrequencies.countCharacters(longString, character);		
		// assert
		Assert.assertEquals(expectedResult, result);
	}
	
	@Test
	public void returnsCorrectCharacterCountForOneLetter_ShortString() {
		int expectedResult = 0;
		char character = 'b';
		
		int result = CharacterFrequencies.countCharacters(shortString, character);
		
		Assert.assertEquals(expectedResult, result);
		
	}

	@Test
	public void returnsCorrectCharacterCountForOneCharacter_LongString() {
		int expectedResult = 9;
		char character = ',';
		
		int result = CharacterFrequencies.countCharacters(longString, character);
		
		Assert.assertEquals(expectedResult, result);
		
	}
	
	@Test
	public void returnsCorrectCharacterCountForOneCharacter_ShortString() {
		int expectedResult = 0;
		char character = '-';
		
		int result = CharacterFrequencies.countCharacters(shortString, character);
		
		Assert.assertEquals(expectedResult, result);
		
	}
	
	@Test
	public void returnsCorrectArrayForShortString() {
		int[] expectedArray = {2,0,0,0,0,0,1,6,6,0,0,0,0,1,1,0,0,2,7,6,0,0,2,0,1,0};
		
		int[] resultArray = CharacterFrequencies.letterFrequencies(shortString);
		
		
		Assert.assertEquals(HelperMethods.compareTwoArrays(expectedArray, resultArray), true);
		
	}
	
	@Test
	public void returnsCorrectArrayForLongString() {
		int[] expectedArray = {31,10,13,18,56,7,13,31,40,0,6,10,3,34,35,10,0,27,32,39,11,5,14,0,8,0};
		
		int[] resultArray = CharacterFrequencies.letterFrequencies(longString);
		
		
		Assert.assertEquals(HelperMethods.compareTwoArrays(expectedArray, resultArray), true);
		
	}
	
	@Test
	public void returnsCorrectNonAlphaNumericArrayForShortString() {
		int[] expectedArray = {1,1,1,1,0,0,0,0,0,1,1,0,0,0,0};
		
		int[] resultArray = CharacterFrequencies.nonAlphaNumericFrequencies(shortString);
		
		
		Assert.assertEquals(HelperMethods.compareTwoArrays(expectedArray, resultArray), true);
		
	}
	
	@Test
	public void returnsCorrectNonAlphaNumericArrayForLongString() {
		int[] expectedArray = {1,9,0,1,1,0,0,0,0,1,1,1,0,0,0};
		
		int[] resultArray = CharacterFrequencies.nonAlphaNumericFrequencies(longString);
		
		
		Assert.assertEquals(HelperMethods.compareTwoArrays(expectedArray, resultArray), true);
		
	}

}
