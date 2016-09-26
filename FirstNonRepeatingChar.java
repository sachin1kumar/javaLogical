package Java_Codes;

import java.util.LinkedHashMap;

public class FirstNonRepeatingChar {

	public static String s = "GeeksforGeeks";

	public static LinkedHashMap<Character, Integer> hashMap = new LinkedHashMap<>();

	public static void main(String[] args) {

		int i = 0;

		while (i < s.length()) {

			performOp(s.charAt(i));

			i++;
		}

		printCh();

	}

	public static void performOp(char ch) {

		if (hashMap.containsKey(ch))
			hashMap.put(ch, hashMap.get(ch) + 1);
		else
			hashMap.put(ch, 1);

	}

	public static void printCh() {

		for (Character character : hashMap.keySet()) {

			if (hashMap.get(character) == 1) {
				System.out.println(character);
				break;
			}
		}
	}

}
