package Dp;

import java.util.Arrays;

public class TabFib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//fib [1]=1; fib[0]=0 As the current element is added with two previous...while iterating fib[0] is added to fib[1] and fib[2] and fib[1] is added 
		// to fib[2] and fib[3]
		
		int n=8;
		int fib[]= new int[n+1];
		Arrays.fill(fib, 0);
		fib[1]=1;
		for(int i=1;i<n;i++) {
			fib[i+1]+=fib[i];
			if(i+2<=n) fib[i+2]+=fib[i];
		}
		System.out.print(fib[n]);//0,1,1,2,3,5,8,13

	}

}
