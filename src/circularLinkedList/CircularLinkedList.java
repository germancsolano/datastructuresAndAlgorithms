package circularLinkedList;

public class CircularLinkedList<T> {
    Node head;

    public void addFirst(T value){
            Node temp = new Node(value);
        if(head == null){
            head=temp;
            temp.setNext(head);

        }else{
            Node last =head;
            while(last.next != head){
                last= last.getNext();
            }
            last.next=temp;
            temp.setNext(head);
            head=temp;
        }
    }
    public void InsertAtEnd(T value){
        Node newNode = new Node(value);
        if(head == null){
           newNode.setNext(newNode);
           head= newNode;
        }else{
            Node last = head;
            while(last.getNext()!= head){
                last = last.getNext();
            }
            last.setNext(newNode);
            newNode.setNext(head);
        }

    }
    public Node<T> findElement(T value){
        if(head == null)
            return null;
        Node temp = head;
        do{
            if(temp.getData().equals(value)){
                return temp;
            }else{
                temp= temp.getNext();
            }
        }while(temp!= head);
       return null;

    }

    public void delete(T val){
        if(head == null)
            return;
        if(head.getData().equals(val) && head.getNext().equals(head)){
            head=null;
        }else if(head.getData().equals(val)){
            Node last = head;
            while(last.getNext() != head){
                last = last.getNext();
            }
            last.setNext(head.getNext());
            head= head.getNext();
        }else{
            Node current = head;
            while(!current.getNext().equals(head)){
                if(current.getNext().getData().equals(val)){
                    current.setNext(current.getNext().getNext());
                    break;
                }
                current= current.getNext();
            }

        }

    }
    public void print(){
        if (head==null){
            System.out.println("empty list ");
            return;
        }
        Node temp = head;
        do {
            System.out.println("element: "+temp.getData());
            temp = temp.getNext();
        }while(temp != head);

    }
}
