package PracticeBasic;

public class FindQuadrent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=-5;
		int y=5;
		if(x==0 && y==0)System.out.print("origin");
		else if(x>0 && y>0)System.out.print("1st Quadrent");
		else if(x>0 && y<0)System.out.print("4st Quadrent");
		else if(x<0 && y>0)System.out.print("2nd Quadrent");
		else if(x<0 && y<0)System.out.print("3rd Quadrent");
		else System.out.print("not sure");
		

	}

}
