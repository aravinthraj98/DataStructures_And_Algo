package BitManupulation;

public class SquareWithoutpowordiv {
      static int squareNum(int n) {
    	  if(n<0)n=-n;
    	  if(n==0)return 0;
    	  if(n%2==0) {
    		  return 4*squareNum(n>>1);//4*sq(1)
    	  }
    	  else
    		  return 4*squareNum((n>>1))+4*(n>>1)+1;//4*sq(2)+4*2+1
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=6;
		int square = squareNum(num);
		System.out.print(square);

	}

}
