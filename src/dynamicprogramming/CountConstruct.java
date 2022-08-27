package dynamicprogramming;

import java.util.HashMap;
import java.util.Map;

public class CountConstruct {
    public static void main(String[] args) {
        System.out.println(countConstruct("purple", new String[]{"purp", "p", "ur", "le", "purpl"}));
        System.out.println(countConstruct("abcdef", new String[]{"ab", "abc", "cd", "def", "abcd"}));
        System.out.println(countConstruct("skateboard", new String[]{"bo", "rd", "ate", "t", "ska", "sk", "boar"}));
        System.out.println(countConstruct("enterapotentpot", new String[]{"a", "p", "ent", "enter", "ot", "o", "t"}));
        System.out.println(countConstruct("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef", new String[]{
                "e",
                "ee",
                "eee",
                "eeee",
                "eeeee",
                "eeeeee"
        }));

    }
    public static int countConstruct(String target, String[] wordBank){
        Map<String,Integer> memo = new HashMap<>();
        return countConstruct(target,wordBank,memo);
    }
    public static int countConstruct(String target, String[] wordBank,  Map<String,Integer> memo){
        // Base case

        if(target.equalsIgnoreCase("")){
            return 1;
        }
        if(memo.containsKey(target)){
            return memo.get(target);
        }
        int totalCount=0;
        for(int i=0; i< wordBank.length; i++){
            if(target.startsWith(wordBank[i])){
                String suffix = target.substring(wordBank[i].length());
                int numWays=countConstruct(suffix,wordBank,memo);
                totalCount += numWays;
                memo.put(suffix,numWays);
            }
        }
        memo.put(target,totalCount);
        return totalCount;
    }


}
