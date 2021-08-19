package PracticeBasic;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=100;
		StringBuilder s = new StringBuilder(""+n);
		String t = s.reverse().toString();
		System.out.print("rever"+Integer.parseInt(t));

	}

}
