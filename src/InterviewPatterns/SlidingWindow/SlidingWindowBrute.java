package InterviewPatterns.SlidingWindow;

public class SlidingWindowBrute {
    public static void main(String[] args) {
        int arr[] = {1, 5, -1, 6, 3, 2};
        int k = 3;
        int n = arr.length;
//        subarraySum(arr, n, k);
//        subArraySumBest(arr, n, k);
        int i = maxSubarraySum(arr, n, k);
        System.out.println("max = "+i);

    }

    public static void subarraySum(int arr[], int n, int k) {
        int i, j;
        for (i = 0; i <= n - k; i++) {
            int subSum = 0;
            for (j = i; j < i + k; j++) {
                subSum += arr[j];
            }
            System.out.println("subSum" + subSum);
        }
    }

    public static void subArraySumBest(int arr[], int n, int k) {
        int i;
        int wStart = 0;
        int subSum = 0;

        for (i=0;i < n; i++) {
            subSum += arr[i];

            if (i >= k - 1) {

                System.out.println(subSum);
                subSum -= arr[wStart];
                wStart++;
            }
        }

    }
    public static int maxSubarraySum(int[] arr, int n, int k)
    {
        //write your code here
        int i ;
        int subSum=0;
        int maxSum=0;
        int wStart=0;
        for(i=0; i < n; i++){
            subSum+=arr[i];

            if(i >= k-1){
                maxSum=Math.max(maxSum,subSum);
                System.out.println(maxSum);
                subSum-= arr[wStart];
                wStart++;
            }
        }
        return maxSum;
    }
}
