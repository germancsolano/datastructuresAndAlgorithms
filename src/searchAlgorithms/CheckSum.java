package searchAlgorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CheckSum {
    static int arr[] = {1, 21, 3, 14, 5, 60, 7, 6};

    public static void main(String args[]){
        int[] sum = findSum(arr, 81);

        System.out.println(Arrays.toString(sum));
        int[] sumMap = findSumMap(arr, 81);
        System.out.println(Arrays.toString(sumMap));
    }
    public static int[] findSum(int [] arr, int value){
        int [] result = new int [2];
        int resi=0;
        for(int i=0;i<arr.length;i++){
            resi=value-arr[i];
            for (int j=0;j<arr.length;j++){
                if(arr[j]==resi) {
                    result[0] = arr[i];
                    result[1] = arr[j];
                    return result;
                }

            }

        }
        return null;
    }

    public static int [] findSumMap(int arr [] , int value){
        int result[]= new int [2];
        Map<Integer, Integer> element= new HashMap<>();
        for(int i=0; i< arr.length;i++)
            element.put(arr[i],i);
        int diff=0;
        for (int i=0;i<arr.length;i++){
            diff=value-arr[i];
            if(element.containsKey(diff) && diff != arr[i]) {
                result[0] = arr[i];
                result[1] = arr[element.get(diff)];
            }
        }

        return result;
    }

}
