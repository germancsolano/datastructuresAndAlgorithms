package Graphs;

public class AdjacencyMatrixDirected {

    static final int V = 5;
    public static void main(String[] args) {

        int adjMatrix[][] = new int [V][V];
        AdjacencyMatrixDirected obj = new AdjacencyMatrixDirected();
        obj.addEdge(adjMatrix,0,1);
        obj.addEdge(adjMatrix,0,2);
        obj.addEdge(adjMatrix,0,3);
        obj.addEdge(adjMatrix,1,3);
        obj.addEdge(adjMatrix,1,4);
        obj.addEdge(adjMatrix,2,3);
        obj.addEdge(adjMatrix,3,4);
        obj.print(adjMatrix);
        System.out.println(obj.hasEdge(adjMatrix,1,3));

    }

    public void addEdge(int adjMatrix[][],int src, int dest){
        adjMatrix[src][dest]=1;
    }

    public void removeEdge(int adjMatrix[][],int src, int dest){
        adjMatrix[src][dest]=0;
    }

    public int hasEdge(int adjMatrix[][],int src, int dest){
        if(adjMatrix[src][dest]==1)
            return 1;
        return 0;
    }

    public void print(int adjMatrix[][]){

        for(int i=0;i<V;i++){
            for(int j=0;j<V;j++){
                System.out.print(adjMatrix[i][j]+ " ");
            }
            System.out.println();
        }

    }
}
