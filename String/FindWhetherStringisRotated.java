package String;

public class FindWhetherStringisRotated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="ABCD";
		String str2="CDAB";
		
		//idea is str1+str1 anf find index of str2 return index;
		String temp=str1+str1;
	
		if(str1.length()==str2.length() && temp.indexOf(str2)!=-1) {
			System.out.print("It is rotated");
		}
		else System.out.print("not rotated");

	}

}
