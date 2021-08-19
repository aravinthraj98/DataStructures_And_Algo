package PracticeBasic;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1101;
		System.out.println(Integer.parseInt(a+"",2));
       a=Integer.parseInt(a+"",2);
       System.out.println("Octal"+Integer.toOctalString(a));
       System.out.println(Integer.parseInt(Integer.toOctalString(a),8));
       
	}

}
