package dynamicprogramming;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CanConstruct {
    public static void main(String[] args) {


        System.out.println(canConstruct("abcdef", new String[]{"ab", "abc", "cd", "def", "abcd"}));
        System.out.println(canConstruct("skateboard", new String[]{"bo", "rd", "ate", "t", "ska", "sk", "boar"}));
        System.out.println(canConstruct("enterapotentpot", new String[]{"a", "p", "ent", "enter", "ot", "o", "t"}));
       System.out.println(canConstruct("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef", new String[]{
                "e",
                "ee",
                "eee",
                "eeee",
                "eeeee",
                "eeeeee"
        }));

    }
    public static boolean canConstruct(String target, String wordBank[]) {
        Map<String, Boolean> memo = new HashMap<>();
       return  canConstruct(target,wordBank,memo);
    }
    public static boolean canConstruct(String target, String wordBank[],Map<String, Boolean> memo) {
        if (target.equals("")) {
            return true;
        }
       if(memo.containsKey(target)){
           return memo.get(target);
       }

        for (int i = 0; i < wordBank.length; i++) {
            if (target.startsWith(wordBank[i])) {
                String suffix = target.substring(wordBank[i].length());
                if (canConstruct(suffix, wordBank,memo)) {
                   memo.put(suffix,true);
                    return true;
                }
            }

        }
        memo.put(target,false);
        return false;
    }
}
