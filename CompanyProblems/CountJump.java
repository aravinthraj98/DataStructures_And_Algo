package CompanyProblems;

import java.util.Arrays;

public class CountJump {
	private static int GetCount(int arr[],int n,int total,int i,int step,int count) {
		for(int j=i;j<arr.length;j++) {
			if(step+arr[j]==n) {
				count++;
				return count;
			}
			else if(step+arr[j]>n && step+arr[j]<total) {
				int getCount =Math.min(GetCount(arr,n,total,0,step-1,count+1),GetCount(arr,n,total,0,step-1,count+1));
				return getCount;
			}
			else    {
				if(step+arr[j]<n) {
					step+=arr[j];
//					System.out.println("count"+count+""+step);
					count++;
				}
				else {
					count+=1;
//					System.out.print("count"+count+""+step);
					return GetCount(arr,n,total,0,step-1,count);
				}
			}
		}
		return count;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total=26;//path we have
		int n=21;//point we need to reach;
		int arr[] = new int[n];
		arr[0]=1;
		arr[1]=1;
		// generate fibonacci series
		System.out.print(1+" "+1+" ");
		for(int i=2;i<n;i++) {
			arr[i]=arr[i-1]+arr[i-2];
			System.out.print(arr[i]+" ");
			
		}
		
		System.out.println("\n"+GetCount(arr,n,total,0,0,0));
		

	}

}
