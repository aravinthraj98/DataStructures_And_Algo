package BackTracking;

import java.util.ArrayList;
import java.util.Scanner;

public class CoinChange {
	static void getChanges(ArrayList<String> A,int[] arr,int i,int total,String s,boolean[] taken) {
		
		if(total==0) {
			A.add(s);
			return;
		}
		if(total<0)return;
		if(i>=arr.length) return;
	    getChanges(A,arr,i+1,total-arr[i],s+arr[i]+",",taken);
	    getChanges(A,arr,i+1,total,s,taken);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int total =sc.nextInt();
		boolean taken[]=new boolean[n];
		ArrayList<String> A = new ArrayList<>();
		getChanges(A,arr,0,total,"",taken);
		System.out.print(A.toString());

	}

}
