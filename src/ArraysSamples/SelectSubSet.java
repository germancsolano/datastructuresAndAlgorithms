//package ArraysSamples;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Scanner;
//
///**
// * You are given an array A and B of size N .
// *
// * You must select a subset of indices from 1 to N such that for any pair of indices (x,y) , x!=y in the subset one of the following conditions holds true:
// *
// * A[x] < A[y] and B[x] < B[y]
// * A[x] > A[y] and B[x] > B[y]
// * A[x] = A[y] and B[x] = B[y]
// * Your task is to determine the largest possible size of a subset that satisfies the provided conditions.
// *
// * Note: Assume  based indexing.
// *
// * Input format
// *
// * The first line contains an integer  that denotes the number of test cases.
// * For each test case:
// * The first line contains an integer .
// * The second line contains  space-separated integers that denotes the array .
// * The third line contains  space-separated integers that denotes the array .
// * Output format
// *
// * For each test case, print the largest possible size of a subset that satisfies the provided conditions in a new line.
// */
//public class SelectSubSet {
//    public static void main(String[] args) throws IOException {
//
//        //Scanner
////        Scanner s = new Scanner(System.in);
////        String name = s.nextLine();                 // Reading input from STDIN
////        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
//
//    }
//
//    public static int[] subsetCount(int a[], int b[]){
//        int lenA=a.length;
//        int lenB= b.length;
//        int i=0,j=0;
//int result [] = new int[2];
//        while(i<lenA && j < lenB){
//            if(a[i] < a[i+1] && b[j] < b[j+1]){
//                result[0]=i;
//                return result;
//            }
//        }
//
//    }
//}
