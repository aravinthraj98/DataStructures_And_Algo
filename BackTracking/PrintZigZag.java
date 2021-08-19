package BackTracking;

public class PrintZigZag {
	static void pzz(int n) {
		if(n==0) return;
		System.out.println("pre"+n);
		pzz(n-1);
		System.out.println("In"+n);// 
		pzz(n-1);
		System.out.println("Post"+n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=2;
		pzz(2);

	}

}
