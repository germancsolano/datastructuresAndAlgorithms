package sorting;

public class BubbleSort {
    public static void main(String args[]){
        System.out.println("Bubble sort ");
        int arr[]={1,2,3,4,5};
        shiftArraytoLeft(arr);

    }
    public static void shiftArraytoLeft(int arr[]){
        for(int i=arr.length-1;i>=0;i--){
            arr[i-1]=arr[i];
        }
    }

}
