package Queues;

public class QueueLinkeList {

    static Node rear;
    static Node front;

    public static void main(String[] args) {
        QueueLinkeList.enqueue(2);
        QueueLinkeList.enqueue(4);
        QueueLinkeList.enqueue(6);
        QueueLinkeList.enqueue(8);
        QueueLinkeList.enqueue(10);

        QueueLinkeList.dequeue();
        QueueLinkeList.dequeue();
        QueueLinkeList.dequeue();
        QueueLinkeList.dequeue();
        QueueLinkeList.dequeue();
        QueueLinkeList.dequeue();
        QueueLinkeList.dequeue();

    }
    public static void enqueue(int val){
           Node newNode = new Node();
           newNode.setData(val);
           newNode.setNext(null);

           if(front == null && rear == null){
               rear=front=newNode;
           }else{
               rear.setNext(newNode);
               rear=newNode;
           }
    }

    public static void dequeue(){
        if(front == null){
            System.out.println("QUEU is empty");
        }else{
            System.out.println("removing element: " +front.data);
            front=front.next;
            if(front==null)
                rear=null;
        }
    }


}
class Node {
    int data;
    Node next;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}


