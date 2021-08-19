package BinarySearch;

public class BinAlgo {
	public int search(int arr[],int low,int high,int data) {
		int left =low;
		int right = high;
		int mid =(low+high)/2;
		if(left>right) {
			return -1;
		}
		if(arr[mid]==data) {
			return mid;
			
		}
		else if(arr[mid]>data) {
			return search(arr,left,mid-1,data);
		}
		else {
			return search(arr,mid+1,right,data);
		}
	}
	

}
