package sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[]={9,2,8,12,7};
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int arr[]){
        int minIndex=0;
        for(int i=0;i< arr.length-1;i++){
            minIndex=i;
            for(int j=i+1; j< arr.length;j++){
                if(arr[j] < arr[minIndex]){
                    minIndex=j;
                }
            }
            int tmp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=tmp;
        }
    }
}
