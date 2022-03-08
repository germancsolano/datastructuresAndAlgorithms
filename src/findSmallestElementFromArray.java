public class findSmallestElementFromArray {
    static int arr[]={100,99,222,234,144};
    public static void main(String args[]){
        System.out.println("finding the smallest element in Array :: "+findSmallestElement(arr));
    }
    private static int findSmallestElement(int arr[]){
        int minIndex=0;
        for(int i=minIndex+1;i < arr.length;i++){
            if(arr[i]<arr[minIndex]){
                minIndex=i;
            }
        }
        return arr[minIndex];
    }
}
