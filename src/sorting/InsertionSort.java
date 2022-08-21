package sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[]={4,2,5,3,1,10};
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int arr[]){
        // 1.- We must have an upper for loop to iterate from 0 to n-1
        // 2.- Assign the element in 1 to a temp or current variable , this will be use to save the
        // smallest item in the ith position
        // 3.- create a new index j and assign the value i-1
        // 4.- Iterate thru a while loop with condition j>=0 and arr[j]> temp and shift all elemnet to the rigth
        // until we find a smallest element
        // 5.- assign to arr[j+1] the value in temp

        for (int i=0;i< arr.length;i++){
            int temp = arr[i];
            int j=i-1;
            while(j>=0 && arr[j] > temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }

    }
}
