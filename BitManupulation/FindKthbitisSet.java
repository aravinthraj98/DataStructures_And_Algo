package BitManupulation;

public class FindKthbitisSet {
   public static void main(String args[]) {
	   int n=4;//1110
	   int k=3;
	   int mask=1;
	   
	   mask<<=(k-1);
	   if((n|mask)==n) {
		   System.out.print("Bit is set");
	   }
	   else {
		   System.out.print("bit not set");
	   }
	   
	   //another aproach
	   while(k>1) {
		   n=n/2;
		   k--;
	   }
	   if((n%2)==0)System.out.print("bit not set");
	   else System.out.print("Bit set");
	   
   }
}
