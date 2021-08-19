package BackTracking;

public class AssignWork {
	static int sum=0;
	static void getCount(int a,int n,String s) {
		if(a==0) {
			System.out.println(s);
			sum++;
			return;
		}
		if(n>9 || a<0) {
			return ;
		}
		getCount(a-1,n,s+n);
		getCount(a,n+1,s);
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=2;
	    int arr[] = {4,1};
	    int max=0;
	    
	    for(int i=0;i<arr.length;i++) {
	    	sum=0;
	       getCount(arr[i],0,"");
	       max+=sum;
	    	
	    }
		System.out.print(max);

	}

}
