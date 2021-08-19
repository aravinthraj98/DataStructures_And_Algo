package SlidingAlgo;

public class AllAnagram {
	static void findAnagram(String all,String key) {
		int k=key.length();
		int i=all.length()-k+1;
		int j=0;
		String temp="";
		StringBuilder keyTemp=new StringBuilder(key);
		
		while(j<all.length()) {
			temp+=all.charAt(j);
			if(temp.length()==k) {
				int tempNum=0;
				while(tempNum<k) {
					if(keyTemp.indexOf(""+temp.charAt(tempNum))==-1) {
						break;
					}
					keyTemp.deleteCharAt(keyTemp.indexOf(""+temp.charAt(tempNum)));
					tempNum++;
				}
				if(keyTemp.length()==0) {
					System.out.print(j+1-k);
					
				}
				keyTemp=new StringBuilder(key);
				temp=temp.substring(1,temp.length());
				
				
			}
			j++;
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String all= "aaaaaa";
//		String key = "aaa";
		String all = "abab";
		String key = "ab";
		findAnagram(all,key);

	}

}
