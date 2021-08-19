package GraphProblems;

import java.util.ArrayList;
import java.util.Collections;

class MeetingPair implements Comparable<MeetingPair> {
	int start;int end;int index;
	 MeetingPair(int start,int end,int index){
		 this.start=start;
		 this.end=end;
		 this.index=index;
	 }

	@Override
	public int compareTo(MeetingPair other) {
		// TODO Auto-generated method stub
		return this.end-other.end;
	}
}

public class MaximumMeeting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<MeetingPair> A = new ArrayList<>();
		
 		 int s[] = {75250, 50074, 43659, 8931, 11273, 27545, 50879, 77924};
	   int f[] = {112960, 114515, 81825, 93424, 54316, 35533, 73383, 160252 }; 
	   boolean[] visited = new boolean[s.length];
	   for(int i=0;i<s.length;i++) {
		   A.add(new MeetingPair(s[i],f[i],i));
	   }
	   Collections.sort(A);
       int i=0;
       int temp =A.get(i).index;
       visited[temp]=true;
      System.out.print(temp+1);
//       for(MeetingPair M:A) {
//    	   System.out.println(M.start+" "+M.end+" "+M.index);
//       }
      
       for(int j=1;j<s.length;j++) {
//    	   System.out.println(A.get(j).start+" "+A.get(i).end);
    	   if(A.get(j).start>A.get(i).end) {
    		   visited[A.get(j).index]=true;
    		   System.out.print(A.get(j).index+1);
    		   i=j;
    	   }
       }


       
       
       
	}

}
