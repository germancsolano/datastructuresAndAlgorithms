package InterviewPatterns.TwoPointers;

public class HasPairWithTarget {
    public static void main(String[] args) {
        int arr[]={1,5,10,20,80};
        int target=40;
        int n= arr.length-1;
        System.out.println(hasPairWithTarget(arr,n,target));


    }
    static int hasPairWithTarget(int arr[], int n, int target)
    {
        int lowIndex=0;
        int highIndex=n;
        int partialSum=0;
        while(lowIndex<highIndex && partialSum != target){
            partialSum =arr[lowIndex] + arr[highIndex];
            if(partialSum < target){
                lowIndex++;
            }else{
                highIndex--;
            }
        }
        if(partialSum == target){
            return 1;
        }


return 0;
    }
}
