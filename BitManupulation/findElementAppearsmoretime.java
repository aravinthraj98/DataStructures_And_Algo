package BitManupulation;

public class findElementAppearsmoretime {//n/2 times
	public static void main(String args[]) {
		int n=5;
		int arr[]= {1,4,4,3,4};
		int len=Integer.BYTES*8;
		int value=0;
		
		for(int i=0;i<len;i++) {   
			int count=0;
			for(int j=0;j<n;j++) {
				if((arr[j]&(1<<i))>=1) {
					
					count++;
				}
			
			}
			
			if(count>n/2) {
				
				value+=Math.pow(2,i);
			}
		}
		
		int count=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==value)count++;
		}
		if(count>n/2)System.out.print(value);
		else System.out.print("no element present");
	}

}
