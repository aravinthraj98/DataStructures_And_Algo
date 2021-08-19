package BinarySearchPractice;

public class CountGivenElementInSortedArray {
	static int count=0;
	static int startPoint=Integer.MAX_VALUE;
	static int endPoint=Integer.MIN_VALUE;
	static void findCount(int arr[],int low,int high,int element) {
		if(high<low)return;
		int start=low;
		int end=high;
		
		int getIndex = FindElement(arr,start,end,element);
		if(getIndex==-1)return;
		startPoint=Math.min(getIndex, startPoint);
		endPoint=Math.max(getIndex, endPoint);
		findCount(arr,low,getIndex-1,element);
		findCount(arr,getIndex+1,high,element);
	}
	static int FindElement(int arr[],int low,int high,int element) {
		int mid =low+(high-low)/2;
		if(mid>low && arr[mid]>element) {
			return FindElement(arr,low,mid-1,element);
		}
		else if(mid<high && arr[mid]<element) {
			return FindElement(arr,mid+1,high,element);
		}
		if(arr[mid]==element) return mid;
		
		return -1;
		
	}
	
	
	public static void main(String args[]) {
		int find=7;
		int arr[]= {1,2,3,4,5,7,7};
		findCount(arr,0,arr.length-1,find);
		System.out.print("start"+startPoint+"-"+endPoint+"Count"+(endPoint-startPoint+1));
		
	}

}
