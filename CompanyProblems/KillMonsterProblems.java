package CompanyProblems;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;
class Pair implements Comparable<Pair>{
	int monster;
	int bonus;
	Pair(int monster,int bonus){
		this.monster=monster;
		this.bonus=bonus;
	}

	@Override
	public int compareTo(Pair o) {
		// TODO Auto-generated method stub
		
		return this.monster-o.monster;
	}
}
public class KillMonsterProblems {
	static int getDefeatedCount(PriorityQueue<Pair> pq,int experience) {
		int defeat=0;
		while(pq.isEmpty()==false) {
			Pair temp =pq.poll();
			if(experience-temp.monster>=0) {
				experience+=temp.bonus;
				defeat++;
			}
			else {
				break;
			}
		}
		return defeat;
	}
	
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		int noOfMonsters = sc.nextInt();
		PriorityQueue<Pair> pq=new PriorityQueue<>();
		int experience=sc.nextInt();
		int arr[]=new int[noOfMonsters];
		for(int i=0;i<noOfMonsters;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<noOfMonsters;i++) {
			pq.add(new Pair(arr[i],sc.nextInt()));
		}
		System.out.print(getDefeatedCount(pq,experience));
		
	}

}


//While playing an RPG game, you were assigned to complete one of the hardest quests in this game.
//There are n monsters you'll need to defeat in this quest. Each monster i is described with two integer
//numbers - poweri and bonusi. To defeat this monster, you'll need at least poweri experience points. If
//you try fighting this monster without having enough experience points, you lose immediately. You will
//also gain bonusi experience points if you defeat this monster. You can defeat monsters in any order.
//The quest turned out to be very hard - you try to defeat the monsters but keep losing repeatedly. Your
//friend told you that this quest is impossible to complete. Knowing that, you're interested, what is the
//maximum possible number of monsters you can defeat? (Question difficulty level: Hardest)
//Input:
//The first line contains an integer, n, denoting the number of monsters.
//The next line contains an integer, e, denoting your initial experience.
//Each line i of the n subsequent lines (where 0 ≤ i < n) contains an integer, poweri, which represents
//power of the corresponding monster.
//Each line i of the n subsequent lines (where 0 ≤ i < n) contains an integer, bonusi, which represents
//bonus for defeating the corresponding monster.
