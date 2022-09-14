package Miscelanius;

public class FindAverageSubarray {
    public static void main(String[] args) {
        int arr[]={1,3,2,6,-1,4,1,8,2};
        FindAverageSubarray obj = new FindAverageSubarray();
        obj.averageSubArray(arr,arr.length,5);
        obj.averageSubArrayWin(arr,arr.length,5);

    }
    public void averageSubArray(int arr[],int n, int k){

        for(int i=0; i<=n-k;i++){
            double  avgArray=0;
            double  subSum=0;
            for(int j=i; j< i+k; j++){
                subSum+=arr[j];
            }
            avgArray=subSum/k;
            System.out.println("avgArray: "+ avgArray);
        }
    }

    public void averageSubArrayWin(int arr[], int n, int k){
        int startW=0;
        double avgSum=0;
        double subSum=0;
        for(int i=0; i<n;i++){
            subSum+=arr[i];
            if(i >= n-k){
                avgSum=subSum/k;
                System.out.println("avg: " + avgSum);
                subSum-=arr[startW];
                startW++;
            }
        }
    }
}
