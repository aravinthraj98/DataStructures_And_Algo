package Sorting;

public class QuickSort {
	static void QuickSort(int arr[],int low,int high) {
		if(low<high) {
			int pivot = getPivot(arr,low,high);
			QuickSort(arr,low,pivot-1);
			QuickSort(arr,pivot+1,high);
		}
	}
	static int getPivot(int arr[],int low,int high) {
		int pi =arr[low];
		int lb=low;
		int ub=high;
		while(lb<ub) {
			while(ub>low && arr[ub]>pi)ub--;
			while(lb<high && arr[lb]<=pi)lb++;
			if(lb>=ub)break;
			int temp =arr[lb];
			arr[lb]=arr[ub];
			arr[ub]=temp;
		}
		
		int temp =arr[ub];
		arr[ub]=arr[low];
		arr[low]=temp;
		return ub;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,4,8,3,9,2,4,11};
		QuickSort(arr,0,arr.length-1);
		for(int i:arr) {
			System.out.print(i+"  ");
		}
		

	}

}
