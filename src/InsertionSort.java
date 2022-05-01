import java.util.Arrays;

public class InsertionSort {

    static int arr[]={12,3,44,7,1,22,2};

    public static void main(String args[]){
        System.out.println("Insertion sort");
        sort(arr);
        System.out.println("sorted: "+ Arrays.toString(arr));

    }

    public static void sort(int arr[]){
        // we have to traverse all elements of the array so we use an outer for loop
        for(int i=0;i<arr.length;i++){
            // now we have to assign the element of ar[i] to a current value
            int current=arr[i];
            int j=i-1;
            // Now we have to compare the new element with all elements to the left until we have reached the element 0 or arr[i]>current
            while (j>=0 && arr[j] > current){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=current;
        }
    }

}
