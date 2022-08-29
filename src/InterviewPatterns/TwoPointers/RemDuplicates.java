package InterviewPatterns.TwoPointers;

public class RemDuplicates {
    public static void main(String[] args) {
        int arr[]={1,1,1,3,3,5,5,};
        int n= arr.length;
        System.out.println( rmDuplicates(arr,n));

    }
    public static int rmDuplicates(int arr[], int n)
    {

        int newLen=0;
        for(int i=0;i<n;i++){
            if(i+1 >=n)
                continue;
            if(arr[i]!=arr[i+1]){
                arr[++newLen]=arr[i+1];
            }
        }
        return newLen+1;
    }
}
