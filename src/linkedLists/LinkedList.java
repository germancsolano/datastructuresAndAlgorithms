package linkedLists;

public class LinkedList<T> {

    private Node head;

    public void insertAtHead(T data){
        Node newNode = new Node(data);
        newNode.setNextNode(this.head);
        this.head=newNode;
    }

    public int getLenght(){
        Node current = this.head;
        int lenght =0;
        while(current != null){
            lenght++;
            current= current.getNextNode();
        }
        return lenght;
    }
    public void deleteAtHead(){
        this.head=this.head.getNextNode();
    }

    public Node<T> findElement(T value){
        Node<T> current = this.head;
        while (current != null){
            if(current.getData().equals( value)) {
                return current;
            }
            current=current.getNextNode();
        }
        return null;
    }

    @Override
    public String toString(){
        String result = "{";
        Node current = this.head;

        while(current != null){
            result += current.toString() + ",";
            current = current.getNextNode();
        }
 return result;
    }

}
