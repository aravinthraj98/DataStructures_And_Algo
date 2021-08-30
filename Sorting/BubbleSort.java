package Sorting;

public class BubbleSort {
	static void bubbleIt(int [] arr) {
		for(int i=0;i<arr.length-1;i++) {
			int flag=0;
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=1;
				}
				
			}
//			System.out.print("break");
			if(flag==0)break;
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {7,4,9,2,1};
//		int arr[]= {1,2,3,4,5};
		
		bubbleIt(arr);
		for(int i:arr) {
			System.out.print(i);
		}

	}

}
