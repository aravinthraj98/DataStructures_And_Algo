package BinarySearch;

public class FindFloor {
	static int k=-1;
	static int search(int[] arr,int low,int high,int target) {
		int mid =(low+high)/2;
		if(low>high) {
			return k;
		}
        if(arr[mid]>target) {
        	return search(arr,low,mid-1,target);
        }
       
        else if(arr[mid]<target) {
        	if(low<=mid) {
        		if(k<arr[mid]) {
        			k=arr[mid];
        			
        		}
        		return search(arr,mid+1,high,target);
        	}
        }
        if(arr[mid]==target) {
        	k=arr[mid];
        }
        return k;
		
		
	}
	public static void main(String args[]) {
		int arr[] = {1,2,2,3,5,7,7,7,8};
		System.out.print(search(arr,0,arr.length-1,8));
	}

}
