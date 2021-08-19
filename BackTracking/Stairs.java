package BackTracking;

import java.util.ArrayList;

public class Stairs {
	static ArrayList<String> A=new ArrayList<>();
	static void getPossible(int n,String s,int c) {
		if(c>n) return;
		if(c==n) {
			A.add(s);
			return;
		}
		for(int i=1;i<=n;i++) {
			
			getPossible(n,s+i,c+i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=3;
        getPossible(n,"",0);
        System.out.print(A.toString());
	}

}
