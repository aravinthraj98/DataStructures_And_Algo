package BinarySearch;

public class NextString {
	static void Search(String arr[],int low,int high,String key) {
		while(low<=high) {
			int mid=(low+high)/2;
			int res = arr[mid].compareTo(key);
	
			if(res==0) {
				low=mid+1;
		}
			else if(res<0) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		System.out.print(low);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[] = {"a","c","d","d","d","d","e"};
		Search(arr,0,arr.length-1,"d");
		

	}

}
