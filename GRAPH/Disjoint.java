package GRAPH;
//union
public class Disjoint {
	static int n=5;
	static int[] parent=new int[n];
	static int rank[]=new int[n];
	static int find(int num) {
		if(num!=parent[num]) {
			parent[num]=find(parent[num]);//parent num changing to root
		
		}
		return parent[num];
		
	}
	static void union(int x,int y) {
		int xRoot = find(x);
		int yRoot = find(y);
		if(xRoot==yRoot) {
			System.out.print("Cycle");
			return;
		}
		if(rank[xRoot]>rank[yRoot]) {
			parent[yRoot]=xRoot;
		}
		else {
			if(rank[xRoot]<rank[yRoot]) {
				parent[xRoot]=yRoot;
			}
			else {
				parent[xRoot]=yRoot;
				rank[yRoot]++;
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<n;i++) {
			parent[i]=i;
		}
		union(1,0);
		union(2,1);
		union(0,2);
		
		
//		union(1,3);
		union(3,4);
		if(find(1)==find(3)) {
			System.out.print("2 and 3");
		}
		
		

	}

}
