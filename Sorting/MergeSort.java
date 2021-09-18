package Sorting;

public class MergeSort {
	static void MergeSorts(Integer arr[],int lb,int ub) {
		if(lb<ub) {
			int mid =(lb+ub)/2;
			MergeSorts(arr,lb,mid);
			MergeSorts(arr,mid+1,ub);
			MergeArray(arr,lb,mid,ub);
		}
	}
	static void MergeArray(Integer A[],int lb,int mid,int ub) {
		int i=0;
		int j=0;
		int k=lb;

		int n1 = mid - lb + 1; 
		int n2 = ub - mid;
		
		int L[] = new int[n1];
		int R[] = new int[n2];
		for(int l=0;l<n1;l++) {
			L[l]=A[lb+l];
		}
		for(int m=0;m<n2;m++) {
			R[m]=A[mid+1+m];
		}
//		System.out.println(i+"<"+mid+"--"+j+"<"+ub);
		while(i<n1 && j<n2) {
			if(L[i]>=R[j]) {
				A[k]=R[j];
				
				j++;k++;
			}
			else {
				A[k]=L[i];
				i++;k++;
			}
		}
		
			while(i<n1) {
				A[k]=L[i];
				k++;i++;
			}
		
	
			while(j<n2) {
				A[k]=R[j];
				k++;j++;
			}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] A = {30,4,5,62,0,0,1};
		MergeSorts(A,0,A.length-1);
		for(int i:A) {
			System.out.print(i+" ");
		}

	}

}
