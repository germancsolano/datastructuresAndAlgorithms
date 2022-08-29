package dynamicprogramming;

import java.util.Arrays;

public class GridTravelerTab {
    public static void main(String[] args) {
        System.out.println("gridTraveler(1,1): " + gridTraveler(1,1));
        System.out.println("gridTraveler(2,3): " + gridTraveler(2,3));
        System.out.println("gridTraveler(3,2): " + gridTraveler(3,2));
        System.out.println("gridTraveler(3,3): " + gridTraveler(3,3));
        System.out.println("gridTraveler(18,18): " + gridTraveler(18,18));
    }

    public static int gridTraveler(int m , int n){

        int arr[][] = new int[m+1][n+1];
        Arrays.stream(arr).forEach(a-> Arrays.fill(a,0));
        arr[1][1]=1;
        for(int i=0; i<= m; i++){
            for(int j=0; j<=n; j++){
                // logig to fill the elements
                // since we can only move to right and down
                // first we need to het the current value
                int currentVal=arr[i][j];
                // Since we only can move right , we also must avoid index out of bounce to the right
                if(j + 1 <= n )arr[i][j+1]+=currentVal;
                // then we move down
                if(i + 1 <= m)arr[i+1][j]+=currentVal;
            }
        }

        return arr[m][n];
    }
}
