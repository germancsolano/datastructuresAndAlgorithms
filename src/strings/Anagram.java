package strings;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

    public static void main(String args[]){
        System.out.println("sorted string is: "+ sort("ieauo"));
        System.out.println("is anagram: " + anagram("ieauo","oiaus"));
        System.out.println("is anagram map: "+isAnagram("ieauo","oiaue"));

    }
    public static String sort(String input){
        // this function sorts a String char by char
        char[] chars = input.toLowerCase().toCharArray();
        int j=0;
        for(int i=0;i<chars.length;i++){
            char current=chars[i];
            j=i-1;
            while(j >= 0 && chars[j] > current){
                  chars[j+1]=chars[j];
                  j--;
            }
            chars[j+1]=current;
        }
        return String.valueOf(chars);
    }
    public static boolean anagram(String s1, String s2){
        String sorted1=sort(s1);
        String sorted2=sort(s2);
        char [] chars1= sorted1.toLowerCase().toCharArray();
        char [] chars2= sorted2.toLowerCase().toCharArray();
        for(int i=0;i<chars1.length;i++){
            if(chars1[i]!=chars2[i])
                return false;
        }
        return true;
    }

    public static boolean isAnagram(String s1,String s2){
        char [] chars1= s1.toLowerCase().toCharArray();
        char [] chars2= s2.toLowerCase().toCharArray();
        Map<String,Integer> element= new HashMap<>();

        for(int i=0;i<chars1.length;i++){
            if(!element.containsKey(String.valueOf(chars1[i]))) {
                element.put(String.valueOf(chars1[i]), 1);
            }else{
                element.put(String.valueOf(chars1[i]),element.get(String.valueOf(chars1[i]))+1);
            }
        }
        for(int i=0;i<chars2.length;i++){
            if (element.containsKey(String.valueOf(chars2[i]))){
                element.put(String.valueOf(chars2[i]),element.get(String.valueOf(chars2[i]))-1);
            }
        }
        if(element.containsValue(1))
            return false;
        return true;
    }
}
