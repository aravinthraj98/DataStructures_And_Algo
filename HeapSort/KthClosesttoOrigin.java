package HeapSort;

import java.util.PriorityQueue;

public class KthClosesttoOrigin {
	static class Pair{
		int x,y,dist;
		Pair(int x,int y,int dis){
			this.x=x;
			this.y=y;
			this.dist=dis;
		}
	}
	
	static void getClosest(int points[][],int k) {
		PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->{return a.dist-b.dist;});
		for(int i=0;i<points.length;i++) {
			int sum =points[i][0]*points[i][0]+points[i][1]*points[i][1];
			pq.add(new Pair(points[i][0],points[i][1],sum));
		}
		while(!pq.isEmpty() && k!=0) {
			Pair temp = pq.poll();
			System.out.println(temp.dist+"-->"+temp.x+"-->"+temp.y);
			k--;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int points[][] = { { 3, 3 }, { 5, -1 }, { -2, 4 } };
		int k = 2;
		getClosest(points,k);

	}

}
