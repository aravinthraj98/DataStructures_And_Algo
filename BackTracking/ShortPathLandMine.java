package BackTracking;

public class ShortPathLandMine {
	static int min=Integer.MAX_VALUE;
	static String g="";
  static void getPath(int grid[][],int u,int v,String s,boolean visited[][]) {
	  if(u>=grid.length || v>=grid[0].length) return;
	  if(grid[u][v]==0 || grid[u][v]==-1) return;
	  if(v==grid[0].length-1) {
		  min=min>s.length()?s.length():min;
//	  System.out.println(s);
		  if(min==s.length()) {
			  g=s+u;
		  }
		  return;
		  
	  }
	  
	  
	  getPath(grid,u+1,v,s+'V',visited);
	  getPath(grid,u,v+1,s+'H',visited);
	
	  
	  
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int grid[][]={{ 1 , 1,  1,  1,  1,  1,1,  1,1 ,1 },
//				        { 1 , 0,  1,1,  1,1,  1,1 , 1,1 },
//						{ 1,1 , 1,  0,  1,1,  1,1,  1,1 },
//						{ 1,1  ,1,1 , 0 , 1,1 , 1,1 , 1 },
//						{ 1,1 , 1,1 , 1,1 , 1,1 , 1,1 },
//						{ 1,1  ,1,1  ,1,  0 , 1,1  ,1,1 },
//						{ 1,  0 , 1,1 , 1,1 , 1,1,  0,  1 },
//						{ 1,1 , 1,1 , 1,1 , 1,1 , 1,1 },
//						{ 1,1 , 1,1 , 1,1 , 1,1 , 1,1 },
//						{ 0 , 1,1 , 1,1 , 0  ,1,1,  1,1 },
//						{ 1,1 , 1,1  ,1,1 , 1,1 , 1,1 },
//						{ 1,1 , 1 , 0  ,1,1 , 1,1 , 1,1 }};
		
		int grid[][]= {{1,1,-1,1},
		{1,1,1,1},
		{-1,1,1,1},
		};
		for(int i=0;i<grid.length;i++) {
			for(int j=0;j<grid[0].length;j++) {
				if(grid[i][j]==0) {
					if(j<grid[0].length-1) {
						grid[i][j+1]=-1;
					}
					if(j>0)grid[i][j-1]=-1;
					if(i<grid.length-1)grid[i+1][j]=-1;
					if(i>0)grid[i-1][j]=-1;
				}
			}
		}
		
		for(int i=0;i<grid.length;i++) {
			for(int j=0;j<grid[0].length;j++) {
				System.out.print(grid[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<grid.length;i++) {
			getPath(grid,i,0,"",new boolean[grid.length][grid[0].length]);
		}
	
		System.out.print(min);
		System.out.print(g);;

	};

}
