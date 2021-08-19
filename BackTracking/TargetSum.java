package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;

public class TargetSum {
	static ArrayList<String> A = new ArrayList<>();
	static void TargetPair(int arr[],int target,String s,boolean[] visited) {
		if(target==0) {
			String st[] =s.split(" ");
			Arrays.sort(st);
		
			String sm =Arrays.toString(st);
			if(A.contains(sm)) return;
			A.add(sm);
			return;
		}
		if(target<0) return;
		for(int i=0;i<arr.length;i++) {
			if(visited[i])continue;
			visited[i]=true;
			TargetPair(arr,target-arr[i],s+arr[i]+" ",visited);
			visited[i]=false;
			
		}
		
		
	}
	static void TargetPair1(int arr[],int sum,int index,int target,String s) {
		if(sum==target) {
			A.add(s+"]");
			return;
		}
		if(index==arr.length)return;
		if(sum>target)return;
		TargetPair1(arr,sum+arr[index],index+1,target,s+arr[index]+",");
		TargetPair1(arr,sum,index+1,target,s);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,30,40,50};
		int target =70;
		boolean visited[]=new boolean[arr.length];
		TargetPair(arr,target,"",visited);
		System.out.print(A.toString());
		A.clear();
		TargetPair1(arr,0,0,target,"[");
		System.out.print(A.toString());
		

	}

}
