package GraphProblems;

public class MaximumOfthreeStack {
  public static void main(String args[]) {
//	  int stack1[] = { 3, 2, 1, 1, 1 };
//      int stack2[] = { 4, 3, 2 };
//      int stack3[] = { 1, 1, 4, 1 };
	  int stack1[] = { 3, 10};
	  int stack2[] = { 4, 5 };
	  int stack3[] = { 2, 1 };
      int top1,top2,top3;
      top1=top2=top3=0;
      int sum1,sum2,sum3;
      sum1=sum2=sum3=0;
      for(int i:stack1) sum1+=i;
      for(int i:stack2) sum2+=i;
      for(int i:stack3) sum3+=i;
      while(true) {
    	  if(top1==stack1.length || top2==stack2.length || top3==stack3.length) {
    		  System.out.print("no Sum");
    		  break;
    	  }
    	  else if(sum1==sum2 && sum2==sum3) {
    		  System.out.print(sum1);
    		  break;
    	  }
    	  else if(sum1>=sum2 && sum1>=sum3) {
    		  sum1-=stack1[top1];
    		  top1++;
    		  
    	  }
    	  else if(sum2>=sum1 && sum2>=sum3) {
    		  sum2-=stack2[top2];
    		  top2++;
    	  }
    	  else if(sum3>=sum1 && sum3>=sum2) {
    		  sum3-=stack3[top3];
    		  top3++;
    	  }
      }
      
  }
}
