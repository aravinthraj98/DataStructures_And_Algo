package Sorting;
//ALL case 
public class SelectionSort {
	static void swap(int arr[],int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	static void Sort(int arr[]){
		for(int i=0;i<arr.length-1;i++) {
			int min=arr[i];
			int temp=i;
			for(int j=i;j<arr.length;j++) {
				if(min>arr[j]) {
					min=arr[j];
					temp=j;
				}
			
			}
			if(i!=temp) {
				swap(arr,i,temp);
			}
		}
		for(int i:arr) {
			System.out.print(i+"  ");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,1,7,2,5,4};
	   Sort(arr);

	}

}
