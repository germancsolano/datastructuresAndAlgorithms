package educateveio.patterns.SlidingWindow;

public class MinSizeSubArraySum {
    public static void main(String[] args) {
        MinSizeSubArraySum obj = new MinSizeSubArraySum();
        int arr[]={3,4,1,1,6};
        obj.findMinSubArray(8,arr);

    }
    public  int findMinSubArray(int S, int[] arr) {
        // TODO: Write your code here
        int subSum=0;
        int counter=Integer.MAX_VALUE;
        int startWin=0;
        for(int i=0;i<arr.length;i++){
            subSum+=arr[i];
           while (subSum>=S){
                if(i-startWin < counter) {
                    counter = i - startWin + 1;
                }
                subSum-=arr[startWin];
                startWin++;
            }
        }
        System.out.println(counter);
        return counter!=0 ? counter: -1;
    }

}
