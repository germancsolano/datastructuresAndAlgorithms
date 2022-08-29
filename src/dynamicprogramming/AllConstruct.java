package dynamicprogramming;

import java.util.*;

public class AllConstruct {
    public static void main(String[] args) {
        System.out.println(allConstuct("purple", new String[]{"purp", "p", "ur", "le", "purpl"}));
        System.out.println(allConstuct("abcdef", new String[]{"ab", "abc", "cd", "def", "abcd","ef","c"}));
        System.out.println(allConstuct("skateboard", new String[]{"bo", "rd", "ate", "t", "ska", "sk", "boar"}));
        System.out.println(allConstuct("enterapotentpot", new String[]{"a", "p", "ent", "enter", "ot", "o", "t"}));
        System.out.println(allConstuct("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef", new String[]{
                "e",
                "ee",
                "eee",
                "eeee",
                "eeeee",
                "eeeeee"
        }));
    }

    public static List<List<String>> allConstuct(String target, String[] wordBank){
        Map<String ,List<List<String>>> memo = new HashMap<>();
       return  allConstuct(target,wordBank,memo);
    }
    public static List<List<String>> allConstuct(String target, String[] wordBank,Map<String ,List<List<String>>> memo ){
        if(target.equalsIgnoreCase("")){
            return new ArrayList<>(Arrays.asList(new ArrayList<>()));
        }
        if(memo.containsKey(target)){
            return memo.get(target);
        }
        List< List<String>> result = new ArrayList<>();
        for(int i=0;i< wordBank.length; i++){
            String word=wordBank[i];
            if(target.startsWith(wordBank[i])){
                String suffix= target.substring(wordBank[i].length());
                List<List<String>> suffixWays = allConstuct(suffix, wordBank,memo);
                List<List<String>> targetWays = new ArrayList<>();
                suffixWays.stream().forEach(x->{
                    List<String> tmp = new ArrayList<>(x);
                    tmp.add(0,word);
                    targetWays.add(tmp);
                });
                memo.put(suffix,targetWays);
                for(int j=0; j<targetWays.size();j++){
                    result.add(new ArrayList<>(targetWays.get(j)));

                }
            }

        }
        memo.put(target,result);
        return result;
    }
}
