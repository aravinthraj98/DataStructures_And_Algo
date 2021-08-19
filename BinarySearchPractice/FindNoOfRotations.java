package BinarySearchPractice;

public class FindNoOfRotations {
	static void FindRotation(int[] arr,int low,int high) {
		int start=low;
		int end=high;
		int getPivot = IsRotated(arr,start,end);
		if(getPivot==-1)System.out.print("no rotatiosns");
		else System.out.println(arr.length-1-getPivot);
		
		
		
	}
	static int IsRotated(int arr[],int start,int end) {
		int mid = start+(end-start)/2;
		if(start>end)return -1;
		if(mid>start && arr[mid-1]>arr[mid])return mid-1;
		if(mid<end && arr[mid+1]<arr[mid])return mid;
		if(mid>start && arr[start]>arr[mid]) return IsRotated(arr,start,mid-1);
		if(mid<end && arr[end]<arr[mid])return IsRotated(arr,mid+1,end);
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,12,13 ,14};
		FindRotation(arr,0,arr.length-1);

	}

}
