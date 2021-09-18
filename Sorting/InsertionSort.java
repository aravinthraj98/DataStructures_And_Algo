package Sorting;
//o(n2)worst case
//o(n) best case-sorted   
public class InsertionSort {
	public static void InsertionSort(int arr[]) {
		for(int i=1;i<arr.length;i++) {
			  int j=i-1;
			  int temp=arr[i];
			  while(j>=0 && arr[j]>temp) {
				  arr[j+1]=arr[j];
				  j--;
			  }
			  arr[j+1]=temp;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,3,1,8,9};
		InsertionSort(arr);
		for(int i:arr) {
			System.out.print(i);
		}

	}

}
