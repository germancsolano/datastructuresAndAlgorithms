package Queues;

public class QueueArray {
    static int MAX_ELEMENT=3;
   static  int arr[]= new int[MAX_ELEMENT];
    static int front=0;
    static int rear=0;

    public static void main(String[] args) {
        QueueArray.enqueue(10);
        QueueArray.enqueue(20);
        QueueArray.enqueue(30);
        QueueArray.enqueue(40);
        QueueArray.dequeue();
        QueueArray.dequeue();
        QueueArray.dequeue();
        QueueArray.dequeue();


    }

    public static void enqueue(int val ){
        if(rear == MAX_ELEMENT){
            System.out.println("Queue is full");
        }else{
            System.out.println("inserting value : " + val);
            arr[rear]=val;
            rear++;
        }
    }

    public static void dequeue(){
        if(rear == front){
            System.out.println("QUEUE is empty");
        }else{
            System.out.println("removing element: " + arr[front]);
            front++;
        }

    }
}
