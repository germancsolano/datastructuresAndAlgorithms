package ArraysSamples;

import java.util.Arrays;

public class findThreeLargestNumber {
    public static void main(String[] args) {
        int arr [] ={141, 1, 17, -7, -17, -27, 18, 541, 8, 7, 7};
        find3largest(arr,3);
    }

    public static int[]find3largest(int arr[], int k){
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int result[] = new int[k];
        int index=0;
        for(int j=arr.length-1;k>0;j--){
            result[--k]=arr[j];

        }
        return result;
    }

}
