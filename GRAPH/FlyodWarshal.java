package GRAPH; 

import java.util.ArrayList;
import java.util.Arrays;
class FloydNode{
	int dest;
	int weight;
	FloydNode(int dest,int weight){
		this.dest=dest;
		this.weight=weight;
	}
}

public class FlyodWarshal {
	static int size=5;
	static int dist[][]=new int[size][size];
	
	static void addEdge(int u,int v,int w) {
		dist[u][v]=w;		
	}
	static  void floydAlgo() {
		for(int k=0;k<size;k++) {
			for(int i=0;i<size;i++) {
				for(int j=0;j<size;j++) {
//					if(i==2 && j==3 && k==1) {
//					  System.out.println(dist[i][k]+dist[k][j]);
//					}
			if(dist[i][k]!=Integer.MAX_VALUE && dist[k][j]!=Integer.MAX_VALUE)
					dist[i][j]=Math.min(dist[i][j], dist[i][k]+dist[k][j]);
				}
				
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<dist.length;i++) {
			Arrays.fill(dist[i], Integer.MAX_VALUE);
		}
     for(int i=0;i<size;i++) {
    	 dist[i][i]=0;
     }
     addEdge(0,1,5);
     addEdge(0,4,7);
     addEdge(1,4,4);
     addEdge(2,1,6);
     addEdge(4,2,5);
     addEdge(1,3,2);
     addEdge(2,3,9);
     addEdge(3,1,3);
     floydAlgo();
     for(int i=0;i<size;i++) {
    	 for(int j=0;j<size;j++) {
    		 System.out.print(dist[i][j]+"["+j+"]"+"\t");
    	 }
    	 System.out.print("\n");
     }
     
	}

}
