package BinarySearch;
class Count{
	int count=0;
	int first=-1;
	int last =-1;
	public void Search(int[] arr,int low,int high,int key) {
		int left =low;
		int right =high;
		int pivot = GetPivot(arr,left,right,key);
		
		
		if(pivot!=-1) {
			if(first==-1) {
				first=pivot;
				last=pivot;
				
			}
			else {
				if(first>pivot) {
					first=pivot;
				}
				if(last<pivot) {
					last=pivot;
				}
			}
			count=count+1;
			
			Search(arr,left,pivot-1,key);
			Search(arr,pivot+1,high,key);
			
		}
		
		   
	}
	int GetPivot(int[] arr,int low,int high,int target) {
		if(low>high) {
			return -1;
		}
		int mid =(low+high)/2;
		
		
		if(mid<high && arr[mid]<target) {
			return GetPivot(arr,mid+1,high,target);
		}
		if(mid>low && arr[mid]>target) {
			return GetPivot(arr,low,mid-1,target);
		}
		if(arr[mid]==target)
		      return mid;
		return -1;
	}
	void print() {
		System.out.println("No of occurances"+count);
		System.out.print("first occurance"+first);
		System.out.print("Last occurance"+last);
	}
		
	
}

public class FindCount {
	
   
	public static void main(String args[]) {
		int arr[] = {1,3,4,5,6,6,6,7,8,9,9,10};
		Count C=new Count();
		C.Search(arr, 0, arr.length-1, 9);
		C.print();
		
	}
		
		
	

}
