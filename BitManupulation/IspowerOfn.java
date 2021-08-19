package BitManupulation;

public class IspowerOfn {
	static void DivideMethod(int n) {
		  while(n%2==0) {
			   n=n/2;
		   }
		   if(n==1)System.out.println("power of 2");
		   else System.out.println("not a power");
	}
	static void CountSetBits(int n) {
		boolean flag=false;
		while(n>0) {
			if((n&1)==1) {
				if(!flag)flag=true;
				else {
					System.out.println("not a power");
					return;
				}
			}
			n>>=1;
		}
		System.out.println("power of 2");
	}
	static void logarathmic(int n) { //floor and ceil of log base will be same i
		System.out.print(Math.ceil(Math.log(n)/Math.log(2))==Math.floor(Math.log(n)/Math.log(2)));
	}
   public static void main(String args[]) {
	   int n=16;
	   DivideMethod(n);
	   CountSetBits(n);
	   logarathmic(n);
	 
   }
}
