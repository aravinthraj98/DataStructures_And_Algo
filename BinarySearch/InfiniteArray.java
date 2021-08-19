package BinarySearch;

public class InfiniteArray {
	static void Search(int arr[],int low,int high,int key) {
			while(low<=high) {
				int mid=(low+high)/2;
				if(high==low && arr[low]!=key) {
					System.out.print(-1);
					
				}
				if(arr[mid]>key) {
					high=mid-1;
				}
				if(arr[mid]<key) {
					low=mid+1;
				}
				if(arr[mid]==key) {
					System.out.print(mid);
					return;
				}
				
			}
		
	    
		
		
			
		}
	static void getLowandHigh(int arr[],int low,int key,int high) {
		
		if(key<arr[high]) {
			Search(arr,low,high-1,key);
			return;
		}
		if(key>arr[high]) {
			low=high;
			if(2*high<arr.length) {
				high=2*high;
				getLowandHigh(arr,low,key,high);
				return;
				
			}
			else {
				low=high;
				if(arr.length>high+1) {
					high=high+1;
					getLowandHigh(arr,low,key,high);
				}
				else {
					System.out.print(-1);
				}
				
				return;
				
			}
		}
		if(key==arr[high]) {
			System.out.print(high);
			return;
		}
		System.out.print(-1);
		
		
	}
	
	public static void main(String args[]) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		getLowandHigh(arr,0,5,1);
		
	}

}
