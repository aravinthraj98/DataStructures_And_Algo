package PracticeBasic;

public class FindAdditionOfFraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=1;
		int d1=6;
		int n2=2;
		int d2=6;
		int sum1=0;
		int sum2=0;
		int LCM=1;
		if(d1==d2) {
			
			LCM=d1;
		}
		else {
			
		
			 LCM = d1>d2?d1:d2;
			for(int i=LCM;i<d1*d2;i++) {
				if(i%d1==0 && i%d2==0) {
					LCM=i;
					break;
				}
			}
			
			if(LCM%d1==0) {
				n1=n1*LCM/d1;
			}
			if(LCM%d2==0) {
				n2=n2*LCM/d2;
			}
		}
			
			sum1=n1+n2;
			
			sum2=sum1<LCM?sum1:LCM;
			
			
			int gcd=1;
			for(int i=2;i<=sum2;i++) {
				if(sum1%i==0 && LCM%i==0) {
					gcd=i;
				}
			}
			System.out.print(sum1/gcd+" /"+LCM/gcd);
			
			
		
		}

	}


