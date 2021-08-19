package BackTracking;

import java.util.ArrayList;

public class KeyPadCOmbination {
	static ArrayList<String> A = new ArrayList<String>();
	
	
	static void getCombination(String keyPad[],int key[],int index,String str) {
		if(str.length()==key.length) {
			A.add(str);
			return;
		}
		int getString =key[index];
		index++;
		String temp =keyPad[getString];
		for(char arr:temp.toCharArray()) {
			getCombination(keyPad,key,index,str+arr);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String keyPad[]= {"#",".","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		int key[]= {3,4,5};
		getCombination(keyPad,key,0,"");
		System.out.print(A.toString());
		

	}

}
