package PracticeBasic;

public class Fibonacci {
  static void iter(int n) {
	  if(n==0) {
		  System.out.print(0);
		  return;
	  }
	  int prev=0;
	  int cur=1;
	  System.out.print(0+" "+1+" ");
	  for(int i=2;i<n;i++) {
		  System.out.print(cur+prev+" ");
		  int temp=prev;
		  prev=cur;
		  cur=temp+cur;
	  }
	  
  }
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		iter(n);
	

	}

}
