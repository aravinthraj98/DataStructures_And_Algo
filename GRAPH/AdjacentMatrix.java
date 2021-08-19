package GRAPH;

public class AdjacentMatrix {
	static void addVertices(int[][] graph,int u,int v) {
		graph[u][v]=1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int size =5;
		 int[][] graph = new int[size][size];
		 addVertices(graph,0,1);
		 addVertices(graph,0,2);
		 addVertices(graph,1,3);
		 addVertices(graph,1,2);
		 addVertices(graph,2,1);
		 addVertices(graph,2,3);
		 addVertices(graph,2,4);
		 addVertices(graph,3,2);
		 addVertices(graph,3,4);
		 addVertices(graph,4,3);
		 addVertices(graph,4,2);
		 addVertices(graph,4,0);
		 addVertices(graph,0,4);
		 for(int i=0;i<size;i++) {
			 for(int j=0;j<size;j++) {
				 System.out.print(graph[i][j]+" ");
			 }
			 System.out.print("\n");
		 }
		 
		 

	}

}
