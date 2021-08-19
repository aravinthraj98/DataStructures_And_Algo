package BinarySearchPractice;

public class AllocationOfPages {
	static void Allocate(int[] arr,int m) {
		if(arr.length<m) {
			System.out.print(-1);
			return;
		}
		int low =arr[0];
		int high=0;
		for(int i:arr) {
			high+=i;
		}
		int res=-1;
		while(low<high) {
			int mid = low+(high-low)/2;
			if(canAllocate(arr,mid,m)) {
				 res=mid;
				 high=mid-1;
			}
			else {
				low=mid+1;
			}
		}
		System.out.print(res);
	}
	static boolean canAllocate(int arr[],int maxPage,int m) {
		int student=1;
		int page=0;
		for(int i:arr) {
			if(i>maxPage)return false;
			if(page+i>maxPage) {
				student++;
				page=i;
			}
			else {
				page+=i;
			}
		}
		return student<=m;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		8
//		250 74 159 181 23 45 129 174
//		6
		int arr[]= {
				
				
				
				132, 249 ,66 ,129 ,200
				
				
				
				};
		int m=5;
		Allocate(arr,m);
 
	}

}
