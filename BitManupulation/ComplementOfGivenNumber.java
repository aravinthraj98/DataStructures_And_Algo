package BitManupulation;

public class ComplementOfGivenNumber {
  public static void main(String args[]) {
	  int n=20;//1110
	  int i=0;
	  int sum=0;
//	  System.out.println(1<<1);
	  while(n>0) {
		  if((n&1)==0) {
			 sum+=(1<<i);
			
			 
		  }
		  n>>=1;
			 i++;
	  }
	  System.out.print(sum);
  }
}
