package Dp;

import java.util.Arrays;

public class Fibonacci {
	static int fib(int n,int[] arr) {
		if(arr[n]!=-1)return arr[n];
		if(n<=2)return 1;
		arr[n]=fib(n-1,arr)+fib(n-2,arr);
		return arr[n];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=20;
		int arr[]=new int[n+1];
		Arrays.fill(arr,-1);
		System.out.print(fib(n,arr));

	}

}
