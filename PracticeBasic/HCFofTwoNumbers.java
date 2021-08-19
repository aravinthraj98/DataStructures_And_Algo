package PracticeBasic;

import java.util.Scanner;

public class HCFofTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int n=1;
        while(n!=0) {
        	n=num1%num2;
        	if(n!=0) {
        		num1=num2;
        		num2=n;
        	}
        }
        System.out.print(num2);
	}

}
