package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;

public class ThreeDistinctCharacter {
	static ArrayList<String> A = new ArrayList<>();
	static boolean visited[];
static void getDistinct(String temp,String s) {
	if(s.length()==2) {
		if(A.contains(s))return;
		A.add(s);
	}
	for(int i=0;i<temp.length();i++) {
		if(!visited[i]) {
			 s=s+temp.charAt(i);
			 visited[i]=true;
			 getDistinct(temp,s);
			 visited[i]=false;
			 s=s.substring(0,s.length()-1);
		}
		  
		
		
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcabc";
	   char a[] = s.toCharArray();
	   Arrays.sort(a);
	   String temp=""+s.charAt(0);
	   for(int i=1;i<a.length;i++) {
		   if(a[i-1]!=a[i]) {
			   temp+=a[i];
		   }
	   }
	   
	   visited=new boolean[temp.length()];
		getDistinct(temp,"");
		System.out.print(A.toString());


	}
	
}

