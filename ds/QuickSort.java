package ds;

class QuickAlgo{
	
	public void QuickSort(Integer[] arr,int low,int high) {
	
		
		if(low<high) 
		{
			int prIndex = partition(arr,low,high);
			QuickSort(arr,low,prIndex-1);
			QuickSort(arr,prIndex+1,high);
		}
		
	}
	public int partition(Integer[] arr,int low,int high) {
		int pivot =arr[low];
		int left =low;
		int right=high;
		
		
		while(left<right) {
		
			
		
			while(arr[left]<=pivot && left<high) {
//				System.out.print("left"+left+"\n");
				left++;
				
			}
			while(arr[right]>pivot && right>low) {
				right--;
//				System.out.print("right"+right+"\n");
			}
			if(left<right) {
			  swap(arr,left,right);
				
			}
			
}
		
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.print("\n");
		swap(arr,low,right); 
		return right;
	
	}
	public void swap(Integer arr[],int left,int right) {
		int temp =arr[right];
		arr[right]=arr[left];
		arr[left]=temp;
		
	}
	public void print(Integer[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
		
	
}

public class QuickSort {
	public static void main(String args[]) {
		QuickAlgo q=new QuickAlgo();
		
	
//		Integer[] arr=new Integer[] {90,23,101,45,65,23,67,89,34,23};
		Integer[] arr = {50, 90, 60, 90, 90}; 
		int low=0;
		int high =arr.length-1;
		q.QuickSort(arr,low,high);
		q.print(arr);
	
		
	}
	

}
