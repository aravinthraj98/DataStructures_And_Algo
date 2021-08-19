package ds;


class BinarySearchAlgo{
	
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













class BinarySearch{
	public static void main(String args[]) {
		int arr[] = {1 ,2, 3, 4, 5, 6, 8, 9, 10, 14, 16, 19, 22, 23, 25, 26, 27, 29, 31, 34, 35, 36, 38, 39, 40, 45, 46, 48, 50, 51, 52, 57 ,59 ,60, 61, 63, 67, 68, 69, 71, 75, 76, 77, 79, 81, 82, 83, 86, 87, 88, 90, 92, 93, 94, 95, 96, 98, 99, 100				};
		BinarySearchAlgo Al = new BinarySearchAlgo();
		System.out.print(Al.search(arr, 0, arr.length-1,93));
		
	}
}