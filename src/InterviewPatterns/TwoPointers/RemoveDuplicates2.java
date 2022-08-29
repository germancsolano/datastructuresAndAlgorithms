package InterviewPatterns.TwoPointers;

public class RemoveDuplicates2 {
    public static void main(String[] args) {
        int arr[] = {5, 5, 5, 6, 6, 6, 8};
        System.out.println(removeDuplicates(arr, arr.length));

    }

    static int removeDuplicates(int arr[], int n) {

        if (n < 2)
            return n;


        int newLen = 0;
        arr[newLen++] = arr[0];
        int pos = 1;
        for (int i = 1; i < n; i++) {
            pos = i;
            if (i + 1 >= n)
                continue;

            if (arr[i - 1] != arr[i + 1]) {
                arr[newLen++] = arr[i];
            }
        }
        arr[newLen++] = arr[pos];
        return newLen;
    }

}
