package BitManupulation;

public class AndOperatorinRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=14;//1110
		int m=15;//10100
		String count="";
		while(n!=m) {
			n>>=1;
			m>>=1;
			count+="0";
		}
		
		
		if(n==m) {
			System.out.print(n+count);
		}
		
	}

}
