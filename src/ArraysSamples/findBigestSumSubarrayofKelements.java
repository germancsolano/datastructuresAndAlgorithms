package ArraysSamples;

public class findBigestSumSubarrayofKelements {
    public static void main(String[] args) {
        int arr[]={4,5,2,1,6,10,12,20,3};
        System.out.println(sumBForce(arr,4));
        System.out.println("sliding: " + sumSliding(arr,4));
    }

    public static int sumBForce(int arr[],int k ){
        //
        int maxSum=0;
        for(int i=0; i<=arr.length-k; i++){
            int currentSum=0;
            for (int j=i;j<k+i;j++){
                currentSum+=arr[j];
            }
            maxSum=Math.max(maxSum,currentSum);
        }
        return maxSum;
    }

    public static int sumSliding(int arr[], int k){
        int maxSum=0;
        // lets get the sum for the first k elements

        int currentSum=0;
        for(int i=0;i<k;i++){
            currentSum+=arr[i];
        }
        for(int end = k; end < arr.length; end++){
            currentSum+=arr[end] - arr[end-k];
            maxSum=Math.max(currentSum,maxSum);
        }
return maxSum;
    }

}
