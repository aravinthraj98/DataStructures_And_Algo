package Dp_Problems.knapsnack;
//with repetation
public class CountSubsetWithSum {
      static int countSubset(int[] arr,int [] tab) {
    	   for(int i=0;i<arr.length;i++) {
    		   for(int j=1;j<tab.length;j++) {
    			  if(j>=arr[i]) {
    				 tab[j]+=tab[j-arr[i]]; 
    			  }
    		   }
    		  
    	  }
    	  return tab[tab.length-1];
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum =2;
		int arr[]  = {1,2,2,3};
		int tab[] = new int[sum+1];
		tab[0]=1;
		System.out.print("count tab "+countSubset(arr,tab));

	}

}
