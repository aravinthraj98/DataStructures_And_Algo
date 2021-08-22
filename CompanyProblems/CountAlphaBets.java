package CompanyProblems;

public class CountAlphaBets {
   static int GetWays(String s,int i,String temp1) {
	   if(temp1.equals("-1"))return 0;
	   
	   if(!temp1.equals("") && temp1.length()>0 && (Integer.parseInt(temp1)<=0 || Integer.parseInt(temp1)>26))return 0;
	 
	   if(i==s.length())return 1;
	   String temp="-1";
	   if(i+2<=s.length()) {
		   temp=s.substring(i,i+2);
	   }
	   return GetWays(s,i+1,s.substring(i,i+1))+GetWays(s,i+2,temp);
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="1271";
		System.out.print(GetWays(s,0,""));

	}

}
