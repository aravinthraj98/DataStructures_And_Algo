package BackTracking;

import java.util.HashMap;
import java.util.Map;

// String with repeated character....n!/repeated_ch!

public class KLengthWords3 {

	public static void getWords(String str, int k) {

		Map<Character, Integer> lastOccurence = new HashMap<>();
		for (char ch : str.toCharArray())
			lastOccurence.put(ch, -1);

		Character[] spots = new Character[k];
		getWordsUtil(0, str, spots, lastOccurence, 0, k);
	}

	private static void getWordsUtil(int index, String str, Character[] spots, Map<Character, Integer> lastOccurence,
			int count, int k) {

		if (index == str.length()) {
			if (count == k) {
				for (char ch : spots)
					System.out.print(ch);
				System.out.print(" ");
			}
			return;
		}

		char ch = str.charAt(index);
		int lo = lastOccurence.get(ch);

		for (int i = lo + 1; i < spots.length; i++) {
			if (spots[i] == null) {
				spots[i] = ch;
				lastOccurence.put(ch, i);
				getWordsUtil(index + 1, str, spots, lastOccurence, count + 1, k);
				lastOccurence.put(ch, lo);
				spots[i] = null;
			}
		}

		if (lo == -1)
			getWordsUtil(index + 1, str, spots, lastOccurence, count, k);
	}

	public static void main(String[] args) {

		getWords("aabbac", 3);
	}
}
[aaa, aab, aac, aba, abb, abc, aca, acb, acc, baa, bab, bac, bba, bbb, bbc, bca, bcb, bcc, caa, cab, cac, cba, cbb, cbc, cca, ccb, ccc]
