package BackTracking;

public class KnightsMove {
	
	static void  getKnight(int N,int i,int j,int visited[][],int moves) {
		if(moves==N*N) {
		
	
			return;
		}
		
		if(isSafe(N,i,j)) {
			if(visited[i][j]==0) {
				visited[i][j]=moves;
			   
			
				
//				System.out.print(i+""+j+" ");
			    getKnight(N,i+2,j+1,visited,moves+1);
			   
				getKnight(N,i+1,j+2,visited,moves+1);
				getKnight(N,i-1,j+2,visited,moves+1);
				getKnight(N,i-2,j+1,visited,moves+1);
		        getKnight(N,i-2,j-1,visited,moves+1);
				getKnight(N,i-1,j-2,visited,moves+1);
				getKnight(N,i+1,j-2,visited,moves+1);
				getKnight(N,i+2,j-1,visited,moves+1);
				
				
				
				
				
				
			
				
		
			}
			
		}
		
		return;
	}
	static void Print(int[][] visited) {
		 for(int i=0;i<visited.length;i++) {
			   for(int j=0;j<visited[0].length;j++) {
				   System.out.print(visited[i][j]+" ");
			   }
			   System.out.println();
		   }
		   System.out.println("===============");
	}
	
	static boolean isSafe(int N,int i,int j) {
		if(i<0 || j<0 || i>=N || j>=N) return false;
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int visited[][]=new int[3][3];
   
   getKnight(3,0,0,visited,1);
   
   Print(visited);
   
  
	}

}
