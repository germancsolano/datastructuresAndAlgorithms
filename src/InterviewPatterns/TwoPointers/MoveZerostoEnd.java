package InterviewPatterns.TwoPointers;

import java.util.Arrays;

public class MoveZerostoEnd {
    public static void main(String[] args) {
        int arr[]={1,0,1,0,1,0,1,1,1,0,1};
        moveZeroes(arr,arr.length);
        System.out.println(Arrays.toString(arr));

    }
    static void moveZeroes(int arr[], int n)
    {
        int newLen=0;
        for(int i=0; i<n; i++){
            if(arr[i] != 0){
                arr[newLen]=arr[i];
                newLen++;
            }
        }
        for(int i=newLen;i<n;i++){
            arr[i]=0;
        }


    }
}
