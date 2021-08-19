package BackTracking;

public class PowerLinear {
	static int Power(int x,int n) {
		if(n==0) return 1;
		int P =Power(x,n-1);
		int pw =x*P;
		return pw;
	}
      public static void main(String args[]) {
    	  int n=5;
    	  int x=4;
    	  System.out.print(Power(x,n-1));
      }
}
