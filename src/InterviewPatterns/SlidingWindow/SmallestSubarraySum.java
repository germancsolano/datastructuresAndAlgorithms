package InterviewPatterns.SlidingWindow;

public class SmallestSubarraySum {
    public static void main(String[] args) {
        int arr[]={3,5,12,4,8,6,9,7};
        int n= arr.length;
        int S=55;
        System.out.println(smallLengthSubarraySum(arr,n,S));

    }
    static int smallLengthSubarraySum(int arr[], int n, int S)
    {
        int i;
        int subSum=0;
        int minCount=Integer.MAX_VALUE;
        int wStart=0;

        for(i=0;i<n;i++){
            subSum+=arr[i];

            while(subSum>= S){
                int currentWindowSize=i-wStart +1;
                if(currentWindowSize < minCount){
                    minCount=currentWindowSize;
                }
                subSum-=arr[wStart];
                wStart++;
            }
        }
return minCount == Integer.MAX_VALUE ? 0: minCount;
    }
}
