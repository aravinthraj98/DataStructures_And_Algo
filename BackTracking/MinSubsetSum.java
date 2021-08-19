package BackTracking;

//import java.util.ArrayList;
//
//public class FriendsPairing {
//	static void findPair(int n,String s,ArrayList<String> A,int j,boolean taken[]) {
//		if(j>n) {
//			System.out.println(s);
//			return;
//		}
//		if(taken[j]) {
//			findPair(n,s,A,j+1,taken);
//		}
//		else {
//			taken[j]=true;
//			findPair(n,s+"["+j+"]",A,j+1,taken);
//			for(int i=j+1;i<=n;i++) {
//				if(!taken[i]) {
//					taken[i]=true;
//					findPair(n,s+"["+j+i+"]",A,j+1,taken);
//					taken[i]=false;
//				}
//			}
//			taken[j]=false;
//		}
//		
////		if(s.length()>n)return;
//		
//	
//
//	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int n=3;
//		ArrayList<String> A = new ArrayList<String>();
//		findPair(n,"",A,1,new boolean[n+1]);
//		
//
//	}
//
//}
import java.util.HashSet;
import java.util.Set;

public class MinSubsetSum {
	
	static int minDiff = Integer.MAX_VALUE;
	static String ans = "";
	
	private static void subsets(int index, int[] arr, Set<Integer> set1, Set<Integer> set2, int sum1, int sum2) {

		if (index == arr.length) {
			int delta = Math.abs(sum1 - sum2);
//			System.out.println(set1 + " " + set2 + " " + delta);
			if(delta < minDiff) {
				minDiff = delta;
				ans = set1 + " " + set2 + "\n"; 
			}
			return;
		}

		if (set1.size() < (arr.length + 1) / 2) {		// Number of elements in each set must be equal or differ by one 
			set1.add(arr[index]);
			subsets(index + 1, arr, set1, set2, sum1 + arr[index], sum2);
			set1.remove(arr[index]);
		}

		if (set2.size() < (arr.length + 1) / 2) {		// Number of elements in each set must be equal or differ by one
			set2.add(arr[index]);
			subsets(index + 1, arr, set1, set2, sum1, sum2 + arr[index]);
			set2.remove(arr[index]);
		}
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 6, 4, 5,3 };
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();

		subsets(0, arr, set1, set2, 0, 0);
		System.out.println(ans);
	}
}