package HeapSort;


import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements {

	private static class Pair {
		int element;
		int frequency;

		public Pair(int element, int frequency) {
			this.element = element;
			this.frequency = frequency;
		}
	}

	private static void kFrequent(int arr[], int k) {
		if (arr.length < k)
			return;

		Map<Integer, Integer> map = new HashMap<>();
		for (int val : arr) {
			map.put(val, map.getOrDefault(val, 0) + 1);
		}
		
		PriorityQueue<Pair> minQueue = new PriorityQueue<>((a, b) -> a.frequency - b.frequency);
		for (int key : map.keySet()) {
			Pair p = new Pair(key, map.get(key));
			minQueue.add(p);
			
			if(minQueue.size() > k) {
				minQueue.poll();
			}
		}
		
		while(!minQueue.isEmpty()) {
			System.out.print(minQueue.poll().element + " ");
		}
	}

	public static void main(String[] args) {

		int k = 2;
		int arr[] = { 1, 1, 1, 2, 2, 3 };
		kFrequent(arr, k);
	}

}
