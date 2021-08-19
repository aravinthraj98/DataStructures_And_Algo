package GraphProblems;

import java.util.*;
import java.util.Collections;

class Process{
	int id;
	int arrival;
	int burst;
	Process(int id,int arrival,int burst){
		this.arrival=arrival;
		this.burst=burst;
		this.id=id;
	}
}

public class ShortesJobFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Process> A= new ArrayList<>();
//		A.add(new Process(1, 2, 3));
//		A.add(new Process(2, 0, 4));
//		A.add(new Process(3, 4, 2));
//		A.add(new Process(4, 5, 4));
		A.add(new Process(1,0,4));
		A.add(new Process(2,5,5));
		Collections.sort(A,new Comparator<Process>() {

			@Override
			public int compare(Process o1, Process o2) {
				// TODO Auto-generated method stub
				if(o1.arrival==o2.arrival) return o1.burst-o2.burst;
				return o1.arrival-o2.arrival;
			}
			
		});
		PriorityQueue<Process> Q=new PriorityQueue<>(new Comparator<Process>() {

			@Override
			public int compare(Process o1, Process o2) {
				// TODO Auto-generated method stub
				if(o1.burst==o2.burst) 	return o1.arrival-o2.arrival;
					return o1.burst-o2.burst;
			
			}
			
		});
		int time=0;
		int i=0;
		
		
		Q.add(A.get(i));
		i++;
		
		while(!Q.isEmpty()) {
			Process p=Q.poll();
			time+=p.burst;
			System.out.println(p.id+" "+time);
//			while(i<A.size() && A.get(i).arrival<=time) {
//				Q.add(A.get(i));
//				i++;
//			}
			while(true) {
				if(i<A.size() && A.get(i).arrival<=time) {
					Q.add(A.get(i));
              		i++;
				}
				else {
					if(i<A.size() && Q.isEmpty()) {
						time++;
						System.out.println("CPU STARVING FOR PROCESS");
					}
					else break;
				}
			}
		
		}
		
		

	}

}

//1. Completion Time: Time at which process completes its execution.
//2. Turn Around Time: Time Difference between completion time and arrival time.= Completion Time – Arrival Time
//3. Waiting Time(W.T): Time Difference between turn around time and burst time. = Turn Around Time – Burst Time