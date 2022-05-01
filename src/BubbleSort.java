import java.util.Arrays;

/**
 * Author: German Carranza Solano
 * Bubble sort is the most inefficient sorting algorithm
 * It takes O(x^2) times to execute
 * At sort method we will
 */
public class BubbleSort {
static int arr[]={12,3,44,7,1,22,2,0};
    public static void main(String args[]){
        System.out.println("Bubble sort algorithm");
        sort(arr);
        System.out.println("sorted: "+Arrays.toString(arr));
    }
    private static void sort(int arr[]){
        // i goes from 0 to the second last element
        for(int i=0;i<arr.length-1;i++){
            //j goes from 0 to second last minus i in each iteration
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
    }
    private static void swap(int arr[], int a, int b){
        int temp=arr[b];
        arr[b]=arr[a];
        arr[a]=temp;
    }
}
