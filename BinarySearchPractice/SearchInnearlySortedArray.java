package BinarySearchPractice;

public class SearchInnearlySortedArray {
	static void Search(int arr[],int key) {
		if(arr.length==0) {
			System.out.print(-1);
			return;
		}
		int low=0;
		int high=arr.length-1;
		while(low<=high) {
			int mid=low+(high-low)/2;
			
			if(arr[mid]==key) {
				System.out.print(mid);
				return;
			}
			if(arr[mid]<key) {
				low=mid+2;
				
			}
			else if(mid>low && arr[mid-1]==key) {
				System.out.print(mid-1);
				return;
			}
			else if(mid<high && arr[mid+1]==key) {
				System.out.print(mid+1);
				return;
			}
			else {
				high=mid-2;
			}
		}
		System.out.print(-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 3, 2, 10, 4, 40 };
		int key=40;
		Search(arr,key);

	}

}
