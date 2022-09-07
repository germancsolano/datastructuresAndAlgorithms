package Stacks;


public class StackList {
    static Node head = null;

    public static void main(String[] args) {
        StackList.push(2);
        StackList.push(4);
        StackList.pop();
        StackList.pop();
        StackList.pop();
    }

    public static void push(int data) {

        Node newNode = new Node();
        newNode.data=data;
        newNode.next=head;
        head=newNode;

    }

    public static void pop(){
        if(head==null){
            System.out.println("Stack is empty");
        }else{
                System.out.println("removing: " + head.data);
                head = head.next;
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

