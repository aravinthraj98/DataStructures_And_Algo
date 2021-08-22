package StackProblems;

import java.util.Stack;

public class CelebrityProb {
	static void FindCelebrity(int M[][]) {
		Stack<Integer> S=new Stack<>();
		for(int i=0;i<M.length;i++) S.push(i);
		while(S.size()>1) {
			int i = S.pop();
			int j=S.pop();
			if(M[i][j]==1) {
				S.push(j);
				
			}else {
				S.push(i);
			}
		}
		
		if(S.isEmpty())return;
		int temp =S.pop();
		for(int i=0;i<M.length;i++) {
			if(i==temp)continue;
			if(M[i][temp]==0 && M[temp][i]==1)return;;
		}
		System.out.print(temp);
		
	}
   public static void main(String args[]) {
		int n = 3;
		int M[][] = {{0, 0, 1},
			         {0, 0, 1}, 
			         {0, 0, 0},
			        };
		FindCelebrity(M);
   }
}
