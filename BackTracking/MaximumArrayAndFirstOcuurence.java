   package BackTracking;

public class MaximumArrayAndFirstOcuurence {
     static int max=Integer.MIN_VALUE;
     static void findMax(int[] arr,int i) {
    	 if(i==arr.length) return;
    	  if(max<arr[i]) max=arr[i];
    	  findMax(arr,i+1);
     }
     static int findMaxBackTrack(int arr[],int i) {
    	 if(i==arr.length-1) return arr[i];
    	 int getMax = findMaxBackTrack(arr,i+1);
    	 if(getMax>arr[i]) return getMax;
    	 else return arr[i];
     }
     static int firstOccurence(int arr[],int i,int num) {
    	 if(i==arr.length-1) {
    		 if(arr[i]==num)return i;
    		 return -1;
    	 }
    	 int getIndex=firstOccurence(arr,i+1,num);
    	 if(arr[i]==num) return i;
    	 return getIndex;
    	 
     }
     static void AllIndices(int arr[],int i,int num) {
    	 if(i==arr.length-1) {
    		 if(arr[i]==num)System.out.println(i);
    		 return;
    		
    	 }
    	AllIndices(arr,i+1,num);
    	 if(arr[i]==num) System.out.println(i);
    	 
     }
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,4,3,6,19,7,1,4};
		findMax(arr,0);
		System.out.print(max);
		System.out.print(findMaxBackTrack(arr,0));
		System.out.println(firstOccurence(arr,0,21));
		AllIndices(arr,0,4);
		

	}

}
