package SlidingAlgo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class MinWindowContainsAllUnique {

	private static int minWindow(String str) {

		String res = "";

		Set<Character> set = new HashSet<>();
		for (char ch : str.toCharArray()) {
			set.add(ch);
		}

		int i = 0;
		int j = 0;
		HashMap<Character, Integer> map = new HashMap<>();
		while (j < str.length()) {
			map.put(str.charAt(j), map.getOrDefault(str.charAt(j), 0) + 1);

			while (map.size() == set.size()) {

				if (res.equals("") || res.length() > j - i + 1) {
					res = str.substring(i, j + 1);
				}

				char ch = str.charAt(i);
				if (map.get(ch) > 1) {
					map.put(ch, map.get(ch) - 1);
				} else {
					map.remove(ch);
				}

				i++;
			}

			j++;
		}
		
		System.out.println(res);
		return res.length();
	}

	public static void main(String[] args) {

		System.out.println(minWindow("bbacacdcbbcaadcdca"));
	}

}
