package dynamicprogramming;

import java.util.Arrays;

public class MinCoinChange {
    public static void main(String[] args) {
        int arr[] = {1, 2, 4};
        int change = 120;
        System.out.println("min coins " + minCoins(change, arr));

    }

    public static int minCoins(int change, int denoms[]) {
        int numOfCoins[] = new int[change + 1];

        // fill to bigest integer to all elements
        Arrays.fill(numOfCoins, Integer.MAX_VALUE);
        // Initialize base case
        numOfCoins[0] = 0;
        int toCompare = 0;
        // we have to use all coins available
        for (int denom : denoms) {
            for (int amount = 0; amount < numOfCoins.length; amount++) {
                if (denom <= amount) {
                    if (numOfCoins[amount - denom] == Integer.MAX_VALUE) {
                        toCompare = numOfCoins[amount - denom];
                    } else {
                        toCompare = numOfCoins[amount - denom] + 1;
                    }
                    numOfCoins[amount] = Math.min(numOfCoins[amount], toCompare);
                }

            }
        }

        return numOfCoins[change] == Integer.MAX_VALUE ? -1 : numOfCoins[change];

    }
}
