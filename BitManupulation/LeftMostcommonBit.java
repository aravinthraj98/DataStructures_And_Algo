package BitManupulation;

public class LeftMostcommonBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int a=16;int b=12;//10000 //1100
  while(a!=b && a>0 && b>0) {
	  a>>=1;
	  b>>=1;
  }
if(a==0 || b==0)System.out.print("no common bit");
else System.out.print(a);
	}

}
