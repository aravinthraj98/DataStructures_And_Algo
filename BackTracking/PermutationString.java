package BackTracking;



import java.util.ArrayList;
import java.util.Arrays;

public class PermutationString {
	static ArrayList<String> A = new ArrayList<>();
	static boolean visited[];
static void getDistinct(String temp,String s) {
	if(s.length()>3)return;
	if(s.length()==3) {
		if(A.contains(s))return;
		A.add(s);
	}
	for(int i=0;i<temp.length();i++) {
	
			 s=s+temp.charAt(i);
			 
			 getDistinct(temp,s);
			 
			 s=s.substring(0,s.length()-1);
		}
		  
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String temp = "aabbac";
	  
	   
	   visited=new boolean[temp.length()];
		getDistinct(temp,"");
		System.out.print(A.toString());


	}
	
}


