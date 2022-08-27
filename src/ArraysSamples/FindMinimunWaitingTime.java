package ArraysSamples;

import java.util.Arrays;

public class FindMinimunWaitingTime {

    public static void main(String[] args) {
        int arr[]= {3, 2, 1, 2, 6};
        minimumWaitingTime(arr);

    }
    public static int minimumWaitingTime(int[] queries) {
        int length= queries.length;
        Arrays.sort(queries);
        int totwaitTime=0;
        for(int i=0;i<length;i++){
            int queriesLeft=length-(i+1);
            totwaitTime+=queries[i]*queriesLeft;
        }
        // Write your code here.
        return totwaitTime;
    }
}
