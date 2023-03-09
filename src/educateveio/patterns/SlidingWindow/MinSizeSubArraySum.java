package educateveio.patterns.SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class MinSizeSubArraySum {
    public static void main(String[] args) {
        MinSizeSubArraySum obj = new MinSizeSubArraySum();
        int arr[]={3,4,1,1,6};
       // obj.findMinSubArray(8,arr);
        obj.longestSubstringWithoutDuplication("clementisacap");

    }
    public  int findMinSubArray(int S, int[] arr) {
        // TODO: Write your code here
String str="clementisacap";

        int subSum=0;
        int counter=Integer.MAX_VALUE;
        int startWin=0;
        for(int i=0;i<arr.length;i++){
            subSum+=arr[i];
           while (subSum>=S){
                if(i-startWin < counter) {
                    counter = i - startWin + 1;
                }
                subSum-=arr[startWin];
                startWin++;
            }
        }
        System.out.println(counter);
        return counter!=0 ? counter: -1;
    }
    public  String longestSubstringWithoutDuplication(String str) {
        // Write your code here
        int startw=0;
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0; i<str.length();i++){
            if(map.get(str.charAt(i))==null){
                map.put(str.charAt(i),1);
            }else{
                map.remove(str.charAt(startw));
                startw++;
            }
        }
        return "";
    }
}
