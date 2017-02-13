package week5;

public class OneTimePadEncipher {

	static int asciiDelta = 97;
	
	public static int charToInt(char l) {
		// ADD CODE HERE
		// Should convert a character to an integer, for example 'a' -> 0, 'b' -> 1
		int c = (int) Character.toLowerCase(l);
		return c - asciiDelta;
	}

	public static char intToChar(int i) {
		// ADD CODE HERE
		// Should convert an integer to a character, for example 0 -> 'a', b -> '1'
		// it should always return lower case char
		char c  = (char) (i + asciiDelta);
		return c;
	}

	public static boolean isAlpha(char c) {
		if (Character.isAlphabetic(c)) return true;
		else return false;
	}

	public static String encipher(String original, String onetimepad) {
		String out = "";
		for (int i = 0; i < original.length(); i++) {
			if (isAlpha(original.charAt(i))) {
				out += intToChar((
						charToInt(original.charAt(i)) + 
						charToInt(onetimepad.charAt(i))) % 26);
			} else {
				out += " ";
			}
		}
		return out;
	}

	public static void main(String[] args) {
		String ciphertext = encipher("HELLO EVERYBODY", "MYSECRETKETMYSECRETKEY");
		System.out.print(ciphertext);
	}

}