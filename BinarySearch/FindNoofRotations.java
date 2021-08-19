package BinarySearch;

public class FindNoofRotations {
	public void FindRotation(int arr[],int low,int high) {
		int left=low;
		int right=high;
		int pivot=getPivot(arr,left,right);
	// 1 2 4 5 5 5 7 8
		if(pivot==-1) {
			System.out.print(0);
			return;
			
		}
		System.out.println(arr.length-1-pivot);
	}
 int getPivot(int arr[],int low,int high) {
	 int left=low;
	 int right=high;
	 if(left>right) {
		 return -1;
	 }
	 int mid= (left+right)/2;
	 if(mid<right && arr[mid+1]<arr[mid]) {
		 return mid;
	 }
	 if(mid>low && arr[mid-1]>arr[mid]) {
		 return mid-1;
	 }
	 if(arr[low]>arr[mid]) {
		 return getPivot(arr,low,mid-1);
	 }
	 return getPivot(arr,mid+1,high);
	 
 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,11,1,2,3,4,5,6,7,8,9,10};
		FindNoofRotations F= new FindNoofRotations();
		F.FindRotation(arr, 0, arr.length-1);
		
		
		

	}

}
