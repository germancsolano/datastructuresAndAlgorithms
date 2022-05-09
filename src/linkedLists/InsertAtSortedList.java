package linkedLists;

public class InsertAtSortedList {
    private Node head;

    public void insertElement(int data){

        Node newElement = new Node(data);
        if(this.head == null){
            this.head=newElement;
        }else if(this.head != null){
            int dataHead = (Integer)this.head.getData();
            int dataCurrent=(Integer)newElement.getData();
            if(dataHead > dataCurrent){
                newElement.setNextNode(this.head);
                this.head=newElement;
            }else{
                Node current = this.head;
                while(current.getNextNode() != null ){
                    int currentData =(Integer)current.getNextNode().getData();
                    int newElementData=(Integer) newElement.getData();
                    if(currentData < newElementData) {
                        current = current.getNextNode();
                    }else{
                        break;
                    }
                }
                newElement.setNextNode(current.getNextNode());
                current.setNextNode(newElement);
            }
        }

    }

    @Override public String toString(){
        String result="{";
        Node aux= this.head;
        while(aux != null ){
            result += aux.getData().toString() + ", ";
            aux= aux.getNextNode();
        }
        result +="}";
        return result;
    }
}
