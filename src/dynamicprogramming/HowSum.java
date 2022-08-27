package dynamicprogramming;

import java.util.Arrays;

public class HowSum {
    public static void main(String[] args) {

        Arrays.toString(howSum(7,new int[]{5,2,3}));
    }

    public static int[] howSum(int target, int[]arr){
        int[] result = new int[arr.length];
        if(target==0){
            return  new int[0];
        }
        if(target < 0 ){
            return null;
        }
        for(int n : arr){
            int reminder=target-n;
            int rem[] = howSum(reminder,arr);
            if(rem !=null){
                return Arrays.copyOf(rem,rem.length+1);
            }
        }

        return  null;
    }

}
