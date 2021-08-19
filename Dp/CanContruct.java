package Dp;

import java.util.HashMap;

public class CanContruct {
	static boolean GetPossiBilityBrute(String c,String[] A){
		if(c.equals("")) return true;
		for(String a:A) {
			if(c.indexOf(a)==0) {
				if(GetPossiBilityBrute(c.substring(a.length()),A)) {
					return true;
				}
			}
		}
		return false;
	}
	static boolean GetPossible(String s,String A[],HashMap<String,Boolean> h) {
		if(h.get(s)!=null) return h.get(s);
		if(s.equals("")) return true;
		for(String a:A) {
			if(s.indexOf(a)==0) {
				if(GetPossible(s.substring(a.length()),A,h)) {
					h.put(s,true);
					return true;
				}
			}
		}
		h.put(s,false);
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  //Is contruction of word is formed using the words of arrays
		String c ="skateboard";
		String [] A ={"s","ka","Ska","te","e","Boa","b","oard"};
		System.out.println("Possible"+GetPossiBilityBrute(c,A));
		HashMap<String,Boolean> h = new HashMap<>();
		System.out.println("Possibility"+GetPossible(c,A,h));
	}

}
