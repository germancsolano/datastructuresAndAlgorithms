package Miscelanius;

public class MaxSumSubarray {
    public static void main(String[] args) {
        int arr[]={1,5,-1,6,3,2};
        MaxSumSubarray obj = new MaxSumSubarray();
        obj.sumSubarray(arr,arr.length,3);
        obj.sumSubarrayWin(arr,arr.length,3);
    }

    public void sumSubarray(int arr[], int n, int k){

        int maxSum=0;
        for(int i=0; i<= n-k; i++){
            int sumWindow=0;
            for(int j=i; j< i+k; j++){
                sumWindow+=arr[j];
            }
            maxSum= Math.max(maxSum,sumWindow);
        }
        System.out.println(maxSum);
    }
    public void sumSubarrayWin(int arr[], int n, int k){
        int maxSum=0;
        int sumWin=0;
        int startWindow=0;
        for(int i=0; i<n;i++){
            sumWin+=arr[i];
            if(i >= n-k){
                sumWin-=arr[startWindow];
                startWindow++;
            }
            maxSum=Math.max(maxSum,sumWin);
        }
        System.out.println("win: "+ maxSum);

    }
}
