package StackProblems;

import java.util.Stack;

public class HistogramArray {
	static void NSR(long hist[],long n,long res[]) {
		Stack<Integer> s= new Stack<>();
		for(int i=(int)n-1;i>=0;i--) {
			while(!s.isEmpty() && hist[s.peek()]>=hist[i]) {
				s.pop();
			}
			int value = s.isEmpty()?hist.length:s.peek();
			res[i]=value;
			s.push(i);

		}
	}
	static void NSL(long hist[],long n,long res[]) {
		Stack<Integer> s= new Stack<>();
		for(int i=0;i<n;i++) {
			while(!s.isEmpty() && hist[s.peek()]>=hist[i]) {
				s.pop();
			}
			int value = s.isEmpty()?hist.length:s.peek();
			res[i]=value;
			s.push(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long hist[] = { 6, 2, 5, 4, 5, 1, 6 };
		long nsmallL[] = new long[hist.length];
		long nsmallR[] = new long[hist.length];
		NSR(hist,hist.length,nsmallR);
		NSL(hist,hist.length,nsmallL);
		long width=0;
		long max=0;
		for(int i=0;i<hist.length;i++) {
		 width = nsmallR[i]-nsmallL[i]-1;
			max=Math.max(max, width*hist[i]);
		}
		System.out.print("maximum"+max);

	}

}
