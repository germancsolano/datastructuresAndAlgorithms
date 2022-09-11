package BinaryHeap;
/**
 * MaxHeap
 * By definition the MxHeap should have all parent nodes bigger than its children.
 * for example        4
 *                  /  \
 *                 2    3
 *
 * Now in order to construct the Heap from the array we must follow the following rule
 * left child = 2*i + 1
 * rightchild = 2*i + 2
 *  where i is the index on the array
 *  Suppose that we have the following array [10,20,40,30,80,60,50]
 *  to start building the heap we follow the next step
 *  for index i starting on 0
 *  root = 10
 *  left  = 2 * i + 1 = 2(0) + 1 = 1
 *  right = 2 * i + 2 = 2(0) +2  = 2
 *        10
 *       /  \
 *     20   40
 * Then i = 1
 * root = 20
 * left = 2(1) + 1 = 3
 * right= 2(1) + 2 = 4
 *
 *          10
 *         /  \
 *       20   40
 *     /  \
 *   30   80
 *
 * Then i =2
 * root 40
 * left = 2(2) + 1 = 5
 * right= 2(2) + 2 = 6
 *
 *           10
 *         /    \
 *      20      40
 *    /  \     /  \
 *  30   80  50   60
 *
 *  for i>= 3
 *  there are no more elements in the array
 *
 * In this case our bottom first sub tree is :
 *
 *      40
 *     /  \
 *   50   60
 *
 *   Our second bottom sub tree is
 *      20
 *     /  \
 *   30   80
 *
 *
 * And the top most sub tree is
 *      10
 *     /  \
 *   20   40
 *
 *   In order to build the Max Head we must follow the following steps:
 *
 *   1.- Traverse the array from index i = size / 2 until i is equal or greather than 0 and decrement the index i ( find the bottom most sub tree )
 *   2.- Call a Heapify function with the following parameters: array, index , size
 *   3.- For the Heapify function we must consider the following steps:
 *     1.- For each subtree the must validate the MaxHeap property: The maximum element mut be always at the root node.
 *     2.- Find the left and right node based on the index passed at Heapify function
 *     2.1- left = 2 * index +1
 *     2.2- right = left + 1
 *     2.3 - assign index to a max variable
 *     3.- Once in the most sub tree index check wheather node is greated than both of children
 *     3.1- if left is smaller or equal  than size of the array and element in array of index left  is greather than element in array of max
 *     3.1.1- assign left to max
 *     3.2- if right is smaller or equal  than array size and array in index right is greather than array of index max
 *     3.2.1- assign right to max
 *     4.- Check if max value is different from index which mean there was an element bigger found at children nodes
 *     4.1.- Swap node at index with the node with max node
 *     5.- Call the Heapify function for the swapped node like Heapify(array, max,size)
 *
 *    Delete the max element from maxheap
 *    1.- Build the max heap
 *    2.- swap elements at index 0 and array size
 *    3.- reduce the size of the array by 1.
 *    4.- call heapify at index 0
 *
 */
public class MaxHeap {
    int arr[] = {10, 20, 40, 30, 80, 60, 50};
    public static void main(String[] args) {
        MaxHeap obj = new MaxHeap();

        System.out.println("The Array Elements Are:");
        obj.print(obj.arr,obj.arr.length);
        System.out.println("Constructing Heap...");
        obj.buildHeap(obj.arr, obj.arr.length - 1);
        System.out.println("The Array Elements Are:");
        obj.print(obj.arr,obj.arr.length);
        obj.deleteMax(obj.arr.length - 1);
        obj.print(obj.arr,obj.arr.length - 1);
        obj.deleteMax(obj.arr.length - 2);
        obj.print(obj.arr,obj.arr.length - 2);

    }
    public void buildHeap(int arr[], int size){
        int i;
        for(i=size/2; i>= 0 ;i--){
            heapify(arr,i,size);
        }

    }

    public void heapify(int arr[], int index, int size){
        int left = 2 * index + 1;
        int right = left + 1;
        int max = index;
        // checking HeapMax property
        if(left < size && arr[left] > arr[max])
            max=left;
        if(right < size && arr[right] > arr[max])
            max= right;
        if(max != index){
          swap(arr,max,index);
            heapify(arr,max,size);
        }
    }
    public void deleteMax(int size){
        // swap first and last elements
         size = size;
        swap(arr,0,size );
        System.out.println("max element is " + arr[size]);
        size= size-1;
        heapify(arr,0,size);


    }
    public void print(int arr[], int size)
    {
        for(int i = 0; i < size; i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    public void swap(int arr[], int a, int b){
        int temp = arr[a];
        arr[a]= arr[b];
        arr[b] = temp;
    }

}
