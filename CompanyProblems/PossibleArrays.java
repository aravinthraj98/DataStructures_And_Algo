package CompanyProblems;

public class PossibleArrays {
	static int count=0;
//	static void findCount(int n,int k,int size,int index,int arr[]) {
//		if(index==k) {
//			count++;
//			return;
//		}
//		if(size>n) {
//			
//			return;
//			}
//		if(index>0 &&((size)<arr[index-1] || (size)%arr[index-1]!=0)) {
//			return;
//			
//		}
//		
//	
//		
//		
//		
//		arr[index]=size;
//		findCount(n,k,size+1,index+1,arr);
//		findCount(n,k,size+1,index,arr);
//		
//	}

	

static void findCount1(int n,int k,int currCount,int prev,int curr,String s) {
	if(currCount!=0 && curr%prev!=0)return;
	if(currCount==k) {
		System.out.println(s);
		count++;
		return;
	}
	if(curr>n || prev>n)return;
	
	
	for(int i=1;i<=n;i++) {
		prev=curr;
	    
		findCount1(n,k,currCount+1,prev,i,s+i);
		
		
		
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=2;
		int k=1;

		findCount1(n,k,0,-1,1,"");
		System.out.print("COUNT"+count);

		
//{1,1,1}{1,1,2}{1,1,3}{1,1,4}{1,2,4}{2,2,2,}{3,3,3}{4,4,4}{2,2,4}{2,4,4}{1,2,2}{1,4,4}{

	}

}
//• Unique Birthday Gift
//Your birthday is coming soon and one of your friends, Alex, is thinking about a gift for you. He knows
//that you really like integer arrays with interesting properties.
//He selected two numbers, N and K and decided to write down on paper all integer arrays of length K
//(in form a[1], a[2], ..., a[K]), where every number a[i] is in range from 1 to N, and, moreover, a[i+1] is
//divisible by a[i] (where 1 < i <= K), and give you this paper as a birthday present.
//Alex is very patient, so he managed to do this. Now you're wondering, how many different arrays are
//written down on this paper?
//Since the answer can be really large, print it modulo 10000.

