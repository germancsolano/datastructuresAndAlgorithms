package linkedLists;

public class DoublyEndedList <T>{
    private Node head;
    private Node tail;

    public void insertAtTail(T data){
        Node newNode = new Node(data);
        if(this.head==null) {
            newNode.setNextNode(head);
            newNode.setPrevNode(null);
            this.head = newNode;
        }else{
            Node temp = head;
            while(temp.getNextNode()!= null){
                temp= temp.getNextNode();
            }
            temp.setNextNode(newNode);
            newNode.setPrevNode(temp);
            newNode.setNextNode(null);
        }
    }
    public void insertAtBegin(T data ){
        Node newNode = new Node<>(data);
        if(head==null){
            newNode.setNextNode(null);
            newNode.setNextNode(null);
            head= newNode;
        }else{
            head.setPrevNode(newNode);
            newNode.setNextNode(head);
            newNode.setPrevNode(null);
            head= newNode;
        }
    }
    public  void delete(T key){
        if(head == null)
            return;
        Node temp = head;
        while(temp!= null && !temp.getData().equals(key)){
            temp = temp.getNextNode();
        }
        if(temp == null){
            System.out.println("record not found");
        }else if(temp== head){
            head= head.getNextNode();
            head.setPrevNode(null);
        }else if(temp.getNextNode() == null){
            temp.getPrevNode().setNextNode(null);
        } else{
            temp.getPrevNode().setNextNode(temp.getNextNode());
            temp.getNextNode().setPrevNode(temp.getPrevNode());
        }
    }

    @Override public String toString(){
     String result="{";
     Node current=this.head;
     while(current != null ){
         result+= current.toString() + ", ";
         current=current.getNextNode();
     }
     return result;
    }
}
