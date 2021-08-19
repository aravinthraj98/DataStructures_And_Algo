package HeapSort;

import java.util.Collections;
import java.util.PriorityQueue;

public class kthLargestandSmallest {
	static void findKthSmallest(int arr[],int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i:arr) {
			pq.add(i);
		}
		while(!pq.isEmpty() && k!=1) {
			pq.poll();
			k--;
		}
		System.out.print("smallest"+ pq.poll());
	}
	static void findKthLargest(int arr[],int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		for(int i:arr) {
			pq.add(i);
		}
		while(!pq.isEmpty() && k!=1) {
			pq.poll();
			k--;
		}
		System.out.print("Largest"+ pq.poll());
	}
  public static void main(String args[]) {
		int k = 2;
		int arr[] = { 3, 2, 1, 5, 6, 4 };
		findKthSmallest(arr,k);
		findKthLargest(arr,k);
}
}