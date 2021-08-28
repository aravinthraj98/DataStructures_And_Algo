package CompanyProblems;

import java.util.ArrayList;
import java.util.PriorityQueue;
class pairs implements Comparable<pairs>{
	int currentValue;
	int futureValue;
	pairs(int currentValue,int futureValue){
		this.currentValue=currentValue;
		this.futureValue=futureValue;
	}
	public int compareTo(pairs other) {
		return (other.futureValue-other.currentValue)-(this.futureValue-this.currentValue);
	}
}

public class StockMaxProfit {
	public static void main(String args[]) {
		ArrayList<Integer> cur = new ArrayList<>();
		ArrayList<Integer> sav = new ArrayList<>();
		PriorityQueue<pairs> p = new PriorityQueue<pairs>();
		cur.add(10);
		cur.add(5);
		cur.add(25);
		sav.add(15);
		sav.add(20);
		sav.add(15);
		for(int i=0;i<cur.size();i++) {
			p.add(new pairs(cur.get(i),cur.get(i)));
		}
		int saving=300;
		int profit=0;
		while(saving>0 && !p.isEmpty()) {
			pairs temp = p.poll();
			if(temp.futureValue-temp.currentValue>0 && saving>=temp.currentValue) {
				profit+=temp.futureValue-temp.currentValue;
				saving-=temp.currentValue;
			}
		}
		System.out.print(profit);
		
		
		
	}

}
