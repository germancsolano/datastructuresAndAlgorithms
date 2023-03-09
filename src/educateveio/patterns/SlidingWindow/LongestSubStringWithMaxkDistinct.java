package educateveio.patterns.SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithMaxkDistinct {
    public static void main(String[] args) {
        String str="cbbebi";
        int k=2;
        System.out.println(findLength(str,k));
    }
    public static int findLength(String str, int k) {
        // TODO: Write your code here
        int maxLength=0;

        int startW=0;
        Map<Character,Integer> mapFrequencies= new HashMap<>();
        String aux= "";
        for(int windowEnd=0;windowEnd < str.length(); windowEnd++){
            char rightChar= str.charAt(windowEnd);
            mapFrequencies.put(rightChar,mapFrequencies.getOrDefault(rightChar,0)+1);
            while(mapFrequencies.size() > k){
                char leftChar = str.charAt(startW);
                mapFrequencies.put(leftChar,mapFrequencies.get(leftChar)-1);
                if(mapFrequencies.get(leftChar)==0){
                    mapFrequencies.remove(leftChar);
                }
                startW++;
            }

            if(str.substring(startW,windowEnd+1).length() > aux.length()) {
                aux=str.substring(startW, windowEnd + 1);
            }
            System.out.println("cadena: "+ aux);
            maxLength= Math.max(maxLength,windowEnd-startW +1);
        }
        return maxLength == 0 ? -1: maxLength ;
    }


}
