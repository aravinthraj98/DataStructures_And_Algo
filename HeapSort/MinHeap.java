package HeapSort;

public class MinHeap {
	static void MinHeap(int arr[]) {
		for(int i=arr.length/2-1;i>=0;i--) {
			heapify(arr,arr.length,i);
		}
		for(int i=arr.length-1;i>0;i--) {
			int temp =arr[i];
			arr[i]=arr[0];
			arr[0]=temp;
			heapify(arr,i,0);
		}
	}
	static void heapify(int arr[],int n,int i) {
		int largest =i;
		int l = 2*i+1;
		int r = 2*i+2;
		if(l<n && arr[l]>arr[largest]) {
			largest=l;
		}
		if(r<n && arr[r]>arr[largest]) {
			largest=r;
		}
		if(i!=largest) {
			 int temp=arr[i];
			 arr[i]=arr[largest];
			 arr[largest]=temp;
			 heapify(arr,n,largest);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,9,4,1};
        MinHeap(arr);
        for(int i=0;i<arr.length;i++) {
        	System.out.print(arr[i]);
        }

	}

}
