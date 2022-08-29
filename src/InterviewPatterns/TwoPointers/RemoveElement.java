package InterviewPatterns.TwoPointers;

public class RemoveElement {
    public static void main(String[] args) {
        int arr[]={10,30,40,10,10};
        int n= arr.length;
        int val=10;
        removeElement(arr,n,val);

    }

    public static int removeElement(int arr[], int n, int val){

        int auxIndex=0;
        for(int i=0;i< n; i++){
            if(arr[i] != val){
                arr[auxIndex]=arr[i];
                auxIndex++;
            }
        }
return auxIndex;
    }
}
