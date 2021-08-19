package GraphProblems;

import java.util.Scanner;

//You are a poor person in an island. There is only one shop in this island, this shop is open on all days of the week except for Sunday. Consider following constraints: 
//
//N – Maximum unit of food you can buy each day.
//S – Number of days you are required to survive.
//M – Unit of food required each day to survive.
//Currently, it’s Monday, and you need to survive for the next S days. 
//Find the minimum number of days on which you need to buy food from the shop so that you can survive the next S days, or determine that it isn’t possible to survive. 
public class SurviveISland {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int N =sc.nextInt();
		int S =sc.nextInt();
		int M=sc.nextInt();
		if((N*6 <M*7 && S>6)|| M>N) {
			System.out.print("No");
		}
		else {
			int total=S*M;
			int days=0;
			while(total>0) {
				days++;
				total-=N;
			}
			System.out.print(days);
			
		}

	}

}
