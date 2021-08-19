package SlidingAlgo;

public class LargestSubArrayOfK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10, 12, 9, 8, 10, 15, 1, 3, 2};
		int k=3;
		int j=0;
		int sum=0;
		int max=0;
		for(int i=0;i<arr.length;i++) {
			if(k>i-j) {
				sum+=arr[i];
				
				
			}
			
			else {
				
				max=max>sum?max:sum;
//				System.out.println(max);
				sum-=arr[j]+arr[i];
				j++;
			}
		}
		System.out.print(max);

	}

}
