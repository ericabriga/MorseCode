import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class MorseCode {
	static HashMap<String, String> map = new HashMap<>();
	static {map.put(".-", "a");
	map.put("-...", "b");
	map.put("-.-.", "c");
	map.put("-..", "d");
	map.put(".", "e");
	map.put("..-.", "f");
	map.put("--.", "g");
	map.put("....", "h");
	map.put("..", "i");
	map.put(".---", "j");
	map.put("-.-", "k");
	map.put(".-..", "l");
	map.put("--", "m");
	map.put("-.", "n");
	map.put("---", "o");
	map.put(".--.", "p");
	map.put("--.-", "q");
	map.put(".-.", "r");
	map.put("...", "s");
	map.put("-", "t");
	map.put("..-", "u");
	map.put("...-", "v");
	map.put(".--", "w");
	map.put("-..-", "x");
	map.put("-.--", "y");
	map.put("--..", "z");
	map.put("/", " ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String morseCode = ".... . .-.. .-.. --- / -.. .- .. .-.. -.-- / .--. .-. --- --. .-. .- -- -- . .-. / --. --- --- -.. / .-.. ..- -.-. -.- / --- -. / - .... . / -.-. .... .- .-.. .-.. . -. --. . ... / - --- -.. .- -.--";
		translate(morseCode);
	

	}
	
	static String translate (String morseCode) {
		String[] tokens = morseCode.split(" "); // split string in an array of strings called tokens
		String[] letters = new String[tokens.length]; //new array same length as tokens
		
		for (int i = 0; i< tokens.length; i++) {
			String token = tokens[i];
			String letter = map.get(token);
			letters[i] = letter;
		}
		String sentence = String.join("", letters);
		return sentence;
	}

}
