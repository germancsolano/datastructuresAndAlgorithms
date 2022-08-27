package ArraysSamples;

import java.util.ArrayList;
import java.util.List;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int arr[]= {5, 7, -24, 12, 10, 2, 3, 12, 5, 6, 35};
        longestIncreasingSubsequence(arr);
    }

    public static List<Integer> longestIncreasingSubsequence(int[] array) {
        // Write your code here.
        List<Integer> result=null;
        int maxSequence=0;
        for(int i=0;i < array.length; i++){
            result= new ArrayList<>();
            int currentSeq=0;
            result.add(array[i]);
            for(int j=i;j< array.length;j++){
                if(array[j] > array[j+1]){
                   break;
                }
                currentSeq++;
                result.add(array[j]);
            }
            maxSequence=Math.max(maxSequence,currentSeq);
        }
        return result.size()>0 ? result : new ArrayList<>();

    }
}
