package BackTracking;

public class TowerOfHonoi {
	static void Move(int n,char src,char dest,char aux) {
		if(n==0) return;
		Move(n-1,src,aux,dest);
		System.out.println("src"+src+" "+"dest"+dest);
		Move(n-1,aux ,dest,src);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=3;
	    Move(n,'A','B','C');
		
		
        
	}

}
