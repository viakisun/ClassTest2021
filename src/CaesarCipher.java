
public class CaesarCipher {
	
	private static int SHIFT_CODE = 3;
	
	public static String encrypt(String message) {
		StringBuilder result = new StringBuilder();
		for (char character : message.toCharArray()) {
		    if (character != ' ') {
		        int originalAlphabetPosition = character - 'a';
		        int newAlphabetPosition = (originalAlphabetPosition + SHIFT_CODE) % 26;
		        char newCharacter = (char) ('a' + newAlphabetPosition);
		        result.append(newCharacter);
		    } else {
		        result.append(character);
		    }
		}
		return result.toString();
	}
	
	public static String decrypt(String message) {
		StringBuilder result = new StringBuilder();
		for (char character : message.toCharArray()) {
		    if (character != ' ') {
		        int originalAlphabetPosition = character - 'a';
		        int newAlphabetPosition = (originalAlphabetPosition - SHIFT_CODE) % 26;
		        char newCharacter = (char) ('a' + newAlphabetPosition);
		        result.append(newCharacter);
		    } else {
		        result.append(character);
		    }
		}
		return result.toString();
	}
}
