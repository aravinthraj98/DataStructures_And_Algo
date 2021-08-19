package Dp;

import java.util.HashMap;

public class TabCanConstruct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String c ="skateboard";
		String [] A ={"s","k","ska","te","e","Boa","b","oard"};
	   boolean b[] = new boolean[c.length()+1];
	   b[0]=true;
	   for(int i=0;i<b.length;i++) {
		   if(b[i]==true) {
			   for(String a:A) {
				   if(i<c.length()  && c.substring(i,i+a.length()).equals(a)) {
					   if(i+a.length()<b.length)b[i+a.length()]=true;
				   }
			   }
		   }
	   }
	   System.out.print(b[c.length()]);
	   

	}

}
