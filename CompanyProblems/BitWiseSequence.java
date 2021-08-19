package CompanyProblems;

import java.util.Scanner;

public class BitWiseSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int temp=sc.nextInt();
		int count=0;
		int max=0;
		for(int i=1;i<n;i++) {
			int tempNew =sc.nextInt();
			if(2*(temp&tempNew)<(temp|tempNew) && temp<tempNew) {
//				System.out.println(temp+" "+tempNew);
				if(count==0) count+=2;
				else count++;
			}
			else {
				max=max>count?max:count;
				count=0;
			}
			temp=tempNew;
		}
  System.out.print(max);
	}

}
//Bitwise subsequence
//You have an array A of N integers A1 A2 .. An. Find the longest increasing subsequence Ai1 Ai2 .. Ak
//(1 <= k <= N) that satisfies the following condition:
//For every adjacent pair of numbers of the chosen subsequence Ai[x] and Ai[x+1] (1 < x < k), the
//expression( Ai[x] & Ai[x+1] ) * 2 < ( Ai[x] | Ai[x+1] ) is true
//Note: '&' is the bitwise AND operation, ' | ' is the bit-wise OR operation
//Input:
//The first line contains an integer, N, denoting the number of elements in A.
//Each line i of the N subsequent lines (where 0 ≤ i < N) contains an integer describing Ai