package SlidingAlgo;

import java.util.HashMap;

public class CountAtleastKUnique {
	static void CountKUnique(String s,int k) {
		if(s.length()<k) {
			System.out.print(0);
			return;
		}
		HashMap<Character,Integer> H = new HashMap<>();
		int j=0;
		int res=0;
		for(int i=0;i<s.length();i++) {
			H.put(s.charAt(i), H.getOrDefault(s.charAt(i),0)+1);
			while(H.size()>=k) {
				if(H.get(s.charAt(i))>1) {
					H.put(s.charAt(i), H.get(s.charAt(i))-1);
				}
				else {
					H.remove(s.charAt(i));
				}
				res+=s.length()-i;//adding all element as combination as it is atleasr
				
				j++;
			}
		}
		System.out.print(res);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="abccd";
		CountKUnique(s,3);

	}

}
