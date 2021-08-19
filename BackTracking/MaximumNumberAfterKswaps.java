package BackTracking;

public class MaximumNumberAfterKswaps {
	static int max=Integer.MIN_VALUE;
	static String SwapNumber(String res,int i,int j) {
		StringBuilder r=new StringBuilder(res);
		r.setCharAt(i, res.charAt(j));
		r.setCharAt(j,res.charAt(i));
		return r.toString();
	}
    static void Swap(String n,int k,int index,int index1,String res) {
    	if(k==0) return;
    	if(max<Integer.parseInt(res)) {
    		System.out.println(k+"  "+res);
    		max=Integer.parseInt(res);
    	}
    	
    	for(int i=0;i<n.length();i++) {
    		for(int j=i+1;j<n.length();j++) {
    			if(res.charAt(j)>res.charAt(i)) {
    				res=SwapNumber(res,i,j);
    				Swap(n,k-1,index,index1,res);
    				res=SwapNumber(res,i,j);
    				
    			}
    		}
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String n="12345678";
		int k=4;
		Swap(n,k,0,0,n);
		System.out.print(max);

	}

}
