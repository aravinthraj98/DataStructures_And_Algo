package BackTracking;

public class Factorial {
	static int factorial(int n) {
		if(n==1) return 1;
		int temp =factorial(n-1);
		int res =n*temp;
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		System.out.print(factorial(n));

	}

}
