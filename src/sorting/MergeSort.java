package sorting;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int arr[] ={3,1,5,7,12,2,8,0};
        System.out.println(Arrays.toString(arr));
        mergesort(arr);
        System.out.println("sorted"+Arrays.toString(arr));
    }
    public static void mergesort(int arr[]){
        // find the length of the array
        int inputLength= arr.length;
        if(inputLength < 2)
            return;
        // we need to divide the array in half
        int mid = inputLength/2;
        // we need two auxiliary arrays

        int leftHalf[] = new int[mid];
        int rigthtHalf[] = new int[inputLength-mid];
        // now we need to populate both arrays
        for(int i=0; i< mid; i++){
            leftHalf[i]= arr[i];
        }
        for (int i=mid;i< inputLength; i++){
            rigthtHalf[i-mid]=arr[i];
        }
        // recursive call for both sides of the array
        mergesort(leftHalf);
        mergesort(rigthtHalf);
        merge(arr,leftHalf,rigthtHalf);

    }
    public static  void merge(int input[], int left[], int right[]){
        // we need to get the lenght of both arrrays
        int leftSize= left.length;
        int rightSize = right.length;
        int i=0,j=0,k=0;

        // We need to traverse both arrays to compare
        while(i < leftSize && j < rightSize ){
            if(left[i] <= right[j]){
                input[k]=left[i];
                i++;
            }else{
                input[k]= right[j];
                j++;
            }
            k++;
        }
        // copy whatever is missing from left
        while(i < leftSize){
            input[k]=left[i];
            i++;
            k++;
        }
// copy whatever is missing from right
        while(j < rightSize){
            input[k]= right[j];
            j++;
            k++;
        }

    }


}
