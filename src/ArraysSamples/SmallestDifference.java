package ArraysSamples;

import java.util.Arrays;

public class SmallestDifference {
    public static void main(String[] args) {
        int arr1[]={-1, 5, 10, 20, 28, 3};
        int arr2[]={26, 134, 135, 15, 17};
        System.out.println(Arrays.toString(smallestDifference(arr1,arr2)));

    }
    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        // Write your code here.
        /// sort both Arrays
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);
        int lenArr1= arrayOne.length;
        int lenArr2 = arrayTwo.length;
        int index1=0, index2=0;
        int minDif=Integer.MAX_VALUE;
        int result[]= new int[2];
        while(index1<lenArr1 && index2<lenArr2){
            int diff=0;
            diff= Math.abs(arrayOne[index1]-arrayTwo[index2]);
            if(arrayOne[index1]<arrayTwo[index2]){
                if(diff < minDif) {
                    minDif = diff;
                    result[0]=arrayOne[index1];
                    result[1]=arrayTwo[index2];
                }
                index1++;
            }else{
                if(diff < minDif) {
                    minDif = diff;
                    result[0]=arrayOne[index1];
                    result[1]=arrayTwo[index2];
                }
                index2++;
            }
        }
        return result;
    }

}
