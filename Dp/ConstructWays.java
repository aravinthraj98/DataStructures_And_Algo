package Dp;

import java.util.HashMap;

public class ConstructWays {
	static int Tcount=0;
	  static String GetPossible(String c,String[] A,HashMap<String,String> h,String s) {
		  if(h.get(c)!=null) return h.get(c);
		  if(c.equals("")) {
			
			  return c+"\n";
		  }
		  String count ="";
		  for(String a:A) {
			  if(c.indexOf(a)==0) {
				  String tempCount = GetPossible(c.substring(a.length()),A,h,s+a+"-"  );
				  count+=a+"-"+tempCount;
				  
				  
			  }
		  }
		  h.put(c,count);
//		  System.out.println(count);
		  return count;
		  
	  }
	  static String PossibilityBrute(String c,String[] A,String s) {
		  if(c.equals("")) {
			  s+="\n";
			  return s;
		  }
		  String res ="";
		  for(String a:A) {
			  if(c.indexOf(a)==0) {
				 String r = PossibilityBrute(c.substring(a.length()),A,s+a+"-");
				 res+=r;
			  }
		  }
		  return res;
	  }
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String c ="skateboard";
			String [] A ={"s","ka","ska","te","e","boa","b","oard","rd","t"};

			HashMap<String,String> h = new HashMap<>();
			System.out.println("Possibility"+GetPossible(c,A,h,""));
			
//			System.out.println("PossibilityBrute-->\n"+PossibilityBrute(c,A,""));
          
		}

	}