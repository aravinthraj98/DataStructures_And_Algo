package BasicMap;

import java.util.*;

public class SortHashMapbyValues {
   public static void main(String args[]) {
	   Map<Integer,Integer> map = new HashMap<>();
	   map.put(1, 5);
	   map.put(2,6);
	   map.put(4, 2);
	   map.put(5, 4);
	   List<Map.Entry<Integer,Integer>> L = new LinkedList<>(map.entrySet());
	   Collections.sort(L,new Comparator<Map.Entry<Integer, Integer>>(){
		   @Override
		   public int compare(Map.Entry<Integer, Integer> o1,
                   Map.Entry<Integer, Integer> o2)
{
          return (o1.getValue()).compareTo(o2.getValue());
}
	   });
	   HashMap<Integer, Integer> temp = new LinkedHashMap<>();
	   for (Map.Entry<Integer, Integer> aa : L) {
           temp.put(aa.getKey(), aa.getValue());
       }
	   map.clear();
	   for(Map.Entry<Integer,Integer> a:temp.entrySet()) {
		  System.out.println(a.getKey()+ " "+a.getValue());
	   }
	   
   }
}
