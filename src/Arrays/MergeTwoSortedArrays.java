package Arrays;

public class MergeTwoSortedArrays {
    static int arr1[]= {1,3,4,5};
    static int arr2[]= {2,6,7,8};
    public static void main(String args[]){
        System.out.println("merging arrays");
        int[] ints = mergeArrays(arr1, arr2);
        for(int i=0;i<ints.length;i++){
            System.out.println("item: " +ints[i]);
        }
    }
    public static int[] mergeArrays(int[] arr1, int[] arr2)
    {
        // write your code here
        int size1=arr1.length;
        int size2=arr2.length;
        int [] result= new int[size1 + size2];
        int index1=0;
        int index2=0;
        int indexNew=0;

        while (index1 <size1 && index2 < size2){
            if(arr1[index1]<arr2[index2]){
                result[indexNew++]=arr1[index1++];
            }else{
                result[indexNew++]=arr2[index2++];

            }
        }
        while(index1<size1){
            result[indexNew++]=arr1[index1++];
        }
        while(index2<size2){
            result[indexNew++]=arr2[index2++];
        }

        return result; // make a new resultant array and return your results in that
    }
}
