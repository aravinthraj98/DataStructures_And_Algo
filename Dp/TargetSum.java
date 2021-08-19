package Dp;

import java.util.HashMap;

public class TargetSum {
	static HashMap<Integer,Boolean> H= new HashMap<>();
	static boolean IsSum(int sum,int[] arr) {
		if(H.get(sum)!=null) return H.get(sum);
		if(sum==0)return true;
		if(sum<0)return false;
		for(int i:arr) {
			if(i==0)continue;
			int rem = sum-i;
			if(IsSum(rem,arr)) {
				H.put(sum,true);
				return true; 
			}
		}
		H.put(sum, false);
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=7;
		int arr[]= {2,6};
		System.out.print("is Sum:"+IsSum(sum,arr));

	}

}
