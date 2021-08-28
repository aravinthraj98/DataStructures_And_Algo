package CompanyProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class CountNumberGeeks
{
    static long count;
    public static void main(String[] args) {
        ArrayList<Long> list = new ArrayList<>();
        count = 0;
        // 2, 4, 6 ,8, 10, 12, 14, 16
        long arr[] = {12, 10, 8, 8, 12, 10, 15, 6, 5, 11, 2, 6};
        Arrays.sort(arr);

        findSub(arr, arr.length, list, 4, 9, 0);
        System.out.println(count);
    }
    
     private static void findSub(long[] arr, long n, ArrayList<Long> list, long k, long x, long cur) {
       if(k == cur){
//            Collections.sort(list);
    	   System.out.println(list);
            long diff = Math.abs(list.get(0)-list.get(list.size()-1));
            if(diff <= x)
                count+= 1;
            return;
        }
        if(n == 0) {

//         	
            return;
        }

       ArrayList<Long> include = new ArrayList<>(list);
        include.add(arr[(int)n-1]);
        findSub(arr, n-1, include, k, x, cur+1);
        findSub(arr, n-1, list, k, x, cur);
    }
}
