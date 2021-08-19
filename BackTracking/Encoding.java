package BackTracking;

import java.util.ArrayList;

public class Encoding {
	static ArrayList<String> A = new ArrayList<>();
	
	static void GetEncoded(String s,String res) {
		if(s.length()==0) {
			A.add(res);
			return;
		}
		if(res.length()>0 && Integer.parseInt(res)>26 && Integer.parseInt(res)<=0) return;
	
	}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="123";
		if(str.charAt(0)=='0') {
			System.out.print("Invalid");
			
		}
		String a="";
	    GetEncoded(str,a);
	    System.out.print(A.toString());

	}

}
