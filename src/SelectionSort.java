import java.util.Arrays;

public class SelectionSort {
    static int arr[]={12,3,44,7,1,22,2};

    public static void main(String args[]) {
        System.out.println("Selection sort algorithm");
        sort(arr);
        System.out.println("sorted: " + Arrays.toString(arr));
    }

    private static void  sort(int arr[]){
        int indice=0;
        for(int i=0;i<arr.length-1;i++){
            indice = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[indice]){
                    indice=j;
                }
            }
      //      indice=findSmallestElement(arr);
            swap(arr,i,indice);
        }
    }
    private static void swap(int arr[], int a, int b){
        int temp=arr[b];
        arr[b]=arr[a];
        arr[a]=temp;
    }
    private static int findSmallestElement(int arr[]){
        int minIndex=0;
        for(int i=minIndex+1;i < arr.length;i++){
            if(arr[i]<arr[minIndex]){
                minIndex=i;
            }
        }
        return minIndex;
    }

}
