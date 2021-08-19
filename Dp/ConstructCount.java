package Dp;

import java.util.HashMap;

public class ConstructCount {
  static int GetPossible(String c,String[] A,HashMap<String,Integer> h) {
	  if(h.get(c)!=null) return h.get(c);
	  if(c.equals("")) return 1;
	  int count =0;
	  for(String a:A) {
		  if(c.indexOf(a)==0) {
			  int tempCount = GetPossible(c.substring(a.length()),A,h);
			  count+=tempCount;
			  
			  
		  }
	  }
	  h.put(c, count);
	  return count;
	  
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String c ="skateboard";
		String [] A ={"s","ka","ska","te","e","boa","b","oard","rd","t"};

		HashMap<String,Integer> h = new HashMap<>();
		System.out.println("Possibility"+GetPossible(c,A,h));

	}

}
