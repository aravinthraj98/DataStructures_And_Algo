package CompanyProblems;

public class WowArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a = {1,1,1,2,1,2,1,1,1,1};
		int max=0;
		int i=0;
		int j=1;
		
		while(i<a.length) {
			if(a[i]==a[j]) {
				if(j==a.length-2) {
					max+=1;
					break;
				}
				max++;
				i=j+1;
				
				j=i+1;
			}
			else {
				j++;
			}
		}
		System.out.print(max);
	    

	}

}
