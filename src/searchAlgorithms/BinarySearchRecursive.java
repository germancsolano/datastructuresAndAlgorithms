package searchAlgorithms;

public class BinarySearchRecursive {
    // We must define an array to look for and an element to search
    static int arr[]={2,4,6,8,10,12,14,16};
    static int toSearch=24;
    public static void main(String args[]){
        System.out.println("Starting recursive banary search" );
        System.out.println("calling binary recirsive for: " + toSearch);
        BinarySearchRecursive binarySearchRecursive = new BinarySearchRecursive();
        int i = binarySearchRecursive.binarySearch(toSearch);
        if(i==-1){
            System.out.println("Element : " + toSearch + " not found");
        }else
            System.out.println("Element: " + toSearch + " found at index:  "+i);
    }
    public int binarySearch(int item){
        return binarySearch(item,0,arr.length-1);

    }

    private int binarySearch(int item, int minIndex, int maxIndex) {

        if(minIndex == maxIndex){
            if(arr[minIndex] == item)
                return minIndex;
            return -1;
        }
        int middle= (int) Math.floor(minIndex + maxIndex)/2;
        if(arr[middle] == item)
            return middle;
        if(item>arr[middle])
            return binarySearch(item, middle+1, maxIndex);
        else
            return binarySearch(item,minIndex,middle-1);
    }


}
