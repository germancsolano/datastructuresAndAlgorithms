package searchAlgorithms;

public class BinarySearchIterative {
    // Fist we have to define an array for which we want to do the search
    static int arr[]={2,4,6,8,10,12,14,16,18,20};
    public static void main(String args[]){
        int toSearch=6;
        System.out.println("Starting search of number: "+toSearch);
        int element = findElement(arr, toSearch);
        if(element ==-1)
            System.out.println("Element : "+ toSearch + " does not exist");
    }

    // We have to define a method that will receive an array and the element to be searched.
    //We must define a minIndex, maxIndex and middleIndex(the Index of the element to search)
    public static int findElement(int arr[], int elementToFind) {
        int minIndex = 0;
        int maxIndex = arr.length - 1;
        int middleIndex=(int)Math.floor(minIndex+maxIndex)/2;
        while(arr[middleIndex]!=elementToFind && maxIndex > minIndex){
            if(elementToFind > arr[middleIndex]){
                minIndex=middleIndex+1;
            }else{
                maxIndex=middleIndex-1;
            }
            middleIndex=(int)Math.floor(minIndex+maxIndex)/2;
        }
        if(elementToFind== arr[middleIndex]) {
            System.out.println("element : "+elementToFind +" was found");
            return middleIndex;
        }
        return -1;
    }

}
