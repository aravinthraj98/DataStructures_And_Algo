package BinarySearch;

public class searchOnReverseSorted {
	static void Search(int arr[],int low,int high,int target) {
		int index =GetIndex(arr,low,high,target);
		System.out.print(index);
		
	}
	static int GetIndex(int arr[],int low,int high,int target) {
		if(low>high) {
			return -1;
		}
		int mid=(low+high)/2;
		if(mid<high && arr[mid]<target) {
			return GetIndex(arr,low,mid,target);
		}
		if(mid>low && arr[mid]>target) {
			return GetIndex(arr,mid+1,high,target);
		}
		if(arr[mid]==target) {
			return mid;
		}
		return -1;
	}
	
	public static void main(String args[]) {
		int arr[] = {100,22,11,10,9,8,7,6,5,4,3,2,1};
		 Search(arr,0,arr.length-1,1);
		 
		
		
	}

}
