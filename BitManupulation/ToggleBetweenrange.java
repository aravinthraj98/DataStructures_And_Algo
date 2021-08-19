package BitManupulation;

public class ToggleBetweenrange {
  public static void main(String args[]) {
	  int l=2;
	  int r=4;
	  int initialValue=16;//10000
	  
	  int count=0;
	  int value=0;
	  int mask=1;
	  while((mask&initialValue)==mask || mask<initialValue) {
		  if(count>=l-1 && count<=r-1) {
			 
			  if((initialValue|mask)!=initialValue)value+=Math.pow(2, count); 
			  
		  }
		  else {
			  
			  if((initialValue|mask)==initialValue)value+=Math.pow(2,count);
		  }
		  mask<<=1;
		  count++;
		  
	  }
	  System.out.print(value);
	  
	  
  }
}
