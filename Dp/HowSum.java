package Dp;

import java.util.HashMap;

public class HowSum {
	static HashMap<Integer,Boolean> H= new HashMap<>();
	static boolean getSum(int sum,int[] arr,String s) {
		if(H.get(sum)!=null) return H.get(sum);
		if(sum==0) {
			System.out.println(s);
			return true;
		}
		if(sum<0)return false;
		for(int i:arr) {
			
			if(getSum(sum-i,arr,s+i)) {
				 
				H.put(sum, true);
				return true;
				
				
			}
			
			
		}
		H.put(sum,false);
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=8;
		int arr[]= {4,3,2};
		System.out.print("is Sum:"+getSum(sum,arr,""));

	}

}
