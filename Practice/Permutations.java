package Practice;



public class Permutations {
    public static void main(String[] args) {
        int n = 4;
        int arr[] = new int[n];
//        int range[] = new int[]
        print(4, 7, arr,0);

    }

    private static void print(int start, int end, int[] arr ,int index) {
        if(index==arr.length) {
        for(int j:arr)System.out.print(j);
        System.out.println();
        return;
        }
        if(index>arr.length)return;
        for(int i=start;i<=end;i++) {
        	arr[index]=i;
        	print(start,end ,arr,index+1);
        	arr[index]=0;
        }
        

     
    }
}

