package BitManupulation;

public class CountBitsWithSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=15;
		int[] arr=new int[n+1];
		arr[1]=1;
		for(int i=2;i<=n;i++) {
			if(i%2==0) {
				arr[i]=arr[i/2];
			}
			else {
				arr[i]=1+arr[i/2];
			}
		}
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum+=arr[i];
		}
		System.out.print(sum);
		

	}

}
