package Dp_Problems.coinChange;

public class coinChange1 {
    static int c ;
    public static void main(String[] args) {
        c = 0;
        int coins[] = {1, 2, 3};//111,12,3
        int sum = 8;
        findNoOfWaysUsingRec(coins, sum, coins.length,"");
        System.out.println(c);
    }

    private static void findNoOfWaysUsingRec(int[] coins, int sum, int n,String s) {
    
        if(sum == 0){
        	System.out.println(s);
            c++; 
            return;
        }
    	if(n<=0)return;

        else if(sum < 0) return;

      
            findNoOfWaysUsingRec(coins, sum - coins[n-1], n,s+coins[n-1]+",");
            findNoOfWaysUsingRec(coins,sum,n-1,s);
      
        
    }
}
