package PracticeBasic;
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int year = new Scanner(System.in).nextInt();
        if((year%4==0 && year%100!=0) || year%400==0) {
        	System.out.print("leap year");
        }else System.out.print("not a leap year");

	}

}
