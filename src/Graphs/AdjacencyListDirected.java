package Graphs;

public class AdjacencyListDirected {

    static final int V=5;
    Node adjList [] = new Node[V];
    public static void main(String[] args) {
        AdjacencyListDirected obj = new AdjacencyListDirected();
        obj.addEdge(obj.adjList, 0,1);
        obj.addEdge(obj.adjList, 0,2);
        obj.addEdge(obj.adjList, 0,3);
        obj.printGraph(obj.adjList);
        System.out.println(obj.hasEdge(obj.adjList,0,5));
        obj.removeEdge(0,2);
        obj.printGraph(obj.adjList);

    }
    public void addEdge( Node adjList [], int src, int dest){
        Node newNode = new Node();
        newNode.setData(dest);
        newNode.setNext( adjList [src]);
        adjList[src]= newNode;

    }

    public int hasEdge(Node adjList[], int src, int dest){
        Node temp = adjList[src];
        while (temp != null){
            if (temp.data== dest)
                return 1;
            temp= temp.next;
        }

        return 0;
    }

    public void removeEdge(int src, int dest){
        if(adjList[src] == null)
            return;
        // if node to remove is the head
        if(adjList[src].data==dest){
            adjList[src]= adjList[src].next;
        }else{
            Node current = adjList[src], temp;
            while (current.next != null){
                if(current.next.data == dest){
                    temp= current.next;
                    current.next = temp.next;
                    break;
                }else{
                    current= current.next;
                }
            }
        }

    }
    public void printGraph(Node adjList[]){

        for (int i=0; i<V; i++){
            Node temp = adjList[i];
            System.out.print("adjList["+i+"]--->");
            while(temp != null){
                System.out.print(temp.getData()+"--->");
                temp= temp.getNext();
            }
            System.out.println("null");
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
