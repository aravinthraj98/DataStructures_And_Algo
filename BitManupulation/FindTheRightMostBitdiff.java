package BitManupulation;

public class FindTheRightMostBitdiff {

	
	public static void main(String args[]) {
		int a=10;
		int b=14;
		int mask=1;
		int count=1;
		while((a&mask)==(b&mask)) {
			count++;
			a=a>>1;
			b=b>>1;
			
		}
		System.out.print(count);
	}
}

