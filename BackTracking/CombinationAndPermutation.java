package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class CombinationAndPermutation {
	static ArrayList<String> A;
	static String s;
	static boolean visited[];
	static HashSet<String> H;
	static void positionnonIdentical(int items,int position,int place,String s,int index) {
		if(place==items) {
			char a[]=s.toCharArray();
			Arrays.sort(a);
			
			boolean isAvail =H.add(new String(a));
			
			if(isAvail)
			   A.add(s);
			return;
		}
		for(int i=index;i<position;i++) {
			if(visited[i])continue;
				visited[i]=true;
				s+=String.valueOf(i);
				positionnonIdentical(items,position,place+1,s,index+1);
				if(s.length()>1) s=s.substring(0,s.length()-1);
				else s="";
				visited[i]=false;
				
			
		}
	}
	static void positionIdentical(int items,int position,int place,String s) {
		if(place==items) {
			A.add(s);
			return;
		}
		for(int i=1;i<=position;i++) {
			if(!visited[i]) {
				visited[i]=true;
				s+=String.valueOf(i);
				positionIdentical(items,position,place+1,s);
				if(s.length()>1) s=s.substring(0,s.length()-1);
				else s="";
				visited[i]=false;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int items=3;
		int positions =4;
		int[] nonIdentical = {99,66,88};
		visited = new boolean[positions+1];
		boolean[] visited =new boolean[positions+1];
		A=new ArrayList<>();
		s="";
		H=new HashSet<String>();
//		positionIdentical(items,positions,0,s);//it is non identical name wrong
//		System.out.print(A.toString());
//		System.out.print(A.size());
		A.clear();
		positionnonIdentical(items,positions,0,s,0);//it is identical name wrong
		System.out.print(A.toString());
		

	}

}
